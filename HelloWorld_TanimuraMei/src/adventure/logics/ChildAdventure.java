package adventure.logics;

public class ChildAdventure extends ParentAdventure{
	private int hp;
	private int mp;
	private int attack;
	private int speed;
	private int guard;

	public ChildAdventure() { // コンストラクタの定義
		super(); // ParentAdventureクラスのコンストラクタの呼び出し
	}
	
	// hpフィールドのgette,setter
		public int getHp() {
			return hp;
		}
		
		public void setHp(int hp) {
			this.hp = hp;
		}

		// mpフィールドのgette,setter
		public int getMp() {
			return mp;
		}
		
		public void setMp(int mp) {
			this.mp = mp;
		}
	
		// attackフィールドのgette,setter
		public int getAttack() {
			return attack;
		}
		
		public void setAttack(int attack) {
			this.attack = attack;
		}
		
		// speedフィールドのgette,setter
		public int getSpeed() {
			return speed;
		}
		
		public void setSpeed(int speed) {
			this.speed = speed;
		}
		
		// guardフィールドのgette,setter
		public int getGuard() {
			return guard;
		}
		
		public void setGuard(int guard) {
			this.guard = guard;
		}
}
