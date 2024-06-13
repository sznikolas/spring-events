package com.example.springevents.dto;

import lombok.Data;

@Data
public class PatientDischargeRequest {
    private String patientId;
    private String patientName;
}
