/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad3;

/**
 *
 * @author SENA
 */
public class Ingreso extends Mbancario {
    private double Tipoingreso;
    private String Descripcion;
    private Local local1;
     private Piso piso1;

    public void setTipoingreso(double TipoingresoP) {
        this.Tipoingreso = TipoingresoP;
    }

    public double getTipoingreso() {
        return this.Tipoingreso;
    }
      public void setDescripcion(String descripcionP) {
        this.Descripcion = descripcionP;
    }

    public String getDescripcion() {
        return this.Descripcion;
    }
    
         
    public void setLocal1(Local local1P)
    {
      this.local1=local1P;
    }
    public Local getLocal1(){
        return local1;
    }
    
        
    public void setPiso1(Piso piso1P)
    {
      this.piso1=piso1P;
    }
    public Piso getPiso1(){
        return piso1;
    }
}
