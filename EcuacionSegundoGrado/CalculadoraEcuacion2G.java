import java.util.Scanner;

public class CalculadoraEcuacion2G
{
    private NumeroComplejo raiz1;
    private NumeroComplejo raiz2;
    private PolinomioSegundoGrado poli;
    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args)
    {
	CalculadoraEcuacion2G cal = new CalculadoraEcuacion2G();

	cal.getCoeficientes();
	cal.calcularSolucionGeneral();
    }
    
    public CalculadoraEcuacion2G()
    {
	raiz1 = new NumeroComplejo();
	raiz2 = new NumeroComplejo();
	poli = new PolinomioSegundoGrado();
    }
    
    public void getCoeficientes()
    {
	System.out.print("Introduce A: ");
	poli.setA(teclado.nextDouble());
	System.out.print("Introduce B: ");
	poli.setB(teclado.nextDouble());
	System.out.print("Introduce C: ");
	poli.setC(teclado.nextDouble());
    }

    public void calcularSolucionGeneral()
    {
	//Calcula la solcion de una ecuacion de segudno grado cuando esta igualada a
	//cero. La solución dependiendo del signo del discriminate puede ser un
	//número complejo con parte real, imaginaria o ambas.
		
	double discriminante;

	discriminante = Math.pow(poli.getB(), 2) - 4 * poli.getA() * poli.getC();

	if(NumeroComplejo.esCero(discriminante))//Si el discriminante es cero se trata de un numero real
	{
	    //Ambas raices son el mismo numero real x = -b/(2a)
	    double real;
	    
	    real = -poli.getB() / (2 * poli.getA());

	    raiz1.setReal(real);
	    System.out.println(raiz1);
	}
	else
	{
	    if(NumeroComplejo.esMayorCero(discriminante))//Si es mayor a cero son dos raices reales y distintas
	    {
		double real1, real2;

		real1 = (-poli.getB() + Math.sqrt(discriminante)) / (2 * poli.getA());
		raiz1.setReal(real1);

		real2 = (-poli.getB() - Math.sqrt(discriminante)) / (2 * poli.getA());
		raiz2.setReal(real2);
	    }
	    else//Si es menor a cero entonces se trata de un numero complejo
	    {
		double real;
		double imag;
		double denominador;
		denominador = 2 * poli.getA();
		real = -poli.getB() / denominador;
		imag = Math.sqrt(-discriminante) / denominador;

		raiz1.setReal(real);
		raiz1.setImag(imag);

		raiz2.setReal(real);
		raiz2.setImag(-imag);    
	   } 
	        System.out.println(raiz1);
	     	System.out.println(raiz2);
	}	
    }

}
