package com.liuhuan.backend.innerservice;

import com.liuhuan.backend.common.ErrorCode;
import com.liuhuan.backend.exception.BusinessException;
import com.liuhuan.backend.model.entity.User;
import com.liuhuan.backend.model.vo.UserVO;
import jakarta.servlet.http.HttpServletRequest;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import static com.liuhuan.backend.constant.UserConstant.USER_LOGIN_STATE;

/**
 * @author L_H
 * @since 2026-02-04 11:28:01
 */
public interface InnerUserService {

    List<User> listByIds(Collection<? extends Serializable> ids);

    User getById(Serializable id);

    UserVO getUserVO(User user);

    // 静态方法，避免跨服务调用
    static User getLoginUser(HttpServletRequest request) {
        Object userObj = request.getSession().getAttribute(USER_LOGIN_STATE);
        User currentUser = (User) userObj;
        if (currentUser == null || currentUser.getId() == null) {
            throw new BusinessException(ErrorCode.NOT_LOGIN_ERROR);
        }
        return currentUser;
    }
}