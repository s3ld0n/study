package innerclasses;

interface Monster
{
	void menace();
}


interface DangerousMonster extends Monster {
  void destroy();
}

class getMonsters
{
	public DangerousMonster getDM()
	{
		return new DangerousMonster()
				{
					public void menace()
					{
						
					}

					public void destroy()
					{
						
					}
				};
	}
	
	public Vampire getVamp()
	{
		return new Vampire()
				{
					public void destroy()
					{
				
					}

					public void menace()
					{
						
					}

					public void kill()
					{
						
					}

					public void drinkBlood()
					{
						
					}
					
				};
	}
}

interface Lethal
{
	void kill();
}

class DragonZilla implements DangerousMonster
{
	public void menace()
	{
	}

	public void destroy()
	{
	}
}

interface Vampire extends DangerousMonster, Lethal
{
	void drinkBlood();
}

class VeryBadVampire implements Vampire
{
	public void menace()
	{
	}

	public void destroy()
	{
	}

	public void kill()
	{
	}

	public void drinkBlood()
	{
	}
}

public class HorrorShow
{
	static void u( Monster b )
	{
		b.menace();
	}

	static void v( DangerousMonster d )
	{
		d.menace();
		d.destroy();
	}

	static void w( Lethal l )
	{
		l.kill();
	}

	public static void main( String[] args )
	{
		DangerousMonster barney = new DragonZilla();
		u( barney );
		v( barney );
		Vampire vlad = new VeryBadVampire();
		u( vlad );
		v( vlad );
		w( vlad );
	}
}