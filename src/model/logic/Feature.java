package model.logic;

public class Feature implements Comparable<Feature> {
private Properties properties;
private Geometry geometry;
	public Feature (Properties pProperties, Geometry pGeometry)
	{
		properties = pProperties;
		geometry = pGeometry;
	}
	public Properties darProperties()
	{
		return properties;
	}
	public Geometry darGeometry()
	{
		return geometry;
	}
	public int compareTo(Feature pFeature)
	{
	if(this.geometry.darCoordinates().length > pFeature.darGeometry().darCoordinates().length)
	{
		return 1;
	}
	if(this.geometry.darCoordinates().length < pFeature.darGeometry().darCoordinates().length)
	{
		return -1;
	}
	return 0;
	}

}
