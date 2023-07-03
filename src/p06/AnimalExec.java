package p06;

public class AnimalExec {
	
	
	public static void printAnimals(Animal[] animals) {		
		for (int i = 0; i < animals.length; i++) {
			
			Animal animal = animals[i];
			
			if(!animal.name.equals("냥이")) {
				animal.hunt();
			}
			//if(animal.type.equals("새")) {  //String 비교시 "새"를 앞으로 빼야 함 
			if("새".equals(animal.type)) { 
				animal.fly();
			}
			
			animal.eat(); 
			animal.run(); 
			
			
		}
	}

	public static void main(String[] args) {
		// Animal.print(); //오류x
		// Animal.hunt(); //오류 -> static 안에선 static밖에 쓰지 못함
		// Math.random(); //오류x -> static 이기 때문
		// random.nextInt(); //오류 -> static이 아니기 때문

		// static으로 선언하게 되면 메모리 생성을 할 필요가 없다.(선택 사항)
		// nonstatic은 메모리를 생성해야만 사용 할 수 있다.

		Animal tiger = new Animal(); // 데이터 타입: Animal, 변수의 선언
		tiger.name = "호돌이"; // 변수의 초기화

		/*
		 * tiger.eat(); 
		 * tiger.run(); 
		 * tiger.hunt();
		 */

		Animal cat = new Animal();
		cat.name = "냥이";
		//cat.type="고양이";
		
		Animal bird = new Animal();
		bird.name = "구구";
		bird.type="새";
		
		Animal[] animals = new Animal[3];
		animals[0] = tiger;
		animals[1] = cat;
		animals[2] = bird;
		
		
		printAnimals(animals);

		

		
	}

}
