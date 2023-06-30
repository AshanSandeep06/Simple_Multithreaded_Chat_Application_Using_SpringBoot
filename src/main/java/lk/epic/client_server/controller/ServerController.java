package lk.epic.client_server.controller;

import lk.epic.client_server.util.MessageUtil;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.BufferedReader;
import java.io.InputStreamReader;

@RestController
@CrossOrigin
@RequestMapping("/server")
public class ServerController {
    private String response;
    private static int id;

    @PostMapping
    @ResponseStatus(HttpStatus.ACCEPTED)
    public ResponseEntity<String> getResponseFromServer(@ModelAttribute MessageUtil client) {
        System.out.println("Client ID : "+ ++id);
        System.out.println("Client Name : "+client.getClientName());
        System.out.println("This Client Says : "+client.getMessage());

        response = "Hello Client - "+id;
        return ResponseEntity.ok(response);
    }
}
