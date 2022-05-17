package yufeng.guru.springframework.spring5webapp.exception;

public class TeamNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public TeamNotFoundException(String msg) {
		super(msg);
	}
	
	
}
