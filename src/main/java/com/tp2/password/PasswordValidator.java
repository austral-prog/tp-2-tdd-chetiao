package com.tp2.password;

public class PasswordValidator {

    public boolean isValid(String password) {
            if (password.length() < 9) {return false;} // si tiene menos de 8 es invalida

            boolean TieneMayus = false;
            boolean TieneNumero = false;    // string password = "hOla1f$"
            boolean TieneMinuscula = false;
            boolean TieneCaracterEspecial = false;


            for (int i = 0; i < password.length(); i++) {
                if (Character.isUpperCase(password.charAt(i)))
                {TieneMayus = true;}

                if (Character.isDigit(password.charAt(i)))
                {TieneNumero = true;}

                if (Character.isLowerCase(password.charAt(i)))
                {TieneMinuscula = true;}

                if (!Character.isLetterOrDigit(password.charAt(i)))
                {TieneCaracterEspecial = true;}

            }

            if (TieneMayus && TieneMinuscula && TieneCaracterEspecial // verifico que todo es true
            && TieneNumero) {
                return true;
            }
            else {return false;}

    }
    }