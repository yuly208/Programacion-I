package app;

import model.*;

import javax.swing.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public static void main(String[] args) {
public class Aplicacion {

        Veterinaria veterinaria = new Veterinaria(
                "Amigos peluditos",
                "312821838",
                "Calle 2 N25-6",
                "31251"
        );

        List<Mascota> mascotas = new ArrayList<>();
        List<Veterinario> veterinarios = new ArrayList<>();
        List<Cita> citas = new ArrayList<>();
        List<Propietario> propietarios = new ArrayList<>();

        JOptionPane.showMessageDialog(null,
                "Bienvenidos a la veterinaria " + veterinaria.getNombre() +
                        " en la dirección " + veterinaria.getDireccion());

        int opcionPrincipal;
        do {
            String menu = "=== MENÚ PRINCIPAL ===\n" +
                    "1. Propietarios\n" +
                    "2. Mascotas\n" +
                    "3. Veterinarios\n" +
                    "4. Citas\n" +
                    "0. Salir\n";
            opcionPrincipal = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcionPrincipal) {
                case 1 -> menuPropietarios(propietarios, mascotas);
                case 2 -> menuMascotas(mascotas);
                case 3 -> menuVeterinarios(veterinarios);
                case 4 -> menuCitas(citas, mascotas, veterinarios);
                case 0 -> JOptionPane.showMessageDialog(null, "Gracias por usar la aplicación.");
                default -> JOptionPane.showMessageDialog(null, "Opción inválida.");
            }
        } while (opcionPrincipal != 0);
    }

    private static void menuPropietarios(List<Propietario> propietarios, List<Mascota> mascotas) {
        int opcion;
        do {
            String menu = "=== MENÚ PROPIETARIOS ===\n" +
                    "1. Registrar (con mascota obligatoria)\n" +
                    "2. Mostrar\n" +
                    "0. Volver\n";
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcion) {
                case 1 -> {
                    String nombres = JOptionPane.showInputDialog("Nombres:");
                    String apellidos = JOptionPane.showInputDialog("Apellidos:");
                    String id = JOptionPane.showInputDialog("ID:");
                    String telefono = JOptionPane.showInputDialog("Teléfono:");
                    String direccion = JOptionPane.showInputDialog("Dirección:");

                    Propietario propietario = new Propietario(nombres, apellidos, id, telefono, direccion);

                    // 🚨 Registrar al menos una mascota
                    do {
                        String nombreMascota = JOptionPane.showInputDialog("Nombre de la mascota:");
                        String codigoMascota = JOptionPane.showInputDialog("Código de la mascota:");
                        String especie = JOptionPane.showInputDialog("Especie:");
                        String raza = JOptionPane.showInputDialog("Raza:");
                        byte edad = Byte.parseByte(JOptionPane.showInputDialog("Edad:"));
                        String color = JOptionPane.showInputDialog("Color:");
                        int peso = Integer.parseInt(JOptionPane.showInputDialog("Peso:"));

                        Mascota mascota = new Mascota(nombreMascota, codigoMascota, especie, raza, edad, color, peso);
                        propietario.agregarMascota(mascota);
                        mascotas.add(mascota);

                    } while (JOptionPane.showConfirmDialog(null,
                            "¿Desea registrar otra mascota?",
                            "Mascota",
                            JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION);

                    propietarios.add(propietario);
                    JOptionPane.showMessageDialog(null, "Propietario registrado con al menos una mascota.");
                }
                case 2 -> {
                    StringBuilder sb = new StringBuilder("=== Lista de Propietarios ===\n");
                    for (Propietario p : propietarios) {
                        sb.append(p.getNombres()).append(" ").append(p.getApellidos())
                                .append(" - ID: ").append(p.getId())
                                .append("\nMascotas:\n");
                        for (Mascota m : p.getMascotas()) {
                            sb.append("   - ").append(m.getNombre()).append(" (").append(m.getEspecie()).append(")\n");
                        }
                        sb.append("\n");
                    }
                    JOptionPane.showMessageDialog(null, sb.toString());
                }
            }
        } while (opcion != 0);
    }
    private static void menuMascotas(List<Mascota> mascotas) {
        int opcion;
        do {
            String menu = "=== MENÚ MASCOTAS ===\n" +
                    "1. Registrar\n" +
                    "2. Mostrar\n" +
                    "3. Modificar\n" +
                    "4. Eliminar\n" +
                    "0. Volver\n";
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcion) {
                case 1 -> {
                    String nombre = JOptionPane.showInputDialog("Nombre:");
                    String codigo = JOptionPane.showInputDialog("Código:");
                    String especie = JOptionPane.showInputDialog("Especie:");
                    String raza = JOptionPane.showInputDialog("Raza:");
                    byte edad = Byte.parseByte(JOptionPane.showInputDialog("Edad:"));
                    String color = JOptionPane.showInputDialog("Color:");
                    int peso = Integer.parseInt(JOptionPane.showInputDialog("Peso:"));

                    mascotas.add(new Mascota(nombre, codigo, especie, raza, edad, color, peso));
                    JOptionPane.showMessageDialog(null, "Mascota registrada.");
                }
                case 2 -> {
                    StringBuilder sb = new StringBuilder("=== Lista de Mascotas ===\n");
                    for (Mascota m : mascotas) {
                        sb.append(m).append("\n");
                    }
                    JOptionPane.showMessageDialog(null, sb.toString());
                }
                case 3 -> {
                    String codigoMod = JOptionPane.showInputDialog("Código de la mascota a modificar:");
                    Mascota mascota = buscarMascota(mascotas, codigoMod);
                    if (mascota != null) {
                        mascota.setNombre(JOptionPane.showInputDialog("Nuevo nombre:", mascota.getNombre()));
                        mascota.setEspecie(JOptionPane.showInputDialog("Nueva especie:", mascota.getEspecie()));
                        mascota.setRaza(JOptionPane.showInputDialog("Nueva raza:", mascota.getRaza()));
                        mascota.setEdad(Byte.parseByte(JOptionPane.showInputDialog("Nueva edad:", mascota.getEdad())));
                        mascota.setColor(JOptionPane.showInputDialog("Nuevo color:", mascota.getColor()));
                        mascota.setPeso(Integer.parseInt(JOptionPane.showInputDialog("Nuevo peso:", mascota.getPeso())));
                        JOptionPane.showMessageDialog(null, "Mascota modificada.");
                    } else {
                        JOptionPane.showMessageDialog(null, "No se encontró la mascota.");
                    }
                }
                case 4 -> {
                    String codigoElim = JOptionPane.showInputDialog("Código de la mascota a eliminar:");
                    Mascota mascota = buscarMascota(mascotas, codigoElim);
                    if (mascota != null) {
                        mascotas.remove(mascota);
                        JOptionPane.showMessageDialog(null, "Mascota eliminada.");
                    } else {
                        JOptionPane.showMessageDialog(null, "No se encontró la mascota.");
                    }
                }
            }
        } while (opcion != 0);
    }

    private static Mascota buscarMascota(List<Mascota> mascotas, String codigo) {
        for (Mascota m : mascotas) {
            if (m.getId().equals(codigo)) {
                return m;
            }
        }
        return null;
    }

    private static void menuVeterinarios(List<Veterinario> veterinarios) {
        int opcion;
        do {
            String menu = "=== MENÚ VETERINARIOS ===\n" +
                    "1. Registrar\n" +
                    "2. Mostrar\n" +
                    "3. Eliminar\n" +
                    "0. Volver\n";
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcion) {
                case 1 -> {
                    String nombre = JOptionPane.showInputDialog("Nombre:");
                    String codigo = JOptionPane.showInputDialog("Código:");
                    String telefono = JOptionPane.showInputDialog("Teléfono:");
                    String correo = JOptionPane.showInputDialog("Correo:");
                    int anio = Integer.parseInt(JOptionPane.showInputDialog("Años Experiencia:"));
                    String tarjetaProfesional = JOptionPane.showInputDialog("Tarjeta Profesional:");
                    int codEspecialidad = Integer.parseInt(JOptionPane.showInputDialog(
                            "Especialidad:\n0. Medicina General\n1. Cirugía\n2. Dermatología"));

                    Especialidad especialidad = Especialidad.obtenerCodigo(codEspecialidad);
                    veterinarios.add(new Veterinario(nombre, codigo, tarjetaProfesional, anio, especialidad, telefono, correo));
                    JOptionPane.showMessageDialog(null, "Veterinario registrado.");
                }
                case 2 -> {
                    StringBuilder sb = new StringBuilder("=== Lista de Veterinarios ===\n");
                    for (Veterinario v : veterinarios) {
                        sb.append(v).append("\n");
                    }
                    JOptionPane.showMessageDialog(null, sb.toString());
                }
                case 3 -> {
                    String codigoElim = JOptionPane.showInputDialog("Código del veterinario a eliminar:");
                    Veterinario vet = buscarVeterinario(veterinarios, codigoElim);
                    if (vet != null) {
                        veterinarios.remove(vet);
                        JOptionPane.showMessageDialog(null, "Veterinario eliminado.");
                    } else {
                        JOptionPane.showMessageDialog(null, "No se encontró el veterinario.");
                    }
                }
            }
        } while (opcion != 0);
    }

    private static Veterinario buscarVeterinario(List<Veterinario> veterinarios, String codigo) {
        for (Veterinario v : veterinarios) {
            if (v.getId().equals(codigo)) {
                return v;
            }
        }
        return null;
    }

    private static void menuCitas(List<Cita> citas, List<Mascota> mascotas, List<Veterinario> veterinarios) {
        int opcion;
        do {
            String menu = "=== MENÚ CITAS ===\n" +
                    "1. Registrar\n" +
                    "2. Mostrar\n" +
                    "3. Eliminar\n" +
                    "0. Volver\n";
            opcion = Integer.parseInt(JOptionPane.showInputDialog(menu));

            switch (opcion) {
                case 1 -> {
                    String codigo = JOptionPane.showInputDialog("Código de la cita:");
                    LocalDate fecha = LocalDate.parse(JOptionPane.showInputDialog("Fecha (YYYY-MM-DD):"));
                    double costo = Double.parseDouble(JOptionPane.showInputDialog("Costo:"));
                    String observaciones = JOptionPane.showInputDialog("Observaciones:");
                    String estado = JOptionPane.showInputDialog("Estado:");
                    double duracion = Double.parseDouble(JOptionPane.showInputDialog("Duración:"));
                    String hora = JOptionPane.showInputDialog("Hora:");
                    String motivo = JOptionPane.showInputDialog("Motivo:");

                    citas.add(new Cita(fecha, codigo, costo, hora, motivo, observaciones, estado, duracion));
                    JOptionPane.showMessageDialog(null, "Cita registrada.");
                }
                case 2 -> {
                    StringBuilder sb = new StringBuilder("=== Lista de Citas ===\n");
                    for (Cita c : citas) {
                        sb.append(c).append("\n");
                    }
                    JOptionPane.showMessageDialog(null, sb.toString());
                }
                case 3 -> {
                    String codigoElim = JOptionPane.showInputDialog("Código de la cita a eliminar:");
                    Cita cita = buscarCita(citas, codigoElim);
                    if (cita != null) {
                        citas.remove(cita);
                        JOptionPane.showMessageDialog(null, "Cita eliminada.");
                    } else {
                        JOptionPane.showMessageDialog(null, "No se encontró la cita.");
                    }
                }
            }
        } while (opcion != 0);
    }

    private static Cita buscarCita(List<Cita> citas, String codigo) {
        for (Cita c : citas) {
            if (c.getCodigo().equals(codigo)) {
                return c;
            }
        }
        return null;
    }
}
