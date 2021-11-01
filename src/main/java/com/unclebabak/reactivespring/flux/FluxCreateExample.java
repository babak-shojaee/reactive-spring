
package com.unclebabak.reactivespring.flux;

import java.time.LocalDateTime;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;

/**
 *
 * @author Babak */
@Slf4j
public class FluxCreateExample {
    
    public static void main(String[] args) {
        Flux.create(callback -> {
            for (int i = 1; i <= 5; i++) {
                try {
                    Thread.sleep(1000L);
                } catch (InterruptedException ex) {
                   
                }
                callback.next("task " + i + " at " + LocalDateTime.now());
            }
            callback.complete();
            
        })
                .doOnNext(message -> {
                    log.debug("message => {}", message);
                })
                .subscribe();
    }
    
}
