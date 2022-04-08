import java.io.*;
import java.util.*;

public class SumDigits {

    /*
     * This function Returns an integer array list
     */
    public static ArrayList<Integer> sum(int maxDigit, int target){

        ArrayList<Integer> result = new ArrayList<>();

        // t for thousands    
        for (int t=1;t<=maxDigit;t++){
            // h for hundreds
            for (int h=0;h<=maxDigit;h++){
                // d for dozens
                for (int d=0;d<=maxDigit;d++){
                    // u for units
                    for (int u=0;u<=maxDigit;u++){
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
    /*
     * This function asks two values to calculate all possible 4-digit numbers
     * where each one is less than or equal to the input value1 (maxDigit),
     * and the sum of the digits of each generated number is equal to the informed value2 (target).
     *
     * Example:
     * maxDigit = 6
     * target   = 21
     * result   = [3666, 4566, 4656, 4665, 5466, 5556, 5565, 5646, 5655, 5664, 6366, 6456, 6465, 6546, 6555, 6564, 6636, 6645, 6654, 6663]
     * 
     */
    public static void main(String[] args) throws IOException{        
        
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