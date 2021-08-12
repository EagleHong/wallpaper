package com.example.wallpaper.mapper;

import com.example.wallpaper.domain.Picture;
import com.example.wallpaper.domain.WallPaperEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Hong
 * @date 2021/7/12
 */
@Mapper
public interface PictureMapper {
    List<WallPaperEntity> list(@Param("offset") int offset,@Param("limit") int limit);
    int upLoad(Picture picture);
    int SearchMD5Code(String md5Code);
}
