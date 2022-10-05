public class Test
{
    public static void main(String[] args)
    {
	PolinomioSegundoGrado p1 = new PolinomioSegundoGrado(1,3,5);

	System.out.println(p1);

	p1.setA(32.1);
	p1.setC(1.5);
	System.out.println(p1);
    }
}
