public class Car{
    String color;
    String model;
    String brand;
    Car(String color, String model , String brand){
        this.color = color;
        this.model = model;
        this.brand = brand;

    }
void Startengine(){
    System.out.println("Working");
}
void Stopengine(){
    System.out.println("Stopped");
}
void display(){
    System.out.println( model + " " + brand +" " + color );
}
    public static void main(String[] args){
        Car myCar = new Car("Red", "Mustang", "Ford");
        // myCar.Startengine();
        // myCar.Stopengine();
        myCar.display();

    }
}