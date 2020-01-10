package Interfaceuse;

public interface ISample {
	//final 이 없어도 final : 변경 못함
	public String TODAY = "2020-01-10";
	
	//abstract 가 없어도 abstract
	//내용을 만들면 안되고 ISample을 implements 한 곳에서는 반드시 Overriding(재정의) 해야 한다.
	public void disp();
	
	//인터페이스에서 내용을 갖는 메소드를 만들고자 할 때는 접근지정자로 default를 사용해야 한다.
	default void print() {
		//메소드 내용
	}
}
