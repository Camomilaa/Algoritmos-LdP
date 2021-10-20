package edu.newton.ldp.av1;

public class teste {
	public static int bolinha(int arr[], int x)
    {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
  
            if (arr[m] == x)
                return m;
  
            if (arr[m] < x)
                l = m + 1;
  
            else
                r = m - 1;
        }
  
        return -1;
    }
	public static void main(String[] args) {
		int[] arr = {2, 4, 7, 9, 13, 21, 24};
		int x = 3;
		
		var resp = bolinha(arr, x);
		System.out.println(resp);

	}

}
