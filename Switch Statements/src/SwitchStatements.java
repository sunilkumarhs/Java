public class SwitchStatements {
    public static void main(String[] args) {
        char var='D';
        switch(var) {
            case 'A':
                System.out.println("The character is "+var);
                break;
            case 'B':
                System.out.println("The character is "+var);
                break;
            case 'C': case 'D': case 'E':
                System.out.println("The character is "+var);
                break;
            default :
                System.out.println("The char not found");
        }
    }
}
