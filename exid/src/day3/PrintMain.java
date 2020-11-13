package day3;

public class PrintMain {
	 public static void main(String[] args) {

	        Print print = new Print();// 만들어둔 Print 클래스를 참고하는 새로운 print 객체
	        
	        print.printer(10); //객체 print는 Print 클래스의 printer를 참조함. 요소값(10) 
	        print.printer(true); //
	        print.printer(5.7); //
	        print.printer("홍길동"); //
	        print.printer("장유경");
	        
	    }
}
