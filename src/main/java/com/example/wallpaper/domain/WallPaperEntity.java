package com.example.wallpaper.domain;

import lombok.Data;
import lombok.Setter;

/**
 * @author Hong
 * @date 2021/7/19
 */

@Data
@Setter
public class WallPaperEntity {
    String id;
    String url;
    String minUrl;
    int width;
    int height;
}
