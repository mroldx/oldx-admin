package cc.oldx.mbg.domain;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import lombok.Data;

@ApiModel(value="cc-oldx-mbg-domain-EmployeeTbl")
@Data
public class EmployeeTbl implements Serializable {
    @ApiModelProperty(value="")
    private String empId;

    @ApiModelProperty(value="")
    private String lastName;

    @ApiModelProperty(value="")
    private String firstName;

    @ApiModelProperty(value="")
    private String middleName;

    @ApiModelProperty(value="")
    private String address;

    @ApiModelProperty(value="")
    private String city;

    @ApiModelProperty(value="")
    private String state;

    @ApiModelProperty(value="")
    private Integer zip;

    @ApiModelProperty(value="")
    private String phone;

    @ApiModelProperty(value="")
    private String pager;

    private static final long serialVersionUID = 1L;
}