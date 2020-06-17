public class Collatz {
	public int collatz(long num) {
	        int answer = 0;
	        
	        if(num==1)
	        	return answer;
	        
	        while(num!=1) {
	        	if(num %2 == 0) 
	        		num = num/2;
	        		
	        	else
	        		num = num*3 + 1;
	        	
	        	answer++;
	      
	        	if(answer>=500) {
	        		answer=-1;
	        		return answer;
	        	}
	        }
	        
	        
	        return answer;
	    }

	public static void main(String[] args) {
		Collatz col = new Collatz();
		
		System.out.printf("콜라츠 추측 :%d",col.collatz(16));
		System.out.printf("콜라츠 추측 :%d",col.collatz(1));
		System.out.printf("콜라츠 추측 :%d",col.collatz(626331));
		
	}

}
