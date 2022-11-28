package data.restfulbooker;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import java.util.Date;


@Getter
@Builder
public class BookingDates {
   private  String checkin;
   private String checkout;
}