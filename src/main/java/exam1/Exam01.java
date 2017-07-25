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

		}
		return score;
	}

	public String getScore() {
		String resultA = "";
		String resultB = "";
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

		// String resultA = "";
		// String resultB = "";
		// String resultFinal = "";

		// if (countPlayerA == 0 && countPlayerB == 0) {
		// resultFinal = "Love-All";
		// }
		//
		// if (countPlayerA == 0) {
		// resultA = "Love";
		// } else if (countPlayerA == 1) {
		// resultA = "Fifteen";
		// } else if (countPlayerA == 2) {
		// resultA = "Thirty";
		// } else if (countPlayerA == 3) {
		// resultA = "Forty";
		// }
		//
		// if (countPlayerB == 0) {
		// resultB = "Love";
		// } else if (countPlayerB == 1) {
		// resultB = "Fifteen";
		// } else if (countPlayerB == 2) {
		// resultB = "Thirty";
		// } else if (countPlayerB == 3) {
		// resultB = "Forty";
		// }
		//
		// if (countPlayerA == countPlayerB && countPlayerA >= 3 && countPlayerA <= 4) {
		// resultFinal = "Deuce";
		// } else if (countPlayerA == countPlayerB) {
		// resultFinal = resultA + "-" + "All";
		// } else if (countPlayerA <= 3 && countPlayerB <= 3) {
		// resultFinal = resultA + "-" + resultB;
		// } else if (countPlayerA >= 4 || countPlayerB >= 4) {
		// if (countPlayerA - countPlayerB >= 2) {
		// resultFinal = "Win for " + firstPerson;
		// } else if (countPlayerB - countPlayerA >= 2) {
		// resultFinal = "Win for " + secondPerson;
		// } else if (countPlayerA - countPlayerB == 1) {
		// resultFinal = "Advantage " + firstPerson;
		// } else if (countPlayerB - countPlayerA == 1) {
		// resultFinal = "Advantage " + secondPerson;
		// }
		// }

		return resultFinal;
	}

}
