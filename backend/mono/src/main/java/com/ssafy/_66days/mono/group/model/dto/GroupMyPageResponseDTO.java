package com.ssafy._66days.mono.group.model.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class GroupMyPageResponseDTO {
    private String image;
    private String name;
    private List<String> badges;
    private String type;
}
