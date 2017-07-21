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
    	winner = firstPerson;
    	countPlayer1++;
    }

    public void playerBWin() {
    	winner = secondPerson;
    	countPlayer2++;
    }

    public String getScore() {
//    	if(winner == firstPerson) {
//    		if(countPlayer1 == 1) {
//    			return "Fifteen-Love";
//    		}else if(countPlayer1 == 2) {
//    			return "Thirty-Love";
//    		}else if(countPlayer1 == 3) {
//    			return "Forty-Love";
//    		}else if(countPlayer1 == 4) {
//    			return "Win for Player A";
//    		}
//    	}else {
//    		if(countPlayer2 == 1) {
//    			return "Love-Fifteen";
//    		}else if(countPlayer2 == 2) {
//    			return "Love-Thirty";
//    		}else if(countPlayer2 == 3) {
//    			return "Love-Forty";
//    		}else if(countPlayer2 == 4) {
//    			return "Win for Player B";
//    		}
//    	}
    	
    	if(countPlayer1 == 1 && countPlayer2 == 0) {
			return "Fifteen-Love";
		}else if(countPlayer1 == 2 && countPlayer2 == 0) {
			return "Thirty-Love";
		}else if(countPlayer1 == 3 && countPlayer2 == 0) {
			return "Forty-Love";
		}else if(countPlayer1 == 4 && countPlayer2 == 0) {
			return "Win for Player A";
		}
    	
    	if(countPlayer2 == 1 && countPlayer1 == 0) {
			return "Love-Fifteen";
		}else if(countPlayer2 == 2 && countPlayer1 == 0) {
			return "Love-Thirty";
		}else if(countPlayer2 == 3 && countPlayer1 == 0) {
			return "Love-Forty";
		}else if(countPlayer2 == 4 && countPlayer1 == 0) {
			return "Win for Player B";
		}
    	
    	if(countPlayer1 == countPlayer2 && countPlayer1 == 1) {
    		return "Fifteen-All";
    	}else if(countPlayer1 == countPlayer2 && countPlayer1 == 2) {
    		return "Thirty-All";
    	}else if(countPlayer1 == countPlayer2 && countPlayer1 == 3) {
    		return "Deuce";
    	}
    	
    	
    	
    	return "Love-All";
    	
    	
        
    }

}
