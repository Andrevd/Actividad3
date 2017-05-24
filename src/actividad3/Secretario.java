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
public class Secretario {
   private String nombre;
   private String apellido;
   private Listado numerolistado;
   private Recibo numerorecibo;
   
   
   public void setNombre(String nombre)
   {
    this.nombre=nombre;   
   }
    public String getNombre()
    {
        return nombre;
    }       
    public void setApellido(String apellido)
    {
    this.apellido=apellido;
    }
    public String getApellido()
    {
        return apellido;
    }        
    public void getnumerolistado(Listado numerolistado)
        {
        this.numerolistado=numerolistado;
        }
    public void setnumerorecibo(Recibo numerorecibo)
    {
    this.numerorecibo=numerorecibo;
    }

}

