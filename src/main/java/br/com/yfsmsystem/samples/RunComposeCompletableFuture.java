package br.com.yfsmsystem.samples;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class RunComposeCompletableFuture {
        public static void main(String[] args) throws ExecutionException, InterruptedException {
            //Using for sequence call Executions
            CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> {
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    throw new IllegalStateException(e);
                }
                return "Hello: ";
            }).thenCompose(msg -> CompletableFuture.supplyAsync(() ->
                    msg + " Yallison!"));
            System.out.println(completableFuture.get());
        }
    }
