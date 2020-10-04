package ar.com.deviget.minesweeperapiclient.model;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import ar.com.deviget.minesweeperapiclient.dto.GameResponseDto;

public class Game {

	private int id;

	private int columns;

	private int rows;

	private int mines;

	private List<Cell> cells = new ArrayList<Cell>();

	private GameState state;

	private Date startingTime;

	private Date updateTime;

	private int playerId;

	public Game(GameResponseDto gameResponseDto) {

		id = Integer.parseInt(gameResponseDto.getId());
		columns = Integer.parseInt(gameResponseDto.getColumns());
		rows = Integer.parseInt(gameResponseDto.getRows());
		mines = Integer.parseInt(gameResponseDto.getMines());
		playerId = Integer.parseInt(gameResponseDto.getPlayerId());

		DateFormat format = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		try {
			startingTime = format.parse(gameResponseDto.getStartingTime());
		} catch (ParseException e) {
			startingTime = null;
		}
		try {
			updateTime = format.parse(gameResponseDto.getUpdateTime());
		} catch (ParseException e) {
			updateTime = null;
		}

		state = GameState.state(gameResponseDto.getState());

		gameResponseDto.getCells().stream().forEach(x -> {
			cells.add(new Cell(x));
		});

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getColumns() {
		return columns;
	}

	public void setColumns(int columns) {
		this.columns = columns;
	}

	public int getRows() {
		return rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getMines() {
		return mines;
	}

	public void setMines(int mines) {
		this.mines = mines;
	}

	public List<Cell> getCells() {
		return cells;
	}

	public void setCells(List<Cell> cells) {
		this.cells = cells;
	}

	public GameState getState() {
		return state;
	}

	public void setState(GameState state) {
		this.state = state;
	}

	public Date getStartingTime() {
		return startingTime;
	}

	public void setStartingTime(Date startingTime) {
		this.startingTime = startingTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

}
