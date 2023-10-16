import java.util.Arrays;
import java.util.Collections;

public class test1 {
	public static void main(String[] args) {
		//改行
		System.out.println("問１");
		//問１のメソッドを呼び出して出力してください（引数５と１０）
		System.out.println(add(10,5));
		//改行
		System.out.println("問２");
		//問２のメソッドを呼び出して出力してください（引数"しんぶんし"）
		System.out.println(isPalindrome("しんぶんし"));
		//改行
		System.out.println("問３");
		//問3のメソッドを呼び出して出力してください（引数,配列[5,3,1,9,4,8]）
		Integer [] i = {5,3,1,9,4,8};
		arraysSort(i);
		
		//改行
		System.out.println("問４");
		//問4のメソッドを呼び出して出力してください（引数,配列[5,3,1,9,4,8]）
		int [] k = {5,3,1,9,4,8};
		System.out.println(serchIndex(k));
	}
	//問題1:2つの整数を受け取り、それらの和を返すメソッドを作成してください。
	
	public static int add(int num1, int num2) {
        return num1 + num2;
    }		
	
	//問題2:文字列を受け取り、その文字列が回文であるかどうかを返すメソッドを作成してください。
	
	public static boolean isPalindrome(String s) {
	    int left = 0, right = s.length() - 1;
	    while (left < right) {
	        if (s.charAt(left) != s.charAt(right)) {
	            return false;
	        }
	        left++;
	        right--;
	    }
	    return true;
	    
	}
	
	//問題3:整数の配列を受け取り、その配列の要素を降順にソートするメソッドを作成してください。(for文は利用しないこと)
	public static void arraysSort(Integer[] i) {
	    Arrays.sort(i,Collections.reverseOrder());
	    System.out.println(Arrays.toString(i));
	}
	
	
	
	//問題4:整数の配列を受け取り、その配列の中で最小値を持つ要素のインデックスを返すメソッドを作成してください。
	public static int serchIndex(int[] k) {
		 int minIndex = 0;
	        for (int i = 0; i < k.length; i++) {
	            minIndex = k[i] < k[minIndex] ? i : minIndex;
	        }
	        
	     return minIndex;
		
		
	}
	
	
}
