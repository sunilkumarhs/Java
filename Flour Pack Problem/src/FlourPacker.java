/*Write a method named canPack with three parameters of type int named bigCount, smallCount, and goal.

The parameter bigCount represents the count of big flour bags (5 kilos each).

The parameter smallCount represents the count of small flour bags (1 kilo each).

The parameter goal represents the goal amount of kilos of flour needed to assemble a package.

Therefore, the sum of the kilos of bigCount and smallCount must be at least equal to the value of goal. The method should return true if it is possible to make a package with goal kilos of flour.

If the sum is greater than goal, ensure that only full bags are used towards the goal amount. For example, if goal = 9, bigCount = 2, and smallCount = 0, the method should return false since each big bag is 5 kilos and cannot be divided. However, if goal = 9, bigCount = 1, and smallCount = 5, the method should return true because of 1 full bigCount bag and 4 full smallCount bags equal goal, and it's okay if there are additional bags left over.

If any of the parameters are negative, return false.*/
public class FlourPacker {
    public static void main(String[] args) {
        boolean result=FlourPacker.canPack(17,18,35);
        if(result) {
            System.out.println("The flour can be packed equally");
        }else {
            System.out.println("The flour can not be packed equally");
        }
        System.out.println("--------------------------------------------------------------------------");
        result=FlourPacker.canPack(17,18,7);
        if(result) {
            System.out.println("The flour can be packed equally");
        }else {
            System.out.println("The flour can not be packed equally");
        }
        System.out.println("--------------------------------------------------------------------------");
        result=FlourPacker.canPack(4,1,18);
        if(result) {
            System.out.println("The flour can be packed equally");
        }else {
            System.out.println("The flour can not be packed equally");
        }
        System.out.println("--------------------------------------------------------------------------");
        result=FlourPacker.canPack(17,-1,7);
        if(result) {
            System.out.println("The flour can be packed equally");
        }else {
            System.out.println("The flour can not be packed equally");
        }
    }
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if(bigCount<0||smallCount<0||goal<0) {
            System.out.println("Invalid Input");
            return false;
        }
        bigCount=bigCount*5;
        int rem=goal%5;
        int smrem=0;
        if(rem!=0) {
            smrem=goal-(rem*5);
        }
        int gtrem=0;
        if(bigCount>0) {
            gtrem=goal%bigCount;
        }
        if(bigCount==0&&smallCount>=goal) {
            return true;
        }else if(goal<bigCount&&smallCount>=rem) {
            return true;
        }else if(goal>bigCount&&smallCount>=gtrem&&bigCount!=0&&(bigCount+smallCount)>=goal) {
            return true;
        }else if(rem!=0&&bigCount>=goal&&goal>5&&smallCount>=smrem) {
            return true;
        }else if(rem!=0&&smallCount>=gtrem&&bigCount>=(goal-gtrem)) {
            return true;
        }else if(rem==0&&(bigCount>=goal||smallCount>=goal)) {
            return true;
        }else {
            return false;
        }
    }
}
