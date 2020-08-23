package cn.xpbootcamp.gildedrose;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BackstagePassTest {

    @Test
    void should_quality_increase_one_when_sellIn_exceed_ten() {
        double quality = 20;
        int sellIn = 15;
        Goods goods = new Goods("BackstagePass", quality, sellIn);
        goods.update();
        double updatedQuality = goods.getQuality();
        int updatedSellIn = goods.getSellIn();
        assertThat(updatedQuality).isEqualTo(21);
        assertThat(updatedSellIn).isEqualTo(sellIn - 1);
    }

    @Test
    void should_quality_increase_two_when_sellIn_before_ten() {
        double quality = 45;
        int sellIn = 10;
        Goods goods = new Goods("BackstagePass", quality, sellIn);
        goods.update();
        double updatedQuality = goods.getQuality();
        int updatedSellIn = goods.getSellIn();
        assertThat(updatedQuality).isEqualTo(47);
        assertThat(updatedSellIn).isEqualTo(sellIn - 1);
    }

    @Test
    void should_quality_increase_when_quality_exceed_50() {
        double quality = 49;
        int sellIn = 10;
        Goods goods = new Goods("BackstagePass", quality, sellIn);
        goods.update();
        double updatedQuality = goods.getQuality();
        int updatedSellIn = goods.getSellIn();
        assertThat(updatedQuality).isEqualTo(50);
        assertThat(updatedSellIn).isEqualTo(sellIn - 1);
    }

    @Test
    void should_quality_increase_three_when_sellIn_before_five() {
        double quality = 45;
        int sellIn = 5;
        Goods goods = new Goods("BackstagePass", quality, sellIn);
        goods.update();
        double updatedQuality = goods.getQuality();
        int updatedSellIn = goods.getSellIn();
        assertThat(updatedQuality).isEqualTo(48);
        assertThat(updatedSellIn).isEqualTo(sellIn - 1);
    }

    @Test
    void should_quality_is_zero_when_sellIn_is_zero() {
        double quality = 20;
        int sellIn = 0;
        Goods goods = new Goods("BackstagePass", quality, sellIn);
        goods.update();
        double updatedQuality = goods.getQuality();
        int updatedSellIn = goods.getSellIn();
        assertThat(updatedQuality).isEqualTo(0);
        assertThat(updatedSellIn).isEqualTo(sellIn - 1);
    }
}
