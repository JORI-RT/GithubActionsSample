package com.example.demo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class SampleTest {
    @DisplayName("sampel test")
    @Test
    void name() {
        assertThat(true).isEqualTo(true);
    }
}
