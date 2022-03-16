import java.io.*;
import java.util.*;

public class SumDigits {

    public static ArrayList<Integer> sum(int maxDigit, int target){

        ArrayList<Integer> result = new ArrayList<>();

        // t for thousands
        for (int t=1;t<=maxDigit;t++){
            // h for hundreds
            for (int h=1;h<=maxDigit;h++){
                // d for dozens7
                for (int d=1;d<=maxDigit;d++){
                    // u for units
                    for (int u=1;u<=maxDigit;u++){
                        int sum = t + h + d + u;
                        if (sum == target){
                            int conj = (t*1000) + (h*100) + (d*10) + u;
                            result.add(conj);
                        }
                    }
                }
            }
        }
        return result;
    }
    public static void main(String[] args) throws IOException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */

        Scanner myInput = new Scanner(System.in);
        
        System.out.println("Informar qual o maior número permitido em cada dígito: ");
        int maxDigit = Integer.parseInt(myInput.nextLine());
        
        System.out.println("Informar qual o total da soma dos dígitos desejado: ");
        int target = Integer.parseInt(myInput.nextLine());
        
        myInput.close();
        

        ArrayList<Integer> result = sum(maxDigit, target);
        System.out.println(result);
    }
}