package com.example.springevents.service;

import com.example.springevents.event.PatientDischargeEvent;
import com.example.springevents.handler.BillingServiceHandler;
import com.example.springevents.handler.HousekeepingServiceHandler;
import com.example.springevents.handler.MedicalRecordsServiceHandler;
import com.example.springevents.handler.NotificationServiceHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PatientDischargeService {

    @Autowired
    private ApplicationEventPublisher eventPublisher;

//Tight coupling
    //    @Autowired
//    private BillingServiceHandler billingService;
//    @Autowired
//    private MedicalRecordsServiceHandler medicalRecordsService;
//    @Autowired
//    private HousekeepingServiceHandler housekeepingService;
//    @Autowired
//    private NotificationServiceHandler notificationService;


    public String dischargePatient(String patientId, String patientName) {

        log.info("patient discharge process initiated {} ", patientName);

        //Tight coupling
//        billingService.processBill();
//        medicalRecordsService.updatePatientHistory();
//        housekeepingService.cleanAndAssign();
//        notificationService.notifyPatients();


        //publish an event
        eventPublisher.publishEvent(new PatientDischargeEvent(this, patientId, patientName));

        log.info("patient discharge process completed {} ", patientName);
        return "Patient " + patientName + " with ID " + patientId + " discharged successfully!";
    }
}

