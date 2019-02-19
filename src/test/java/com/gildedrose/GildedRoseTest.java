package com.gildedrose;

import static org.junit.Assert.*;

import org.junit.Test;

public class GildedRoseTest {

    @Test
    public void BrieGoesUp(){
        Item[] brie = new Item[]{new Item("Aged Brie", 2, 0)};
        GildedRose gr = new GildedRose(brie);
        gr.updateQuality();
        assertEquals(1, brie[0].quality);
    }

    @Test
    public void SulfurasStaystheSame(){
        Item[] Sulfuras = new Item[]{new Item("Sulfuras, Hand of Ragnaros", 2, 80)};
        GildedRose gr = new GildedRose(Sulfuras);
        gr.updateQuality();
        assertEquals(80, Sulfuras[0].quality);
        for(int i=0 ; i<= 80 ; i++) {
            gr.updateQuality();
        }
        assertEquals(80, Sulfuras[0].quality);
    }

    @Test
    public void SulfurasIs80(){
        Item[] Sulfuras = new Item[]{new Item("Sulfuras, Hand of Ragnaros", 2, 0)};
        GildedRose gr = new GildedRose(Sulfuras);
        gr.updateQuality();
        assertEquals(80, Sulfuras[0].quality);
    }
}
