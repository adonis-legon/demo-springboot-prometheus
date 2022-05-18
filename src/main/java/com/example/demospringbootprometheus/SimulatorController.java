package com.example.demospringbootprometheus;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/simulator")
public class SimulatorController {

    @Autowired
    private SimulatorService simulatorService;
    
    @PostMapping("/{simulatorName}")
    public ResponseEntity<String> startSimulator(@PathVariable String simulatorName, @RequestBody Map<String, String> params){
        simulatorService.startSimulation(simulatorName, params);

        return new ResponseEntity<>("OK", HttpStatus.OK);
    }
}
