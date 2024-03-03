/*package p2;

import p1.Default_value;

public class Test_Default_value extends Default_value {
    public static void main (String[] args){
        Default_value ob = new Default_value();
        System.out.print(ob.x);
        ob.x=30;
        System.out.println( ob.x);

    }
}
*/
//output- java: x has protected access in p1.Default_value but output ( 030 )
// explanation- x variable access modifier so that can be access in the subclass of the same package or different package
// system.out.print(ob.x); // it will display default value "0"
//ob.x=30; // 30 value assigned to variable "x"
//system.out.println(ob.x); // it will display value as "30"
// final output is "030"