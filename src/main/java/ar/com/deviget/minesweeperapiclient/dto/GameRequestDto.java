package ar.com.deviget.minesweeperapiclient.dto;

public class GameRequestDto {
	
	private String playerId;
	
	private String columns;

	private String rows;

	private String mines;

	public GameRequestDto(int columns, int rows, int mines, int playerId) {
		this.columns = String.valueOf(columns);
		this.rows = String.valueOf(rows);
		this.mines = String.valueOf(mines);
		this.playerId = String.valueOf(playerId);
	}

	public String getPlayerId() {
		return playerId;
	}

	public void setPlayerId(String playerId) {
		this.playerId = playerId;
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
	
	public boolean isValid() {
		return !(playerId == null || columns == null || rows == null || mines == null);
	}

}
