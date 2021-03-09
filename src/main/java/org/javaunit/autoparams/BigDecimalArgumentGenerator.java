package org.javaunit.autoparams;

import java.math.BigDecimal;
import java.util.Optional;

final class BigDecimalArgumentGenerator implements ArgumentGenerator {

    @Override
    public Optional<Object> generate(ArgumentGenerationContext context) {
        Class<?> type = context.getParameter().getType();
        return type.equals(BigDecimal.class) ? factory() : Optional.empty();
    }

    private Optional<Object> factory() {
        return Optional.of(new BigDecimal(RANDOM.nextInt()));
    }

}