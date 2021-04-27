class Solution {
   public String solution(String new_id) {
		String answer = "";
		String fake = "";
		//1단계
		answer = new_id.toLowerCase();
		//2단계
		for ( int i = 0; i< answer.length(); i++) {
			if ( answer.charAt(i) >='a' && answer.charAt(i) <='z' ) {
				fake += answer.charAt(i); 	
			}else if ( answer.charAt(i) >= '0' && answer.charAt(i) <= '9' ) {
				fake += answer.charAt(i);
			}else if ( answer.charAt(i) == '-' || answer.charAt(i) == '_' || 
													answer.charAt(i) =='.') {
				fake += answer.charAt(i);
			}
		}
		answer = fake;
		//3단계
		fake ="";
		fake += answer.charAt(0);
		for ( int i = 1; i< answer.length(); i++) {
			if ( answer.charAt(i) != '.') {
				fake += answer.charAt(i);
			}
			else{
				if ( answer.charAt(i-1) != '.') {
					fake += answer.charAt(i);
				}
			}
		}
		answer = fake;
		//4단계
		for(int i = 0; i<answer.length(); i++) {
			if (answer.charAt(0) == '.') {
				answer = answer.substring(1);
			}
			if (i == answer.length()-1) {
				if(answer.charAt(i) == '.') {
					answer = answer.substring(0,(int) i);
				}
			}
		}
		//5단계
		if (answer.length() == 0) {
			answer = "a";
		}
		//6단계
		if(answer.length() >= 16) {
			answer = answer.substring(0,15);
			if(answer.charAt(14) == '.') {
				answer = answer.substring(0, 14);
			}
		}
		//7단계
		if(answer.length() <= 2) {
			for(int i = 0; i<3; i++) {
				if(answer.length() == i) {
					answer += answer.charAt(i-1); 
				}
			}
		}
		return answer;
	}
}