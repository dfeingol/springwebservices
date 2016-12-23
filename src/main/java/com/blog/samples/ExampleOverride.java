package com.blog.samples;

/**
 * Created by dfeingol on 11/24/2016.
 * public -- protected -- private
 */
public class ExampleOverride extends Reservation {
    public ExampleOverride(String name, Integer id) {
        super(name, id);
    }
    @Override
    public  void doPublic(){

    }
    @Override
    public void doProtected(){

    }
}
