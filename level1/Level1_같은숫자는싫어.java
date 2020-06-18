import java.util.*;
public class Level1_같은숫자는싫어 {
	    public int[] solution(int []arr) {
	        
	        ArrayList<Integer> arrList = new ArrayList<>();
	        
	        int com = arr[0];
	         
	        for(int i=0;i<arr.length; i++) {
	        	if(com != arr[i]) { 		
	        		arrList.add(com);	    	
	        	}
	        	com = arr[i];
	        }
	        arrList.add(arr[arr.length-1]);
 
	        int[] answer = new int[arrList.size()];	
	         for(int i=0; i<answer.length;i++) {
	        	 answer[i]=arrList.get(i) ;
	         }
	        return answer;
	    }
	public static void main(String[] args) {
		Level1_같은숫자는싫어  sol = new Level1_같은숫자는싫어();
		int[] arr = {1,1,3,3,0,1,1};
		int[] arr2 = {4,4,4,3,3};
		
		int[] answer = sol.solution(arr);
		
		for(int i = 0; i<answer.length; i++) {
			System.out.printf("%d",answer[i]);
		}
		
	}

}
