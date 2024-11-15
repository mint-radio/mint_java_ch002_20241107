package ch06_04;

public class Calculator {
	
	public static final double PI = 3.14;
	// 정적 필드 -> 상수로 만들어서 모든 객체에서 변하지 않는 상수값으로 공유 
	
	
}
	int first;
	int second;
//	int[] scores;
	
	public Calculator() {
		// TODO Auto-generated constructor stub
	}
	
	int first;
	int second;
	
	int add(int first, int second) {
		
		this.first = first;
		this.second = second;
		
		return this.first + this.second;
	}
	
	int sub(int first, int second) {
		
		this.first = first;
		this.second = second;
		
		return this.first - this.second;
	}
	
	int mul(int first, int second) {
		
		this.first = first;
		this.second = second;
		
		return this.first * this.second;
	}
	
	int div(int first, int second) {
		
		this.first = first;
		this.second = second;
		
		return this.first / this.second;
	}


}
