package com.example.wallpaper.service;

import com.example.wallpaper.domain.Picture;
import com.example.wallpaper.domain.WallPaperEntity;

import java.util.List;

/**
 * @author Hong
 * @date 2021/7/12
 */
public interface PicService {
    List<WallPaperEntity> list(int pcursor, int limit);
    int upLoad(Picture picture);
    int SearchMD5Code(String md5Code);
}
