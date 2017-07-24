package exam1;

public class Exam01 {
	private String firstPerson;
	private String secondPerson;
	private int countPlayerA = 0;
	private int countPlayerB = 0;

    public Exam01(String firstPerson, String secondPerson) {
    	this.firstPerson = firstPerson;
    	this.secondPerson = secondPerson;
    }

    public void playerAWin() {
    	countPlayerA++;
    }

    public void playerBWin() {
    	countPlayerB++;
    }

    public String getScore() {
    	String resultA = "";
    	String resultB = "";
    	String resultFinal = "";
    	
    	if(countPlayerA == 0) {
    		resultA = "Love";
    	}else if(countPlayerA == 1) {
    		resultA = "Fifteen";
    	}else if(countPlayerA == 2) {
    		resultA = "Thirty";
    	}else if(countPlayerA == 3) {
    		resultA = "Forty";
    	}
    	
    	if(countPlayerB == 0) {
    		resultB = "Love";
    	}else if(countPlayerB == 1) {
    		resultB = "Fifteen";
    	}else if(countPlayerB == 2) {
    		resultB = "Thirty";
    	}else if(countPlayerB == 3) {
    		resultB = "Forty";
    	}
    	
    	if(countPlayerA == 0 && countPlayerB == 0) {
    		resultFinal = "Love-All";
    	}else if(countPlayerA == countPlayerB && countPlayerA >= 3 && countPlayerA <= 4 ) {
    		resultFinal = "Deuce";	
    	}else if(countPlayerA == countPlayerB) {
    		resultFinal = resultA + "-" + "All";
    	}else if(countPlayerA <= 3 && countPlayerB <= 3) {
    		resultFinal = resultA + "-" + resultB;
    	}
    	
    	
    	
    	
    	
    	
    	return resultFinal;
    }

}
