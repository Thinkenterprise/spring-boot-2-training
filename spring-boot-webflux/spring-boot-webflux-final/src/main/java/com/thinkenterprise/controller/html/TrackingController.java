package com.thinkenterprise.controller.html;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.thymeleaf.spring5.context.webflux.ReactiveDataDriverContextVariable;

import com.thinkenterprise.domain.tracking.Tracking;
import com.thinkenterprise.repository.ReactiveTrackingRepository;

import reactor.core.publisher.Flux;

import java.util.List;

@Controller
public class TrackingController {

    @Autowired
    private ReactiveTrackingRepository reactiveTrackingRepository;

    @GetMapping("/")
    public String index(){
        return "index";
    }


    @GetMapping("/list-trackings-chunked")
    public String listUsersChunked(Model model){

        Flux<Tracking> userFlux = this.reactiveTrackingRepository.findAll().repeat(30000);
        model.addAttribute("trackings", userFlux);
        return "trackings";
    }
}
