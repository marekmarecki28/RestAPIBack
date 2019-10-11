package marek.model;

import java.util.Date;

public class Stock {
	
	private Date date;
	private double open;
	private double close;

	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public double getOpen() {
		return this.open;
	}
	public void setOpen(double open) {
		this.open = open;
	}
	public double getClose() {
		return this.close;
	}
	public void setClose(double close) {
		this.close = close;
	}
}
