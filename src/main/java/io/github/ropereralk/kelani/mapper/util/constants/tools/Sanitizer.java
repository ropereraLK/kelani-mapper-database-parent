package io.github.ropereralk.kelani.mapper.util.constants.tools;

import io.github.ropereralk.kelani.mapper.exceptions.SanitizerException;
import io.micrometer.common.util.StringUtils;
import org.jsoup.Jsoup;
import org.jsoup.safety.Safelist;

public final class Sanitizer {
    public static String sanitize(String dirtyInput){

        if (StringUtils.isNotBlank(dirtyInput)){
               return Jsoup.clean(dirtyInput, Safelist.simpleText());
        }
       throw new SanitizerException("Input Sanitization Failed");
    }
}
