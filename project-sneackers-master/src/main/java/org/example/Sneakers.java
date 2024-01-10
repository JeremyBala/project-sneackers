package org.example;

public class Sneakers extends Item{

    private int sneakersSize;

    public int getSneakersSize() { return sneakersSize; }
    public void setSneakersSize(int sneakersSize) { this.sneakersSize = sneakersSize; }

    @Override
    public String getTypeName() {
        return "Sneakers";
    }

    @Override
    public String getDescription() {
        return "Marque : " +  brand + " - Pointure : " + sneakersSize;
    }


    /*public static Sneakers getInstance() {
        return ;
    }*/
}
