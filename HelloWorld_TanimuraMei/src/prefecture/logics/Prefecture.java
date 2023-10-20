package prefecture.logics;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Prefecture {

	public static int number;
	public static String[] arrayPrefectures =  {"北海道:札幌市:83424","岩手県:盛岡市:15275", "宮城県:仙台市:7282", "秋田県:秋田市:11638", 
			"山形県:山形市:9323","福島県:福島市:13784","茨城県:水戸市:6097", "栃木県:宇都宮市:6408","群馬県:前橋市:6362","埼玉県:さいたま市:3798"
	};
	
	public void prefecturedetail() {
		
		// 標準入力された番号を「,」で分割して配列arrayNumbersに格納する
		System.out.println("数字を入力してください");
		Scanner scan = new Scanner(System.in);
	    String stringNumber = scan.nextLine(); 
	  
	    if(stringNumber =="") {
	    	System.out.println("入力されていません。数字を入力してください");
	    }else {
		String[] arrayNumbers = stringNumber.split(","); 
	
		// 配列arrayNumbersを標準入力の結果によって昇順、降順でソートをかける
		System.out.println("昇順、降順を入力してください。");
		 String stringSort = scan.nextLine();
		 scan.close();
			
		    switch (stringSort) {
		    case ("昇順"):
		    	Arrays.sort(arrayNumbers);
		    break;
		    case("降順"):
		    	Arrays.sort(arrayNumbers,Collections.reverseOrder());
		    }
		
		// 配列arrayNumbersに格納された番号に対応する都道府県のデータを出力する
		for(String num : arrayNumbers) {
			// 配列stringNumbersに格納された値をint型として扱いたいため、String型からint型に変換する
			int intNumber = Integer.parseInt(num);
		
			// 変数preNumに入力された番号の都道府県データを「北海道:札幌市:83424」の形で格納する
			String preNum = arrayPrefectures[intNumber];
			
			// preNumに格納されたデータを「:」で分割して項目ごとに出力する
			String[] arrayPrefectures2 = preNum.split(":");
			System.out.println("都道府県名：" + arrayPrefectures2[0]);
			System.out.println("県庁所在地：" + arrayPrefectures2[1]);
			System.out.println("面積：" + arrayPrefectures2[2]+ "km2");
			System.out.println("");
		}
	
}
}

}