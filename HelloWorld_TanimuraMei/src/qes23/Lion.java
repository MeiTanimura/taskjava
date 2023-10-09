package qes23;

public class Lion {
	Animal animal = new Animal(); //Animalクラスのインスタンス化

	//Animalクラスで宣言された、各フィールドに値を代入して出力する
	public void nameLion() {
		animal.setName("ライオン");
		System.out.println("動物名：" + animal.getName());
	}
	
   public void heightLion() {
	   animal.setHeight(2.1);
	   System.out.println("体長：" + animal.getHeight() + "m");

}

   public void speedLion() {
	   animal.setSpeed(80);
	   System.out.println("速度：" + animal.getSpeed() + "km/h");
}
}
