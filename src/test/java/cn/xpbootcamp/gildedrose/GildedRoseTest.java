package cn.xpbootcamp.gildedrose;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class GildedRoseTest {

    @Test
    void should_quality_is_0_given_quality_is_0() {
        double quality = 0;
        int sellIn = 1;
        Goods goods = new Goods("Regular", quality, sellIn);
        goods.update();
        double updatedQuality = goods.getQuality();
        int updatedSellIn = goods.getSellIn();
        assertThat(updatedQuality).isEqualTo(0);
        assertThat(updatedSellIn).isEqualTo(sellIn - 1);
    }

    @Test
    void should_quality_and_sellIn_decrease_by_one_when_quality_between_0_50() {
        double quality = 5;
        int sellIn = 1;
        Goods goods = new Goods("Regular", quality, sellIn);
        goods.update();
        double updatedQuality = goods.getQuality();
        int updatedSellIn = goods.getSellIn();
        assertThat(updatedQuality).isEqualTo(quality - 1);
        assertThat(updatedSellIn).isEqualTo(sellIn - 1);
    }

    @Test
    void should_quality_and_sellIn_decrease_by_two_when_sellIn_less_0() {
        double quality = 5;
        int sellIn = 0;
        Goods goods = new Goods("Regular", quality, sellIn);
        goods.update();
        double updatedQuality = goods.getQuality();
        int updatedSellIn = goods.getSellIn();
        assertThat(updatedQuality).isEqualTo(quality - 2);
        assertThat(updatedSellIn).isEqualTo(sellIn - 1);
    }

    @Test
    void should_quality_is_0_when_quality_is_1() {
        double quality = 1;
        int sellIn = 0;
        Goods goods = new Goods("Regular", quality, sellIn);
        goods.update();
        double updatedQuality = goods.getQuality();
        int updatedSellIn = goods.getSellIn();
        assertThat(updatedQuality).isEqualTo(0);
        assertThat(updatedSellIn).isEqualTo(sellIn - 1);
    }

}
