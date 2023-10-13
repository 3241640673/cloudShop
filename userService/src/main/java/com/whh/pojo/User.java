package com.whh.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("user1")
public class User {
    private Integer userId;
    private  String userName;
    private String userSex;
    private String userAge;
    private String userFrom;
}
