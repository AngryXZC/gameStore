package com.xzc.gamestore.service;
import com.xzc.gamestore.domain.AdminUserDetails;
import com.xzc.gamestore.domain.UmsResource;

import java.util.List;

/**
 * @author xzc
 * @date 2025/7/7 22 12:06
 * @description
 */





public interface UmsAdminService {
    /**
     * 根据用户名获取用户信息
     */
    AdminUserDetails getAdminByUsername(String username);

    /**
     * 获取所以权限列表
     */
    List<UmsResource> getResourceList();

    /**
     * 用户名密码登录
     */
    String login(String username, String password);
}
