package pl.lab;

public class WorkesOther {

    private String Imie;
    private String Nazwisko;
    private String Stanowisko;


    WorkesOther(String imie, String nazwisko, String stanowisko){
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        WorkesOther that = (WorkesOther) o;

        if (Imie != null ? !Imie.equals(that.Imie) : that.Imie != null) return false;
        if (Nazwisko != null ? !Nazwisko.equals(that.Nazwisko) : that.Nazwisko != null) return false;
        return Stanowisko != null ? Stanowisko.equals(that.Stanowisko) : that.Stanowisko == null;
    }

    @Override
    public int hashCode() {
        int result = Imie != null ? Imie.hashCode() : 0;
        result = 31 * result + (Nazwisko != null ? Nazwisko.hashCode() : 0);
        result = 31 * result + (Stanowisko != null ? Stanowisko.hashCode() : 0);
        return result;
    }
}
