package com.zmex.springindocker.controllers;

import com.zmex.springindocker.model.RecordModel;
import com.zmex.springindocker.repository.StatusRepository;
import com.zmex.springindocker.servive.RecordService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestController
public class StatusController {

    private RecordService recordService;

    public StatusController(RecordService recordService) {
        this.recordService = recordService;
    }

    @GetMapping(path = "/health")
    public String getStatusRecords() {
        LocalDateTime requestTime = LocalDateTime.now();
        String message = "Request time " + requestTime + " Status: healthy";
        recordService.saveRecord(message, requestTime);
        return message;
    }

    @GetMapping(path = "/records")
    public List<RecordModel> getRecords() {
        return recordService.getRecords();
    }

}
