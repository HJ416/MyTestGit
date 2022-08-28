package cn.com.demo.service;

import java.util.List;

/**
 * @author hj
 * @time 
 */
public interface IShopCarService {
	public void addShop(int spId, int count);

	public List getItems();
}
