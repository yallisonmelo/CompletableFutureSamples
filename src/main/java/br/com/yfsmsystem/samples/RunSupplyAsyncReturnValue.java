package br.com.yfsmsystem.samples;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class RunSupplyAsyncReturnValue {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(()-> "My Result");

        var result = completableFuture.get();
        System.out.println(result);
    }
}
