package com.hrithik.projects.airBnbApp.strategy;

import com.hrithik.projects.airBnbApp.entity.Inventory;

import java.math.BigDecimal;

public interface PricingStrategy {

    BigDecimal calculatePrice(Inventory inventory);
}
