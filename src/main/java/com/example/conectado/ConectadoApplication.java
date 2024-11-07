package com.example.conectado;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@SpringBootApplication
@RestController
public class ConectadoApplication {

    private static final String cadenaConexion = "jdbc:mysql://mysqlservidor.mysql.database.azure.com";
    private static final String user = "consumidor";
    private static final String password = "Yosoy588";

    public static void main(String[] args) {
        SpringApplication.run(ConectadoApplication.class, args);
    }

    public String Conectado(){
        return " Estas conectado a azure";
    }

    public Connection getConnection() throws SQLException {
        Conectado();
        return DriverManager.getConnection(cadenaConexion,user,password);
    }

    @GetMapping("/Conectarse")
    public String conectarse() throws SQLException {
        getConnection();
        return Conectado();
    }


}
