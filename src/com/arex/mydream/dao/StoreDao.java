package com.arex.mydream.dao;
import java.util.List;

import com.arex.mydream.model.Store;


/**
 * 店面的接口
 * 
 * @author 葛睿 2016-3-3下午9:34:52
 */
public interface StoreDao {

	/**
	 * 增加店面
	 */
	public void add(Store store);

	/**
	 * 删除店面
	 */
	public void delete(int sid);

	/**
	 * 更改店面信息
	 * 
	 * @param store
	 */
	public void update(Store store);

	/**
	 * ' 查询所有店面信息
	 * 
	 * @return
	 */
	public List<Store> search();

	/**
	 * 查询一个店面里面的所有信息
	 * 
	 * @return
	 */
	public Store searchStore(int sid);

	/**
	 * 汪晓风 分页查询
	 * 
	 * @param pageNo
	 * @param pageSize
	 * @return
	 */
	public List<Store> searchPage_Store(Integer pageNo, Integer pageSize);

	/**
	 * 汪晓风 记录总数
	 * 
	 * @return
	 */
	public Integer searchStoreCount();

	/**
	 * 汪晓风 根据店主ID查询店面信息
	 * 
	 * @param sUid
	 * @return
	 */
	public Store searchStoreBySuid(Integer sUid);

}
