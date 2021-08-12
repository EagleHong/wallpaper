package com.example.wallpaper.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.*;

import java.sql.Date;

/**
 * @author Hong
 * @date 2021/7/12
 */
@Data
@TableName("pictures")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@EqualsAndHashCode(callSuper = false)
public class Picture {
    private Integer id;

    private Date date;

    private String name;

    private String url;

    private String minUrl;

    private String MD5Code;

    private Integer height;

    private Integer width;
}
