package org.testng.Conceptual;

public class StringConcept {

    //String is Case Sensitive
    //String Object can be created in 2 ways = , new
    //When String Object is created with = Memory will be allocated in SCP (String Constant Pool)
    //When String Object is create with new keyword Memory will be allocated in HEAP
    //Difference between char array and String is, it's always end with "\0"


    //Examples with Duplicate object

    /**
     * This Method will verify == and check if the st1, st2 are point to same address in case both have same value
     *
     * @param st1
     * @param st2
     */
    public static void stringAddressCompareWithDoubleEquals(String st1, String st2) {

        //Case 1 : =

        st1 = "Gaurav"; // Object is created in SCP String Constant Pool
        st2 = "Gaurav"; // Object is created in SCP String Constant Pool and point to same "Gaurav"


        //Case 2 : new keyword

        st1 = new String("Gaurav"); // Object is created in Heap
        st2 = new String("Gaurav"); // Object is created in Heap


        //Case 3 : Using strings as case sensitive

        st1 = new String("Gaurav");
        st2 = new String("gaurav");

        //Case 4 : Using both

        st1 = "Gaurav";
        st2 = new String("Gaurav");


        if (st1 == st2) {
            System.out.println("Address is same");
        } else {
            System.out.println("Address is not same");
        }
    }

    /**
     * This Method will use equals function and verify if the st1, st2 both have same value
     *
     * @param st1
     * @param st2
     */
    public static void stringAddressCompareWithEquals(String st1, String st2) {
        st1 = "Gaurav";
        st2 = "Gaurav";

        // rest scenarios as above

        if (st1.equals(st2)) {
            System.out.println("Value is same");
        } else {
            System.out.println("Value is not same");
        }

    }

    /**
     * This Method will use compareto function and verify if the st1, st2 both have same ascii value of string
     *
     * @param st1
     * @param st2
     */
    public static void stringAddressCompareTo(String st1, String st2) {

        // Case : Case sensitive
        st1 = "Gaurav";
        st2 = "gaurav";

        System.out.println(st1.compareTo(st2));

    }


}
