package com.example.storage;

import java.io.Serializable;
import lombok.Data;

@Data
public class CustInfoRecord implements Serializable {
    
    private String customerId;
    private int age;
    private String gender;
    private String maritalStatus;
    private double homeLongitude;
    private double homeLatitude;


}
