package ar.com.deviget.minesweeperapiclient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.deviget.minesweeperapiclient.client.PlayerClient;
import ar.com.deviget.minesweeperapiclient.dto.PlayerRequestDto;
import ar.com.deviget.minesweeperapiclient.dto.PlayerResponseDto;
import ar.com.deviget.minesweeperapiclient.model.Player;

@Service
public class PlayerService {
	
	@Autowired
	private PlayerClient playerClient;
	
	public Player createPlayer(String username, String password, String email) {
		PlayerResponseDto playerResponseDto = playerClient.createPlayer(new PlayerRequestDto(username, password, email));
		return new Player(playerResponseDto);
	}
	
	public Player getPlayer(int idPlayer) {
		PlayerResponseDto playerResponseDto = playerClient.getPlayer(idPlayer);
		return new Player(playerResponseDto);
	}

}
