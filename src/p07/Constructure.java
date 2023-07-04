package p07;

import java.util.Scanner;

public class Constructure {

	//기본 생성자(생성 시 호출)-> 클래스와 이름 중복, 데이터 타입 없음, 호출 필요 없음, 오버로딩 가능
	Constructure(){
		System.out.println("기본 생성자 호출");
		//생성자를 한 개도 선언하지 않았을 시 자동으로 기본 생성자 생성
	}
	public Constructure(int num) {
		System.out.println("int num 호출");
	}
	
	public static void main(String[] args) {
		Constructure c=new Constructure(); //생성 시 호출
		Scanner sc=new Scanner(System.in); //scanner는 기본 생성자가 없기 때문에 괄호 안에 아무것도 안 넣으면 에러
	}

}
