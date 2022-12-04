import java.util.ArrayList;

public class Score {
    private ArrayList<Integer> scores = new ArrayList<Integer>();
    private String playerName;

    public Score(String playerName) {
        this.playerName = playerName;
    }

    void addIndividualScore(int score) {
        scores.add(score);
    }

    float scoreMean() {
        int sum = 0;
        for (int score : scores) {
            sum += score;
        }

        return sum / (float) scores.size();
    }

    int[] getMinMax() {
        int min = scores.get(0);
        int max = scores.get(0);

        for (int score : scores) {
            if (min < score) {
                min = score;
            }
            if (max > score) {
                max = score;
            }
        }
        return new int[] { min, max };
    }

    void showFinalResult() {
        int[] minmax = getMinMax();

        System.out.println("Player : " + playerName);
        System.out.println("Mean Score : " + scoreMean());
        System.out.println("Min : " + minmax[0] + ", Max : " + minmax[1]);
        System.out.println("");
    }

    public static void main(String[] args) {
        Score s1 = new Score("Szymon");
        s1.addIndividualScore(4);
        s1.addIndividualScore(3);
        s1.addIndividualScore(3);
        s1.addIndividualScore(1);
        s1.addIndividualScore(5);
        s1.showFinalResult();

        Score s2 = new Score("Jakub");
        s2.addIndividualScore(4);
        s2.addIndividualScore(3);
        s2.addIndividualScore(3);
        s2.addIndividualScore(1);
        s2.addIndividualScore(5);
        s2.showFinalResult();

        Score s3 = new Score("Andrzej");
        s3.addIndividualScore(4);
        s3.addIndividualScore(3);
        s3.addIndividualScore(3);
        s3.addIndividualScore(1);
        s3.addIndividualScore(5);
        s3.showFinalResult();
    }
}
