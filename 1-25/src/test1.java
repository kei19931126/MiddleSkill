import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class test1{
	public static void main(String[] args){
		//改行
		System.out.println("問１");
		//問題1:下記条件になるようログの出力を行いなさい。
		
		//条件１　例外でヌルポが発生させヌルポをキャッチした場合のみログ出力がされるプログラムにする事
		//条件２　"middleskill log"という名前のログのインスタンスを生成する事
		//条件３　srcディレクトリ内に"middleskill.log"としてログ出力される設定にする事
		//条件４　ログの内容はコンソールに出ている赤文字と同じ内容のものが表示される事
		//条件５　格納するログメッセージは"ミドルスキルログが発生しました。"という文言にする事
		 Logger middleskill_log = Logger.getLogger(test1.class.getName());

	        try {
	            // Handlerを生成しloggerに登録
	            FileHandler fHandler = new FileHandler("middleskill.log");
	            fHandler.setFormatter(new SimpleFormatter());
	            middleskill_log.addHandler(fHandler);

	            // ログレベルの設定
	            middleskill_log.setLevel(Level.INFO);

	          

	            // 例外をスロー
	            throw new NullPointerException();
	        } catch (NullPointerException e) {
	        	middleskill_log.log(Level.INFO, "ミドルスキルログが発生しました", e);
	        }  catch (IOException e) {
	            e.printStackTrace();
	        }
		
		
	}
	
	
}

