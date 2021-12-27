package com.github.hcsp;

import com.github.hcsp.pet1.Cat;

// 当两个类发生命名冲突时你可以使用全限定类名来引入其他类

public class Home {
    Cat cat1;
    com.github.hcsp.pet2.Cat cat2;
}
