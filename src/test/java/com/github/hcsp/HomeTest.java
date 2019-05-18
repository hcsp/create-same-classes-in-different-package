package com.github.hcsp;

import org.junit.jupiter.api.Test;

class HomeTest {
    @Test
    public void homeHasTwoKindsOfCat() {
        Home home = new Home();
        home.cat1 = new com.github.hcsp.pkg1.Cat();
        home.cat2 = new com.github.hcsp.pkg2.Cat();
    }
}
