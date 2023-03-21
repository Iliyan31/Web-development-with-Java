package bg.uni.fmi.lab02.streams.entity;

import java.math.BigDecimal;

public record Item(String description, BigDecimal price) {
    public Item {
        if (description == null || description.isEmpty() || description.isBlank()) {
            throw new IllegalArgumentException("The description if the item cannot be null, empty or blank!");
        }
    }
}