package com.example.wallpaper;

import com.example.wallpaper.domain.Picture;
import net.coobird.thumbnailator.Thumbnails;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedList;

@SpringBootTest
class WallpaperApplicationTests {

    @Test
    void contextLoads() {
    }

//    @Test
//    void imageText() throws IOException {
//        File file1 = new File("C:/Users/HP/Desktop/20210823092851.jpg");
//        FileInputStream input = new FileInputStream(file1);
//        MultipartFile multipartFile = new MockMultipartFile("file", file1.getName(), "image/jpg", input);
//        file1 = null;
//        input = null;
//        String imagesPath = "F:/wallPaperPic/";
//        final double smallPicWidth = 720.0;
//        String str = String.valueOf(System.currentTimeMillis());
//        str +=  (int)((Math.random() * 9 + 1) * 10000);
//        String type = multipartFile.getContentType().split("/")[1];
//        System.out.println(imagesPath);
//
//        String filePath = imagesPath + "rawPic/"+str+"."+type;
//        String smallPath = imagesPath + "minPic/"+str+"."+type;
//        File file = new File(filePath);
//        File smallFile = new File(smallPath);
//
//        BufferedImage image = null;
//        int height = 0;
//        int width = 0;
//        if(!file.exists()){
//            try{
//                file.createNewFile();
//            }catch (IOException e){
//                e.printStackTrace();
//            }
//        }
//        //获取宽高
//        try {
//            image = ImageIO.read(multipartFile.getInputStream());
//            height = image.getHeight();
//            width = image.getWidth();
////            image.getGraphics().dispose();
////            image = null;
//
//        }catch (IOException e){
//            e.printStackTrace();
//        }
//        //储存
//        try{
//            //储存原图
//            Thumbnails.of(multipartFile.getInputStream()).scale(smallPicWidth/width).toFile(smallFile);
//            //储存小图
//            multipartFile.transferTo(file);
//        }catch (IOException e){
//            e.printStackTrace();
//            throw e;
//        }
//        System.out.println(Runtime.getRuntime().freeMemory()/1024/1024);
//        // 的JVM内存总量（单位是字节）
//        System.out.println(Runtime.getRuntime().totalMemory()/1024/1024);
//
//
//        Picture picture = new Picture(null,null, multipartFile.getOriginalFilename(),
//                "https://maoyou.site//rawPic/"+str+"."+type,"https://maoyou.site//minPic/"+str+"."+type,null,height,width);
//    }

}
