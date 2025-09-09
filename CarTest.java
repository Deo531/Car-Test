public class CarTest {
    public static void main(String[] args) {
        System.out.println("------------------------------");
        Car car1 = new Car();
        car1.CarInformation();
        System.out.println("------------------------------");
        Car car2 = new Car( 4, false);
        car2.CarInformation();
        System.out.println("------------------------------");
        Car car3 = new Car( 2, true);
        car3.CarInformation();
        System.out.println("------------------------------");
        Car car4 = new Car( 8, true);
        car4.CarInformation();
        System.out.println("------------------------------");
        Car car5 = new Car( 6, false);
        car5.CarInformation();
    }
}