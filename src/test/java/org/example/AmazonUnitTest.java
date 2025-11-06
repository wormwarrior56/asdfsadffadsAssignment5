package org.example.Amazon;


import org.example.Amazon.Cost.ItemType;
import org.example.Amazon.Cost.PriceRule;
import org.example.Amazon.Item;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.*;
import static org.assertj.core.api.Assertions.assertThat;

import static org.junit.jupiter.api.Assertions.*;

public class AmazonUnitTest {
    @Test
    @DisplayName("specification-based")
    void specificationBasedUnitTest() {
        Item item = new Item(ItemType.OTHER, "banana", 5, .75);
        ShoppingCart cart = mock(ShoppingCart.class);
        PriceRule rule = mock(PriceRule.class);
        List<PriceRule> rules = new ArrayList<>();
        rules.add(rule);
        Amazon ama = new Amazon(cart, rules);
        when(ama.calculate()).thenReturn(0.75);
        assertThat(ama.calculate()).isEqualTo(0.75);

    }

    @Test
    @DisplayName("structural-based")
    void structuralBasedUnitTest() {
        Item item = new Item(ItemType.OTHER, "banana", 5, .75);
        ShoppingCart cart = mock(ShoppingCart.class);
        PriceRule rule = mock(PriceRule.class);
        List<PriceRule> rules = new ArrayList<>();
        rules.add(rule);
        Amazon ama = new Amazon(cart, rules);
        ama.addToCart(item);
    }
}
