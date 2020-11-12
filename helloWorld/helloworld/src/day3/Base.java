package day3;

public class Base {
	
    public void service(String state) {
     System.out.println(state);
     if(state.equals("낮")) {
    	 this.day();
     }else if(state.equals("밤")) {
    	 this.night();
     }else {
    	 this.afternoon();
     }
     
    }

    public void day() {
    	System.out.println("낮에는 열심히 일하자");
    }
    public void night() {
    	System.out.println("night");
     
    }
    public void afternoon(){
    	System.out.println("오후 에도 일하자");
    }
    
   
    
}
