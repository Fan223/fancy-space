package fan.fancy.iam.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import fan.fancy.iam.pojo.entity.MenuDO;
import fan.fancy.iam.pojo.query.MenuQuery;

import java.util.List;

/**
 * 菜单接口.
 *
 * @author Fan
 */
public interface MenuService {

    Page<MenuDO> page(MenuQuery query);

    List<MenuDO> list(MenuQuery query);

    int create(MenuDO menuDO);

    int update(MenuDO menuDO);

    int deleteById(String id);

    int deleteByIds(List<String> ids);
}
