package ch06_02;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car1 = new Car("Hyundai", "sonata");  // car1이라는 이름으로 인스턴스(객체) 생성
		System.out.println(car1.maxspeed); //200
//		car1.company = "Hyundai";
//		car1.model = "sonata";
		car1.drive(); //50
		Car car2 = new Car("Kia", "k5"); // 인스턴스(객체) 생성
//		car2.company = "kia";
//		car2.model = "k5";
		
	}

}
