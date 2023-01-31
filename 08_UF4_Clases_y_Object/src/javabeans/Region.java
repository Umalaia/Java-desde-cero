package javabeans;

import java.util.Objects;

public class Region {
   private int regionId;
   private String regionName;
   
public Region() {
	super();
}

   
public Region(int regionId, String regionName) {
	super();
	this.regionId = regionId;
	this.regionName = regionName;
}




public int getRegionId() {
	return regionId;
}


public void setRegionId(int regionId) {
	this.regionId = regionId;
}


public String getRegionName() {
	return regionName;
}


public void setRegionName(String regionName) {
	this.regionName = regionName;
}





@Override
public String toString() {
	return "Region [regionId=" + regionId + ", regionName=" + regionName + "]";
}


@Override
public int hashCode() {
	return Objects.hash(regionId, regionName);
}


@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Region other = (Region) obj;
	return regionId == other.regionId && Objects.equals(regionName, other.regionName);
}
   

/*
 * creamos el metodo equals para que nos coja el nuestro y no el heredado de object
@Override
public boolean equals(Object obj) {
	if (obj == null)
		return false;
	if (obj == this)
		return true;
	if (!(obj instanceof Region))
		return false;
	
 */

	
	
	

}



