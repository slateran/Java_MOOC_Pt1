import java.util.Random;

public class NightSky {

    private double density;
    private int width;
    private int height;
    private int starsInLastPrint;


    public NightSky(double density) {
        this.density = density;
        this.width = 20;
        this.height = 10;
    }

    public NightSky(int width, int height) {

        this.density = 0.1;
        this.width = width;
        this.height = height;

    }

    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;

    }

    public void printLine() {

        Random ran = new Random();



        for (int i = 0; i < width; i++) {

            double r = ran.nextDouble();
            if (r <= density) {
                System.out.print("*");
                starsInLastPrint++;
            } else {
                System.out.print(" ");
            }

        }

    }

    public void print() {
        this.starsInLastPrint = 0;

        for (int i = 0; i < height; i++) {
            printLine();
            System.out.println();
        }

    }

    public int starsInLastPrint() {
        return starsInLastPrint;

    }


}
