/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 03.10.2021 17:53:02                         ---
 * ----------------------------------------------------------------
 */
package myownapp.jalo;

import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.type.CollectionType;
import de.hybris.platform.util.OneToManyHandler;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import myownapp.constants.MyownappConstants;
import myownapp.jalo.Planet;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Overlord}.
 */
@SuppressWarnings({"deprecation","unused","cast","PMD"})
public abstract class GeneratedOverlord extends GenericItem
{
	/** Qualifier of the <code>Overlord.id</code> attribute **/
	public static final String ID = "id";
	/** Qualifier of the <code>Overlord.name</code> attribute **/
	public static final String NAME = "name";
	/** Qualifier of the <code>Overlord.power</code> attribute **/
	public static final String POWER = "power";
	/** Qualifier of the <code>Overlord.yearOfBirth</code> attribute **/
	public static final String YEAROFBIRTH = "yearOfBirth";
	/** Qualifier of the <code>Overlord.planets</code> attribute **/
	public static final String PLANETS = "planets";
	/**
	* {@link OneToManyHandler} for handling 1:n PLANETS's relation attributes from 'many' side.
	**/
	protected static final OneToManyHandler<Planet> PLANETSHANDLER = new OneToManyHandler<Planet>(
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
		tmp.put(POWER, AttributeMode.INITIAL);
		tmp.put(YEAROFBIRTH, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Overlord.id</code> attribute.
	 * @return the id
	 */
	public String getId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Overlord.id</code> attribute.
	 * @return the id
	 */
	public String getId()
	{
		return getId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Overlord.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Overlord.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final String value)
	{
		setId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Overlord.name</code> attribute.
	 * @return the name
	 */
	public String getName(final SessionContext ctx)
	{
		return (String)getProperty( ctx, NAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Overlord.name</code> attribute.
	 * @return the name
	 */
	public String getName()
	{
		return getName( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Overlord.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final SessionContext ctx, final String value)
	{
		setProperty(ctx, NAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Overlord.name</code> attribute. 
	 * @param value the name
	 */
	public void setName(final String value)
	{
		setName( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Overlord.planets</code> attribute.
	 * @return the planets
	 */
	public Set<Planet> getPlanets(final SessionContext ctx)
	{
		return (Set<Planet>)PLANETSHANDLER.getValues( ctx, this );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Overlord.planets</code> attribute.
	 * @return the planets
	 */
	public Set<Planet> getPlanets()
	{
		return getPlanets( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Overlord.planets</code> attribute. 
	 * @param value the planets
	 */
	public void setPlanets(final SessionContext ctx, final Set<Planet> value)
	{
		PLANETSHANDLER.setValues( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Overlord.planets</code> attribute. 
	 * @param value the planets
	 */
	public void setPlanets(final Set<Planet> value)
	{
		setPlanets( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to planets. 
	 * @param value the item to add to planets
	 */
	public void addToPlanets(final SessionContext ctx, final Planet value)
	{
		PLANETSHANDLER.addValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Adds <code>value</code> to planets. 
	 * @param value the item to add to planets
	 */
	public void addToPlanets(final Planet value)
	{
		addToPlanets( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from planets. 
	 * @param value the item to remove from planets
	 */
	public void removeFromPlanets(final SessionContext ctx, final Planet value)
	{
		PLANETSHANDLER.removeValue( ctx, this, value );
	}
	
	/**
	 * <i>Generated method</i> - Removes <code>value</code> from planets. 
	 * @param value the item to remove from planets
	 */
	public void removeFromPlanets(final Planet value)
	{
		removeFromPlanets( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Overlord.power</code> attribute.
	 * @return the power
	 */
	public Integer getPower(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, POWER);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Overlord.power</code> attribute.
	 * @return the power
	 */
	public Integer getPower()
	{
		return getPower( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Overlord.power</code> attribute. 
	 * @return the power
	 */
	public int getPowerAsPrimitive(final SessionContext ctx)
	{
		Integer value = getPower( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Overlord.power</code> attribute. 
	 * @return the power
	 */
	public int getPowerAsPrimitive()
	{
		return getPowerAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Overlord.power</code> attribute. 
	 * @param value the power
	 */
	public void setPower(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, POWER,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Overlord.power</code> attribute. 
	 * @param value the power
	 */
	public void setPower(final Integer value)
	{
		setPower( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Overlord.power</code> attribute. 
	 * @param value the power
	 */
	public void setPower(final SessionContext ctx, final int value)
	{
		setPower( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Overlord.power</code> attribute. 
	 * @param value the power
	 */
	public void setPower(final int value)
	{
		setPower( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Overlord.yearOfBirth</code> attribute.
	 * @return the yearOfBirth
	 */
	public Integer getYearOfBirth(final SessionContext ctx)
	{
		return (Integer)getProperty( ctx, YEAROFBIRTH);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Overlord.yearOfBirth</code> attribute.
	 * @return the yearOfBirth
	 */
	public Integer getYearOfBirth()
	{
		return getYearOfBirth( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Overlord.yearOfBirth</code> attribute. 
	 * @return the yearOfBirth
	 */
	public int getYearOfBirthAsPrimitive(final SessionContext ctx)
	{
		Integer value = getYearOfBirth( ctx );
		return value != null ? value.intValue() : 0;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Overlord.yearOfBirth</code> attribute. 
	 * @return the yearOfBirth
	 */
	public int getYearOfBirthAsPrimitive()
	{
		return getYearOfBirthAsPrimitive( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Overlord.yearOfBirth</code> attribute. 
	 * @param value the yearOfBirth
	 */
	public void setYearOfBirth(final SessionContext ctx, final Integer value)
	{
		setProperty(ctx, YEAROFBIRTH,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Overlord.yearOfBirth</code> attribute. 
	 * @param value the yearOfBirth
	 */
	public void setYearOfBirth(final Integer value)
	{
		setYearOfBirth( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Overlord.yearOfBirth</code> attribute. 
	 * @param value the yearOfBirth
	 */
	public void setYearOfBirth(final SessionContext ctx, final int value)
	{
		setYearOfBirth( ctx,Integer.valueOf( value ) );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Overlord.yearOfBirth</code> attribute. 
	 * @param value the yearOfBirth
	 */
	public void setYearOfBirth(final int value)
	{
		setYearOfBirth( getSession().getSessionContext(), value );
	}
	
}
