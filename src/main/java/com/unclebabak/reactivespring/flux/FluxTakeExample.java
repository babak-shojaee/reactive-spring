
package com.unclebabak.reactivespring.flux;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;

/**
 *
 * @author Babak */
@Slf4j
public class FluxTakeExample {
    
     public static void main(String[] args) {
        Flux.just("A", "B", "C", "D", "E", "F", "G", "H")
                .skip(2)
                .take(3)
                .doOnNext(message -> {
                    log.debug("message => {}", message);
                })
                .subscribe();
    }

    
}
