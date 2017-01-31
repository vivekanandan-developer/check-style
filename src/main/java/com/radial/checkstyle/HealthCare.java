package com.radial.checkstyle;

import com.radial.checkstyle.businessobject.PatientInformation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class HealthCare {
    public static void main(String args[]){
        String apple;
        String bag;
        String car;
        HealthCare healthCare = new HealthCare();

        List<PatientInformation> patientInformationList = healthCare.addDefaultValues();
        List<PatientInformation> patientInformation =patientInformationList.stream().filter(p ->
                "xxx".equalsIgnoreCase(p.getName())).collect(Collectors.toList());
        System.out.println(patientInformation.get(0).getAddress());

    }

    private List<PatientInformation> addDefaultValues(){
        List<PatientInformation> patientInformations =new ArrayList<PatientInformation>();
        patientInformations.add(new PatientInformation("xxx","9000090000","P1","chennai"));
        patientInformations.add(new PatientInformation("yyy","8900090000","P2","Mumbai"));
        patientInformations.add(new PatientInformation("zzz","8800090000","P3","Kovai"));
        patientInformations.add(new PatientInformation("aaa","9500095000","P4","chennai"));
        patientInformations.add(new PatientInformation("bbb","9100890000","P5","Madhurai"));
        return patientInformations;
    }
}
