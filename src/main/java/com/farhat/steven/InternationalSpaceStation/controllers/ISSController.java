package com.farhat.steven.InternationalSpaceStation.controllers;

import com.farhat.steven.InternationalSpaceStation.models.IssLocator;
import com.farhat.steven.InternationalSpaceStation.service.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ISSController {


    @Autowired
    private LocationService locationService;
    @GetMapping("/issLocation")
    @CrossOrigin
    public IssLocator getISSLocation() {
      return this.locationService.getIssLocation();
    }
}
