package ibu.edu;

public class Task3 {
    public static void main(String[] args) {
        LyrraCard pekka = new LyrraCard(20);
        LyrraCard brian = new LyrraCard(30);

        pekka.payGourmet();
        brian.payEconomical();

        System.out.println("Pekka : " + pekka);
        System.out.println("Brian : " + brian);

        pekka.loadMoney(20);
        brian.payGourmet();

        System.out.println("Pekka : " + pekka);
        System.out.println("Brian : " + brian);

        pekka.payEconomical();
        pekka.payEconomical();

        brian.loadMoney(50);

        System.out.println("Pekka : " + pekka);
        System.out.println("Brian : " + brian);
    }
}
