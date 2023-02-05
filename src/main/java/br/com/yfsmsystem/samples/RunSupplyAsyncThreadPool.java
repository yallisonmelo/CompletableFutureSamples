package br.com.yfsmsystem.samples;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class RunSupplyAsyncThreadPool {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Executor executor = Executors.newFixedThreadPool(3);
        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(()->{
            System.out.println("Thread name: " + Thread.currentThread().getName());
            return "My Result using Thread pool";
        },executor);

        var result = completableFuture.get();
        System.out.println(result);
    }
}
