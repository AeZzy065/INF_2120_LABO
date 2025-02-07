package Demo_v231_section3;

import java.util.Optional;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        String[] tableauString2 = new String[10];
        String[] tableauString = {"a", "b", "c", "d"};
        String elem = "d";
        PeutEtre trouverOuiNon = trouverElement(tableauString, elem);
        System.out.println(trouverOuiNon.estQQChose());
    }
    public static <T> PeutEtre<Integer> trouverElement( T[] a_tableau, T a_element ){
        int i = 0;
        PeutEtre<Integer> ouiNonDansTab;
        while ( a_tableau.length > i && !a_tableau[i].equals(a_element)){
            i++;
        }
        if (i >= a_tableau.length){
            ouiNonDansTab = new Rien<>();
        }else{
            ouiNonDansTab = new QQChose<>(i);
        }
        return ouiNonDansTab;
    }
    public static <T> Optional<Integer> trouverElementv2(T[] a_tableau, T a_element ){
        int i = 0;
        Optional<Integer> ouiNonDansTab;
        while ( a_tableau.length > i && !a_tableau[i].equals(a_element)){
            i++;
        }
        if (i >= a_tableau.length){
            ouiNonDansTab = new Optional<>();
        }else{
            ouiNonDansTab = new Optional<>(i);
        }
        return ouiNonDansTab;
    }
}