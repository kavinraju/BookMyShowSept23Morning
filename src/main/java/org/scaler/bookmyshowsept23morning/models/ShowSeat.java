package org.scaler.bookmyshowsept23morning.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ShowSeat extends BaseModel {
    @OneToOne
    private Show show;

    @OneToOne
    private Seat seat;

    @Enumerated
    private ShowSeatStatus showSeatStatus;
}
