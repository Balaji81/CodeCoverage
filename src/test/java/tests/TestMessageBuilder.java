package tests;

import sources.MessageBuilder;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMessageBuilder {
    @Test
    public void testNameMkyong() {

        MessageBuilder obj = new MessageBuilder();
        System.out.println("TestNG Framework");

        Assert.assertEquals("Hello mkyong", obj.getMessage("mkyong"));

    }
}

