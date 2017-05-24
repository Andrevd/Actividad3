/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author sena
 */
public class Piso  implements Inmueble{
    private String direccion;
   private int numero;
   private String codigo_postal;
   
   public void setDireccion(String direccionP){
       this.direccion= direccionP;
   }
   public String getDireccion(){
       return this.direccion;
       
   }
   
  public void setNumero(int numeroP){
       this.numero= numeroP;
   }
   public int getNumero(){
       return this.numero;
       
   } 
   
   public void setCodigo_Postal(String codigo_postalP){
       this.codigo_postal= codigo_postalP;
   }
   public String getcodigo_postal(){
       return this.codigo_postal;
       
   }

    @Override
    public void dar_baja() {
    }

    @Override
    public void modificar() {
    }

    @Override
    public void consultar() {
    }

    @Override
    public void ingresar() {
       
    }
public void nuevoP(){}
}
