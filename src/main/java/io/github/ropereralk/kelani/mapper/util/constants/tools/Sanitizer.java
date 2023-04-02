package io.github.ropereralk.kelani.mapper.util.constants.tools;

import org.jsoup.Jsoup;
import org.jsoup.safety.Safelist;

public final class Sanitizer {
    public static  String sanitize(String dirtyInput){
        return  Jsoup.clean(dirtyInput, Safelist.simpleText());
    }
}
