package com.example.wallpaper.service.impl;

import com.example.wallpaper.domain.Picture;
import com.example.wallpaper.domain.WallPaperEntity;
import com.example.wallpaper.mapper.PictureMapper;
import com.example.wallpaper.service.PicService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Hong
 * @date 2021/7/12
 */
@Slf4j
@Service
public class PicServiceImpl implements PicService {

    @Resource
    private PictureMapper pictureMapper;

    @Override
    public List<WallPaperEntity> list(int pcursor, int limit) {
        int offset = (pcursor-1)*limit;
        return pictureMapper.list(offset,limit);
    }

    @Override
    public int upLoad(Picture picture) {
        return pictureMapper.upLoad(picture);
    }

    @Override
    public int SearchMD5Code(String md5Code) {
        return pictureMapper.SearchMD5Code(md5Code);
    }

    @Override
    public int getTotal() {
        return pictureMapper.getTotal();
    }
}
