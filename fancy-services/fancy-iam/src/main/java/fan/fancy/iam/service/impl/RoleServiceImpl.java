package fan.fancy.iam.service.impl;

import fan.fancy.iam.mapper.RoleMapper;
import fan.fancy.iam.service.RoleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * 角色接口实现类.
 *
 * @author Fan
 */
@Service
@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService {

    private final RoleMapper roleMapper;

}
