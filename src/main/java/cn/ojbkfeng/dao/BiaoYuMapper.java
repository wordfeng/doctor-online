package cn.ojbkfeng.dao;

import cn.ojbkfeng.bean.BiaoYu;
import cn.ojbkfeng.bean.BiaoYuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BiaoYuMapper {
    long countByExample(BiaoYuExample example);

    int deleteByExample(BiaoYuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BiaoYu record);

    int insertSelective(BiaoYu record);

    List<BiaoYu> selectByExample(BiaoYuExample example);

    BiaoYu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BiaoYu record, @Param("example") BiaoYuExample example);

    int updateByExample(@Param("record") BiaoYu record, @Param("example") BiaoYuExample example);

    int updateByPrimaryKeySelective(BiaoYu record);

    int updateByPrimaryKey(BiaoYu record);
}