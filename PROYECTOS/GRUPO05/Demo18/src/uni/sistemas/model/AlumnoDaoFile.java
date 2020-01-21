package uni.sistemas.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;
import uni.sistemas.entity.AlumnoTO;
import uni.sistemas.service.ICrudDao;

public class AlumnoDaoFile implements ICrudDao<AlumnoTO> {

    // declarar variables
    FileReader fr = null;
    FileWriter fw = null;
    PrintWriter pw = null;
    BufferedReader br = null;
    File f = null;
    String dato = null;
    String archivo = "Alumnos.txt";
    String temporal = "Temporal.txt";

    @Override
    public void create(AlumnoTO a) throws Exception {
        try {
            //abrir archivo para escritura
            fw = new FileWriter(archivo, true);
            //crear objeto para ewscribir datos
            pw = new PrintWriter(fw);
            //preparar dato a excribir
            dato = a.getId() + "#" + a.getNombre() + "#" + a.getCurso() + "#" + a.getNota() + "#" + a.getEstado() + "\n";
            //escribir dato en el archivo
            pw.write(dato);
            pw.close();
        } catch (IOException e) {
            throw e;
        } finally {
            fr.close();
        }
    }

    @Override
    public void update(AlumnoTO a) throws Exception {
        try {
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            String nuevomensaje = a.getId() + "#" + a.getNombre() + "#" + a.getCurso() + "#" + a.getNota() + "#"
                    + a.getEstado() + "\n";
            String linea = br.readLine();
            while (linea != null) {
                StringTokenizer token = new StringTokenizer(linea, "#");
                String codigo = token.nextToken();
                if (Integer.parseInt(codigo) == a.getId()) {
                    pw = new PrintWriter(new FileWriter(temporal, true));
                    pw.write(nuevomensaje);
                    pw.close();
                } else {
                    String lineatempo = linea + "\n";
                    pw = new PrintWriter(new FileWriter(temporal, true));
                    pw.write(lineatempo);
                    pw.close();
                }
                linea = br.readLine();
            }
            br.close();
            borrar_archivo(archivo);
            renombrar_archivo(archivo);
        } catch (IOException | NumberFormatException e) {
            throw e;
        }
    }

    @Override
    public void delete(AlumnoTO a) throws Exception {
      try {
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            String nuevomensaje = a.getId() + "#" + a.getNombre() + "#" + a.getCurso() + "#" + a.getNota() + "#"
                    + a.getEstado() + "\n";
            String linea = br.readLine();
            while (linea != null) {
                StringTokenizer token = new StringTokenizer(linea, "#");
                String codigo = token.nextToken();
                if (Integer.parseInt(codigo) == a.getId()) {
//                    pw = new PrintWriter(new FileWriter(temporal, true));
//                    pw.write(nuevomensaje);
//                    pw.close();
                } else {
                    String lineatempo = linea + "\n";
                    pw = new PrintWriter(new FileWriter(temporal, true));
                    pw.write(lineatempo);
                    pw.close();
                }
                linea = br.readLine();
            }
            br.close();
            borrar_archivo(archivo);
            renombrar_archivo(archivo);
        } catch (IOException | NumberFormatException e) {
            throw e;
        }
    }

    @Override
    public List<AlumnoTO> readAll() throws Exception {
        List<AlumnoTO> lista = new ArrayList<>();
        try {
            //abrir archivo para lectura
            fr = new FileReader(archivo);
            //crear objeto para leer datos
            br = new BufferedReader(fr);
            // leer la primera linea
            dato = br.readLine();
            while (dato != null) {
                AlumnoTO alu = new AlumnoTO();
                // objeto para partien en pedasos el dato
                StringTokenizer token = new StringTokenizer(dato, "#");
                //asignar valores al objeto alu
                alu.setId(Integer.parseInt(token.nextToken()));
                alu.setNombre(token.nextToken());
                alu.setCurso(token.nextToken());
                alu.setNota(Float.parseFloat(token.nextToken()));
                //adicionar a la coleccion
                lista.add(alu);
                //lee el siguiente dato
                dato = br.readLine();
            }
            br.close();
        } catch (IOException | NumberFormatException e) {
            throw e;
        } finally {
            fr.close();
        }
        return lista;
    }

    @Override
    public AlumnoTO find(int a) throws Exception {
        AlumnoTO alu = null;
        try {
            //abrir archivo para lectura
            fr = new FileReader(archivo);
            //crear objeto para leer datos
            br = new BufferedReader(fr);
            // leer la primera linea
            dato = br.readLine();
            while (dato != null) {
                // objeto para partien en pedasos el dato
                StringTokenizer token = new StringTokenizer(dato, "#");
                int cod = Integer.parseInt(token.nextToken());
                if (cod == a) {
                    alu = new AlumnoTO();
                    //asignar valores al objeto alu
                    alu.setId(cod);
                    alu.setNombre(token.nextToken());
                    alu.setCurso(token.nextToken());
                    alu.setNota(Float.parseFloat(token.nextToken()));
                }
                //lee el siguiente dato
                dato = br.readLine();
            }
            br.close();
        } catch (IOException | NumberFormatException e) {
            throw e;
        } finally {
            fr.close();
        }
        return alu;
    }
    
    private void borrar_archivo(String ruta) {
        // BORRAR ARCHIVO VIEJO
        String original = ruta;
        File arc = new File(original);
        if (arc.delete()) {
            System.out.println("Archivo Borrado");
        } else {
            System.out.println("No se pudo borrar");
        }
        // BORRAR ARCHIVO VIEJO
    }

    private void renombrar_archivo(String ruta) {
        // RENOMBRAR ARCHIVO temp.txt
        File nuevonombre = new File(ruta);
        File viejonombre = new File(temporal);
        if (viejonombre.renameTo(nuevonombre)) {
            System.out.println("No se pudo renombrar");
        }// RENOMBRAR ARCHIVO temp.txt

    }
    

}
