package Functionality;

public class Calculation {
    public int BinaryToDecimal(int binaryNumber){
        int result=0;
        int p = 0;

        while(true){
            if (binaryNumber==0){
                break;
            } else {
                int temp = binaryNumber%10;
                result += temp*Math.pow(2, p);
                binaryNumber = binaryNumber/10;
                p++;
            }
        } return result;
    }
}
