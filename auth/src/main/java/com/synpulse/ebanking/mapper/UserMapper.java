package com.synpulse.ebanking.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.synpulse.ebanking.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface UserMapper extends BaseMapper<UserEntity> {
}
