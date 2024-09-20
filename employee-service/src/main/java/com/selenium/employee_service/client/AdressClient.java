package com.selenium.employee_service.client;

import com.selenium.employee_service.response.AddressResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "address-app" , url = "localhost:8081" , path =  "/address-app/api/")
public interface AdressClient {

    @GetMapping("address/{employeeId}")
    ResponseEntity<AddressResponse> getAddressByEmployeeId(@PathVariable int employeeId);
}
