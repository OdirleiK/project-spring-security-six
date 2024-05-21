package br.com.kmpx.projectspringsecuritysix.controller.dto;


import java.util.List;

public record FeedDTO(List<FeedItemDTO> feedItens, int page, int pageSize, int totalPages, long totalElements) {
}
