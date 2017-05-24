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
public class Inquilino {
    
    private String Nombre;
    private String Tipoalquiler;
    private int Dni;
    private int Edad;
    private String Genero;
   
    private Mbancario mbanc1;
    private Referencia referencia1;
    
    public void setMbanc1(Mbancario mbanc1P)
    {
      this.mbanc1=mbanc1P;
    }
    public Mbancario getMbanc1(){
        return mbanc1;
    }
    
    public void setReferencia1(Referencia referencia1P)
    {
      this.referencia1=referencia1P;
    }
    public Referencia getReferencia1(){
        return referencia1;
    }
    
     public void setNombre(String nombreP) {
        this.Nombre = nombreP;
    }

    public String getNombre() {
        return this.Nombre;
    }
    
     public void setTipoalquiler(String tipoalquilerP) {
        this.Tipoalquiler = tipoalquilerP;
    }

    public String getTipoalquiler() {
        return this.Tipoalquiler;
    }
    
     public void setDni(int dniP) {
        this.Dni = dniP;
    }

    public int getDni() {
        return this.Dni;
    }
    
    public void setEdad(int edadP) {
        this.Edad = edadP;
    }

    public int getEdad() {
        return this.Edad;
    }
    
     public void setGenero(String generoP) {
        this.Genero = generoP;
    }

    public String getGenero() {
        return this.Genero;
    }
    
    public void Modificar(){}
    public void Dar_de_baja(){}
    public void Consultar(){}
    public void Agregar(){}
}

