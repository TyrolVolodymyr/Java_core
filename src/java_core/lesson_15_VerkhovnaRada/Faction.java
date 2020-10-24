package java_core.lesson_15_VerkhovnaRada;

import java.util.*;

public class Faction {

    private List<Deputy> listDeputy = new ArrayList<>();
    private String factionName;

    Scanner scanner = new Scanner(System.in);

    public Faction(String factionName) {
        this.factionName = factionName;
    }

    public String getFactionName() {
        return factionName;
    }

    public void setFactionName(String factionName) {
        this.factionName = factionName;
    }

    public void addDeputy() {
        System.out.println("add Deputy");
        System.out.println("");
        System.out.println("weight = ");
        int weight = scanner.nextInt();
        System.out.println("height = ");
        int height = scanner.nextInt();
        System.out.println("firstName = ");
        String firstName = scanner.next();
        System.out.println("lastName = ");
        String lastName = scanner.next();
        System.out.println("age = ");
        int age = scanner.nextInt();
        System.out.println("grafter = ");
        boolean grafter = scanner.nextBoolean();
        listDeputy.add(new Deputy(weight, height, firstName, lastName, age, grafter));
    }

    public String deputyExist() {
        boolean deputyExist = true;
        String clientDeputyChoose = null;

        while (deputyExist) {
            System.out.println("Please choose Deputy by first Name:");
            clientDeputyChoose = scanner.next();
            for (int i = 0; i < listDeputy.size(); i++) {
                if (clientDeputyChoose.equalsIgnoreCase(listDeputy.get(i).getFirstName())) {
                    clientDeputyChoose = listDeputy.get(i).getFirstName();
                    System.out.println("Deputy Found: " + clientDeputyChoose);
                    deputyExist = false;
                }
            }
            if (deputyExist) {
                System.out.println("i can't find that " + clientDeputyChoose + " please try again");
                System.out.println("");
            }
        }
        return clientDeputyChoose;
    }

    public void removeDeputyInFaction() {
        System.out.println("remove Deputy In Faction");
        System.out.println();
        for (int i = 0; i < listDeputy.size(); i++) {
            if (listDeputy.get(i).getFirstName().equalsIgnoreCase(deputyExist())) {
                listDeputy.remove(i);
            }
        }
    }

    public void showAllGrafters() {
        System.out.println("show All Grafters");
        System.out.println();
        for (int i = 0; i < listDeputy.size(); i++) {
            if (listDeputy.get(i).isGrafter()) {
                System.out.println(listDeputy.get(i));
            }
        }
    }

    public void giveBribe() {
        System.out.println("giveBribe");
        System.out.println();
        for (int i = 0; i < listDeputy.size(); i++) {
            if (listDeputy.get(i).getFirstName().equalsIgnoreCase(deputyExist())) {
                listDeputy.get(i).giveBribe();
            }
        }
    }

    public void showBiggerGrafter() {
        System.out.println("show Bigger Grafter");
        System.out.println();
        int maxBribeAmount = 0;
        int id = 0;
        for (int i = 0; i < listDeputy.size(); i++) {
            if (listDeputy.get(i).getBribeAmount() > maxBribeAmount) {
                maxBribeAmount = listDeputy.get(i).getBribeAmount();
                id = i;
            }
        }
        System.out.println("maxBriber = " + listDeputy.get(id));
    }

    public void showAllDeputyInFaction() {
        System.out.println("show All Deputy In Faction");
        System.out.println();
        for (int i = 0; i < listDeputy.size(); i++) {
            System.out.println(listDeputy.get(i));
        }
    }

    public void removeALLDeputyInFaction() {
        System.out.println("remove ALL Deputy In Faction");
        System.out.println("");
        listDeputy.clear();
        System.out.println("ALL Deputy In Faction are Removed");
    }

    @Override
    public String toString() {
        return "faction Name = '" + factionName + "' ";
    }
}
