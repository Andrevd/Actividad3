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
public class Gasto extends Mbancario {
    private double Tipogasto;
    private String Descripcion;
     private Inmueble inm1;
         
    public void setInm1(Inmueble inm1P)
    {
      this.inm1=inm1P;
    }
    public Inmueble getInm1(){
        return inm1;
    }

    public void setTipogasto(double TipogastoP) {
        this.Tipogasto = TipogastoP;
    }

    public double getTipogasto() {
        return this.Tipogasto;
    }

    public void setDescripcion(String descripcionP) {
        this.Descripcion = descripcionP;
    }

    public String getDescripcion() {
        return this.Descripcion;
    }

}
