package org.example;

import java.util.ArrayList;
import java.util.List;

// Aggréger l'intégralité des items
public class HomeSystem {

    private final List<Item> items;

    // Initialiser la liste
    public HomeSystem() { this.items = new ArrayList<>(); }

    //Pour ajouter un item à la liste et renvoyer le résultat
    public boolean addItem(Item item){ return items.add(item); }

    // Pour récupérer la liste des items
    public List<Item> getItems() { return items; }
}
