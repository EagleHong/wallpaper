package com.example.wallpaper.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

/**
 * @author Hong
 * @date 2021/7/19
 */

@Data
@Setter
@NoArgsConstructor
public class WallPaperListResult {
    String result;
    String errorMsg;
    List<WallPaperEntity> list;
}
