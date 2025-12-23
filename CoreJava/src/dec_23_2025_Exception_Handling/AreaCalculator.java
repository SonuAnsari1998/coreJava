package dec_23_2025_Exception_Handling;

class AreaCalculator{
    public static double calculateArea(double length, double width)
    {
        if(length<=0 || width<=0){
            throw new IllegalArgumentException("Error: Length and width must be > 0.");
        }
        return length*width;
    }
}

