//prg to check the season

import java.util.Scanner;

class Season {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.print("Enter the Month : ");
        String month = S.next().toUpperCase();
        
        String ans = 
            (month.equals("FEB") || month.equals("MAR") || month.equals("APR") || month.equals("MAY")) ? "Summer" :
            (month.equals("JUN") || month.equals("JUL") || month.equals("AUG") || month.equals("SEP")) ? "Monsoon" :
            (month.equals("OCT") || month.equals("NOV") || month.equals("DEC") || month.equals("JAN")) ? "Winter" : "Invalid Month";
        
        System.out.println(ans);
    }
}