public class Car {
    private String Make, Model, Color;
    private int Year;
    private static int count = 0;

    Car (String make, String model, String color, int year){
        Make = make;
        Model = model; 
        Color = color;
        Year = year;
        
        count++;
    }
    public int carAge(){
        int age = (2022 - get_year());
        return age;
    }
    public boolean isAntique(){
        if (carAge() >= 45){
            return true;
        }
        else 
            return false;
    }

    public String toString(){
        String result;

        result = Year + " " + Make + " " + Model + "\n";
        result += "Color: " + Color + "\n";
        if (isAntique() == true){
            result += "This car is an antique, \n";
            result += "the car is " + carAge() + " years old! \n";
        }

        return result;
         
    }


    public static int getCount(){
        return count;
    }
    public String get_make(){
        return Make;
    }
    public String get_model(){
        return Model;
    }
    public String get_color(){
        return Color;
    }
    public int get_year(){
        return Year; 
    }
}
