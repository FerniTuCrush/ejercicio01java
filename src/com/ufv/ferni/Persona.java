package com.ufv.ferni;

public class Persona {
    private String nombre;
    private String apellidos;
    private int dnisinletra;
    private int edad;

    public void setEdad(int _edad){
        if(_edad > 0)
         edad = _edad;
    }
    public void setNombre(String _nombre)
    {
        nombre = _nombre;
    }
    public void setApellidos(String _apellidos)
    {
        apellidos = _apellidos;
    }
    public void setDnisinletra(int _dni)
    {
        dnisinletra = _dni;
        //o this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos(){
        return apellidos;
    }

    public  int getDnisinletra(){
        return dnisinletra;
    }
    public int getEdad(){
        return edad;
    }
}
