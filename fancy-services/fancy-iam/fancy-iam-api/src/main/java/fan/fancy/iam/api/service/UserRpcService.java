package fan.fancy.iam.api.service;

import fan.fancy.iam.api.bo.UserBO;

/**
 * 用户 RPC 接口.
 *
 * @author Fan
 */
public interface UserRpcService {

    UserBO getByUsername(String username);
}
