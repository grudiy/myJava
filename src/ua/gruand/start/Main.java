package ua.gruand.start;

import ua.gruand.modernman.*;

public class Main {
	
	public static void main(String[] args) {
		// КОММЕНТЫ 
		
		// Создадим новый обьект класса Human (экземпляр класса)
		Human h = new Human("Iphone");
		
		// Передадим знчени переменной age этого обьекта
		//h.age = 20;
		//h.name = "Kolya";
		
		//задаем значение приватной переменной через сеттер
		//h.setHeight(190);
		//h.setLogin("логинчик");
		
		// Вызовем метод meet данного обьекта
		h.call();
		
	}

			
}

