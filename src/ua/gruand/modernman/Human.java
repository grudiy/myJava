package ua.gruand.modernman;

public class Human {
	
	private String phoneModel;
	public Human (String phoneModel){
		this.phoneModel = phoneModel;
	}
	
	
	public void call(){
		System.out.println("� ����� �� �������� " +phoneModel);	
	}

	public String getPhoneModel() {
		return phoneModel;
	}

	public void setPhoneModel(String phoneModel) {
		this.phoneModel = phoneModel;
	}

}
