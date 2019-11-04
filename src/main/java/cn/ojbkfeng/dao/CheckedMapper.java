package cn.ojbkfeng.dao;

import cn.ojbkfeng.bean.Checked;
import cn.ojbkfeng.bean.CheckedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CheckedMapper {
    long countByExample(CheckedExample example);

    int deleteByExample(CheckedExample example);

    int insert(Checked record);

    int insertSelective(Checked record);

    List<Checked> selectByExample(CheckedExample example);

    int updateByExampleSelective(@Param("record") Checked record, @Param("example") CheckedExample example);

    int updateByExample(@Param("record") Checked record, @Param("example") CheckedExample example);

    int updateByChecked(Checked checked);
}