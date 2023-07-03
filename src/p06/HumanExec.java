package p06;

public class HumanExec {

	public static void main(String[] args) {
		// 5명의 사람 메모리 생성
		// 각각의 이름과 나이 입력
		// 길이 5개짜리 Human 배열 생성
		// 반복문을 사용하여 최고령, 최연소 출력
		// 나이의 평균을 구한 뒤, 평균과 가장 근접한 나이가 누구인지 출력

		Human[] humans = new Human[5];
		
		humans[0]=new Human();
		humans[0].name = "황채영";
		humans[0].age = 28;

		humans[1]=new Human();
		humans[1].name = "최채영";
		humans[1].age = 27;

		humans[2]=new Human();
		humans[2].name = "김채영";
		humans[2].age = 25;
		
		humans[3]=new Human();
		humans[3].name = "박채영";
		humans[3].age = 21;

		humans[4]=new Human();
		humans[4].name = "이채영";
		humans[4].age = 29;

		
		Human yHuman=humans[0];
		Human oHuman=humans[0];
		int ageSum=0;
		int closestAgeIndex=0;
		
		

		for (int i = 0; i < humans.length; i++) {
			if(yHuman.age>humans[i].age) {
				yHuman=humans[i];
			}
			if(oHuman.age<humans[i].age) {
				oHuman=humans[i];
			}

		}
		System.out.println("최고령자: " +oHuman.name +", 나이: "+oHuman.age);
		System.out.println("최연소자: " +yHuman.name +", 나이: "+yHuman.age);
		
		for (int i = 0; i < humans.length; i++) {
			ageSum += humans[i].age;
		}
		System.out.println("나이 평균: "+ageSum/humans.length+"살");
		
		for (int i = 0; i < humans.length; i++) {
			int closestAge=Math.abs((ageSum/humans.length)-humans[0].age);
			if(Math.abs((ageSum/humans.length)-humans[i].age)<closestAge) {
				closestAge=Math.abs((ageSum/humans.length)-humans[i].age);
				closestAgeIndex=i;
			}
		}
		System.out.println("나이의 평균과 가장 근접한 나이를 가진 사람은 "+humans[closestAgeIndex].name+", 나이는 "+humans[closestAgeIndex].age+"살.");

	}
}
