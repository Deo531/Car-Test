public class Car {
    //Property Class
    private int numDoors;
    private boolean isElectric;
    //constructor default
    public Car(){
        numDoors = 4;
        isElectric = false;
        }
    //constructor DParameter
    public Car(int numDoors, boolean isElectric){
        this.numDoors = numDoors;
        this.isElectric = isElectric;
    }
    //getter --> Mengambil nilai
    public int getNumdoor(){
        return numDoors;
    }
    public boolean getIsElectric(){
        return isElectric;
    }
    //setter -- > Merubah Nilai
    public void setMerk(int numDoors){
        this.numDoors = numDoors;
    }
    public void setIsElectric(boolean isElectric){
        this.isElectric = isElectric;
    }
    //method
    public void CarInformation(){
        System.out.println("Berapa jumlah pintu mobil? : " + numDoors);
        System.out.println("Apakah mobil listrik? : " + isElectric);
    }
}
