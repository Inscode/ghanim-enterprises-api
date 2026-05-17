package lk.ghanim.api.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderResponse {
    private Long id;
    private String customerName;
    private String customerEmail;
    private List<OrderItemResponse> items;
    private BigDecimal subtotal;
    private BigDecimal discount;
    private BigDecimal deliveryFee;
    private BigDecimal total;
    private String promoCode;
    private String status;
    private String priceType;
    private String recipientName;
    private String recipientPhone;
    private String province;
    private String district;
    private String cityTown;
    private String postalCode;
    private String streetAddress;
    private String deliveryNotes;
    private LocalDateTime createdAt;

    @Data
    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    public static class OrderItemResponse {
        private Long productId;
        private String productName;
        private String productEmoji;
        private String productImageUrl;
        private Integer quantity;
        private BigDecimal unitPrice;
        private BigDecimal totalPrice;
    }
}
