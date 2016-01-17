package com.sunms.dao.accountDao;

import java.util.Map;

import org.springframework.stereotype.Repository;



@Repository
public interface AccountDao {

	/**转入
	 * @param name
	 * @param money
	 */
	void inMoney(Map<String, Object> param);

	/**转出
	 * @param name
	 * @param money
	 */
	void outMoney(Map<String, Object> param);
}
