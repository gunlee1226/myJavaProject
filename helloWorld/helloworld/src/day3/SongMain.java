package day3;

public class SongMain {

	public static void main(String[] args) {
		Song so = new Song("������","real", "������", "�̹μ�", 2010 , 3);
		Song dou = new Song("���","Bigbang", "������", "�̹μ�", 2010 , 3);
		
		
		so.showinfo();
		
		dou.setAlbum("���");
		dou.showinfo();
		
		
		/*
		so.title = "Always";
		so.artist = "���";
		so.album = "������";
		so.composer = "G-DRAGON �۰�";
		so.year = 2007;
		so.track = 2;
		
		
		so.showinfo();
		so.title = "����Ŀ1��";
		so.artist = "����Ŀ����Ŀ";
		so.album = "���ɿ���";
		so.composer = "����� �۰�";
		so.year = 2012;
		so.track = 4;
		
		
		so.showinfo();
	
*/
	}
}
