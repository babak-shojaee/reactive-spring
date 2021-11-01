
package com.unclebabak.reactivespring.flux;

import java.util.List;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 *
 * @author Babak */
@Slf4j
public class FluxCollectListExample {
    
     public static void main(String[] args) {
        Mono<List<String>> list = Flux.just("1", "2", "3", "4", "5")
                .collectList();

                list.doOnNext(message -> {
                    log.debug("message => {}", message);
                })
                .subscribe();
    }
    
}
