import java.util.Scanner;
import java.util.logging.Logger;
public class checkTest {
	//問7用
	private static final Logger LOGGER = Logger.getLogger(checkTest.class.getName());
	
	public static void main(String[] args) {
		//改行
		System.out.println("問１");
		//問1 リソースを開く(ファイル名)ショートカットキーは何ですか？
		//Ctrl + Shift + R
        
		//改行
		System.out.println("問２");
		//問2 リファクタリングをする時のショートカットキーは何ですか？
		//Ctrl + Alt + R
		
		//改行
		System.out.println("問３");
		//問3 デバッグを行う方法を簡潔に記載してください
		//虫のアイコンを押す
		
		//改行
		System.out.println("問４");
		//問4 Javaのバージョン8と11の違いを簡潔に答えてください
		
		
		//改行
		System.out.println("問５");
		//問5　Road博物館の入場料金は、一人1000円であるが、10人以上のチームなら一人820円、20人以上の団体なら一人700円である。人数を入力し、入場料の合計を計算するプログラムを作成せよ。(if文で上記文章を作ってください)
		System.out.println("人数入力");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		if(num < 10) {
			System.out.println("合計金額は「"+ num*10000 +"」です");
		}
		
		else if(10<=num || num<20) {
			System.out.println("合計金額は「"+ num*820 +"」です");
			
		}
		else {
			System.out.println("合計金額は「"+ num*700+ "」です");
		}
		
		
		//改行
		System.out.println("問６");
		//問6　コメントアウトされている箇所にどう言った処理が行われているか記載してください
		//配列scoreに要素数の数だけ得点を入れ、その得点を要素数分sumに足しこみ、要素数で割り平均値を算出
		
		Scanner scn = new Scanner(System.in);
		int[] score = new int[5];
		int i, sum;
		double ave;
		
		//
		for (i = 0; i < score.length; i++) {
			System.out.print("得点を入力してください = ");
			score[i] = scn.nextInt();
			}


			//
			sum = 0;
			for (i = 0; i < score.length; i++) {
			sum += score[i];
			}
		
			//
			ave = sum / (double)score.length;
			//
			System.out.println("平均値 = " + ave);
		
		//改行
		System.out.println("問７");
		//問7　ログ出力が行えるように下記コードを修正してください
		Logger LOGGER = Logger.getLogger(checkTest.class.getName()); 
		String message = "Hello World!";
		LOGGER.info("The message is: " + message);
		
		//改行
		System.out.println("問８");
		//問8　問題：
		//入力された文字列を整数に変換し、その結果を出力するプログラムを作成してください。ただし、以下の場合には例外を発生させてください。(Scannerメソッドを使用すること)
		//1.入力された文字列がnullの場合（NullPointerExceptionが発生する）
		//2.入力された文字列が空文字列の場合（Exceptionが発生する）
		//3.入力された文字列が整数に変換できない場合（NumberFormatExceptionが発生する）
		Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("文字列を入力してください: ");
            String input = scanner.nextLine();

            if (input == null) {
                throw new NullPointerException("入力がnullです。");
            } else if (input.isEmpty()) {
                throw new Exception("入力が空文字列です。");
            }

            int number = Integer.parseInt(input);
            System.out.println("変換された整数: " + number);
        } catch (NullPointerException e) {
            System.out.println("エラー: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("エラー: 整数に変換できません。");
        } catch (Exception e) {
            System.out.println("エラー: " + e.getMessage());
        } finally {
            scanner.close();
        }
    

		
		
     	//改行
		System.out.println("問９");
		//問9 Java編終わった感想と改善点もしございましたらお願いします。
		//『ここに書いてね』
	}
}
