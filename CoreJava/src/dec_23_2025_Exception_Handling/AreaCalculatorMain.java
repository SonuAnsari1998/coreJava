package dec_23_2025_Exception_Handling;

public class AreaCalculatorMain{
    void main(){
    	
    double length=Integer.parseInt(IO.readln("Enter length of rectangle:"));
    double width=Integer.parseInt(IO.readln("Enter width of rectangle:"));
    try{
    IO.println("Area of rectangle with length "+length+" and width "+width+" is: "+AreaCalculator.calculateArea(length,width));
    }
    catch(IllegalArgumentException e){
        IO.println(e.getMessage());
    }
    }
}
