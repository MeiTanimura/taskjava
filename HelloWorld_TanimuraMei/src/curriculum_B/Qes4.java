package curriculum_B;

public class Qes4{ 

	public static void main(String[] args) { 
		
		for(int i = 1 ; i < 10 ; i++) { // 外側のループ
			for(int j = 1 ; j < 10 ; j++) { //内側のループ。内側のループが終わると１つの段が終わる。
				int kuku = i * j; //変数kukuにi*jの結果を格納する
				if(j == 9) {
					System.out.print((String.format("%02d",i)) + "*" + (String.format("%02d",j)) + "="  + (String.format("%02d", kuku))); //2桁に揃えて出力 
				}else {
				System.out.print((String.format("%02d",i)) + "*" + (String.format("%02d",j)) + "="  + (String.format("%02d", kuku)) + "||"); //行の始まりと終わり以外には段ごとの区切り線を出力する
			}
			}
			System.out.println(" "); //内側のループが1周したら改行する。
		} 

	} 

} 

