
package com.unclebabak.reactivespring.flux;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;


@Slf4j
public class MonoFilterExample1 {
 
    public static void main(String[] args) {
        Mono.just(2)
                .filter(number -> (number % 2 == 0))
                .doOnNext(message -> {
                    log.debug("message => {}", message);
                })
                .subscribe();
    }
    
}
