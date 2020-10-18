/*
***********************************************************

Topic   : Program to demonstrate Logical OR ( || ) Operator in java.
Author  : Chpaone09®
Date    : Oct 19, 2020

************************************************************
*/

public class LogicalOR {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = true;
        boolean c = false;
        boolean d = false;

        if(a || b){
            System.out.print("\n\n\t True if either A or B is True. ");
        }

        if(a || c){
            System.out.print("\n\n\t True if either A or C is True. ");
        }

        if(b || c){
            System.out.print("\n\n\t True if either B or C is True. ");
        }

        if(c || d){
            System.out.print("\n\n\t True if either C or D is True. ");
        }



    }
}
