/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gato;

import java.util.Scanner;
/**
 * 
 * @author Juan
 */
public class Tablero {
private Jugador jugador1,jugador2;
private Ficha fichasJuego[][] = new Ficha[3][3];
private Scanner eleccion = new Scanner(System.in) ;





    public Tablero(){
    System.out.println("Todo esta correcto!!!");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                fichasJuego [i][j]= new Ficha();
            }
        }
    
    }
    
    
    public void obtenerDatosJugadores(){
    //jugador1=datosJugador();
    //jugador2=datosJugador();
    jugador1=new Jugador("fernando","x");
    jugador2=new Jugador("daniel","o");
    
    
    }
    
    public Jugador  datosJugador(){
        
    String nombre,ficha;
    System.out.print("Intruduzca su nombre: ");
    nombre="Daniel";//eleccion.nextLine();
    System.out.println("Elija ficha de jugador \"x\" u \"o\"");
    ficha=eleccion.nextLine();
    Jugador jugador=new Jugador(nombre,ficha);
    return jugador;    
    
    }
    
     public void colocarFicha(int jugador,int x, int y){
        if(jugador==1){
            fichasJuego[x][y]=jugador1.obtenerFichaJugador();
        }
        if (jugador==2){
           fichasJuego[x][y]=jugador2.obtenerFichaJugador();
        }
   // fichaJugador.establecerX(x);
   // fichaJugador.establecerY(y);
    }
        
    
    
    
    
    public void imprimirEstadoDeJuego()
    {
    
    System.out.println("Espacio de verificacion");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.printf("%s\t|",fichasJuego[i][j].obtenerTipoDeFicha());
                 
            }
            
            System.out.print("\n-------------------------\n");
        }
    
    }
     public boolean juegoTerminado(){
        
    boolean condicion1=verificarFilas();    
    boolean condicion2=verificarColumnas();
    boolean condicion3=verificarDiagonales();   
        
        
    return condicion1 || condicion2 || condicion3;
         
    }
     
    
     public boolean verificarFilas(/*String elec*/){
         int cont1=0,cont2=0;
         for (int i = 0; i < 3; i++) 
         {
             for (int j = 0; j < 3; j++) 
             {
                 if(fichasJuego[i][j].obtenerTipoDeFicha().toString().equals("x"))
                 {
                     cont1++;
                 }
                 if(fichasJuego[i][j].obtenerTipoDeFicha().toString().equals("o")) 
                 {
                     cont2++;
                 }
             }
             if(cont2==3 || cont1==3)
             {
    return true;
             }
             else
             {
                 cont2=0;
                 cont1=0;
             }
         }
    return false;
    
             /*int fil=0,col=0;
         
         for ( int i= 0; i < 3; i++){
             for (int   j = 0; j <3; j++) {
                 if(fichasJuego[fil][col].obtenerTipoDeFicha().toString().equals("x")){  
                     cont1++; 
                 }  
                 if(fichasJuego[fil][col].obtenerTipoDeFicha().toString().equals("o")){
                     cont2++;
                 }
                 if(elec.toString().equals("fila")){
                     col++;
                 }
                 else{
                     fil++;
                 }
             }
             if(elec.toString().equals("fila")){
                fil++;
                col=0;
             }
             else{
                 col++;
                 fil=0;
             }
             if(cont2==3 || cont1==3){
                 return true;
             }
             else{
                 cont2=0;
                 cont1=0;}
         }*/
         
    }
    public boolean verificarColumnas(){
        int cont1=0,cont2=0;
         for (int i = 0; i < 3; i++) {
             for (int j = 0; j < 3; j++) {
                 if(fichasJuego[j][i].obtenerTipoDeFicha().toString().equals("x")){
                 cont1++;
                 }
                 if(fichasJuego[j][i].obtenerTipoDeFicha().toString().equals("o")){
                 cont2++;
                 }
             }
             if(cont2==3 || cont1==3)
             {
             return true;
             
             }
             else{cont2=0;
             cont1=0;}
         }
         
        
    
    return false;
    
    
    }
    
    public boolean verificarDiagonales(){
        int cont1=0,cont2=0,cont3=0,cont4=0;
        for (int i = 0; i < 3; i++) 
        {
            if(fichasJuego[i][i].obtenerTipoDeFicha().toString().equals("x")){
                cont1++;
            }
            if(fichasJuego[i][i].obtenerTipoDeFicha().toString().equals("o")){
                cont2++;
            }
        }
        
        for (int i = 0; i < 3; i++) 
        {
            if(fichasJuego[2-i][i].obtenerTipoDeFicha().toString().equals("x")){
                cont3++;
            }
            if(fichasJuego[2-i][i].obtenerTipoDeFicha().toString().equals("o")){
                cont4++;
            }
        }
        
 
            
        
    
    return cont1==3||cont2==3||cont3==3||cont4==3;
    }
    
    
    
    
}
