package chel;

public class Main {
	
	public static void main(String[] args) {
	
		// �������� ����� ������ ������ Human (��������� ������)
		Human h = new Human();
		
		// ��������� ������ ���������� age ����� �������
		h.age = 20;
		h.name = "Vasya";
		
		//������ �������� ��������� ���������� ����� ������
		h.setHeight(190);
		h.setLogin("kuy");
		
		// ������� ����� meet ������� �������
		h.meet();
		
	}

			
}

