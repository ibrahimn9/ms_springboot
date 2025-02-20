package com.esi.gateway;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CircuitBreakerBreakerController {
    @GetMapping("/defaultPatients")
    List<Patient> PatientFallback() {
        List<Patient> Patients = new ArrayList<>();
        Patients.add(new Patient(1L, "amine"));
        Patients.add(new Patient(2L, "said"));

        return Patients;
    }
}
