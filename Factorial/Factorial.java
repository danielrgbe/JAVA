
//imports
public class Factorial
{
    //fields
    private long n;
    private long fact;

    public Factorial(long n)
    {
	//default constructor
	this.n = n;
    }
   
    public Factorial()
    {
	this(0);
    }
    public long recursivamente(long n)
    {
	if(n >= 0)//Si el valor buscado es mayor o igual que cero
	{
	    if(n == 1 || n == 0)
	        return 1;
	    else
		return n * recursivamente(n-1);
	}
	else
	{
	    System.out.println("Undefined");
	    return -1;
	}
    }
    
    public void calcularRecursivamente()
    {
	fact = recursivamente(n);
    }

    public void setN(long n)
    {
	this.n = n;
    }

    public long getN()
    {
	return n;
    }
    
    public long getFactorial()
    {
	calcularRecursivamente();
	return fact;
    }
}
