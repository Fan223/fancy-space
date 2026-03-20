package fan.fancy.iam.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import entity.UserRole;
import mapper.UserRoleMapper;
import org.springframework.stereotype.Service;
import service.IUserRoleService;

/**
 * <p>
 * 用户角色关联表 服务实现类
 * </p>
 *
 * @author Fan
 * @since 2026-03-20 16:33:34
 */
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole> implements IUserRoleService {

}
