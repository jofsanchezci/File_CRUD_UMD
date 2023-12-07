import java.io.File;  // Importar la clase archivo
import java.io.IOException;  // Importar la clase de IOException para manejar el error

public class CreateFile {
  public static void main(String[] args) {
    try {
      File miObj = new File("archivo.io");
      if (miObj.createNewFile()) {
        System.out.println("El archivo creado: " + miObj.getName());
      } else {
        System.out.println("El archivo Existe¡¡¡¡¡");
      }
    } catch (IOException e) {
      System.out.println("ERROR.");
      e.printStackTrace();
    }
  }
}