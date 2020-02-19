
package exemficheiros;

import com.nina.escritura.EscrituraFicheiros;
import com.nina.lectura.LecturaFicheiros;
import java.io.File;

public class ExemFicheiros {

    public static void main(String[] args) {
        
      //  File f = new File("escribirNumeros.txt");
      /*  LecturaFicheiros obxLec = new LecturaFicheiros();      
        obxLec.LerObxectos(f);  */
        EscrituraFicheiros obxEsc= new EscrituraFicheiros();
      //  obxEsc.escribirNumeros("escriNumeros.txt");
//        obxEsc.engadir("C:\\Users\\Usuario\\Desktop\\num.txt");
        obxEsc.escribirObxectos("persoa.txt");
        
    }
    
    
}
