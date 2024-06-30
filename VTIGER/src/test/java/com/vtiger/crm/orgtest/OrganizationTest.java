package com.vtiger.crm.orgtest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.crm.BaseClass.BaseClass;
import com.vtiger.crm.generic.webdriverutility.UtilityClassobject;
import com.vtiger.crm.objectrepositoryutility.CreateNewOrganizationPage;
import com.vtiger.crm.objectrepositoryutility.HomePage;
import com.vtiger.crm.objectrepositoryutility.OrganizationInformationPage;
import com.vtiger.crm.objectrepositoryutility.OrganizationsPage;

@Listeners(com.vtiger.crm.ListnerUtility.ListnerImplementation.class)
public class OrganizationTest extends BaseClass {
	@Test(groups = {"smokeTest"})
	public void createOrgWithMandField() throws EncryptedDocumentException, IOException
	{
		UtilityClassobject.getTest().log(Status.INFO, "Read data from Excel");
		
		/*get test data from excel*/
		String orgName = eLib.getDataFromExcelFile("Org", 1, 2)+ jLib.getRandomNumber();

		/*Navigate to Organization Module*/
		HomePage hp=new HomePage(driver);
		UtilityClassobject.getTest().log(Status.INFO, "Navigate to Organization List page");
		hp.getOrganizationLink().click();
		
	}	

}
