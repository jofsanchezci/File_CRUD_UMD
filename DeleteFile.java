import java.io.File;  // Import the File class

public class DeleteFile {
  public static void main(String[] args) { 
    File miObj = new File("texto_1.io"); 
    if (miObj.delete()) { 
      System.out.println("Archivo Borrado: " + miObj.getName());
    } else {
      System.out.println("Falla en Borrar el Archivo......");
    } 
  } 
}