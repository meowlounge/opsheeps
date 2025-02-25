package com.chilllounge.opsheeps.datagen.lang;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class EnTranslationGen extends FabricLanguageProvider {
	public EnTranslationGen(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
		super(dataOutput, "en_us", registryLookup);
	}

	@Override
	public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {
		translationBuilder.add("item.opsheeps.super_dye", "Super Dye");

		translationBuilder.add("item.opsheeps.super_shear_v1", "Titan Shear 1.0");
		translationBuilder.add("item.opsheeps.super_shear_v2", "Titan Shear 2.0");
		translationBuilder.add("item.opsheeps.super_shear_v3", "Titan Shear 3.0");
		translationBuilder.add("item.opsheeps.super_shear_v4", "Titan Shear 4.0");
		translationBuilder.add("item.opsheeps.super_shear_v5", "Titan Shear 5.0");
		translationBuilder.add("item.opsheeps.super_shear_v69", "Titan Shear");

		translationBuilder.add("item.opsheeps.op_helmet", "OP Helmet");
		translationBuilder.add("item.opsheeps.op_chestplate", "OP Chestplate");
		translationBuilder.add("item.opsheeps.op_leggings", "OP Leggings");
		translationBuilder.add("item.opsheeps.op_boots", "OP Boots");
		translationBuilder.add("item.opsheeps.op_sword", "OP Sword");
		translationBuilder.add("item.opsheeps.op_pickaxe", "OP Pickaxe");
		translationBuilder.add("item.opsheeps.op_axe", "OP Axe");
		translationBuilder.add("item.opsheeps.op_shovel", "OP Shovel");
		translationBuilder.add("item.opsheeps.op_hoe", "OP Hoe");

		translationBuilder.add("item.opsheeps.grow_back", "Grow Back");

		translationBuilder.add("itemgroups.opsheeps.super_items", "OP Sheeps");

		translationBuilder.add("rarity.opsheeps.common", "COMMON");
		translationBuilder.add("rarity.opsheeps.uncommon", "UNCOMMON");
		translationBuilder.add("rarity.opsheeps.rare", "RARE");
		translationBuilder.add("rarity.opsheeps.epic", "EPIC");
		translationBuilder.add("rarity.opsheeps.legendary", "LEGENDARY");
		translationBuilder.add("rarity.opsheeps.dev", "DEVELOPER");

		translationBuilder.add("item.opsheeps.grow_back_description", "Instantly give the Clicked Sheep its Wool Back.");
		translationBuilder.add("item.opsheeps.shear_drops", "Shearing an OP Sheep drops %s items.");

		translationBuilder.add("enchantment.opsheeps.mineral_extractor", "Mineral Extractor");

		translationBuilder.add("item.opsheeps.super_dye_description", "Whisper its secret to a sheep, and witness the impossible...");

		translationBuilder.add("opsheeps.help.page1", "§lWelcome to OPSheeps!\n\nOPSheeps adds powerful features...");
		translationBuilder.add("opsheeps.help.page2", "§lStep 1: Craft SuperDye\n\nTo create SuperDye...");
		translationBuilder.add("opsheeps.help.page3", "§lStep 2: Transform Sheep\n\nOnce you have your SuperDye...");
		translationBuilder.add("opsheeps.help.page4", "§lStep 3: Use Titan Shears\n\nTitan Shears are your tool...");
		translationBuilder.add("opsheeps.help.page5", "§lEnjoy the game and have fun collecting rare resources...");

		translationBuilder.add("command.opsheeps.help.client", "This command can only be executed by a server player.");
		translationBuilder.add("command.opsheeps.help.book_received", "You have received the OPSheeps help book!");
	}

	@Override
	public String getName() {
		return "EN Translation Generator";
	}
}
