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
public class Geconom {
   private String nombremovimiento;
   private Date fechamovimiento;
   private String tipomovimiento;
   private Informe numeroinforme;
   private Cuenta saldo;
   private Inmueble inmueble1;
   
   
   
   public void setNombremovimiento(String nombremovimiento)
   {
    this.nombremovimiento=nombremovimiento;   
   }
    public String getNombremovimiento()
    {
        return nombremovimiento;
    }       
    public void setFechamovimiento(Date fechamovimiento)
    {
    this.fechamovimiento=fechamovimiento;
    }
    public Date getFechamovimiento()
    {
        return fechamovimiento;
    }
    public void setTipomovimiento(String tipomovimiento)
    {
        this.tipomovimiento=tipomovimiento;
    }
    public String getTipomovimiento()
    {
        return tipomovimiento;
    }
     public void setNumeroinforme(Informe numeroinforme)
    {
    this.numeroinforme=numeroinforme;
    } 
    public void getNumeroinforme(Informe numeroinforme)
    {
    this.numeroinforme=numeroinforme;
                                        
    }
    public void setSaldo(Cuenta saldo)
    {
    this.saldo=saldo;
    }
    public void getSaldo(Cuenta saldo)
    {
    this.saldo=saldo;
    }
}
