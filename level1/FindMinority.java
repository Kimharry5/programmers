class FindMinority {
 
    public int erato(int n) { //에라토스의 체 참고
		int answer = 0;
		int[] n_array = new int[n+2];
		
		for(int i=2; i<=n; i++) { //배열에 n까지 담아줌
			n_array[i]=i;
		}
		
		for(int i=2; i<=n; i++) {			
			if(n_array[i]==0)	 //배열값이0이면 계속
				continue;
			//System.out.printf("%d",n_array[i]);
			for(int j=i+i; j<=n; j += i){ //2의 배수는 전부 0으로 바꿔줌,다음3의배수,,
				n_array[j]=0;		
			}
			if(n_array[i] != 0) //배열값중 0이 아닌 값이 남은것이 소수
				answer++;		//갯수를 체크해줌
			
		}
		
		return answer;
	}
    public int findminority (int n) { //효율성테스트 실패
    int answer = 0;
    int count=0;
    for(int i=2; i <= n; i++) {
    	for(int j = 1; j <= i; j++) {
    		if(i % j == 0)
    			count++;
    	}
    if(count==2)
    	answer++;
    count=0;        	
    }
    
    return answer;
}
    public static void main(String[] args) {
		FindMinority fm = new FindMinority();
		
		System.out.printf("10의 소수 : %d\n" , fm.erato(10));
		System.out.printf("10의 소수 : %d\n" , fm.findminority(10));
	}
}