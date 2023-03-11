package com.kinoz;

import com.kinoz.domain.pojo.User;
import com.kinoz.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.List;

/**
 * @author kinoz
 * @Date 2023/3/8 16:23
 * @apiNote
 */
@SpringBootTest
public class MapperTest {
    @Autowired
    UserMapper mapper;

    @Test
    public void TestA(){
        List<User> sysUsers = mapper.selectList(null);
        for (User sysUser : sysUsers) {
            System.out.println(sysUser);
        }
    }
}
