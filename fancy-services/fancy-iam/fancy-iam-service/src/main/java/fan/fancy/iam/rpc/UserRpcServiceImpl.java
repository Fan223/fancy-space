package fan.fancy.iam.rpc;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import fan.fancy.iam.api.pojo.bo.UserBO;
import fan.fancy.iam.api.pojo.entity.UserIdentityDO;
import fan.fancy.iam.api.service.UserRpcService;
import fan.fancy.iam.mapper.UserIdentityMapper;
import fan.fancy.iam.mapper.UserMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * 用户 RPC 接口实现类.
 *
 * @author Fan
 */
@Service
@AllArgsConstructor
public class UserRpcServiceImpl implements UserRpcService {

    private final UserIdentityMapper userIdentityMapper;

    private final UserMapper userMapper;

    @Override
    public UserBO getByUsername(String identifier) {
        LambdaQueryWrapper<UserIdentityDO> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(UserIdentityDO::getIdentifier, identifier);
        UserIdentityDO userIdentityDO = userIdentityMapper.selectOne(queryWrapper);
        return userMapper.selectUser(userIdentityDO.getUserId());
    }
}
