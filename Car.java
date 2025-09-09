public class Car {
    int numDoors;
    boolean isElectric;

    public Car(){
        numDoors = 4;
        isElectric = false;
        }
    public Car(int numDoors, boolean isElectric){
        this.numDoors = numDoors;
        this.isElectric = isElectric;
    }
    public void CarInformation(){
        System.out.println("Berapa jumlah pintu mobil? : "+numDoors);
        System.out.println("Apakah mobil listrik? : "+isElectric);
    }
}
