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
        }
    }
}