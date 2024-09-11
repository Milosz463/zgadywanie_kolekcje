import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //tablica
        //musi miec z gory okreslony rozmiar
        // nie mozna go pozniej zmienic
        //elementem tablicy moga byc typy proste i zlozone
        //tablica z wartosciamy losowym od 1 do 100 6 elementow
        int tablicaLosowa[]= new int[6];
        for (int i = 0; i < tablicaLosowa.length; i++) {
            tablicaLosowa[i]=(int) (Math.random()*100+1);

        }
        //wypisywanie elementow tablicy
        for (int element:tablicaLosowa) {
            System.out.println(element+", ");
            //kolekcje, elementy typami zlozonymi
            //nie musza miec zdefiniowanego rozmiaru
            //rozmiar w trakcie mozna zmieniac
            //listy list, zbiory Set, mapy

            //wstawianie liczb z klawiaury do kolekcji
            List<Integer> listaLiczbWpisanycg = new ArrayList<>();
            System.out.println("Podaj 6 liczb");
            Scanner dane= new Scanner(System.in);
            for (int i = 0; i < 6; i++) {
                int klawiatura=dane.nextInt();
                listaLiczbWpisanycg.add(klawiatura);
            }
            System.out.println("Wstawiono liczby:");
            for (Integer LiczbaWpisana:listaLiczbWpisanycg) {
                System.out.println(LiczbaWpisana);
            }
            //Wypisywanie inaczej
            for (int i = 0; i < listaLiczbWpisanycg.size(); i++) {
                System.out.println(listaLiczbWpisanycg.get(i));
            }
        }
//Losowanie licz bez powtorzen
        ArrayList<Integer> ListaLosowychBezPowtorzen= new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            int liczba=(int) (Math.random()*100+1);
            while (ListaLosowychBezPowtorzen.contains(liczba)){
                liczba=(int) (Math.random()*100+1);
            }
            ListaLosowychBezPowtorzen.add(liczba);

        }
//wypisywanie
        System.out.println("Wylosowano bez powtorzen");
        System.out.println(ListaLosowychBezPowtorzen);
    }
}