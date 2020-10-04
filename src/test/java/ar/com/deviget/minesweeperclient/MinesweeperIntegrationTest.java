package ar.com.deviget.minesweeperclient;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import ar.com.deviget.minesweeperapiclient.ClientApplication;
import ar.com.deviget.minesweeperapiclient.model.Cell;
import ar.com.deviget.minesweeperapiclient.model.FlagState;
import ar.com.deviget.minesweeperapiclient.model.Game;
import ar.com.deviget.minesweeperapiclient.model.GameState;
import ar.com.deviget.minesweeperapiclient.model.Player;
import ar.com.deviget.minesweeperapiclient.service.GameService;
import ar.com.deviget.minesweeperapiclient.service.PlayerService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ClientApplication.class)
class MinesweeperIntegrationTest {

	@Autowired
	private PlayerService playerService;
	
	@Autowired
	private GameService gameService;

	@Test
	void testGame() {

		// create a player
		Player player = playerService.createPlayer("johnDoe", "qwerty123", "john.doe@gmail.com");
		assertNotNull(player);

		// get player
		final int idPlayer = player.getId();
		player = playerService.getPlayer(idPlayer);
		assertNotNull(player);

		// create game with no mines
		Game game = gameService.createGame(3, 3, 0, idPlayer);
		assertNotNull(game);

		// get game
		final int idGame = game.getId();
		game = gameService.getGame(idGame);
		assertNotNull(game);

		// red flag any cell, then question mark
		final int idCell = game.getCells().stream().findAny().get().getId();
		game = gameService.flagCell(idGame, idCell);
		Cell cell = game.getCells().stream().filter(c -> c.getId() == idCell).findAny().get();
		assertTrue(cell.getFlagState().equals(FlagState.RED_FLAG));
		game = gameService.flagCell(idGame, idCell);
		cell = game.getCells().stream().filter(c -> c.getId() == idCell).findAny().get();
		assertTrue(cell.getFlagState().equals(FlagState.QUESTION_MARK));

		// pause and unpause the game
		game = gameService.pauseGame(idGame);
		assertTrue(game.getState().equals(GameState.PAUSED));
		game = gameService.pauseGame(idGame);
		assertTrue(game.getState().equals(GameState.RUNNING));

		// reveal cell and win game
		final int idCell2 = game.getCells().stream().filter(c -> c.getId() != idCell).findAny().get().getId();
		game = gameService.revealCell(idGame, idCell2);
		cell = game.getCells().stream().filter(c -> c.getId() == idCell2).findAny().get();
		assertTrue(cell.isRevealed());
		assertTrue(game.getState().equals(GameState.WIN));

	}

}
