package cn.xpbootcamp.gildedrose;

public class Goods {
    private int sellIn;

    private String goodsType;

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


    public Goods(String goodsType, double quality, int sellIn) {
        this.quality = quality;
        this.sellIn = sellIn;
        this.goodsType = goodsType;
    }

    public void update() {
        if (goodsType.equals("Regular")) {
            decreaseQuality();
            sellIn = sellIn - 1;
            if (sellIn < 0) {
                decreaseQuality();
            }
        } else {
            if (sellIn > 10) {
                quality = quality + 1;
            } else if (sellIn > 5) {
                quality = quality + 2;
            } else if (sellIn > 0) {
                quality = quality + 3;
            } else {
                quality = 0;
            }
            if (quality >= 50) {
                quality = 50;
            }
            sellIn = sellIn - 1;
        }
    }

    private void decreaseQuality() {
        if (quality > 0) {
            quality = quality - 1;
        }
    }
}
