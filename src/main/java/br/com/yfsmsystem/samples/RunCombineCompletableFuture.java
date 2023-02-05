package br.com.yfsmsystem.samples;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class RunCombineCompletableFuture {
    //The Combine wait two completable future finished for result
        public static void main(String[] args) throws ExecutionException, InterruptedException {
            CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> {
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    throw new IllegalStateException(e);
                }
                return "Hello: ";
            }).thenCombine(CompletableFuture.supplyAsync(() -> " Yallison!"),
                    (first, second) -> first + second);
            System.out.println(completableFuture.get());
        }
    }
