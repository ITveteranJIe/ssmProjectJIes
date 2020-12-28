package Jie.bag.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@SuppressWarnings("all")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BackendUser {
	// `backend_user` 字段
	private Integer id;//主键id
	private String userCode;//用户编码（登录账号）
	private String userName;//用户名称
	private String userPassword;//用户密码
	private Integer userType;//用户角色类型id
	private Integer createdBy;//创建者
	private Date creationDate;//创建时间
	private Integer modifyBy;//更新者
	private Date modifyDate;//更新时间

	//`data_dictionary`表字段
	private String userTypeName;//用户角色类型名称
	

}
