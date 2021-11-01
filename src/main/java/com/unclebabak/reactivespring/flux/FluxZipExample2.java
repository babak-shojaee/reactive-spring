
package com.unclebabak.reactivespring.flux;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;


@Slf4j
public class FluxZipExample2 {
    
    public static void main(String[] args) {
        
        Flux<String> flux1 = Flux.just("1", "2", "3", "4", "5");
        Flux<String> flux2 = Flux.just("6", "7", "8");
        Flux<String> flux3 = Flux.just("9", "10", "11", "12");
        
        Flux.zip(flux1, flux2, flux3)
                .doOnNext(message -> {
                    log.debug("message => {}", message);
                })
                .subscribe();
    }
    
}