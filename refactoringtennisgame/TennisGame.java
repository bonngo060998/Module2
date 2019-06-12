package refactoringtennisgame;

public class TennisGame {
    public static String getScore(String firstPlayer, String secondPlayer, int scoreFirstPlayer, int scoreSecondPlayer) {
        String score = "";
        int tempScore = 0;
        boolean compare = scoreFirstPlayer == scoreSecondPlayer;
        if (compare) {
            score = getString (scoreFirstPlayer);
        } else if (scoreFirstPlayer >= 4 || scoreSecondPlayer >= 4) {
            score = getStringScore (scoreFirstPlayer, scoreSecondPlayer);
        } else {
            score = getScore (scoreFirstPlayer, scoreSecondPlayer, score);
        }
        return score;
    }

    private static String getScore(int scorePlayer1, int scorePlayer2, String score) {
        int tempScore;
        for (int i = 1; i < 3; i++) {
            if (i == 1) tempScore = scorePlayer1;
            else {
                score += "-";
                tempScore = scorePlayer2;
            }
            switch (tempScore) {
                case 0:
                    score += "Love";
                    break;
                case 1:
                    score += "Fifteen";
                    break;
                case 2:
                    score += "Thirty";
                    break;
                case 3:
                    score += "Forty";
                    break;
            }
        }
        return score;
    }

    private static String getStringScore(int scorePlayer1, int scorePlayer2) {
        String score;
        int minusResult = scorePlayer1 - scorePlayer2;
        if (minusResult == 1) score = "Advantage player1";
        else if (minusResult == -1) score = "Advantage player2";
        else if (minusResult >= 2) score = "Win for player1";
        else score = "Win for player2";
        return score;
    }

    private static String getString(int scorePlayer1) {
        String score;
        switch (scorePlayer1) {
            case 0:
                score = "Love-All";
                break;
            case 1:
                score = "Fifteen-All";
                break;
            case 2:
                score = "Thirty-All";
                break;
            case 3:
                score = "Forty-All";
                break;
            default:
                score = "Deuce";
                break;

        }
        return score;
    }
}
