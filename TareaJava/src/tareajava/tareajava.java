/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareajava;

import java.io.*;

/**
 *
 * @author Gambo
 */
public class tareajava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String frase="Hola mi nombre es Brenda";
        String[] arr=frase.split(" ");
        
        File archivo = new File("C:\\Users\\Gambo\\Desktop\\Tarea Pedro\\texto.txt");
        FileReader fr = new FileReader(archivo);
        BufferedReader br = new BufferedReader(fr);

        String texto = br.readLine();
        String[] arr2 = texto.split(" ");
        System.out.println("Texto dentro del archivo");
        System.out.println(texto);
        System.out.println("\nTexto ordenado");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr2[j].equals(arr[i])) {
                    System.out.print(arr2[j]+" ");
                }
            }
        }
    }

}
