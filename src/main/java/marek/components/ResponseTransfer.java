package marek.components;

public class ResponseTransfer {
	
	private String text;
	private int code;
	
	public ResponseTransfer(String text, int code)
	{
		this.text = text;
		this.code = code;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}
	
	

}
