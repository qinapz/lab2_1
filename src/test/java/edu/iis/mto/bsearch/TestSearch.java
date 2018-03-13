package edu.iis.mto.bsearch;

import org.junit.Assert;
import org.junit.Test;

public class TestSearch {

    @Test
    public void isFound() {
        int key = 5;
        int seq[] = {5};
        SearchResult search = BinarySearch.search(key, seq);
        Assert.assertTrue(search.isFound());
    }

    @Test
    public void isNotFound() {
        int key = 5;
        int seq[] = {15};
        SearchResult search = BinarySearch.search(key, seq);
        Assert.assertFalse(search.isFound());
    }

    @Test
    public void isFirstElement() {
        int key = 1;
        int position = 1;
        int seq[] = {1, 5, 6, 9, 10, 15, 17, 20, 25, 30, 40, 55};
        SearchResult search = BinarySearch.search(key, seq);
        Assert.assertEquals(position, search.getPosition());
    }

    @Test
    public void isLastElement() {
        int key = 55;
        int position = 10;
        int seq[] = {1, 5, 6, 9, 10, 15, 20, 25, 40, 55};
        SearchResult search = BinarySearch.search(key, seq);
        Assert.assertEquals(position, search.getPosition());
    }

    @Test
    public void isMiddleElement() {
        int key = 9;
        int position = 4;
        int seq[] = {1, 5, 6, 9, 10, 18, 31};
        SearchResult search = BinarySearch.search(key, seq);
        Assert.assertEquals(position, search.getPosition());
    }

}
