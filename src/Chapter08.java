
public class Chapter08 {
	public static void main(String[]args) {
		int number = 1;
		while (number < 5) {
			System.out.println(number * number);
			//まずは行いたい計算式を行う
			number++;
			/*与えられている条件（今回で言うと１以上５未満の２乗）になるように変数を書き換えるための
			 計算式を入れる
		    */
		}
		int array[] = {2, 3, 6, 19};
		for (int i = 0; i < array.length; i++) {
			//変数の代入、条件、計算式の順
			System.out.println(array[i]);
		}
		for (int val : array) {
			if(val % 2 == 0) {
				continue;
			}
			System.out.println(val);
		}
	}
}
