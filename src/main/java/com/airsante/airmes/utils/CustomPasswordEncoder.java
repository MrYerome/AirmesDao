package com.airsante.airmes.utils;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author jerome.vinet
 * @since 2019.05.28
 */
public class CustomPasswordEncoder implements PasswordEncoder {
    @Override
    public String encode(CharSequence rawPassword) {
        String mdpCrypted = DigestUtils.sha1Hex(rawPassword.toString());
        return mdpCrypted;
    }

    @Override
    public boolean matches(CharSequence rawPassword, String encodedPassword) {
//        System.out.println("rawPassword :" + rawPassword);
//        System.out.println("encodedPassword :" + encodedPassword);
        String mdpCrypte = DigestUtils.sha1Hex("VenT@i3$an734-9"+rawPassword);
//        System.out.println("mdp décrypté :" + mdpCrypte);
//        System.out.println("mdp attendu :" + encodedPassword);
        return mdpCrypte.equals(encodedPassword);
    }
}