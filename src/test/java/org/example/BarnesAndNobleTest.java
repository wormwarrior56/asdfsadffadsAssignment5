package org.example.Barnes;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.*;
import static org.assertj.core.api.Assertions.assertThat;

import static org.junit.jupiter.api.Assertions.*;

class BarnesAndNobleTest {
    /** PART 1
     * 1. Input/Output
     * -input (order): Map<String, Integer>
     * -output (purchaseSummary):
     *
     * 2. Partitioning
     *      -null | !null | empty order | !empty order
     *
     *
     *
     *
     *
     */
    @Test
    @DisplayName("specification-based")
    void testBarnesAndNoble() {
        BookDatabase bd =  mock(BookDatabase.class);
        BuyBookProcess bbp = mock(BuyBookProcess.class);
        BarnesAndNoble ban = new BarnesAndNoble(bd, bbp);
        Book a = new Book("1234", 15, 2);
        Map<String, Integer> map = new HashMap<>();
        assertNotNull(ban.getPriceForCart(map)); // !null && empty
        assertNull(ban.getPriceForCart(null)); // null
        when(bd.findByISBN(anyString())).thenReturn(a);
        map.put("1234", 1); //!empty
        assertEquals(15, ban.getPriceForCart(map).getTotalPrice()); //!empty
    }

    @Test
    @DisplayName("structural-based")
    void testStructuralBarnesAndNoble() {
        BookDatabase bd =  mock(BookDatabase.class);
        BuyBookProcess bbp = mock(BuyBookProcess.class);
        BarnesAndNoble ban = new BarnesAndNoble(bd, bbp);
        Book a = new Book("1234", 15, 2);
        Map<String, Integer> map = new HashMap<>();
        when(bd.findByISBN(anyString())).thenReturn(a);
        map.put("1234", 3); //buy more books than available to hit lines 18-20 in BarnesAndNoble
        assertEquals(30, ban.getPriceForCart(map).getTotalPrice());

    }
}
