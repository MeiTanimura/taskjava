package process;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Hello {
	public String country;
	public String food;
	public String detail;
	
	public void japan(){
		System.out.println("こんにちは！ここは" + this.country + "です！");
		System.out.println("この" + this.food + "はうまい");
		System.out.println(this.food + "は" + this.detail + "です");
		
	}
   public void time() {
	LocalDateTime ldt = LocalDateTime.now();
	DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd H:m:ss");
	String formatNowDate = dtf.format(ldt);
	System.out.println("今の現在時刻は" + formatNowDate + "です");}

	}

