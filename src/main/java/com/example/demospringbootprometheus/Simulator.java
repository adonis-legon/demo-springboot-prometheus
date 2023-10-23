package com.example.demospringbootprometheus;

import java.util.Map;

public interface Simulator {
    
    String getName ();

    void start(Map<String, String> params);
}
