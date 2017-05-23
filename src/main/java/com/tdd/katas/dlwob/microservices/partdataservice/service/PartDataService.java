package com.tdd.katas.dlwob.microservices.partdataservice.service;

import com.tdd.katas.dlwob.microservices.partdataservice.model.PartData;

import java.util.List;

public interface PartDataService {
    List<PartData> getPartsByVinCode(String non_existent_vin);
}
