package fan.fancy.iam.controller;

import fan.fancy.iam.converter.IamConverter;
import fan.fancy.iam.service.PermissionService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 权限控制器.
 *
 * @author Fan
 */
@RestController
@RequestMapping("/iam/permissions")
@AllArgsConstructor
public class PermissionController {

    private final PermissionService permissionService;

    private final IamConverter blogConverter;
}
