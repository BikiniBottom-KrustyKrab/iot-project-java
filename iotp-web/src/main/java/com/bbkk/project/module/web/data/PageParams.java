package com.bbkk.project.module.web.data;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

/**
 * 通用的分页接口入参对象
 *
 * @author 一条秋刀鱼zz qchenzexuan@vip.qq.com
 * @since 2023-12-02 09:57
 **/
@Data
public class PageParams {

    @NotNull(message = "分页参数 current 不能为空")
    private Integer current;

    @NotNull(message = "分页参数 pageSize 不能为空")
    private Integer pageSize;

}
