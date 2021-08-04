package com.test.customerservice.service;

import io.eventuate.tram.commands.consumer.CommandHandlers;
import io.eventuate.tram.sagas.participant.SagaCommandHandlersBuilder;

public class StoreCommandHandler {

    private final StoreItemService storeItemService;

    public StoreCommandHandler(StoreItemService storeItemService) {
        this.storeItemService = storeItemService;
    }

    public CommandHandlers commandHandlerDefinitions() {
        return SagaCommandHandlersBuilder.fromChannel("storeService").;
    }
}
