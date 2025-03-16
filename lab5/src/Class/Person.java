package Class;


public class Person {
    // pola
    String firstName, lastName;
    int age;
    String nrAlbumu, kierunek;
    final int wiek = 34;
    public Adres adres;

    public Person(String firstName, Adres adres) {
        this.firstName = firstName;

        this.adres = adres;
    }
    //getery

    public final void Wypiszwiek(int wiek){
        System.out.println("Metoda "+ wiek);
    }


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getNrAlbumu() {
        return nrAlbumu;
    }

    public String getKierunek() {
        return kierunek;
    }

    //setery
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNrAlbumu(String nrAlbumu) {
        this.nrAlbumu = nrAlbumu;
    }

    public void setKierunek(String kierunek) {
        this.kierunek = kierunek;
    }

    //metody
    public void View(){
        System.out.println("Imie: "+firstName
                +"\nNazwisko: "+ lastName
                +"\nKierunek st: "+ kierunek
                 +"\nNr albumu: "+ nrAlbumu);
    }

    public String PersonData(){
        return "Witaj: "+ firstName + " " + lastName+" twoj wiek: "+ age;
    }
    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", nrAlbumu='" + nrAlbumu + '\'' +
                ", kierunek='" + kierunek + '\'' +
                '}';
    }

    //konstruktor
    //Alt+Insert
    public Person(String firstName, String lastName, int age, String nrAlbumu, String kierunek) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.nrAlbumu = nrAlbumu;
        this.kierunek = kierunek;
    }

    public Person(){
        this.firstName = null;
        this.lastName = null;
        this.age = 0;
        this.nrAlbumu = null;
        this.kierunek = null;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }


}
