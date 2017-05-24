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
public class Recibo {
    private int numerorecibo;
    private Date fechaemicion;
    private double renta;
    private double luz;
    private double agua;
    private String ipcanual;
    private String porteria;
    private double iva;
    private Local local1;
    
    
    
    public void seNumerorecibo(int numerorecibo)
   {
    this.numerorecibo=numerorecibo;   
   }
    public int getNumerorecibo()
    {
        return numerorecibo;
    } 
    
    public void setFechaemicion(Date fechaemicion)
    {
    this.fechaemicion=fechaemicion;
    }
    public Date getFechaemicion()
    {
       return fechaemicion;
    }
    public void setRenta(double renta)
    {
    this.renta=renta;
    }
    public double getRenta()
    {
       return renta;
    }
    public void setLuz(double luz)
    {
    this.luz=luz;
    }
    public double getLuz()
    {
       return luz;
    }
    public void setAgua(double agua)
    {
    this.agua=agua;
    }
    public double getAgua()
    {
       return agua;
    }
    public void setIpcanual(String ipcanual)
    {
    this.ipcanual=ipcanual;
    }
    public String getIpcanual()
    {
       return ipcanual;
    }
    public void setPorteria(String porteria)
    {
    this.porteria=porteria;
    }
    public String getPorteria()
    {
       return porteria;
    }
    public void setIva(double iva)
    {
    this.iva=iva;
    }
    public double getIva()
    {
       return iva;
    }
    
    public void setlocal1(Local local1)
    {
    this.local1=local1;
    }
    public Local getlocal()
    {
    return local1;
    }
}
