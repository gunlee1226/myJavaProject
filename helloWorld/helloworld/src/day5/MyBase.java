package day5;
public class MyBase extends Base{

    public void service(String state) {
    	
        if (state.equals("낮")) {
            day();
        }else if (state.equals("오후")) {
        	after();
        }
        else if (state.equals("밤")){ 
            night();
        }
        	
    }

    public void day() {
        System.out.println("낮에는 일하자");
    }
    public void after() {
    	System.out.println("오후에는 밥을먹자");
    }

    public void night() {
        System.out.println("night 하기싫다");
    }

}

