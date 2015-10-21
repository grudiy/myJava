package chel;

public class Main {
	
	public static void main(String[] args) {
	
		// Создадим новый обьект класса Human (экземпляр класса)
		Human h = new Human();
		
		// Передадим знчени переменной age этого обьекта
		h.age = 20;
		h.name = "Vasya";
		
		//задаем значение приватной переменной через сеттер
		h.setHeight(190);
		h.setLogin("kuy");
		
		// Вызовем метод meet данного обьекта
		h.meet();
		
	}

			
}

