import java.util.*;

class Level1_자릿수더하기 {
	  public int solution(int n) {
	        int answer = 0;
	        int num =0;
	        ArrayList<Integer> list = new ArrayList<>();
	        while(n!=0) {
	        	num = n%10;
	        	list.add(num);
	        	n=n/10;
	        }
	        
	        for(int i =0; i<list.size(); i++) {
	        	answer += list.get(i);
	        }


	        return answer;
	    }
//	  while (n != 0) {
//          answer += n % 10;
//          n /= 10;
//      }
//--다른사람 풀이

	public static void main(String[] args) {
		Level1_자릿수더하기 sol = new Level1_자릿수더하기();
		
		System.out.printf("123 = %d",sol.solution(6));

	}

}
