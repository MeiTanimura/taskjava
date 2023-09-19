package curriculum_New_question;
import java.util.Random;
public class Curriculum_New_1_18 {
	
	// Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
	public static void hello (String x, String y, int z) {
		System.out.println(x + " " +  y + " " + z);
	}
	// Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
	public static void keisan(int x,int y) {
		System.out.println(x * y);
	}
	// Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
			public static void numbers(int [] arr) {
				for(int num : arr) {
					System.out.println(num);
				}
			}
	// Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
		public static void keisan(double x, double y) {
			System.out.println(x + y);
		}
	// Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	// 格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	// ※0は出力＆格納しないようにしてください。
		public static int[] random(int count) {
			int[] randomNumber = new int [count];
			for (int i = 0; i<count;i++) {
				Random rand = new Random();
				randomNumber[i] = rand.nextInt(100)+1;
			System.out.println(randomNumber[i]);}
			return randomNumber;
			}
		

	// Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
	// ※小数点以下も表示されるようにしてください。
	public static int average(int[] randomNumber) { //配列randomNumberを受け取って処理を行う
		int total = 0;
		for(int i = 0;i<randomNumber.length;i++) {
			total = total + randomNumber[i];}
		int averageNumber = total/randomNumber.length;
		System.out.println(averageNumber);
		 return averageNumber;
		}
	
	// Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
	public static void judge(int averageNumber) {
		if (averageNumber >=  50) {
			System.out.println("true");
		}else {
				System.out.println("false");}
	}
	

	public static void main(String[] args) {
    // 作成したメソッドをここで呼び出してください
	hello("Hello","JavaSE",11);
	keisan(2,3);
	int [] arr = {1,2,3};
	numbers(arr);
	keisan(1.5,2.4);
	random(5);
	average(random(5)); //avarageを呼び出して、配列randomNumberを引数として渡す 
	judge(average(random(5)));
	}
}

