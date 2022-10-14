public class Operators {
    public static void main(String[] args) {
     int op1=17;
     float op2=120.34f;
     double op3=1059.345;
     long op4=350;
     double result1=op1+op3;
        System.out.println("The value of the result1 is :"+result1);
     double result2=op3-op2;
        System.out.println("The value of the result2 is :"+result2);
     double result3=result2/result1;
        System.out.println("The value of the result3 is :"+result3);
     long result4=op1*op4;
        System.out.println("The value of the result4 is :"+result4);
     double total=(result4*(result2+result3))%result1;
        System.out.println("The value of the total result is :"+total);
     int integerresult=(int)total;
        System.out.println("The value of the total in integer is :"+integerresult);
     result4++;
        System.out.println("The post incremental of the result4 is :"+result4);
     total--;
        System.out.println("The post decremental value of the total is :"+total);
        System.out.println("The pre incremental value of the total is :"+(++total));
        System.out.println("The pre decremental value of the result4 is :"+(--result4));
     //Logical operators
     if(op1==17){
         System.out.println("Operator 1 is abd");
     }
     if(result1>result2&&result1<result4){
         System.out.println("The logical AND operator is executed successfully");
     }
     if(result3>result4||total>result3){
         System.out.println("The logical OR operator is executed successfully");
     }
     //operators challenge
     double oper1=20.00;
     double oper2=80.00;
     double operresult=(oper1+oper2)*100.00;
        System.out.println("The value of the operresult is :"+operresult);
     double remainder=operresult%40.00;
        System.out.println("The value of the remainder is :"+remainder);
     boolean bo1;
        bo1= remainder == 0;//bo1=(reminder==0) ? true : false;
        System.out.println("The value of the boolean variable is :"+bo1);
     /*meaning code of the line 31 is:
     if(remainder==0){
     bo1=true;
     }
     else{
     bo1=false;
     }*/
     if(!bo1){
         System.out.println("remainder operator got some remainder");
     }
    }
}
