package day5;

import java.util.Scanner;

public class Base {

	
    public void service(String state) {
	
        if (state.equals("낮")) {
            day();
        }else   {
        	after();
        }      	
    }
    public void day() {
        System.out.println("낮");
    }
    public void after() {
    	System.out.println("오후");
    }   
}
