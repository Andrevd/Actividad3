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
}
