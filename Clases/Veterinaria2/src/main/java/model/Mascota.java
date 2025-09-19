package model;

public class Mascota implements Identificable{
    private String nombre;
    private String codigo;
    private String especie;
    private String raza;
    private byte edad;
    private String color;
    private int peso;

    public Mascota(String nombre, String codigo, String especie, String raza, byte edad, String color, int peso) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.especie = especie;
        this.raza = raza;
        this.edad = edad;
        this.color = color;
        this.peso = peso;
    }

    @Override
    public String getId(){
        return codigo;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getNombre(){
        return nombre;
    }

}
