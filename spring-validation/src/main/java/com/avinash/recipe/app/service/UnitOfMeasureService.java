package com.avinash.recipe.app.service;

import java.util.Set;

import com.avinash.recipe.app.commands.UnitOfMeasureCommand;

/**
 * Created by jt on 6/28/17.
 */
public interface UnitOfMeasureService {

    Set<UnitOfMeasureCommand> listAllUoms();
}