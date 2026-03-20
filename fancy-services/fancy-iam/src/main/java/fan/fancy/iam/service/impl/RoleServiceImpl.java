package fan.fancy.iam.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import entity.Role;
import mapper.RoleMapper;
import org.springframework.stereotype.Service;
import service.IRoleService;

/**
 * <p>
 * 角色表 服务实现类
 * </p>
 *
 * @author Fan
 * @since 2026-03-20 16:33:34
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

}
