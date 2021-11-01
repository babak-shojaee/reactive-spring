
package com.unclebabak.reactivespring.flux;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;


@Slf4j
public class MonoDefaultIfEmptyExample {

    public static void main(String[] args) {
        Mono.justOrEmpty(null)
                .defaultIfEmpty("Hello World")
                .doOnNext(message -> {
                    log.debug("message => {}", message);
                })
                .subscribe();
    }

}
