package com.nasro.gestionstocke.dto;

import com.nasro.gestionstocke.models.MvtStck;
import com.nasro.gestionstocke.models.TypeMvtStk;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.Instant;

@Builder
@Data
public class MvtStckDto {
    private Long id;
    private Instant dateMvt;
    private BigDecimal quantite;

    private ArticleDto article;

    private TypeMvtStk typeMvtStk;

    public MvtStckDto fromEntity(MvtStck mvtStck) {
        if (mvtStck == null) {
            //TODO Throw an exception
        }
        assert mvtStck != null;
        return MvtStckDto.builder()
                .id(mvtStck.getId())
                .dateMvt(mvtStck.getDateMvt())
                .typeMvtStk(mvtStck.getTypeMvtStk())
                .quantite(mvtStck.getQuantite())
                .build();

    }

    public MvtStck toEntity(MvtStckDto mvtStckDto) {
        if (mvtStckDto == null) {
            //TODO Throw an exception
        }

        MvtStck mvtStck = new MvtStck();
        assert mvtStckDto != null;
        mvtStck.setDateMvt(mvtStckDto.getDateMvt());
        mvtStck.setQuantite(mvtStck.getQuantite());
        mvtStck.setTypeMvtStk(mvtStck.getTypeMvtStk());
        return mvtStck;
    }
}
