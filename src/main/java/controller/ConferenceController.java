package controller;

import model.Conference;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repository.ConferenceRepository;

import java.util.List;

/**
 * Created by Jakub on 24.02.2017.
 */
@RestController
@RequestMapping("/conferences")
public class ConferenceController {

    private ConferenceRepository conferenceRepository;

    @Autowired
    public ConferenceController(ConferenceRepository conferenceRepository) {
        this.conferenceRepository = conferenceRepository;
    }

    @PostMapping
    public void addConference(@RequestBody Conference conference) {
        conferenceRepository.save(conference);
    }

    @GetMapping
    public List<Conference> getAll() {
        return conferenceRepository.findAll();
    }
}
