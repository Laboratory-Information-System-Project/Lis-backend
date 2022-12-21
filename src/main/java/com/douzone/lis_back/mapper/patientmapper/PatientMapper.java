package com.douzone.lis_back.mapper.patientmapper;

import com.douzone.lis_back.domain.patientdomain.PatientDTO;
import com.douzone.lis_back.domain.patientdomain.PatientDomainDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface PatientMapper {
    List<PatientDomainDTO> patientData(String barcode);

    List<PatientDTO> patientAll();
    List<HashMap<String, Object>> findPatientInfoByPatientNo(String patientInfo);

    List<HashMap<String, Object>> findPatientInfoByPatientName(String patientInfo);

    List<HashMap<String, Object>> findVisitDataByPatientNo(String patientNo, String visitStatus);

    List<HashMap<String, Object>> findVisitDataByPatientNo(String patientNo);
}
