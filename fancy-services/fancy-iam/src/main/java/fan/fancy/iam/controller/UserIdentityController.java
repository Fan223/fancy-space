package fan.fancy.iam.controller;

import fan.fancy.iam.service.UserIdentityService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户身份控制器.
 *
 * @author Fan
 */
@RestController
@RequestMapping("/iam/userIdentities")
@AllArgsConstructor
public class UserIdentityController {

    private final UserIdentityService userIdentityService;
}
