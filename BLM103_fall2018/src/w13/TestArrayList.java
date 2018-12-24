/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w13;

import java.util.ArrayList;

/**
 *
 * @author msa
 */
public class TestArrayList {

    public static void main(String[] args) {
        // Create a list to store cities
        ArrayList cityList = new ArrayList();

        // Add some cities in the list
        cityList.add("London");

        // cityList now contains [London]
        cityList.add("Denver");
        // cityList now contains [London, Denver]
        cityList.add("Paris");
        // cityList now contains [London, Denver, Paris]
        cityList.add("Miami");
        // cityList now contains [London, Denver, Paris, Miami]
        cityList.add("Denver");
        // contains [London, Denver, Paris, Miami, Seoul]
        cityList.add("Tokyo");     
           cityList.add("istanbul");
        // contains [London, Denver, Paris, Miami, Seoul, Tokyo, istanbul]
        System.out.println(cityList.get(0));
        System.out.println("List size? " + cityList.size());
        System.out.println("Is Miami in the list? "
                + cityList.contains("Miami"));
        System.out.println("The location of Denver in the list? "
                + cityList.indexOf("Denver"));
         System.out.println("The location of Denver in the list? "
                + cityList.lastIndexOf("Denver"));
        System.out.println("Is the list empty? "
                + cityList.isEmpty()); // Print false
//
        // Insert a new city at index 2
        cityList.add(2, "giresun");
//        // contains [London, Denver, Xian, Paris, Miami, Seoul, Tokyo]
        System.out.println(cityList.get(3));
        // Remove a city from the list
        if (cityList.remove("Miami")){
            System.out.println("veri başarı ile silindi...");
        }else{
            System.out.println("veri listede bulunamadı...");
        }
        System.out.println(cityList.get(4));
    
        
//        // contains [London, Denver, Xian, Paris, Seoul, Tokyo]
//
        // Remove a city at index 1
        cityList.remove(1);
        System.out.println("----------------------");
        for (Object object : cityList) {
            System.out.println((String)object);
        }
        // contains [London, Xian, Paris, Seoul, Tokyo]

        // Display the contents in the list
        System.out.println(cityList.toString());

        // Display the contents in the list in reverse order
        for (int i = cityList.size() - 1; i >= 0; i--) {
            System.out.print(cityList.get(i) + " ");
        }
        System.out.println();

        // Create a list to store two circles
//    java.util.ArrayList list = new java.util.ArrayList();
        // Add two circles
//    list.add(new Circle4(2));
//    list.add(new Circle4(3));
//    
//    // Display the area of the first circle in the list
//    System.out.println("The area of the circle? " +
//      ((Circle4)list.get(0)).getArea());
    }
}
