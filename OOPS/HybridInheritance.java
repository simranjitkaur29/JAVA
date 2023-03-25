class Bike
{
    public void Petrol()
    {
        System.out.println("It is  petrol vehicle");

    
    }
    
    public void wheels()
    {
        System.out.println("It has two wheels ");
    }
 
}
class Car extends Bike
{
    public void color()
    {
        System.out.println("Color is white");

    }
    @Override
    public void wheels()
    {
        System.out.println("It has four wheels");

    }
    public void seatbelt()
    {
        System.out.println("Cars has seat belt");
    }


}
class MarutiSuzuki extends Car
{
    public void Blutooth()
    {
        System.out.println("Blutooth is available in car");
    }
    public void Mileage()
    {
        System.out.println("Maruti Suzuki cars  has apprx. 27 km/l best mileage ever");
    }
    public void Airbags()
    {
        System.out.println("Maruti suzuki cars has air bags for safty");

    }
    public void AirConditioner()
    {
        System.out.println("facility of air conditioner is also present");
    }
    public void SeatingCapacity()
    {
        System.out.println("Only Five Seated");

    }



}
class  SwiftDezire extends MarutiSuzuki
{
public void mileage()
{
    System.out.println("Swift Dzire has 23-31 km/l mileage");

}
public void gear()
{
    System.out.println("Swift dzire has 5 gears");
}
public void bodyType()
{
    System.out.println("swiftDezire body type is like 'SEDAN' ");
}

}
class Breeza extends MarutiSuzuki
{
    public void gear()
    {
        System.out.println("Breeza has 6 gears");

    }
    public void bodyType()
    {
        System.out.println("Breeza body is like 'XUV'");
    }


}
public class HybridInheritance{
public static void main(String args[])
{

    Bike bike=new Bike();
    bike.Petrol();
    Breeza breeza=new Breeza();
    breeza.AirConditioner();
    breeza.gear();
    breeza.Mileage();
}

}