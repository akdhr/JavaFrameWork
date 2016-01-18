package com.sunms.service.accountService.accountServiceImpl;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

import com.mysql.fabric.xmlrpc.base.Param;
import com.sun.xml.internal.xsom.impl.scd.Iterators.Map;
import com.sunms.dao.accountDao.AccountDao;
import com.sunms.service.accountService.AccountService;

@Service(value = "accountService")
public class AccountServiceImpl implements AccountService {

	@Autowired
	private TransactionTemplate transactionTemplate;
	@Autowired
	private AccountDao accountDao;

	public void transfer(final String out, final String in, final Double money) {

		transactionTemplate.execute(new TransactionCallbackWithoutResult() {

			@Override
			protected void doInTransactionWithoutResult(TransactionStatus status) {
				java.util.Map<String, Object> outMap = new HashMap<String, Object>(2);
				outMap.put("name", "xiaoshuai");
				outMap.put("money", 200d);
				accountDao.outMoney(outMap);
				 int i = 1 / 0;
				java.util.Map<String, Object> inMap = new HashMap<String, Object>(2);
				inMap.put("name", "sunms");
				inMap.put("money", 200d);
				accountDao.inMoney(inMap);
			}
		});
	}

}
