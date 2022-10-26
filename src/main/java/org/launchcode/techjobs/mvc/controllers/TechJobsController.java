package org.launchcode.techjobs.mvc.controllers;

import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class TechJobsController {
    private static HashMap<String, String> actionChoices = new HashMap<>();
    private static HashMap<String, String> columnChoices = new HashMap<>();
    private static HashMap<String, String> jobFields = new LinkedHashMap<>();

    public TechJobsController() {
        actionChoices.put("search", "Search");
        actionChoices.put("list", "List");

        columnChoices.put("all", "All");
        columnChoices.put("employer", "Employer");
        columnChoices.put("location", "Location");
        columnChoices.put("positionType", "Position Type");
        columnChoices.put("coreCompetency", "Skill");

        jobFields.put("id", "ID");
        jobFields.put("name", "Name");
        jobFields.put("employer", "Employer");
        jobFields.put("location", "Location");
        jobFields.put("positionType", "Position Type");
        jobFields.put("coreCompetency", "Core Competency");
    }

    @ModelAttribute("actions")
    public static HashMap<String, String> getActionChoices() {
        return actionChoices;
    }

    @ModelAttribute("columns")
    public static HashMap<String, String> getColumnChoices() {
        return columnChoices;
    }

    @ModelAttribute("jobFields")
    public static HashMap<String, String> getJobFields() {
        return jobFields;
    }
}
