package com.blog.samples;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/**
 * Created by dfeingol on 11/24/2016.
 */
public class CollectionStuff {

    /*
     * Using examples of various map iterations
     */
    public void mapIterate(){

        Map<String,String> testlooper = new HashMap<>();
        testlooper.put("dav","one");
        testlooper.put("bev","two");
        testlooper.put("cev","three");

        for (Map.Entry loopEntry:testlooper.entrySet()){
            System.out.println("key=" + loopEntry.getKey() + ",value=" + loopEntry.getValue());
        }
    }
    public static void main(String args[]){
       CollectionStuff collectionStuff = new CollectionStuff();
        collectionStuff.mapIterate();
    }
}
