package qes27;

//import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Animal animals = new Animal();
		animals.animal();
		System.out.println("動物名:" + animals.animalName);
		System.out.println("体長:" + animals.height + "m");
		System.out.println("速度:" + animals.speed + "km/h");
		System.out.println("学名:" + animals.scientificName);
	}
		
		
	
	
		

	}




/*public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("コンソールに文字を入力してください");
		String [] str = scanner.nextLine().split(":");
		System.out.println("動物名:" + str[0]);
		System.out.println("体長:" + str[1] + "m");
		System.out.println("速度:" + str[2] + "km/h");
		scanner.close();
		
	String animalName = str[0];
	
	switch(animalName) {
	case "ライオン":
		System.out.println("学名：パンテラ レオ");
        break;

	case "ゾウ":
		System.out.println("学名：ロキソドンタ・サイクロティス");
     	break;
	
	case "パンダ":
		System.out.println("学名：アイルロポダ・メラノレウカ");
	    break;
	
	case "チンパンジー":
		System.out.println("学名：パン・トゥログロディテス");
	    break;
	
	case "シマウマ":
		System.out.println("学名：チャップマンシマウマ");
		break;
		
	case "インコ":
		System.out.println("学名：不明");
		break;
	
	}
		

	}

}*/
