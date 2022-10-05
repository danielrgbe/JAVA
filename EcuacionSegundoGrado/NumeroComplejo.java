public class NumeroComplejo
{
    private static final double DELTA = 1e-12;
    private double real;
    private double imag;

    public NumeroComplejo(double real, double imag)
    {
	this.real = real;
	this.imag = imag;
    }

    public NumeroComplejo()
    {
	this(0.0d, 0.0d);
    }
    
    public void setReal(double k)
    {
	real = k;
    }

    public double getReal()
    {
	return real;
    }

    public void setImag(double l)
    {
	imag = l;
    }

    public double getImag()
    {
	return imag;
    }

    public static boolean esCero(double numero)
    {
	return numero < DELTA & numero > -DELTA;
    }

    public static boolean esMayorCero(double numero)
    {
	return numero > DELTA;
    }

    @Override
    public String toString()
    {
	StringBuilder ncSB = new StringBuilder();
	
	if(!esCero(real))//Si la parte real es distinta de cero 
	    if(real > DELTA)//Si también es mayor que cero
		ncSB.append(real);
	    else//Si es menor que cero
	    {
		ncSB.append(" - ");
		ncSB.append(Math.abs(real));
	    }    
	if(!esCero(imag))//Si la parte imag es distinta de cero 
	    if(imag > DELTA)//Si también es mayor que cero
	    {
		//Puede suceder que la parte real sea cero y el signo de + sera
		//inneceasrio entonces habra que comprobar esto.
		if(!esCero(real))
		    ncSB.append(" + ");//El signo que concatena la parte real con la imaginaria
		ncSB.append(imag);
		ncSB.append("i");
	    }
	    else//Si es menor que cero
	    {
		ncSB.append(" - ");
		ncSB.append(Math.abs(imag));
		ncSB.append("i");
	    }   
	if(esCero(real) && esCero(imag))//Si ambas partes, real e imaginaria, son cero
	    ncSB.append("Cero");
	return ncSB.toString();
    }
}
