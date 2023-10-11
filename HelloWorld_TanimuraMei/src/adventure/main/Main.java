package adventure.main;

import java.util.Random;
import java.util.Scanner;

import adventure.logics.ChildAdventure;


public class Main {
	public static void main(String[] args) {

		ChildAdventure adv = new ChildAdventure(); // ChildAdventureのインスタンス化
		
		// 標準入力にて得た名前を出力する
		Scanner scanner = new Scanner(System.in); 
		String name = scanner.nextLine();
		adv.setName(name);
		scanner.close();
        System.out.println("こんにちは" + adv.getName() + "さん");
		
		System.out.println("ステータス");
		
		//各ステータスの数値をランダムにて出力する
		Random random = new Random();
		int hp = random.nextInt(1000);
		adv.setHp(hp);
		System.out.println("HP：" + adv.getHp());
		
		int mp = random.nextInt(1000);
		adv.setMp(mp);
		System.out.println("MP：" + adv.getMp());
		
		int attack = random.nextInt(1000);
		adv.setAttack(attack);
		System.out.println("攻撃：" + adv.getAttack());
		
		int speed = random.nextInt(1000);
		adv.setSpeed(speed);
		System.out.println("素早さ：" + adv.getSpeed());
		
		int guard = random.nextInt(1000);
		adv.setGuard(guard);
		System.out.println("防御力：" + adv.getGuard());
		
		System.out.println("さあ冒険に出かけよう！");
	}
}

