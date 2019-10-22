
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }


    public boolean larger(Apartment apartment) {

        if (this.squareMeters > apartment.squareMeters) {
            return true;
        }
        return false;
    }

    public int priceDifference(Apartment otherApartment) {


        int appA = Math.abs(this.squareMeters * pricePerSquareMeter);
        int appB = Math.abs(otherApartment.squareMeters * otherApartment.pricePerSquareMeter);

        if (appA > appB) {
            return Math.abs(appA - appB);
        } else {
            return Math.abs(appB - appA);
        }


    }

    public boolean moreExpensiveThan(Apartment otherApartment) {
        int appA = Math.abs(this.squareMeters * pricePerSquareMeter);
        int appB = Math.abs(otherApartment.squareMeters * otherApartment.pricePerSquareMeter);

        if (appA > appB) {
            return true;
        } else {
            return false;
        }

    }

}
