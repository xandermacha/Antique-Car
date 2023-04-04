
public class CarApp {
    public static void main(String[] args) {
        Car Mike = new Car("Audi", "A4","Black", 2010);
        Car beedu = new Car("Audi", "100 GT Coupe", "Matte Black", 1971);
        Car nat = new Car("Toyota", "Camary", "Green", 2011);
        Car zoug = new Car("Chevy", "Suburban", "White", 2015);
        Car Yan = new Car("Ford", "flex", "silver", 2009);
        
        
        System.out.println(Mike);
        System.out.println(beedu);
        System.out.println(nat);
        System.out.println(zoug);
        System.out.println(Yan);


        System.out.println("beedu's car was made in " + beedu.get_year());
        System.out.println("mike owns 1 " + Mike.get_make());
        System.out.println("nat has a " + nat.get_color() + " " + nat.get_model());

        System.out.println("....................");

        System.out.println("nunber of cars objects " + Car.getCount());
        

    }

}
