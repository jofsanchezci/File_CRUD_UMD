import java.io.File;  // Importar la clase archivo
import java.io.FileNotFoundException;  // Importar la clase de IOException para manejar el error
import java.util.Scanner; // Importar la clase Scanner

public class ReadFile {
  public static void main(String[] args) {
    try {
      File myObj = new File("ejemplo.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("Error....");
      e.printStackTrace();
    }
  }
}