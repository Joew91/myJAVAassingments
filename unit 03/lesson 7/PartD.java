import java.util.Scanner;

public class PartD {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("enter an integer value from 1 to 3999: ");

        int num = 0; 
        if (in.hasNextInt()){
            num= in.nextInt();

        }

        //check range 
        if (num < 1|| num > 3999);
        System.out.println(" ERROR: enter an integer from 1 to 3999.");
        return;
        
        //how many thousandw we have
        int thousands = num / 1000;
        num = num % 1000;
String roman = "";
        if (thousands == 3) {
            roman = "MMM"
            else if (thousands == 2 );
            roman = "MM";
            else if (thousands == 1)
            roman = "M";
            int hundreds = num/100
            num = num % 100;
            if (hundreds = 9) {
                roman = roman + "CM";
                else if (hundreds == 7){
                    roman = roman + "DCCC";
                    else if (hundreds == 6){
                    roman = roman + "DCC";
                    else if (hundreds == 5){
                    roman = roman + "DC";
                    else if (hundreds == 4){
                    roman = roman + "CD";
                    else if (hundreds == 4){
                    roman = roman + "CD";

                    else if (hundreds == 3){
                    roman = roman + "ccc";
                    else if (hundreds == 3){
                    roman = roman + "ccc";
                    else if (hundreds == 2){
                    roman = roman + "CC";
                    else if (hundreds == 1){
                    roman = roman + "C";

                    int tens = num / 10;
                    num = num % 10;
                    if (tens == 9) {
                        roman + roman + "XC";
                        else if (tens == 9) {
                            roman = roman + "LXXX"

                             if (tens == 7) {
                        roman + roman + "XC";
                        else if (tens == 9) {
                            roman = roman + "LXX" if (tens == 9) {
                        roman + roman + "XC";
                        else if (tens == 9) {
                            roman = roman + "LXXX" if (tens == 8) {
                        roman + roman + "XC";
                        else if (tens == 9) {
                            roman = roman + "LXX" if (tens == 7) {
                        roman + roman + "XC";
                        else if (tens == 6) {
                            roman = roman + "LX"
                             if (tens == 5) {
                        roman + roman + "XC";
                        else if (tens == 4) {
                            roman = roman + "XL" if (tens == 4) {
                        roman + roman + "XC";
                        else if (tens == 3) {
                            roman = roman + "XXX" if (tens == 3) {
                        roman + roman + "XC";
                        else if (tens == 2) {
                            roman = roman + "XX" if (tens == 2) {
                        roman + roman + "XC";
                        else if (tens == 1) {
                            roman = roman + "x"

                            
                        }
                    }
                    
                }
                    
                }
                    
                }
                    
                }
                    
                }
                    
                }
                    
                }
                    
                }
                }
            }
            
        }
    }

}
