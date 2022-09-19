 abstract class Vehicle{
    public abstract void  fuelType();
}
 class honda extends Vehicle{
    public void fuelType(){
      System.out.println("Honda accord car runs on fuel  type called Diesel");
    }
    public void madein(){
        System.out.println("Honda accord is made in India");
    }
}

 class ducati extends Vehicle{
    public void fuelType(){
        System.out.println("Ducati runs on fuel type called Petrol");
    }
    public void importance(){
        System.out.println("Ducati is used and important vehicle");
    } 
}
public class solution{
    public static void main(String[] args) {
        honda v1=new honda();
        ducati v2=new ducati();
        v1.fuelType();
        v1.madein();
        v2.fuelType();
        v2.importance();
        
    }
}
