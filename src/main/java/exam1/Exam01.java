package exam1;

public class Exam01 {
	private String firstPerson;
	private String secondPerson;
	private String winner;
	private int countPlayer1 = 0;
	private int countPlayer2 = 0;

    public Exam01(String firstPerson, String secondPerson) {
    	this.firstPerson = firstPerson;
    	this.secondPerson = secondPerson;
    }


    public void playerAWin() {
    	countPlayer1++;
    }

    public void playerBWin() {
    	countPlayer2++;
    }

    public String getScore() {
    	String result = "";
    	String scoreA = "";
    	String scireB = "";
    	
    	
    	
    	
    	if(countPlayer1 == countPlayer2 && countPlayer1 == 0) {
    		return "Love-All";
    	}else if(countPlayer1 == countPlayer2 && countPlayer1 == 1) {
    		return "Fifteen-All";
    	}else if(countPlayer1 == countPlayer2 && countPlayer1 == 2) {
    		return "Thirty-All";
    	}else if(countPlayer1 == countPlayer2 && countPlayer1 == 3) {
    		return "Forty-All";
    	}else if(countPlayer1 == countPlayer2 && countPlayer1 == 4) {
    		return "Duce";
    	}
    	
    	
    	if(countPlayer1 > countPlayer2) {
    		if(countPlayer1 == 1) {
    			scoreA = "Fifteen";
    		}else if(countPlayer1 == 2) {
    			scoreA = "Thirty";
    		}else if(countPlayer1 == 3) {
    			scoreA = "Forty";
    		}
    		
    		if(countPlayer2 == 1) {
    			scireB = "ifteen";
    		}else if(countPlayer2 == 2) {
    			scireB = "Thirty";
    		}else if(countPlayer2 == 3) {
    			scireB = "Forty";
    		}
    		
    		result = scoreA + "-" + scireB;
    		return result;
    		
    	}else {
    		
    		if(countPlayer1 == 1) {
    			scoreA = "Fifteen";
    		}else if(countPlayer1 == 2) {
    			scoreA = "Thirty";
    		}else if(countPlayer1 == 3) {
    			scoreA = "Forty";
    		}else if (countPlayer1 == 4) {
				scoreA = "Win for Player A";
			}
    		
    		if(countPlayer2 == 1) {
    			scireB = "ifteen";
    		}else if(countPlayer2 == 2) {
    			scireB = "Thirty";
    		}else if(countPlayer2 == 3) {
    			scireB = "Forty";
    		}else if(countPlayer2 == 4) {
    			
    		}
    		
    		if(countPlayer1 == 4) {
    			return result;
    		}
    		result = scoreA + "-" + scireB;
    		return result;
    	}
    	
    	
    	
    	
    	
    	//return "Love-All";
    	
    	
    	
    	
        
    }

}
