package data.restfulbooker;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;


@Getter
@Builder
public class PartialBookingData {
    String firstname;
    int    totalprice;
}