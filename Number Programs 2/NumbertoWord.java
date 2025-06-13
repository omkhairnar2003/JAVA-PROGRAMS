class NumberToWord {
    public static void main(String[] args) {
        int num = 12;
        System.out.println(num);
        
        String word = "";
        
        while (num > 0) {
            int rem = num % 10;
            switch(rem) {
                case 1:{
                    word = "One " + word;
                    break;}
                case 2:{
                    word = "Two " + word;
                    break;}
                case 3:{
                    word = "Three " + word;
                    break;}
                case 4:{
                    word = "Four " + word;
                    break;}
                case 5:{
                    word = "Five " + word;
                    break;}
                case 6:{
                    word = "Six " + word;
                    break;}
                case 7:{
                    word = "Seven " + word;
                    break;}
                case 8:{
                    word = "Eight " + word;
                    break;}
                case 9:{
                    word = "Nine " + word;
                    break;}
                case 0:{
                    word = "Zero " + word;
                    break;}
                default:{
                    System.out.println("Invalid");
                    break;}
            }
            num = num / 10;
        }
        
        System.out.println("Number in words: " + word);
    }
}