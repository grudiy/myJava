package ua.gruand.oldman;


// Опишем Класс Human
public class Human {
	
	//несколько примитивных переменных
	private int height;
	public String name;
	public int age;
	
	private String login; // приватная переменная логин пользователя
	
	// геттер для переменной height
	public getHeight (){
		return height;
	}
	
	
	// сеттер для переменной height
	public void setHeight (int height){
		if (height < 0) {
			System.out.println("Height не может быть меньше нуля!!!!");
			return; // Выход из метода
		}
		this.height = height;
	}
	
	
	// геттер для переменной login
	public getLogin (){
		return login;
	}
	
	
	// сеттер для переменной login
	public void setLogin (String login){
		this.login = login;
	}
	
	
	//метод класса Human
	public void meet (){
		System.out.println("Hi, my name is " +name + " my age is " +age +"/ my height is " +height);
		System.out.println ("my loign is: " +login);
	}
	
}
	


