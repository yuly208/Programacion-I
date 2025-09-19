package model;

import java.time.LocalDate;

public class Cita {
    private LocalDate fecha;
    private String codigo;
    private double costo;
    private String hora;
    private String motivo;
    private String observaciones;
    private String estado;
    private double duracion;

    public Cita(LocalDate fecha, String codigo, double costo, String hora, String motivo, String observaciones, String estado, double duracion) {

        this.fecha = fecha;
        this.codigo = codigo;
        this.costo = costo;
        this.hora = hora;
        this.motivo = motivo;
        this.observaciones = observaciones;
        this.estado = estado;
        this.duracion = duracion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    //CRUD (GENERICO) *solo puede modificarlo la clase Veterinaria*.






}
