package org.exite;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Created by levitsky on 08.02.18.
 */
public class Test {

    public static void main(String[] args) throws Exception {
        ISoapExAPI soap = new SoapExAPI("testru","135a6887");

        // list

        System.out.println(soap.getList().size());

        // getdoc
        /*System.out.println(LocalDateTime.now());
        for(String file : soap.getList()){
            soap.getDoc(file);
        }
        System.out.println(LocalDateTime.now());*/

        // getdocuments
        /*List<String> list = soap.getList();
        list.remove(0);
        list.remove(1);
        System.out.println(LocalDateTime.now());
        byte[] zip = soap.getZippedDocs(list);
        System.out.println(LocalDateTime.now());
        Files.write(Paths.get("/home/levitsky/Документы/09022018/test.zip"), zip);*/

        // arc doc
        /*System.out.println(LocalDateTime.now());
        for(String file : soap.getList()){
            soap.archiveDoc(file);
        }
        System.out.println(LocalDateTime.now());*/

        // arc documents
        /*List<String> list = soap.getList();
        list.remove(0);
        list.remove(1);
        System.out.println(LocalDateTime.now());
        soap.archiveDocuments(list);
        System.out.println(LocalDateTime.now());*/
    }
}
