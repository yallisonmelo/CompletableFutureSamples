package br.com.yfsmsystem.samples;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class TimeOutCompletableFeature {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        var timeOut = 5;
        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> "Hello: ")
                .orTimeout(timeOut, TimeUnit.SECONDS);
        //Exist the method completeOnTimeout in this we can set a default return value
        //.completeOnTimeout("deafault value",timeOut, TimeUnit.SECONDS);
        System.out.println(completableFuture.get());
    }
}
