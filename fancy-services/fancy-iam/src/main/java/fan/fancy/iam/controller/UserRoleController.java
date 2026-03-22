package fan.fancy.iam.controller;

import fan.fancy.iam.service.UserRoleService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户角色关联控制器.
 *
 * @author Fan
 */
@RestController
@RequestMapping("/iam/userRoles")
@AllArgsConstructor
public class UserRoleController {

    private final UserRoleService userRoleService;
}
