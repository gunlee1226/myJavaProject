package day3;

public class GoodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Goods camera = new Goods("sony", 68000);
		Goods notebook = new Goods("LG�׷�", 900000);
		Goods cup = new Goods("�ӱ���", 20000);

		camera.name = "samsung";
		camera.price = 62000;



		System.out.println("��ǰ�̸� :" + camera.name + " \t" + camera.price );
		System.out.println("��ǰ�̸� :" + notebook.name + "\t " + notebook.price);
		System.out.println("��ǰ�̸� :" + cup.name + "\t " + cup.price);

		camera.ShowInfo();
		notebook.ShowInfo();
		cup.ShowInfo();
	}




}