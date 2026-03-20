package fan.fancy.iam.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import entity.UserIdentity;
import mapper.UserIdentityMapper;
import org.springframework.stereotype.Service;
import service.IUserIdentityService;

/**
 * <p>
 * 用户身份表 服务实现类
 * </p>
 *
 * @author Fan
 * @since 2026-03-20 16:33:34
 */
@Service
public class UserIdentityServiceImpl extends ServiceImpl<UserIdentityMapper, UserIdentity> implements IUserIdentityService {

}
