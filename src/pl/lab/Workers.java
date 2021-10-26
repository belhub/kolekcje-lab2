package pl.lab;

public class Workers {
    private final String Imie;
    private final String Nazwisko;
    private final String Stanowisko;


    Workers(String imie, String nazwisko, String stanowisko){
        this.Imie=imie;
        this.Nazwisko=nazwisko;
        this.Stanowisko=stanowisko;
    }

    public String getNazwisko() {
        return Nazwisko;
    }

    public String getImie() {
        return Imie;
    }

    public String getStanowisko() {
        return Stanowisko;
    }

}
