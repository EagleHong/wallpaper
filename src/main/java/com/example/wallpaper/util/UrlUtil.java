package com.example.wallpaper.util;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Stack;

/**
 * @author Hong
 * @date 2021/7/22
 */
@Component
@PropertySource(value = "classpath:application.yml")
@ConfigurationProperties(prefix = "wallpaper")
@Setter
@Getter
public class UrlUtil {
    private String imagesPath;
}
