package exercise09truthvinluanieuan;

public class AlreadyCapturedException extends Exception {
    
	private int errors = 0;
	
	public AlreadyCapturedException(String errorMsg) {
        System.out.println(errorMsg);
    }

	public int getErrors() {
		return errors;
	}

	public void setErrors(int errors) {
		this.errors = errors;
	}
}
