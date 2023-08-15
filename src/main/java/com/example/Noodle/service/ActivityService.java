package com.example.Noodle.service;

import com.example.Noodle.dto.ActivityDto;
import com.example.Noodle.model.Activity;

import java.util.List;

public interface ActivityService {
    public List<Activity> getActivities();
    public Activity postActivity(ActivityDto activityDto);
}
