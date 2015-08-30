package gato;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Oakape
 */
public class Gato 
{
    
    private final Scanner posc = new Scanner(System.in);
    private int numeroMov=0;
    private final Random pJ= new Random();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        
        Gato juegoNuevo = new Gato();
        juegoNuevo.iniciarJuego();
        
    }

    public void iniciarJuego()
    {  
      
    System.out.println("Bienvenido al juego Gato\n"+"Elaborado por OakMonkeyExpress\n"+"Version : 1.0");
    int cont = 0;
    String resp; 
    Tablero nuevoTablero=new Tablero();
           
    
   
   
    
    do {
    
    nuevoTablero.obtenerDatosJugadores();
        
         while (!nuevoTablero.juegoTerminado())
        {
            //int x,y;
            System.out.println("Elija la pocicion de su ficha: ");
            //x=posc.nextInt();
            //y=posc.nextInt();
            nuevoTablero.colocarFicha(1,pJ.nextInt(3),pJ.nextInt(3));    
            nuevoTablero.imprimirEstadoDeJuego(); 
            numeroMov++;
            
            if( numeroMov == 9 || nuevoTablero.juegoTerminado() )
            {
                numeroMov=0;
                continue;
                
            }
            
            System.out.println("Elija la pocicion de su ficha: ");
           // x=posc.nextInt();
           // y=posc.nextInt();
            nuevoTablero.colocarFicha(2,pJ.nextInt(3),pJ.nextInt(3));
            numeroMov++;
            nuevoTablero.imprimirEstadoDeJuego();    
            
        }
         
         System.out.println("El ganador de la partida es: " + nuevoTablero.obtenerGanador());
        
        
            cont++;
            System.out.printf("Juego numero:%d Desea volver a jugar\n\n\n\n\n\n\n\n\n\n",cont);
            //resp=posc.next();
            nuevoTablero= new Tablero();
        } while (cont<5);
    
    
    }
}
