/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 30.09.2021 22:38:40                         ---
 * ----------------------------------------------------------------
 */
package markettrail.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import markettrail.constants.MarketstrailConstants;
import markettrail.jalo.CustomElectronics;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem CustomStore}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedCustomStore extends GenericItem
{
	/** Qualifier of the <code>CustomStore.code</code> attribute **/
	public static final String CODE = "code";
	/** Qualifier of the <code>CustomStore.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>CustomStore.employees</code> attribute **/
	public static final String EMPLOYEES = "employees";
	/** Qualifier of the <code>CustomStore.location</code> attribute **/
	public static final String LOCATION = "location";
	/** Qualifier of the <code>CustomStore.electronics</code> attribute **/
	public static final String ELECTRONICS = "electronics";
	/**
	* {@link OneToManyHandler} for handling 1:n ELECTRONICS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<CustomElectronics> ELECTRONICSHANDLER = new OneToManyHandler<CustomElectronics>(
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
		tmp.put(CODE, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(EMPLOYEES, AttributeMode.INITIAL);
		tmp.put(LOCATION, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomStore.code</code> attribute.
	 * @return the code - Unique identifier for store
	 */
	public String getCode(final SessionContext ctx)
	{
		return (String)getProperty( ctx, CODE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomStore.code</code> attribute.
	 * @return the code - Unique identifier for store
	 */
	public String getCode()
	{
		return getCode( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomStore.code</code> attribute. 
	 * @param value the code - Unique identifier for store
	 */
	public void setCode(final SessionContext ctx, final String value)
	{
		setProperty(ctx, CODE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomStore.code</code> attribute. 
	 * @param value the code - Unique identifier for store
	 */
	public void setCode(final String value)
	{
		setCode( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomStore.electronics</code> attribute.
	 * @return the electronics
	 */
	public Set<CustomElectronics> getElectronics(final SessionContext ctx)
	{
		return (Set<CustomElectronics>)ELECTRONICSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomStore.electronics</code> attribute.
	 * @return the electronics
	 */
	public Set<CustomElectronics> getElectronics()
	{
		return getElectronics( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomStore.electronics</code> attribute. 
	 * @param value the electronics
	 */
	public void setElectronics(final SessionContext ctx, final Set<CustomElectronics> value)
	{
		ELECTRONICSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomStore.electronics</code> attribute. 
	 * @param value the electronics
	 */
	public void setElectronics(final Set<CustomElectronics> value)
	{
		setElectronics( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to electronics. 
	 * @param value the item to add to electronics
	 */
	public void addToElectronics(final SessionContext ctx, final CustomElectronics value)
	{
		ELECTRONICSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to electronics. 
	 * @param value the item to add to electronics
	 */
	public void addToElectronics(final CustomElectronics value)
	{
		addToElectronics( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from electronics. 
	 * @param value the item to remove from electronics
	 */
	public void removeFromElectronics(final SessionContext ctx, final CustomElectronics value)
	{
		ELECTRONICSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from electronics. 
	 * @param value the item to remove from electronics
	 */
	public void removeFromElectronics(final CustomElectronics value)
	{
		removeFromElectronics( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomStore.employees</code> attribute.
	 * @return the employees - Number of store's employees
	 */
	public Integer getEmployees(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, EMPLOYEES);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomStore.employees</code> attribute.
	 * @return the employees - Number of store's employees
	 */
	public Integer getEmployees()
	{
		return getEmployees( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomStore.employees</code> attribute. 
	 * @return the employees - Number of store's employees
	 */
	public int getEmployeesAsPrimitive(final SessionContext ctx)
	{
		Integer value = getEmployees( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomStore.employees</code> attribute. 
	 * @return the employees - Number of store's employees
	 */
	public int getEmployeesAsPrimitive()
	{
		return getEmployeesAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomStore.employees</code> attribute. 
	 * @param value the employees - Number of store's employees
	 */
	public void setEmployees(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, EMPLOYEES,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomStore.employees</code> attribute. 
	 * @param value the employees - Number of store's employees
	 */
	public void setEmployees(final Integer value)
	{
		setEmployees( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomStore.employees</code> attribute. 
	 * @param value the employees - Number of store's employees
	 */
	public void setEmployees(final SessionContext ctx, final int value)
	{
		setEmployees( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomStore.employees</code> attribute. 
	 * @param value the employees - Number of store's employees
	 */
	public void setEmployees(final int value)
	{
		setEmployees( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomStore.location</code> attribute.
	 * @return the location - Store's address
	 */
	public String getLocation(final SessionContext ctx)
	{
		return (String)getProperty( ctx, LOCATION);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomStore.location</code> attribute.
	 * @return the location - Store's address
	 */
	public String getLocation()
	{
		return getLocation( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomStore.location</code> attribute. 
	 * @param value the location - Store's address
	 */
	public void setLocation(final SessionContext ctx, final String value)
	{
		setProperty(ctx, LOCATION,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomStore.location</code> attribute. 
	 * @param value the location - Store's address
	 */
	public void setLocation(final String value)
	{
		setLocation( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomStore.name</code> attribute.
	 * @return the name - Store's name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>CustomStore.name</code> attribute.
	 * @return the name - Store's name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomStore.name</code> attribute. 
	 * @param value the name - Store's name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>CustomStore.name</code> attribute. 
	 * @param value the name - Store's name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
}
