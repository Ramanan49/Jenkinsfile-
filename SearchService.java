package com.example.services;

import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class SearchService {

    public List<String> search(String query) {
        return Collections.emptyList(); // Breaking the test
    }
}
