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
public class Listado {
    private int listadoinquilino;
    private Date fechalistado;
    private int listadopiso;
    private int listadoinmueble;
    private int listadolocal;
    private Recibo numerorecibo;
    private Secretario nombre;
    
    
    public void setListadoinquilino(int listadoinquilino)
    {
    this.listadoinquilino=listadoinquilino;
    }
    public int getListadoinquilino()
    {
        return listadoinquilino;
    }
    public void setFechalistado(Date fechalistado)
    {
    this.fechalistado=fechalistado;
    }
    public Date getFechalistado()
    {
    return fechalistado;
    }
    public void setListadopiso(int listadopiso)
    {
    this.listadopiso=listadopiso;
    }
    public int getListadopiso()
    {
        return listadopiso;
    }
    public void setListadoinmueble(int listadoinmueble)
    {
    this.listadoinmueble=listadoinmueble;
    }
    public int getListadoinmueble()
    {
        return listadoinmueble;
    }
    public void setListadolocal(int listadolocal)
    {
    this.listadolocal=listadolocal;
    }
    public int getListadolocal()
    {
        return listadolocal;
    }
    public void setnumerorecibo(Recibo numerorecibo)
    {
    this.numerorecibo=numerorecibo;
    } 
    public void getnombre(Secretario nombre)
    {
    this.nombre=nombre;
    }
}


