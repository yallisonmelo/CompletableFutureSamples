package br.com.yfsmsystem.samples;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class SimpleCreateCompletableFuture {

    public static void main(String[] args) {
        CompletableFuture<String> completableFuture = new CompletableFuture<>();

        try {
            completableFuture.get();
            completableFuture.complete("simple execution");
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }

    }


}
