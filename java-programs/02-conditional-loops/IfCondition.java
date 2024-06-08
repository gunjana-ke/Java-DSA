package com.gunjana.conditionals_loops;

public class IfCondition {
    public static void main(String[] args) {
       /**
            Syntax of if statements
            if(boolean expression) {
                //body
            } else {
                //do this
            }

        **/

       int sal = 23000;

       if(sal > 1000){          //If sal is grater than 1000
           sal = sal + 2000;    //If Condition true
       } else {
           sal = sal + 1000;    //If Condition false
       }

       //Multiple if-else-if statements

        int salary = 45000;

       if(salary > 2000){
           salary += 2000;        // salary = salary + 2000
       } else if(salary > 3000){
           salary += 3000;        // salary = salary + 3000
       } else {
           salary += 1000;        // salary = salary + 1000
       }
    }
}
