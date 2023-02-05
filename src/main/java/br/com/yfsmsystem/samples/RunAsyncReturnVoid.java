package br.com.yfsmsystem.samples;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class RunAsyncReturnVoid {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        System.out.println("Sample Completable Future, return Void");
        CompletableFuture<Void> completableFuture = CompletableFuture
                .runAsync(() -> System.out.println("Executing CF..."));
        completableFuture.get();
    }
}
