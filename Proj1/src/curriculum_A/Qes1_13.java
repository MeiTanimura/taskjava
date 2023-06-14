package curriculum_A;

public class Qes1_13 {

	public static void main(String[] args) {
		
		/*
		* [概要] ローカル変数の宣言処理
		* [詳細] ローカル変数を宣言する
		*/
		
		//1下記9個をローカル変数として宣言のみしてください

		byte byt;
		short srt;
		int in;
		long lng;
		float flt;
		double dbl;
		char chr;
		String str;
		boolean bool;

		/*
		* [概要] ローカル変数の初期化処理
		* [詳細] ローカル変数に初期値を代入して初期化する
		*/
		
		//2それぞれのローカル変数をローカル内でそれぞれの初期値を代入し初期化してください

		byt = 0;
		srt = 0;
		in = 0;
		lng = 0L;
		flt = 0.0f;
		dbl = 0.0d;
		chr = '\u0000';
		str = "null";
		bool = false;
		
		/*
		* [概要] 代入処理
		* [詳細] 変数に値を代入宣言する
		*/
		
		//3初期化をしたそれぞれの変数に下記の値を代入してください

		byt = 10;
		srt = 100;
		in = 1000;
		lng = 10000L;
		flt = 9.5f;
		dbl = 10.5d;
		chr = 'a';
		str = "ハロー";
		bool = true;
		
		/*
		* [概要] コンソールに出力をする処理
		* [詳細] コンソールに「出力する
		*/
		
		//4下記の通りにコンソール出力されるようにしてください

		System.out.println(byt+srt+in+lng);
		System.out.println(Math.round(flt+dbl));
		System.out.println(chr+" "+str+" "+bool);
		System.out.println(Math.round(byt+srt+in+lng+flt+dbl));
		System.out.println(byt*srt*in*lng);
		System.out.println(dbl/100);
		System.out.println(byt-srt);
		
		System.out.println("");
		

		/*
		* [概要] 修正処理
		* [詳細] 誤った箇所を修正して出力する
		*/
		
		//5次のプログラムを実行すると「ハローJAVA2023」という結果が表示されます。ハローJAVA43」と表示とさせたいのですが、意図通りに動きません。正しく動作するように修正してください。

		int num = 20;
		int num1 = 23;
		System.out.println("ハローJAVA"+(num+num1));
		
		System.out.println("");
		

		/*
		* [概要] 自己紹介出力処理
		* [詳細] 自己紹介をフォーマットに従った形で出力する		
		*/
		
		/*7『』で囲われた人の情報を変数にして、formatの通りコンソールに出力してください
		* ローカル変数に代入し○○に入れてください
		* 『山田太郎 18歳 170.5cm 62.2kg 寿司』
		*/
		String name = "山田太郎";
		int age = 18;
		double height = 170.5;
		double weight = 64.2;
		String food = "寿司";
		

		/*↓↓format↓↓
		「初めまして○○です」
		「年齢は○○歳です」
		「身長は○○cmです」
		「体重は○○kgです」
		「好きな食べ物は○○です」
		*/

		System.out.println("初めまして"+name+"です");
		System.out.println("年齢は"+age+"歳です");
		System.out.println("身長は"+height+"cmです");
		System.out.println("体重は"+weight+"kgです");
		System.out.println("好きな食べ物は"+food+"です");
		System.out.println("");
		

		/*
		* [概要] BMI出力処理
		* [詳細] BMIを生産して出力する		
		*/
		/*7.6で作成した自己紹介に続いてBMIが出力されるようにしてください
		「BMIは○○です」
		ただし計算は数値を直書きせず、全て変数を使ってすること
        */
		
		double bmi = weight/Math.pow(height/100,2);
		System.out.println("BMIは"+(String.format("%.1f", bmi))+"です");
		System.out.println("");
		

		/*
		* [概要] 変数代入、自己紹介出力処理
		* [詳細] 変数を代入して自己紹介をフォーマットに従った形で出力する		
		*/
	
		/*8.6で宣言した変数に再代入し下記の通りコンソールに出力してください
		初めまして鈴木一郎です
		年齢は24歳です
		身長168.5cmです
		体重は64.2kgです
		好きな食べ物はオムライスです
		BMIは22.6です
		*/
		name = "鈴木一郎";
		age = 24;
		height = 168.5;
		weight = 64.2;
		food = "オムライス";
		bmi = weight/Math.pow(height/100,2);
		
		System.out.println("初めまして"+name+"です");
		System.out.println("年齢は"+age+"歳です");
		System.out.println("身長は"+height+"cmです");
		System.out.println("体重は"+weight+"kgです");
		System.out.println("好きな食べ物は"+food+"です");
		System.out.println("BMIは"+(String.format("%.1f", bmi))+"です");
		System.out.println("");
		
		/*
		* [概要] 自己代入処理
		* [詳細] 変数に和算で自己代入して出力する		
		*/
		
		/*9.8で使用した変数【年齢・身長・体重】の数値を和算で自己代入し、下記の通りコンソールに出力してください
		　初めまして鈴木一郎です
		　年齢は48歳です
		　身長337.0cmです
		　体重は128.4kgです
		　好きな食べ物はオムライスです
		　BMIは11.31です
		*/
		
		age+= 24;
		height+= 168.5;
		weight+= 64.2;
		bmi = weight/Math.pow(height/100,2);
		
		System.out.println("初めまして"+name+"です");
		System.out.println("年齢は"+age+"歳です");
		System.out.println("身長は"+height+"cmです");
		System.out.println("体重は"+weight+"kgです");
		System.out.println("好きな食べ物は"+food+"です");
		System.out.println("BMIは"+(String.format("%.2f", bmi))+"です");
		System.out.println("");
		

		/*
		* [概要] true.false出力処理
		* [詳細] 年齢が25歳以上ならtrueが出力されるようにする	
		*/
		//10.8で使用した年齢が25歳以上ならtrueが出力されるようにしてください。ただしif文は使いません
		
		boolean isolder = (age > 25);
		System.out.println(isolder);
		System.out.println("");
		

		/*
		* [概要] 型変換処理
		* [詳細] 文字列型に変換する
		*/
		
		//11.8で使用した【年齢・身長・体重】を文字列型に型変換し繋げて出力してください
		String strAge = String.valueOf(age);
		String strHeight = String.valueOf(height);
		String strWeight = String.valueOf(weight);
		
		System.out.println(strAge + "歳"+"・"+strHeight+"cm"+"・"+strWeight+"kg");
		System.out.println("");
		

		/*
		* [概要] 型変換処理
		* [詳細] 整数型に変換する
		*/
		
		//12.11で変換した【年齢・身長】を整数型に変換して出力してください
		
		int intAge= Integer.parseInt(strAge);
		int intHeight= (int) Double.parseDouble(strHeight);
		
		System.out.println(strAge+"歳"+"・"+intHeight+"mm");
		System.out.println("");
		

		/*
		* [概要] 論理和判定処理
		* [詳細] いずれかの条件を満たす場合にtrueを出力する処理	
		*/
		
		//13.12で変換した【年齢・身長】で【年齢が25もしくは身長が160以上】であればtrueを出力してください
		
		System.out.println(intAge == 25 || intHeight >= 160);
	}

}
