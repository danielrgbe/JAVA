package gato;
import java.util.Scanner;
//import java.util.Random;
/**
 *
 * @author Oakape
 */
public class Gato 
{
    
    private final Scanner posc = new Scanner(System.in);
  //  private int numeroMov=0;
    //private final Random pJ= new Random();
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
            int x,y;
            System.out.println("Elija la pocicion de su ficha: ");
            x=posc.nextInt();
            y=posc.nextInt();
            nuevoTablero.colocarFicha(1,x,y);    
            nuevoTablero.imprimirEstadoDeJuego(); 
            if(nuevoTablero.juegoTerminado() )
            {
                
                continue;
                
            }
            
            System.out.println("Elija la pocicion de su ficha: ");
            x=posc.nextInt();
            y=posc.nextInt();
            nuevoTablero.colocarFicha(2,x,y);
            nuevoTablero.imprimirEstadoDeJuego();    
            
        }
         
         nuevoTablero.obtenerEstadoJugadores();
        
        
            cont++;
            System.out.printf("Juego numero:%d \n\n\n\n\n\n\n\n\n\nDesea volver a jugar (si) o (no):",cont);
            resp=posc.next();
            nuevoTablero= new Tablero();
        } while (resp.equals("si"));
    
    
    }
}
