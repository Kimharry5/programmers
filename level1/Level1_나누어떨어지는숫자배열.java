import java.util.ArrayList;
import java.util.Arrays;

class Level1_나누어떨어지는숫자배열 {
	 public int[] solution(int[] arr, int divisor) {
		 
		 ArrayList<Integer> array = new ArrayList<>();
	        
	        for (int i = 0; i < arr.length; i++) {	
	        	if (arr[i]%divisor==0) {
	        		array.add(arr[i]);	        		
	        	}
	        }
	        int[] answer= {};
			
	        if(array.size()==0) {
	        	answer = new int[1];
	        	answer[0]=-1;
	        	
	        }
	        else {
	        	answer = new int[array.size()];
	        	for (int k = 0; k < array.size(); k++) {				
					answer[k]=array.get(k);
	        		
	        	}	
	        	Arrays.sort(answer);
	        }
	        return answer;
	    }
	public static void main(String[] args) {
		 Level1_나누어떨어지는숫자배열 sol = new Level1_나누어떨어지는숫자배열();
		 
		 //int[] arr= {15,9,7,10};
		 int[] arr= {3};
		 int divisor = 5;
		 
		 int[] ans= sol.solution(arr, divisor);
		 
//		 for(int i=0; i<ans.length; i++) {
//			 System.out.printf("%d",ans[i]);
//		 }
		 System.out.println(Arrays.toString(sol.solution(arr, divisor)));

	}

}
