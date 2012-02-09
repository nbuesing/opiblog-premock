package com.objectpartners.buesing.test;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;

import com.objectpartners.buesing.premock.PreMock;
import com.objectpartners.buesing.premock.PreMockJUnit4ClassRunner;

@PreMock({HardToMock.class, EasyToMock.class})
@RunWith(PreMockJUnit4ClassRunner.class)
//@RunWith(MockitoJUnitRunner.class)
public class ExampleTest {

	@Mock
	HardToMock hardToMock;
	
	@Mock
	EasyToMock easyToMock;
	
	@Test
	public void testIt() {
		Mockito.when(hardToMock.finalMethod()).thenReturn("mock result from final method");
		Mockito.when(hardToMock.nativeMethod()).thenReturn("mock result from native method");
		Mockito.when(easyToMock.method()).thenReturn("PreMock does not get in the way");

		Assert.assertEquals("mock result from final method", hardToMock.finalMethod());
		Assert.assertEquals("mock result from native method", hardToMock.nativeMethod());
		Assert.assertEquals("PreMock does not get in the way", easyToMock.method());
	}
}
