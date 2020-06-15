
 class RemoveSmallNum {
	
	    public int[] removesmallnum(int[] arr) {
	        int[] answer = new int[arr.length-1];
	        int min;
	        int count=0;
	       
	        
	    	if( arr.length == 1 ) {
        		return new int[]{-1};
	    	}
	    	min = 0;
	        for(int i=0; i<arr.length; i++) {    
	        	if( arr[i] <= min) {        		
	        		min = arr[i];	        		
	        		count++;
	        		System.out.printf("%d",count);
	        		
	        		}	 
	        }
	        int num=0;
	        for(int j=0;j<arr.length;j++) {
	        	 if(j == count-1) continue;
	        	    answer[num++] =arr[j];
	        	    
	        }	        	        
	        return answer;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveSmallNum rsn = new RemoveSmallNum();
		int[] arr = {2,3,4,5,7,6,1,8};
		
		int[] ans = rsn.removesmallnum(arr);
		//System.out.printf("[4,3,2,1] :  %d", rsn.removesmallnum(arr));
		for(int i=0;i<ans.length;i++) {
			System.out.printf(ans[i]+" ");
		}
		

	}
 }
	


