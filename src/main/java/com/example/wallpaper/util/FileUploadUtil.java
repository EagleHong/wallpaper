package com.example.wallpaper.util;

import com.example.wallpaper.domain.Picture;
import lombok.Value;
import net.coobird.thumbnailator.Thumbnails;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * @author Hong
 * @date 2021/7/14
 */

@Component
public class FileUploadUtil {


    public static Picture upload(MultipartFile multipartFile,String imagesPath) throws IOException {
        String str = String.valueOf(System.currentTimeMillis());
        str +=  (int)((Math.random() * 9 + 1) * 10000);
        String type = multipartFile.getContentType().split("/")[1];
        System.out.println(imagesPath);

        String filePath = imagesPath + "rawPic/"+str+"."+type;
        String smallPath = imagesPath + "minPic/"+str+"."+type;
        File file = new File(filePath);
        File smallFile = new File(smallPath);

        BufferedImage image = null;
        int height = 0;
        int width = 0;
        if(!file.exists()){
            try{
                file.createNewFile();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
        //获取宽高
        try {
            image = ImageIO.read(multipartFile.getInputStream());
            height = image.getHeight();
            width = image.getWidth();
        }catch (IOException e){
            e.printStackTrace();
        }
        //储存
        try{
            Thumbnails.of(multipartFile.getInputStream()).scale(500.0/width).toFile(smallFile);
            multipartFile.transferTo(file);
        }catch (IOException e){
            e.printStackTrace();
            throw e;
        }


        Picture picture = new Picture(null,null, multipartFile.getOriginalFilename(),
                "https://maoyou.site//rawPic/"+str+"."+type,"https://maoyou.site//minPic/"+str+"."+type,null,height,width);
        return picture;
    }
}
