
 class Leve1_x만큼간격이있는n개의숫자 {
	public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long a = 0;
        for(int i=0;i<n;i++) {
        	
        	a += x;
        	answer[i]=a;
        }
       

        
        return answer;
    }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Leve1_x만큼간격이있는n개의숫자 sol = new Leve1_x만큼간격이있는n개의숫자();
		
		long[] ans= sol.solution(2, 5);
		
		for(int i=0;i<ans.length;i++) {
			System.out.printf("%d,",ans[i]);
		}
	}

}
