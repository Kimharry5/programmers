import java.util.ArrayList;

class Level1_자연수뒤집어배열로만들기 {
	 public int[] solution(long n) {
	        
	        
	        
	        ArrayList<Integer> list = new ArrayList<>();
	    
	        
	        while(n>0) {
	        	int num = (int) (n % 10);
	        	list.add(num);
	        	n =n/10;
	        }
	        int[] answer = new int[list.size()];
	        for (int j = 0; j < list.size(); j++) {
				answer[j]=list.get(j);
			}
	        return answer;
	    }	

	public static void main(String[] args) {
		Level1_자연수뒤집어배열로만들기 sol = new Level1_자연수뒤집어배열로만들기();
		
		int[] ans = sol.solution(12345);
		for(int i=0;i<ans.length;i++) {
			System.out.printf("%d",ans[i]);
		}
	}

}
