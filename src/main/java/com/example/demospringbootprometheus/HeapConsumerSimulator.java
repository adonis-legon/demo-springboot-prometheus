package com.example.demospringbootprometheus;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service("HeapConsumerSimulator")
public class HeapConsumerSimulator implements Simulator{

    @Override
    public void start(Map<String, String> params) {
        List<byte[]> list = new ArrayList<>();
        
        int iterations = 1000;
        if(params != null && params.containsKey("iterations")){
            iterations = Integer.parseInt(params.get("iterations"));
        }

        Runtime runtime = Runtime.getRuntime();
        while(iterations > 0){
            // reserve 1 Mb on each iteration
            list.add(new byte[1048576]);
            
            System.out.println(runtime.totalMemory() - runtime.freeMemory());
            iterations--;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public String getName() {
        return "heap";
    }
    
}
