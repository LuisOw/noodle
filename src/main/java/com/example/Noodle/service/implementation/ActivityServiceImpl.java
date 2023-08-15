package com.example.Noodle.service.implementation;

import com.example.Noodle.dto.ActivityDto;
import com.example.Noodle.model.Activity;
import com.example.Noodle.repository.ActivityRepository;
import com.example.Noodle.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ActivityServiceImpl implements ActivityService {

    @Autowired
    private ActivityRepository repository;

    @Override
    public List<Activity> getActivities() {
        return repository.findAll();
    }

    @Override
    public Activity postActivity(ActivityDto activityDto) {
        return null;
    }
}
