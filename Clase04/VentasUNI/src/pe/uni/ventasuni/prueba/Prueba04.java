package pe.uni.ventasuni.prueba;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JOptionPane;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/**
 * Crear archivo excel
 * @author Gustavo Coronel
 * @Youtube https://www.youtube.com/c/DesarrollaSoftware
 */
public class Prueba04 {

	public static void main(String[] args) {
		
		try {

      // Archivo destino
      String archivo = "E:\\EGCC\\files\\clientes.xls";
      // Seleccionar archivo destino
      // Esto es una tarea.

      // Proceso de crear el archivo excel
      // Paso 1: Crear el libro
      HSSFWorkbook objWB = new HSSFWorkbook();
      // Paso 2: Crear la hoja
      HSSFSheet hoja = objWB.createSheet("LISTADO DE CLIENTES");
      // Paso 3: Crear la cabecera
      HSSFRow filaData = hoja.createRow(0);
      filaData.createCell(0).setCellValue("CODIGO");
      filaData.createCell(1).setCellValue("NOMBRE");
      // Cargar data a la hoja
      for (int fila = 1; fila <= 5; fila++) {
        filaData = hoja.createRow(fila);
        filaData.createCell(0).setCellValue("C0" + fila);
        filaData.createCell(1).setCellValue("Nombre " + fila);
      }
      // Crear el archivo
      File objFile = new File(archivo);
      FileOutputStream archivoSalida = new FileOutputStream(objFile);
      objWB.write(archivoSalida);
      archivoSalida.close();
      JOptionPane.showMessageDialog(null, "Proceso ejecutado correctamente.");
    } catch (IOException ex) {
      JOptionPane.showMessageDialog(null, "No se tiene permiso para crear el archivo.");
    }
		
	}
}
