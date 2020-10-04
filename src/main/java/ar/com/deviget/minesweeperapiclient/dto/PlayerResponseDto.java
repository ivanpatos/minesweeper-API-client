package ar.com.deviget.minesweeperapiclient.dto;

import java.util.ArrayList;
import java.util.List;

public class PlayerResponseDto {
	
	private String id;
	
	private String username;
	
	private String email;
	
	private List<Integer> gameIds = new ArrayList<Integer>();

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public List<Integer> getGameIds() {
		return gameIds;
	}

	public void setGameIds(List<Integer> gameIds) {
		this.gameIds = gameIds;
	}

}
