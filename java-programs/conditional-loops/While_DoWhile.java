package com.gunjana.conditionals_loops;

public class While_DoWhile {
    public static void main(String[] args) {
        /*
            while loop syntax :
            while(condition){
                //body
            }
        */

        int num = 1;                    //Initializing number to be 1
        while(num <= 5){                //when number is <= 5
            System.out.println(num);    //if true
            num++;                      //increasing num value by 1
        }

        /*
            do while loop syntax :

            do {
                //body
            } while(condition){
                //do this
            }
        */

        int n = 1;
        do{
            System.out.println(n);    // This scope will be executed at-least once and then checks for the condition
            n++;                      // Incrementing  n
        } while (n <= 5);             // If condition is true then the loop continues
    }
}

/*
    Difference b/w while and do while

    > In do while the body has to be executed at-least once
    > In while it is not mandatory

    When to use while and when to use for loop

    > When you exactly know how many times the loop has to run then use for loop
    > When you do not know how many times the loop has to run then use while loop

*/