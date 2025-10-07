package com.vehiclesSystem.config;

import com.vehiclesSystem.models.Vehicle;
import lombok.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class DatabaseOperations
{
    @Value("${database.url}")
    private String url;

    @Value("${database.username}")
    private String username;

    @Value("${database.password}")
    private String password;

    public void save(Vehicle vehicle)
    {
        System.out.println("---------------connecting to database with properties------------------");
//        System.out.printf("url: %s\n username:%s\n password:%\n" , url , username , password);
        System.out.println(url + " " + username + " " + password);
        System.out.printf("--------------%s saved to database------------------\n" , vehicle.getBrand());
    }
}
