package pl.lab;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        int menu = 0;

        Scanner scanner = new Scanner(System.in);

        while (true){
            switch (menu){
                case 0:
                    System.out.println("1: Dodawanie objektów do różnych kolekcji:");
                    System.out.println("2: Złączenie i rozłączenie kolekcji");
                    System.out.println("3: Wyjście z programu");
                    menu = scanner.nextInt();
                    break;

                case 1:
                    startMain();
                    menu=0;
                    break;
                case 2:
                    combineCollection();
                    menu=0;
                    break;

                case 3:
                    System.exit(0);
                    break;
                }
        }
    }

    public static void startMain() {

            //Stworzenie pracowników, których potem będziemy osadzać w kolekcjach
        Workers worker1 = new Workers("Wiesław", "Kowalski", "Murarz");
        Workers worker2 = new Workers("Adam", "Nowak", "Tynkarz");
        Workers worker3 = new Workers("Kamil", "Ślimak", "Akrobata");

        boolean status=true;

        Scanner scanner = new Scanner(System.in);

        while (status){

            System.out.println("Dodawanie do kolekcji za pomocą: 1:ArrayList   2:LinkedList   3:HashMap   4:HashTree   5:HashSet   6:TreeSet   7:Koniec");
            int choice = scanner.nextInt();
            int remove;

            switch (choice) {
                case 1:
                    System.out.println("Dodawanie do kolekcji Arraylist");
                    ArrayList<Workers> workersArray = new ArrayList<>();
                    workersArray.add(worker1);
                    workersArray.add(worker2);
                    workersArray.add(worker3);
                    workersArray.add(worker3);

                    System.out.println("ArrayList: ");
                    for (Workers k : workersArray) {
                        System.out.println((k).getImie() + " " + (k).getNazwisko() + " - " + (k).getStanowisko());
                    }
                    System.out.println("- - - - - - - - - - - -");

                    System.out.println("Czy chcesz usunąć Użytkownika? (1-Tak   0-Nie)");

                    remove = scanner.nextInt();
                    if (remove == 1) {
                        workersArray.remove(worker1);
                        for (Workers k : workersArray) {
                            System.out.println((k).getImie() + " " + (k).getNazwisko() + " - " + (k).getStanowisko());
                        }
                        System.out.println("- - - - - - - - - - - -");

                    } else if (remove == 0) {
                        break;

                    } else {
                        System.out.println("Wpisz poprawną wartość");
                    }
                    break;
                case 2:
                    System.out.println("Dodawanie do kolekcji Linkedlist");
                    //Dodawanie i wyświetlanie użytkowników do kolekcji LinkedList
                    LinkedList<Workers> workersLinked = new LinkedList<>();
                    workersLinked.add(worker1);
                    workersLinked.add(worker2);
                    workersLinked.add(worker3);
                    workersLinked.add(worker3);

                    System.out.println("LinkedList: ");
                    for (Workers k : workersLinked) {
                        System.out.println(k.getImie() + " " + k.getNazwisko() + " - " + k.getStanowisko());
                    }
                    System.out.println("- - - - - - - - - - - -");

                    System.out.println("Czy chcesz usunąć Użytkownika? (1-Tak   0-Nie)");
                    remove = scanner.nextInt();

                    if (remove == 1) {
                        workersLinked.remove(worker1);
                        for (Workers k : workersLinked) {
                            System.out.println(k.getImie() + " " + k.getNazwisko() + " - " + k.getStanowisko());
                        }
                        System.out.println("- - - - - - - - - - - -");
                    } else if (remove == 0) {
                        break;
                    } else {
                        System.out.println("Wpisz poprawną wartość");
                    }
                    break;

                case 3:
                    System.out.println("Dodawanie do kolekcji HashMap");
                    HashMap<Integer, Workers> workersHashMap = new HashMap<>();
                    workersHashMap.put(1, worker1);
                    workersHashMap.put(2, worker2);
                    workersHashMap.put(3, worker3);
                    workersHashMap.put(4, worker3);

                    System.out.println("HashMap: ");

                    for (Workers k : workersHashMap.values()) {
                        System.out.println(k.getImie() + " " + k.getNazwisko() + " - " + k.getStanowisko());
                    }
                    System.out.println("- - - - - - - - - - - -");

                    System.out.println("Czy chcesz usunąć Użytkownika? (1-Tak   0-Nie)");
                    remove = scanner.nextInt();
                    if (remove == 1) {
                        workersHashMap.remove(1);
                        for (Workers k : workersHashMap.values()) {
                            System.out.println(k.getImie() + " " + k.getNazwisko() + " - " + k.getStanowisko());
                        }
                        System.out.println("- - - - - - - - - - - -");

                    } else if (remove == 0) {
                        break;
                    } else {
                        System.out.println("Wpisz poprawną wartość");
                    }
                    break;

                case 4:
                    System.out.println("Dodawanie do kolekcji TreeMap");
                    Map<Integer, Workers> workersTreeMap = new TreeMap<>();

                    workersTreeMap.put(1, worker1);
                    workersTreeMap.put(2, worker2);
                    workersTreeMap.put(3, worker3);
                    workersTreeMap.put(4, worker3);

                    System.out.println("TreeMap: ");
                    for (Workers k : workersTreeMap.values()) {
                        System.out.println(k.getImie() + " " + k.getNazwisko() + " - " + k.getStanowisko());
                    }
                    System.out.println("- - - - - - - - - - - -");

                    System.out.println("Czy chcesz usunąć Użytkownika? (1-Tak   0-Nie)");
                    remove = scanner.nextInt();
                    if (remove == 1) {
                        workersTreeMap.remove(1);
                        for (Workers k : workersTreeMap.values()) {
                            System.out.println(k.getImie() + " " + k.getNazwisko() + " - " + k.getStanowisko());
                        }
                        System.out.println("- - - - - - - - - - - -");

                    } else if (remove == 0) {
                        break;
                    } else {
                        System.out.println("Wpisz poprawną wartość");
                    }
                    break;

                case 5:
                    System.out.println("Dodawanie do kolekcji HashSet");
                    HashSet<Workers> workersHashSet = new HashSet<>();
                    workersHashSet.add(worker1);
                    workersHashSet.add(worker2);
                    workersHashSet.add(worker3);
                    workersHashSet.add(worker3);

                    System.out.println("HashSet: ");
                    for (Workers k : workersHashSet) {
                        System.out.println(k.getImie() + " " + k.getNazwisko() + " - " + k.getStanowisko());
                    }
                    System.out.println("- - - - - - - - - - - -");

                    System.out.println("Czy chcesz usunąć Użytkownika? (1-Tak   0-Nie)");
                    remove = scanner.nextInt();
                    if (remove == 1) {
                        workersHashSet.remove(worker1);
                        for (Workers k : workersHashSet) {
                            System.out.println(k.getImie() + " " + k.getNazwisko() + " - " + k.getStanowisko());
                        }
                        System.out.println("- - - - - - - - - - - -");

                    } else if (remove == 0) {
                        break;
                    } else {
                        System.out.println("Wpisz poprawną wartość");
                    }
                    break;

                case 6:
                    System.out.println("Dodawanie za do kolekcji TreeSet");
                    Set<Workers> workersTreeSet = new TreeSet<>(new Tree_SetComparator());
                    workersTreeSet.add(worker1);
                    workersTreeSet.add(worker2);
                    workersTreeSet.add(worker3);
                    workersTreeSet.add(worker3);

                    System.out.println("TreeSet: ");

                    for (Workers k : workersTreeSet) {
                        System.out.println(k.getImie() + " " + k.getNazwisko() + " - " + k.getStanowisko());
                    }
                    System.out.println("- - - - - - - - - - - -");

                    System.out.println("Czy chcesz usunąć Użytkownika? (1-Tak   0-Nie)");
                    remove = scanner.nextInt();
                    if (remove == 1) {
                        workersTreeSet.remove(worker1);

                    } else if (remove == 0) {
                        break;
                    } else {
                        System.out.println("Wpisz poprawną wartość");
                    }
                    break;
                case 7:
                    status=false;
            }
        }
    }

        //Dla kolekcji tree map potrzebujemy komparatora aby wyświetłał pracowników
    static class Tree_SetComparator implements Comparator<Workers>{
        @Override
        public int compare(Workers o1, Workers o2) {
            return 0 ;
        }
    }

    public static void combineCollection(){
        //Stworzenie pracowników, których potem będziemy osadzać w kolekcjach
        Workers worker1 = new Workers("Wiesław", "Kowalski", "Murarz");
        Workers worker2 = new Workers("Adam", "Nowak", "Tynkarz");
        Workers worker3 = new Workers("Kamil", "Ślimak", "Akrobata");
        //Dodawanie i wyświetlanie użytkowników do kolekcji ArrayList
        ArrayList<Workers> workersArray = new ArrayList<>();
        workersArray.add(worker1);
        workersArray.add(worker2);
        workersArray.add(worker3);
        workersArray.add(worker3);

        //Dodawanie i wyświetlanie użytkowników do kolekcji LinkedList
        LinkedList<Workers> workersLinked = new LinkedList<>();
        workersLinked.add(worker1);
        workersLinked.add(worker2);
        workersLinked.add(worker3);
        workersLinked.add(worker3);
        //łączenie kolekcji
        System.out.println("Łączenie kolekcji: ");
        ArrayList<Workers> combineList = new ArrayList<>();
        combineList.addAll(workersArray);
        combineList.addAll(workersLinked);

        for (Workers k: combineList){
            System.out.println(k.getImie()+" "+k.getNazwisko()+" - "+k.getStanowisko());
        }
        System.out.println("- - - - - - - - - - - -");

        //rozdzielanie kolekcji combineList i podział objektów do kolekcji

        System.out.println("Rozdzielone Listy: ");
        int sizeCombineList = combineList.size();
        int halfSize = sizeCombineList/2;

        List<Workers> workersArray2 = combineList.subList(0,halfSize);
        List<Workers> workersLinked2 = combineList.subList(halfSize,sizeCombineList);

        System.out.println("Lista1: ");
        for(Workers k : workersArray2) {
            System.out.println((k).getImie() + " " + (k).getNazwisko() + " - " + (k).getStanowisko());
        }
        System.out.println("- - - - - - - - - - - -");

        System.out.println("Lista2: ");
        for(Workers k : workersLinked2) {
            System.out.println((k).getImie() + " " + (k).getNazwisko() + " - " + (k).getStanowisko());
        }
        System.out.println("- - - - - - - - - - - -");

    }
}
