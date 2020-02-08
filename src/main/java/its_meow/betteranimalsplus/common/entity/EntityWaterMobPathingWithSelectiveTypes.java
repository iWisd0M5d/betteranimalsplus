package its_meow.betteranimalsplus.common.entity;

import java.util.Set;

import its_meow.betteranimalsplus.config.BetterAnimalsPlusConfig;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ILivingEntityData;
import net.minecraft.entity.SpawnReason;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraftforge.common.BiomeDictionary;

public abstract class EntityWaterMobPathingWithSelectiveTypes extends EntityWaterMobPathingWithTypes {

    public EntityWaterMobPathingWithSelectiveTypes(EntityType<? extends EntityWaterMobPathingWithSelectiveTypes> type, World world) {
        super(type, world);
    }

    @Override
    public ILivingEntityData onInitialSpawn(IWorld world, DifficultyInstance difficulty, SpawnReason reason, ILivingEntityData livingdata, CompoundNBT compound) {
        int validTypes[] = this.getTypesFor(BiomeDictionary.getTypes(world.getBiome(this.getPosition())));
        return BetterAnimalsPlusConfig.biomeBasedVariants && (reason == SpawnReason.CHUNK_GENERATION || reason == SpawnReason.NATURAL) ? this.initData(super.onInitialSpawn(world, difficulty, reason, livingdata, compound), validTypes[this.getRNG().nextInt(validTypes.length)]) : this.initData(super.onInitialSpawn(world, difficulty, reason, livingdata, compound));
    }

    protected abstract int[] getTypesFor(Set<BiomeDictionary.Type> biome);

}