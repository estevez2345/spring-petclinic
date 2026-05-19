package org.springframework.samples.petclinic.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
class InsecureDemoController {

    @GetMapping("/secure-demo")
    String secureDemo(@RequestParam String ownerName) throws Exception {
        Connection connection = DriverManager.getConnection("jdbc:h2:mem:testdb", "sa", "");

        String query = "SELECT * FROM owners WHERE first_name = ?";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, ownerName);
        statement.executeQuery();

        return "Consulta segura ejecutada";
    }
}