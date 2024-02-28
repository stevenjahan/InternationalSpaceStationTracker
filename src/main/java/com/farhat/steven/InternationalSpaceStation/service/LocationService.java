package com.farhat.steven.InternationalSpaceStation.service;


import com.farhat.steven.InternationalSpaceStation.models.IssLocator;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class LocationService {

    public IssLocator getIssLocation() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("http://api.open-notify.org/iss-now.jsonxxx", IssLocator.class);
    }
}

/*
  try {
            RestTemplate restTemplate = new RestTemplate();
            return restTemplate.getForObject("http://api.open-notify.org/iss-now.jsonxxx", IssLocator.class);
        } catch (Exception e) {
            IssLocator issLocator = new IssLocator();
            issLocator.setMessage(FAILED);
            return issLocator;
        }

 */
