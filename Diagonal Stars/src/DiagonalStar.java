public class DiagonalStar {
    public static void main(String[] args) {
        DiagonalStar.printSquareStar(5);
    }
    public static void printSquareStar(int number) {
        if(number<5) {
            System.out.println("Invalid Value");
        }else {
            for(int i=1;i<=number;i++) {
                //System.out.print("*");
                System.out.print("\n");
                for(int j=1;j<=number;j++) {
                    if(j==1||j==number||i==1||i==number||i==j||(i+j)==(number+1)) {
                        System.out.print("*");
                    }else {
                        System.out.print(" ");
                    }
                }
            }
        }
    }
}
