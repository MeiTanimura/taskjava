package curriculum_B;
import java.util.Scanner;

public class Qes7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("生徒の人数を入力してください（2以上）:");
		int n = sc.nextInt();//変数nに生徒の人数を格納
		int[] English = new int[n];//生徒数分の英語の点数を格納する配列を作成
		int[] Math = new int[n];
		int[] Science = new int[n];
		int[] Society = new int[n];
		
		
		for(int i = 0;i < n;i++) { //教科ごとに標準入力された点数を格納する。
			System.out.printf("%d人目の『英語』の点数を入力してください :",i+1);
			English[i] = sc.nextInt(); 
		
			System.out.printf("%d人目の『数学』の点数を入力してください :",i+1);
			Math[i] = sc.nextInt();
			
			
			System.out.printf("%d人目の『理科』の点数を入力してください :",i+1);
			Science[i]= sc.nextInt();
			
			
			System.out.printf("%d人目の『社会』の点数を入力してください :",i+1);
			Society[i] = sc.nextInt();
			
			System.out.println("");
			
		}//for
		
		sc.close();
		
		for(int i = 0;i < n;i++) { //1人ごとの平均点を求める
			int totalScore = English[i] + Math[i] + Science[i] + Society[i];
			System.out.printf( "%d人目の平均点は" + (float)totalScore/(float)4 + "点です。",i+1);
			System.out.println("");
		}//for
		
		System.out.println("");
		
		//各教科ごとに配列に格納した点数から合計点数、平均点を求める。
		int englishTotal = 0; //englishTotalに点数を足していく。
		for(int i = 0;i<English.length;i++ ) {
			englishTotal = englishTotal + English[i];}
		System.out.println("英語の平均点は" + (float)englishTotal/(float)n + "点です。");
				
		int mathTotal = 0;
		for(int i = 0;i<Math.length;i++ ) {
			mathTotal = mathTotal + Math[i];}
		System.out.println("数学の平均点は" + (float)mathTotal/(float)n + "点です。");
		
		int scienceTotal = 0;
		for(int i = 0;i<Science.length;i++ ) {
			scienceTotal = scienceTotal + Science[i];}
		System.out.println("理科の平均点は" + (float)scienceTotal/(float)n + "点です。");
		
		int societyTotal = 0;
		for(int i = 0;i<Society.length;i++ ) {
			 societyTotal = societyTotal + Society[i];}
		System.out.println("社会の平均点は" + (float)societyTotal/(float)n + "点です。");
		
	}//main
	
	
}//class



