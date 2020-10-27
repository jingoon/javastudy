package kr.co.ezen;

public class TV {
	
	private int ch;
	private int vol;
	private String model;
	private String company;
	
	public TV() {
		// TODO Auto-generated constructor stub
	}
	public TV(int ch, int vol, String model, String company) {
		super();
		this.ch = ch;
		this.vol = vol;
		this.model = model;
		this.company = company;
	}
	
	
	
	
	
	public int getCh() {
		return ch;
	}
	public void setCh(int ch) {
		this.ch = ch;
	}
	public int getVol() {
		return vol;
	}
	public void setVol(int vol) {
		this.vol = vol;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	

}
