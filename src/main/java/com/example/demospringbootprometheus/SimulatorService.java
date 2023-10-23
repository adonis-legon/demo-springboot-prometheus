package com.example.demospringbootprometheus;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class SimulatorService {

    private final Map<String, Simulator> simulatorsByName;

    @Autowired
    public SimulatorService(List<Simulator> simulators){
        this.simulatorsByName = simulators.stream().collect(Collectors.toMap(Simulator::getName, Function.identity()));
    }

    @Async
    public void startSimulation(String simulatorName, Map<String, String> params){
        this.simulatorsByName.get(simulatorName).start(params);
    }
}
