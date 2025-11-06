package org.example.Amazon;

import org.example.Amazon.Cost.ItemType;
import org.example.Amazon.Cost.PriceRule;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.*;
import static org.assertj.core.api.Assertions.assertThat;

import static org.junit.jupiter.api.Assertions.*;

class AmazonIntegrationTest {
    /**
     * Input/Output:
     * -input (carts): ShoppingCart
     * -input (rules): List<PriceRules>
     * -output (.calculate): finalPrice - double
     *
     * integration:
     * !empty cart, empty list
     *
     *
     */

    @Test
    @DisplayName("specification-based")
    void AmazonSpecIntegrationTest() {


    }

}
