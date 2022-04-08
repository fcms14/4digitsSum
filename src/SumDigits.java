import java.io.*;
import java.util.*;

public class SumDigits {

    /*
     * This function Returns an integer array list
     */
    public static ArrayList<Integer> sum(int maxDigit, int target){

        ArrayList<Integer> result = new ArrayList<>();

        if (maxDigit > 0 && maxDigit < 10){
            var t = 1; // thousands
            var h = 0; // hundreds
            var d = 0; // dozens
            var u = 0; // units
    
            var _maxdigit = maxDigit * 1111;
            for (int i=1000; i<=_maxdigit; i++){
    
                if (u > maxDigit){
                    u = 0;
                    d++;
                    i = i + 10 - maxDigit - 1;
                    
                    if (d > maxDigit){
                        d = 0;
                        h++;
                        i = i + 100 - (maxDigit * 10) - 10;
                        
                        if (h > maxDigit){
                            h = 0;
                            t++;
                            i = i + 1000 - (maxDigit * 100) - 100;
                        }
                    }
                }
    
                int sum = t + h + d + u;
    
                if (sum == target){
                    result.add(i);
                }
                u++;
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
        if(result.size() < 1){
            System.out.println("null");
        }
        else{
            System.out.println(result);
        }
        
    }
}