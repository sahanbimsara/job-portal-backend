package edu.icet.ecom.model.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class JobDTO {
    private int id;

    private String name;

    private String location;

    private  String industry;
}
