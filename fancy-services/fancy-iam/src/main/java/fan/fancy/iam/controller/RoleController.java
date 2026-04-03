package fan.fancy.iam.controller;

import fan.fancy.iam.service.RoleService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 角色控制器.
 *
 * @author Fan
 */
@RestController
@RequestMapping("/iam/roles")
@AllArgsConstructor
public class RoleController {

    private final RoleService roleService;
}
