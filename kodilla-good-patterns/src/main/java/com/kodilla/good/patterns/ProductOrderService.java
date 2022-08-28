package com.kodilla.good.patterns;

import java.time.LocalDateTime;

interface ProductOrderService {
    boolean sold(User user, LocalDateTime orderDate, Product product, int quantity);
}