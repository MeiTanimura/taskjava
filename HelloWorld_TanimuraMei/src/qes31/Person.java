package qes31;

public class Person {
	public String name;
	public int age;
	public double height;
	public double weight;
	//問題1 クラスフィールドcountを定義する
	public static int count = 0;

	// コンストラクタを定義しインスタンスフィールドに値をセット
	Person(String name, int age, double height, double weight) {
		// 問題2 クラスフィールドcountに1を足す
		Person.count++;
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	public double bmi() {
		return this.weight / this.height / this.height;
	}

	public void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "才です");
	}

	//問題4 クラスメソッド「printCount」を定義する
	public static void printCount() {
		//問題5 クラスメソッドの中にクラスフィールド「count」を用いて「合計〇〇人です」と出力する
		System.out.println("合計" + Person.count + "人です");
	}

}
