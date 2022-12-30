public class StringMethods {
    public static void main(String[] args) {
        printString("Super Computers are powerful computing Computers");
        printString("");
        printString("\t   \n");

        String word1 = "ParamSuperComputer";
        String wordl1 = word1.toLowerCase();

        System.out.println("The lower case of the word1 is: "+wordl1);
        if(word1.equals(wordl1)) {
            System.out.println("The Strings are same and case sensitive");
        }
        if(word1.equalsIgnoreCase(wordl1)) {
            System.out.println("The Strings are same and not case sensitive");
        }
        if(word1.endsWith("Computer")) {
            System.out.println("The String ends with Computer");
        }
        if(word1.startsWith("Param")) {
            System.out.println("The String starts with Param");
        }
        if(word1.contains("Super")) {
            System.out.println("The String contains Super");
        }
        if(word1.contentEquals("Param SuperComputer")) {
            System.out.println("The strings match each other");
        }

        String birthDate = String.join("/","01","04","2000");
        System.out.println("Birth Date is: "+birthDate);
        String newDate = "25".concat("/").concat("05").concat("/").concat("1995");
        System.out.println("The new date is: "+newDate);
        System.out.println(newDate.replace("/","-"));
        System.out.println(newDate.replaceFirst("/","-"));
        System.out.println(newDate.replaceAll("/","-"));
        System.out.println("RedHat\n".repeat(3));
        System.out.println("-".repeat(30));
        System.out.println("RedHat\n".repeat(3).indent(4));
        System.out.println("-".repeat(30));
        System.out.println("    RedHat\n".repeat(3).indent(-3));
        System.out.println("-".repeat(30));
    }
    public static void printString(String word) {
        System.out.println("The length of the String is:"+word.length());
        if(word.isEmpty()) {
            System.out.println("The is empty String");
        }
        if(word.isBlank()) {
            System.out.println("This is blank String");
        }else {
            System.out.printf("The character at the index 7 is: %c %n",word.charAt(7));
            System.out.printf("Letter C is at: %d %n",word.indexOf('C'));
            System.out.printf("Word powerful is at: %d %n",word.indexOf("powerful"));
            System.out.printf("The last index number of the letter C is: %d %n",word.lastIndexOf('C'));
            System.out.printf("The word at the index 29-38 is: %s %n",word.substring(29,38));
        }
        System.out.println("-----------------------------------------------------------------------");
    }
}
