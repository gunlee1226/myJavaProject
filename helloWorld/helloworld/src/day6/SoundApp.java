package day6;

public class SoundApp {

    public static void main(String[] args) {
        printSound( new Cat() );
        printSound( new Dog() );
        printSound( new Sparrow1() );
        printSound( new Duck1() );
    }

    public static void printSound( Soundable soundable ) {
    System.out.println( soundable.sound());
    }
    
}
