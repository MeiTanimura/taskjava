package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Qes6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);{
			String productName = scan.next();
			String[] strArray = productName.split("、"); 
			scan.close();
			
			Random rand1 = new Random();
			int displayStock = rand1.nextInt(11);//ディスプレイの値を先に決めておく
			
			for (String product : strArray) { 
				
				switch(product) {
				case "パソコン":
				case "冷蔵庫":
				case "扇風機":
				case "洗濯機":
				case "加湿器":
										
					Random rand2 = new Random();
					int stock = rand2.nextInt(11);
					System.out.println(product + "の残り台数は" + stock  + "台です");
					
					break;
					
				case "ディスプレイ":
				case "テレビ":
					int tvStock = 11-displayStock; //11－（先に求めているディスプレイの値）がテレビの残り台数
					System.out.println(product.equals("ディスプレイ") ? product + "の残り台数は" + displayStock  + "台です"  : product + "の残り台数は" + tvStock  + "台です");
					
					break; 
				
				default:
					System.out.println("『 " + product+ " 』" + "は指定の商品ではありません");
					
									
				}
 
			}
			

			}
			
			}
	}