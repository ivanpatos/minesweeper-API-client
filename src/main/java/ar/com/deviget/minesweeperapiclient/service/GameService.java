package ar.com.deviget.minesweeperapiclient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.deviget.minesweeperapiclient.client.GameClient;
import ar.com.deviget.minesweeperapiclient.dto.GameRequestDto;
import ar.com.deviget.minesweeperapiclient.dto.GameResponseDto;
import ar.com.deviget.minesweeperapiclient.model.Game;

@Service
public class GameService {

	@Autowired
	private GameClient gameClient;

	public Game createGame(int columns, int rows, int mines, int idPlayer) {
		GameResponseDto gameResponseDto = gameClient.createGame(new GameRequestDto(columns, rows, mines, idPlayer));
		return new Game(gameResponseDto);
	}

	public Game getGame(int idGame) {
		GameResponseDto gameResponseDto = gameClient.getGame(idGame);
		return new Game(gameResponseDto);
	}

	public Game revealCell(int idGame, int idCell) {
		GameResponseDto gameResponseDto = gameClient.revealCell(idGame, idCell);
		return new Game(gameResponseDto);
	}

	public Game flagCell(int idGame, int idCell) {
		GameResponseDto gameResponseDto = gameClient.flagCell(idGame, idCell);
		return new Game(gameResponseDto);
	}

	public Game pauseGame(int idGame) {
		GameResponseDto gameResponseDto = gameClient.pauseGame(idGame);
		return new Game(gameResponseDto);
	}

}
