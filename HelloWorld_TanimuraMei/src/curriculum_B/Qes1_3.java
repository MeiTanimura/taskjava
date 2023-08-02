package curriculum_B;

import java.util.Random;
import java.util.Scanner;
public class Qes1_3 {

	public static void main(String[] args) {
		String name = getName(); //ユーザー名を入力させる
		String judgeName  = judgeNameMessage(name); //入力されたユーザー名が正しいか判断する
		int user = getUser(); //ユーザーの乱数を求める
		int pc = getPc(); //PCの乱数を求める
		String result = judgeJanken(user,pc); //求めた2つの乱数で勝ち、まけ、あいこを判断する。変数resultに結果を入れる
		String pcJudgeMessage = judgeMessage(user,pc); //じゃんけんの結果によって出力されるメッセージを変数pcJudgeMessageに入れる。クラス名はjudgeMessage
		showResult(name,judgeName,user,pc,result,pcJudgeMessage);
		}
		
	public static String getName() {
		//ログイン時の入力チェックシステムを下記条件で作成してください
		//コンソールにユーザー名を入力できるようにしてください
		Scanner scanner = new Scanner(System.in);
		System.out.println("ユーザー名を入力してください");
		String name = scanner.nextLine();
		return name;
					}
	
		
  public static String judgeNameMessage(String name) {
	  String judgeName  = "";
	  if(name.length()>10) {
		  judgeName   ="名前を10文字以内にしてください";
		}else if(name.length() <= 0 || name == null) {
			judgeName    = "名前を入力してください";		
		}else if(name.matches("^[A-Za-z0-9]+$")) {  
			judgeName   = "半角英数字のみで名前を入力してください";	
		}else {
			judgeName  = "ユーザー名" + name + "を登録しました";
			
		

 }
	return judgeName ;
  }
 
	public static int getUser() {
	Random rand = new Random();
	return rand.nextInt(3);
	}
	
	public static int getPc() {
		Random rand = new Random();
		return rand.nextInt(3);
		}
	
	public static String judgeJanken(int user,int pc) {
		String result=""; // 判定結果を保存する
		 
		if((user==0 && pc==1) || (user==1 && pc==2) || (user==2 && pc==0)) {
			result="勝ち";
		}else if( (user==0 && pc==2) || (user==1 && pc==0) || (user==2 && pc==1)) {
		   result="まけ";
		}else {
			result="あいこ";
		}
	 
		// 勝敗結果を返す
		return result;
		}
		

	public static String judgeMessage(int user,int pc) {
		String pcJudgeMessage = "";
		if((user == 0 && pc == 1) || (user == 1 && pc == 2)|| (user == 2 && pc == 0)) {
			pcJudgeMessage = "やるやん。次は俺にリベンジさせて";	
		}else if(user == 1 && pc == 0){
			pcJudgeMessage = "俺の勝ち！負けは次につながるチャンスです！ネバーギブアップ！";
		}else if (user == 2 && pc == 1) {
			pcJudgeMessage = "俺の勝ち！たかがじゃんけん、そう思ってないですか？それやったら次も、俺が勝ちますよ";
		}else if (user == 0 && pc == 2) {
			pcJudgeMessage ="俺の勝ち！なんで負けたか、明日まで考えといてください。そしたら何かが見えてくるはずです";
		}else {
			pcJudgeMessage= "DRAW あいこ もう一回しましょう！";
		}
		
		return pcJudgeMessage;
	}


	public static void showResult(String name,String judgeName,int user,int pc,String result,String pcJudgeMessage) {
		String[] janken = {"グー","チョキ","パー"};
		//userがじゃんけんに負けている、あいこの間はループする
		while(result=="まけ" || result=="あいこ") {
			System.out.println(judgeName);
			System.out.println(name + "の手は" + janken[user]);
			System.out.println("相手の手は" + janken[pc]);
			System.out.println(pcJudgeMessage);
		if(result == "勝ち") { //ユーザーがじゃんけんで勝ったらループを止める
			break;}
		}
		
			
			
			
		/*ユーザー名の文字数が10文字より大きい場合「名前を10文字以内にしてください」と出力してください
		ユーザー名の文字数が0文字以下もしくはnullの場合「名前を入力してください」と出力してください
		ユーザー名が半角英数字以外の場合「半角英数字のみで名前を入力してください」と出力してください*/
		/*if(userName.length()>10) {
			System.out.println("名前を10文字以内にしてください");
		}else if(userName.length() <= 0 || userName == null) {
			System.out.println("名前を入力してください");		
		}else if(userName != "^[0-9a-zA-Z]+$") {
			System.out.println("半角英数字のみで名前を入力してください");	
		}else {
		System.out.println("ユーザー名" + userName + "を登録しました");
		System.out.println(userName + "の手は" + janken[user]);
		System.out.println("相手の手は" + janken[pc]);
		System.out.println(result);*/
		
		
		
		
}
	}


//}
//while(user == 0 && pc == 2 || user == 1 && pc == 0 || user== 2 && pc == 1) {


