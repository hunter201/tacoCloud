package com.rad.springstarter.repositories;

import com.rad.springstarter.TacoOrder;

public interface OrderRepository {
    TacoOrder save(TacoOrder order);
}
