package com.kd.assignment.globalObjects;

import com.kd.assignment.coins.Coin;
import com.kd.assignment.traders.Trader;
import com.kd.assignment.readFiles.ReadTraders;
import com.kd.assignment.readFiles.ReadCoins;
import org.json.simple.JSONArray;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class GlobalData {

    public static HashMap<String, Trader> tradersData = new HashMap<>();
    public static HashMap<String, Coin> coinNameAndCoinObject = new HashMap<>();
    public static HashMap<String, Coin> coinSymbolAndCoinObject = new HashMap<>();
    public static List<Trader> allTraderList = new ArrayList<>();
    public static JSONArray transaction;


    public static void readData() throws IOException {
        ReadCoins.readDataFromCoins(coinNameAndCoinObject, coinSymbolAndCoinObject);
        ReadTraders.readDataFromTraders(tradersData, allTraderList);
    }
}
