package org.bro.demouom;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.bro.demouom.testUtil.DimensionFactory.createMissDimension;

public class DimensionShould {
    @Test
    void constructed_properly() {
        var dimension = createMissDimension();
        assertThat(dimension.id()).isEqualTo(1);
        assertThat(dimension.name()).isEqualTo("Miss");
        assertThat(dimension.symbol()).isEqualTo("m");
    }
}
