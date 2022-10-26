public class NumbersToWords {
    public static void main(String[] args) {
        NumbersToWords.numberToWords(1718);
        System.out.println("--------------------------------------------------------------------------------");
        NumbersToWords.numberToWords(1042000);
    }
    public static void numberToWords(int number) {
        if(number<0) {
            System.out.println("Invalid Value");
        }else {
            int revnumber=reverse(number);
            int digitcount=getDigitCount(number);
            int revdigitcount=getDigitCount(revnumber);
            if(revnumber==0) {
                System.out.println("Zero");
            }
            while(revnumber>0) {
                int num=revnumber%10;
                switch(num) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
                revnumber=revnumber/10;
            }
            if(digitcount!=revdigitcount) {
                for(int i=revdigitcount;i<digitcount;i++) {
                    System.out.println("Zero");
                }
            }
        }
    }
    public static int reverse(int number) {
        int revnumber=0;
        while(number!=0) {
            revnumber=(revnumber*10)+(number%10);
            number=number/10;
        }
        return revnumber;
    }
    public static int getDigitCount(int number) {
        int count=0;
        if(number<0) {
            return -1;
        }else if(number==0){
            return 1;
        }else {
            while(number>0) {
                int num=number%10;
                count+=1;
                number=number/10;
            }
            return count;
        }
    }
}
