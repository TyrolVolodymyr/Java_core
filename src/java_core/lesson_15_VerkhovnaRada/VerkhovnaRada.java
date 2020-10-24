package java_core.lesson_15_VerkhovnaRada;

import java.util.*;

public class VerkhovnaRada {

    Scanner scanner = new Scanner(System.in);
    private static VerkhovnaRada instance;

    private VerkhovnaRada() {
    }

    public static VerkhovnaRada getInstance() {
        if (instance == null) {        //если объект еще не создан
            instance = new VerkhovnaRada();    //создать новый объект
        }
        return instance;        // вернуть ранее созданный объект
    }

    private List<Faction> listFaction = new ArrayList<>();

    public void addFaction() {
        System.out.println("add Faction");
        System.out.println();
        System.out.println("factionName = ");
        String factionName = new Scanner(System.in).next();
        listFaction.add(new Faction(factionName));
    }

    public String factionExist() {
        boolean factionExist = true;
        String clientFactionChoose = null;

        while (factionExist) {
            System.out.println("Please choose Faction by Name:");
            clientFactionChoose = scanner.next();
            for (int i = 0; i < listFaction.size(); i++) {
                if (clientFactionChoose.equalsIgnoreCase(listFaction.get(i).getFactionName())) {
                    clientFactionChoose = listFaction.get(i).getFactionName();
                    System.out.println("Faction Found: " + clientFactionChoose);
                    factionExist = false;
                }
            }
            if (factionExist) {
                System.out.println("i can't find that " + clientFactionChoose + " please try again");
                System.out.println("");
            }
        }
        return clientFactionChoose;
    }

    public void removeFraction() {
        System.out.println("remove Fraction");
        System.out.println();
        showFactions();
        System.out.println();
        for (int i = 0; i < listFaction.size(); i++) {
            if (listFaction.get(i).getFactionName().equalsIgnoreCase(factionExist())) {
                listFaction.remove(i);
                break;
            }
        }
    }

    public void clearFraction() {
        System.out.println("clear Fraction");
        System.out.println();
        showFactions();
        System.out.println();
        for (int i = 0; i < listFaction.size(); i++) {
            if (listFaction.get(i).getFactionName().equalsIgnoreCase(factionExist())) {
                listFaction.get(i).removeALLDeputyInFaction();
                break;
            }
        }
    }

    public void showFaction() {
        System.out.println("show Fraction");
        System.out.println();
        showFactions();
        System.out.println();
        for (int i = 0; i < listFaction.size(); i++) {
            if (listFaction.get(i).getFactionName().equalsIgnoreCase(factionExist())) {
                listFaction.get(i).showAllDeputyInFaction();
                break;
            }
        }
    }

    public void addDeputyToFraction() {
        System.out.println("add Deputy To Fraction");
        System.out.println();
        showFactions();
        System.out.println();
        for (int i = 0; i < listFaction.size(); i++) {
            if (listFaction.get(i).getFactionName().equalsIgnoreCase(factionExist())) {
                listFaction.get(i).addDeputy();
                break;
            }
        }
    }

    public void removeDeputyInFaction() {
        System.out.println("clear Fraction");
        System.out.println();
        showFactions();
        System.out.println();
        for (int i = 0; i < listFaction.size(); i++) {
            if (listFaction.get(i).getFactionName().equalsIgnoreCase(factionExist())) {
                listFaction.get(i).removeDeputyInFaction();
                break;
            }
        }
    }

    public void showAllGraftersInFaction() {
        System.out.println("clear Fraction");
        System.out.println();
        showFactions();
        System.out.println();
        for (int i = 0; i < listFaction.size(); i++) {
            if (listFaction.get(i).getFactionName().equalsIgnoreCase(factionExist())) {
                listFaction.get(i).showAllGrafters();
                break;
            }
        }
    }

    public void showBiggerGrafterInFaction() {
        System.out.println("clear Fraction");
        System.out.println();
        showFactions();
        System.out.println();
        for (int i = 0; i < listFaction.size(); i++) {
            if (listFaction.get(i).getFactionName().equalsIgnoreCase(factionExist())) {
                listFaction.get(i).showBiggerGrafter();
                break;
            }
        }
    }

    public void showFactions() {
        for (int i = 0; i < listFaction.size(); i++) {
            System.out.println(listFaction.get(i));
        }

    }
}
