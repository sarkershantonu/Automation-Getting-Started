package org.automation.junit5.support;

import org.automation.junit5.support.data.User;
import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.params.aggregator.ArgumentsAccessor;
import org.junit.jupiter.params.aggregator.ArgumentsAggregationException;
import org.junit.jupiter.params.aggregator.ArgumentsAggregator;

/**
 * Created by shantonu on 4/3/2021
 */
public class UserAggregator implements ArgumentsAggregator {
    @Override
    public Object aggregateArguments(ArgumentsAccessor accessor, ParameterContext context) throws ArgumentsAggregationException {

        return new User(
                accessor.getString(1),
                accessor.getString(2),
                accessor.getString(3));
    }
}
