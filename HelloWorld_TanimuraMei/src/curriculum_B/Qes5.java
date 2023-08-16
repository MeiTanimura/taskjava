package curriculum_B;


public class Qes5 {

public static void main(String[] args) { 
		
		for(int i = 1 ; i < 10 ; i++) { 
			for(int j = 1 ; j < 21 ; j++) { 
				int kuku = i * j; //変数kukuにi*jの結果を格納する
				System.out.print("||"  + (String.format("%03d",j)) + "*" + (String.format("%03d",i)) + "="  + (String.format("%03d", kuku))); //3桁に揃えて出力
	
			}
			System.out.println(" "); //内側のループが1周したら改行する。
		}

	} 

}

	
		

	


	