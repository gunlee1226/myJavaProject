package day4;

public class TvMain {

	public static void main( String[] args ) {
		
		TV tv = new TV( 7, 20, false);
		
		tv.status();
		
		tv.power( true);
		tv.volume( 120 );
		tv.status();
//		오버로딩
		tv.volume( false );
		tv.status();
//		오버로딩
		tv.channel( 0 );
		tv.status();
//		오버로딩
		tv.channel( true );
		tv.channel( true );
		tv.channel( true );
		tv.status();
//		오버로딩
		tv.power( false );
		tv.status();
		}
}
