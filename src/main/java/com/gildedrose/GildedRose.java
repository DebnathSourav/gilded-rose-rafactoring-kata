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
            }
            case "Aged Brie":
            {
                if (item.quality < 50) {
                    item.quality = item.quality + 1;
                }
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