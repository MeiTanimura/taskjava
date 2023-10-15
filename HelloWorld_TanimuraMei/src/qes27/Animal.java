package qes27;

import java.util.Scanner;

public class Animal {
	String animalName;
	String height;
	String speed;
	String scientificName;
	
	void animal(){
		// 標準入力で得た文字列を「:」で分割して出力する
		Scanner scanner = new Scanner(System.in);
		System.out.println("コンソールに文字を入力してください");
		String [] str = scanner.nextLine().split(":");
		scanner.close();
		animalName = str[0];
		height = str[1];
		speed = str[2];
		
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
		
	}
}
