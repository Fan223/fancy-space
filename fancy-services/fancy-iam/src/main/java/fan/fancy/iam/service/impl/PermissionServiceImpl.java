package fan.fancy.iam.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import entity.Permission;
import mapper.PermissionMapper;
import org.springframework.stereotype.Service;
import service.IPermissionService;

/**
 * <p>
 * 权限表 服务实现类
 * </p>
 *
 * @author Fan
 * @since 2026-03-20 16:33:34
 */
@Service
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission> implements IPermissionService {

}
