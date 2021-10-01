/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 01.10.2021 19:52:07                         ---
 * ----------------------------------------------------------------
 */
package marketstrail.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import markettrail.constants.MarketstrailConstants;
import markettrail.jalo.Electronic;
import markettrail.jalo.Store;

/**
 * Generated class for type <code>MarketstrailManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedMarketstrailManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("store", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.product.Product", Collections.unmodifiableMap(tmp));
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	public Electronic createElectronic(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MarketstrailConstants.TC.ELECTRONIC );
			return (Electronic)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Electronic : "+e.getMessage(), 0 );
		}
	}
	
	public Electronic createElectronic(final Map attributeValues)
	{
		return createElectronic( getSession().getSessionContext(), attributeValues );
	}
	
	public Store createStore(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( MarketstrailConstants.TC.STORE );
			return (Store)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Store : "+e.getMessage(), 0 );
		}
	}
	
	public Store createStore(final Map attributeValues)
	{
		return createStore( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return MarketstrailConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.store</code> attribute.
	 * @return the store
	 */
	public Store getStore(final SessionContext ctx, final Product item)
	{
		return (Store)item.getProperty( ctx, MarketstrailConstants.Attributes.Product.STORE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.store</code> attribute.
	 * @return the store
	 */
	public Store getStore(final Product item)
	{
		return getStore( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.store</code> attribute. 
	 * @param value the store
	 */
	public void setStore(final SessionContext ctx, final Product item, final Store value)
	{
		item.setProperty(ctx, MarketstrailConstants.Attributes.Product.STORE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.store</code> attribute. 
	 * @param value the store
	 */
	public void setStore(final Product item, final Store value)
	{
		setStore( getSession().getSessionContext(), item, value );
	}
	
}
