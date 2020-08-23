package cn.xpbootcamp.gildedrose;

public class Goods {
    private int sellIn;

    public int getSellIn() {
        return sellIn;
    }

    public void setSellIn(int sellIn) {
        this.sellIn = sellIn;
    }

    public double getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }

    private double quality;


    public Goods(String regular, double quality, int sellIn) {
        this.quality = quality;
        this.sellIn = sellIn;
    }

    public void update() {
        decreaseQuality();
        sellIn = sellIn - 1;
        if (sellIn < 0) {
            decreaseQuality();
        }
    }

    private void decreaseQuality() {
        if (quality > 0) {
            quality = quality - 1;
        }
    }
}
