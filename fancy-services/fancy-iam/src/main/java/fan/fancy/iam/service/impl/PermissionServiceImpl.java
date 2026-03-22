package fan.fancy.iam.service.impl;

import fan.fancy.iam.mapper.PermissionMapper;
import fan.fancy.iam.service.PermissionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * 权限接口实现类.
 *
 * @author Fan
 */
@Service
@RequiredArgsConstructor
public class PermissionServiceImpl implements PermissionService {

    private final PermissionMapper permissionMapper;

}
