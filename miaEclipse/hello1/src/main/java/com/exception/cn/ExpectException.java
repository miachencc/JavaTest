package com.exception.cn;

import org.testng.annotations.Test;

/*
  ʲôʱ����õ��쳣���ԣ�
  �������������Ϊĳһ���쳣��ʱ��
  ���磺���Ǵ�����ĳЩ���Ϸ��Ĳ����������׳����쳣
  Ҳ�������ǵ�Ԥ�ڽ����������쳣 
 */
public class ExpectException {
	// ����һ��ʧ�ܵ��쳣����
	@Test(expectedExceptions = RuntimeException.class)
		public void RunTimeExceptionFailed() {
			System.out.println("����һ��ʧ�ܵĲ���");
		}
	//����һ���ɹ����쳣����
	@Test(expectedExceptions = RuntimeException.class)
	public void RunTimeExceptionSuccess() {
		System.out.println("�����ҵ��쳣����");
		throw new RuntimeException();
	}
}
