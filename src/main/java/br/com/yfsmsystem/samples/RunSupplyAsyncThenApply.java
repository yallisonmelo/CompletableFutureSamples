package br.com.yfsmsystem.samples;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class RunSupplyAsyncThenApply {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //Using ThenApply for execution with return value
        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> {
            try {
                // introduce delay time two seconds
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            return "Yallison";
        }).thenApply(name -> "Hello " + name)
                .thenApply(message-> message+ " Melo");// added another callback
        System.out.println(completableFuture.get());
    }
}
