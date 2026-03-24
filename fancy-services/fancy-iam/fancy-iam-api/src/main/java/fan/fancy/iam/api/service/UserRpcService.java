package fan.fancy.iam.api.service;

import fan.fancy.iam.api.bo.UserBO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * 用户 RPC 接口.
 *
 * @author Fan
 */
@FeignClient("fancy-iam")
public interface UserRpcService {

    @GetMapping("/iam/users/identity/{identifier}")
    UserBO getByUsername(@PathVariable String identifier);
}
