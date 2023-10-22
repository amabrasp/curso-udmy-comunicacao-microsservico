package br.com.cursoudemy.productapi;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RequestMapping("/api")
@RestController
public class StatusController {

    @GetMapping("status")
    public ResponseEntity<HashMap<String, Object>> getApiStatus(){
        var reponse = new HashMap<String, Object>();

        reponse.put("servise", "Product-API");
        reponse.put("status", "up");
        reponse.put("httpStatus", "up");

        return  ResponseEntity.ok(reponse);

    }


}
