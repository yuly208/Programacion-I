package model;


import java.util.ArrayList;

public class Propietario implements Identificable {
    private String nombres;
    private String apellidos;
    private String id;
    private String telefono;
    private String direccion;
    private ArrayList<Mascota> listaMascotas;

    public Propietario(String nombres, String apellidos, String id, String telefono, String direccion) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.id = id;
        this.telefono = telefono;
        this.direccion = direccion;
        this.listaMascotas = new ArrayList<>();
    }
    @Override
    public String getId(){
        return id;
    }

    public void agregarMascota(Mascota mascota) {
        this.listaMascotas.add(mascota);
    }

    public ArrayList<Mascota> getMascotas() {
        return listaMascotas;
    }

    public ArrayList<Mascota> getListaMascotas() {
        return listaMascotas;
    }

    public void setListaMascotas(ArrayList<Mascota> listaMascotas) {
        this.listaMascotas = listaMascotas;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
