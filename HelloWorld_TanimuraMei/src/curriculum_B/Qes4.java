package curriculum_B;

public class Qes4{ 

	public static void main(String[] args) { 
		
		for(int i = 1 ; i < 10 ; i++) { // 外側のループ
			for(int j = 1 ; j < 10 ; j++) { //内側のループ。内側のループが終わると１つの段が終わる。
				int kuku = i * j; //変数kukuにi*jの結果を格納する
				
				if(kuku < 10) { //変数kukuの値が1桁の場合kukuの前に0を出力する。
					System.out.print("||" +  "0" + i + "*" + "0" + j + "=" + "0" + kuku); 
					
				}else {
					System.out.print( "||" + "0" + i + "*" + "0" + j + "=" + kuku);
				}
			}
			System.out.println(" "); //内側のループが1周したら改行する。
		} 

	} 

} 

