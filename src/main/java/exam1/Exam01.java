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

	public boolean isLoveAll() {
		if (countPlayerA == 0 && countPlayerB == 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isNormal() {
		if (countPlayerA <= 3 && countPlayerB <= 3) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isDuece() {
		if (countPlayerA == countPlayerB && countPlayerA >= 3 && countPlayerA <= 4) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isWinOrAdvantage() {
		if (countPlayerA >= 4 || countPlayerB >= 4) {
			return true;
		} else {
			return false;
		}
	}

	public String setPersonScore(String person) {
		String score = "";
		if (person.equals(firstPerson)) {
			switch (countPlayerA) {
			case 0:
				score = "Love";
				break;
			case 1:
				score = "Fifteen";
				break;
			case 2:
				score = "Thirty";
				break;
			case 3:
				score = "Forty";
				break;
			default:
				break;
			}
		} else {
			switch (countPlayerB) {
			case 0:
				score = "Love";
				break;
			case 1:
				score = "Fifteen";
				break;
			case 2:
				score = "Thirty";
				break;
			case 3:
				score = "Forty";
				break;
			default:
				break;
			}
		}
		return score;
	}

	public String setScore(String caseType) {
		
		String score = "";
		if (caseType.equals("Normal")) {
			String scoreA = setPersonScore(firstPerson);
			String scoreB = setPersonScore(secondPerson);
			if (scoreA.equals(scoreB)) {
				score = scoreA + "-All";
			} else {
				score = scoreA + "-" + scoreB;
			}
		} else if (caseType.equals("WinOrAdvantage")) {
			if (countPlayerA - countPlayerB >= 2) {
				score = "Win for " + firstPerson;
			} else if (countPlayerB - countPlayerA >= 2) {
				score = "Win for " + secondPerson;
			} else if (countPlayerA - countPlayerB == 1) {
				score = "Advantage " + firstPerson;
			} else if (countPlayerB - countPlayerA == 1) {
				score = "Advantage " + secondPerson;
			}
		}
		return score;
	}

	public String getScore() {
		
		String resultFinal = "";
		if (isLoveAll()) {
			resultFinal = "Love-All";
		} else if (isDuece()) {
			resultFinal = "Deuce";
		} else if (isNormal()) {
			resultFinal = setScore("Normal");
		} else if (isWinOrAdvantage()) {
			resultFinal = setScore("WinOrAdvantage");
		}
		return resultFinal;
	}

}
