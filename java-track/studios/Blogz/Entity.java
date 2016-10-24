package Blogz;

public abstract class Entity {
	private final int uid;
	private static int count = 1;
	
	public Entity(){
		this.uid = count;
		count++;
	}
	
	public int getUid(){
		return this.uid;
	}
	
	public static int getCount(){
		return count;
	}
}
