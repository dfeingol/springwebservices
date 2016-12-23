package com.blog.samples;

/**
 * Created by dfeingol on 11/24/2016.
 */
public class Reservation {

    private String name = null;
    private Integer id = null;

    public Reservation(String name, Integer id) {
        this.name = name;
        this.id = id;
    }

    public Reservation() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Reservation that = (Reservation) o;

        if (!name.equals(that.name)) return false;
        return id.equals(that.id);

    }

    void doClass(){

    }
    public void doPublic(){


    }

    public void doPrivate(){

    }

    public void doProtected(){

    }
    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + id.hashCode();
        return result;
    }

    /*
     * Drvies the code
     */
    public static void main(String args[]){
        //example of autoboxing
       Reservation reservation = new Reservation("feingold",null);
        Reservation reservation2 = new Reservation(null,234);
        if ( reservation.equals(reservation2)){
            System.out.println("Its crazy");
        }
        else{
            System.out.println("It was successful");
        }
    }
   /* public boolean equals(Object obj1){
        if ( obj1 != null){
            return false;
        }
        if ( this == obj1){
            return true;
        }
        Reservation comparedReservation = (Reservation)obj1;
        if ( this.name.equals(comparedReservation.name) &&
             this.id.equals(comparedReservation.id)){
            return true;
        }
        else{
            return false;
        }



    }
    public String toString(){
        StringBuilder builder = new StringBuilder();
        if (name != null){
            builder.append("name=" + name);
        }
        if (id != null){
            builder.append(",id=" + id);
        }
        return builder.toString()
    }*/
}
