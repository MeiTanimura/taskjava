package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);{
			String productName = scan.next();
			String[] strArray = productName.split("、"); 
			scan.close();
			
			Random rand2 = new Random();
			int stock2 = rand2.nextInt(12);//ディスプレイの値を先に決めておく
			
			for (String product : strArray) { //拡張for文
				
				switch(product) {
				case "パソコン":
				case "冷蔵庫":
				case "扇風機":
				case "洗濯機":
				case "加湿器":
					
					
					Random rand1 = new Random();
					int stock1 = rand1.nextInt(12);
					System.out.println(product + "の残り台数は" + stock1  + "台です");
					
					break;
					
				case "ディスプレイ":
					System.out.println(product + "の残り台数は" + stock2  + "台です");
					
					break; 
					
				case "テレビ":
					int stock3 = 11-stock2; //11－（先に求めているディスプレイの値）がテレビの残り台数
					System.out.println(product + "の残り台数は" + stock3  + "台です");
					
					break;
				}//switch文
 
			} //拡張for文
			

			}//while
			
			}//main
	}