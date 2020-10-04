package ar.com.deviget.minesweeperapiclient.model;

import java.util.ArrayList;
import java.util.List;

import ar.com.deviget.minesweeperapiclient.dto.PlayerResponseDto;

public class Player {
	
	private int id;
	
	private String username;
	
	private String email;
	
	private List<Integer> idGames = new ArrayList<Integer>();

	public Player(PlayerResponseDto playerResponseDto) {
		id = Integer.parseInt(playerResponseDto.getId());
		username = playerResponseDto.getUsername();
		email = playerResponseDto.getEmail();
		playerResponseDto.getGameIds().stream().forEach(x -> idGames.add(x));
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Integer> getIdGames() {
		return idGames;
	}

	public void setIdGames(List<Integer> idGames) {
		this.idGames = idGames;
	}

}
