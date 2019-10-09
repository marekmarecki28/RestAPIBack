package marek.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Quote {
	
	private String type;
	private Value value;

	public Value getValue() {
		return value;
	}

	public void setValue(Value value) {
		this.value = value;
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
}
