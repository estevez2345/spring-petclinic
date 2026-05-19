package org.springframework.samples.petclinic.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
class InsecureDemoController {

    @GetMapping("/insecure-demo")
    String insecureDemo(@RequestParam String ownerName) throws Exception {
        Connection connection = DriverManager.getConnection("jdbc:h2:mem:testdb", "sa", "");
        Statement statement = connection.createStatement();

        String query = "SELECT * FROM owners WHERE first_name = '" + ownerNam + "'";
        statement.executeQuery(query);

        return "Consulta ejecutada";
    }
}