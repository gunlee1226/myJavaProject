package day3;

public class SongMain {

	public static void main(String[] args) {
		Song so = new Song("¾ÆÀÌÀ¯","real", "ÁÁÀº³¯", "ÀÌ¹Î¼ö", 2010 , 3);
		Song dou = new Song("ºò¹ð","Bigbang", "°ÅÁþ¸»", "ÀÌ¹Î¼ö", 2010 , 3);
		
		
		so.showinfo();
		
		dou.setAlbum("ºò¹ð");
		dou.showinfo();
		
		
		/*
		so.title = "Always";
		so.artist = "ºò¹ð";
		so.album = "±×Áþ¸»";
		so.composer = "G-DRAGON ÀÛ°î";
		so.year = 2007;
		so.track = 2;
		
		
		so.showinfo();
		so.title = "¹ö½ºÄ¿1Áý";
		so.artist = "¹ö½ºÄ¿¹ö½ºÄ¿";
		so.album = "º¢²É¿£µù";
		so.composer = "Àå¹üÁØ ÀÛ°î";
		so.year = 2012;
		so.track = 4;
		
		
		so.showinfo();
	
*/
	}
}
