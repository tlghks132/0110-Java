package anonymous;

public class Main {

	public static void main(String[] args) {
		/*
		Anonymous obj = new AnonymousImpl();
			obj.disp();
			*/
			
			//인스턴스의 참조를 저장하지 않았으므로 인스턴스 재사용 불가능
			new AnonymousImpl().disp();
			
			//클래스를 만들지 않고 Anonymous 인터페이스 사용하기
			new Anonymous() {

				@Override
				public void disp() {
					System.out.println("익명 객체를 이용한 인터페이스 사용");
					
				}				
			}.disp();
			
			int a =10;
			int [] ar = {200,300,100};
			System.out.println(a);
			System.out.println(ar[3]);

	}

}




