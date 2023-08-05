package curriculum_B;

import java.util.Random;
import java.util.Scanner;
public class Qes1_3 {

	public static void main(String[] args) {
		//コンソールにユーザー名を入力できるようにしてください
		Scanner scanner = new Scanner(System.in);
		System.out.println("ユーザー名を入力してください");
		String name = scanner.nextLine();
		scanner.close();
		
		String judgeName  = judgeNameMessage(name); //変数nameに格納されたユーザー名が正しいか判断する
		
		int count = 0; //じゃんけんが1回作動したら変数countに＋1をする
		
		String result = "まけ";
		while(result=="まけ" || result=="あいこ") {
		count++;
	
		int user = getUser(); //ユーザーの乱数を求める
		
		int pc = getPc(); //PCの乱数を求める
		
		
		result = judgeJanken(user,pc); //求めた2つの乱数で勝ち、まけ、あいこを判断する。変数resultに結果を入れる
	
		String pcJudgeMessage = judgeMessage(user,pc); //じゃんけんの結果によって出力されるメッセージを変数pcJudgeMessageに入れる。
		
		showResult(name,judgeName,user,pc,count,result,pcJudgeMessage);//ユーザー名、じゃんけんの結果、勝つまでにかかった回数を表示する
		
		if(result == "勝ち") {//ユーザーがじゃんけんに勝ったらループを止める
			break;}
		}
	}
		
		
  public static String judgeNameMessage(String name) {
	  String judgeName  = "";
	  /*ユーザー名の文字数が10文字より大きい場合「名前を10文字以内にしてください」と出力してください
		ユーザー名の文字数が0文字以下もしくはnullの場合「名前を入力してください」と出力してください
		ユーザー名が半角英数字以外の場合「半角英数字のみで名前を入力してください」と出力してください
		ユーザー名が正常な値だった場合「ユーザー名「 入力したユーザー名 」を登録しました」と出力してください*/
	  if(name.length()>10) {
		  System.out.println("名前を10文字以内にしてください");
	  }else if(name.length() <= 0 || name == null) {
		  System.out.println("名前を入力してください");		
	  }else if(!name.matches("^[A-Za-z0-9]+$")){ 
	     System.out.println("半角英数字のみで名前を入力してください");	
	  }else {
		 judgeName = "ユーザー名" + name + "を登録しました";	

  }
	return judgeName ;
  }
 
	public static int getUser() { //ユーザーの乱数を求める
	    Random rand = new Random();
	    return rand.nextInt(3); //乱数0,1,2を返す
	}
	
	public static int getPc() { //PCの乱数を求める
		Random rand = new Random();
		return rand.nextInt(3);  //乱数0,1,2を返す
		}
	
	public static String judgeJanken(int user,int pc) { //乱数によるじゃんけんの判定をする
		String result=""; // 判定結果を保存する
		 
		if((user==0 && pc==1) || (user==1 && pc==2) || (user==2 && pc==0)) {
			result="勝ち";
		}else if( (user==0 && pc==2) || (user==1 && pc==0) || (user==2 && pc==1)) {
		   result="まけ";
		}else {
			result="あいこ";
		}
	 
		return result; // 勝敗結果を返す
		}
		

	public static String judgeMessage(int user,int pc) { //PCのメッセージを保存する
		String pcJudgeMessage = ""; //勝ち、負け、あいこの場合に出力するメッセージを保存する
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
		
		return pcJudgeMessage; //出力するメッセージを返す
	}

	
	
	public static void showResult(String name,String judgeName,int user,int pc,int count,String result,String pcJudgeMessage) {
		String[] janken = {"グー","チョキ","パー"};
		/*一回ごとに自分の手と相手の手を下記の通り出力してください
		ユーザー名「name」を登録しました
		nameの手は「パー」
		相手の手は「グー」*/
		
		switch(result) {
		case "負け":
			if (judgeName.equals("ユーザー名" + name + "を登録しました")){
			System.out.println(judgeName);
			System.out.println(name + "の手は" + janken[user]);
			System.out.println("相手の手は" + janken[pc]);
			System.out.println(pcJudgeMessage);
			break;}
		case "あいこ":
			if (judgeName.equals("ユーザー名" + name + "を登録しました")){
			System.out.println(judgeName);
			System.out.println(name + "の手は" + janken[user]);
			System.out.println("相手の手は" + janken[pc]);
			System.out.println(pcJudgeMessage);
			break;}
			
		case "勝ち":
			if (judgeName.equals("ユーザー名" + name + "を登録しました")){
			System.out.println(judgeName);
			System.out.println(name + "の手は" + janken[user]);
			System.out.println("相手の手は" + janken[pc]);
			System.out.println(pcJudgeMessage);
			System.out.println("勝つまでにかかった合計回数は" + count + "回です");
			break;}}
			
}
}
	



