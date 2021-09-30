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
package markettrail.setup;

import static markettrail.constants.MarketstrailConstants.PLATFORM_LOGO_CODE;

import de.hybris.platform.core.initialization.SystemSetup;

import java.io.InputStream;

import markettrail.constants.MarketstrailConstants;
import markettrail.service.MarketstrailService;


@SystemSetup(extension = MarketstrailConstants.EXTENSIONNAME)
public class MarketstrailSystemSetup
{
	private final MarketstrailService marketstrailService;

	public MarketstrailSystemSetup(final MarketstrailService marketstrailService)
	{
		this.marketstrailService = marketstrailService;
	}

	@SystemSetup(process = SystemSetup.Process.INIT, type = SystemSetup.Type.ESSENTIAL)
	public void createEssentialData()
	{
		marketstrailService.createLogo(PLATFORM_LOGO_CODE);
	}

	private InputStream getImageStream()
	{
		return MarketstrailSystemSetup.class.getResourceAsStream("/marketstrail/sap-hybris-platform.png");
	}
}
