
public class Level1_핸드폰번호가리기 {
	 public String solution(String phone_number) {
	        String answer = "";
	      
	        String[] array = new String[phone_number.length()-1];
	        array = phone_number.split("");
       
	        for (int i=0;i< array.length-4; i++) {
	        
	        	array[i]="*";
	        }
	        for(int j=0; j<array.length; j++) {
	        		answer += array[j];	
	        	}
	        	
			
	        return answer;
	    }


	public static void main(String[] args) {
	 
		Level1_핸드폰번호가리기 sol = new Level1_핸드폰번호가리기();
		String phone_number="01012348888";
		System.out.printf("%s",sol.solution(phone_number));
	}

}
