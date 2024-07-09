package java0709;

public class Movie {
	//인스턴스 변수의 제어자는 private
	//아래는 인스턴스 변수들.
	private String title;	//영화제목
	private String director;//감독
	private int viewAge;	//관람 연령
	
	//private 제어자 인스턴스변수에 대한 get, set 메서드 생성?
	//위 내용 작성 후 우클릭 > source > generate getters and setters
	// > 전부 선택 후 generate
	
	//private 제어자는 클래스 내부(해당 중괄호 내)에서만 사용가능하기 때문이며
	//메서드로 만든 이유는 실수로 변수를 기입하거나 불필요한 부분을 감추기 위해서다.
	//혼자하면 또 모를까 다른 사람들이랑 같이 한다던가 하면...

	//클래스 객체내부에 인스턴스 데이터를 저장하는 방법 : 
	//1)set메서드를 통한 데이터 저장
	//2)생성자 메서드로 데이터를 저장. 아래가 그 예시임.
	
	public Movie(){}
		//생성자 메서드의 틀을 먼저 지정하고
	public Movie(String title, String director, int viewAge){
		this.title = title;
		this.director = director;
		this.viewAge = viewAge;
	} 
	//동일한 이름으로 매개변수를 생성하여 해당 매개변수와 동일한 생성자 메서드를 지정
	//메인 메서드에서 입력하는 요소들은 해당 변수라는 의미

//아래는 객체의 인스턴스 변수들 값을 출력하기 위한 메서드 
//참고로 java의 대부분 클래스가 지님

	@Override
	public String toString() {
		return title+", "+director+", "+viewAge;
	}
//이렇게 하면 메인 클래스에서 출력을 요청할 때 위 양식으로 나옴.
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getViewAge() {
		return viewAge;
	}
	public void setViewAge(int viewAge) {
		this.viewAge = viewAge;
	}
	
	//나중에는 라이브러리를 이용한 방법으로 자동 생성되므로 변수만 만들예정임.
}
