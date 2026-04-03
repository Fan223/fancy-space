package fan.fancy.iam.controller;

import fan.fancy.iam.service.RolePermissionService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 角色权限关联控制器.
 *
 * @author Fan
 */
@RestController
@RequestMapping("/iam/rolePermissions")
@AllArgsConstructor
public class RolePermissionController {

    private final RolePermissionService rolePermissionService;
}
