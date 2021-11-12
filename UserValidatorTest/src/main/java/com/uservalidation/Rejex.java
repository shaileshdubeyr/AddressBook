package com.uservalidation;

public enum Rejex {
     EMAIL_PATTERN  ("^[a-zA-Z0-9+_.-]+[@]{1}[a-zA-Z0-9]+[.a-z]{4}([.a-zA-Z]{3})*$"),
     FIRST_NAME_PATTERN ("^[A-Z]{1}[a-zA-Z]{3,15}$"),
     LAST_NAME_PATTERN ("^[A-Z]{1}[a-zA-Z]{3,15}$"),
      MOBILE_NO_PATTERN ("^[0-9]{2}[ ][0-9]{10}$"),
      PASSWORD_PATTERN ("([!@#$%^&*()]?[A-Za-z0-9]+){8,}$");
      String pattern;
      Rejex(String value){
          this.pattern = value;
      }
}
