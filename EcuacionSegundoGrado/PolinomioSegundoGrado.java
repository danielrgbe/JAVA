// Fecha de inicio:5/sep/22
// Este clase representara un polinomio de segundo grado de la forma ax^2+bx+c
// donde a, b y c pueden ser números realess

public class PolinomioSegundoGrado
{
    private double a;
    private double b;
    private double c;
    private char var;

    public PolinomioSegundoGrado(double a, double b, double c, char var)
    {
	this.a = a;
	this.b = b;
	this.c = c;
	this.var = var;
    }
    
    public PolinomioSegundoGrado(double a, double b, double c)
    {
	this.a = a;
	this.b = b;
	this.c = c;
	var = 'x';
    }
    
    public PolinomioSegundoGrado()
    {
	this(0,0,0);
    }

    public double getA()
    {
	return a;
    }

    public void setA(double a)
    {
	this.a = a;
    } 

    public double getB()
    {
	return b;
    }

    public void setB(double b)
    {
	this.b = b;
    } 
    
    public double getC()
    {
	return c;
    }

    public void setC(double c)
    {
	this.c = c;
    }

    @Override
    public String toString()
    {
	StringBuilder poliSB = new StringBuilder();
	
	poliSB.append(a);
	poliSB.append(String.valueOf(var));
	poliSB.append("^2");
	
	poliSB.append(" + ");

	poliSB.append(b);
	poliSB.append(String.valueOf(var));
	
	poliSB.append(" + ");

	poliSB.append(c);

	return poliSB.toString();
    }
}
