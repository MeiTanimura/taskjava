package main;

import process.Hello;

public class Main {

	public static void main(String[] args) {
		Hello jpn = new Hello();
		jpn.country = "日本";
		jpn.food = "寿司";
		jpn.detail = "和食";
		jpn.japan();
		jpn.time();
	}


}

