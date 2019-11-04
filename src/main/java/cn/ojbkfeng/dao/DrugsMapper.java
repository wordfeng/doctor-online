package cn.ojbkfeng.dao;

import cn.ojbkfeng.bean.Drugs;
import cn.ojbkfeng.bean.DrugsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DrugsMapper {
    long countByExample(DrugsExample example);

    int deleteByExample(DrugsExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Drugs record);

    int insertSelective(Drugs record);

    List<Drugs> selectByExample(DrugsExample example);
    List<Drugs> selectByKeyWords(String medicine);

    Drugs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Drugs record, @Param("example") DrugsExample example);

    int updateByExample(@Param("record") Drugs record, @Param("example") DrugsExample example);

    int updateByPrimaryKeySelective(Drugs record);

    int updateByPrimaryKey(Drugs record);
}