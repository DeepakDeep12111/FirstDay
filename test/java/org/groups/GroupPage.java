package org.groups;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupPage {
	
	@Test(groups="smoke")
	private void tc0() {
		Assert.assertTrue(false);
		System.out.println("Mthod1");
		
		}
	@Test(groups="smoke")
	private void tc1() {
		System.out.println("Mthod1");
		
		}
	
	@Test(groups="regression",dependsOnGroups="smoke",alwaysRun=true)
	private void tc2() {
		System.out.println("Method2");
	}

	@Test(groups="regression")
	private void tc3() {
		System.out.println("Method3");
	}
	@Test(groups= "sanity")
	private void tc4() {
		System.out.println("Method4");
	}
	
	@Test
	private void tc5() {
		System.out.println("Method5");
	}
	
}
