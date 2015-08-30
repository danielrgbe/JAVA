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

public  class  Ficha{
    
    private String tipoDeFicha;    
    private int poscX=0,poscY=0;

    public Ficha()
    {
    
        tipoDeFicha="vacio";   
        this.poscX=0;
        this.poscY=0;
    
    }
    public Ficha(String tipo)
    {
    
        tipoDeFicha=tipo;
    
    }
    
    public void establecerTipoDeFicha(String tipo){
        tipoDeFicha=tipo;
    
    
    }
    public String obtenerTipoDeFicha(){
        return tipoDeFicha;
    
    
    }
    
    
     public void establecerX(int x){
       this.poscX=x;
         
    }
     public void establecerY(int y){
       this.poscY=y;
         
    }
    
    public int obtenerX(){
        return poscX;
         
    }

    public int obtenerY(){
        return poscY;
         
    }
    
    @Override
    public String toString(){
    return String.format("%s%s","Tipo de ficha: ",tipoDeFicha);
    }






}




