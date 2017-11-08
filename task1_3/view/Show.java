package task1_3.view;

import task1_3.execute.Pyramid;

public class Show {


    public static void main(String[] args){
        Pyramid P = new Pyramid();

       int[][] Z = P.buildPyramid(9);


        for (int count[]: Z) {
            System.out.println("\n");
            for (int i: count) {
                System.out.print(P.transform(i));
            }
        }


        System.out.println("");
        System.out.println("   Flawless     Victory!!! ");
    }

}
