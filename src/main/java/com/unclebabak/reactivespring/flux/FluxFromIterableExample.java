
package com.unclebabak.reactivespring.flux;

import java.util.Arrays;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;


@Slf4j
public class FluxFromIterableExample {
    
    public static void main(String[] args) {
        List<String> list = Arrays.asList("1", "2", "3", "4", "5");
        Flux.fromIterable(list)
                .doOnNext(message -> {
                    log.debug("message => {}", message);
                })
                .subscribe();
    }

    
}
