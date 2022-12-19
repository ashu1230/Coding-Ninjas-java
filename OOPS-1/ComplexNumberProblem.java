public class ComplexNumbers {
	// Complete this class
    public int real;
    public int imaginary;
    
    public ComplexNumbers(int real,int imaginary)
    {
        this.real=real;
        this.imaginary = imaginary; 
    }
    
    public  void plus(ComplexNumbers c2)
    {
        this.real = c2.real + this.real;
        this.imaginary = c2.imaginary + this.imaginary;
        
    }
    
    public void multiply(ComplexNumbers c2)
    {	int temp = this.real;
        this.real = (this.real*c2.real) - (this.imaginary*c2.imaginary);
        this.imaginary = (this.imaginary*c2.real) +(temp*c2.imaginary);
    }
    
    public void print()
    {
        System.out.print(real+" "+"+"+" "+"i"+imaginary);
    }
	
}
