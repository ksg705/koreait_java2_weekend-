package com.koreait.first.level1;

public class ClassEx extends Object{
	// 필드 // 속성,상태
	int field1;
	String field2;
	int[] field3;
	
	int field4;
	static int field5;
	
	void method4 () {}
	static void method5 () {}
	
	static void methodTest() {
//		this.field4 = 10;
//		method4();
		
		field5 = 10;
		method5();
	}
	
	// 생성자 // 필드 초기화 
	public ClassEx() {
//		super();
	}
	
	public ClassEx(int field1) {
		this.field1 = field1;
	}
	public ClassEx(int field1, String field2) {
		this(); //ClassEx(field1);
		this.field2 = field2;
	}
	public ClassEx(int field1, String field2, int[]) {
		this(field1, field2);
//		this.field1 = field1;
//		this.field2 = field2;
		this.field3 = field3;
	}
	
	// 메소드 // 동작
	int sum(int n1, int n2) {
		return n1 + n2;
	}
	int sum(int n1, int n2,int n3) {
		return n1 + n2 + n3;
	}
//  int sum(int[] arr) {
	int sum(int... arr) {
		// int[] arr;
 		int total = 0;
		//실행코드
 		for(int i=0; i<arr.length; i++) {
 			total += arr[i];
 		}
		
		
		
		return total;
	}
	// 매개변수의 1.타입 2.개수 3.위치
}






// main메소드는 final만
// class는 static
