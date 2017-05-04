package com.lamu.dubbo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by songliangliang on 16/11/10.
 */
public class App {
    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        com.alibaba.dubbo.container.Main.main(args);
    }
}
