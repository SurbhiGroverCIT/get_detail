package com.demo.form.demo;

public class ValidateForm {
    public Boolean validateName(String name){
        return(!name.trim().equals("")
                && name!=null
                && name.length()<50
                && name.length()>2
                && name.matches("^[a-zA-Z ]*$")
        );
    }
    public Boolean validateAddress(String address){
        return(!address.trim().equals("")
                && address!=null
                && address.length()<50
                && address.length()>2
                && address.matches("^[a-zA-Z0-9-/,. ]*$")
        );
    }
    public Boolean validateCity(String city){
        return(!city.trim().equals("")
                && city!=null
                && city.length()<100
                && city.length()>2
                && city.matches("^[a-zA-Z ]*$")
        );
    }
    public Boolean validateState(String state){
        return(!state.trim().equals("")
                && state!=null
                && state.length()<100
                && state.length()>2
                && state.matches("^[a-zA-Z ]*$")
        );
    }
    public Boolean validateCountry(String country){
        return(!country.trim().equals("")
                && country!=null
                && country.length()<60
                && country.length()>3
                && country.matches("^[a-zA-Z ]*$")
        );
    }
    public Boolean validatePhone(String phone){
        return(!phone.trim().equals("")
                && phone!=null
                && phone.length()<13
                && phone.length()>8
                && phone.matches("^[0-9]*$")
        );
    }
    public Boolean validatePincode(String pinCode){
        return(!pinCode.trim().equals("")
                && pinCode!=null
                && pinCode.length()<11
                && pinCode.length()>3
                && pinCode.matches("^[a-zA-Z0-9]*$")
        );
    }



}
