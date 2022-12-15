package com.user.mapper;

import com.user.dto.UserInfoDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {


     List<UserInfoDTO> searchAll();
}
