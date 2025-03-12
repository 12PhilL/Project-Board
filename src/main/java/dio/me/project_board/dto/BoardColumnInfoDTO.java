package dio.me.project_board.dto;

import dio.me.project_board.persistence.entity.BoardColumnKindEnum;

public record BoardColumnInfoDTO(Long id, int order, BoardColumnKindEnum kind){
}
