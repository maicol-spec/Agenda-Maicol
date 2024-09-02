package co.edu.uniquindio.poo;

import java.sql.Time;
import java.util.Date;

public class App {
    public static void main(String[] args) {
        // Crear contactos
        Contacto contacto1 = new Contacto("Juan Pérez", "Juancho", "Calle 123", "3104325816", "juanchin@gmail.com");
        Contacto contacto2 = new Contacto("Ana Michel", "Ana banana", "Avenida 456", "3145303229", "ana@gmail.com");
        Contacto contacto3 = new Contacto("Luis Martín", "Luisito", "Carrera 789", "3228906520", "luismar@gmail.com");
        Contacto contacto4 = new Contacto("James Rodríguez", "El tata", "Plaza 101", "313456780", "Tatareto@gmail.com");
        Contacto contacto5 = new Contacto("Davinson Sánchez", "Coroso", "Boulevar 202", "3216489340", "Dsanchez@gmail.com");

        // Crear grupo de contactos
        GrupoContacto grupo = new GrupoContacto("Grupo Bichiboys", Categoria.AMIGOS);

        // Agregar contactos al grupo
        grupo.agregarContacto(contacto1);
        grupo.agregarContacto(contacto2);
        grupo.agregarContacto(contacto3);
        grupo.agregarContacto(contacto4);
        grupo.agregarContacto(contacto5);

        // Intentar agregar un contacto repetido
        grupo.agregarContacto(contacto1); 

        // Verificar si el grupo tiene el mínimo de contactos
        if (grupo.tieneMinimoContactos()) {
            System.out.println("El grupo tiene al menos 5 contactos.");
        } else {
            System.out.println("El grupo no tiene el mínimo de 5 contactos.");
        }

        // Crear reunión
        Date fecha = new Date();
        Time hora = new Time(System.currentTimeMillis());
        Reunion reunion = new Reunion("Planeación", "Mejoría de la universidad", fecha, hora);

        // Agregar contactos a la reunión
        reunion.agregarAsistente(contacto1);
        reunion.agregarAsistente(contacto2);
        reunion.agregarAsistente(contacto3);
        reunion.agregarAsistente(contacto4);
        reunion.agregarAsistente(contacto5);

        // Intentar agregar un contacto repetido a la reunión
        reunion.agregarAsistente(contacto1); // Debería imprimir "El contacto ya está en la lista de asistentes."


        // Mostrar información antes de eliminar el contacto
        System.out.println("\nInformación del Grupo de Contactos:");
        System.out.println(grupo);

        System.out.println("\nInformación de la Reunión antes de eliminar el contacto:");
        System.out.println(reunion);


        // Eliminar un contacto de la reunión
        String nombreContactoAEliminar = "Ana Michel";
        String telefonoContactoAEliminar = "3145303229";
        reunion.eliminarContacto(nombreContactoAEliminar, telefonoContactoAEliminar);
        GrupoContacto.mostrarMensaje("El contacto con el nombre " + nombreContactoAEliminar + " y número de teléfono " + telefonoContactoAEliminar + " fue removido de la reunión.");
        
        // Mostrar información después de eliminar el contacto
        System.out.println("\nInformación de la Reunión después de eliminar el contacto:");
        System.out.println(reunion);
    }
}

