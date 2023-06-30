package p05;

public class SongExec2 {

	public static void main(String[] args) {
		Song s=new Song();
		s.name="하입보이";
		s.singer="뉴진스";
		s.rank=10;
		
		Song[] ss=new Song[5];
		ss[0]=s;
		
		Song s1=ss[0];

	}

}
