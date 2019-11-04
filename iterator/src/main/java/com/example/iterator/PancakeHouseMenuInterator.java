package com.example.iterator;

/**
 * @author Abraham Ginting (abraham.ginting@dana.id)
 * @version PancakeHouseMenuInterator, v 0.1 2019-11-04 01:53 by Abraham Ginting
 */
public class PancakeHouseMenuInterator implements Iterator {

    MenuItem[] items;

    int position = 0;

    public PancakeHouseMenuInterator(MenuItem[] items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem menuItem = items[position];
        position++;
        return menuItem;
    }

    @Override
    public void remove() {

    }
}
