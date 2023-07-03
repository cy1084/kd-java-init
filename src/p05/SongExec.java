package p05;

public class SongExec {
	public static void printSong(Song[] songs) {

		for (Song s : songs) {
			System.out.println("제목: " + s.name);
			System.out.println("가수: " + s.singer);
			System.out.println("순위: " + s.rank);
		}

	}

	public static void main(String[] args) {
		
		Song[] songs=new Song[3];	
		int firstIndex=0;
		int lastIndex=0;
		
		
		songs[0]=new Song();
		songs[0].name = "queencard";
		songs[0].singer = "여자 아이들";
		songs[0].rank = 1;
		//printSong(s);

		songs[1]=new Song();
		songs[1].name = "김철수씨 이야기";
		songs[1].singer = "허회경";
		songs[1].rank = 5;

		songs[2]=new Song();
		songs[2].name = "위로";
		songs[2].singer = "권진아";
		songs[2].rank = 7;
		
		int first=songs[0].rank; //min
		int last=songs[0].rank; //max
		//데이터 타입 int
		
		for (int i = 1; i < songs.length; i++) { 
			if (last < songs[i].rank) {
				last = songs[i].rank;	
				lastIndex=i;
			}			
			if (first > songs[i].rank) {
				first = songs[i].rank;	
				firstIndex=i;
			}		
		}
		
		/*
		 * 데이터 타입 Song
		= 	Song fSong=songs[0]; //일등, 0번째 인덱스의 3개 변수 정보 들어감
			Song lSong=songs[0];	//꼴등
			
			for (int i = 1; i < songs.length; i++) { 
			if (lSong.rank < songs[i].rank) {
				lSong=song[i];
			}			
			if (fSong.rank > songs[i].rank) {
				fSong=song[i];
			}		
		}
		
		System.out.println("1등인 노래: " +fSong.singer +", 가수 이름: "+fSong.name);
		System.out.println("꼴등인 노래: " +lSong.singer+", 가수 이름: "+lSong.name);
			
		  */
				
		System.out.println("1등인 노래: " +songs[firstIndex].name +", 가수 이름: "+songs[firstIndex].singer);
		System.out.println("꼴등인 노래: " +songs[lastIndex].name+", 가수 이름: "+songs[lastIndex].singer);
		
		
		//songs[0]=s;
		//songs[1]=s1;
		//songs[2]=s2;
		
		//printSong(songs);
		

		/*
		Song s = null;
		System.out.println(s.name); -> NullPointerException, null은 없다는 뜻이기 때문
		
		Song s = new Song();
		System.out.println(s.name.length); -> NullPointerException
		
		Song s = new Song();
		System.out.println(s.name); -> null, 메모리는 생성했지만 초기화를 안했기 때문
		
		Song[] songs=new Song[3];
		System.out.println(songs[0].name); -> NullPointerException
		
		Song[] songs=new Song[3];
		System.out.println(songs[0]); -> null
		
		*/
	}

}
