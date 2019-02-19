package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void update(Item item) {
        switch(item.name)
        {
            case "Sulfuras, Hand of Ragnaros":
            {
                item.quality = 80;
                break;
            }
            case "Aged Brie":
            {
                if (item.quality < 50) {
                    item.quality = item.quality + 1;
                }
                break;
            }
            case "Backstage passes to a TAFKAL80ETC concert":
            {
                if (item.quality < 50) {
                    item.quality = item.quality + 1;
                }
                if (item.sellIn < 11) {
                    if (item.quality < 50) {
                        item.quality = item.quality + 1;
                    }
                }
                if (item.sellIn < 6) {
                    if (item.quality < 50) {
                        item.quality = item.quality + 1;
                    }
                }
                if (item.sellIn < 1) {
                    item.quality = 0;
                }
                break;
            }
            default:
            {
                if (item.sellIn < 1) {
                    item.quality = item.quality - 2;
                }
                else {
                    item.quality = item.quality - 1;
                }
                break;
            }
        }
        if(item.name!="Sulfuras, Hand of Ragnaros") item.sellIn = item.sellIn - 1;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            update(items[i]);
        }
    }
}