package com.zmex.springindocker.model;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
public class RecordModel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)

    private int id;
    private String message;
    private LocalDateTime checkingTime;
}
