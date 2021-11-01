
package com.unclebabak.reactivespring.flux;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;


@Slf4j
public class FluxDistinctExample {
    
    public static void main(String[] args) {
        Flux.just("A", "B", "C", "A", "A", "B", "D")
                .distinct()
                .doOnNext(message -> {
                    log.debug("message => {}", message);
                })
                .subscribe();
    }
    
}
