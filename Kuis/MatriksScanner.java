import java.util.Scanner;
public class MatriksScanner {
	
	public static void main(String[] args) {
		
        int b = 3, k = 2;
        System.out.println("Masukkan Matriks =");
        int[][] matriksA = new int[b][k];
		
			for (int i = 0; i < b; i++) {
				for (int j = 0; j < k; j++) {
					matriksA[i][j] = masuk();
				}
			}
			
			for (int i = 0; i < b; i++) {
				for (int j = 0; j < k; j++) {
					System.out.print(matriksA[i][j]+" ");
				}
				System.out.println(" ");
			}
    }
		static int masuk() {
			Scanner a = new Scanner(System.in);
			int b = a.nextInt();
			return b;
		}
}