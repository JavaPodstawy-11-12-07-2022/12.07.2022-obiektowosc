public class Client {
    String name;
    String surname;
    int age;
    long pesel;
    Address address;

    Client(String clientName, String surname, int age, long pesel) {
        this.name = clientName;
        this.surname = surname;
        this.age = age;
        this.pesel = pesel;
    }

    Client() {

    }

    int sum(int a, int b) {
        int result = a + b;
        return result;
    }

    double sum(double a, double b) {
        return a + b;
    }

    void wypiszNaEkranieLiczbe(int liczba) {
        System.out.println(liczba);
        // algorytm
    }

    void metoda() {
        System.out.println(this.name);
    }
}
