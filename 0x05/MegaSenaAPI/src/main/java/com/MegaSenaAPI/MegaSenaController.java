package com.MegaSenaAPI;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping(value = "/megasena")
public class MegaSenaController {

    @GetMapping("/simpleMessageWelcome")
    public String welcomeMessage() {

        return "Welcome to the REST API for generating numbers for the Mega Sena lottery.";
    }

    @GetMapping("/getNumbers")
    public List<Integer> megaSenaNumbers() {

        Random random = new Random();

        List<Integer> numbers = new ArrayList<>();

        while (numbers.size() < 6) {

            int number = random.nextInt(60) + 1;

            if (!numbers.contains(number)) {
                numbers.add(number);
            }
        }

        Collections.sort(numbers);

        return numbers;
    }
}
