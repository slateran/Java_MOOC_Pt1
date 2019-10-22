import java.util.Scanner;

public class Calculate {

    Grades grades = new Grades();
    Scanner lukija = new Scanner(System.in);

    private int score;
    private int five = 0;
    private int four = 0;
    private int three = 0;
    private int two = 0;
    private int one = 0;
    private int zero = 0;

    private int total;
    private int totalAccepted;

    public void total() {
        this.total = five + four + three + two + one + zero;
        this.totalAccepted = five + four + three + two + one;
    }

    public void distribution() {
        System.out.println("Type exam scores, -1 completes: ");


        while (true) {
            score = lukija.nextInt();

            if (score == -1) {
                break;
            }

            if (score >= 0 && score <= 60) {
                if (score <= 29) {
                    zero++;
                } else if (score >= 30 && score <= 34) {
                    one++;
                } else if (score >= 35 && score <= 39) {
                    two++;
                } else if (score >= 40 && score <= 44) {
                    three++;
                } else if (score >= 45 && score <= 49) {
                    four++;
                } else if (score >= 50 && score <= 60) {
                    five++;
                } else if (score < 0 && score > 60) {
                    //do nothing
                }
            }
        }
        total();
    }

    public void print() {

        System.out.println("Grade distribution");
        System.out.println("5: " + grades.getGrade(five));
        System.out.println("4: " + grades.getGrade(four));
        System.out.println("3: " + grades.getGrade(three));
        System.out.println("2: " + grades.getGrade(two));
        System.out.println("1: " + grades.getGrade(one));
        System.out.println("0: " + grades.getGrade(zero));
        System.out.println("Acceptance percentage: " + grades.acceptance(totalAccepted, total));
    }


}
