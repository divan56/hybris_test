/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 03.10.2021 17:53:02                         ---
 * ----------------------------------------------------------------
 */
package myownapp.jalo;

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
import myownapp.constants.MyownappConstants;
import myownapp.jalo.Overlord;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Planet}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedPlanet extends GenericItem
{
	/** Qualifier of the <code>Planet.id</code> attribute **/
	public static final String ID = "id";
	/** Qualifier of the <code>Planet.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>Planet.age</code> attribute **/
	public static final String AGE = "age";
	/** Qualifier of the <code>Planet.planetType</code> attribute **/
	public static final String PLANETTYPE = "planetType";
	/** Qualifier of the <code>Planet.overlord</code> attribute **/
	public static final String OVERLORD = "overlord";
	/**
	* {@link BidirectionalOneToManyHandler} for handling 1:n OVERLORD's relation attributes from 'one' side.
	**/
	protected static final BidirectionalOneToManyHandler<GeneratedPlanet> OVERLORDHANDLER = new BidirectionalOneToManyHandler<GeneratedPlanet>(
	MyownappConstants.TC.PLANET,
	false,
	"overlord",
	null,
	false,
	true,
	CollectionType.SET
	);
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(ID, AttributeMode.INITIAL);
		tmp.put(NAME, AttributeMode.INITIAL);
		tmp.put(AGE, AttributeMode.INITIAL);
		tmp.put(PLANETTYPE, AttributeMode.INITIAL);
		tmp.put(OVERLORD, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Planet.age</code> attribute.
	 * @return the age
	 */
	public Long getAge(final SessionContext ctx)
	{
		return (Long)getProperty( ctx, AGE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Planet.age</code> attribute.
	 * @return the age
	 */
	public Long getAge()
	{
		return getAge( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Planet.age</code> attribute. 
	 * @return the age
	 */
	public long getAgeAsPrimitive(final SessionContext ctx)
	{
		Long value = getAge( ctx );
		return value != null ? value.longValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Planet.age</code> attribute. 
	 * @return the age
	 */
	public long getAgeAsPrimitive()
	{
		return getAgeAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Planet.age</code> attribute. 
	 * @param value the age
	 */
	public void setAge(final SessionContext ctx, final Long value)
	{
		setProperty(ctx, AGE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Planet.age</code> attribute. 
	 * @param value the age
	 */
	public void setAge(final Long value)
	{
		setAge( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Planet.age</code> attribute. 
	 * @param value the age
	 */
	public void setAge(final SessionContext ctx, final long value)
	{
		setAge( ctx,Long.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Planet.age</code> attribute. 
	 * @param value the age
	 */
	public void setAge(final long value)
	{
		setAge( getSession().getSessionContext(), value );
	}
	
	@Override
	protected Item createItem(final SessionContext ctx, final ComposedType type, final ItemAttributeMap allAttributes) throws JaloBusinessException
	{
		OVERLORDHANDLER.newInstance(ctx, allAttributes);
		return super.createItem( ctx, type, allAttributes );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Planet.id</code> attribute.
	 * @return the id
	 */
	public String getId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Planet.id</code> attribute.
	 * @return the id
	 */
	public String getId()
	{
		return getId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Planet.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Planet.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final String value)
	{
		setId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Planet.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Planet.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Planet.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Planet.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Planet.overlord</code> attribute.
	 * @return the overlord
	 */
	public Overlord getOverlord(final SessionContext ctx)
	{
		return (Overlord)getProperty( ctx, OVERLORD);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Planet.overlord</code> attribute.
	 * @return the overlord
	 */
	public Overlord getOverlord()
	{
		return getOverlord( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Planet.overlord</code> attribute. 
	 * @param value the overlord
	 */
	public void setOverlord(final SessionContext ctx, final Overlord value)
	{
		OVERLORDHANDLER.addValue( ctx, value, this  );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Planet.overlord</code> attribute. 
	 * @param value the overlord
	 */
	public void setOverlord(final Overlord value)
	{
		setOverlord( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Planet.planetType</code> attribute.
	 * @return the planetType
	 */
	public EnumerationValue getPlanetType(final SessionContext ctx)
	{
		return (EnumerationValue)getProperty( ctx, PLANETTYPE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Planet.planetType</code> attribute.
	 * @return the planetType
	 */
	public EnumerationValue getPlanetType()
	{
		return getPlanetType( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Planet.planetType</code> attribute. 
	 * @param value the planetType
	 */
	public void setPlanetType(final SessionContext ctx, final EnumerationValue value)
	{
		setProperty(ctx, PLANETTYPE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Planet.planetType</code> attribute. 
	 * @param value the planetType
	 */
	public void setPlanetType(final EnumerationValue value)
	{
		setPlanetType( getSession().getSessionContext(), value );
	}
	
}
