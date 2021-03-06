package com.internet.cms.service.user;

import java.util.List;

import com.internet.cms.model.Role;
import com.internet.cms.model.UserRole;

public interface IRoleService {
	/**
	 * 根据用户角色对应关系获取登录用户角色列表信息
	 * @param urs 当前登陆用户的用户角色列表信息
	 * @return 根据用户角色对应关系获取登录用户角色信息
	 */
	public List<Role> listRole(List<UserRole> urs);
	/**
	 * 获取所有的角色列表信息
	 * @return 所有的角色列表信息
	 */
	public List<Role> listRole();
	
	/**
	 * 添加角色信息
	 * @param role 角色对象
	 */
	public int add(Role role);
	
	/**
	 * 删除角色信息(在删除角色之前需要判断此角色中是否含有用户信息)
	 * @param id 角色id
	 */
	public int delete(int id);
	
	/**
	 * 更新角色信息
	 * @param role 角色对象
	 */
	public int update(Role role);
	
	/**
	 * 根据指定角色id获取角色信息
	 * @param id 角色id
	 * @return 指定id的角色信息
	 */
	public Role load(int id);
	
	/**
	 * 删除角色下的用户信息
	 * @param rid 角色id
	 */
	public int deleteRoleUsers(int rid);
	
}
