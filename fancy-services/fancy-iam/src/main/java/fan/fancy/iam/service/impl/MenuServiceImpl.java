package fan.fancy.iam.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import fan.fancy.iam.mapper.MenuMapper;
import fan.fancy.iam.pojo.entity.MenuDO;
import fan.fancy.iam.pojo.query.MenuQuery;
import fan.fancy.iam.service.MenuService;
import fan.fancy.toolkit.lang.StringUtils;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 菜单接口实现类.
 *
 * @author Fan
 */
@Service
@AllArgsConstructor
public class MenuServiceImpl implements MenuService {

    private final MenuMapper menuMapper;

    @Override
    public Page<MenuDO> page(MenuQuery query) {
        LambdaQueryWrapper<MenuDO> queryWrapper = buildQueryWrapper(query);
        return menuMapper.selectPage(new Page<>(query.getCurrentPage(), query.getPageSize()), queryWrapper);
    }

    private LambdaQueryWrapper<MenuDO> buildQueryWrapper(MenuQuery query) {
        LambdaQueryWrapper<MenuDO> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.like(StringUtils.isNotBlank(query.getName()), MenuDO::getName, query.getName());
        return queryWrapper;
    }

    @Override
    public List<MenuDO> list(MenuQuery query) {
        LambdaQueryWrapper<MenuDO> queryWrapper = buildQueryWrapper(query);
        return menuMapper.selectList(queryWrapper);
    }

    @Override
    public int create(MenuDO menuDO) {
        return menuMapper.insert(menuDO);
    }

    @Override
    public int update(MenuDO menuDO) {
        return menuMapper.updateById(menuDO);
    }

    @Override
    public int deleteById(String id) {
        return menuMapper.deleteById(id);
    }

    @Override
    public int deleteByIds(List<String> ids) {
        return menuMapper.deleteByIds(ids);
    }
}
