package com.example.tv.controller;

import com.example.tv.model.Channel;
import com.example.tv.controller.ChannelDataProvider1;
import com.example.tv.controller.ChannelDataProvider2;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api")
public class ChannelController {

    @GetMapping("/channels")
    public List<Channel> getChannels() {

        List<Channel> channels = new ArrayList<>();

        // 👇 data alag-alag class se
        channels.addAll(ChannelDataProvider1.getChannels());
        channels.addAll(ChannelDataProvider2.getChannels());
        channels.addAll(ChannelDataProvider3.getChannels());
        return channels;
    }
}

