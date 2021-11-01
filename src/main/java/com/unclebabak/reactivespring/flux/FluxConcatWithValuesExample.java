
package com.unclebabak.reactivespring.flux;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;

/**
 *
 * @author Babak */
@Slf4j
public class FluxConcatWithValuesExample {
    
    public static void main(String[] args) {
        Flux.just("1", "2", "3")
                .concatWithValues("4", "5", "6")
                .doOnNext(message -> {
                    log.debug("message => {}", message);
                })
                .subscribe();
    }
    
}
