
  class Level1_가운데글자가져오기 {
	    public String solution(String s) {
	        String answer = "";
	        String[] s_array;
	        s_array=s.split("");
	        for (int i = 0; i < s.length(); i++) {
				
				//System.out.printf("%s",s_array[i]);
			}
	        
	        for (int i = 0; i < s_array.length; i++) {
				if(s.length() % 2 != 0)
					answer = s_array[(s.length()/2)];
				else
					answer = s_array[(s.length())/2-1].concat(s_array[s.length()/2]);
			}
	        return answer;
	    }
	
  
	
	
	public static void main(String[] args) {
		Level1_가운데글자가져오기 sol = new Level1_가운데글자가져오기();
		
		System.out.printf("abcde = %s\n",sol.solution("abcde"));
		System.out.printf("abcd = %s\n",sol.solution("abcd"));

	}

}
