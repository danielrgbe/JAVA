/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gato;
/**
 * 
 * @author Oakape
 */
public class Jugador 
{
    //public Ficha eleccion;
    private final String nombre;
    private final Ficha fichaJugador;
 //  private String estado;
    public enum estados{gano,perdio,empato}
    public estados est;
    public Jugador()
    { 
    nombre = "";
    fichaJugador=new Ficha();
    //est=estados.empatado;
    //eleccion = Ficha.DEFAULT;
    
    }
    public Jugador( String nom, String tipoFicha) 
    {
        
        nombre=nom;
        fichaJugador= new Ficha(tipoFicha);
        est=estados.perdio;
    }
   
        
    public Ficha obtenerFichaJugador(){
    return fichaJugador;
    }
    public void establecerEstado(String est){
       // estado=est;
    }
    
    public String conseguirDatosJugador(){
        
    return conseguirNombre()+"  "+conseguirTipoFicha();// conseguirNombre() +"  "+ conseguirFicha()+"  "+eleccion.obtEstado();
      
    
    
    }
    
    
    public String conseguirNombre(){
    return nombre;
    }
    public String conseguirTipoFicha(){
    return fichaJugador.obtenerTipoDeFicha();//eleccion.toString();
    }  
    
    @Override
    public String toString(){
        
        switch(est){
            
            case perdio:
                System.out.print("Perdio");
                break;
             case gano:
                System.out.print("Gano");
                break;   
                 case empato:
                System.out.print("Empato");
                break;
        
        
        }
        return String.format("\n%s %s\n%s","Nombre de jugador: ",
                nombre,fichaJugador.toString());
        
    
    }
    
    
}
