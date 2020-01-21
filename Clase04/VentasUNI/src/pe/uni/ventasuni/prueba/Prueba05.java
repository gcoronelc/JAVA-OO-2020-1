package pe.uni.ventasuni.prueba;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/**
 * 
 * @author Gustavo Coronel
 * @Youtube https://www.youtube.com/c/DesarrollaSoftware
 */
public class Prueba05 {

	public static void main(String[] args) {
		try {
      // Archivo destino
      String archivo;
      // Seleccionar archivo destino
      JFileChooser fileChooser = new JFileChooser();
      fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
      int result = fileChooser.showOpenDialog(null);
      if (result == JFileChooser.APPROVE_OPTION) {
        File selectedFile = fileChooser.getSelectedFile();
        //System.out.println("Selected file: " + selectedFile.getAbsolutePath());
        archivo = selectedFile.getAbsolutePath();
      } else {
        return;
      }

      // Proceso de crear el archivo excel
      // Paso 1: Crear el libro
      String plantilla = "/pe/uni/ventasuni/plantillas/ventas.xls";
      InputStream inp = Class.class.getResourceAsStream(plantilla);
      HSSFWorkbook objWB = new HSSFWorkbook(inp);
      // Paso 2: Crear la hoja
      HSSFSheet hoja = objWB.getSheetAt(0);
      // Cargar data a la hoja
      HSSFRow filaData = null;
      for (int fila = 2; fila <= 6; fila++) {
        filaData = hoja.createRow(fila);
        filaData.createCell(0).setCellValue("JAVA");
        filaData.createCell(1).setCellValue("PROGRAMADOR");
        filaData.createCell(2).setCellValue(500);
        filaData.createCell(3).setCellValue(5);
        filaData.createCell(4).setCellValue(2500);
      }
      // Crear el archivo
      File objFile = new File(archivo);
      FileOutputStream archivoSalida = new FileOutputStream(objFile);
      objWB.write(archivoSalida);
      archivoSalida.close();
      JOptionPane.showMessageDialog(null, "Proceso ejecutado correctamente.");
    } catch (IOException ex) {
      ex.printStackTrace();
      JOptionPane.showMessageDialog(null, "No se tiene permiso para crear el archivo.");
    }
	}
}
