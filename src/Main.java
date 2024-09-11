import java.util.*;

public class Main {
    public static void main(String[] args) {

        //tablica
        //musi miec z gory okreslony rozmiar
        // nie mozna go pozniej zmienic
        //elementem tablicy moga byc typy proste i zlozone
        //tablica z wartosciamy losowym od 1 do 100 6 elementow
        int tablicaLosowa[] = new int[6];
        for (int i = 0; i < tablicaLosowa.length; i++) {
            tablicaLosowa[i] = (int) (Math.random() * 100 + 1);

        }
        //wypisywanie elementow tablicy
        for (int element : tablicaLosowa) {
            System.out.println(element + ", ");
        }
        //kolekcje, elementy typami zlozonymi
        //nie musza miec zdefiniowanego rozmiaru
        //rozmiar w trakcie mozna zmieniac
        //listy list, zbiory Set, mapy

        //wstawianie liczb z klawiaury do kolekcji
        ArrayList<Integer> listaLiczbWpisanycg = new ArrayList<>();
        System.out.println("Podaj 6 liczb");
        Scanner dane = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            int klawiatura = dane.nextInt();
            listaLiczbWpisanycg.add(klawiatura);
        }
        System.out.println("Wstawiono liczby:");
        for (Integer LiczbaWpisana : listaLiczbWpisanycg) {
            System.out.println(LiczbaWpisana);
        }
        //Wypisywanie inaczej
        for (int i = 0; i < listaLiczbWpisanycg.size(); i++) {
            System.out.println(listaLiczbWpisanycg.get(i));
        }

//Losowanie licz bez powtorzen
        ArrayList<Integer> ListaLosowychBezPowtorzen = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            int liczba = (int) (Math.random() * 100 + 1);
            while (ListaLosowychBezPowtorzen.contains(liczba)) {
                liczba = (int) (Math.random() * 100 + 1);
            }
            ListaLosowychBezPowtorzen.add(liczba);

        }
//wypisywanie
        System.out.println("Wylosowano bez powtorzen");
        System.out.println(ListaLosowychBezPowtorzen);
        //losowanie bez powtorzen do zbioru
        HashSet<Integer> zbiorLiczbLosowych = new HashSet<>();
        while (zbiorLiczbLosowych.size() < 6) {
            int liczba = (int) (Math.random() * 100 + 1);
            zbiorLiczbLosowych.add(liczba);
        }
        System.out.println(zbiorLiczbLosowych);
        //lista
        /*
        elementy moga sie powtarzac
        elementy sa indeksowane
         */
        //zbior zazwyczaj
        /*
        elementy unikatowe
        elementy nie sa indeksowane
         */

        LinkedList<Integer> trafione = new LinkedList<>();
        //trafione to elementy ktore wystepuja w wylosowanych i wypisanych
        for (Integer wpisana : listaLiczbWpisanycg) {
            if (zbiorLiczbLosowych.contains(wpisana)) {
                trafione.add(wpisana);
            }
        }
        System.out.println("Trafione: " + trafione);
    }
    //metody


    /**
     * Metoda wylosujLiczby losuje liczby calkowite z zakresu od 1 do 100
     *
     * @param ile liczba calkowita przechowquje ile liczb wylosujemy
     * @return lista z wylosowanymi liczbami
     */
    private ArrayList<Integer> wylosujLiczby(int ile) {
        ArrayList<Integer> ListaLosowychBezPowtorzen = new ArrayList<>();
        for (int i = 0; i < ile; i++) {
            int liczba = (int) (Math.random() * 100 + 1);
            while (ListaLosowychBezPowtorzen.contains(liczba)) {
                liczba = (int) (Math.random() * 100 + 1);
            }
            ListaLosowychBezPowtorzen.add(liczba);

        }


        return ListaLosowychBezPowtorzen;
    }

    private ArrayList<Integer> wpiszLiczbyzKlawiatury(int ile) {
        ArrayList<Integer> listaLiczbWpisanycg = new ArrayList<>();
        System.out.println("Podaj" + ile + "liczb");
        Scanner dane = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            int klawiatura = dane.nextInt();
            listaLiczbWpisanycg.add(klawiatura);
        }
        System.out.println("Wstawiono liczby:");
        for (Integer LiczbaWpisana : listaLiczbWpisanycg) {
            System.out.println(LiczbaWpisana);
        }
        return listaLiczbWpisanycg;

    }
    private void wypiszKolekcję(List<Integer> listaDoWypisania){
        for (Integer element:listaDoWypisania) {
            System.out.println("Element:"+element);
        }
    }
    private LinkedList<Integer> zwrocTrafione(ArrayList<Integer> listaLiczbWpisanych,
                                              ArrayList<Integer>listaLiczbLosowych){
        LinkedList<Integer> trafione =new LinkedList<>();
        //trafiione to elementy które występują w wylosowanych i wpisanych
        for (Integer wpisana: listaLiczbWpisanych) {
            if(listaLiczbLosowych.contains(wpisana)){
                trafione.add(wpisana);
            }
        }
        return trafione;
    }
}
