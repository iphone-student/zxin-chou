package com.chou.service.impl.zb;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chou.Util.ValidatorUtil;
import com.chou.dao.zb.SysUser;
import com.chou.exception.service.ServiceException;
import com.chou.service.zb.SysUserService;
import com.chou.mapper.zb.SysUserMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.ObjectUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.oauth2.provider.authentication.OAuth2AuthenticationDetails;
import org.springframework.stereotype.Service;
//import org.springframework.security.oauth2.provider.OAuth2Authentication;
import java.util.Date;
import java.util.List;

/**
* @author 10727
* @description 针对表【sys_user】的数据库操作Service实现
* @createDate 2022-08-18 08:32:37
*/
@Slf4j
@Service
@DS("zb")
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser>
implements SysUserService{
    @Autowired
    private SysUserMapper sysUserMapper;
    @Override
    public List<SysUser> allUser(){
        return sysUserMapper.allUser();
    }

    @Override
    public int insertAll(SysUser sysUser){
        try {
            String username = sysUser.getUsername();
            if (StringUtils.isBlank(username)) {
                throw new IllegalArgumentException("用户名不能为空");
            }

            if (ValidatorUtil.checkPhone(username)) {// 防止用手机号直接当用户名，手机号要发短信验证
                throw new IllegalArgumentException("用户名要包含英文字符");
            }

            if (username.contains("@")) {// 防止用邮箱直接当用户名，邮箱也要发送验证（暂未开发）
                throw new IllegalArgumentException("用户名不能包含@");
            }

            if (username.contains("|")) {
                throw new IllegalArgumentException("用户名不能包含|字符");
            }

            if (StringUtils.isBlank(sysUser.getPassword())) {
                throw new IllegalArgumentException("密码不能为空");
            }


            SysUser persistenceUser = sysUserMapper.findByUsername(username);
            if (persistenceUser != null && persistenceUser.getUsername() != null) {
                throw new IllegalArgumentException("用户名已存在");
            }
            sysUser.setEnabled(0);
            sysUser.setCreateTime(new Date());
            sysUser.setUpdateTime(sysUser.getCreateTime());
            log.info("添加用户：{}", sysUser);
            return sysUserMapper.insertAll(sysUser);
        } catch (Exception e) {
            throw new ServiceException(e);
        }
    }

    @Override
    public int updateAll(SysUser sysUser){
//        try {
            sysUser.setUpdateTime(new Date());
//            Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
//
//            if (authentication instanceof OAuth2Authentication) {
//                OAuth2Authentication oAuth2Auth = (OAuth2Authentication) authentication;
//                authentication = oAuth2Auth.getUserAuthentication();
//
//                OAuth2AuthenticationDetails details = (OAuth2AuthenticationDetails) oAuth2Auth.getDetails();
//
//                LoginAppUser user = SysUserUtil.getLoginAppUser();
//
//                if (user != null) {
//
//                    if ( !ObjectUtils.notEqual(user.getId(),sysUser.getId()) ) {
//
//                        OAuth2AccessToken token = redisTokenStore.readAccessToken(details.getTokenValue());
//
//                        if (token != null) {
//
//                            if (!StringUtils.isBlank(sysUser.getHeadImgUrl())) {
//                                user.setHeadImgUrl(sysUser.getHeadImgUrl());
//                            }
//
//                            if (!StringUtils.isBlank(sysUser.getNewPassword())) {
//                                user.setPassword(sysUser.getNewPassword());
//                            }
//
//                            if (!StringUtils.isBlank(sysUser.getNewPassword())) {
//                                user.setPassword(sysUser.getNewPassword());
//                            }
//
//                            if (!StringUtils.isBlank(sysUser.getNickname())) {
//                                user.setNickname(sysUser.getNickname());
//                            }
//
//                            if (!StringUtils.isBlank(sysUser.getPhone())){
//                                user.setPhone(sysUser.getPhone());
//                            }
//
//                            if (sysUser.getSex() != null) {
//                                user.setSex(sysUser.getSex());
//                            }
//
//                            UsernamePasswordAuthenticationToken userAuthentication = new UsernamePasswordAuthenticationToken(user,
//                                    null, user.getAuthorities());
//
//                            OAuth2Authentication oAuth2Authentication = new OAuth2Authentication(oAuth2Auth.getOAuth2Request(), userAuthentication);
//                            oAuth2Authentication.setAuthenticated(true);
//                            redisTokenStore.storeAccessToken(token, oAuth2Authentication);
//
//                        }
//
//                    }

//                }
//            }
            log.info("修改用户：{}", sysUser);
            return sysUserMapper.updateAll(sysUser);
//        } catch (Exception e) {
//            throw new ServiceException(e);
//        }
    }
}
