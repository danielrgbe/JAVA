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
    
    public Jugador()
    { 
    nombre = "";
    fichaJugador=new Ficha();
    
    //eleccion = Ficha.DEFAULT;
    
    }
    public Jugador( String nom, String tipoFicha) 
    {
        
        nombre=nom;
        fichaJugador= new Ficha(tipoFicha);   
        
    }
   
        
    public Ficha obtenerFichaJugador(){
    return fichaJugador;
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
    
    
    
}
