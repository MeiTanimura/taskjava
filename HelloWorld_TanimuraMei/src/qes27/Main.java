package qes27;

public class Main {

	public static void main(String[] args) {
		
		// Animalクラスをインスタンス化してanimalメソッドを呼び出す
		Animal animals = new Animal();
		animals.animal();
		System.out.println("動物名:" + animals.animalName);
		System.out.println("体長:" + animals.height + "m");
		System.out.println("速度:" + animals.speed + "km/h");
		System.out.println("学名:" + animals.scientificName);
	}
}

		
	