package dio.me.project_board.dto;

import java.time.OffsetDateTime;
import java.time.OffsetTime;

public record CardDetailsDTO(Long id,
                             String title,
                             String description,
                             boolean blocked,
                             OffsetDateTime blockedAt,
                             String blockReason,
                             int blocksAmount,
                             Long columnId,
                             String columnName) {
}
