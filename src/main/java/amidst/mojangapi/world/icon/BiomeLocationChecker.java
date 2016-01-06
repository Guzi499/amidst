package amidst.mojangapi.world.icon;

import java.util.List;

import amidst.documentation.Immutable;
import amidst.mojangapi.world.biome.Biome;
import amidst.mojangapi.world.oracle.BiomeDataOracle;

@Immutable
public class BiomeLocationChecker implements LocationChecker {
	private final BiomeDataOracle biomeDataOracle;
	private final List<Biome> validBiomes;

	public BiomeLocationChecker(BiomeDataOracle biomeDataOracle,
			List<Biome> validBiomes) {
		this.biomeDataOracle = biomeDataOracle;
		this.validBiomes = validBiomes;
	}

	@Override
	public boolean isValidLocation(int x, int y) {
		return biomeDataOracle.isValidBiomeAtMiddleOfChunk(x, y, validBiomes);
	}
}
