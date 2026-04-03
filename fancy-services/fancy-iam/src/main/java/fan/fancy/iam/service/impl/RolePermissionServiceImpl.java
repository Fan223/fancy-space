package fan.fancy.iam.service.impl;

import fan.fancy.iam.mapper.RolePermissionMapper;
import fan.fancy.iam.service.RolePermissionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * 角色权限关联接口实现类.
 *
 * @author Fan
 */
@Service
@RequiredArgsConstructor
public class RolePermissionServiceImpl implements RolePermissionService {

    private final RolePermissionMapper rolePermissionMapper;

}
