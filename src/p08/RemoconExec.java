package p08;

public class RemoconExec {

	public static void main(String[] args) {
	/*
		AirconRemocon ar=new AirconRemocon(); //참조형 변수 -> new 필수
		TVRemocon tr=new TVRemocon();
		
		
		Remote r1=ar;
		Remote r2=tr;
		
		//데이터 타입을 하나로 묶음 -> 다형성
		Remote[] remotes=new Remote[2];
		remotes[0]=r1;
		remotes[1]=r2;
	 */
		
		// 위와 같음	
		Remote[] remotes=new Remote[2];
		remotes[0]=new AirconRemocon();
		remotes[1]=new TVRemocon();
		
		for(int i=0;i<remotes.length;i++) {
			remotes[i].on();
			
			if(remotes[i] instanceof AirconRemocon) {
				AirconRemocon ar=(AirconRemocon)remotes[i];
				ar.tempUp();
				ar.tempDown();
			}
			else if(remotes[i] instanceof TVRemocon) {
				TVRemocon tr=(TVRemocon)remotes[i];
				tr.chUp();
				tr.chDown();
			}
			remotes[i].off();
			System.out.println();
		}
		

	}

}
