package WAC1;

public class SecondLargestInArray {
	public static int find(int[] a) {
		int temp, l = a.length;
		
		for (int i = 0; i < l; i++) {
			for (int j = i + 1; j < l; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		int i = l - 1;
		for (; i > 0; i--) {
			if (a[i - 1] < a[i])
				return a[i - 1];
		}
		return a[i];
	}

	public static void main(String args[]) {
		int a[] = { 47, 66, 99, 99, 29, 16, 51 };
		System.out.println("Second Largest Number is : " + find(a));
	}
}
