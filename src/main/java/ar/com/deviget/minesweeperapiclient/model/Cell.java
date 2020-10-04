package ar.com.deviget.minesweeperapiclient.model;

import ar.com.deviget.minesweeperapiclient.dto.CellResponseDto;

public class Cell {

	private int id;

	private int x;

	private int y;

	private boolean mine;

	private boolean revealed;

	private FlagState flagState;

	private int adjacentMinesCount;

	public Cell(CellResponseDto cellResponseDto) {
		id = Integer.parseInt(cellResponseDto.getId());
		x = Integer.parseInt(cellResponseDto.getX());
		y = Integer.parseInt(cellResponseDto.getY());
		adjacentMinesCount = Integer.parseInt(cellResponseDto.getAdjacentMinesCount());

		mine = Boolean.valueOf(cellResponseDto.getMine());
		revealed = Boolean.valueOf(cellResponseDto.getRevealed());

		flagState = FlagState.valueOf(cellResponseDto.getFlagState());
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public boolean isMine() {
		return mine;
	}

	public void setMine(boolean mine) {
		this.mine = mine;
	}

	public boolean isRevealed() {
		return revealed;
	}

	public void setRevealed(boolean revealed) {
		this.revealed = revealed;
	}

	public FlagState getFlagState() {
		return flagState;
	}

	public void setFlagState(FlagState flagState) {
		this.flagState = flagState;
	}

	public int getAdjacentMinesCount() {
		return adjacentMinesCount;
	}

	public void setAdjacentMinesCount(int adjacentMinesCount) {
		this.adjacentMinesCount = adjacentMinesCount;
	}

}
