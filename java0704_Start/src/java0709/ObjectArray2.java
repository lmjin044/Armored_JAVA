package java0709;

public class ObjectArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Game[] ga = new Game[7];
		
		ga[0] = new Game("리그오브레전드", "AOS", "PC");
		ga[1] = new Game("DJMAX 시리즈", "리듬", "PC, XBOX");
		ga[2] = new Game("바운스볼", "플랫포머", "모바일");
		ga[3] = new Game("포르자 모터스포츠6", "레이싱", "XBOX");
		ga[4] = new Game("Final Fantazy VII REBIRTH", "ARPG", "PS4");
		ga[5] = new Game("젤다의 전설 : 왕국의 눈물", "ARPG", "Switch");
		ga[6] = new Game("발로란트", "FPS", "PC");
		
		for(int i=0; i<ga.length; i++) {
			System.out.println(ga[i]);
		}
	}

}
/*
문제 : 7개의 게임 정보를 가진 객체를 생성하고 출력하시오
*/