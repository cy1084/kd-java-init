package p05;

public class HumanExec {

	public static void main(String[] args) {
		Human[] humans=new Human[5];	
		
		humans[0]=new Human();
		humans[0].name = "황채영";
		humans[0].money = 1000;
		
		humans[1]=new Human();
		humans[1].name = "황채영1";
		humans[1].money = 200000000;
		
		humans[2]=new Human();
		humans[2].name = "황채영2";
		humans[2].money = 100;
		
		humans[3]=new Human();
		humans[3].name = "황채영3";
		humans[3].money = 650000000;
		
		humans[4]=new Human();
		humans[4].name = "황채영4";
		humans[4].money = 50000;
		
		int sum=0;
		String names=""; 
		
		for(int i=0;i<humans.length;i++) {
			sum += humans[i].money;
		}
	
		System.out.println("총액: "+sum+"원, 평균: "+sum/humans.length+"원");
		
		for(int i=0;i<humans.length;i++) {
			if(humans[i].money>=(sum/humans.length)) {
				System.out.println(humans[i].name+"님은 평균 이상입니다.");
				//names += humans.name+"님, ";
			}
		}
		//names=names.substring(0, names.length()-2);
		//System.out.println(names+"은 평균 이상입니다.");
		
		

	}

}
