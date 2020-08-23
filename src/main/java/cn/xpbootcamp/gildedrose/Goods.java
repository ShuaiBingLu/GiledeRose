package cn.xpbootcamp.gildedrose;

public class Goods {

    private static final String BACKSTAGE_PASS_GOODS = "BackstagePass";

    private static final String REGULAR_GOODS = "Regular";
    private int sellIn;

    private String goodsType;

    public int getSellIn() {
        return sellIn;
    }

    public double getQuality() {
        return quality;
    }

    private double quality;


    public Goods(String goodsType, double quality, int sellIn) {
        this.quality = quality;
        this.sellIn = sellIn;
        this.goodsType = goodsType;
    }

    private void updateRegularGoods() {
        decreaseQuality();
        sellIn = sellIn - 1;
        if (sellIn < 0) {
            decreaseQuality();
        }
    }

    private void updateStagePassGoods() {
        if (sellIn > 10) {
            increaseQuality(1);
        } else if (sellIn > 5) {
            increaseQuality(2);
        } else if (sellIn > 0) {
            increaseQuality(3);
        } else {
            quality = 0;
        }
        if (quality >= 50) {
            quality = 50;
        }
        sellIn = sellIn - 1;
    }

    public void update() {
        if (REGULAR_GOODS.equals(goodsType)) {
            updateRegularGoods();
        } else if (BACKSTAGE_PASS_GOODS.equals(goodsType)) {
            updateStagePassGoods();
        }
    }

    private void increaseQuality(double num) {
        quality = quality + num;
    }

    private void decreaseQuality() {
        if (quality > 0) {
            quality = quality - 1;
        }
    }
}
