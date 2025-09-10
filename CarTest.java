public class CarTest {
    public static void main(String[] args) {
        System.out.println("------------------------------");
        Car car1 = new Car();
        car1.CarInformation();
        System.out.println("------------------------------");
        Car car2 = new Car(6, true);
        car2.CarInformation();
        System.out.println("------------------------------");
        Car car3 = new Car();
        car3.setMerk(2);
        car3.setIsElectric(false);
        car3.CarInformation();
        System.out.println("------------------------------");
    
    }
}