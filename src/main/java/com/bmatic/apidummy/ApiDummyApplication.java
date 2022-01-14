package com.bmatic.apidummy;

import com.bmatic.apidummy.soap.SOAPConnector;
import com.bmatic.schemas.citas.CitaDetailsRequest;
import com.bmatic.schemas.citas.CitaDetailsResponse;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ApiDummyApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiDummyApplication.class, args);
    }

    @Bean
    CommandLineRunner lookup(SOAPConnector soapConnector) {
        return args -> {
            String cod = "001";//Default Name
            String numPiso = "02";//Default Name
            String maxCitas = "7";//Default Name
            if (args.length > 0) {
                cod = args[0];
                numPiso = args[1];
                maxCitas = args[2];
            }
            CitaDetailsRequest request = new CitaDetailsRequest();
            request.setCod(cod);
            request.setNumPiso(numPiso);
            request.setMaxCitas(maxCitas);
            CitaDetailsResponse response = (CitaDetailsResponse) soapConnector.callWebService("http://34.210.226.208/service/citaDetailsWsdl.wsdl", request);
            System.out.println("Got Response As below ========= : ");
            System.out.println("Name : " + response.getCitas());
        };
    }

}
