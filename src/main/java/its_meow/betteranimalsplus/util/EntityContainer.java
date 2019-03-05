package its_meow.betteranimalsplus.util;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;

public class EntityContainer {

	public Class<? extends Entity> entityClazz;
	public Function<? super World, ? extends Entity> entityFunction;
	public String entityName;
	public EnumCreatureType type;
	public int eggColorSolid;
	public int eggColorSpot;
	public int weight;
	public int minGroup;
	public int maxGroup;
	public Biome[] spawnBiomes = {};
	public boolean doSpawning = true;

	@SafeVarargs
	public EntityContainer(Class<? extends Entity> EntityClass, Function<? super World, ? extends Entity> func,
			String entityNameIn, EnumCreatureType type, int solidColorIn, int spotColorIn, int prob, int min, int max,
			Set<Biome>... biomes) {
		this.entityClazz = EntityClass;
		this.entityFunction = func;
		this.entityName = entityNameIn;
		this.eggColorSolid = solidColorIn;
		this.eggColorSpot = spotColorIn;
		this.weight = prob;
		this.minGroup = min;
		this.maxGroup = max;
		this.type = type;


		// Convert biomes to single array

		Set<Biome> biomesetAdd = new HashSet<>();
		for(Set<Biome> biomeset : biomes) {
			biomesetAdd.addAll(biomeset);
		}
		try {
			this.spawnBiomes = biomesetAdd.toArray(this.spawnBiomes);
		} catch(NullPointerException e) {
			this.spawnBiomes = new Biome[0];
		}
	}

}