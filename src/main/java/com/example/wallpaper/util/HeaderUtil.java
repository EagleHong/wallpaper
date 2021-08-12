package com.example.wallpaper.util;

import com.example.wallpaper.domain.Header;
import org.springframework.util.DigestUtils;

/**
 * @author Hong
 * @date 2021/7/19
 */
public class HeaderUtil {
    static final String secret = "asdfghjkl";
    boolean TestSign(Header header){
        String str = "version="+header.getVersion()+"&did="+header.getDid()+"&nonce="+header.getNonce()+"secret="+secret;
        String sign = DigestUtils.md5DigestAsHex(str.getBytes());
        return sign.equals(header.getSign());
    }
}
