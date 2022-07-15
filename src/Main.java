public class Main {
    public static void main(String[] args) {
        Client c1 = new Client();
        String[] tab = new String[10];
        int a = 5;
        Client c2 = new Client();

        c2.name = "Mateusz";
        c2.surname = "Bereda";
        c2.age = 32;

        c1.name = "Janusz";
        c1.surname = "Kowalski";
        c1.age = 40;

        String s = "ABC";

        c1.address = new Address();
        c1.address.ulica = "Ogrodowa";

        Client[] clients = new Client[100];

        clients[0] = c1;
        clients[1] = c2;

        System.out.println(c2.name);
        System.out.println(c2.surname);
        System.out.println(c2.age);

        /*for (Client client : clients) {
            System.out.println(client.name);
            System.out.println(client.surname);
            System.out.println(client.age);
        }*/

        int wynikKlienta = c1.sum(38,19);
        System.out.println(wynikKlienta);
        c1.wypiszNaEkranieLiczbe(33);

        c1.sum(1,2);
        c1.sum(1.1, 2.2);

        c1.metoda();

        Client client1 = new Client("Mateusz", "Bereda", 30, 23453453455L);

        System.out.println(client1.name);
        System.out.println(client1.surname);
        System.out.println(client1.age);
        System.out.println(client1.pesel);

        c1.metoda();
        c2.metoda();
    }
}
