public class solution {
public static void print2DArray(int[][] arr) {
		for(int i=0;i<arr.length;i++) {
			
			for(int k=0;k<(arr.length-i);k++) {
				for(int j=0;j<arr[i].length;j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
				
			}
			
		}
	}
}
