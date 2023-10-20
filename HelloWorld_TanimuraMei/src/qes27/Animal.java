package qes27;

import java.util.Scanner;

public class Animal {
	public static String[] strArray;
	String animalName;
	String height;
	String speed;
	String scientificName;
	
	public void animal(){
		// 標準入力で得た文字列を「,」で分割してstrArrayに格納する
		Scanner scanner = new Scanner(System.in);
		System.out.println("コンソールに文字を入力してください");
		String str = scanner.nextLine();
		String [] strArray = str.split(",");
		scanner.close();
		
		// コンソールの入力値がない時にエラー文を出力する
		 if (str.isEmpty()) {
			 System.out.println("文字が入力されていません。入力してください。");
		 }else {
		//「,」で区切られた配列を再度「:」で区切り、標準入力された文字列を全て出力する
	for(String anm : strArray) {
		String [] strArray2 = anm.split(":");
		animalName = strArray2[0];
		height = strArray2[1];
		speed = strArray2[2];
		
		// 標準入力された動物名（animalNameに格納）によって出力されるscientificNameを入力する
		switch(animalName) {
		case "ライオン":
			scientificName = "パンテラ レオ";
	        break;

		case "ゾウ":
			scientificName = "ロキソドンタ・サイクロティス";
	     	break;
		
		case "パンダ":
			scientificName ="アイルロポダ・メラノレウカ";
		    break;
		
		case "チンパンジー":
			scientificName = "パン・トゥログロディテス";
		    break;
		
		case "シマウマ":
			scientificName = "学名：チャップマンシマウマ";
			break;
			
		case "インコ":
			scientificName ="不明";
			break;
			}
		
		System.out.println("動物名:" +animalName);
		System.out.println("体長:" + height + "m");
		System.out.println("速度:" + speed + "km/h");
		System.out.println("学名:" +scientificName);
		System.out.println("");
	}
	 }
	}
    }

