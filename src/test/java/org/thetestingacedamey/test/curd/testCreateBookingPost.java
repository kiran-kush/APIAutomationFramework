package org.thetestingacedamey.test.curd;

import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testCreateBookingPost {

     @Description("Verify that ost request is working fine")
     @Owner("Kiran")
     @Severity(SeverityLevel.BLOCKER)
     @Test
    public void testVerifyCreateBookingPost(){
        Assert.assertEquals("true","true");


    }

}
