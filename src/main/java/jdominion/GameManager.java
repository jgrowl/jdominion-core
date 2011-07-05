package jdominion;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class GameManager {

	private GameMachine gameMachine;

	private long roundLimit;

	private ScheduledExecutorService executor = Executors
			.newSingleThreadScheduledExecutor();

	private Runnable changePlayerTask = new Runnable() {
		public void run() {
			gameMachine.changePlayer();
		}
	};

	public GameManager(GameMachine gameMachine, long roundLimit) {
		this.gameMachine = gameMachine;
		this.roundLimit = roundLimit;
	}

	public void playGame() {
		executor.schedule(changePlayerTask, roundLimit, TimeUnit.SECONDS);
	}

}
