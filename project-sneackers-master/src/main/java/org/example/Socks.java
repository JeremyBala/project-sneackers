package org.example;

public class Socks extends Item{

    private int socksSize;

    public int getSocksSize() { return socksSize; }
    public void setSocksSize(int socksSize) { this.socksSize = socksSize; }

    @Override
    public String getTypeName() {
        return "Socks";
    }

    @Override
    public String getDescription() {
        return "Marque : " +  brand + " - Pointure : " + socksSize;
    }
}
