package model;

import javax.swing.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CrudGenerico<T extends Identificable> {
    private List<T> elementos;

    public CrudGenerico(){
        this.elementos = new ArrayList<>();
    }



    //registrar

    public String registrar(T elemento){
        String resultado = "";

        if(buscarElemento(elemento.getId()) == null){
            elementos.add(elemento);
            resultado = "Registro exitoso";
        }else{
            resultado = "Ya existe ese elemento con ese ID";
        }
        return resultado;
    }


    // Buscar

    public T buscarElemento(String id){
        for(T elemento : elementos){
            if(elemento.getId().equalsIgnoreCase(id)){
                return elemento;
            }
        }
        return null;
    }

     //Update

    public String actualizar(String id){
        String resultado = "";

        for(T elemento : elementos){
            if(elemento.getId().equals(id)){
                if(elemento instanceof Propietario propietario){
                    int modificador;
                    do {
                        String opcion = JOptionPane.showInputDialog(null, "Que quieres modificar: \n" +
                                "1. Nombres \n" +
                                "2. apellidos \n" +
                                "3. id \n" +
                                "4. telefono \n" +
                                "5. direccion \n");
                        modificador = Integer.parseInt(opcion);

                        switch (modificador){
                            case 1:
                                String nombres = JOptionPane.showInputDialog(null, "Por cuales nombres quieres cambiar?");
                                propietario.setNombres(nombres);
                            case 2:
                                String apellidos = JOptionPane.showInputDialog(null, "Por cuales apellidos quieres cambiar?");
                                propietario.setNombres(apellidos);
                            case 3:
                                String identificacion = JOptionPane.showInputDialog(null, "Por cual id quieres cambiar?");
                                propietario.setNombres(identificacion);
                            case 4:
                                String telefono = JOptionPane.showInputDialog(null, "Por cual telefono quieres cambiar?");
                                propietario.setNombres(telefono);
                            case 5:
                                String direccion = JOptionPane.showInputDialog(null, "Por cual direccion quieres cambiar?");
                                propietario.setNombres(direccion);
                            default:
                                JOptionPane.showMessageDialog(null, "Numero no valido");
                        }
                    } while(modificador != 0);
                }

                else if(elemento instanceof Mascota mascota) {
                    int modificador;
                        do {
                            String opcion = JOptionPane.showInputDialog(null, "Que quieres modificar: \n" +
                                    "1. Nombre \n" +
                                    "2. Codigo \n" +
                                    "3. Especie \n" +
                                    "4. Raza \n" +
                                    "5. edad \n" +
                                    "6. color \n" +
                                    "7. peso \n");
                            modificador = Integer.parseInt(opcion);

                            switch (modificador) {
                                case 1:
                                    String nombre = JOptionPane.showInputDialog(null, "Por cual nombre quieres cambiar?");
                                    mascota.setNombre(nombre);
                                case 2:
                                    String codigo = JOptionPane.showInputDialog(null, "Por cual codigo quieres cambiar?");
                                    mascota.setCodigo(codigo);
                                case 3:
                                    String especie = JOptionPane.showInputDialog(null, "Por cual especie quieres cambiar?");
                                    mascota.setEspecie(especie);
                                case 4:
                                    String raza = JOptionPane.showInputDialog(null, "Por cual raza quieres cambiar?");
                                    mascota.setRaza(raza);
                                case 5:
                                    String  edad = JOptionPane.showInputDialog(null, "Por cual edad quieres cambiar?");
                                    byte edades = Byte.parseByte(edad);
                                    mascota.setEdad(edades);
                                case 6:
                                    String color = JOptionPane.showInputDialog(null, "Por cual codigo quieres cambiar?");
                                    mascota.setColor(color);
                                case 7:
                                    String peso = JOptionPane.showInputDialog(null, "cual es el nuevo peso para cambiar?");
                                    int pesot = Integer.parseInt(peso);
                                    mascota.setPeso(pesot);
                            }
                        }while(modificador != 0 );
                }

                else if (elemento instanceof Veterinario veterinario){
                    int modificador;
                    do {
                        String opcion = JOptionPane.showInputDialog(null, "Que quieres modificar: \n" +
                                "1. Nombres \n" +
                                "2. id \n" +
                                "3. Tarjeta profecional \n" +
                                "4. Años de experiencia \n" +
                                "5. especialidad \n" +
                                "6. telefono \n" +
                                "7. correo");
                        modificador = Integer.parseInt(opcion);

                        switch (modificador){
                            case 1:
                                String nombres = JOptionPane.showInputDialog(null, "Por cuales nombres quieres cambiar?");
                                veterinario.setNombres(nombres);
                            case 2:
                                String identificacion = JOptionPane.showInputDialog(null, "Por cuales apellidos quieres cambiar?");
                                veterinario.setId(identificacion);
                            case 3:
                                String tp = JOptionPane.showInputDialog(null, "Por cual id quieres cambiar?");
                                veterinario.setTarjetaProesional(tp);
                            case 4:
                                String anioExp = JOptionPane.showInputDialog(null, "Por cual telefono quieres cambiar?");
                                int anio = Integer.parseInt(anioExp);
                                veterinario.setAniosExperiencia(anio);
                            case 5:
                                String especialidad = JOptionPane.showInputDialog(null, "Por cual direccion quieres cambiar?\n" +
                                        "0. Medicia interna \n" +
                                        "1. Cirugia \n" +
                                        "2. Dermatologia");
                                int respuesta = Integer.parseInt(especialidad);
                                Especialidad.obtenerCodigo(respuesta);
                            case 6:
                                String telefono = JOptionPane.showInputDialog(null, "Por cual telefono quieres cambiar?");
                                veterinario.setTelefono(telefono);
                            case 7:
                                String correo = JOptionPane.showInputDialog(null, "Por cual correo quieres cambiar?");
                                veterinario.setCorreo(correo);
                            default:
                                JOptionPane.showMessageDialog(null, "Numero no valido");
                        }
                    } while(modificador != 0);
                }
            }
        }




        return resultado;


        //remove
    }


     public String eliminar(String id) {
         String resultado = "";
         T encontrado = buscarElemento(id);
         if (encontrado != null) {
             elementos.remove(encontrado);
             resultado = "Eliminacion exitosa";
         } else {
             resultado = "No se encontro el ID para eliminar";
         }
         return resultado;
     }
}
