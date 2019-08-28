package com.codeinvestigator.demoswaggerui.space;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ApiModel(description = "This is a cool spacecraft!")
public class SpaceCraft {
    @ApiModelProperty(notes = "The english name of the spacecraft")
    private String name;
    @ApiModelProperty(notes = "The weight in kilo grams")
    private Integer weight;
    @ApiModelProperty(notes = "description made for merchandise")
    private String description;
    @ApiModelProperty(notes = "The number of crewmembers in thousands")
    private Integer numberOfCrew;
}

