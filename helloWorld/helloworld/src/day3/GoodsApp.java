package day3;

public class GoodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Goods camera = new Goods("sony", 68000);
		Goods notebook = new Goods("LG그램", 900000);
		Goods cup = new Goods("머그컵", 20000);
		
		camera.name = "samsung";
		camera.price = 62000;
		
		
				
		System.out.println("상품이름 :" + camera.name + " \t" + camera.price );
		System.out.println("상품이름 :" + notebook.name + "\t " + notebook.price);
		System.out.println("상품이름 :" + cup.name + "\t " + cup.price);
		
		camera.ShowInfo();
		notebook.ShowInfo();
		cup.ShowInfo();
	}



		
}
	
