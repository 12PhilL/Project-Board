package dio.me.project_board.persistence.entity;

import lombok.Data;

import static dio.me.project_board.persistence.entity.BoardColumnKindEnum.INITIAL;

@Data
public class CardEntity {

    private Long id;
    private String title;
    private String description;
    private BoardColumnEntity boardColumn = new BoardColumnEntity();


}
