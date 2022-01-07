package mapper;

import com.yr.rongmall.ApiRunApplicationMain;
import com.yr.rongmall.entity.User;
import com.yr.rongmall.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest(classes = {ApiRunApplicationMain.class})
class UserMapperTest {
    @Resource
    private UserMapper userMapper;

    @Test
    void select() {
        User user = new User();
        List<User> select = userMapper.select(user);
        for (User user1 : select) {
            System.out.println(user1);
        }
    }

    @Test
    void insertUser(){
        User user = new User();
        user.setUsername("zhangsan");
        user.setPassword("123456");
        userMapper.insertUser(user);
    }
}