package br.com.kmpx.projectspringsecuritysix.controller.dto;

public record LoginReponse(String accessToken, Long expiresIn) {
}
