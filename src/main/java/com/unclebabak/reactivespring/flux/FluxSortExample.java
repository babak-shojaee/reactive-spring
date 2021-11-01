
package com.unclebabak.reactivespring.flux;

import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;

import java.util.Arrays;
import java.util.List;


@Slf4j
public class FluxSortExample {

    public static void main(String[] args) {


        List<Integer> list = Arrays.asList(2, 3, 5, 4, 1, 9, 7, 6, 8, 0);
        Flux.fromIterable(list);

        Flux.just(2, 3, 5, 4, 1, 9, 7, 6, 8, 0)
                .doOnNext(message -> {
                    log.debug("before sort => {}", message);
                })
                .sort((numb1, numb2) -> numb1 - numb2)
                .doOnNext(message -> {
                    log.debug("sorted => {}", message);
                })
                .subscribe();
    }

}
