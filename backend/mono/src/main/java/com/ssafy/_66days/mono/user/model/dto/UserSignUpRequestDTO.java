package com.ssafy._66days.mono.user.model.dto;

import lombok.Getter;

@Getter
public class UserSignUpRequestDTO {

	private String nickname;

	private String email;

	private String profileImagePath;
}
