package net.mcreator.ae2generators.procedures;

import net.minecraftforge.common.capabilities.ForgeCapabilities;

import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.ae2generators.Ae2GeneratorsMod;

import java.util.concurrent.atomic.AtomicBoolean;

public class LightningGeneratorNeighbourBlockChangesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double outputs = 0;
		double power = 0;
		if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.LIGHTNING_ROD && (world instanceof Level _lvl_getRedPow ? _lvl_getRedPow.getSignal(BlockPos.containing(x, y, z), Direction.UP) : 0) > 0
				&& ((world.getBlockState(BlockPos.containing(x, y, z))).getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _getip4 ? (world.getBlockState(BlockPos.containing(x, y, z))).getValue(_getip4) : -1) == 0) {
			outputs = 0;
			power = 500000;
			if (new Object() {
				public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					BlockEntity _ent = level.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ENERGY, Direction.UP).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(world, BlockPos.containing(x, y - 1, z))) {
				outputs = outputs + 1;
			}
			if (new Object() {
				public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					BlockEntity _ent = level.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ENERGY, Direction.WEST).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(world, BlockPos.containing(x + 1, y, z))) {
				outputs = outputs + 1;
			}
			if (new Object() {
				public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					BlockEntity _ent = level.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ENERGY, Direction.EAST).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(world, BlockPos.containing(x - 1, y, z))) {
				outputs = outputs + 1;
			}
			if (new Object() {
				public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					BlockEntity _ent = level.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ENERGY, Direction.NORTH).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(world, BlockPos.containing(x, y, z + 1))) {
				outputs = outputs + 1;
			}
			if (new Object() {
				public boolean canReceiveEnergy(LevelAccessor level, BlockPos pos) {
					AtomicBoolean _retval = new AtomicBoolean(false);
					BlockEntity _ent = level.getBlockEntity(pos);
					if (_ent != null)
						_ent.getCapability(ForgeCapabilities.ENERGY, Direction.SOUTH).ifPresent(capability -> _retval.set(capability.canReceive()));
					return _retval.get();
				}
			}.canReceiveEnergy(world, BlockPos.containing(x, y, z - 1))) {
				outputs = outputs + 1;
			}
			power = Math.round(power / outputs);
			{
				BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y - 1, z));
				int _amount = (int) power;
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ENERGY, Direction.UP).ifPresent(capability -> capability.receiveEnergy(_amount, false));
			}
			{
				BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x + 1, y, z));
				int _amount = (int) power;
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ENERGY, Direction.WEST).ifPresent(capability -> capability.receiveEnergy(_amount, false));
			}
			{
				BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x - 1, y, z));
				int _amount = (int) power;
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ENERGY, Direction.EAST).ifPresent(capability -> capability.receiveEnergy(_amount, false));
			}
			{
				BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z + 1));
				int _amount = (int) power;
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ENERGY, Direction.NORTH).ifPresent(capability -> capability.receiveEnergy(_amount, false));
			}
			{
				BlockEntity _ent = world.getBlockEntity(BlockPos.containing(x, y, z - 1));
				int _amount = (int) power;
				if (_ent != null)
					_ent.getCapability(ForgeCapabilities.ENERGY, Direction.SOUTH).ifPresent(capability -> capability.receiveEnergy(_amount, false));
			}
			{
				int _value = 3;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
			Ae2GeneratorsMod.queueServerWork(100, () -> {
				{
					int _value = 2;
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
			});
			Ae2GeneratorsMod.queueServerWork(200, () -> {
				{
					int _value = 1;
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
			});
			Ae2GeneratorsMod.queueServerWork(300, () -> {
				{
					int _value = 0;
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("blockstate") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
			});
		}
	}
}
