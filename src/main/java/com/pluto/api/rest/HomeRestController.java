package com.pluto.api.rest;

import com.pluto.api.common.Constants;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class HomeRestController {

    @RequestMapping("/")
    public ResponseEntity<?> home() {
        Map<String, Object> response = new HashMap<>();
        response.put("Volumes", Constants.URL_BASE + "volume");
        response.put("Characters", Constants.URL_BASE + "page/0");
        response.put("Chapters", Constants.URL_BASE + "page/0");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
