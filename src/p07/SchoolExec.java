package p07;

public class SchoolExec {


	public static void main(String[] args) {
		Object obj=new MiddleSchool(); //메모리는 MiddleSchool로 생성, 데이터 타입은 Object
		//Object는 MiddleSchool이 가지고 있는 변수들을 알 수 없다
		
		/*
		MiddleSchool ms=(MiddleSchool) obj; //casting
		System.out.println(ms.studentType);
		*/
		
		School middleSchool=new MiddleSchool(); //메모리 생성, 인스턴스 화 
		middleSchool.name="양주";
		School highSchool=new HighSchool();
		highSchool.name="양주";
		School school=new School();
		school.name="학교";
		//데이터 타입은 모두 School로 같지만, 메모리 생성은 middle, high 등 다 다름
		
		School[] schools=new School[3];
		schools[0]=middleSchool; //schools[0]의 데이터 타입-> School, middleSchool의 데이터 타입-> School
		schools[1]=highSchool;
		schools[2]=school;
		
		for(int i=0;i<schools.length;i++) {
			System.out.print(schools[i].name);
			if(schools[i] instanceof MiddleSchool) { //인스턴스 화-> 이거라고 불러도 되니? middleschool이라고 불러도 되니?
				MiddleSchool ms=(MiddleSchool)schools[i]; //middleschool로 캐스팅
				ms.studentType="중학교";
				System.out.println(ms.studentType);
			}else if(schools[i] instanceof HighSchool) {
				HighSchool hs=(HighSchool)schools[i]; //highschool로 캐스팅
				hs.studentType="고등학교";
				System.out.println(hs.studentType);
			}else {
				System.out.println();
			}
		}
		
		

	}

}
