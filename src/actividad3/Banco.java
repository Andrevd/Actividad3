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
public class Banco {
    private Cuenta cuenta1;
   
    public void setCuenta1(Cuenta cuenta1P)
    {
      this.cuenta1=cuenta1P;
    }
    public Cuenta getCuenta1(){
        return cuenta1;
    }
}
