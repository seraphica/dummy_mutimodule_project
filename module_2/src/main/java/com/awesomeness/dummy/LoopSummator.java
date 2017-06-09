package com.awesomeness.dummy;

class LoopSummator {

    Integer add(Integer startRange, Integer stopRange) {
        Integer sum = 0;
        for (int i = startRange; i <= stopRange; i++) {
            sum += i;
        }
        return sum;
    }
}
