
import java.util.Scanner;

public class baekjoon_star2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.printf("숫자를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {		
			for(int j=0; j<n-i; j++) {
				System.out.printf(" ");			
			}
			for(int k=0;k<i;k++) {
				System.out.printf("*");
			}
			System.out.println();
		}

	}

}
