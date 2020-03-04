package com.zmex.springindocker.servive;

import com.zmex.springindocker.model.RecordModel;
import com.zmex.springindocker.repository.StatusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class RecordService {
    @Autowired StatusRepository statusRepository;

    public void saveRecord(String message, LocalDateTime recordTimeStamp) {
        RecordModel recordModel = new RecordModel();
        recordModel.setMessage(message);
        recordModel.setCheckingTime(recordTimeStamp);
        statusRepository.save(recordModel);
    }

    public List<RecordModel> getRecords() {
        List<RecordModel> records = new ArrayList<>();
        statusRepository.findAll().forEach(records::add);
        return records;
    }
}
