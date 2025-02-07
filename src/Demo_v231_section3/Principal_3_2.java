package Demo_v231_section3;

import java.util.*;

public class Principal_3_2 {
    public static void main(String[] args) {

        System.out.println(tweens(1,3,4));
    }

    public static ArrayList<Double> tweens(double depart, double fin, int nbrInterval) {
        double bonds = (fin - depart)/nbrInterval;
        ArrayList<Double> listeInterval = new ArrayList<>();
        listeInterval.add(depart);
        for (int i = 0; nbrInterval > i; ++i ){
            listeInterval.add(listeInterval.get(i) + bonds);
        }
        return  listeInterval;
    }
}

