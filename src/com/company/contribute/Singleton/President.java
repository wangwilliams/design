package com.company.contribute.Singleton;

import java.util.Optional;

public class President {
    private static volatile President president = null;
    private final String name = "特朗普";

    private President() {
        Optional.of("产生一个美国总统").ifPresent(System.out::println);
    }

    public static President getInstance() {
        if (president == null) {
            president = new President();
        } else {
            Optional.of("存在一个美国总统").ifPresent(System.out::println);
        }
        return president;
    }

    public String getName() {
        return name;
    }
}
