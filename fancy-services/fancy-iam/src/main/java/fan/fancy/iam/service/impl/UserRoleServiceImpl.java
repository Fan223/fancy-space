package fan.fancy.iam.service.impl;

import fan.fancy.iam.mapper.UserRoleMapper;
import fan.fancy.iam.service.UserRoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * 用户角色关联接口实现类.
 *
 * @author Fan
 */
@Service
@RequiredArgsConstructor
public class UserRoleServiceImpl implements UserRoleService {

    private final UserRoleMapper userRoleMapper;

}
