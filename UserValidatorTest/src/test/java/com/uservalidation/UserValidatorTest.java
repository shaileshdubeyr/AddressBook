package com.uservalidation;

import org.junit.Assert;
import org.junit.Test;

public class UserValidatorTest{

   @Test
   public void givenFirstNameWhenPropershouldReturnTrue() {
      UserValidator userDetails = new UserValidator();
      boolean testStatus = userDetails.validateDetails(Rejex.FIRST_NAME_PATTERN.pattern,"Shailesh", "FIRST_NAME_PATTERN");
      Assert.assertTrue(testStatus);
   }

   @Test
   public void givenLastNameWhenPropershouldReturnTrue() {
      UserValidator userDetails = new UserValidator();
      boolean testStatus = userDetails.validateDetails( Rejex.LAST_NAME_PATTERN.pattern, "Dubey","LAST_NAME_PATTERN");
      Assert.assertTrue(testStatus);

   }

   @Test
   public void givenPasswordShouldReturnTrueWhenSpecialCharaterhaveAnyOne() {
      UserValidator userDetails = new UserValidator();
      boolean testStatus = userDetails.validateDetails(Rejex.PASSWORD_PATTERN.pattern, "Shailesh@889","PASSWORD_PATTERN");
      Assert.assertTrue(testStatus);
   }

   @Test
   public void givenInputMobilenumberReturnTrueWhenSpaceAfterSpace(){
      UserValidator userDetails = new UserValidator();
      boolean testStatus = userDetails.validateDetails(Rejex.MOBILE_NO_PATTERN.pattern, "91 7046909396", "MOBILE_NO_PATTERN");
      Assert.assertTrue(testStatus);
   }

   @Test
   public void givenEmailShouldReturnTrueWhenalltheConditionSatisfied() {
      UserValidator userDetails = new UserValidator();
      boolean testStatus = userDetails.validateDetails(Rejex.EMAIL_PATTERN.pattern, "Shailesh@jvj123","EMAIL_PATTERN");
      Assert.assertTrue(testStatus);
   }
}