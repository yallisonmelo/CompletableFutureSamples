package br.com.yfsmsystem.samples;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class ExcptionCompletableFuture {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        var value = 0;
        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> {
            if(value == 0) {
                throw new IllegalArgumentException("Value is 0");
            }
            if(value > 0) {
                return "Positive value!";
            } else {
                return "Negative value!";
            }
        }).exceptionally(ex -> {
            System.out.println("Exception: " + ex.getMessage());
            return "Default";
        });
        System.out.println(completableFuture.get());
    }
}
