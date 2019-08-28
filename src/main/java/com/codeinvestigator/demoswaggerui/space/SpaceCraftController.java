package com.codeinvestigator.demoswaggerui.space;

import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@Api(value="My Space craft controller - Here we create and list our spacecrafts")
public class SpaceCraftController {
    private List<SpaceCraft> crafts = new ArrayList();

    @GetMapping("/spacecraft")
    @ApiOperation(value ="This lists our current spacecrafts", response=List.class)
    public List<SpaceCraft> crafts(){
        return crafts;
    }

    @PostMapping("/spacecraft")
    @ApiOperation(value ="Create a brand new spacecraft", response=SpaceCraft.class)
    @ApiResponses(value = {
            @ApiResponse(code = 504, message = "System is overloaded... Wait a bit"),
            @ApiResponse(code = 505, message = "We are out of spacecraft material"),
            @ApiResponse(code = 506, message = "We are currently on holliday")
    })
    public SpaceCraft createCraft(
            @ApiParam(value = "Give our craft a cool name", required = true) @RequestParam String craftName,
            @ApiParam(value = "Number of crew members.", required = false) @RequestParam Integer crew,
            @ApiParam(value = "Weight in Kilo grams", required = false) @RequestParam Integer weight,
            @ApiParam(value = "The description is used for merchandise", required = true) @RequestParam String description){
        SpaceCraft newcraft = SpaceCraft.builder().description(description)
                .weight(weight)
                .numberOfCrew(crew)
                .name(craftName).build();
        crafts.add(newcraft);
        return newcraft;
    }





}
