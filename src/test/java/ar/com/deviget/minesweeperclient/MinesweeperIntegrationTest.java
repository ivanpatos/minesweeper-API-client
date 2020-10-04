package ar.com.deviget.minesweeperclient;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import ar.com.deviget.minesweeperapiclient.ClientApplication;
import ar.com.deviget.minesweeperapiclient.model.Player;
import ar.com.deviget.minesweeperapiclient.service.PlayerService;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ClientApplication.class)
class MinesweeperIntegrationTest {

	@Autowired
	private PlayerService playerService;

	@Test
	void testGame() {

		// create a player
		Player player = playerService.createPlayer("johnDoe", "qwerty123", "john.doe@gmail.com");
		assertNotNull(player);

		// get player
		final int idPlayer = player.getId();
		player = playerService.getPlayer(idPlayer);
		assertNotNull(player);

	}

}
