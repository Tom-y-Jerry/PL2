package es.ulpgc.dacd;

import java.util.HashMap;

public class SalesReport {
        public void generateReport(String[] salesData) {
            HashMap<String, Integer> sales = new HashMap<>();
            for (String sale : salesData) {
                String[] parts = sale.split(",");
                String product = parts[0];
                int amount = Integer.parseInt(parts[1]);
                if (sales.containsKey(product)) {
                    sales.put(product, sales.get(product) + amount);
                } else {
                    sales.put(product, amount);
                }
            }
            for (String product : sales.keySet()) {
                System.out.println(product + ": " + sales.get(product));
            }
        }
    }

