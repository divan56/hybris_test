/*
 * [y] hybris Platform
 *
 * Copyright (c) 2017 SAP SE or an SAP affiliate company.  All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * ("Confidential Information"). You shall not disclose such Confidential
 * Information and shall use it only in accordance with the terms of the
 * license agreement you entered into with SAP.
 */
package myownapp.setup;

import static myownapp.constants.MyownappConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import myownapp.constants.MyownappConstants;
import myownapp.service.MyownappService;


@SystemSetup(extension = MyownappConstants.EXTENSIONNAME)
public class MyownappSystemSetup
{
	private final MyownappService myownappService;

	public MyownappSystemSetup(final MyownappService myownappService)
	{
		this.myownappService = myownappService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		myownappService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return MyownappSystemSetup.class.getResourceAsStream("/myownapp/sap-hybris-platform.png");
	}
}
