package com.adele;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class QueryStringTest {
    @Test
    void createTest() {
        QueryString queryString = new QueryString("operand1","11");
        assertThat(queryString).isNotNull();
    }
}
