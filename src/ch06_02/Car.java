//package ch06_02;
//
//public class Car {
//	String company; // 자동차 제조회사
//	String model; // 자동차 모델
//	String color="black"; // 자동차 색깔
//	int maxspeed=200; // 최고 속력
//	
//	int speed; // 현재 스피드
//	int rpm; // 현재 rpm
//	
//	public Car(String company_, String model_) {
//		// TODO Auto-generated method stub
//		company = company_;
//		model = model_;
//	}
//	
//	void drive() {
//		speed = 50;
//		System.out.println(speed);
//	}
//	
//}


package ch06_02;

public class Car {
	String company; // 자동차 제조회사
	String model; // 자동차 모델
	String color="black"; // 자동차 색깔
	int maxspeed=200; // 최고 속력
	
	int speed; // 현재 스피드
	int rpm; // 현재 rpm
	
	public Car(String company, String model) {
		// TODO Auto-generated method stub
		this.company = company; // this : 파이썬 'self'와 비슷
		this.model = model; // this : filed를 의미
	}
	
	public Car(String company, String model, String color) { // 생성자 오버로딩, 이름만 바꿔서는 안 되고, 타입+개수를 바꿔야 함
		// TODO Auto-generated method stub
		this.company = company; // this : 파이썬 'self'와 비슷
		this.model = model; // this : filed를 의미
		this.color = color;
	}
	
	void drive(int rpm) {
		speed = 50;
		this.rpm = rpm;
		System.out.println(speed);
		System.out.println(this.rpm);
	}
	
	void drive(int rpm, int speed) {
		speed = 50;
		this.rpm = rpm;
		System.out.println(speed);
		System.out.println(this.rpm);
	}
	
	void drive(String model) {
		speed = 50;
		this.model = model;
		System.out.println(this.model);
	}
	
}
