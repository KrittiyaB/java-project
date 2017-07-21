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
    }

    public String getScore() {
    	if(winner == firstPerson) {
    		if(countPlayer1 == 1) {
    			return "Fifteen-Love";
    		}
    		return "Thirty-Love";
    	}
        return "Love-All";
    }

}
