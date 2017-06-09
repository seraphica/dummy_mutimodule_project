package com.awesomeness.dummy;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class IntroductionServiceTest {

    private static final String THIS_IS_AWESOME_STRING = "this is awesome app";

    private IntroductionService introductionModule0Class;

    @Before
    public void setUp() throws Exception {
        introductionModule0Class = new IntroductionService();
    }

    @Test
    public void shouldGetName() throws Exception {
        //given

        //when
        String result = introductionModule0Class.getName();

        //then
        assertThat(result).isNotEmpty().isEqualTo(THIS_IS_AWESOME_STRING);

    }

}