package p07;

//Son-> 3가지 이름으로 불릴 수 있다 -> Son, Father, Object!!
public class Son extends Father{
	public String hobby;
	
	public void printHobby() {
		System.out.println(name+"님의 취미는 "+hobby+"입니다.");
	}

}


/*
사람 s = new 박경훈 (O)
박경훈 s = new 사람 (X)
Son s=new Son();(O)
Father f=new Son();(O)
Object o=new Son();(O)
*/
