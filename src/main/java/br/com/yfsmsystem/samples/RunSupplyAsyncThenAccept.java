package br.com.yfsmsystem.samples;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class RunSupplyAsyncThenAccept {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //Using thenAccept for execution with return void
        //Or thenRun -> not access result Completable future
        CompletableFuture<Void> completableFuture = CompletableFuture.supplyAsync(() -> {
            try {
                // introduce delay time two seconds
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                throw new IllegalStateException(e);
            }
            return "Yallison";
        }).thenAccept(name -> System.out.println("Hello: "+name));
    }
}
