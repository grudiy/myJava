package ua.gruand.oldman;


// ������ ����� Human
public class Human {
	
	//��������� ����������� ����������
	private int height;
	public String name;
	public int age;
	
	private String login; // ��������� ���������� ����� ������������
	
	// ������ ��� ���������� height
	public getHeight (){
		return height;
	}
	
	
	// ������ ��� ���������� height
	public void setHeight (int height){
		if (height < 0) {
			System.out.println("Height �� ����� ���� ������ ����!!!!");
			return; // ����� �� ������
		}
		this.height = height;
	}
	
	
	// ������ ��� ���������� login
	public getLogin (){
		return login;
	}
	
	
	// ������ ��� ���������� login
	public void setLogin (String login){
		this.login = login;
	}
	
	
	//����� ������ Human
	public void meet (){
		System.out.println("Hi, my name is " +name + " my age is " +age +"/ my height is " +height);
		System.out.println ("my loign is: " +login);
	}
	
}
	


