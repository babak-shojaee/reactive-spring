
package com.unclebabak.reactivespring.flux;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;


@Slf4j
public class FluxCountExample {
    
    public static void main(String[] args) {
        Flux.just("1", "2", "3", "4", "5")
                .count()
                .doOnNext(message -> {
                    log.debug("message => {}", message);
                })
                .subscribe();
    }
    
}
