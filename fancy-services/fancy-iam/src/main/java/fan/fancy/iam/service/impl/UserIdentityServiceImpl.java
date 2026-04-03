package fan.fancy.iam.service.impl;

import fan.fancy.iam.mapper.UserIdentityMapper;
import fan.fancy.iam.service.UserIdentityService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * 用户身份接口实现类.
 *
 * @author Fan
 */
@Service
@RequiredArgsConstructor
public class UserIdentityServiceImpl implements UserIdentityService {

    private final UserIdentityMapper userIdentityMapper;

}
