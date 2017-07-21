package exam1;

public class Exam01 {
	private String firstPerson;
	private String secondPerson;
	private String winner;

    public Exam01(String firstPerson, String secondPerson) {
    	this.firstPerson = firstPerson;
    	this.secondPerson = secondPerson;
    }


    public void playerAWin() {
    	winner = firstPerson;
    }

    public void playerBWin() {
    }

    public String getScore() {
    	if(winner == firstPerson) {
    		return "Fifteen-Love";
    	}
        return "Love-All";
    }

}
