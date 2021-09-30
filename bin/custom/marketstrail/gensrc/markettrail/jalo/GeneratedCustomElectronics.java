/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 30.09.2021 17:41:17                         ---
 * ----------------------------------------------------------------
 */
package markettrail.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.enumeration.EnumerationValue;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.util.BidirectionalOneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import markettrail.constants.MarketstrailConstants;
import markettrail.jalo.CustomStore;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem CustomElectronics}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCustomElectronics extends GenericItem
{
	/** Qualifier of the <code>CustomElectronics.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>CustomElectronics.price</code> attribute **/
	public static final String PRICE = "price";
	/** Qualifier of the <code>CustomElectronics.productCategory</code> attribute **/
	public static final String PRODUCTCATEGORY = "productCategory";
	/** Qualifier of the <code>CustomElectronics.store</code> attribute **/
	public static final String STORE = "store";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n STORE's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedCustomElectronics> STOREHANDLER = new BidirectionalOneToManyHandler<GeneratedCustomElectronics>(
	MarketstrailConstants.TC.CUSTOMELECTRONICS,
	false,
	"store",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(PRICE, AttributeMode.INITIAL);
		tmp.put(PRODUCTCATEGORY, AttributeMode.INITIAL);
		tmp.put(STORE, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		STOREHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomElectronics.name</code> attribute.
	 * @return the name - Product's name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomElectronics.name</code> attribute.
	 * @return the name - Product's name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomElectronics.name</code> attribute. 
	 * @param value the name - Product's name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomElectronics.name</code> attribute. 
	 * @param value the name - Product's name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomElectronics.price</code> attribute.
	 * @return the price - product's price
	 */
	public Integer getPrice(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, PRICE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomElectronics.price</code> attribute.
	 * @return the price - product's price
	 */
	public Integer getPrice()
	{
		return getPrice( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomElectronics.price</code> attribute. 
	 * @return the price - product's price
	 */
	public int getPriceAsPrimitive(final SessionContext ctx)
	{
		Integer value = getPrice( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomElectronics.price</code> attribute. 
	 * @return the price - product's price
	 */
	public int getPriceAsPrimitive()
	{
		return getPriceAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomElectronics.price</code> attribute. 
	 * @param value the price - product's price
	 */
	public void setPrice(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, PRICE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomElectronics.price</code> attribute. 
	 * @param value the price - product's price
	 */
	public void setPrice(final Integer value)
	{
		setPrice( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomElectronics.price</code> attribute. 
	 * @param value the price - product's price
	 */
	public void setPrice(final SessionContext ctx, final int value)
	{
		setPrice( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomElectronics.price</code> attribute. 
	 * @param value the price - product's price
	 */
	public void setPrice(final int value)
	{
		setPrice( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomElectronics.productCategory</code> attribute.
	 * @return the productCategory - Product's categories
	 */
	public EnumerationValue getProductCategory(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, PRODUCTCATEGORY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomElectronics.productCategory</code> attribute.
	 * @return the productCategory - Product's categories
	 */
	public EnumerationValue getProductCategory()
	{
		return getProductCategory( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomElectronics.productCategory</code> attribute. 
	 * @param value the productCategory - Product's categories
	 */
	public void setProductCategory(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, PRODUCTCATEGORY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomElectronics.productCategory</code> attribute. 
	 * @param value the productCategory - Product's categories
	 */
	public void setProductCategory(final EnumerationValue value)
	{
		setProductCategory( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomElectronics.store</code> attribute.
	 * @return the store
	 */
	public CustomStore getStore(final SessionContext ctx)
	{
		return (CustomStore)getProperty( ctx, STORE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomElectronics.store</code> attribute.
	 * @return the store
	 */
	public CustomStore getStore()
	{
		return getStore( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomElectronics.store</code> attribute. 
	 * @param value the store
	 */
	public void setStore(final SessionContext ctx, final CustomStore value)
	{
		STOREHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomElectronics.store</code> attribute. 
	 * @param value the store
	 */
	public void setStore(final CustomStore value)
	{
		setStore( getSession().getSessionContext(), value );
	}
	
}
