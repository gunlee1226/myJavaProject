package day5;



public class BaseApp {

    public static void main(String[] args) {  
    	
        Base base = new MyBase();    
        
        base.service("낮"); 
        base.service("오후");
        base.service("밤");
    }

}
