/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad3;

import java.util.Date;

/**
 *
 * @author SENA
 */
public class Cuenta {
    private double saldo;
    private String Acreedor_deudor;
    private String Movimiento;
    private Date Fmovimi;
    
       
   public void setSaldo(double saldoP)
   {
     this.saldo= saldoP;
   }
   public double getSaldo()
   {
    return this.saldo;
   }
   
   public void setAcreedor_deudor(String Acreedor_deudorP)
   {
     this.Acreedor_deudor= Acreedor_deudorP;
   }
   public String getAcreedor_deudor()
   {
    return this.Acreedor_deudor;
   }
   
     public void setMovimiento(String MovimientoP)
   {
     this.Movimiento= MovimientoP;
   }
   public String getMovimiento()
   {
    return this.Movimiento;
   }
   
     public void setFmovimi(Date FmovimiP)
   {
     this.Fmovimi= FmovimiP;
   }
   public Date getFmovimi()
   {
    return this.Fmovimi;
   }
   public void aumentar(){}
   public void disminuir(){}
}
