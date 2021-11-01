
package com.unclebabak.reactivespring.flux;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;

/**
 *
 * @author Babak */
@Slf4j
public class FluxGroupByExample {

    public static void main(String[] args) {
        Flux.just("A", "A", "B", "C", "D", "B", "F", "C", "A")
                .groupBy(value -> value)
                .flatMap(flux -> flux.count().map(count -> flux.key() + ":" + count))
                .doOnNext(message -> {
                    log.debug("message => {}", message);
                })
                .subscribe();
    }

}
