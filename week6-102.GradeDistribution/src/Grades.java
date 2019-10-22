public class Grades {


    public String getGrade(int count) {
        String stars = "";
        for (int i = 0; i < count; i++) {
            stars = stars + "*";
        }
        return stars;
    }

    public double acceptance(double totalAccepted, double total) {
        return (double) 100 * totalAccepted / total;
    }


}
