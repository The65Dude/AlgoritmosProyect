package org.ReadAndWrite_Players;

import java.io.IOException;
import org.PlayerRelated.Jugador;
import org.PlayerRelated.ListaJugadores;

public class Dao {

    ListaJugadores lista;
    WriterManager writer;
    ReaderManager reader;
    public static final String FILE_NAME = "usuarios.txt";

    public Dao(ListaJugadores lista) {
        this.lista = lista;
        this.writer = new WriterManager(lista);
        this.reader = new ReaderManager(lista);
    }

    public boolean insertar(Jugador p) {
        lista.insertarInicio(p);
        guardarLista();
        return true;
    }

    public void cargarDatosPrueba() throws IOException { // se agregan datos de prueba
        try {
            reader.open(FILE_NAME);
            reader.readAll();
            reader.close(); //importante cerrar el archivo
            System.out.println("Lectura exitosa");
        } catch (IOException ex) {
            try {
                writer.open(FILE_NAME);
                writer.writeAll();
                writer.close();
                System.out.println("Archivo creado");
            } catch (IOException exe) {
                System.err.println("error de archivo");
                System.err.println(ex.getMessage());
            }
        }
    }

    private void guardarLista() {
        try {
            writer.open(FILE_NAME);
            writer.writeAll();
            writer.close();
            System.out.println("Escritura exitosa");
        } catch (IOException ex) {
            System.err.println("error de archivo");
            System.err.println(ex.getMessage());
        }
    }

    public boolean editar(String user, String pass, String newPass){
        Jugador s = lista.edit(user, pass, newPass);
        if (s != null) {
            guardarLista();
        }
        return true;
    }

    public ListaJugadores getLista() {
        return lista;
    }
}