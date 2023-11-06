package org.example;


import javax.security.auth.x500.X500Principal;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GetDomainName {
    void nameToTxt(X509Certificate certificate) {
        X500Principal principal = certificate.getSubjectX500Principal();
        List<String> names = new ArrayList<>();
        Pattern pattern = Pattern.compile("CN=([^,]+)");
        Matcher matcher = pattern.matcher(principal.getName());
        while (matcher.find()) {
            names.add(matcher.group(1));
        }

        for (String commonName : names) {
            System.out.println(commonName);
        }
    }
}