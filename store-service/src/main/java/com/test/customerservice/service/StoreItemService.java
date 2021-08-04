package com.test.customerservice.service;

import com.test.customerservice.dao.StoreItem;
import com.test.customerservice.repository.StoreItemRepository;
import org.springframework.stereotype.Service;

@Service
public class StoreItemService {

    private final StoreItemRepository storeItemRepository;

    public StoreItemService(StoreItemRepository storeItemRepository) {
        this.storeItemRepository = storeItemRepository;
    }

    public synchronized void reserveItem(Long id, Number amountItems) {
        StoreItem storeItem = storeItemRepository.getById(id);
        int storeItemAmountInt = storeItem.getAmount().intValue();
        int amountItemsInt = amountItems.intValue();

        if (storeItemAmountInt > amountItemsInt) {
            storeItem.setAmount(storeItem.getAmount().intValue() - amountItems.intValue());
        }
    }

}
