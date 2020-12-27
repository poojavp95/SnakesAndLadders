package com.company;

public class Snake {
    private final Integer startPosition;
    private final Integer endPosition;

    public Snake(Integer startPosition, Integer endPosition) {
        if(startPosition < endPosition){
            throw new IllegalArgumentException("Start position Cannot be before end position");
        }
        this.startPosition = startPosition;
        this.endPosition = endPosition;
    }


}
