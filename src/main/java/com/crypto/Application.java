package com.crypto;

import com.crypto.arbitrage.MarketComparer;

public class Application {

    public static void main(String[] args) {
        MarketComparer marketComparer = new MarketComparer("bitstamp", "bithumb");
        marketComparer.checkArbitrageRates();
    }
}
