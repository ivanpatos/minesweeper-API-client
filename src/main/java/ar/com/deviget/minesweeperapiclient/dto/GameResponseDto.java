package ar.com.deviget.minesweeperapiclient.dto;

import java.util.ArrayList;
import java.util.List;

public class GameResponseDto {

private String id;
	
	private String columns;
	
	private String rows;
	
	private String mines;
	
	private List<CellResponseDto> cells = new ArrayList<CellResponseDto>();
	
	private String state;
	
	private String startingTime;
	
	private String updateTime;
	
	private String playerId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getColumns() {
		return columns;
	}

	public void setColumns(String columns) {
		this.columns = columns;
	}

	public String getRows() {
		return rows;
	}

	public void setRows(String rows) {
		this.rows = rows;
	}

	public String getMines() {
		return mines;
	}

	public void setMines(String mines) {
		this.mines = mines;
	}

	public List<CellResponseDto> getCells() {
		return cells;
	}

	public void setCells(List<CellResponseDto> cells) {
		this.cells = cells;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStartingTime() {
		return startingTime;
	}

	public void setStartingTime(String startingTime) {
		this.startingTime = startingTime;
	}

	public String getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}

	public String getPlayerId() {
		return playerId;
	}

	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}

}
