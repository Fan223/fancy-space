package fan.fancy.iam.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import fan.fancy.iam.mapper.UserMapper;
import fan.fancy.iam.pojo.entity.UserDO;
import fan.fancy.iam.pojo.query.UserQuery;
import fan.fancy.iam.service.UserService;
import fan.fancy.toolkit.lang.StringUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户接口实现类.
 *
 * @author Fan
 */
@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

    @Override
    public Page<UserDO> page(UserQuery query) {
        LambdaQueryWrapper<UserDO> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.like(StringUtils.isNotBlank(query.getUsername()), UserDO::getNickname, query.getUsername());
        return userMapper.selectPage(new Page<>(query.getCurrentPage(), query.getPageSize()), queryWrapper);
    }

    @Override
    public UserDO getById(String id) {
        return userMapper.selectById(id);
    }

    @Override
    public int create(UserDO userDO) {
        return userMapper.insert(userDO);
    }

    @Override
    public int update(UserDO userDO) {
        return userMapper.updateById(userDO);
    }

    @Override
    public int deleteById(String id) {
        return userMapper.deleteById(id);
    }

    @Override
    public int deleteByIds(List<String> ids) {
        return userMapper.deleteByIds(ids);
    }
}
