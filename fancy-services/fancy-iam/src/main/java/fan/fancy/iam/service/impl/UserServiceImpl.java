package fan.fancy.iam.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import entity.User;
import mapper.UserMapper;
import org.springframework.stereotype.Service;
import service.IUserService;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author Fan
 * @since 2026-03-20 16:33:34
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
