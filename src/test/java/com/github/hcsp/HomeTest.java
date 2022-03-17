package com.github.hcsp;

import org.junit.jupiter.api.Test;

public class HomeTest {
    @Test
    public void
    homeHasTwoKindsOfCat() {
        Home home = new Home();
        home.cat1 = new com.github.hcsp.pet1.Cat();
        home.cat2 = new com.github.hcsp.pet2.Cat();
    }
}
