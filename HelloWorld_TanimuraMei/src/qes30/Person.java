package qes30;

public class Person {
	// インスタンスフィールドを定義
	String name;
	int age;
	double height;
	double weight;
	double bmi;
	public static int count = 0;

	// コンストラクタを定義しインスタンスフィールドに値をセット
	Person(String name, int age, double height, double weight) {
		// 引数をthis句で受け取る
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		Person.count++;
	}

	// BMIを求めて結果を返す
	public double bmi() {
		double bmi = this.weight / (this.height * this.height);
		return bmi;
	}

	// 出力内容を記述する
	public void print() {
		System.out.println("名前は" + this.name + "です");
		System.out.println("年は" + this.age + "才です");
		System.out.println("BMIは" + Math.floor(this.bmi()) + "です");

	}
}
