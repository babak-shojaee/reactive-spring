
package com.unclebabak.reactivespring.flux;

import java.time.LocalDateTime;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;


@Slf4j
public class MonoFromCallableExample {
    
    public static void main(String[] args) {
        Mono.fromCallable(() -> "Hello at " + LocalDateTime.now())
                .doOnNext(message -> {
                    log.debug("message => {}", message);
                })
                .subscribe();
    }
    
}
