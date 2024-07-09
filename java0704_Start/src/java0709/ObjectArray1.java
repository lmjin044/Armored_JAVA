package java0709;

public class ObjectArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//영화 정보를 5개 입력하기
		
		Movie[] mv = new Movie[5];
			//정적배열 : 이렇게 먼저 배열의 크기를 지정한 경우
			//↔동적배열 : 아직 안 배웠는데 dynamicArray라는 요소를 씀.
		mv[0]=new Movie("범죄도시", "강윤성", 18);
		mv[1]=new Movie("인사이드아웃2", "켈시", 1);
		mv[2]=new Movie("탈주", "이종필", 12);
		mv[3]=new Movie("하이재킹", "김성한", 12);
		mv[4]=new Movie("혹성탈출", "웨스", 12);
		
		for(int i=0; i<mv.length; i++) {
			//이때 i의 역할은 배열의 인덱스를 표현해주기 위한 변수임.
			System.out.println(mv[i]);
			//Movie에서 override로 컴퓨터에게 걸어준 주석인 toString을 통해
			//해당 함수에서 지정한 제목, 감독명, 영화감상연령 순으로 자동 출력됨.
		}
		//위의 for문은 이렇게 쓸 수도 있다. mv에 들어있는 배열 인덱스를
		//인덱스 표현 없이 참조변수명 movie로 넘겨서 사용할 수 있게 만드는 거
		//
//		for(Movie movie : mv) {
//			System.out.println(movie);
//		}
		
	}

}



/*
	배열의 생성방법 : 
	데이터타입[] 참조변수명 = new 데이터타입[배열크기];
		ㄴ자바에 있는 참조변수는 위 예시처럼 전부 new가 붙음.
		ㄴ배열의 차원과 사용하는 대괄호 개수는 동일([] = 1차원, [][] = 2차원)
		ㄴ그러니까 참조변수의 이름으로 배열 크기만큼의 데이터 타입을 배열로 만들겠다는 방식임.
	
	Q.클래스명을 가지고 배열을 생성할 때는?
		ex)클래스명 = Movie : 	클래스명[] 참조변수명 = new 클래스명[배열크기]

	Movie[] mv = new Movie[10]
		ㄴMovie 클래스의 참조변수가 10개 ≠ 객체가 10개
		ㄴ안하면 NullPointerException 뜸 = 객체가 존재하지 않음
		ㄴ해당 클래스의 객체를 만들어야 인스턴스 변수가 발생해 데이터 저장이 가능함.
			= mv[0] = new Movie(데이터);를 인덱스번호 9번까지 해줘야 함.
			=어렵게 생가할 거 없고 먼저 공간을 만든 다음 그 안을 채울 데이터를 입력한다고 생각하면 됨.
		
		
	int[] arr = new int[10]	: int 타입으로 선언된 변수 10개와 동일
		ㄴarr[0] = 100; : int 타입으로 만들어진 변수 공간 10개이기 때문에 직접 데이터 넣어도 됨.
*/