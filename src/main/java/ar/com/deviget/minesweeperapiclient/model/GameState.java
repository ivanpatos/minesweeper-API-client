package ar.com.deviget.minesweeperapiclient.model;

public enum GameState {

	WIN("You win :)"), LOSE("Game over :("), PAUSED("Game paused Zzz"), RUNNING("Game running...");

	private final String description;

	private GameState(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public static GameState state(String description) {
		for (GameState c : values()) {
			if (c.description.equals(description)) {
				return c;
			}
		}
		return null;
	}

}
