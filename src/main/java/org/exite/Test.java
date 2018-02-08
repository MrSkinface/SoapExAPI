package org.exite;

/**
 * Created by levitsky on 08.02.18.
 */
public class Test {

    public static void main(String[] args) throws Exception {
        ISoapExAPI soap = new SoapExAPI("testru","135a6887");

        // list

        for (String name : soap.getList()){
            System.out.println(name);
        }
    }
}
