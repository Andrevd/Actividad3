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
public class Mbancario {
    private String Tipo;
    private Inmueble inmueble1;
    private Banco banco1;
    
    public void setBanco1(Banco banco1P)
    {
      this.banco1=banco1P;
    }
    public Banco getBanco1(){
        return banco1;
    }
    
    public void setInmueble1(Inmueble inmueble1P)
    {
      this.inmueble1=inmueble1P;
    }
    public Inmueble getInmueble1(){
        return inmueble1;
    }
    
      public void setTipo(String TipoP)
   {
     this.Tipo= TipoP;
   }
   public String getTipo()
   {
    return this.Tipo;
   }
}
