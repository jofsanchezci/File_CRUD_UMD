import java.io.FileWriter;   // Importar la clase archivo
import java.io.IOException;  // Importar la clase de IOException para manejar el error

public class WriteToFile {
  public static void main(String[] args) {
    try {
      FileWriter miEscrito = new FileWriter("texto_1.io");
      miEscrito.write("Hola, hoy es 05 de Diciembre\n");
      miEscrito.write("El año es 2023, Diciembre es el mes 20\n");
      miEscrito.write("La semana del curso es la numero 7\n");
      miEscrito.write("Esta es una linea de prueba\n");
      miEscrito.write("Esta es una linea de prueba_2\n");
        miEscrito.write("Esta es una linea de prueba_3\n");
      miEscrito.close();
      System.out.println("Exito........");
    } catch (IOException e) {
      System.out.println("Error");
      e.printStackTrace();
    }
  }
}