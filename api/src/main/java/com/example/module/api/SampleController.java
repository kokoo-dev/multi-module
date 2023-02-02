package com.example.module.api;

import com.example.module.core.CoreService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SampleController {

    private final CoreService coreService;
    private final SampleService sampleService;

    @GetMapping("/")
    public void index() {
        coreService.print();
        sampleService.print();
    }
}
