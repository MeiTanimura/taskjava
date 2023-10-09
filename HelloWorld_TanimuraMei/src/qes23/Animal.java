package qes23;

public class Animal {
	
	//各フィールドをprivateにて宣言する
	private String name;
	private double height;
	private int speed;
	
	//Lionクラスから各フィールドにアクセスできるようgetter、setterを記述する。
    //名前
	public String getName() {
		return this.name;
	}
	public void setName(String animalName) {
		this.name = animalName;
	}
	
	//体長
	public double getHeight() {
		return this.height;
	}
	public void setHeight(double animalHeight) {
		this.height = animalHeight;
	}
	
	//速度
	public int getSpeed() {
		return this.speed;
	}
	public void setSpeed(int animalSpeed) {
		this.speed = animalSpeed;
	}
	
	
}
