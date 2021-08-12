package com.example.wallpaper.domain;

import lombok.Getter;

/**
 * @author Hong
 * @date 2021/7/19
 */

@Getter
public class Header {
    String version;
    String did;
    String nonce;
    String sign;
}
