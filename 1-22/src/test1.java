import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class test1 {
	public static void main(String[] args) {
		String shinyaBirthday = "1998/03/19";
		String minamiBirthday = "2000/02/14";
		String furuyamaBirthday = "1998/09/12";
		//改行
		System.out.println("問１");
		Date date = new Date();
		//問題1:現在の時刻を出力してください
		System.out.println(date);
		//改行
		System.out.println("問２");
		//問題2:shinyaBirthdayとminamiBirthdayを日付型に変更し条件式で誕生日を比較し早い方の日付を文字列型で出力しなさい。
	    try {
            SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy/MM/dd");
            Date date1 = sdFormat.parse(shinyaBirthday);
            Date date2 = sdFormat.parse(minamiBirthday);
            if(date1.before(date2)) {
            	System.out.println(shinyaBirthday);
            }
            else {
            	System.out.println(minamiBirthday);
            }
      
         
        } catch (ParseException e) {
            e.printStackTrace();
        }
		//改行
		System.out.println("問３");
		//問題3:furuyamaBirthdayに５年2ヶ月追加した値を文字列型で表示しなさい
		 try {
	            SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy/MM/dd");
	            Date date3 = sdFormat.parse(furuyamaBirthday);
	            Calendar calendar = Calendar.getInstance();
	            calendar.setTime(date3);
	            calendar.add(Calendar.YEAR, 5);
	            calendar.add(Calendar.MONTH, 2);
	            Date date4 =  calendar.getTime();
	            System.out.println( sdFormat.format(date4));
	            
	            	                   
	        } catch (ParseException e) {
	            e.printStackTrace();
	        }
		 
	}
}