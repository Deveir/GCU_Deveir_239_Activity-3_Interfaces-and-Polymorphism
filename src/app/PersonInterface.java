package app;

/**
 * The PersonInterFace defines basic movement behaviors
 * that any Person object must implement
 * @ Deveir Cockett
 */
public interface PersonInterface {
	
	/**
	 * Cause the person to start walking.
	 * This should update the walking state and print a message.
	 */
	public void walk();
	
	/**
	 * cause the person to start running.
	 * This should update the running state and print a message.
	 */
	public void run();
	
	/**
	 * Checks if the person is currently running
	 * @return true if the person is running, false otherwise
	 */
	public boolean isRunning();

}
