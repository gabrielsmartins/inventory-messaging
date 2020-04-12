package br.com.inventory.messaging.message;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.LinkedList;
import java.util.List;

@Getter
@Setter
@ToString(exclude = {"items"})
public class OrderMessageInput {

    @JsonProperty("number")
    private Long number;

    @JsonProperty("date_time")
    private LocalDateTime dateTime;

    @JsonProperty("items")
    private List<OrderItemMessageInput> items = new LinkedList<>();

    @Getter
    @Setter
    @ToString
    public static class OrderItemMessageInput{

        @JsonProperty("product_id")
        private Long id;

        @JsonProperty("amount")
        private BigDecimal amount;
    }
}
