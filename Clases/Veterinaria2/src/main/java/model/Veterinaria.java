package model;

import  model.CrudGenerico;

import javax.swing.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class Veterinaria {
    private String nombre;
    private String telefono;
    private String direccion;
    private String nit;
    private ArrayList<Cita> listaCitas;
    private CrudGenerico<Propietario> crudPropietarios;
    private CrudGenerico<Mascota> crudMascotas;
    private CrudGenerico<Veterinario> crudVeterinarios;

    public Veterinaria(String nombre, String telefono, String direccion, String nit) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
        this.nit = nit;
        this.crudMascotas = new CrudGenerico<>();
        this.crudPropietarios = new CrudGenerico<>();
        this.crudVeterinarios = new CrudGenerico<>();
        this.listaCitas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    /**
     * Este metodo es el CRUD (reutilizable) de Mascota
     * @return
     */

    public CrudGenerico<Mascota> getCrudMascotas() {
        return crudMascotas;
    }

    /**
     * Este metodo es el CRUD (reutilizable) de Propietario
     * @return
     */
    public CrudGenerico<Propietario> getCrudPropietarios() {
        return crudPropietarios;
    }

    /**
     * Este es el CRUD (reutilizable) de Veterinario
     * @return
     */
    public CrudGenerico<Veterinario> getCrudVeterinarios() {
        return crudVeterinarios;
    }

    // crud creado para cita (en construccion)...

   public String registrarCita(Cita cita){
        String resultado = "";

        if(buscarCita(cita.getCodigo()) == null){
            listaCitas.add(cita);
            resultado = "cita registrada exitosamente";
        }else{
            resultado = "cita ocupada";
        }
        return resultado;

    }
    public Cita buscarCita (String id) {
        for (Cita cita : listaCitas) {
            if (cita.getCodigo().equals(id)) {
                return cita;
            }
        }
        return null;
    }

    public String eliminarCita(Cita cita){
        String resultado = "";
        if(buscarCita(cita.getCodigo()) != null){
            listaCitas.remove(cita);
            resultado = "La cita ha sido cancelada";
        }else{
            resultado = "La cita no existe";
        }

        return resultado;
    }

    public void actuaizarCita(String id){
        for(Cita cita : listaCitas){
            if(cita.getCodigo().equals(id)){

                int modificador;

                do {
                    String opcion = JOptionPane.showInputDialog(null, "Que quieres modificar de la cita: \n" +
                            "1. Codigo \n" +
                            "2. Fecha \n" +
                            "3. Costo \n" +
                            "4. Hora \n" +
                            "5. Motivo \n" +
                            "6. Observaciones \n" +
                            "7. Estado \n" +
                            "8. Duracion \n");

                    modificador = Integer.parseInt(opcion);

                    switch(modificador) {
                        case 1:
                            String codigo = JOptionPane.showInputDialog(null, "Por cual codigo quieres cambiar?");
                            cita.setCodigo(codigo);
                        case 2:
                            String fecha = JOptionPane.showInputDialog(null, "Por cual fecha quieres cambiar?");
                            LocalDate fechas = LocalDate.parse(fecha);
                            cita.setFecha(fechas);
                        case 3:
                            String costo = JOptionPane.showInputDialog(null, "Por que costo quieres cambiar?");
                            int costos = Integer.parseInt(costo);
                            cita.setCosto(costos);
                        case 4:
                            String hora = JOptionPane.showInputDialog(null, "Por cual hora quieres cambiar?");
                            cita.setHora(hora);
                        case 5:
                            String motivo = JOptionPane.showInputDialog(null, "Por cual motivo quieres cambiar?");
                            cita.setCodigo(motivo);
                        case 6:
                            String observaciones = JOptionPane.showInputDialog(null, "Por cuales obseraciones quieres cambiar?");
                            cita.setObservaciones(observaciones);
                        case 7:
                            String estado = JOptionPane.showInputDialog(null, "Por cual estado quieres cambiar?");
                            cita.setEstado(estado);
                        case 8:
                            String duracion = JOptionPane.showInputDialog(null, "Por cuata duracion quieres cambiar?");
                            double duraciones = Double.parseDouble(duracion);
                            cita.setDuracion(duraciones);
                    }
                }while (modificador != 0);
            }
        }
    }
}
