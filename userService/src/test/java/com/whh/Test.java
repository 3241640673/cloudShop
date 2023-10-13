package com.whh;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;
@RunWith(SpringRunner.class)
@SpringBootTest
public class Test {
    @Autowired(required = false)
    private StringRedisTemplate stringRedisTemplate;
    @org.junit.Test
    public void tests(){
stringRedisTemplate.opsForValue().set("school","mz");
    }
}
