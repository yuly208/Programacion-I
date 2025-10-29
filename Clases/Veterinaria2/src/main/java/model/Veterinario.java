package model;

public class Veterinario implements Identificable{
    private String nombres;
    private String id;
    private String tarjetaProesional;
    private int aniosExperiencia;
    private Especialidad especialidad;
    private String telefono;
    private String correo;

    public Veterinario(String nombres, String id, String tarjetaProesional, int aniosExperiencia, Especialidad especialidad, String telefono, String correo) {
        this.nombres = nombres;
        this.id = id;
        this.tarjetaProesional = tarjetaProesional;
        this.aniosExperiencia = aniosExperiencia;
        this.especialidad = especialidad;
        this.telefono = telefono;
        this.correo = correo;
    }

    @Override
    public String getId(){
        return id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTarjetaProesional() {
        return tarjetaProesional;
    }

    public void setTarjetaProesional(String tarjetaProesional) {
        this.tarjetaProesional = tarjetaProesional;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
}
