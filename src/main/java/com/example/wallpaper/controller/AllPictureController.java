package com.example.wallpaper.controller;

import com.example.wallpaper.domain.Picture;
import com.example.wallpaper.domain.WallPaperEntity;
import com.example.wallpaper.domain.WallPaperListResult;
import com.example.wallpaper.service.impl.PicServiceImpl;
import com.example.wallpaper.util.FileUploadUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;


import java.io.IOException;
import java.util.List;

/**
 * @author Hong
 * @date 2021/7/12
 */

@Slf4j
@CrossOrigin
@RestController
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@RequestMapping("/wallpaper")
public class AllPictureController {
    private final PicServiceImpl picService;

    @GetMapping("/list")
    public WallPaperListResult list(@RequestParam(value = "pcursor") String pcursor, @RequestParam(value = "limit", defaultValue = "10") String limit){
        WallPaperListResult wallPaperListResult = new WallPaperListResult();
        try{
            List<WallPaperEntity> pictures = picService.list(Integer.valueOf(pcursor),Integer.valueOf(limit));
            wallPaperListResult.setList(pictures);
            wallPaperListResult.setResult("1");
        }catch (Exception e){
            e.printStackTrace();
            wallPaperListResult.setResult("0");
        }

        return wallPaperListResult;
    }

    @PostMapping("/upload")
    public int upload(@RequestParam("file") MultipartFile multipartFile,@Value("${wallpaper.imagesPath}")String url){
        System.out.println("got http request");
        /*
        * 返回1 成功 2 文件已存在 3 文件不是图片或者其他错误
        * */
        try{
            String MD5Code = DigestUtils.md5DigestAsHex(multipartFile.getInputStream());
            if(!multipartFile.getContentType().contains("image")){
                return 3;
            }
            int num = picService.SearchMD5Code(MD5Code);
            if(num==0){
                Picture picture = FileUploadUtil.upload(multipartFile,url);
                picture.setMD5Code(MD5Code);
                System.out.println(picService.upLoad(picture));
                return 1;
            }else{
                return 2;
            }
        }catch (IOException e){
            e.printStackTrace();
            return 3;
        }
    }

}
