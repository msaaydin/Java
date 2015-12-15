
package rodcuttingdynamicprogramming;

/**
 *
 * @author rivendell
 */

public class RodCuttingDynamicProgramming {
  public static int profitDP(int[] value, int length) {
		int[] solution = new int[length + 1];
		solution[0] = 0;

		for (int i = 1; i <= length; i++) {
			int max = -1;
			for (int j = 0; j < i; j++) {
				max = Math.max(max, value[j] + solution[i - (j + 1)]);
				solution[i] = max;
			}
		}
		return solution[length];
	}
   
    public static void main(String[] args) {
        // TODO code application logic here
        int[] value = { 1, 5, 8, 9, 10, 17, 17, 20 }; // prices
		int len = 4;
		System.out.println("Max profit for length is " + len + ":"
				+ profitDP(value, len));
    }
    
}
