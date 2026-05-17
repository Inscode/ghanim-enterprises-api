package lk.ghanim.api.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.util.List;

@Data
public class OrderRequest {
    @NotEmpty(message = "Order must have at least one item")
    private List<OrderItemRequest> items;

    private String promoCode;

    // Recipient
    @NotBlank(message = "Recipient name is required")
    private String recipientName;

    @NotBlank(message = "Phone number is required")
    @Pattern(regexp = "^(\\+94|0)?[0-9]{9}$", message = "Invalid Sri Lankan phone number")
    private String recipientPhone;

    // Address
    @NotBlank(message = "Province is required")
    private String province;

    @NotBlank(message = "District is required")
    private String district;

    @NotBlank(message = "City/Town is required")
    private String cityTown;

    @Size(max = 10, message = "Postal code must be at most 10 characters")
    private String postalCode;

    @NotBlank(message = "Street address is required")
    private String streetAddress;

    private String landmark;

    private String deliveryNotes;

    @Data
    public static class OrderItemRequest {
        private Long productId;
        private Integer quantity;
    }
}
