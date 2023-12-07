import java.io.FileWriter;   // Importar la clase archivo
import java.io.IOException;  // Importar la clase de IOException para manejar el error

public class WriteToFile_for {
  public static void main(String[] args) {
    try {
      FileWriter miEscrito = new FileWriter("texto_2.txt");
      float num=50.6f;
      for(float i=0; i < num;i++){
        miEscrito.write("Buenas noches, hoy es martes\n");

      }
      miEscrito.close();
      System.out.println("Exito........");
    } catch (IOException e) {
      System.out.println("Error");
      e.printStackTrace();
    }
  }
}