package com.example.iterator;

/**
 * @author Abraham Ginting (abraham.ginting@dana.id)
 * @version Iterator, v 0.1 2019-11-01 03:50 by Abraham Ginting
 */
public interface Iterator {

    boolean hasNext();

    Object next();

    void remove();
}
