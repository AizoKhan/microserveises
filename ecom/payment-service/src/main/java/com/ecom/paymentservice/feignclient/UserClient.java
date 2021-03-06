package com.ecom.paymentservice.feignclient;

import com.ecom.paymentservice.DTO.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name = "User", url = "http://localhost:2002/")
public interface UserClient {

    @GetMapping(value = "user/getById/{id}")
    public UserDTO getUserById(@PathVariable("id") Long id);
}
