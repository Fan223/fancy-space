package fan.fancy.iam.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import entity.RolePermission;
import mapper.RolePermissionMapper;
import org.springframework.stereotype.Service;
import service.IRolePermissionService;

/**
 * <p>
 * 角色权限关联表 服务实现类
 * </p>
 *
 * @author Fan
 * @since 2026-03-20 16:33:34
 */
@Service
public class RolePermissionServiceImpl extends ServiceImpl<RolePermissionMapper, RolePermission> implements IRolePermissionService {

}
