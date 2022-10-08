public class Test
{
    public static void main(String[] args)
    {
	Factorial f1 = new Factorial(10);
	for(int i = 0; i < 20; i ++)
	{
	    f1.setN(i);
	    System.out.println(f1.getN() + "! = " + f1.getFactorial());
	}
    }
}
