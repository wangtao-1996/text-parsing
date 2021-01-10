package com.haier.textparsing.pojo;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import lombok.Data;

import java.util.Date;

@Data
@TableName("order")
public class Order {

    @TableId(value = "id",type = IdType.ID_WORKER)
    private Integer id;

    @TableField("order_num")
    private String orderNum;

    @TableField("desc")
    private String desc;

    @TableField("create_date")
    private Date createDate;

    @TableField("deleted_flag")
    private boolean deletedFlag;
}
