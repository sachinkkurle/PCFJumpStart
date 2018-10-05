
package learn.avinash.batch.components;

public class CustomRetryableException extends Exception {

	public CustomRetryableException() {
		super();
	}

	public CustomRetryableException(String msg) {
		super(msg);
	}
}
