package mho.common;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import mho.block.AnimBlock;
import mho.block.BlockSixFaces;
import mho.block.BookBlock;
import mho.block.CakeLieBlock;
import mho.block.Chain;
import mho.block.Cristal;
import mho.block.DragonPortal;
import mho.block.Enseigne;
import mho.block.GrisouBlock;
import mho.block.InvisibleBlock;
import mho.block.Lampion;
import mho.block.McClassic;
import mho.block.MetaWoolLight;
import mho.block.MhoBatonBot;
import mho.block.MhoBatonTop;
import mho.block.MhoCake;
import mho.block.MhoClassic;
import mho.block.MhoClassicBot;
import mho.block.MhoClassicTop;
import mho.block.MhoDoor;
import mho.block.MhoLadder;
import mho.block.MhoLumiere;
import mho.block.MhoTrap;
import mho.block.Pike;
import mho.block.Rope;
import mho.block.RopeRail;
import mho.block.SlimeBlock;
import mho.block.StairBase;
import mho.block.StairMho;
import mho.block.StepBase;
import mho.block.StepMho;
import mho.block.TapisBase;
import mho.block.TonneauBlock;
import mho.block.Vitraux;
import mho.block.VitrauxPane;
import mho.block.WallsBase;
import mho.block.build.Colombage;
import mho.block.build.Column;
import mho.block.build.ColumnHead;
import mho.block.build.CustomAnvil;
import mho.block.build.CustomBuildAnvil;
import mho.block.build.GrassBuild;
import mho.block.build.MhoBuildFence;
import mho.block.build.MhoDoubleSlab;
import mho.block.build.PaneBuild;
import mho.block.build.WallsBuildMho;
import mho.block.nature.BeigeLines;
import mho.block.nature.GrassBot;
import mho.block.nature.GrassRock;
import mho.block.nature.GrassTop;
import mho.block.nature.MhoFlower;
import mho.block.nature.MhoGrassBlock;
import mho.block.nature.MhoLog;
import mho.block.nature.MhoSugarCane;
import mho.block.nature.MhoVines;
import mho.block.nature.NewRockTopBot;
import mho.coralreef.CoralBlock;
import mho.coralreef.CoralBreath;
import mho.coralreef.CoralDamage;
import mho.coralreef.CoralPlant;
import mho.creativetab.TabMhoBalustrade;
import mho.creativetab.TabMhoBlocks;
import mho.creativetab.TabMhoCoral;
import mho.creativetab.TabMhoEnchant;
import mho.creativetab.TabMhoEnseigne;
import mho.creativetab.TabMhoFence;
import mho.creativetab.TabMhoGrey;
import mho.creativetab.TabMhoInsignes;
import mho.creativetab.TabMhoItems;
import mho.creativetab.TabMhoNature;
import mho.creativetab.TabMhoPotions;
import mho.creativetab.TabMhoQuest;
import mho.creativetab.TabMhoStairs;
import mho.creativetab.TabMhoStep;
import mho.creativetab.TabMhoSurface;
import mho.creativetab.TabMhoWalls;
import mho.item.Beer;
import mho.item.Food;
import mho.item.Insignes;
import mho.item.MhoItemClassic;
import mho.item.MhoItemSword;
import mho.item.PocketCraftingTable;
import mho.item.PoeleSword;
import mho.item.PoudreMagie;
import mho.item.Rhum;
import mho.item.legendary.CacheOeil;
import mho.item.legendary.DiurneLegendaire;
import mho.item.legendary.NocturneLegendaire;
import mho.item.legendary.TeddyBear;
import mho.item.quest.nezarilJar;
import mho.itemblock.ItemVitraux;
import mho.itemblock.ItemVitrauxPane;
import mho.itemblock.ItemWoolLight;
import mho.potion.PotionApnee;
import mho.potion.PotionCecite;
import mho.potion.PotionCelerite;
import mho.potion.PotionConfusion;
import mho.potion.PotionCustomEffect;
import mho.potion.PotionFaim;
import mho.potion.PotionFatigue;
import mho.potion.PotionLavaWalk;
import mho.potion.PotionNoFall;
import mho.potion.PotionResistance;
import mho.potion.PotionSaut;
import mho.potion.PotionWaterWalk;
import mho.potion.PotionWither;
import mho.potion.TestSplash;
import mho.scroll.majorValys;
import mho.scroll.mediumValys;
import mho.scroll.minorValys;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityEggInfo;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.ServerStarting;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "MMHO", name = "MMHO's mod", version = "0.1.0")

@NetworkMod(clientSideRequired=true, serverSideRequired=false)

public class Mho
{	

	/////////////// DECLARATION ////////////////
	/** Tabs **/
	public static CreativeTabs tabMhoBlocks = new TabMhoBlocks(CreativeTabs.getNextID(),"Mho : Blocs");
	public static CreativeTabs tabMhoStairs = new TabMhoStairs(CreativeTabs.getNextID(),"Mho : Escaliers");
	public static CreativeTabs tabMhoWalls = new TabMhoWalls(CreativeTabs.getNextID(),"Mho : Murets");
	public static CreativeTabs tabMhoStep = new TabMhoStep(CreativeTabs.getNextID(),"Mho : Demi-dalles");
	public static CreativeTabs tabMhoSurface = new TabMhoSurface(CreativeTabs.getNextID(), "Mho : Surface");
	public static CreativeTabs tabMhoBalustrade = new TabMhoBalustrade(CreativeTabs.getNextID(), "MHO : Balustrades");
	public static CreativeTabs tabMhoNature = new TabMhoNature(CreativeTabs.getNextID(), "Mho : Nature");
	public static CreativeTabs tabMhoEnseigne = new TabMhoEnseigne(CreativeTabs.getNextID(), "Mho : Enseigne");
	public static CreativeTabs tabMhoItems = new TabMhoItems(CreativeTabs.getNextID(), "Mho : Items");
	public static CreativeTabs tabMhoPotions = new TabMhoPotions(CreativeTabs.getNextID(), "Mho : Potions");
	public static CreativeTabs tabMhoCoral = new TabMhoCoral(CreativeTabs.getNextID(), "Mho : Coraux");
	public static CreativeTabs tabMhoQuest = new TabMhoQuest(CreativeTabs.getNextID(), "MHO : Items de quete");
	public static CreativeTabs tabMhoInsignes = new TabMhoInsignes(CreativeTabs.getNextID(), "MHO : Insignes");
	public static CreativeTabs tabMhoFence = new TabMhoFence(CreativeTabs.getNextID(), "MHO : Barrieres");
	public static CreativeTabs tabMhoEnchant = new TabMhoEnchant(CreativeTabs.getNextID(), "MHO : Enchantement"); 
	public static CreativeTabs tabMhoGrey = new TabMhoGrey(CreativeTabs.getNextID(), "MHO : Item Gris");

	//Items

	/**Ingot**/
	public static Item diamondIngot;

	/**ProjectileMageNoir
   public static Item projectileMN;**/

	/**ProjectileNPC**/
	public static Item projectileNPCBlanc;
	public static Item projectileNPCJaune;
	public static Item projectileNPCVert;
	public static Item projectileNPCViolet;
	public static Item projectileNPCRouge;
	public static Item projectileNPCGris;
	public static Item projectileNPCBleu;

	/**ItemsNPC**/
	public static Item sceptreRouge;
	public static Item sceptreBleu;
	public static Item sceptreVert;
	public static Item marteauBois;
	public static Item marteauPierre;
	public static Item marteauFer;
	public static Item rapier;
	public static Item cartes;
	public static Item lameRunique;

	/**Poupee**/
	public static Item dollBlue;
	public static Item dollBlack;
	public static Item pelucheMisterxfr;
	public static Item pelucheJolirouge;
	public static Item pelucheIplay;
	public static Item pelucheMikefraise;
	public static Item pelucheDeez;
	public static Item pelucheNicodelpra;
	public static Item pelucheDilandaufr;
	public static Item pelucheNissan;
	public static Item pelucheBbphok;
	public static Item pelucheBendito;
	public static Item pelucheSoenguy;
	public static Item pelucheChtimarchos;
	public static Item pelucheXdakota;
	public static Item pelucheLoupfeucg;
	public static Item pelucheTedrak;

	/** Scroll **/
	public static Item minorValysScroll;
	public static Item mediumValysScroll;
	public static Item majorValysScroll;

	/** Quest - Nezaril **/
	public static Item nezarilJar;
	public static Item nezarilJarFull;
	public static Item redDragonEgg;

	/** Quest **/
	public static Item boulon;
	public static Item briqueDeSable;
	public static Item buchette;
	public static Item buchetteSombre;
	public static Item caisse;
	public static Item liquideBleu;
	public static Item liquideCyan;
	public static Item liquideJaune;
	public static Item liquideOrange;
	public static Item liquideRose;
	public static Item liquideRouge;
	public static Item liquideVert;
	public static Item liquideViolet;
	public static Item tuyau;
	public static Item vis;
	public static Item couponTuto;
	public static Item bandage;
	public static Item sceptreOr;
	public static Item epeeBlanche;
	public static Item sucreries;
	public static Item grimoireSeth;
	public static Item totemMage;
	public static Item grimoireTelgarad;
	public static Item grimoireTelsalor;
	public static Item recommandationHakath;
	public static Item recommandationLomakoth;
	public static Item pistolet;
	public static Item jambeBois;
	public static Item medaillon;
	public static Item longuevue;
	public static Item clePrisonValys;
	public static Item boursePetite;
	public static Item bourseMoyenne;
	public static Item bourseGrande;
	public static Item grimoireApprenti;
	public static Item vanish;
	public static Item enveloppe;
	public static Item batonAdaoldan;
	public static Item batonAdaoldanEnchant;
	public static Item fragmentAdaoldan;
	public static Item projectileArcanique;
	public static Item marteauForgeron;
	public static Item lameRuniqueEmeraude;

	/** Item gris **/
	public static Item batWing;
	public static Item boarHorn;
	public static Item bugWing;
	public static Item cricketLeg;
	public static Item bigcatHair;
	public static Item deerWood;
	public static Item duckLeg;
	public static Item ectoplasm;
	public static Item elephantSkin;
	public static Item enderJaw;
	public static Item enderParticles;
	public static Item foxTail;
	public static Item ghastTentacle;
	public static Item goatHorn;
	public static Item honeyPot;
	public static Item horseHair;
	public static Item jellyJam;
	public static Item mouseMustache;
	public static Item ostrichFeather;
	public static Item pigLeg;
	public static Item rabbitFoot;
	public static Item redFabric;
	public static Item reptileTooth;
	public static Item scorpionSting;
	public static Item sharkFin;
	public static Item skinCreeper;
	public static Item smallFlame;
	public static Item snailShell;
	public static Item snakeTongue;
	public static Item spiderLegs;
	public static Item spiderVenom;
	public static Item turtleShell;
	public static Item whiteCloth;

	/**Key**/
	public static Item goldKey;
	public static Item silverKey;
	public static Item bronzeKey;
	public static Item goldSmallKey;
	public static Item silverSmallKey;
	public static Item bronzeSmallKey;

	/**Coins**/
	public static Item bronzeCoin;
	public static Item silverCoin;
	public static Item goldCoin;
	public static Item diamondCoin;

	/**Trophee**/
	public static Item trophyGold;
	public static Item trophySilver;
	public static Item trophyBronze;
	public static Item trophyGoldChip;

	/**CacheOeil**/
	static EnumArmorMaterial armureCacheOeil = EnumHelper.addArmorMaterial("armureCacheOeil", 0, new int[]{0, 0, 0, 0}, 0);
	public static Item cacheOeil;

	/**Food**/
	public static Item hamburgerFood;
	public static Item fritesFood;
	public static Item kfcFood;
	public static Item oeufFood;
	public static Item baconFood;
	public static Item fromageFood;
	public static Item makiFood;
	public static Item sushiFood;
	public static Item brochetteFood;
	public static Item rhum;

	/** Enchant **/
	public static Item enchantSharpnessT1Small;
	public static Item enchantSharpnessT1Medium;
	public static Item enchantSharpnessT1Big;
	public static Item enchantSharpnessT2Small;
	public static Item enchantSharpnessT2Medium;
	public static Item enchantSharpnessT2Big;
	public static Item enchantSharpnessT3Small;
	public static Item enchantSharpnessT3Medium;
	public static Item enchantSharpnessT3Big;

	public static Item enchantSmiteT1Small;
	public static Item enchantSmiteT1Medium;
	public static Item enchantSmiteT1Big;
	public static Item enchantSmiteT2Small;
	public static Item enchantSmiteT2Medium;
	public static Item enchantSmiteT2Big;
	public static Item enchantSmiteT3Small;
	public static Item enchantSmiteT3Medium;
	public static Item enchantSmiteT3Big;

	public static Item enchantProtectionT1Small;
	public static Item enchantProtectionT1Big;
	public static Item enchantProtectionT2Small;
	public static Item enchantProtectionT2Big;
	public static Item enchantProtectionT3Small;
	public static Item enchantProtectionT3Big;

	public static Item enchantBaneofT1Small;
	public static Item enchantBaneofT1Medium;
	public static Item enchantBaneofT1Big;
	public static Item enchantBaneofT2Small;
	public static Item enchantBaneofT2Medium;
	public static Item enchantBaneofT2Big;
	public static Item enchantBaneofT3Small;
	public static Item enchantBaneofT3Medium;
	public static Item enchantBaneofT3Big;

	public static Item enchantEfficacityT1Small;
	public static Item enchantEfficacityT1Medium;
	public static Item enchantEfficacityT1Big;
	public static Item enchantEfficacityT2Small;
	public static Item enchantEfficacityT2Medium;
	public static Item enchantEfficacityT2Big;
	public static Item enchantEfficacityT3Small;
	public static Item enchantEfficacityT3Medium;
	public static Item enchantEfficacityT3Big;

	public static Item enchantDurabilityT1Small;
	public static Item enchantDurabilityT1Medium;
	public static Item enchantDurabilityT1Big;
	public static Item enchantDurabilityT2Small;
	public static Item enchantDurabilityT2Medium;
	public static Item enchantDurabilityT2Big;
	public static Item enchantDurabilityT3Small;
	public static Item enchantDurabilityT3Medium;
	public static Item enchantDurabilityT3Big;

	public static Item enchantFlameT1Small;
	public static Item enchantFlameT1Big;
	public static Item enchantFlameT2Small;
	public static Item enchantFlameT2Big;
	public static Item enchantFlameT3Small;
	public static Item enchantFlameT3Big;

	public static Item enchantKnockbackT1Small;
	public static Item enchantKnockbackT1Big;
	public static Item enchantKnockbackT2Small;
	public static Item enchantKnockbackT2Big;
	public static Item enchantKnockbackT3Small;
	public static Item enchantKnockbackT3Big;

	/**Sword**/
	public static Item poeleSword;
	static EnumToolMaterial poeleTool = EnumHelper.addToolMaterial("poeleTool", 1, 250, 5.0F, 2, 0);
	static EnumToolMaterial nodmgTool = EnumHelper.addToolMaterial("nodmgTool", 0, 9, 0.0F, 0, 0);

	/**Chope Beer**/
	public static Item chope;
	public static Item beer;

	/**Plantes**/
	public static Item seedHoublon;
	public static Block cropHoublon;
	public static Item houblon;

	/** Mysterious **/
	public static Block flowerMysterious;
	public static Block plantMysterious;
	public static Block coralMysterious;
	public static Block algueMysterious;
	public static Block grassMysterious;
	public static Block grass2Mysterious;
	public static Block leavesMysterious;
	public static Block leaves2Mysterious;
	public static Block stoneMysterious;
	public static Block dirtMysterious;
	public static Block grassBlockMysterious;
	public static Block sugarcaneMysterious;
	public static Block logMysterious;

	/**Rotationnator**/
	public static Item rotator;

	/**Table craft portable**/
	public static Item pocketCraftingTable;

	/**Aquaculture**/
	public static Item cannePeche;

	/**Loots**/
	public static Item coeurLoot;
	public static Item cerveauLoot;
	public static Item brasLoot;
	public static Item poudreMagie;

	/**Insignes**/
	public static Item valysInsignes;
	public static Item chasseInsignes;
	public static Item guerreInsignes;
	public static Item agricultureInsignes;
	public static Item gastronomieInsignes;
	public static Item minageInsignes;
	public static Item artisanatInsignes;
	public static Item villeInsignes;
	public static Item pecheInsignes;
	public static Item explorationInsignes;
	public static Item constructionInsignes;
	public static Item guildeInsignes;
	public static Item victoireInsignes;
	public static Item participationInsignes;
	public static Item magieInsignes;

	/**Lumiere**/
	public static Block lumiereBougie;
	public static Block lumiereLanterne;
	public static Block lumiereSkull;
	public static Block lumiereSkullSimple;

	/**Legendaire**/
	public static Item nocturneLegendaire;
	public static Item diurneLegendaire;
	static EnumToolMaterial diurneLegendaireTool = EnumHelper.addToolMaterial("diurneLegendaireTool", 0, 9, 0.0F, 0, 0);
	static EnumToolMaterial nocturneLegendaireTool = EnumHelper.addToolMaterial("nocturneLegendaireTool", 0, 9, 0.0F, 0, 0);
	public static Item teddyBear;

	/**Blocks**/
	public static Block leatherBlock;
	public static Block lavaBlock;
	public static Block waterBlock;
	public static Block tonneauBlock;
	public static Block caisseVaillant;
	public static Block escaladeBlock;
	public static Block slimeBlock;
	public static Block roseBlock;
	public static Block cakeLieBlock;
	public static Block meatCakeBlock;
	public static Block simpleDirtBlock;
	public static Block grisouBlock;
	public static Block fossileBlock;
	public static Block caisseBlock;
	public static Block bucheFonceCompleteBlock;
	public static Block bucheCompleteBlock;
	public static Block caisseBlockBot;
	public static Block caisseBlockTop;
	public static Block batonTorcheBot;
	public static Block batonTorcheTop;
	public static Block batonBougieBot;
	public static Block batonBougieTop;
	public static Block batonLanterneBot;
	public static Block batonLanterneTop;

	/** Dark materials **/
	public static Block darkStone;
	public static Block darkCobblestone;
	public static Block darkLog;
	public static Block darkLeaves;
	public static Block darkDirt;
	public static Block darkGrass;

	public static Block ropeRail;

	/**Basalt**/
	public static Block basalt;
	public static Block basaltCobblestone;
	public static Block basaltBrick;

	/**Potions**/
	public static Item celeritePotion;
	public static Item fatiguePotion;
	public static Item sautPotion;
	public static Item confusionPotion;
	public static Item resistancePotion;
	public static Item apneePotion;
	public static Item cecitePotion;
	public static Item faimPotion;
	public static Item witherPotion;
	public static Item noFallPotion;

	/**Splash**/
	public static Item testSplash;

	/**CustomPotionEffect**/
	public static Potion effectPotionWaterWalk;
	public static Potion effectPotionLavaWalk;
	public static Potion effectPotionNoFall;

	/**CustomPotion**/
	public static Item customPotionWaterWalk;
	public static Item customPotionLavaWalk;
	public static Item customPotionNoFall;

	/**Coraux**/
	public static Block coralOrange;
	public static Block coralGreen;
	public static Block coralPurple;
	public static Block coralRose;
	public static Block coralBlack;
	public static Block coralBlue;
	public static Block coralBlockReef;
	public static Block coralBlockSponge;

	/**Mage noir**/
	static int startEntityId = 500;

	/**Achievement**/
	public static CraftingHandler craftHandler = new CraftingHandler();

	//Blocks
	public static Block pike1;

	/** New Slabs **/
	public static Block stepWoolWhite;
	public static Block stepWoolOrange;
	public static Block stepWoolMagenta;
	public static Block stepWoolLightBlue;
	public static Block stepWoolYellow;
	public static Block stepWoolLightGreen;
	public static Block stepWoolPink;
	public static Block stepWoolGray;
	public static Block stepWoolLightGray;
	public static Block stepWoolCyan;
	public static Block stepWoolPurple;
	public static Block stepWoolBlue;
	public static Block stepWoolBrown;
	public static Block stepWoolGreen;
	public static Block stepWoolRed;
	public static Block stepWoolBlack;

	public static Block stepWoolWhiteLight;
	public static Block stepWoolOrangeLight;
	public static Block stepWoolMagentaLight;
	public static Block stepWoolLightBlueLight;
	public static Block stepWoolYellowLight;
	public static Block stepWoolLightGreenLight;
	public static Block stepWoolPinkLight;
	public static Block stepWoolGrayLight;
	public static Block stepWoolLightGrayLight;
	public static Block stepWoolCyanLight;
	public static Block stepWoolPurpleLight;
	public static Block stepWoolBlueLight;
	public static Block stepWoolBrownLight;
	public static Block stepWoolGreenLight;
	public static Block stepWoolRedLight;
	public static Block stepWoolBlackLight;

	public static Block stepGrass;
	public static Block stepDirt;
	public static Block stepGravel;
	public static Block stepWood1;
	public static Block stepWood2;
	public static Block stepWood3;
	public static Block stepWood4;
	public static Block stepCobbleMossy;
	public static Block stepObsidian;
	public static Block stepIce;
	public static Block stepSnow;
	public static Block stepStonebrickMossy;
	public static Block stepStonebrickCracked;
	public static Block stepNetherbrick;
	public static Block stepEnderstone;
	public static Block stepSand;

	public static Block stepStraw;

	public static Block stepSandstoneDoubleSlab;
	public static Block stepSandstoneColumn;
	public static Block stepSandstoneColumnHead;
	public static Block stepSandstoneStonebrick;

	public static Block stepWhiteStone;
	public static Block stepWhiteStonebrick;
	public static Block stepWhiteColumn;
	public static Block stepWhiteColumnHead;
	public static Block stepWhiteCobblestone;
	public static Block stepWhiteDoubleSlab;

	public static Block stepStonebrickColumn;
	public static Block stepStonebrickColumnHead;

	//2930
	public static Block stepMarbleBlackCobblestone;
	public static Block stepMarbleBlackStone;
	public static Block stepMarbleBlackStonebrick;
	public static Block stepMarbleBlackDoubleSlab;
	public static Block stepMarbleBlackColumn;
	public static Block stepMarbleBlackColumnHead;

	//2920
	public static Block stepAncientCobblestone;
	public static Block stepAncientStone;
	public static Block stepAncientStonebrick;
	public static Block stepAncientDoubleSlab;
	public static Block stepAncientColumn;
	public static Block stepAncientColumnHead;

	//2910
	public static Block stepMarbleWhiteCobblestone;
	public static Block stepMarbleWhiteStone;
	public static Block stepMarbleWhiteStonebrick;
	public static Block stepMarbleWhiteDoubleSlab;
	public static Block stepMarbleWhiteColumn;
	public static Block stepMarbleWhiteColumnHead;

	//2940
	public static Block stepWoodenStone;
	public static Block stepWoodenStonebrick;
	public static Block stepWoodenDoubleSlab;
	public static Block stepWoodenColumn;
	public static Block stepWoodenColumnHead;

	//2950
	public static Block stepWoodenLightStone;
	public static Block stepWoodenLightStonebrick;
	public static Block stepWoodenLightDoubleSlab;
	public static Block stepWoodenLightColumn;
	public static Block stepWoodenLightColumnHead;

	public static Block stepIceCobblestone;
	public static Block stepIceStonebrick;
	public static Block stepIceDoubleSlab;
	public static Block stepIceColumn;
	public static Block stepIceColumnHead;

	public static Block stepMarbleDamier;
	public static Block stepMetal;

	public static Block stepLanternWood;
	public static Block stepLanternIron;

	/** New walls **/
	public static Block wallSandstone;
	public static Block wallPlankOak;
	public static Block wallBrick;
	public static Block wallStonebrick;
	public static Block wallNetherbrick;
	public static Block wallWoodOak;
	public static Block wallWoodFir;
	public static Block wallWoodBirch;
	public static Block wallWoodJungle;

	public static Block wallWhiteStone;
	public static Block wallWhiteCobblestone;
	public static Block wallWhiteStonebrick;

	public static Block wallAncientStone;
	public static Block wallAncientStonebrick;
	public static Block wallAncientCobblestone;

	public static Block wallMarbleBlackStone;
	public static Block wallMarbleBlackStonebrick;
	public static Block wallMarbleBlackCobblestone;

	public static Block wallMarbleWhiteStone;
	public static Block wallMarbleWhiteStonebrick;
	public static Block wallMarbleWhiteCobblestone;

	public static Block wallWoodenStone;
	public static Block wallWoodenStonebrick;

	public static Block wallWoodenLightStone;
	public static Block wallWoodenLightStonebrick;

	public static Block wallIceCobblestone;
	public static Block wallIceStonebrick;
	public static Block wallRedGravel;
	public static Block wallLavaRock;
	public static Block wallLavaRockRed;

	/** Fence **/
	public static Block fenceWhiteStone;
	public static Block fenceWhiteStonebrick;
	public static Block fenceWhiteCobblestone;

	public static Block fenceMarbleWhiteStone;
	public static Block fenceMarbleWhiteStonebrick;
	public static Block fenceMarbleWhiteCobblestone;

	public static Block fenceMarbleBlackStone;
	public static Block fenceMarbleBlackStonebrick;
	public static Block fenceMarbleBlackCobblestone;

	public static Block fenceAncientStone;
	public static Block fenceAncientStonebrick;
	public static Block fenceAncientCobblestone;

	public static Block fenceWoodenStone;
	public static Block fenceWoodenStonebrick;

	public static Block fenceWoodenLightStone;
	public static Block fenceWoodenLightStonebrick;

	public static Block fenceIceCobblestone;
	public static Block fenceIceStonebrick;

	/** New stairs **/
	public static Block stairStone;
	public static Block stairGrass;
	public static Block stairDirt;
	public static Block stairGravel;
	public static Block stairMossyCobble;
	public static Block stairObsidian;
	public static Block stairIce;
	public static Block stairSnow;
	public static Block stairStonebrickMossy;
	public static Block stairStonebrickCracked;
	public static Block stairEnderstone;
	public static Block stairSand;

	public static Block stairWoolWhite;
	public static Block stairWoolOrange;
	public static Block stairWoolMagenta;
	public static Block stairWoolLightBlue;
	public static Block stairWoolYellow;
	public static Block stairWoolLightGreen;
	public static Block stairWoolPink;
	public static Block stairWoolGray;
	public static Block stairWoolLightGray;
	public static Block stairWoolCyan;
	public static Block stairWoolPurple;
	public static Block stairWoolBlue;
	public static Block stairWoolBrown;
	public static Block stairWoolGreen;
	public static Block stairWoolRed;
	public static Block stairWoolBlack;

	public static Block stairWoolWhiteLight;
	public static Block stairWoolOrangeLight;
	public static Block stairWoolMagentaLight;
	public static Block stairWoolLightBlueLight;
	public static Block stairWoolYellowLight;
	public static Block stairWoolLightGreenLight;
	public static Block stairWoolPinkLight;
	public static Block stairWoolGrayLight;
	public static Block stairWoolLightGrayLight;
	public static Block stairWoolCyanLight;
	public static Block stairWoolPurpleLight;
	public static Block stairWoolBlueLight;
	public static Block stairWoolBrownLight;
	public static Block stairWoolGreenLight;
	public static Block stairWoolRedLight;
	public static Block stairWoolBlackLight;

	public static Block stairStraw;

	public static Block stairMarbleDamier;

	public static Block stairWhiteStone;
	public static Block stairWhiteStonebrick;
	public static Block stairWhiteCobblestone;

	public static Block stairAncientCobblestone;
	public static Block stairAncientStonebrick;
	public static Block stairAncientStone;

	public static Block stairMarbleBlackStone;
	public static Block stairMarbleBlackStonebrick;
	public static Block stairMarbleBlackCobblestone;

	public static Block stairMarbleWhiteStone;
	public static Block stairMarbleWhiteStonebrick;
	public static Block stairMarbleWhiteCobblestone;

	public static Block stairIceCobblestone;
	public static Block stairIceStonebrick;

	public static Block stairWoodenStone;
	public static Block stairWoodenStonebrick;

	public static Block stairWoodenLightStone;
	public static Block stairWoodenLightStonebrick;

	public static Block stairSandstoneStonebrick;

	/** Lampions **/
	public static Block lampionBlanc;
	public static Block lampionBleu;
	public static Block lampionJaune;
	public static Block lampionVert;
	public static Block lampionRouge;

	/** White Blocs **/
	public static Block whiteStone;
	public static Block whiteCobblestone;
	public static Block whiteStonebrick;
	public static Block whiteStonebrickRound;
	public static Block whiteStoneDoubleSlab;
	public static Block whiteStoneColumn;
	public static Block whiteStoneColumnHead;

	/** Stonebrick **/
	public static Block stonebrickColumn;
	public static Block stonebrickColumnHead;

	/** Ice blocks **/
	public static Block iceCobblestone;
	public static Block icebrick;
	public static Block icebrickRound;
	public static Block iceDoubleSlab;
	public static Block iceColumn;
	public static Block iceColumnHead;

	/** Black Marble **/
	public static Block marbleBlackCobblestone;
	public static Block marbleBlackStone;
	public static Block marbleBlackStonebrick;
	public static Block marbleBlackStonebrickRound;
	public static Block marbleBlackDoubleSlab;
	public static Block marbleBlackColumn;
	public static Block marbleBlackColumnHead;

	public static Block marbleDamier;

	/** Ancient stone **/
	public static Block ancientCobblestone;
	public static Block ancientStone;
	public static Block ancientStonebrick;
	public static Block ancientStonebrickRound;
	public static Block ancientDoubleSlab;
	public static Block ancientColumn;
	public static Block ancientColumnHead;

	/** White Marble **/
	public static Block marbleWhiteCobblestone;
	public static Block marbleWhiteStone;
	public static Block marbleWhiteStonebrick;
	public static Block marbleWhiteStonebrickRound;
	public static Block marbleWhiteDoubleSlab;
	public static Block marbleWhiteColumn;
	public static Block marbleWhiteColumnHead;

	/** Wood **/
	public static Block woodenStone;
	public static Block woodenStonebrick;
	public static Block woodenStonebrickRound;
	public static Block woodenDoubleSlab;
	public static Block woodenColumn;
	public static Block woodenColumnHead;

	/** wooden light **/
	public static Block woodenLightStone;
	public static Block woodenLightStonebrick;
	public static Block woodenLightStonebrickRound;
	public static Block woodenLightDoubleSlab;
	public static Block woodenLightColumn;
	public static Block woodenLightColumnHead;

	/** Metal **/
	//2860
	public static Block metalGrid;
	public static Block metalStonebrick;
	public static Block metalStonebrickRound;
	public static Block metalDoubleSlab;

	/** New Sandstone **/
	public static Block sandstoneStonebrick;
	public static Block sandstoneStonebrickRound;
	public static Block sandstoneColumn;
	public static Block sandstoneColumnHead;
	public static Block sandstoneDoubleSlab;

	/** Autres **/
	//public static Block straw; //Paille
	public static Block PHOnoir;
	public static Block PHOblanc;
	public static Block invisibleBlock;
	public static Block woeBlock;
	public static Block crate;
	public static Block shoji;
	public static Block tuileArdoise;

	public static Block portalPurple;

	/** Bloc minerais **/
	//public static Block coalBlock;
	//public static Block redstoneBlock;
	public static Block obsidianBlock;

	/** Lumineux **/
	public static Block woodenLantern;
	public static Block ironLantern;

	/** Chain, Ropes **/
	public static Block chainIron;
	public static Block chainRope;

	/**Blocs glacee**/
	public static Block logGlacee;
	public static Block leavesGlaceeClair;
	public static Block leavesGlacee;
	public static Block plankGlacee;

	/** Meta **/
	public static Block metaWoolLight;

	private static final String[] metaWoolLightNames = { 
		"Laine lumineuse blanche", "Laine lumineuse orange", "Laine lumineuse violette", "Laine lumineuse bleue claire",
		"Laine lumineuse jaune", "Laine lumineuse verte claire", "Laine lumineuse rose", "Laine lumineuse grise foncee",
		"Laine lumineuse grise claire", "Laine lumineuse cyan", "Laine lumineuse magenta", "Laine lumineuse bleue",
		"Laine lumineuse marron", "Laine lumineuse verte", "Laine lumineuse rouge", "Laine lumineuse noire"
	};
	
	public static Block metaVitrail;
	public static Block metaVitrailPane;

	/** Balustrade **/
	public static Block marbleWhiteAnvil;
	public static Block marbleWhiteStonebrickAnvil;
	public static Block marbleBlackAnvil;
	public static Block marbleBlackStonebrickAnvil;
	public static Block whiteStoneAnvil;
	public static Block whiteStonebrickAnvil;
	public static Block ancientStoneAnvil;
	public static Block ancientStonebrickAnvil;
	public static Block sandstoneStonebrickAnvil;
	public static Block iceStonebrickAnvil;

	public static Block woodenStoneAnvil;
	public static Block woodenStonebrickAnvil;
	public static Block redGravelAnvil;
	public static Block lavaRockAnvil;
	public static Block lavaRockRedAnvil;

	public static Block logAnvil;
	public static Block woodAnvil;
	public static Block woodNormalAnvil;
	public static Block woodLightAnvil;
	public static Block woodDarkAnvil;

	/** Red rock **/
	//3260
	public static Block redGrass;
	public static Block redGravel;
	public static Block beigeLines;
	public static Block beigeRock;
	public static Block redSilver;
	public static Block silverBlock;

	/** New rock **/
	public static Block greyRock;
	public static Block greyRockGrass;
	public static Block brownRock;
	public static Block brownRockGrass;
	public static Block darkRock;
	public static Block darkRockGrass;
	public static Block blackRock;
	public static Block lavaRock;
	public static Block lavaRockRed;

	/** Surface **/
	public static Block surfacePlankOak;
	public static Block surfacePlankFir;
	public static Block surfacePlankBirch;
	public static Block surfacePlankJungle;

	public static Block surfaceGrass;
	public static Block surfaceDirt;
	public static Block surfaceGravel;
	public static Block surfaceStone;

	public static Block surfaceLogOak;
	public static Block surfaceLogFir;
	public static Block surfaceLogBirch;
	public static Block surfaceLogJungle;

	public static Block surfaceStonebrick;

	public static Block tapisPlank;
	public static Block tapisPlankDark;
	public static Block tapisLog;
	public static Block tapisLogDark;

	/** High grass **/

	public static Block highGrassSavanaBot;
	public static Block highGrassSavanaTop;

	public static Block highGrassMagicBot;
	public static Block highGrassMagicTop;

	/**Liquide**/
	public static Block liquideVertFlowing;
	public static Block liquideVertStill;
	public static Block liquideVioletFlowing;
	public static Block liquideVioletStill;

	/** Colombages **/
	public static Block colombageCarre;
	public static Block colombageCroise;
	public static Block colombageVertical;
	public static Block colombageHorizontal;
	public static Block colombageGauche;
	public static Block colombageDroite;

	public static Block fenetreFer;
	public static Block fenetreFerPane;

	public static Block colombageCarreFonce;
	public static Block colombageCroiseFonce;
	public static Block colombageVerticalFonce;
	public static Block colombageHorizontalFonce;
	public static Block colombageGaucheFonce;
	public static Block colombageDroiteFonce;

	/** Tuiles **/
	public static Block tuileRed;
	public static Block tuileBlack;
	public static Block tuileBlue;
	public static Block tuileRedBig;
	public static Block tuileBlackBig;
	public static Block tuileBlueBig;
	public static Block tuileBlackAlt;

	/** Cristaux **/
	public static Block cristalBlock;
	public static Block cristalLittle;
	public static Block cristalBig;

	/** Enseignes **/
	public static Block enseigneAlchimie;
	public static Block enseigneBanque;
	public static Block enseigneForge;
	public static Block enseigneBouclier;
	public static Block enseigneSanctuaire;
	public static Block enseigneArmurerie;
	public static Block enseigneLibrairie;
	public static Block enseigneRestaurant;
	public static Block enseigneTaverne;
	public static Block enseigneMateriaux;
	public static Block enseigneAuberge;
	public static Block enseigneEcurie;
	public static Block enseigneDiamant;
	public static Block enseignePho;
	public static Block enseigneCristal;

	public static Block bookBlock;

	/** Stair tuile**/
	public static Block stairTuileBlack;
	public static Block stairTuileRed;
	public static Block stairTuileBlue;
	public static Block stairTuileBlackBig;
	public static Block stairTuileBlueBig;
	public static Block stairTuileRedBig;
	public static Block stairTuileBlackAlt;

	/** Step tuile **/
	public static Block stepTuileRed;
	public static Block stepTuileBlue;
	public static Block stepTuileBlack;
	public static Block stepTuileRedBig;
	public static Block stepTuileBlueBig;
	public static Block stepTuileBlackBig;
	public static Block stepTuileBlackAlt;

	public static Block meatBlock;

	public static Block savanaGrass;

	/** New logs **/ 
	public static Block logCherry;
	public static Block logRed;



	public static EntityPlayer player;

	public static final String modid = "mho";

	@SidedProxy(clientSide = "mho.common.ClientProxy", serverSide = "mho.common.CommonProxy")
	public static CommonProxy proxy;
	public static ClientProxy proxya;

	/**1**/
	@EventHandler		//Config
	public void preload(FMLPreInitializationEvent e)
	{

		/**Load Custom Sound**/
		MinecraftForge.EVENT_BUS.register(new SoundHandler());
		/**Load Custom Event**/
		MinecraftForge.EVENT_BUS.register(new EventHooks());

		ConfigCore cc = new ConfigCore();

		ConfigCore.loadConfig(e);

		//Items

		/**Ingot**/
		diamondIngot = new MhoItemClassic(cc.diamondIngotID, "\u00C9clat de diamant", 64, null, 2, false).setUnlocalizedName("diamondIngot");

		/**ProjectileNPC**/
		projectileNPCBlanc = new MhoItemClassic(cc.projectileNPCBlancID, "Projectile NPC Blanc", 64, null, 2, true).setUnlocalizedName("projectileNPCBlanc");
		projectileNPCJaune = new MhoItemClassic(cc.projectileNPCJauneID, "Projectile NPC Jaune", 64, null, 2, true).setUnlocalizedName("projectileNPCJaune");
		projectileNPCVert = new MhoItemClassic(cc.projectileNPCVertID, "Projectile NPC Vert", 64, null, 2, true).setUnlocalizedName("projectileNPCVert");
		projectileNPCViolet = new MhoItemClassic(cc.projectileNPCVioletID, "Projectile NPC Violet", 64, null, 2, true).setUnlocalizedName("projectileNPCViolet");
		projectileNPCRouge = new MhoItemClassic(cc.projectileNPCRougeID, "Projectile NPC Rouge", 64, null, 2, true).setUnlocalizedName("projectileNPCRouge");
		projectileNPCGris = new MhoItemClassic(cc.projectileNPCGrisID, "Projectile NPC Gris", 64, null, 2, true).setUnlocalizedName("projectileNPCGris");
		projectileNPCBleu = new MhoItemClassic(cc.projectileNPCBleuID, "Projectile NPC Bleu", 64, null, 2, true).setUnlocalizedName("projectileNPCBleu");

		/** Item gris **/
		batWing = new MhoItemClassic(cc.batWingID, "Aile de chauve-souris", 64, null, 1, false).setUnlocalizedName("batWing").setCreativeTab(Mho.tabMhoGrey);
		bigcatHair = new MhoItemClassic(cc.bigcatHairID, "Criniere feline", 64, null, 1, false).setUnlocalizedName("bigCatHair").setCreativeTab(Mho.tabMhoGrey);
		boarHorn = new MhoItemClassic(cc.boarHornID, "Defense de sanglier", 64, null, 1, false).setUnlocalizedName("boarHorn").setCreativeTab(Mho.tabMhoGrey);
		bugWing = new MhoItemClassic(cc.bugWingID, "Aile d'insecte", 64, null, 1, false).setUnlocalizedName("bugWing").setCreativeTab(Mho.tabMhoGrey);
		cricketLeg = new MhoItemClassic(cc.cricketLegID, "Patte de criquet", 64, null, 1, false).setUnlocalizedName("cricketLeg").setCreativeTab(Mho.tabMhoGrey);
		deerWood = new MhoItemClassic(cc.deerWoodID, "Bois de cerf", 64, null, 1, false).setUnlocalizedName("deerWood").setCreativeTab(Mho.tabMhoGrey);
		duckLeg = new MhoItemClassic(cc.duckLegID, "Patte de canard", 64, null, 1, false).setUnlocalizedName("duckLeg").setCreativeTab(Mho.tabMhoGrey);
		ectoplasm = new MhoItemClassic(cc.ectoplasmID, "Ectoplasme", 64, null, 1, false).setUnlocalizedName("ectoplasm").setCreativeTab(Mho.tabMhoGrey);
		elephantSkin = new MhoItemClassic(cc.elephantSkinID, "Peau d'elephant", 64, null, 1, false).setUnlocalizedName("elephantSkin").setCreativeTab(Mho.tabMhoGrey);
		enderJaw = new MhoItemClassic(cc.enderJawID, "Machoire d'Enderman", 64, null, 1, false).setUnlocalizedName("enderJaw").setCreativeTab(Mho.tabMhoGrey);
		enderParticles = new MhoItemClassic(cc.enderParticlesID, "Particules d'enderman", 64, null, 1, false).setUnlocalizedName("enderParticles").setCreativeTab(Mho.tabMhoGrey);
		foxTail = new MhoItemClassic(cc.foxTailID, "Queue de renard", 64, null, 1, false).setUnlocalizedName("foxTail").setCreativeTab(Mho.tabMhoGrey);
		ghastTentacle = new MhoItemClassic(cc.ghastTentacleID, "Tentacule de ghast", 64, null, 1, false).setUnlocalizedName("ghastTentacle").setCreativeTab(Mho.tabMhoGrey);
		goatHorn = new MhoItemClassic(cc.goatHornID, "Corne de chevre", 64, null, 1, false).setUnlocalizedName("goatHorn").setCreativeTab(Mho.tabMhoGrey);
		honeyPot = new MhoItemClassic(cc.honeyPotID, "Pot de miel", 64, null, 1, false).setUnlocalizedName("honeyPot").setCreativeTab(Mho.tabMhoGrey);
		horseHair = new MhoItemClassic(cc.horseHairID, "Crin de cheval", 64, null, 1, false).setUnlocalizedName("horseHair").setCreativeTab(Mho.tabMhoGrey);
		jellyJam = new MhoItemClassic(cc.jellyJamID, "Confiture de meduse", 64, null, 1, false).setUnlocalizedName("jellyJam").setCreativeTab(Mho.tabMhoGrey);
		mouseMustache = new MhoItemClassic(cc.mouseMustacheID, "Moustache de souris", 64, null, 1, false).setUnlocalizedName("mouseMustache").setCreativeTab(Mho.tabMhoGrey);
		ostrichFeather = new MhoItemClassic(cc.ostrichFeatherID, "Plume d'autruche", 64, null, 1, false).setUnlocalizedName("ostrichFeather").setCreativeTab(Mho.tabMhoGrey);
		pigLeg = new MhoItemClassic(cc.pigLegID, "Pied de porc", 64, null, 1, false).setUnlocalizedName("pigLeg").setCreativeTab(Mho.tabMhoGrey);
		rabbitFoot = new MhoItemClassic(cc.rabbitFootID, "Patte de lapin", 64, null, 1, false).setUnlocalizedName("rabbitFoot").setCreativeTab(Mho.tabMhoGrey);
		redFabric = new MhoItemClassic(cc.redFabricID, "Bout de tissu rouge", 64, null, 1, false).setUnlocalizedName("redFabric").setCreativeTab(Mho.tabMhoGrey);
		reptileTooth = new MhoItemClassic(cc.reptileToothID, "Dent de reptile", 64, null, 1, false).setUnlocalizedName("reptileTooth").setCreativeTab(Mho.tabMhoGrey);
		scorpionSting = new MhoItemClassic(cc.scorpionStingID, "Dard de scorpion", 64, null, 1, false).setUnlocalizedName("scorpionSting").setCreativeTab(Mho.tabMhoGrey);
		sharkFin = new MhoItemClassic(cc.sharkFinID, "Aileron de requin", 64, null, 1, false).setUnlocalizedName("sharkFin").setCreativeTab(Mho.tabMhoGrey);
		skinCreeper = new MhoItemClassic(cc.skinCreeperID,"Lambeau de Creeper", 64, null, 1, false).setUnlocalizedName("skinCreeper").setCreativeTab(Mho.tabMhoGrey);
		smallFlame = new MhoItemClassic(cc.smallFlameID, "Flammeche", 64, null, 1, false).setUnlocalizedName("smallFlame").setCreativeTab(Mho.tabMhoGrey);
		snailShell = new MhoItemClassic(cc.snailShellID, "Coquille d'escargot", 64, null, 1, false).setUnlocalizedName("snailShell").setCreativeTab(Mho.tabMhoGrey);
		snakeTongue = new MhoItemClassic(cc.snakeTongueID, "Langue de vipere", 64, null, 1, false).setUnlocalizedName("snakeTongue").setCreativeTab(Mho.tabMhoGrey);
		spiderLegs = new MhoItemClassic(cc.spiderLegsID, "Pattes d araignee", 64, null, 1, false).setUnlocalizedName("spiderLegs").setCreativeTab(Mho.tabMhoGrey);
		spiderVenom = new MhoItemClassic(cc.spiderVenomID, "Glande a venin", 64, null, 1, false).setUnlocalizedName("spiderVenom").setCreativeTab(Mho.tabMhoGrey);
		turtleShell = new MhoItemClassic(cc.turtleShellID, "Carapace de tortue",64, null, 1, false).setUnlocalizedName("turtleShell").setCreativeTab(Mho.tabMhoGrey);
		whiteCloth = new MhoItemClassic(cc.whiteClothID, "Drap blanc", 64, null, 1, false).setUnlocalizedName("whiteCloth").setCreativeTab(Mho.tabMhoGrey);

		/**ItemsNPC**/
		cartes = new MhoItemClassic(cc.cartesID, "Cartes de jeu", 1, null, 2, false).setUnlocalizedName("cartes");

		/**Poupee**/
		dollBlue = new MhoItemClassic(cc.dollBlueID, "Poupee bleu", 64, null, 2, false).setUnlocalizedName("dollBlue");
		dollBlack = new MhoItemClassic(cc.dollBlackID, "Poupee noire", 64, null, 2, false).setUnlocalizedName("dollBlack");
		pelucheMisterxfr = new MhoItemClassic(cc.pelucheMisterxfrID, "Peluche MisterXFr", 64, null, 2, false).setUnlocalizedName("pelucheMisterxfr");
		pelucheJolirouge = new MhoItemClassic(cc.pelucheJolirougeID, "Peluche Jolirouge", 64, null, 2, false).setUnlocalizedName("pelucheJolirouge");
		pelucheIplay = new MhoItemClassic(cc.pelucheIplayID, "Peluche Iplay4You", 64, null, 2, false).setUnlocalizedName("pelucheIplay");
		pelucheMikefraise = new MhoItemClassic(cc.pelucheMikefraiseID, "Peluche MikeFraise", 64, null, 2, false).setUnlocalizedName("pelucheMikefraise");
		pelucheDeez = new MhoItemClassic(cc.pelucheDeezID, "Peluche Deez", 64, null, 2, false).setUnlocalizedName("pelucheDeez");
		pelucheNicodelpra = new MhoItemClassic(cc.pelucheNicodelpraID, "Peluche Nicodelpra", 64, null, 2, false).setUnlocalizedName("pelucheNicodelpra");
		pelucheDilandaufr = new MhoItemClassic(cc.pelucheDilandaufrID, "Peluche DilandauFr", 64, null, 2, false).setUnlocalizedName("pelucheDilandaufr");
		pelucheNissan = new MhoItemClassic(cc.pelucheNissanID, "Peluche Nissan8", 64, null, 2, false).setUnlocalizedName("pelucheNissan");
		pelucheBbphok = new MhoItemClassic(cc.pelucheBbphokID, "Peluche BBphok", 64, null, 2, false).setUnlocalizedName("pelucheBbphok");
		pelucheBendito = new MhoItemClassic(cc.pelucheBenditoID, "Peluche Bendito78", 64, null, 2, false).setUnlocalizedName("pelucheBendito");
		pelucheSoenguy = new MhoItemClassic(cc.pelucheSoenguyID, "Peluche SoEnguy", 64, null, 2, false).setUnlocalizedName("pelucheSoenguy");
		pelucheChtimarchos = new MhoItemClassic(cc.pelucheChtimarchosID, "Peluche Chtimarchos", 64, null, 2, false).setUnlocalizedName("pelucheChtimarchos");
		pelucheXdakota = new MhoItemClassic(cc.pelucheXdakotaID, "Peluche xDakota", 64, null, 2, false).setUnlocalizedName("pelucheXdakota");
		pelucheLoupfeucg = new MhoItemClassic(cc.pelucheLoupfeucgID, "Peluche Loupfeucg", 64, null, 2, false).setUnlocalizedName("pelucheLoupfeucg");
		pelucheTedrak = new MhoItemClassic(cc.pelucheTedrakID, "Peluche Tedrak50", 64, null, 2, false).setUnlocalizedName("pelucheTedrak50");

		/** Scroll **/
		minorValysScroll = new minorValys(10000, "Parchemin de teleportation mineur (Valys)").setUnlocalizedName("minorValysScroll");
		mediumValysScroll = new mediumValys(10001, "Parchemin de teleportation moyen (Valys)").setUnlocalizedName("mediumValysScroll");
		majorValysScroll = new majorValys(10002, "Parchemin de teleportation majeur (Valys)").setUnlocalizedName("majorValysScroll");

		/** Quest - Nezaril **/
		nezarilJar = new nezarilJar(cc.nezarilJarID, "Urne de Nezaril (vide)").setUnlocalizedName("nezarilJar");
		nezarilJarFull = new MhoItemClassic(cc.nezarilJarFullID, "Urne de Nezaril (pleine)", 1, null, 4, false).setUnlocalizedName("nezarilJarFull").setCreativeTab(Mho.tabMhoQuest);
		redDragonEgg = new MhoItemClassic(cc.redDragonEggID, "Oeuf de dragon rouge", 16, null, 4, false).setUnlocalizedName("redDragonEgg").setCreativeTab(Mho.tabMhoQuest);

		/** Quest **/
		boulon = new MhoItemClassic(cc.boulonID, "Boulon", 64, null, 4, false).setUnlocalizedName("boulon").setCreativeTab(Mho.tabMhoQuest);
		briqueDeSable = new MhoItemClassic(cc.briqueDeSableID, "Brique de sable", 64, null, 4, false).setUnlocalizedName("briqueDeSable").setCreativeTab(Mho.tabMhoQuest);
		buchette = new MhoItemClassic(cc.buchetteID, "Buchette", 64, null, 4, false).setUnlocalizedName("buchette").setCreativeTab(Mho.tabMhoQuest);
		buchetteSombre = new MhoItemClassic(cc.buchetteSombreID, "Buchette sombre", 64, null, 4, false).setUnlocalizedName("buchetteSombre").setCreativeTab(Mho.tabMhoQuest);
		caisse = new MhoItemClassic(cc.caisseID, "Caisse d\u0027armure du vaillant", 64, null, 4, false).setUnlocalizedName("caisse").setCreativeTab(Mho.tabMhoQuest);
		liquideBleu = new MhoItemClassic(cc.liquideBleuID, "Liquide bleu", 64, null, 4, false).setUnlocalizedName("liquideBleu").setCreativeTab(Mho.tabMhoQuest);
		liquideCyan = new MhoItemClassic(cc.liquideCyanID, "Liquide cyan", 64, null, 4, false).setUnlocalizedName("liquideCyan").setCreativeTab(Mho.tabMhoQuest);
		liquideJaune = new MhoItemClassic(cc.liquideJauneID, "Liquide jaune", 64, null, 4, false).setUnlocalizedName("liquideJaune").setCreativeTab(Mho.tabMhoQuest);
		liquideOrange = new MhoItemClassic(cc.liquideOrangeID, "Liquide orange", 64, null, 4, false).setUnlocalizedName("liquideOrange").setCreativeTab(Mho.tabMhoQuest);
		liquideRose = new MhoItemClassic(cc.liquideRoseID, "Liquide rose", 64, null, 4, false).setUnlocalizedName("liquideRose").setCreativeTab(Mho.tabMhoQuest);
		liquideRouge = new MhoItemClassic(cc.liquideRougeID, "Liquide rouge", 64, null, 4, false).setUnlocalizedName("liquideRouge").setCreativeTab(Mho.tabMhoQuest);
		liquideVert = new MhoItemClassic(cc.liquideVertID, "Liquide vert", 64, null, 4, false).setUnlocalizedName("liquideVert").setCreativeTab(Mho.tabMhoQuest);
		liquideViolet = new MhoItemClassic(cc.liquideVioletID, "Liquide violet", 64, null, 4, false).setUnlocalizedName("liquideViolet").setCreativeTab(Mho.tabMhoQuest);
		tuyau = new MhoItemClassic(cc.tuyauID, "Tuyau", 64, null, 4, false).setUnlocalizedName("tuyau").setCreativeTab(Mho.tabMhoQuest);
		vis = new MhoItemClassic(cc.visID, "Vis", 64, null, 4, false).setUnlocalizedName("vis").setCreativeTab(Mho.tabMhoQuest);
		couponTuto = new MhoItemClassic(cc.couponTutoID, "Coupon tutoriel", 64, "Echangeable mais non remboursable.", 4, false).setUnlocalizedName("couponTuto").setCreativeTab(Mho.tabMhoQuest);
		bandage = new MhoItemClassic(cc.bandageID, "Bandage", 64, "Pour faire du bien la ou ca fait mal.", 4, false).setUnlocalizedName("bandage").setCreativeTab(Mho.tabMhoQuest);
		sceptreOr = new MhoItemClassic(cc.sceptreOrID, "Sceptre d\u0027or", 1, null, 4, false).setUnlocalizedName("sceptreOr").setCreativeTab(Mho.tabMhoQuest);
		epeeBlanche = new MhoItemClassic(cc.epeeBlancheID, "Relique", 1, null, 4, false).setUnlocalizedName("epeeBlanche").setCreativeTab(Mho.tabMhoQuest);
		sucreries = new MhoItemClassic(cc.sucreriesID, "Sucreries", 64, null, 4, false).setUnlocalizedName("sucreries").setCreativeTab(Mho.tabMhoQuest);
		grimoireSeth = new MhoItemClassic(cc.grimoireSethID, "Grimoire de Seth", 1, null, 4, false).setUnlocalizedName("grimoireSeth").setCreativeTab(Mho.tabMhoQuest);
		totemMage = new MhoItemClassic(cc.totemMageID, "Totem de Mage", 1, "Objet magique, ne pas secouer.", 4, false).setUnlocalizedName("totemMage").setCreativeTab(Mho.tabMhoQuest);
		grimoireTelgarad = new MhoItemClassic(cc.grimoireTelgaradID, "Grimoire de Tel\u0027garad", 1, null, 4, false).setUnlocalizedName("grimoireTelgarad").setCreativeTab(Mho.tabMhoQuest);
		grimoireTelsalor = new MhoItemClassic(cc.grimoireTelsalorID, "Grimoire de Tel\u0027salor", 1, null, 4, false).setUnlocalizedName("grimoireTelsalor").setCreativeTab(Mho.tabMhoQuest);
		recommandationHakath = new MhoItemClassic(cc.recommandationHakathID, "Recommandation d\u0027Hakath", 64, null, 4, false).setUnlocalizedName("recommandationHakath").setCreativeTab(Mho.tabMhoQuest);
		recommandationLomakoth = new MhoItemClassic(cc.recommandationLomakothID, "Recommandation de Lomakoth", 64, null, 4, false).setUnlocalizedName("recommandationLomakoth").setCreativeTab(Mho.tabMhoQuest);
		pistolet = new MhoItemClassic(cc.pistoletID, "Pistolet", 1, null, 4, false).setUnlocalizedName("pistolet").setCreativeTab(Mho.tabMhoQuest);
		jambeBois = new MhoItemClassic(cc.jambeBoisID, "Jambe de bois", 1, null, 4, false).setUnlocalizedName("jambeBois").setCreativeTab(Mho.tabMhoQuest);
		medaillon = new MhoItemClassic(cc.medaillonID, "Medaillon de pirate", 64, null, 4, false).setUnlocalizedName("medaillon").setCreativeTab(Mho.tabMhoQuest);
		longuevue = new MhoItemClassic(cc.longuevueID, "Longue-vue", 1, "On voit loooooooin !", 4, false).setUnlocalizedName("longueVue").setCreativeTab(Mho.tabMhoQuest);
		clePrisonValys = new MhoItemClassic(cc.clePrisonValysID, "Clef de la prison de Valys", 16, null, 4, false).setUnlocalizedName("clePrisonValys").setCreativeTab(Mho.tabMhoQuest);
		boursePetite = new MhoItemClassic(cc.boursePetiteID, "Petite bourse de Hardcoin", 64, null, 4, false).setUnlocalizedName("boursePetite").setCreativeTab(Mho.tabMhoQuest);
		bourseMoyenne = new MhoItemClassic(cc.bourseMoyenneID, "Moyenne bourse de Hardcoin", 64, null, 4, false).setUnlocalizedName("bourseMoyenne").setCreativeTab(Mho.tabMhoQuest);
		bourseGrande = new MhoItemClassic(cc.bourseGrandeID, "Grande bourse de Hardcoin", 64, null, 4, false).setUnlocalizedName("bourseGrande").setCreativeTab(Mho.tabMhoQuest);
		grimoireApprenti = new MhoItemClassic(cc.grimoireApprentiID, "Grimore de l\u0027apprenti", 1, null, 4, false).setUnlocalizedName("grimoireApprenti").setCreativeTab(Mho.tabMhoQuest);
		vanish = new MhoItemClassic(cc.vanishID, "Vanish", 1, "Et les taches s\u0027evanouissent !", 4, false).setUnlocalizedName("vanish").setCreativeTab(Mho.tabMhoQuest);
		enveloppe = new MhoItemClassic(cc.enveloppeID, "Enveloppe", 64, "A livrer sans regarder !", 4, false).setUnlocalizedName("enveloppe").setCreativeTab(Mho.tabMhoQuest);
		batonAdaoldan = new MhoItemClassic(cc.batonAdaoldanID, "Baton d\u0027Adaoldan", 1, null, 4, false).setUnlocalizedName("batonAdaoldan").setCreativeTab(Mho.tabMhoQuest);
		batonAdaoldanEnchant = new MhoItemClassic(cc.batonAdaoldanEnchantID, "Baton d\u0027Adaoldan enchant\u00E9", 1, null, 4, true).setUnlocalizedName("batonAdaoldanEnchant").setCreativeTab(Mho.tabMhoQuest);
		fragmentAdaoldan = new MhoItemClassic(cc.fragmentAdaoldanID, "Fragment du baton d\u0027Adaoldan", 16, null, 4, false).setUnlocalizedName("fragmentAdaoldan").setCreativeTab(Mho.tabMhoQuest);
		projectileArcanique = new MhoItemClassic(cc.projectileArcaniqueID, "Projectile arcanique", 64, "Utilis\u00e9 par les mages de la boutique du PHO", 4, false).setUnlocalizedName("projectileArcanique").setCreativeTab(Mho.tabMhoQuest);
		marteauForgeron = new MhoItemClassic(cc.marteauForgeronID, "Marteau du forgeron", 1, "C\u0027est en forgeant que l\u0027ont devient...", 4, false).setUnlocalizedName("marteauForgeron").setCreativeTab(Mho.tabMhoQuest);
		lameRuniqueEmeraude = new MhoItemClassic(cc.lameRuniqueEmeraudeID, "Lame runique en Emeraude", 1, null, 4, false).setUnlocalizedName("lameRuniqueEmeraude").setCreativeTab(Mho.tabMhoQuest);

		/** Enchant **/
		enchantSharpnessT1Small = new MhoItemClassic(cc.enchantSharpnessT1SmallID, "Petite rune de puissance mineure", 64, "Tiers 1 - Niveau 1", 2, false).setUnlocalizedName("enchantSharpness").setCreativeTab(tabMhoEnchant);
		enchantSharpnessT1Medium = new MhoItemClassic(cc.enchantSharpnessT1MediumID, "Petite rune de puissance", 64, "Tiers 1 - Niveau 2", 3, false).setUnlocalizedName("enchantSharpness").setCreativeTab(tabMhoEnchant);
		enchantSharpnessT1Big = new MhoItemClassic(cc.enchantSharpnessT1BigID, "Petite rune de puissance majeure", 64, "Tiers 1 - Niveau 3", 4, false).setUnlocalizedName("enchantSharpness").setCreativeTab(tabMhoEnchant);
		enchantSharpnessT2Small = new MhoItemClassic(cc.enchantSharpnessT2SmallID, "Rune de puissance mineure", 64, "Tiers 2 - Niveau 1", 2, false).setUnlocalizedName("enchantSharpness").setCreativeTab(tabMhoEnchant);
		enchantSharpnessT2Medium = new MhoItemClassic(cc.enchantSharpnessT2MediumID, "Rune de puissance", 64, "Tiers 2 - Niveau 2", 3, false).setUnlocalizedName("enchantSharpness").setCreativeTab(tabMhoEnchant);
		enchantSharpnessT2Big = new MhoItemClassic(cc.enchantSharpnessT2BigID, "Rune de puissance majeure", 64, "Tiers 2 - Niveau 3", 4, false).setUnlocalizedName("enchantSharpness").setCreativeTab(tabMhoEnchant);
		enchantSharpnessT3Small = new MhoItemClassic(cc.enchantSharpnessT3SmallID, "Grande rune de puissance mineure", 64, "Tiers 3 - Niveau 1", 2, false).setUnlocalizedName("enchantSharpness").setCreativeTab(tabMhoEnchant);
		enchantSharpnessT3Medium = new MhoItemClassic(cc.enchantSharpnessT3MediumID, "Grande rune de puissance", 64, "Tiers 3 - Niveau 2", 3, false).setUnlocalizedName("enchantSharpness").setCreativeTab(tabMhoEnchant);
		enchantSharpnessT3Big = new MhoItemClassic(cc.enchantSharpnessT3BigID, "Grande rune de puissance majeure", 64, "Tiers 3 - Niveau 3", 4, false).setUnlocalizedName("enchantSharpness").setCreativeTab(tabMhoEnchant);

		enchantSmiteT1Small = new MhoItemClassic(cc.enchantSmiteT1SmallID, "Petite rune de chatiment mineure", 64, "Tiers 1 - Niveau 1", 2, false).setUnlocalizedName("enchantSmite").setCreativeTab(tabMhoEnchant);
		enchantSmiteT1Medium = new MhoItemClassic(cc.enchantSmiteT1MediumID, "Petite rune de chatiment", 64, "Tiers 1 - Niveau 2", 3, false).setUnlocalizedName("enchantSmite").setCreativeTab(tabMhoEnchant);
		enchantSmiteT1Big = new MhoItemClassic(cc.enchantSmiteT1BigID, "Petite rune de chatiment majeure", 64, "Tiers 1 - Niveau 3", 4, false).setUnlocalizedName("enchantSmite").setCreativeTab(tabMhoEnchant);
		enchantSmiteT2Small = new MhoItemClassic(cc.enchantSmiteT2SmallID, "Rune de chatiment mineure", 64, "Tiers 2 - Niveau 1", 2, false).setUnlocalizedName("enchantSmite").setCreativeTab(tabMhoEnchant);
		enchantSmiteT2Medium = new MhoItemClassic(cc.enchantSmiteT2MediumID, "Rune de chatiment", 64, "Tiers 2 - Niveau 2", 3, false).setUnlocalizedName("enchantSmite").setCreativeTab(tabMhoEnchant);
		enchantSmiteT2Big = new MhoItemClassic(cc.enchantSmiteT2BigID, "Rune de chatiment majeure", 64, "Tiers 2 - Niveau 3", 4, false).setUnlocalizedName("enchantSmite").setCreativeTab(tabMhoEnchant);
		enchantSmiteT3Small = new MhoItemClassic(cc.enchantSmiteT3SmallID, "Grande rune de chatiment mineure", 64, "Tiers 3 - Niveau 1", 2, false).setUnlocalizedName("enchantSmite").setCreativeTab(tabMhoEnchant);
		enchantSmiteT3Medium = new MhoItemClassic(cc.enchantSmiteT3MediumID, "Grande rune de chatiment", 64, "Tiers 3 - Niveau 2", 3, false).setUnlocalizedName("enchantSmite").setCreativeTab(tabMhoEnchant);
		enchantSmiteT3Big = new MhoItemClassic(cc.enchantSmiteT3BigID, "Grande rune de chatiment majeure", 64, "Tiers 3 - Niveau 3", 4, false).setUnlocalizedName("enchantSmite").setCreativeTab(tabMhoEnchant);

		enchantProtectionT1Small = new MhoItemClassic(cc.enchantProtectionT1SmallID, "Petite rune de protection mineure", 64, "Tiers 1 - Niveau 1", 2, false).setUnlocalizedName("enchantProtection").setCreativeTab(tabMhoEnchant);
		enchantProtectionT1Big = new MhoItemClassic(cc.enchantProtectionT1BigID, "Petite rune de protection majeure", 64, "Tiers 1 - Niveau 2", 4, false).setUnlocalizedName("enchantProtection").setCreativeTab(tabMhoEnchant);
		enchantProtectionT2Small = new MhoItemClassic(cc.enchantProtectionT2SmallID, "Rune de protection mineure", 64, "Tiers 2 - Niveau 1", 2, false).setUnlocalizedName("enchantProtection").setCreativeTab(tabMhoEnchant);
		enchantProtectionT2Big = new MhoItemClassic(cc.enchantProtectionT2BigID, "Rune de protection majeure", 64, "Tiers 2 - Niveau 2", 4, false).setUnlocalizedName("enchantProtection").setCreativeTab(tabMhoEnchant);
		enchantProtectionT3Small = new MhoItemClassic(cc.enchantProtectionT3SmallID, "Grande rune de protection mineure", 64, "Tiers 3 - Niveau 1", 2, false).setUnlocalizedName("enchantProtection").setCreativeTab(tabMhoEnchant);
		enchantProtectionT3Big = new MhoItemClassic(cc.enchantProtectionT3BigID, "Grande rune de protection majeure", 64, "Tiers 3 - Niveau 2", 4, false).setUnlocalizedName("enchantProtection").setCreativeTab(tabMhoEnchant);

		enchantBaneofT1Small = new MhoItemClassic(cc.enchantBaneofT1SmallID, "Petite rune du fleau mineure", 64, "Tiers 1 - Niveau 1", 2, false).setUnlocalizedName("enchantBaneof").setCreativeTab(tabMhoEnchant);
		enchantBaneofT1Medium = new MhoItemClassic(cc.enchantBaneofT1MediumID, "Petite rune du fleau", 64, "Tiers 1 - Niveau 2", 3, false).setUnlocalizedName("enchantBaneof").setCreativeTab(tabMhoEnchant);
		enchantBaneofT1Big = new MhoItemClassic(cc.enchantBaneofT1BigID, "Petite rune du fleau majeure", 64, "Tiers 1 - Niveau 3", 4, false).setUnlocalizedName("enchantBaneof").setCreativeTab(tabMhoEnchant);
		enchantBaneofT2Small = new MhoItemClassic(cc.enchantBaneofT2SmallID, "Rune du fleau mineure", 64, "Tiers 2 - Niveau 1", 2, false).setUnlocalizedName("enchantBaneof").setCreativeTab(tabMhoEnchant);
		enchantBaneofT2Medium = new MhoItemClassic(cc.enchantBaneofT2MediumID, "Rune du fleau", 64, "Tiers 2 - Niveau 2", 3, false).setUnlocalizedName("enchantBaneof").setCreativeTab(tabMhoEnchant);
		enchantBaneofT2Big = new MhoItemClassic(cc.enchantBaneofT2BigID, "Rune du fleau majeure", 64, "Tiers 2 - Niveau 3", 4, false).setUnlocalizedName("enchantBaneof").setCreativeTab(tabMhoEnchant);
		enchantBaneofT3Small = new MhoItemClassic(cc.enchantBaneofT3SmallID, "Grande rune du fleau mineure", 64, "Tiers 3 - Niveau 1", 2, false).setUnlocalizedName("enchantBaneof").setCreativeTab(tabMhoEnchant);
		enchantBaneofT3Medium = new MhoItemClassic(cc.enchantBaneofT3MediumID, "Grande rune du fleau", 64, "Tiers 3 - Niveau 2", 3, false).setUnlocalizedName("enchantBaneof").setCreativeTab(tabMhoEnchant);
		enchantBaneofT3Big = new MhoItemClassic(cc.enchantBaneofT3BigID, "Grande rune du fleau majeure", 64, "Tiers 3 - Niveau 3", 4, false).setUnlocalizedName("enchantBaneof").setCreativeTab(tabMhoEnchant);

		enchantEfficacityT1Small = new MhoItemClassic(cc.enchantEfficacityT1SmallID, "Petite rune de rapidite mineure", 64, "Tiers 1 - Niveau 1", 2, false).setUnlocalizedName("enchantEfficacity").setCreativeTab(tabMhoEnchant);
		enchantEfficacityT1Medium = new MhoItemClassic(cc.enchantEfficacityT1MediumID, "Petite rune de rapidite", 64, "Tiers 1 - Niveau 2", 3, false).setUnlocalizedName("enchantEfficacity").setCreativeTab(tabMhoEnchant);
		enchantEfficacityT1Big = new MhoItemClassic(cc.enchantEfficacityT1BigID, "Petite rune de rapidite majeure", 64, "Tiers 1 - Niveau 3", 4, false).setUnlocalizedName("enchantEfficacity").setCreativeTab(tabMhoEnchant);
		enchantEfficacityT2Small = new MhoItemClassic(cc.enchantEfficacityT2SmallID, "Rune de rapidite mineure", 64, "Tiers 2 - Niveau 1", 2, false).setUnlocalizedName("enchantEfficacity").setCreativeTab(tabMhoEnchant);
		enchantEfficacityT2Medium = new MhoItemClassic(cc.enchantEfficacityT2MediumID, "Rune de rapidite", 64, "Tiers 2 - Niveau 2", 3, false).setUnlocalizedName("enchantEfficacity").setCreativeTab(tabMhoEnchant);
		enchantEfficacityT2Big = new MhoItemClassic(cc.enchantEfficacityT2BigID, "Rune de rapidite majeure", 64, "Tiers 2 - Niveau 3", 4, false).setUnlocalizedName("enchantEfficacity").setCreativeTab(tabMhoEnchant);
		enchantEfficacityT3Small = new MhoItemClassic(cc.enchantEfficacityT3SmallID, "Grande rune de rapidite mineure", 64, "Tiers 3 - Niveau 1", 2, false).setUnlocalizedName("enchantEfficacity").setCreativeTab(tabMhoEnchant);
		enchantEfficacityT3Medium = new MhoItemClassic(cc.enchantEfficacityT3MediumID, "Grande rune de rapidite", 64, "Tiers 3 - Niveau 2", 3, false).setUnlocalizedName("enchantEfficacity").setCreativeTab(tabMhoEnchant);
		enchantEfficacityT3Big = new MhoItemClassic(cc.enchantEfficacityT3BigID, "Grande rune de rapidite majeure", 64, "Tiers 3 - Niveau 3", 4, false).setUnlocalizedName("enchantEfficacity").setCreativeTab(tabMhoEnchant);

		enchantDurabilityT1Small = new MhoItemClassic(cc.enchantDurabilityT1SmallID, "Petite rune de solidite mineure", 64, "Tiers 1 - Niveau 1", 2, false).setUnlocalizedName("enchantDurability").setCreativeTab(tabMhoEnchant);
		enchantDurabilityT1Medium = new MhoItemClassic(cc.enchantDurabilityT1MediumID, "Petite rune de solidite", 64, "Tiers 1 - Niveau 2", 3, false).setUnlocalizedName("enchantDurability").setCreativeTab(tabMhoEnchant);
		enchantDurabilityT1Big = new MhoItemClassic(cc.enchantDurabilityT1BigID, "Petite rune de solidite majeure", 64, "Tiers 1 - Niveau 3", 4, false).setUnlocalizedName("enchantDurability").setCreativeTab(tabMhoEnchant);
		enchantDurabilityT2Small = new MhoItemClassic(cc.enchantDurabilityT2SmallID, "Rune de solidite mineure", 64, "Tiers 2 - Niveau 1", 2, false).setUnlocalizedName("enchantDurability").setCreativeTab(tabMhoEnchant);
		enchantDurabilityT2Medium = new MhoItemClassic(cc.enchantDurabilityT2MediumID, "Rune de solidite", 64, "Tiers 2 - Niveau 2", 3, false).setUnlocalizedName("enchantDurability").setCreativeTab(tabMhoEnchant);
		enchantDurabilityT2Big = new MhoItemClassic(cc.enchantDurabilityT2BigID, "Rune de solidite majeure", 64, "Tiers 2 - Niveau 3", 4, false).setUnlocalizedName("enchantDurability").setCreativeTab(tabMhoEnchant);
		enchantDurabilityT3Small = new MhoItemClassic(cc.enchantDurabilityT3SmallID, "Grande rune de solidite mineure", 64, "Tiers 3 - Niveau 1", 2, false).setUnlocalizedName("enchantDurability").setCreativeTab(tabMhoEnchant);
		enchantDurabilityT3Medium = new MhoItemClassic(cc.enchantDurabilityT3MediumID, "Grande rune de solidite", 64, "Tiers 3 - Niveau 2", 3, false).setUnlocalizedName("enchantDurability").setCreativeTab(tabMhoEnchant);
		enchantDurabilityT3Big = new MhoItemClassic(cc.enchantDurabilityT3BigID, "Grande rune de solidite majeure", 64, "Tiers 3 - Niveau 3", 4, false).setUnlocalizedName("enchantDurability").setCreativeTab(tabMhoEnchant);

		enchantFlameT1Small = new MhoItemClassic(cc.enchantFlameT1SmallID, "Petite rune d embrasement mineure", 64, "Tiers 1 - Niveau 1", 2, false).setUnlocalizedName("enchantFlame").setCreativeTab(tabMhoEnchant);
		enchantFlameT1Big = new MhoItemClassic(cc.enchantFlameT1BigID, "Petite rune d embrasement majeure", 64, "Tiers 1 - Niveau 2", 4, false).setUnlocalizedName("enchantFlame").setCreativeTab(tabMhoEnchant);
		enchantFlameT2Small = new MhoItemClassic(cc.enchantFlameT2SmallID, "Rune d embrasement mineure", 64, "Tiers 2 - Niveau 1", 2, false).setUnlocalizedName("enchantFlame").setCreativeTab(tabMhoEnchant);
		enchantFlameT2Big = new MhoItemClassic(cc.enchantFlameT2BigID, "Rune d embrasement majeure", 64, "Tiers 2 - Niveau 2", 4, false).setUnlocalizedName("enchantFlame").setCreativeTab(tabMhoEnchant);
		enchantFlameT3Small = new MhoItemClassic(cc.enchantFlameT3SmallID, "Grande rune d embrasement mineure", 64, "Tiers 3 - Niveau 1", 2, false).setUnlocalizedName("enchantFlame").setCreativeTab(tabMhoEnchant);
		enchantFlameT3Big = new MhoItemClassic(cc.enchantFlameT3BigID, "Grande rune d embrasement majeure", 64, "Tiers 3 - Niveau 2", 4, false).setUnlocalizedName("enchantFlame").setCreativeTab(tabMhoEnchant);

		enchantKnockbackT1Small = new MhoItemClassic(cc.enchantKnockbackT1SmallID, "Petite rune de repulsion mineure", 64, "Tiers 1 - Niveau 1", 2, false).setUnlocalizedName("enchantKnockback").setCreativeTab(tabMhoEnchant);
		enchantKnockbackT1Big = new MhoItemClassic(cc.enchantKnockbackT1BigID, "Petite rune de repulsion majeure", 64, "Tiers 1 - Niveau 2", 4, false).setUnlocalizedName("enchantKnockback").setCreativeTab(tabMhoEnchant);
		enchantKnockbackT2Small = new MhoItemClassic(cc.enchantKnockbackT2SmallID, "Rune de repulsion mineure", 64, "Tiers 2 - Niveau 1", 2, false).setUnlocalizedName("enchantKnockback").setCreativeTab(tabMhoEnchant);
		enchantKnockbackT2Big = new MhoItemClassic(cc.enchantKnockbackT2BigID, "Rune de repulsion majeure", 64, "Tiers 2 - Niveau 2", 4, false).setUnlocalizedName("enchantKnockback").setCreativeTab(tabMhoEnchant);
		enchantKnockbackT3Small = new MhoItemClassic(cc.enchantKnockbackT3SmallID, "Grande rune de repulsion mineure", 64, "Tiers 3 - Niveau 1", 2, false).setUnlocalizedName("enchantKnockback").setCreativeTab(tabMhoEnchant);
		enchantKnockbackT3Big = new MhoItemClassic(cc.enchantKnockbackT3BigID, "Grande rune de repulsion majeure", 64, "Tiers 3 - Niveau 2", 4, false).setUnlocalizedName("enchantKnockback").setCreativeTab(tabMhoEnchant);

		/**Key**/
		goldKey = new MhoItemClassic(cc.goldKeyID, "Cl\u00E9 de donjon d\u0027or", 64, "Sesam, ouvre-toi !", 7, true).setUnlocalizedName("goldKey");
		silverKey = new MhoItemClassic(cc.silverKeyID, "Cl\u00E9 de donjon d\u0027argent", 64, "Sesam, ouvre-toi !", 7, true).setUnlocalizedName("silverKey");
		bronzeKey = new MhoItemClassic(cc.bronzeKeyID, "Cl\u00E9 de donjon de bronze", 64, "Sesam, ouvre-toi !", 7, true).setUnlocalizedName("bronzeKey");
		goldSmallKey = new MhoItemClassic(cc.goldSmallKeyID, "Cl\u00E9 d\u0027or", 64, "Sesam, ouvre-toi !", 7, true).setUnlocalizedName("goldSmallKey");
		silverSmallKey = new MhoItemClassic(cc.silverSmallKeyID, "Cl\u00E9 d\u0027argent", 64, "Sesam, ouvre-toi !", 7, true).setUnlocalizedName("silverSmallKey");
		bronzeSmallKey = new MhoItemClassic(cc.bronzeSmallKeyID, "Cl\u00E9 de bronze", 64, "Sesam, ouvre-toi !", 7, true).setUnlocalizedName("bronzeSmallKey");

		/**Coin**/
		bronzeCoin = new MhoItemClassic(cc.bronzeCoinID, "Hardcoin de bronze", 64, null, 2, false).setUnlocalizedName("bronzeCoin");
		silverCoin = new MhoItemClassic(cc.silverCoinID, "Hardcoin d\u0027argent", 64, null, 2, false).setUnlocalizedName("silverCoin");
		goldCoin = new MhoItemClassic(cc.goldCoinID, "Hardcoin d\u0027or", 64, null, 2, false).setUnlocalizedName("goldCoin");
		diamondCoin = new MhoItemClassic(cc.diamondCoinID, "Hardcoin de diamand", 64, null, 2, false).setUnlocalizedName("diamondCoin");

		/**Trophee**/
		trophyGold = new MhoItemClassic(cc.trophyGoldID, "Trophee d\u0027or", 64, "I wiiiiiin", 2, true).setUnlocalizedName("trophyGold");
		trophySilver = new MhoItemClassic(cc.trophySilverID, "Trophee d\u0027argent", 64, null, 2, true).setUnlocalizedName("trophySilver");
		trophyBronze = new MhoItemClassic(cc.trophyBronzeID, "Trophee de bronze", 64, null, 2, true).setUnlocalizedName("trophyBronze");
		trophyGoldChip = new MhoItemClassic(cc.trophyGoldChipID, "Trophee d\u0027or \u00E9br\u00E9ch\u00E9", 64, null, 2, true).setUnlocalizedName("trophyGoldChip");

		/**CacheOeil**/
		cacheOeil = new CacheOeil(cc.cacheOeilID, armureCacheOeil, 0, 0, "Cache Oeil").setUnlocalizedName("cacheOeil");

		/**Food**/
		hamburgerFood = new Food(cc.hamburgerFoodID, 20, false, "Hamburger").setUnlocalizedName("hamburgerFood");
		fritesFood = new Food(cc.fritesFoodID, 12, false, "Frites").setUnlocalizedName("fritesFood");
		kfcFood = new Food(cc.kfcFoodID, 12, false, "Nuggets").setUnlocalizedName("kfcFood");
		oeufFood = new Food(cc.oeufFoodID, 12, false, "Oeufs").setUnlocalizedName("oeufFood");
		baconFood = new Food(cc.baconFoodID, 12, false, "Bacon").setUnlocalizedName("baconFood");
		fromageFood = new Food(cc.fromageFoodID, 12, false, "Fromage").setUnlocalizedName("fromageFood");
		makiFood = new Food(cc.makiFoodID, 12, false, "Maki").setUnlocalizedName("makiFood");
		sushiFood = new Food(cc.sushiFoodID, 12, false, "Sushi").setUnlocalizedName("sushiFood");
		brochetteFood = new Food(cc.brochetteFoodID, 12, false, "Brochette").setUnlocalizedName("brochetteFood");
		rhum = new Rhum(cc.rhumID, -4, false, "Rhum").setUnlocalizedName("rhum");

		/**Sword**/
		poeleSword = new PoeleSword(cc.poeleSwordID, poeleTool, "Po\u00EAle \u00E0 frire").setUnlocalizedName("poeleSword");
		sceptreRouge = new MhoItemSword(cc.sceptreRougeID, nodmgTool, "Sceptre Rouge").setUnlocalizedName("sceptreRouge");
		sceptreBleu = new MhoItemSword(cc.sceptreBleuID, nodmgTool, "Sceptre Bleu").setUnlocalizedName("sceptreBleu");
		sceptreVert = new MhoItemSword(cc.sceptreVertID, nodmgTool, "Sceptre Vert").setUnlocalizedName("sceptreVert");
		marteauBois = new MhoItemSword(cc.marteauBoisID, nodmgTool, "Marteau en bois").setUnlocalizedName("marteauBois");
		marteauPierre = new MhoItemSword(cc.marteauPierreID, nodmgTool, "Marteau en pierre").setUnlocalizedName("marteauPierre");
		marteauFer = new MhoItemSword(cc.marteauFerID, nodmgTool, "Marteau en fer").setUnlocalizedName("marteauFer");
		rapier = new MhoItemSword(cc.rapierID, nodmgTool, "Rapier").setUnlocalizedName("rapier");
		lameRunique = new MhoItemSword(cc.lameRuniqueID, nodmgTool, "Lame runique").setUnlocalizedName("lameRunique");

		/**Chope Beer**/
		chope = new MhoItemClassic(1663, "Chope vide", 1, null, 2, false).setUnlocalizedName("chope");
		beer = new Beer(1664, -2, false, "Chope de bi\u00E8re").setUnlocalizedName("beer");

		/**Table craft portable**/
		pocketCraftingTable = new PocketCraftingTable(cc.pocketCraftingTableID, "Table de craft portable").setUnlocalizedName("pocketCraftingTable");
		
		/**Loot**/
		coeurLoot = new MhoItemClassic(cc.coeurLootID, "Coeur", 64, null, 1, false).setUnlocalizedName("coeurLoot");
		cerveauLoot = new MhoItemClassic(cc.cerveauLootID, "Cerveau de zombie", 64, null, 1, false).setUnlocalizedName("cerveauLoot");
		brasLoot = new MhoItemClassic(cc.brasLootID, "Bras de zombie", 64, null, 1, false).setUnlocalizedName("brasLoot");
		poudreMagie = new PoudreMagie(cc.poudreMagieID, "Poudre de magie").setUnlocalizedName("poudreMagie");

		/**Insignes**/
		valysInsignes = new Insignes(cc.valysInsignesID, "Insigne de Valys").setUnlocalizedName("valysInsignes");
		chasseInsignes = new Insignes(cc.chasseInsignesID, "Insigne de chasse").setUnlocalizedName("chasseInsignes");
		guerreInsignes = new Insignes(cc.guerreInsignesID, "Insigne de guerre").setUnlocalizedName("guerreInsignes");
		agricultureInsignes = new Insignes(cc.agricultureInsignesID, "Insigne d\u0027agriculture").setUnlocalizedName("agricultureInsignes");
		gastronomieInsignes = new Insignes(cc.gastronomieInsignesID, "Insigne de gastronomie").setUnlocalizedName("gastronomieInsignes");
		minageInsignes = new Insignes(cc.minageInsignesID, "Insigne de minage").setUnlocalizedName("minageInsignes");
		artisanatInsignes = new Insignes(cc.artisanatInsignesID, "Insigne d\u0027artisanat").setUnlocalizedName("artisanatInsignes");
		villeInsignes = new Insignes(cc.villeInsignesID, "Insigne de ville").setUnlocalizedName("villeInsignes");
		pecheInsignes = new Insignes(cc.pecheInsignesID, "Insigne de p\u00EAche").setUnlocalizedName("pecheInsignes");
		explorationInsignes = new Insignes(cc.explorationInsignesID, "Insigne d\u0027exploration").setUnlocalizedName("explorationInsignes");
		constructionInsignes = new Insignes(cc.constructionInsignesID, "Insigne de construction").setUnlocalizedName("constructionInsignes");
		guildeInsignes = new Insignes(cc.guildeInsignesID, "Insigne de guilde").setUnlocalizedName("guildeInsignes");
		victoireInsignes = new Insignes(cc.victoireInsignesID, "Insigne de victoire").setUnlocalizedName("victoireInsignes");
		participationInsignes = new Insignes(cc.participationInsignesID, "Insigne de participation").setUnlocalizedName("participationInsignes");
		magieInsignes = new Insignes(cc.magieInsignesID, "Insigne de magie").setUnlocalizedName("magieInsignes");

		/**Legendaire**/
		nocturneLegendaire = new NocturneLegendaire(cc.nocturneLegendaireID, nocturneLegendaireTool, "Baton nocturne").setUnlocalizedName("nocturneLegendaire");
		diurneLegendaire = new DiurneLegendaire(cc.diurneLegendaireID, diurneLegendaireTool, "Baton du jour").setUnlocalizedName("diurneLegendaire");
		teddyBear = new TeddyBear(cc.teddyBearID, "Ours en peluche").setUnlocalizedName("teddyBear");

		/**Blocks**/
		meatBlock = new BlockSixFaces(cc.meatBlockID, "Bloc de viande").setUnlocalizedName("meatBlock").setTextureName("meatBlock");
		leatherBlock = new MhoClassic(cc.leatherBlockID, "Bloc de cuir", false).setUnlocalizedName("leatherBlock").setTextureName("leatherBlock");
		lavaBlock = new AnimBlock(cc.lavaBlockID, 237, Material.lava, "Bloc de lave").setUnlocalizedName("lavaBlock").setTextureName("lava_still");
		waterBlock = new AnimBlock(cc.waterBlockID, 205, Material.water, "Bloc d\u0027eau").setUnlocalizedName("waterBlock").setTextureName("water_still");
		tonneauBlock = new TonneauBlock(cc.tonneauBlockID, Material.wood, "Tonneau").setUnlocalizedName("tonneau").setTextureName("tonneau");
		caisseVaillant = new MhoLog(cc.caisseVaillantID, "Caisse du Vaillant").setUnlocalizedName("caisseVaillant").setTextureName("caisseVaillant");
		escaladeBlock = new MhoLadder(cc.escaladeBlockID, 31, Material.circuits, "Bloc d\u0027escalade").setUnlocalizedName("escaladeBlock").setTextureName("escaladeBlock");
		slimeBlock = new SlimeBlock(cc.slimeBlockID, 184, Material.grass, "Bloc de slime").setUnlocalizedName("slimeBlock").setTextureName("slimeBlock");
		roseBlock = new MhoVines(cc.roseBlockID, Material.vine, "Vignes de roses").setUnlocalizedName("roseVine").setTextureName("roseVine");
		cakeLieBlock = new CakeLieBlock(cc.cakeLieBlockID, 121, Material.cake, "Cake").setUnlocalizedName("cakeLieBlock");
		meatCakeBlock = new MhoCake(cc.meatCakeBlockID, 162, "Viande").setUnlocalizedName("meatCakeBlock").setTextureName("meatBlock");
		simpleDirtBlock = new McClassic(cc.simpleDirtBlockID, Material.ground, "Terre classique").setStepSound(Block.soundGravelFootstep).setUnlocalizedName("dirt").setTextureName("dirt");
		grisouBlock = new GrisouBlock(cc.grisouBlockID, Material.rock, "Bloc de grisou").setUnlocalizedName("grisouBlock").setTextureName("stone");
		fossileBlock = new BlockSixFaces(cc.fossileBlockID, "Fossile").setUnlocalizedName("fossileBlock").setTextureName("fossileBlock");
		caisseBlock = new MhoClassic(cc.caisseBlockID, "Caisse", false).setUnlocalizedName("caisseBlock").setTextureName("caisseBlockTop");
		bucheCompleteBlock = new McClassic(cc.bucheCompleteBlockID, Material.wood, "Buche complete").setStepSound(Block.soundWoodFootstep).setUnlocalizedName("bucheCompleteBlock").setTextureName("log_oak");
		bucheFonceCompleteBlock = new McClassic(cc.bucheFonceCompleteBlockID, Material.wood, "Buche fonce complete").setStepSound(Block.soundWoodFootstep).setUnlocalizedName("bucheFonceCompleteBlock").setTextureName("log_spruce");

		caisseBlockBot = new MhoClassicBot(cc.caisseBlockBotID, 188,"Grande caisse", false).setUnlocalizedName("caisseBlockBot").setTextureName("caisseBlock");
		caisseBlockTop = new MhoClassicTop(cc.caisseBlockTopID, 172, "Grande caisse (haut)", false).setUnlocalizedName("caisseBlockTop").setTextureName("caisseBlock");

		batonTorcheBot = new MhoBatonBot(cc.batonTorcheBotID, 189,"Baton lumineux").setUnlocalizedName("batonTorcheBot").setTextureName("batonTorcheBot");
		batonTorcheTop = new MhoBatonTop(cc.batonTorcheTopID, 173, "Baton lumineux (haut)").setLightValue(1.0F).setUnlocalizedName("batonTorcheTop").setTextureName("batonTorcheTop");
		batonBougieBot = new MhoBatonBot(cc.batonBougieBotID, 190,"Baton de bougie lumineux").setUnlocalizedName("batonBougieBot").setTextureName("batonBougieBot");
		batonBougieTop = new MhoBatonTop(cc.batonBougieTopID, 174, "Baton de bougie lumineux (haut)").setLightValue(1.0F).setUnlocalizedName("batonBougieTop").setTextureName("batonBougieTop");
		batonLanterneBot = new MhoBatonBot(cc.batonLanterneBotID, 191,"Baton de lanterne lumineux").setUnlocalizedName("batonLanterneBot").setTextureName("batonLanterneBot");
		batonLanterneTop = new MhoBatonTop(cc.batonLanterneTopID, 175, "Baton de lanterne lumineux (haut)").setLightValue(1.0F).setUnlocalizedName("batonLanterneTop").setTextureName("batonLanterneTop");

		darkStone = new MhoClassic(cc.darkStoneID, "Pierre sombre",false).setUnlocalizedName("darkStone").setTextureName("darkStone");
		darkCobblestone = new MhoClassic(cc.darkCobblestoneID, "Pierre fragmentee sombre",false).setUnlocalizedName("darkCobblestone").setTextureName("darkCobblestone");
		darkLeaves = new MhoClassic(cc.darkLeavesID, "Feuilles sombre",false).setUnlocalizedName("darkLeaves").setTextureName("darkLeaves");
		darkDirt = new MhoClassic(cc.darkDirtID, "Terre sombre",false).setUnlocalizedName("darkDirt").setTextureName("darkDirt");
		darkGrass = new GrassBuild(cc.darkGrassID, "Herbe sombre").setUnlocalizedName("darkGrass").setTextureName("dark").setCreativeTab(Mho.tabMhoBlocks);
		darkLog = new MhoLog(cc.darkLogID, "Bois sombre").setUnlocalizedName("darkLog").setTextureName("darkLog");

		ropeRail = new RopeRail(cc.ropeRailID,210,"Cordage").setUnlocalizedName("ropeRail").setTextureName("rope");

		/**Basalt**/
		basalt = new MhoClassic(cc.basaltID, "Basalt", true).setUnlocalizedName("basalt").setTextureName("basalt");
		basaltCobblestone = new MhoClassic(cc.basaltCobblestoneID, "Cobblestone de basalt", true).setUnlocalizedName("basaltCobblestone").setTextureName("basaltCobblestone");
		basaltBrick = new MhoClassic(cc.basaltBrickID, "Brique de basalt", true).setUnlocalizedName("basaltBrick").setTextureName("basaltBrick");

		/**Lumiere**/
		lumiereBougie = new MhoLumiere(cc.lumiereBougieID, 144, "Bougie").setLightValue(1.0F).setUnlocalizedName("lumiereBougie").setTextureName("lumiereBougie");
		lumiereLanterne = new MhoLumiere(cc.lumiereLanterneID, 145, "Lanterne").setLightValue(1.0F).setUnlocalizedName("lumiereLanterne").setTextureName("lumiereLanterne");
		lumiereSkull = new MhoLumiere(cc.lumiereSkullID, 146, "Bougie de crane").setLightValue(1.0F).setUnlocalizedName("lumiereSkull").setTextureName("lumiereSkull");
		lumiereSkullSimple = new MhoLumiere(cc.lumiereSkullSimpleID, 147, "Bougie simple de crane").setLightValue(1.0F).setUnlocalizedName("lumiereSkullSimple").setTextureName("lumiereSkullSimple");

		/**Potions**/
		celeritePotion = new PotionCelerite(cc.celeritePotionID, 0, false, "Potion de celerite").setUnlocalizedName("celeritePotion");
		fatiguePotion = new PotionFatigue(cc.fatiguePotionID, 0, false, "Potion de fatigue").setUnlocalizedName("fatiguePotion");
		sautPotion = new PotionSaut(cc.sautPotionID, 0, false, "Potion de saut").setUnlocalizedName("sautPotion");
		confusionPotion = new PotionConfusion(cc.confusionPotionID, 0, false, "Potion de confusion").setUnlocalizedName("confusionPotion");
		resistancePotion = new PotionResistance(cc.resistancePotionID, 0, false, "Potion de resistance").setUnlocalizedName("resistancePotion");
		apneePotion = new PotionApnee(cc.apneePotionID, 0, false, "Potion d apnee").setUnlocalizedName("apneePotion");
		cecitePotion = new PotionCecite(cc.cecitePotionID, 0, false, "Potion de cecite").setUnlocalizedName("cecitePotion");
		faimPotion = new PotionFaim(cc.faimPotionID, 0, false, "Potion de faim").setUnlocalizedName("faimPotion");
		witherPotion = new PotionWither(cc.witherPotionID, 0, false, "Potion de wither").setUnlocalizedName("witherPotion");

		/**Custom Potions**/
		customPotionWaterWalk = new PotionWaterWalk(cc.customPotionWaterWalkID, 0, false, "Potion de marche sur eau").setUnlocalizedName("customPotionWaterWalk");
		customPotionLavaWalk = new PotionLavaWalk(cc.customPotionLavaWalkID, 0, false, "Potion de marche sur lave").setUnlocalizedName("customPotionLavaWalk");
		customPotionNoFall = new PotionNoFall(cc.customPotionNoFallID, 0, false, "Potion de resistance a la chute").setUnlocalizedName("customPotionNoFall");

		/**Splash**/
		testSplash = new TestSplash(cc.testSplashID, "EnDev").setUnlocalizedName("testSplash");

		/**Coraux**/
		coralOrange = new CoralPlant(cc.coralOrangeID, "Corail orange").setUnlocalizedName("coralOrange").setTextureName("coralOrange").setLightValue(1.0F);
		coralGreen = new CoralBreath(cc.coralGreenID, "Corail vert").setUnlocalizedName("coralGreen").setTextureName("coralGreen");

		coralPurple = new CoralPlant(cc.coralPurpleID, "Corail violet").setUnlocalizedName("coralPurple").setTextureName("coralPurple").setLightValue(1.0F);
		coralRose = new CoralDamage(cc.coralRoseID, "Corail rose").setUnlocalizedName("coralRose").setTextureName("coralRose");

		coralBlack = new CoralBreath(cc.coralBlackID, "Corail noir").setUnlocalizedName("coralBlack").setTextureName("coralBlack");
		coralBlue = new CoralPlant(cc.coralBlueID, "Corail bleu").setUnlocalizedName("coralBlue").setTextureName("coralBlue");

		coralBlockReef = new CoralBlock(cc.coralBlockReefID, Material.grass, "Corail r\u00E9cif").setUnlocalizedName("coralBlockReef").setTextureName("coralBlockReef");
		coralBlockSponge = new CoralBlock(cc.coralBlockSpongeID, Material.grass, "Corail \u00E9ponge").setUnlocalizedName("coralBlockSponge").setTextureName("coralBlockSponge");

		//Blocks
		logCherry = new MhoLog(cc.logCherryID, "Bois de cerisier").setUnlocalizedName("logCherry").setTextureName("logCherry");
		logRed = new MhoLog(cc.logRedID, "Bois rouge").setUnlocalizedName("logRed").setTextureName("logRed");

		enseigneAlchimie = new Enseigne(cc.enseigneAlchimieID, 113, "Enseigne d'Alchimie").setUnlocalizedName("enseigneAlchimie").setTextureName("enseigneAlchimie");
		enseigneBanque = new Enseigne(cc.enseigneBanqueID, 114, "Enseigne de Banque").setUnlocalizedName("enseigneBanque").setTextureName("enseigneBanque");
		enseigneForge = new Enseigne(cc.enseigneForgeID, 115, "Enseigne de Forge").setUnlocalizedName("enseigneForge").setTextureName("enseigneForge");
		enseigneBouclier = new Enseigne(cc.enseigneBouclierID, 116, "Enseigne de Bouclier").setUnlocalizedName("enseigneBouclier").setTextureName("enseigneBouclier");
		enseigneSanctuaire = new Enseigne(cc.enseigneSanctuaireID, 117, "Enseigne de Sanctuaire").setUnlocalizedName("enseigneSanctuaire").setTextureName("enseigneSanctuaire");
		enseigneArmurerie = new Enseigne(cc.enseigneArmurerieID, 118, "Enseigne d'Armurerie").setUnlocalizedName("enseigneArmurerie").setTextureName("enseigneArmurerie");
		enseigneLibrairie = new Enseigne(cc.enseigneLibrairieID, 119, "Enseigne de Librairie").setUnlocalizedName("enseigneLibrairie").setTextureName("enseigneLibrairie");
		enseigneRestaurant = new Enseigne(cc.enseigneRestaurantID, 120, "Enseigne de Restaurant").setUnlocalizedName("enseigneRestaurant").setTextureName("enseigneRestaurant");
		enseigneTaverne = new Enseigne(cc.enseigneTaverneID, 121, "Enseigne de Taverne").setUnlocalizedName("enseigneTaverne").setTextureName("enseigneTaverne");
		enseigneMateriaux = new Enseigne(cc.enseigneMateriauxID, 122, "Enseigne de Materiaux").setUnlocalizedName("enseigneMateriaux").setTextureName("enseigneMateriaux");
		enseigneAuberge = new Enseigne(cc.enseigneAubergeID, 123, "Enseigne d'Auberge").setUnlocalizedName("enseigneAuberge").setTextureName("enseigneAuberge");
		enseigneEcurie = new Enseigne(cc.enseigneEcurieID, 124, "Enseigne d'Ecurie").setUnlocalizedName("enseigneEcurie").setTextureName("enseigneEcurie");
		enseigneDiamant = new Enseigne(cc.enseigneDiamantID, 125, "Enseigne de Diamant").setUnlocalizedName("enseigneDiamant").setTextureName("enseigneDiamant");
		enseignePho = new Enseigne(cc.enseignePhoID, 126, "Enseigne de PHO").setUnlocalizedName("enseignePho").setTextureName("enseignePho");
		enseigneCristal = new Enseigne(cc.enseigneCristalID, 127, "Enseigne de Cristal").setUnlocalizedName("enseigneCristal").setTextureName("enseigneCristal");

		bookBlock = new BookBlock(3279, 208, "Livre").setUnlocalizedName("bookBlock").setTextureName("bookBlock");

		/** Herbe haute **/
		highGrassSavanaBot = new GrassBot(cc.highGrassSavanaBotID, "Hautes herbes de savanne").setUnlocalizedName("highGrassSavanaBot").setTextureName("highGrassSavanaBot").setCreativeTab(tabMhoNature);
		highGrassSavanaTop = new GrassTop(cc.highGrassSavanaTopID, "Hautes herbe de savanne (haut)").setUnlocalizedName("highGrassSavanaTop").setTextureName("highGrassSavanaTop");

		portalPurple = new DragonPortal(cc.portalPurpleID, "Portail violet");
		
		metaWoolLight = new MetaWoolLight(cc.metaWoolLightID).setUnlocalizedName("wool_colored_light_");
		metaVitrail = new Vitraux(cc.metaVitrailID).setUnlocalizedName("vitrail_");
		metaVitrailPane = new VitrauxPane(cc.metaVitrailPaneID).setUnlocalizedName("vitrail_");

		/** Chain, ropes **/
		chainIron = new Chain(cc.chainIronID, "Chaine en fer").setUnlocalizedName("chain").setTextureName("chain");
		chainRope = new Rope (cc.chainRopeID, "Corde").setUnlocalizedName("rope").setTextureName("rope"); 

		/** Mysterious **/
		flowerMysterious = new MhoFlower(cc.flowerMysteriousID, "Fleur mysterieuse").setUnlocalizedName("flowerMysterious").setTextureName("flowerMysterious").setLightValue(0.2F).setCreativeTab(tabMhoNature);
		plantMysterious = new MhoFlower(cc.plantMysteriousID, "Plante mysterieuse").setUnlocalizedName("plantMysterious").setTextureName("plantMysterious").setLightValue(0.2F).setCreativeTab(tabMhoNature);
		coralMysterious = new CoralPlant(cc.coralMysteriousID, "Corail mysterieux").setUnlocalizedName("coralMysterious").setTextureName("coralMysterious").setLightValue(0.5F).setCreativeTab(tabMhoCoral);
		algueMysterious = new CoralPlant(cc.algueMysteriousID, "Algue mysterieuse").setUnlocalizedName("algueMysterious").setTextureName("algueMysterious").setLightValue(0.5F).setCreativeTab(tabMhoCoral);
		grassMysterious = new MhoFlower(cc.grassMysteriousID, "Herbe mysterieuse").setUnlocalizedName("grassMysterious").setTextureName("grassMysterious").setCreativeTab(tabMhoNature);
		logMysterious = new MhoLog(cc.logMysteriousID, "Buche mysterieuse").setUnlocalizedName("logMysterious").setTextureName("logMysterious").setCreativeTab(tabMhoNature);
		leavesMysterious = new MhoClassic(cc.leavesMysteriousID, "Feuilles mysterieuses", false).setUnlocalizedName("leavesMysterious").setTextureName("leavesMysterious").setCreativeTab(tabMhoNature);
		leaves2Mysterious = new MhoClassic(cc.leaves2MysteriousID, "Feuilles mysterieuses violettes", false).setUnlocalizedName("leaves2Mysterious").setTextureName("leaves2Mysterious").setCreativeTab(tabMhoNature).setLightValue(0.2F);
		stoneMysterious = new MhoClassic(cc.stoneMysteriousID, "Pierre mysterieuse", true).setUnlocalizedName("stoneMysterious").setTextureName("stoneMysterious").setCreativeTab(tabMhoNature).setStepSound(Block.soundStoneFootstep);
		dirtMysterious = new MhoClassic(cc.dirtMysteriousID, "Terre mysterieuse", true).setUnlocalizedName("dirtMysterious").setTextureName("dirtMysterious").setCreativeTab(tabMhoNature);
		grassBlockMysterious = new MhoGrassBlock(cc.grassBlockMysteriousID, 98, "Bloc d herbe mysterieuse").setUnlocalizedName("dirtMysteriousGrass").setTextureName("dirtMysterious").setCreativeTab(tabMhoNature).setStepSound(Block.soundGrassFootstep);
		sugarcaneMysterious = new MhoSugarCane(cc.sugarcaneMysteriousID, "Canne a sucre mysterieuse").setUnlocalizedName("sugarcaneMysterious").setTextureName("sugarcaneMysterious").setCreativeTab(tabMhoNature).setLightValue(0.2F);
		grass2Mysterious = new MhoFlower(cc.grass2MysteriousID, "Herbes mysterieuses").setUnlocalizedName("grass2Mysterious").setTextureName("grass2Mysterious").setCreativeTab(tabMhoNature);

		highGrassMagicBot = new GrassBot(cc.highGrassMagicBotID, "Hautes herbes mysterieuses").setUnlocalizedName("highGrassMagicBot").setTextureName("highGrassMagicBot").setCreativeTab(tabMhoNature);
		highGrassMagicTop = new GrassTop(cc.highGrassMagicTopID, "Hautes herbes mysterieuses (haut)").setUnlocalizedName("highGrassMagicTop").setTextureName("highGrassMagicTop").setLightValue(0.3F);

		/**Blocs glacee**/
		logGlacee = new MhoLog(cc.logGlaceeID, "Buche glac\u00E9e").setCreativeTab(tabMhoNature).setUnlocalizedName("logGlacee").setTextureName("logGlacee");
		leavesGlaceeClair = new MhoClassic(cc.leavesGlaceeClairID, "Feuilles claires glac\u00E9es", false).setUnlocalizedName("leavesGlaceeClair").setTextureName("leavesGlaceeClair").setCreativeTab(tabMhoNature);
		leavesGlacee = new MhoClassic(cc.leavesGlaceeID, "Feuilles glac\u00E9es", false).setUnlocalizedName("leavesGlacee").setTextureName("leavesGlacee").setCreativeTab(tabMhoNature);
		plankGlacee = new MhoClassic(cc.plankGlaceeID, "Planche glac\u00E9e", false).setUnlocalizedName("plankGlacee").setTextureName("plankGlacee").setCreativeTab(tabMhoNature);

		/** Tuiles **/
		tuileRed = new MhoClassic(cc.tuileRedID, "Petites tuiles rouges", true).setUnlocalizedName("tuileRed").setTextureName("tuileRed");
		tuileBlack = new MhoClassic(cc.tuileBlackID, "Petites tuiles noires", true).setUnlocalizedName("tuileBlack").setTextureName("tuileBlack");
		tuileBlue = new MhoClassic(cc.tuileBlueID, "Petites tuiles bleues", true).setUnlocalizedName("tuileBlue").setTextureName("tuileBlue");
		tuileRedBig = new MhoClassic(cc.tuileRedBigID, "Grandes tuiles rouges", true).setUnlocalizedName("tuileRedBig").setTextureName("tuileRedBig");
		tuileBlackBig = new MhoClassic(cc.tuileBlackBigID, "Grandes tuiles noires", true).setUnlocalizedName("tuileBlackBig").setTextureName("tuileBlackBig");
		tuileBlueBig = new MhoClassic(cc.tuileBlueBigID, "Grandes tuiles bleues", true).setUnlocalizedName("tuileBlueBig").setTextureName("tuileBlueBig");
		tuileBlackAlt = new MhoClassic(cc.tuileBlackAltID, "Petites tuiles noires dechaussees", true).setUnlocalizedName("tuileBlackAlt").setTextureName("tuileBlackAlt");

		/** New stairs **/
		stairStone = new StairBase(cc.stairStoneID, Block.stone, 0, "Escalier en roche");
		stairGrass = new StairBase(cc.stairGrassID, Block.grass, 0, "Escalier d'herbe");
		stairDirt = new StairBase(cc.stairDirtID, Block.dirt, 0, "Escalier en terre");
		stairGravel = new StairBase(cc.stairGravelID, Block.gravel, 0, "Escalier en gravier");
		stairMossyCobble = new StairBase(cc.stairMossyCobbleID, Block.cobblestoneMossy, 0, "Escalier en pierre moussue");
		stairObsidian = new StairBase(cc.stairObsidianID, Block.obsidian, 0, "Escalier d'obsidienne");
		stairIce = new StairBase(cc.stairIceID, Block.ice, 0, "Escalier de glace");
		stairSnow = new StairBase(cc.stairSnowID, Block.blockSnow, 0, "Escalier de neige");
		stairStonebrickMossy = new StairBase(cc.stairStonebrickMossyID, Block.stoneBrick, 1, "Escalier en stonebrick moussue");
		stairStonebrickCracked = new StairBase(cc.stairStonebrickCrackedID, Block.stoneBrick, 2, "Escalier en stonebrick fissuree");
		stairEnderstone = new StairBase(cc.stairEnderstoneID, Block.whiteStone, 0, "Escalier en pierre du neant");
		stairSand = new StairBase(cc.stairSandID, Block.sand, 0, "Escalier en pierre du neant");

		stairWoolWhite = new StairBase(cc.stairWoolWhiteID, Block.cloth, 0, "Escalier en laine blanche");
		stairWoolOrange = new StairBase(cc.stairWoolOrangeID, Block.cloth, 1, "Escalier en laine orange");
		stairWoolMagenta = new StairBase(cc.stairWoolMagentaID, Block.cloth, 2, "Escalier en laine magenta");
		stairWoolLightBlue = new StairBase(cc.stairWoolLightBlueID, Block.cloth, 3, "Escalier en laine bleu claire");
		stairWoolYellow = new StairBase(cc.stairWoolYellowID, Block.cloth, 4, "Escalier en laine jaune");
		stairWoolLightGreen = new StairBase(cc.stairWoolLightGreenID, Block.cloth, 5, "Escalier en laine verte claire");
		stairWoolPink = new StairBase(cc.stairWoolPinkID, Block.cloth, 6, "Escalier en laine rose");
		stairWoolGray = new StairBase(cc.stairWoolGrayID, Block.cloth, 7, "Escalier en laine grise");
		stairWoolLightGray = new StairBase(cc.stairWoolLightGrayID, Block.cloth, 8, "Escalier en laine grise claire");
		stairWoolCyan = new StairBase(cc.stairWoolCyanID, Block.cloth, 9, "Escalier en laine cyan");
		stairWoolPurple = new StairBase(cc.stairWoolPurpleID, Block.cloth, 10, "Escalier en laine violette");
		stairWoolBlue = new StairBase(cc.stairWoolBlueID, Block.cloth, 11, "Escalier en laine bleu");
		stairWoolBrown = new StairBase(cc.stairWoolBrownID, Block.cloth, 12, "Escalier en laine marron");
		stairWoolGreen = new StairBase(cc.stairWoolGreenID, Block.cloth, 13, "Escalier en laine verte");
		stairWoolRed = new StairBase(cc.stairWoolRedID, Block.cloth, 14, "Escalier en laine rouge");
		stairWoolBlack = new StairBase(cc.stairWoolBlackID, Block.cloth, 15, "Escalier en laine noire");

		stairWoolWhiteLight = new StairBase(cc.stairWoolWhiteLightID, Block.cloth, 0, "Escalier en laine blanche lumineuse").setLightValue(1.0F);
		stairWoolOrangeLight = new StairBase(cc.stairWoolOrangeLightID, Block.cloth, 1, "Escalier en laine orange lumineuse").setLightValue(1.0F);
		stairWoolMagentaLight = new StairBase(cc.stairWoolMagentaLightID, Block.cloth, 2, "Escalier en laine magenta lumineuse").setLightValue(1.0F);
		stairWoolLightBlueLight = new StairBase(cc.stairWoolLightBlueLightID, Block.cloth, 3, "Escalier en laine bleu claire lumineuse").setLightValue(1.0F);
		stairWoolYellowLight = new StairBase(cc.stairWoolYellowLightID, Block.cloth, 4, "Escalier en laine jaune lumineuse").setLightValue(1.0F);
		stairWoolLightGreenLight = new StairBase(cc.stairWoolLightGreenLightID, Block.cloth, 5, "Escalier en laine verte claire lumineuse").setLightValue(1.0F);
		stairWoolPinkLight = new StairBase(cc.stairWoolPinkLightID, Block.cloth, 6, "Escalier en laine rose lumineuse").setLightValue(1.0F);
		stairWoolGrayLight = new StairBase(cc.stairWoolGrayLightID, Block.cloth, 7, "Escalier en laine grise lumineuse").setLightValue(1.0F);
		stairWoolLightGrayLight = new StairBase(cc.stairWoolLightGrayLightID, Block.cloth, 8, "Escalier en laine grise claire lumineuse").setLightValue(1.0F);
		stairWoolCyanLight = new StairBase(cc.stairWoolCyanLightID, Block.cloth, 9, "Escalier en laine cyan lumineuse").setLightValue(1.0F);
		stairWoolPurpleLight = new StairBase(cc.stairWoolPurpleLightID, Block.cloth, 10, "Escalier en laine violette lumineuse").setLightValue(1.0F);
		stairWoolBlueLight = new StairBase(cc.stairWoolBlueLightID, Block.cloth, 11, "Escalier en laine bleu lumineuse").setLightValue(1.0F);
		stairWoolBrownLight = new StairBase(cc.stairWoolBrownLightID, Block.cloth, 12, "Escalier en laine marron lumineuse").setLightValue(1.0F);
		stairWoolGreenLight = new StairBase(cc.stairWoolGreenLightID, Block.cloth, 13, "Escalier en laine verte lumineuse").setLightValue(1.0F);
		stairWoolRedLight = new StairBase(cc.stairWoolRedLightID, Block.cloth, 14, "Escalier en laine rouge lumineuse").setLightValue(1.0F);
		stairWoolBlackLight = new StairBase(cc.stairWoolBlackLightID, Block.cloth, 15, "Escalier en laine noire lumineuse").setLightValue(1.0F);

		/** Lampions **/
		lampionBlanc = new Lampion(cc.lampionBlancID, "Lampion blanc").setUnlocalizedName("lampionBlanc").setTextureName("lampionBlanc").setStepSound(Block.soundClothFootstep);
		lampionBleu = new Lampion(cc.lampionBleuID, "Lampion bleu").setUnlocalizedName("lampionBleu").setTextureName("lampionBleu").setStepSound(Block.soundClothFootstep);
		lampionJaune = new Lampion(cc.lampionJauneID, "Lampion jaune").setUnlocalizedName("lampionJaune").setTextureName("lampionJaune").setStepSound(Block.soundClothFootstep);
		lampionVert = new Lampion(cc.lampionVertID, "Lampion vert").setUnlocalizedName("lampionVert").setTextureName("lampionVert").setStepSound(Block.soundClothFootstep);
		lampionRouge = new Lampion(cc.lampionRougeID, "Lampion rouge").setUnlocalizedName("lampionRouge").setTextureName("lampionRouge").setStepSound(Block.soundClothFootstep);

		/** White blocs **/
		whiteStone = new MhoClassic(cc.whiteStoneID, "Pierre blanche", true).setUnlocalizedName("whiteStone").setTextureName("whiteStone");
		whiteCobblestone = new MhoClassic(cc.whiteCobblestoneID, "Pierre blanche fragmente", true).setUnlocalizedName("whiteCobblestone").setTextureName("whiteCobblestone");
		whiteStonebrick = new MhoClassic(cc.whiteStonebrickID, "Brique en pierre blanche", true).setUnlocalizedName("whiteStonebrick").setTextureName("whiteStonebrick");
		whiteStonebrickRound = new MhoClassic(cc.whiteStonebrickRoundID, "Brique taillee en pierre blanche", true).setUnlocalizedName("whiteStonebrickRound").setTextureName("whiteStonebrickRound");
		whiteStoneDoubleSlab = new MhoDoubleSlab(cc.whiteStoneDoubleSlabID, "Dalle de pierre blanche").setUnlocalizedName("whiteStoneDoubleSlab").setTextureName("whiteStone");
		whiteStoneColumn = new Column(cc.whiteColumnID, "Colonne blanche").setUnlocalizedName("whiteColumn").setTextureName("whiteStone");
		whiteStoneColumnHead = new ColumnHead(cc.whiteColumnHeadID, "Chapeau de colonne blanche").setUnlocalizedName("whiteColumnHead").setTextureName("whiteStone");

		/** Stonebrick **/
		stonebrickColumn = new Column(cc.stonebrickColumnID, "Colonne en stonebrick").setUnlocalizedName("stonebrickColumn").setTextureName("stonebrick");
		stonebrickColumnHead = new ColumnHead(cc.stonebrickColumnHeadID , "Chapeau de colonne en stonebrick").setUnlocalizedName("stonebrickColumnHead").setTextureName("stonebrick");
		stepStonebrickColumn = new StepMho(cc.stepStonebrickColumnID, Mho.stonebrickColumn, "Demi-dalle de colonne en stonebrick");
		stepStonebrickColumnHead = new StepMho(cc.stepStonebrickColumnHeadID, Mho.stonebrickColumnHead, "Demi-dalle de chapeau de colonne en stonebrick");

		/** Ice blocks **/
		iceCobblestone = new MhoClassic(cc.iceCobblestoneID, "Glace fragmentee", true).setStepSound(Block.soundGlassFootstep).setUnlocalizedName("iceCobblestone").setTextureName("iceCobblestone");
		icebrick = new MhoClassic(cc.iceStonebrickID, "Briques de glace", true).setStepSound(Block.soundGlassFootstep).setUnlocalizedName("iceStonebrick").setTextureName("iceStonebrick");
		icebrickRound = new MhoClassic(cc.iceStonebrickRoundID, "Brique taillee de glace", true).setStepSound(Block.soundGlassFootstep).setUnlocalizedName("iceStonebrickRound").setTextureName("iceStonebrickRound");
		iceDoubleSlab = new MhoDoubleSlab(cc.iceDoubleSlabID, "Dalle de glace").setStepSound(Block.soundGlassFootstep).setUnlocalizedName("iceDoubleSlab").setTextureName("ice");
		iceColumn = new Column(cc.iceColumnID, "Colonne de glace").setStepSound(Block.soundGlassFootstep).setUnlocalizedName("iceColumn").setTextureName("ice");
		iceColumnHead = new ColumnHead(cc.iceColumnHeadID, "Chapeau de colonne de glace").setStepSound(Block.soundGlassFootstep).setUnlocalizedName("iceColumnHead").setTextureName("ice");

		/** Sandstone new **/
		sandstoneStonebrick = new MhoClassic(cc.sandstoneStonebrickID, "Brique de sandstone", true).setUnlocalizedName("sandstoneStonebrick").setTextureName("sandstoneStonebrick");
		sandstoneStonebrickRound = new MhoClassic(cc.sandstoneStonebrickRoundID, "Brique de sandstone taillee", true).setUnlocalizedName("sandstoneStonebrickRound").setTextureName("sandstoneStonebrickRound");
		sandstoneDoubleSlab = new MhoDoubleSlab(cc.sandstoneDoubleSlabID, "Dalle en sandstone").setUnlocalizedName("sandstoneDoubleSlab").setTextureName("sandstone");
		sandstoneColumn = new Column(cc.sandstoneColumnID, "Colonne en sandstone").setUnlocalizedName("sandstoneColumn").setTextureName("sandstone");
		sandstoneColumnHead = new ColumnHead(cc.sandstoneColumnHeadID, "Chapeau de colonne en sandstone").setUnlocalizedName("sandstoneColumnHead").setTextureName("sandstone");

		/** Black Marble **/
		marbleBlackCobblestone = new MhoClassic(cc.marbleBlackCobblestoneID, "Marbre noir fragmente", true).setUnlocalizedName("marbleBlackCobblestone").setTextureName("marbleBlackCobblestone");
		marbleBlackStone = new MhoClassic(cc.marbleBlackStoneID, "Marbre noir", true).setUnlocalizedName("marbleBlackStone").setTextureName("marbleBlackStone");
		marbleBlackStonebrick = new MhoClassic(cc.marbleBlackStonebrickID, "Brique de marbre noir", true).setUnlocalizedName("marbleBlackStonebrick").setTextureName("marbleBlackStonebrick");
		marbleBlackStonebrickRound = new MhoClassic(cc.marbleBlackStonebrickRoundID, "Brique taille de marbre noir", true).setUnlocalizedName("marbleBlackStonebrickRound").setTextureName("marbleBlackStonebrickRound");
		marbleBlackDoubleSlab = new MhoDoubleSlab(cc.marbleBlackDoubleSlabID, "Dalle de marbre noir").setUnlocalizedName("marbleBlackDoubleSlab").setTextureName("marbleBlack");
		marbleBlackColumn = new Column(cc.marbleBlackColumnID, "Colonne de marbre noir").setUnlocalizedName("marbleBlackColumn").setTextureName("marbleBlack");
		marbleBlackColumnHead = new ColumnHead(cc.marbleBlackColumnHeadID, "Chapeau de colonne de marbre noir").setUnlocalizedName("marbleBlackColumnHead").setTextureName("marbleBlack");

		marbleDamier = new MhoClassic(cc.marbleDamierID, "Damier de marbre", true).setUnlocalizedName("marbleDamier").setTextureName("marbleDamier");

		/** Ancient stone **/
		ancientCobblestone = new MhoClassic(cc.ancientCobblestoneID, "Pierre ancienne fragmente", true).setUnlocalizedName("ancientCobblestone").setTextureName("ancientCobblestone");
		ancientStone = new MhoClassic(cc.ancientStoneID, "Pierre ancienne", true).setUnlocalizedName("ancientStone").setTextureName("ancientStone");
		ancientStonebrick = new MhoClassic(cc.ancientStonebrickID, "Brique en pierre ancienne", true).setUnlocalizedName("ancientStonebrick").setTextureName("ancientStonebrick");
		ancientStonebrickRound = new MhoClassic(cc.ancientStonebrickRoundID, "Brique taillee en pierre ancienne", true).setUnlocalizedName("ancientStonebrickRound").setTextureName("ancientStonebrickRound");
		ancientDoubleSlab = new MhoDoubleSlab(cc.ancientDoubleSlabID, "Dalle en pierre ancienne").setUnlocalizedName("ancientDoubleSlab").setTextureName("ancient");
		ancientColumn = new Column(cc.ancientColumnID, "Colonne en pierre ancienne").setUnlocalizedName("ancientColumn").setTextureName("ancient");
		ancientColumnHead = new ColumnHead(cc.ancientColumnHeadID, "Chapeau de colonne en pierre ancienne").setUnlocalizedName("ancientColumnHead").setTextureName("ancient");

		/** White Marble **/
		marbleWhiteCobblestone = new MhoClassic(cc.marbleWhiteCobblestoneID, "Marbre blanc fragmente", true).setUnlocalizedName("marbleWhiteCobblestone").setTextureName("marbleWhiteCobblestone");
		marbleWhiteStone = new MhoClassic(cc.marbleWhiteStoneID, "Marbre blanc", true).setUnlocalizedName("marbleWhiteStone").setTextureName("marbleWhiteStone");
		marbleWhiteStonebrick = new MhoClassic(cc.marbleWhiteStonebrickID, "Brique de marbre blanc", true).setUnlocalizedName("marbleWhiteStonebrick").setTextureName("marbleWhiteStonebrick");
		marbleWhiteStonebrickRound= new MhoClassic(cc.marbleWhiteStonebrickRoundID, "Brique taillee de marbre blanc", true).setUnlocalizedName("marbleWhiteStonebrickRound").setTextureName("marbleWhiteStonebrickRound");
		marbleWhiteDoubleSlab = new MhoDoubleSlab(cc.marbleWhiteDoubleSlabID, "Dalle de marbre blanc").setUnlocalizedName("marbleWhiteDoubleSlab").setTextureName("marbleWhite");
		marbleWhiteColumn = new Column(cc.marbleWhiteColumnID, "Colonne de marbre blanc").setUnlocalizedName("marbleWhiteColumn").setTextureName("marbleWhite");
		marbleWhiteColumnHead = new ColumnHead(cc.marbleWhiteColumnHeadID, "Chapeau de colonne en marbre blanc").setUnlocalizedName("marbleWhiteColumnHead").setTextureName("marbleWhite");

		/** Wood **/
		woodenStone = new MhoClassic(cc.woodenStoneID, "Bois lisse", true).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("woodenStone").setTextureName("woodenStone");
		woodenStonebrick = new MhoClassic(cc.woodenStonebrickID, "Brique en bois lisse", true).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("woodenStonebrick").setTextureName("woodenStonebrick");
		woodenStonebrickRound = new MhoClassic(cc.woodenStonebrickRoundID, "Bois lisse taille", true).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("woodenStonebrickRound").setTextureName("woodenStonebrickRound");
		woodenDoubleSlab = new MhoDoubleSlab(cc.woodenDoubleSlabID, "Dalle en bois lisse").setStepSound(Block.soundWoodFootstep).setUnlocalizedName("woodenDoubleSlab").setTextureName("wooden");
		woodenColumn = new Column(cc.woodenColumnID, "Colonne en bois lisse").setStepSound(Block.soundWoodFootstep).setUnlocalizedName("woodenColumn").setTextureName("wooden");
		woodenColumnHead = new ColumnHead(cc.woodenColumnHeadID, "Chapeau de colonne en bois lisse").setStepSound(Block.soundWoodFootstep).setUnlocalizedName("woodenColumnHead").setTextureName("wooden");

		/** Wood light **/
		woodenLightStone = new MhoClassic(cc.woodenLightStoneID, "Bois clair lisse", true).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("woodenLightStone").setTextureName("woodenLightStone");
		woodenLightStonebrick = new MhoClassic(cc.woodenLightStonebrickID, "Brique de bois clair lisse", true).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("woodenLightStonebrick").setTextureName("woodenLightStonebrick");
		woodenLightStonebrickRound = new MhoClassic(cc.woodenLightStonebrickRoundID, "Bois clair lisse taille", true).setStepSound(Block.soundWoodFootstep).setUnlocalizedName("woodenLightStonebrickRound").setTextureName("woodenLightStonebrickRound");
		woodenLightDoubleSlab = new MhoDoubleSlab(cc.woodenLightDoubleSlabID, "Dalle de bois clair lisse").setStepSound(Block.soundWoodFootstep).setUnlocalizedName("woodenLightDoubleSlab").setTextureName("woodenLight");
		woodenLightColumn = new Column(cc.woodenLightColumnID, "Colonne en bois clair lisse").setStepSound(Block.soundWoodFootstep).setUnlocalizedName("woodenLightColumn").setTextureName("woodenLight");
		woodenLightColumnHead = new ColumnHead(cc.woodenLightColumnHeadID, "Chapeau de colonne en bois clair lisse").setStepSound(Block.soundWoodFootstep).setUnlocalizedName("woodenLightColumnHead").setTextureName("woodenLight");

		/** Metal **/
		metalGrid = new MhoClassic(cc.metalGridID, "Grille fine en acier", false).setUnlocalizedName("metalGrid").setStepSound(Block.soundMetalFootstep).setTextureName("metalGrid");
		metalStonebrick = new MhoClassic(cc.metalStonebrickID, "Damier en acier", true).setUnlocalizedName("metalStonebrick").setStepSound(Block.soundMetalFootstep).setTextureName("metalStonebrick");
		metalStonebrickRound = new MhoClassic(cc.metalStonebrickRoundID, "Acier taille", true).setUnlocalizedName("metalStonebrickRound").setStepSound(Block.soundMetalFootstep).setTextureName("metalStonebrickRound");
		metalDoubleSlab = new MhoDoubleSlab(cc.metalDoubleSlabID, "Dalle en acier").setUnlocalizedName("metalDoubleSlab").setStepSound(Block.soundMetalFootstep).setTextureName("metal");

		/** Bloc minerais **/
		//coalBlock = new MhoClassic(217, "Bloc de charbon", false).setUnlocalizedName("coalBlock").setTextureName("coalBlock");
		//redstoneBlock = new MhoClassic(218, "Bloc de redstone", true).setUnlocalizedName("redstoneBlock").setLightValue(0.5F).setStepSound(Block.soundStoneFootstep).setTextureName("redstoneBlock");
		obsidianBlock = new MhoClassic(cc.obsidianBlockID, "Bloc d'obsidienne cuite", false).setUnlocalizedName("obsidianBlock").setTextureName("obsidianBlock");
		shoji = new MhoClassic(cc.shojiID, "Mur en papier Shoji", true).setUnlocalizedName("shoji").setTextureName("shoji");

		/** Lumineux **/
		woodenLantern = new MhoClassic(cc.woodenLanternID, "Lanterne en bois", true).setLightValue(1.0F).setStepSound(Block.soundGlassFootstep).setUnlocalizedName("woodenLantern").setTextureName("woodenLantern");
		ironLantern = new MhoClassic(cc.ironLanternID, "Lanterne en fer", true).setLightValue(1.0F).setStepSound(Block.soundGlassFootstep).setUnlocalizedName("ironLantern").setTextureName("ironLantern");

		/** Autres **/
		//straw = new MhoClassic(229, "Paille", true).setUnlocalizedName("straw").setStepSound(Block.soundGrassFootstep).setTextureName("straw");
		PHOnoir = new MhoClassic(cc.PHOnoirID, "Pierre noire du PHO", true).setUnlocalizedName("phoNoir").setStepSound(Block.soundStoneFootstep).setTextureName("phoNoir");
		PHOblanc = new MhoClassic(cc.PHOblancID, "Pierre blanche du PHO", true).setUnlocalizedName("phoBlanc").setStepSound(Block.soundStoneFootstep).setTextureName("phoBlanc");
		woeBlock = new MhoClassic(cc.woeBlockID, "Bloc du War of Emperium", false).setUnlocalizedName("woeBlock").setLightValue(0.5F).setStepSound(Block.soundGlassFootstep).setTextureName("woeBlock");
		invisibleBlock = new InvisibleBlock(cc.invisibleBlockID, "Bloc invisible").setUnlocalizedName("invisible").setTextureName("invisible");
		pike1 = new Pike(cc.pikeID, "Pique").setUnlocalizedName("spike").setStepSound(Block.soundMetalFootstep).setTextureName("spike");
		crate = new MhoClassic(cc.crateID, "Caisse en bois", true).setUnlocalizedName("crate").setStepSound(Block.soundWoodFootstep).setTextureName("crate");
		tuileArdoise = new MhoClassic(cc.tuileArdoiseID, "Tuiles en ardoise", true).setUnlocalizedName("tuileArdoise").setTextureName("tuileArdoise");

		/** New slabs **/
		stepWoolWhite = new StepBase(cc.stepWoolWhiteID, Block.cloth, false, 0, "Demi-dalle en laine blanche").setStepSound(Block.soundClothFootstep);
		stepWoolOrange = new StepBase(cc.stepWoolOrangeID, Block.cloth, false, 1, "Demi-dalle de laine orange").setStepSound(Block.soundClothFootstep);
		stepWoolMagenta = new StepBase(cc.stepWoolMagentaID, Block.cloth, false, 2, "Demi-dalle de laine magenta").setStepSound(Block.soundClothFootstep);
		stepWoolLightBlue = new StepBase(cc.stepWoolLightBlueID, Block.cloth, false, 3, "Demi-dalle de laine bleu claire").setStepSound(Block.soundClothFootstep);
		stepWoolYellow = new StepBase(cc.stepWoolYellowID, Block.cloth, false, 4, "Demi-dalle de laine jaune").setStepSound(Block.soundClothFootstep);
		stepWoolLightGreen = new StepBase(cc.stepWoolLightGreenID, Block.cloth, false, 5, "Demi-dalle de laine verte claire").setStepSound(Block.soundClothFootstep);
		stepWoolPink = new StepBase(cc.stepWoolPinkID, Block.cloth, false, 6, "Demi-dalle en laine rose").setStepSound(Block.soundClothFootstep);
		stepWoolGray = new StepBase(cc.stepWoolGrayID, Block.cloth, false, 7, "Demi-dalle en laine grise").setStepSound(Block.soundClothFootstep);
		stepWoolLightGray = new StepBase(cc.stepWoolLightGrayID, Block.cloth, false, 8, "Demi-dalle en laine grise claire").setStepSound(Block.soundClothFootstep);
		stepWoolCyan = new StepBase(cc.stepWoolCyanID, Block.cloth, false, 9, "Demi-dalle en laine cyan").setStepSound(Block.soundClothFootstep);
		stepWoolPurple = new StepBase(cc.stepWoolPurpleID, Block.cloth, false, 10, "Demi-dalle en laine violette").setStepSound(Block.soundClothFootstep);
		stepWoolBlue = new StepBase(cc.stepWoolBlueID, Block.cloth, false, 11, "Demi-dalle en laine bleu").setStepSound(Block.soundClothFootstep);
		stepWoolBrown = new StepBase(cc.stepWoolBrownID, Block.cloth, false, 12, "Demi-dalle en laine marron").setStepSound(Block.soundClothFootstep);
		stepWoolGreen = new StepBase(cc.stepWoolGreenID, Block.cloth, false, 13, "Demi-dalle en laine verte").setStepSound(Block.soundClothFootstep);
		stepWoolRed = new StepBase(cc.stepWoolRedID, Block.cloth, false, 14, "Demi-dalle en laine rouge").setStepSound(Block.soundClothFootstep);
		stepWoolBlack = new StepBase(cc.stepWoolBlackID, Block.cloth, false, 15, "Demi-dalle en laine noire").setStepSound(Block.soundClothFootstep);

		stepWoolWhiteLight = new StepBase(cc.stepWoolWhiteLightID, Block.cloth, false, 0, "Demi-dalle en laine blanche lumineuse").setLightValue(1.0F).setStepSound(Block.soundClothFootstep);
		stepWoolOrangeLight = new StepBase(cc.stepWoolOrangeLightID, Block.cloth, false, 1, "Demi-dalle en laine orange lumineuse").setLightValue(1.0F).setStepSound(Block.soundClothFootstep);
		stepWoolMagentaLight = new StepBase(cc.stepWoolMagentaLightID, Block.cloth, false, 2, "Demi-dalle en laine magenta lumineuse").setLightValue(1.0F).setStepSound(Block.soundClothFootstep);
		stepWoolLightBlueLight = new StepBase(cc.stepWoolLightBlueLightID, Block.cloth, false, 3, "Demi-dalle en laine bleu claire lumineuse").setLightValue(1.0F).setStepSound(Block.soundClothFootstep);
		stepWoolYellowLight = new StepBase(cc.stepWoolYellowLightID, Block.cloth, false, 4, "Demi-dalle en laine jaune lumineuse").setLightValue(1.0F).setStepSound(Block.soundClothFootstep);
		stepWoolLightGreenLight = new StepBase(cc.stepWoolLightGreenLightID, Block.cloth, false, 5, "Demi-dalle en laine verte claire lumineuse").setLightValue(1.0F).setStepSound(Block.soundClothFootstep);
		stepWoolPinkLight = new StepBase(cc.stepWoolPinkLightID, Block.cloth, false, 6, "Demi-dalle en laine rose lumineuse").setLightValue(1.0F).setStepSound(Block.soundClothFootstep);
		stepWoolGrayLight = new StepBase(cc.stepWoolGrayLightID, Block.cloth, false, 7, "Demi-dalle en laine grise lumineuse").setLightValue(1.0F).setStepSound(Block.soundClothFootstep);
		stepWoolLightGrayLight = new StepBase(cc.stepWoolLightGrayLightID, Block.cloth, false, 8, "Demi-dalle en laine grise claire lumineuse").setLightValue(1.0F).setStepSound(Block.soundClothFootstep);
		stepWoolCyanLight = new StepBase(cc.stepWoolCyanLightID, Block.cloth, false, 9, "Demi-dalle en laine cyan lumineuse").setLightValue(1.0F).setStepSound(Block.soundClothFootstep);
		stepWoolPurpleLight = new StepBase(cc.stepWoolPurpleLightID, Block.cloth, false, 10, "Demi-dalle en laine violette lumineuse").setLightValue(1.0F).setStepSound(Block.soundClothFootstep);
		stepWoolBlueLight = new StepBase(cc.stepWoolBlueLightID, Block.cloth, false, 11, "Demi-dalle en laine bleu lumineuse").setLightValue(1.0F).setStepSound(Block.soundClothFootstep);
		stepWoolBrownLight = new StepBase(cc.stepWoolBrownLightID, Block.cloth, false, 12, "Demi-dalle en laine marron lumineuse").setLightValue(1.0F).setStepSound(Block.soundClothFootstep);
		stepWoolGreenLight = new StepBase(cc.stepWoolGreenLightID, Block.cloth, false, 13, "Demi-dalle en laine verte lumineuse").setLightValue(1.0F).setStepSound(Block.soundClothFootstep);
		stepWoolRedLight = new StepBase(cc.stepWoolRedLightID, Block.cloth, false, 14, "Demi-dalle en laine rouge lumineuse").setLightValue(1.0F).setStepSound(Block.soundClothFootstep);
		stepWoolBlackLight = new StepBase(cc.stepWoolBlackLightID, Block.cloth, false, 15, "Demi-dalle en laine noire lumineuse").setLightValue(1.0F).setStepSound(Block.soundClothFootstep);

		stepGrass = new StepBase(cc.stepGrassID, Block.grass, false, 0, "Demi-dalle d'herbe").setStepSound(Block.soundGrassFootstep);
		stepDirt = new StepBase(cc.stepDirtID, Block.dirt, false, 0, "Demi-dalle de terre").setStepSound(Block.soundGrassFootstep);
		stepGravel = new StepBase(cc.stepGravelID, Block.gravel, false, 0, "Demi-dalle de gravier").setStepSound(Block.soundGravelFootstep);
		stepWood1 = new StepBase(cc.stepWood1ID, Block.wood, false, 0, "Demi-dalle en chene").setStepSound(Block.soundWoodFootstep);
		stepWood2 = new StepBase(cc.stepWood2ID, Block.wood, false, 1, "Demi-dalle en pin").setStepSound(Block.soundWoodFootstep);
		stepWood3 = new StepBase(cc.stepWood3ID, Block.wood, false, 2, "Demi-dalle en bouleau").setStepSound(Block.soundWoodFootstep);
		stepWood4 = new StepBase(cc.stepWood4ID, Block.wood, false, 3, "Demi-dalle en bois de la jungle").setStepSound(Block.soundWoodFootstep);
		stepObsidian = new StepBase(cc.stepObsidianID, Block.obsidian, false, 0, "Demi-dalle en obsidienne");
		stepCobbleMossy = new StepBase(cc.stepCobbleMossyID, Block.cobblestoneMossy, false, 0, "Demi-dalle de pierre moussue");
		stepIce = new StepBase(cc.stepIceID, Block.ice, false, 0, "Demi-dalle de glace").setStepSound(Block.soundGlassFootstep);
		stepSnow = new StepBase(cc.stepSnowID, Block.blockSnow, false, 0, "Demi-dalle de neige").setStepSound(Block.soundSnowFootstep);
		stepStonebrickMossy = new StepBase(cc.stepStonebrickMossyID, Block.stoneBrick, false, 1, "Demi-dalle de stonebrick moussue");
		stepStonebrickCracked = new StepBase(cc.stepStonebrickCrackedID, Block.stoneBrick, false, 2, "Demi-dalle de stonebrick craquelee");
		stepNetherbrick = new StepBase(cc.stepNetherbrickID, Block.netherBrick, false, 0, "Demi-dalle de netherbrick");
		stepEnderstone = new StepBase(cc.stepEndstoneID, Block.whiteStone, false, 0, "Demi-dalle de pierre de l'end");
		stepSand = new StepBase(cc.stepSandID, Block.sand, false, 0, "Demi-dalle de sable").setStepSound(Block.soundSandFootstep);

		stepStraw = new StepMho(cc.stepStrawID, Block.hay, "Demi-dalle de paille").setStepSound(Block.soundGrassFootstep);
		stepLanternWood = new StepMho(cc.stepLanternWoodID, Mho.woodenLantern, "Demi-dalle de lanterne en bois").setLightValue(1.0F);
		stepLanternIron = new StepMho(cc.stepLanternIronID, Mho.ironLantern, "Demi-dalle de lanterne en fer").setLightValue(1.0F);

		//2980
		stepWhiteStone = new StepMho(cc.stepWhiteStoneID, Mho.whiteStone, "Demi-dalle de pierre blanche");
		stepWhiteCobblestone = new StepMho(cc.stepWhiteCobblestoneID, Mho.whiteCobblestone, "Demi-dalle de pierre blanche fragmente");
		stepWhiteStonebrick = new StepMho(cc.stepWhiteStonebrickID, Mho.whiteStonebrick, "Demi-dalle de brique blanche");
		stepWhiteDoubleSlab = new StepMho(cc.stepWhiteDoubleSlabID, Mho.whiteStoneDoubleSlab, "Demi-dalle de dalle blanche");
		stepWhiteColumn = new StepMho(cc.stepWhiteColumnID, Mho.whiteStoneColumn, "Demi-dalle de colonne blanche");
		stepWhiteColumnHead = new StepMho(cc.stepWhiteColumnHeadID, Mho.whiteStoneColumnHead, "Demi-dalle de chapeau de colonne blanche");

		//2970
		stepSandstoneDoubleSlab = new StepMho(cc.stepSandstoneDoubleSlabID, Mho.sandstoneDoubleSlab, "Demi-dalle de dalle de sandstone");
		stepSandstoneColumn = new StepMho(cc.stepSandstoneColumnID, Mho.sandstoneColumn, "Demi-dalle de colonne de sandstone");
		stepSandstoneColumnHead = new StepMho(cc.stepSandstoneColumnHeadID, Mho.sandstoneColumnHead, "Demi-dalle de chapeau de colonne de sandstone");
		stepSandstoneStonebrick = new StepMho(cc.stepSandstoneStonebrickID, Mho.sandstoneStonebrick, "Demi-dalle de brique de sandstone");

		//2930
		stepMarbleBlackCobblestone = new StepMho(cc.stepMarbleBlackCobblestoneID, Mho.marbleBlackCobblestone, "Demi-dalle de marbre noir fragmente");
		stepMarbleBlackStone = new StepMho(cc.stepMarbleBlackStoneID, Mho.marbleBlackStone, "Demi-dalle de marbre noir");
		stepMarbleBlackStonebrick = new StepMho(cc.stepMarbleBlackStonebrickID, Mho.marbleBlackStonebrick, "Demi-dalle de brique de marbre noir");
		stepMarbleBlackDoubleSlab = new StepMho(cc.stepMarbleBlackDoubleSlabID, Mho.marbleBlackDoubleSlab, "Demi-dalle de dalle de marbre noir");
		stepMarbleBlackColumn = new StepMho(cc.stepMarbleBlackColumnID, Mho.marbleBlackColumn, "Demi-dalle de colonne de marbre noir");
		stepMarbleBlackColumnHead = new StepMho(cc.stepMarbleBlackColumnHeadID, Mho.marbleBlackColumnHead, "Demi-dalle de chapeau de colonne de marbre noir");

		//2920
		stepAncientCobblestone = new StepMho(cc.stepAncientCobblestoneID, Mho.ancientCobblestone, "Demi-dalle de pierre ancienne fragmente");
		stepAncientStone = new StepMho(cc.stepAncientStoneID, Mho.ancientStone, "Demi-dalle de pierre ancienne");
		stepAncientStonebrick = new StepMho(cc.stepAncientStonebrickID, Mho.ancientStonebrick, "Demi-dalle de brique en pierre ancienne");
		stepAncientDoubleSlab = new StepMho(cc.stepAncientDoubleSlabID, Mho.ancientDoubleSlab, "Demi-dalle de dalle en pierre ancienne");
		stepAncientColumn = new StepMho(cc.stepAncientColumnID, Mho.ancientColumn, "Demi-dalle de colonne en pierre ancienne");
		stepAncientColumnHead = new StepMho(cc.stepAncientColumnHeadID, Mho.ancientColumnHead, "Demi-dalle de chapeau de colonne en pierre ancienne");

		//2910
		stepMarbleWhiteCobblestone = new StepMho(cc.stepMarbleWhiteCobblestoneID, Mho.marbleWhiteCobblestone, "Demi-dalle de marbre blanc fragmente");
		stepMarbleWhiteStone = new StepMho(cc.stepMarbleWhiteStoneID, Mho.marbleWhiteStone, "Demi-dalle de marbre blanc");
		stepMarbleWhiteStonebrick = new StepMho(cc.stepMarbleWhiteStonebrickID, Mho.marbleWhiteStonebrick, "Demi-dalle de brique de marbre blanc");
		stepMarbleWhiteDoubleSlab = new StepMho(cc.stepMarbleWhiteDoubleSlabID, Mho.marbleWhiteDoubleSlab, "Demi-dalle de dalle en marbre blanc");
		stepMarbleWhiteColumn = new StepMho(cc.stepMarbleWhiteColumnID, Mho.marbleWhiteColumn, "Demi-dalle de colonne en marbre blanc");
		stepMarbleWhiteColumnHead = new StepMho(cc.stepMarbleWhiteColumnHeadID, Mho.marbleWhiteColumnHead, "Demi-dalle de chapeau de colonne en marbre blanc");

		//2940
		stepWoodenStone = new StepMho(cc.stepWoodenStoneID, Mho.woodenStone, "Demi-dalle de bois lisse").setStepSound(Block.soundWoodFootstep);
		stepWoodenStonebrick = new StepMho(cc.stepWoodenStonebrickID, Mho.woodenStonebrick, "Demi-dalle de bois lisse taille").setStepSound(Block.soundWoodFootstep);
		stepWoodenDoubleSlab = new StepMho(cc.stepWoodenDoubleSlabID, Mho.woodenDoubleSlab, "Demi-dalle de dalle de bois lisse").setStepSound(Block.soundWoodFootstep);
		stepWoodenColumn = new StepMho(cc.stepWoodenColumnID, Mho.woodenColumn, "Demi-dalle de colonne en bois lisse").setStepSound(Block.soundWoodFootstep);
		stepWoodenColumnHead = new StepMho(cc.stepWoodenColumnHeadID, Mho.woodenColumnHead, "Demi-dalle de chapeau de colonne en bois lisse").setStepSound(Block.soundWoodFootstep);

		//2950
		stepWoodenLightStone = new StepMho(cc.stepWoodenLightStoneID, Mho.woodenLightStone, "Demi-dalle de bois clair lisse").setStepSound(Block.soundWoodFootstep);
		stepWoodenLightStonebrick = new StepMho(cc.stepWoodenLightStonebrickID, Mho.woodenLightStonebrick, "Demi-dalle de bois clair lisse taille").setStepSound(Block.soundWoodFootstep);
		stepWoodenLightDoubleSlab = new StepMho(cc.stepWoodenLightDoubleSlabID, Mho.woodenLightDoubleSlab, "Demi-dalle de dalle de bois clair lisse").setStepSound(Block.soundWoodFootstep);
		stepWoodenLightColumn = new StepMho(cc.stepWoodenLightColumnID, Mho.woodenLightColumn, "Demi-dalle de colonne de bois clair lisse").setStepSound(Block.soundWoodFootstep);
		stepWoodenLightColumnHead = new StepMho(cc.stepWoodenLightColumnHeadID, Mho.woodenLightColumnHead, "Demi-dalle de chapeau de colonne de bois clair lisse").setStepSound(Block.soundWoodFootstep);

		//2900
		stepIceCobblestone = new StepMho(cc.stepIceCobblestoneID, Mho.iceCobblestone, "Demi-dalle de glace fragmente").setStepSound(Block.soundGlassFootstep);
		stepIceStonebrick = new StepMho(cc.stepIceStonebrickID, Mho.icebrick, "Demi-dalle de briques de glace").setStepSound(Block.soundGlassFootstep);
		stepIceDoubleSlab = new StepMho(cc.stepIceDoubleSlabID, Mho.iceDoubleSlab, "Demi-dalle de dalle de glace").setStepSound(Block.soundGlassFootstep);
		stepIceColumn = new StepMho(cc.stepIceColumnID, Mho.iceColumn, "Demi-dalle de colonne de glace").setStepSound(Block.soundGlassFootstep);
		stepIceColumnHead = new StepMho(cc.stepIceColumnHeadID, Mho.iceColumnHead, "Demi-dalle de chapeau de colonne de glace").setStepSound(Block.soundGlassFootstep);

		//2960
		stepMarbleDamier = new StepMho(cc.stepMarbleDamierID, Mho.marbleDamier, "Demi-dalle de marbre en damier").setStepSound(Block.soundStoneFootstep);
		stepMetal = new StepMho(cc.stepMetalID, Mho.metalDoubleSlab, "Demi-dalle en acier").setStepSound(Block.soundMetalFootstep);

		/** Stair Mho **/
		stairStraw = new StairMho(cc.stairStrawID, Block.hay, 0, "Escalier en paille");

		stairMarbleDamier = new StairMho(cc.stairMarbleDamierID, Mho.marbleDamier, 0, "Escalier de marbre en damier");

		stairWhiteStone = new StairMho(cc.stairWhiteStoneID, Mho.whiteStone, 0, "Escalier en pierre blanche");
		stairWhiteCobblestone = new StairMho(cc.stairWhiteCobblestoneID, Mho.whiteCobblestone, 0, "Escalier en pierre blanche fragmente");
		stairWhiteStonebrick = new StairMho(cc.stairWhiteStonebrickID, Mho.whiteStonebrick, 0, "Escalier en brique de pierre blanche");

		stairAncientStone = new StairMho(cc.stairAncientStoneID, Mho.ancientStone, 0, "Escalier en pierre ancienne");
		stairAncientStonebrick = new StairMho(cc.stairAncientStonebrickID, Mho.ancientStonebrick, 0, "Escalier en brique de pierre ancienne");
		stairAncientCobblestone = new StairMho(cc.stairAncientCobblestoneID, Mho.ancientCobblestone, 0, "Escalier en pierre ancienne fragmente");

		stairMarbleWhiteStone = new StairMho(cc.stairMarbleWhiteStoneID, Mho.marbleWhiteStone, 0, "Escalier en marbre blanc");
		stairMarbleWhiteStonebrick = new StairMho(cc.stairMarbleWhiteStonebrickID, Mho.marbleWhiteStonebrick, 0, "Escalier en brique de marbre blanc");
		stairMarbleWhiteCobblestone = new StairMho(cc.stairMarbleWhiteCobblestoneID, Mho.marbleWhiteCobblestone, 0, "Escalier en marbre blanc fragmente");

		stairMarbleBlackStone = new StairMho(cc.stairMarbleBlackStoneID, Mho.marbleBlackStone, 0, "Escalier en marbre noir");
		stairMarbleBlackStonebrick = new StairMho(cc.stairMarbleBlackStonebrickID, Mho.marbleBlackStonebrick, 0, "Escalier en brique de marbre noir");
		stairMarbleBlackCobblestone = new StairMho(cc.stairMarbleBlackCobblestoneID, Mho.marbleBlackCobblestone, 0, "Escalier en marbre noir fragmente");

		stairIceStonebrick = new StairMho(cc.stairIceStonebrickID, Mho.icebrick, 0, "Escalier en brique de glace");
		stairIceCobblestone = new StairMho(cc.stairIceCobblestoneID, Mho.iceCobblestone, 0, "Escalier en glace fragmente");

		stairWoodenStone = new StairMho(cc.stairWoodenStoneID, Mho.woodenStone, 0, "Escalier en bois lisse");
		stairWoodenStonebrick = new StairMho(cc.stairWoodenStonebrickID, Mho.woodenStonebrick, 0, "Escalier en brique de bois lisse");

		stairWoodenLightStone = new StairMho(cc.stairWoodenLightStoneID, Mho.woodenLightStone, 0, "Escalier en bois clair lisse");
		stairWoodenLightStonebrick = new StairMho(cc.stairWoodenLightStonebrickID, Mho.woodenLightStonebrick, 0, "Escalier en brique de bois clair lisse");

		stairSandstoneStonebrick = new StairMho(cc.stairSandstoneStonebrickID, Mho.sandstoneStonebrick, 0, "Escalier en brique de sandstone");

		/** Stair tuiles **/
		stairTuileRed = new StairMho(cc.stairTuileRedID, Mho.tuileRed, 0, "Escalier de petites tuiles rouges");
		stairTuileBlack = new StairMho(cc.stairTuileBlackID, Mho.tuileBlack, 0, "Escalier de petites tuiles noires");
		stairTuileBlue = new StairMho(cc.stairTuileBlueID, Mho.tuileBlue, 0, "Escalier de petites tuiles bleues");
		stairTuileRedBig = new StairMho(cc.stairTuileRedBigID, Mho.tuileRedBig, 0, "Escalier de grandes tuiles rouges");
		stairTuileBlackBig = new StairMho(cc.stairTuileBlackBigID, Mho.tuileBlackBig, 0, "Escalier de grandes tuiles noires");
		stairTuileBlueBig = new StairMho(cc.stairTuileBlueBigID, Mho.tuileBlueBig, 0, "Escalier de grandes tuiles bleues");
		stairTuileBlackAlt = new StairMho(cc.stairTuileBlackAltID, Mho.tuileBlackAlt, 0, "Escalier de petites tuiles noires dechaussees");

		/** Step tuiles **/
		stepTuileRed = new StepMho(cc.stepTuileRedID, Mho.tuileRed, "Demi-dalle de tuile rouge");
		stepTuileBlue = new StepMho(cc.stepTuileBlueID, Mho.tuileBlue, "Demi-dalle de tuile bleu");
		stepTuileBlack = new StepMho(cc.stepTuileBlackID, Mho.tuileBlack, "Demi-dalle de tuile noire");
		stepTuileRedBig = new StepMho(cc.stepTuileRedBigID, Mho.tuileRedBig, "Demi-dalle de grande tuile rouge");
		stepTuileBlueBig = new StepMho(cc.stepTuileBlueBigID, Mho.tuileBlueBig, "Demi-dalle de grande tuile bleu");
		stepTuileBlackBig = new StepMho(cc.stepTuileBlackBigID, Mho.tuileBlackBig, "Demi-dalle de grande tuile noire");
		stepTuileBlackAlt = new StepMho(cc.stepTuileBlackAltID, Mho.tuileBlackAlt, "Demi-dalle de tuile noire dechaussee");

		/** New walls **/
		wallSandstone = new WallsBase(cc.wallSandstoneID, Block.sandStone, "Muret en sandstone");
		wallPlankOak = new WallsBase(cc.wallPlankOakID, Block.planks, "Muret en planche");
		wallBrick = new WallsBase(cc.wallBrickID, Block.brick, "Muret en brique");
		wallStonebrick = new WallsBase(cc.wallStonebrickID, Block.stoneBrick, "Muret en stonebrick");
		wallNetherbrick = new WallsBase(cc.wallNetherbrickID, Block.netherBrick, "Muret en netherbrick");
		wallWoodOak = new WallsBase(cc.wallWoodOakID, Block.wood, "Muret en bois (chene)");
		wallWoodFir = new WallsBase(cc.wallWoodFirID, Block.wood, "Muret en bois (sapin)");
		wallWoodBirch = new WallsBase(cc.wallWoodBirchID, Block.wood, "Muret en bois (bouleau)");
		wallWoodJungle = new WallsBase(cc.wallWoodJungleID, Block.wood, "Muret en bois (jungle)");

		wallWhiteStone = new WallsBuildMho(cc.wallWhiteStoneID, Mho.whiteStone, "Muret en pierre blanche");
		wallWhiteStonebrick = new WallsBuildMho(cc.wallWhiteStonebrickID, Mho.whiteStonebrick, "Muret en brique de pierre blanche");
		wallWhiteCobblestone = new WallsBuildMho(cc.wallWhiteCobblestoneID, Mho.whiteCobblestone, "Muret en pierre blanche fragmente");

		wallMarbleWhiteStone = new WallsBuildMho(cc.wallMarbleWhiteStoneID, Mho.marbleWhiteStone, "Muret en marbre blanc");
		wallMarbleWhiteStonebrick = new WallsBuildMho(cc.wallMarbleWhiteStonebrickID, Mho.marbleWhiteStonebrick, "Muret en brique de marbre blanc");
		wallMarbleWhiteCobblestone = new WallsBuildMho(cc.wallMarbleWhiteCobblestoneID, Mho.marbleWhiteCobblestone, "Muret en marbre blanc fragmente");

		wallMarbleBlackStone = new WallsBuildMho(cc.wallMarbleBlackStoneID, Mho.marbleBlackStone, "Muret en marbre noir");
		wallMarbleBlackStonebrick = new WallsBuildMho(cc.wallMarbleBlackStonebrickID, Mho.marbleBlackStonebrick, "Muret en brique de marbre noir");
		wallMarbleBlackCobblestone = new WallsBuildMho(cc.wallMarbleBlackCobblestoneID, Mho.marbleBlackCobblestone, "Muret en marbre noir fragmente");

		wallAncientStone = new WallsBuildMho(cc.wallAncientStoneID, Mho.ancientStone, "Muret en pierre ancienne");
		wallAncientStonebrick = new WallsBuildMho(cc.wallAncientStonebrickID, Mho.ancientStonebrick, "Muret en brique de pierre ancienne");
		wallAncientCobblestone = new WallsBuildMho(cc.wallAncientCobblestoneID, Mho.ancientCobblestone, "Muret en pierre ancienne fragmente");

		wallWoodenStone = new WallsBuildMho(cc.wallWoodenStoneID, Mho.woodenStone, "Muret en bois lisse");
		wallWoodenStonebrick = new WallsBuildMho(cc.wallWoodenStonebrickID, Mho.woodenStonebrick, "Muret en brique de bois lisse");

		wallWoodenLightStone = new WallsBuildMho(cc.wallWoodenLightStoneID, Mho.woodenLightStone, "Muret en bois clair lisse");
		wallWoodenLightStonebrick = new WallsBuildMho(cc.wallWoodenLightStonebrickID, Mho.woodenLightStonebrick, "Muret en brique de bois clair lisse");

		wallIceCobblestone = new WallsBuildMho(cc.wallIceCobblestoneID, Mho.iceCobblestone, "Muret en glace fragmente");
		wallIceStonebrick = new WallsBuildMho(cc.wallIceStonebrickID, Mho.icebrick, "Muret en briques de glace");

		/** Fence **/
		fenceWhiteStone = new MhoBuildFence(cc.fenceWhiteStoneID, Mho.whiteStone, "Barriere en pierre blanche");
		fenceWhiteStonebrick = new MhoBuildFence(cc.fenceWhiteStonebrickID, Mho.whiteStonebrick, "Barriere en pierre blanche taillee");
		fenceWhiteCobblestone = new MhoBuildFence(cc.fenceWhiteCobblestoneID, Mho.whiteCobblestone, "Barriere en pierre blanche fracturee");

		fenceMarbleWhiteStone = new MhoBuildFence(cc.fenceMarbleWhiteStoneID, Mho.marbleWhiteStone, "Barriere en marbre blanc");
		fenceMarbleWhiteStonebrick = new MhoBuildFence(cc.fenceMarbleWhiteStonebrickID, Mho.marbleWhiteStonebrick, "Barriere en marbre blanc taille");
		fenceMarbleWhiteCobblestone = new MhoBuildFence(cc.fenceMarbleWhiteCobblestoneID, Mho.marbleWhiteCobblestone, "Barriere en marbre blanc fracture");

		fenceMarbleBlackStone = new MhoBuildFence(cc.fenceMarbleBlackStoneID, Mho.marbleBlackStone, "Barriere en marbre noir");
		fenceMarbleBlackStonebrick = new MhoBuildFence(cc.fenceMarbleBlackStonebrickID, Mho.marbleBlackStonebrick, "Barriere en marbre noir taille");
		fenceMarbleBlackCobblestone = new MhoBuildFence(cc.fenceMarbleBlackCobblestoneID, Mho.marbleBlackCobblestone, "Barriere en marbre noir fracture");

		fenceAncientStone = new MhoBuildFence(cc.fenceAncientStoneID, Mho.ancientStone, "Barriere en pierre ancienne");
		fenceAncientStonebrick = new MhoBuildFence(cc.fenceAncientStonebrickID, Mho.ancientStonebrick, "Barriere en pierre ancienne taillee");
		fenceAncientCobblestone = new MhoBuildFence(cc.fenceAncientCobblestoneID, Mho.ancientCobblestone, "Barriere en pierre ancienne fracturee");

		fenceWoodenStone = new MhoBuildFence(cc.fenceWoodenStoneID, Mho.woodenStone, "Barriere en bois lisse");
		fenceWoodenStonebrick = new MhoBuildFence(cc.fenceWoodenStonebrickID, Mho.woodenStonebrick, "Barriere en bois lisse taille");

		fenceWoodenLightStone = new MhoBuildFence(cc.fenceWoodenLightStoneID, Mho.woodenLightStone, "Barriere en bois clair lisse");
		fenceWoodenLightStonebrick = new MhoBuildFence(cc.fenceWoodenLightStonebrickID, Mho.woodenLightStonebrick, "Barriere en bois clair lisse taille");

		fenceIceCobblestone = new MhoBuildFence(cc.fenceIceCobblestoneID, Mho.iceCobblestone, "Barriere en glace fracture");
		fenceIceStonebrick = new MhoBuildFence(cc.fenceIceStonebrickID, Mho.icebrick, "Barriere en glace taillee");

		/** Balustrades **/
		marbleWhiteAnvil = new CustomBuildAnvil(cc.marbleWhiteAnvilID, Mho.marbleWhiteStone, "Balustrade en marbre blanc").setUnlocalizedName("marbleWhiteAnvil").setStepSound(Block.soundStoneFootstep);
		marbleWhiteStonebrickAnvil = new CustomBuildAnvil(cc.marbleWhiteStonebrickAnvilID, Mho.marbleWhiteStonebrick, "Balustarde en brique de marbre blanc").setUnlocalizedName("marbleWhiteStonebrickAnvil").setStepSound(Block.soundStoneFootstep);
		marbleBlackAnvil = new CustomBuildAnvil(cc.marbleBlackAnvilID, Mho.marbleBlackStone, "Balustrade en marbre noir").setUnlocalizedName("marbleBlackAnvil").setStepSound(Block.soundStoneFootstep);
		marbleBlackStonebrickAnvil = new CustomBuildAnvil(cc.marbleBlackStonebrickAnvilID, Mho.marbleBlackStonebrick, "Balustrade en brique de marbre noir").setUnlocalizedName("marbleBlackStonebrickAnvil").setStepSound(Block.soundStoneFootstep);
		whiteStoneAnvil = new CustomBuildAnvil(cc.whiteStoneAnvilID, Mho.whiteStone, "Balustrade en pierre blanche").setUnlocalizedName("whiteStoneAnvil").setStepSound(Block.soundStoneFootstep);
		whiteStonebrickAnvil = new CustomBuildAnvil(cc.whiteStonebrickAnvilID, Mho.whiteStonebrick, "Balustrade en brique de pierre blanche").setUnlocalizedName("whiteStonebrickAnvil").setStepSound(Block.soundStoneFootstep);
		ancientStoneAnvil = new CustomBuildAnvil(cc.ancientStoneAnvilID, Mho.ancientStone, "Balustrade en pierre ancienne").setUnlocalizedName("ancientStoneAnvil").setStepSound(Block.soundStoneFootstep);
		ancientStonebrickAnvil = new CustomBuildAnvil(cc.ancientStonebrickAnvilID, Mho.ancientStonebrick, "Balustrade en brique de pierre ancienne").setUnlocalizedName("ancientStonebrickAnvil").setStepSound(Block.soundStoneFootstep);
		sandstoneStonebrickAnvil = new CustomBuildAnvil(cc.sandstoneStonebrickAnvilID, Mho.sandstoneStonebrick, "Balustrade en brique de sandstone").setUnlocalizedName("sandstoneStonebrickAnvil").setStepSound(Block.soundStoneFootstep);
		iceStonebrickAnvil = new CustomBuildAnvil(cc.iceStonebrickAnvilID, Mho.icebrick, "Balustrade en brique de glace").setUnlocalizedName("iceStonebrickAnvil").setStepSound(Block.soundGlassFootstep);

		woodenStoneAnvil = new CustomBuildAnvil(cc.woodenStoneAnvilID, Mho.woodenStone, "Balustrade en bois lisse").setUnlocalizedName("woodenStoneAnvil").setStepSound(Block.soundWoodFootstep);
		woodenStonebrickAnvil = new CustomBuildAnvil(cc.woodenStonebrickAnvilID, Mho.woodenStonebrick, "Balustrade en brique de bois lisse").setUnlocalizedName("woodenStonebrickAnvil").setStepSound(Block.soundWoodFootstep);

		logAnvil = new CustomAnvil(cc.logAnvilID, Block.wood, 0, "Balustrade en bois").setUnlocalizedName("logAnvil").setStepSound(Block.soundWoodFootstep);
		woodAnvil = new CustomAnvil(cc.woodAnvilID, Block.planks, 3, "Balustrade en bois normal").setUnlocalizedName("woodAnvil").setStepSound(Block.soundWoodFootstep);
		woodNormalAnvil = new CustomAnvil(cc.woodNormalAnvilID, Block.planks, 0, "Balustrade en bois blanc").setUnlocalizedName("woodNormalAnvil").setStepSound(Block.soundWoodFootstep);
		woodLightAnvil = new CustomAnvil(cc.woodLightAnvilID, Block.planks, 2, "Balustrade en bois brun").setUnlocalizedName("woodLightAnvil").setStepSound(Block.soundWoodFootstep);
		woodDarkAnvil = new CustomAnvil(cc.woodDarkAnvilID, Block.planks, 1, "Balustrade en bois fonce").setUnlocalizedName("woodDarkAnvil").setStepSound(Block.soundWoodFootstep);

		/** Red Rock **/
		//3260
		redGrass = new MhoClassic(cc.redGrassID, "Roche rouge herbeuse", true).setUnlocalizedName("redGrass").setTextureName("redGrass").setCreativeTab(Mho.tabMhoNature);
		redGravel = new MhoClassic(cc.redGravelID, "Gravier de pierre rouge", true).setCreativeTab(Mho.tabMhoNature).setUnlocalizedName("redGravel").setTextureName("redGravel");
		beigeRock = new BeigeLines(cc.beigeRockID, "Pierre beige").setUnlocalizedName("beigeRock").setTextureName("beigeRock");
		beigeLines = new BeigeLines(cc.beigeLinesID, "Strates beiges fines").setUnlocalizedName("beigeLines").setTextureName("beigeLines");
		redSilver = new MhoClassic(cc.redSilverID, "Minerai d argent rouge", true).setUnlocalizedName("redSilver").setTextureName("redSilver").setCreativeTab(Mho.tabMhoNature);
		silverBlock = new MhoClassic(cc.silverBlockID, "Bloc d argent de Reder", true).setUnlocalizedName("silverBlock").setTextureName("silverBlock");

		/** New rock **/
		//3270
		greyRock = new NewRockTopBot(cc.greyRockID, "Roche grise").setUnlocalizedName("greyRock").setTextureName("greyRock");
		greyRockGrass = new GrassRock(cc.greyRockGrassID, "Roche grise herbeuse").setUnlocalizedName("greyRockGrass").setTextureName("greyRock");
		brownRock = new NewRockTopBot(cc.brownRockID, "Roche brune").setUnlocalizedName("brownRock").setTextureName("brownRock");
		brownRockGrass = new GrassRock(cc.brownRockGrassID, "Roche brune herbeuse").setUnlocalizedName("brownRockGrass").setTextureName("brownRock");
		darkRock = new NewRockTopBot(cc.darkRockID, "Roche sombre").setUnlocalizedName("darkRock").setTextureName("darkRock");
		darkRockGrass = new GrassRock(cc.darkRockGrassID, "Roche sombre herbeuse").setUnlocalizedName("darkRockGrass").setTextureName("darkRock");
		blackRock = new NewRockTopBot(cc.blackRockID, "Roche noire").setUnlocalizedName("blackRock").setTextureName("blackRock");
		lavaRock = new NewRockTopBot(cc.lavaRockID, "Roche volcanique").setUnlocalizedName("lavaRock").setTextureName("lavaRock");
		lavaRockRed = new NewRockTopBot(cc.lavaRockRedID, "Roche volcanique rouge").setUnlocalizedName("lavaRockRed").setTextureName("lavaRockRed");

		/** Cristaux **/
		cristalBlock = new MhoClassic(cc.cristalBlockID, "Bloc de cristal", true).setUnlocalizedName("cristalBlock").setStepSound(Block.soundStoneFootstep).setTextureName("cristalBlock");
		cristalLittle = new Cristal(cc.cristalLittleID, "Petit cristal").setUnlocalizedName("cristalLittle").setTextureName("cristalLittle");
		cristalBig = new Cristal(cc.cristalBigID, "Grand cristal").setUnlocalizedName("cristalBig").setTextureName("cristalBig");

		/** Colombages **/
		colombageCarre = new Colombage(cc.colombageCarreID, 9, 0, "Colombage carre").setUnlocalizedName("colombageCarre").setTextureName("colombageCarre");
		colombageCroise = new Colombage(cc.colombageCroiseID, 10, 0, "Colombage croise").setUnlocalizedName("colombageCroise").setTextureName("colombageCroise");
		colombageVertical = new Colombage(cc.colombageVerticalID, 11, 0, "Colombage vertical").setUnlocalizedName("colombageVertical").setTextureName("colombageVertical");
		colombageHorizontal = new Colombage(cc.colombageHorizontalID, 12, 0, "Colombage horizontal").setUnlocalizedName("colombageHorizontal").setTextureName("colombageHorizontal");
		colombageGauche = new Colombage(cc.colombageGaucheID, 13, 0, "Colombage gauche").setUnlocalizedName("colombageGauche").setTextureName("colombageGauche");
		colombageDroite = new Colombage(cc.colombageDroiteID, 14, 0, "Colombage droite").setUnlocalizedName("colombageDroite").setTextureName("colombageDroite");

		fenetreFer = new MhoClassic(cc.fenetreFerID, "Fenetre en fer", false).setUnlocalizedName("fenetreFer").setTextureName("fenetreFer");
		fenetreFerPane = new PaneBuild(cc.fenetreFerPaneID, "fenetreFer", "Fenetre en fer plate").setUnlocalizedName("fenetreFerPane");

		colombageCarreFonce = new Colombage(cc.colombageCarreFonceID, 25, 0, "Colombage carre fonce").setUnlocalizedName("colombageCarreFonce").setTextureName("colombageCarreFonce");
		colombageCroiseFonce = new Colombage(cc.colombageCroiseFonceID, 26, 0, "Colombage croise fonce").setUnlocalizedName("colombageCroiseFonce").setTextureName("colombageCroiseFonce");
		colombageVerticalFonce = new Colombage(cc.colombageVerticalFonceID, 27, 0, "Colombage vertical fonce").setUnlocalizedName("colombageVerticalFonce").setTextureName("colombageVerticalFonce");
		colombageHorizontalFonce = new Colombage(cc.colombageHorizontalFonceID, 28, 0, "Colombage horizontal fonce").setUnlocalizedName("colombageHorizontalFonce").setTextureName("colombageHorizontalFonce");
		colombageGaucheFonce = new Colombage(cc.colombageGaucheFonceID, 29, 0, "Colombage gauche fonce").setUnlocalizedName("colombageGaucheFonce").setTextureName("colombageGaucheFonce");
		colombageDroiteFonce = new Colombage(cc.colombageDroiteFonceID, 30, 0, "Colombage droite fonce").setUnlocalizedName("colombageDroiteFonce").setTextureName("colombageDroiteFonce");

		/** Surface **/
		surfacePlankOak = new TapisBase(cc.surfacePlankOakID, Material.wood, "Surface en planches de chene").setUnlocalizedName("surfacePlankOak").setTextureName("planks_oak");
		//surfacePlankFir = new BaseSurface(cc.surfacePlankFirID;
		//surfacePlankBirch = new BaseSurface(cc.surfacePlankBirchID;
		//surfacePlankJungle = new BaseSurface(cc.surfacePlankJungleID;

		//surfaceGrass = new BaseSurface(cc.surfaceGrassID, Block.grass, "Surface en herbe");
		surfaceDirt = new TapisBase(cc.surfaceDirtID, Material.ground, "Surface en terre").setUnlocalizedName("surfaceDirt").setTextureName("dirt");
		surfaceGravel = new TapisBase(cc.surfaceGravelID, Material.ground, "Surface en gravier").setUnlocalizedName("surfaceGravel").setTextureName("gravel");
		surfaceStone = new TapisBase(cc.surfaceStoneID, Material.rock, "Surface en pierre").setUnlocalizedName("surfaceStone").setTextureName("stone");

		surfaceLogOak = new TapisBase(cc.surfaceLogOakID, Material.wood, "Surface en bois de chene").setUnlocalizedName("surfaceLogOak").setTextureName("log_oak_top");
		//surfaceLogFir = new BaseSurface(cc.surfaceLogFirID;
		//surfaceLogBirch = new BaseSurface(cc.surfaceLogBirchID;
		//surfaceLogJungle = new BaseSurface(cc.surfaceLogJungleID;

		surfaceStonebrick = new TapisBase(cc.surfaceStonebrickID, Material.rock, "Surface en stonebrick").setUnlocalizedName("surfaceStonebrick").setTextureName("stonebrick");

		/** Tapis **/
		tapisPlank = new TapisBase(cc.tapisPlankID, Material.wood, "Tapis en planche").setUnlocalizedName("oak_planks_carpet").setTextureName("planks_oak");
		tapisPlankDark = new TapisBase(cc.tapisPlankDarkID, Material.wood, "Tapis en planche sombre").setUnlocalizedName("spruce_planks_carpet").setTextureName("planks_spruce");
		tapisLog = new TapisBase(cc.tapisLogID, Material.wood, "Tapis en buche").setUnlocalizedName("oak_carpet").setTextureName("log_oak");
		tapisLogDark = new TapisBase(cc.tapisLogDarkID, Material.wood, "Tapis en buche sombre").setUnlocalizedName("spruce_carpet").setTextureName("log_spruce");

		/**Debut Code pour potion custom **/
		Potion[] potionTypes = null;

		for (Field f : Potion.class.getDeclaredFields()) 
		{
			f.setAccessible(true);
			try 
			{
				if (f.getName().equals("potionTypes")) {
					Field modfield = Field.class.getDeclaredField("modifiers");
					modfield.setAccessible(true);
					modfield.setInt(f, f.getModifiers() & ~Modifier.FINAL);
					potionTypes = (Potion[])f.get(null);
					final Potion[] newPotionTypes = new Potion[256];
					System.arraycopy(potionTypes, 0, newPotionTypes, 0, potionTypes.length);
					f.set(null, newPotionTypes);
				}
			}
			catch (Exception error) 
			{
				System.err.println("Erreur :");
				System.err.println(error);
			}
		}
		/** Fin Code pour potion custom **/
	}

	/**2**/		//Bloc mob, item ...
	@EventHandler
	public void load(FMLInitializationEvent event)
	{
		proxy.registerTextures();
		proxy.registerRenderEntity();
		proxy.initCustomRarityTypes();
		proxy.registerServerTickHandler();
		proxy.registerRenderInformation();
		proxy.initCapes(); 
		this.addAchievementLocalizations();
		GameRegistry.registerCraftingHandler(craftHandler);

		//////////////////////////////  REGISTER   //////////////////////////		
		/** Meta **/
		GameRegistry.registerBlock(Mho.metaVitrail, ItemVitraux.class,"Vitrail");
		GameRegistry.registerBlock(Mho.metaVitrailPane, ItemVitrauxPane.class,"Vitrail plat");
		GameRegistry.registerBlock(Mho.metaWoolLight, ItemWoolLight.class,"Laine lumineuse");

		/** No-meta **/

		///////////////////////////////  LANGUAGE   /////////////////////////

		/** Vitraux **/
		LanguageRegistry.addName(new ItemStack(Mho.metaVitrail,1,0), "Vitrail blanc");
		LanguageRegistry.addName(new ItemStack(Mho.metaVitrail,1,1), "Vitrail orange");
		LanguageRegistry.addName(new ItemStack(Mho.metaVitrail,1,2), "Vitrail magenta");
		LanguageRegistry.addName(new ItemStack(Mho.metaVitrail,1,3), "Vitrail bleu clair");
		LanguageRegistry.addName(new ItemStack(Mho.metaVitrail,1,4), "Vitrail jaune");
		LanguageRegistry.addName(new ItemStack(Mho.metaVitrail,1,5), "Vitrail vert");
		LanguageRegistry.addName(new ItemStack(Mho.metaVitrail,1,6), "Vitrail rose");
		LanguageRegistry.addName(new ItemStack(Mho.metaVitrail,1,7), "Vitrail gris fonce");
		LanguageRegistry.addName(new ItemStack(Mho.metaVitrail,1,8), "Vitrail gris");
		LanguageRegistry.addName(new ItemStack(Mho.metaVitrail,1,9), "Vitrail cyan");
		LanguageRegistry.addName(new ItemStack(Mho.metaVitrail,1,10), "Vitrail magenta");
		LanguageRegistry.addName(new ItemStack(Mho.metaVitrail,1,11), "Vitrail bleu");
		LanguageRegistry.addName(new ItemStack(Mho.metaVitrail,1,12), "Vitrail marron");
		LanguageRegistry.addName(new ItemStack(Mho.metaVitrail,1,13), "Vitrail vert fonce");
		LanguageRegistry.addName(new ItemStack(Mho.metaVitrail,1,14), "Vitrail rouge");
		LanguageRegistry.addName(new ItemStack(Mho.metaVitrail,1,15), "Vitrail noir");

		LanguageRegistry.addName(new ItemStack(Mho.metaVitrailPane,1,0), "Vitrail plat blanc");
		LanguageRegistry.addName(new ItemStack(Mho.metaVitrailPane,1,1), "Vitrail plat orange");
		LanguageRegistry.addName(new ItemStack(Mho.metaVitrailPane,1,2), "Vitrail plat magenta");
		LanguageRegistry.addName(new ItemStack(Mho.metaVitrailPane,1,3), "Vitrail plat bleu clair");
		LanguageRegistry.addName(new ItemStack(Mho.metaVitrailPane,1,4), "Vitrail plat jaune");
		LanguageRegistry.addName(new ItemStack(Mho.metaVitrailPane,1,5), "Vitrail plat vert");
		LanguageRegistry.addName(new ItemStack(Mho.metaVitrailPane,1,6), "Vitrail plat rose");
		LanguageRegistry.addName(new ItemStack(Mho.metaVitrailPane,1,7), "Vitrail plat gris fonce");
		LanguageRegistry.addName(new ItemStack(Mho.metaVitrailPane,1,8), "Vitrail plat gris");
		LanguageRegistry.addName(new ItemStack(Mho.metaVitrailPane,1,9), "Vitrail plat cyan");
		LanguageRegistry.addName(new ItemStack(Mho.metaVitrailPane,1,10), "Vitrail plat magenta");
		LanguageRegistry.addName(new ItemStack(Mho.metaVitrailPane,1,11), "Vitrail plat bleu");
		LanguageRegistry.addName(new ItemStack(Mho.metaVitrailPane,1,12), "Vitrail plat marron");
		LanguageRegistry.addName(new ItemStack(Mho.metaVitrailPane,1,13), "Vitrail plat vert fonce");
		LanguageRegistry.addName(new ItemStack(Mho.metaVitrailPane,1,14), "Vitrail plat rouge");
		LanguageRegistry.addName(new ItemStack(Mho.metaVitrailPane,1,15), "Vitrail plat noir");

		/** Lumineux **/
		for (int ix = 0; ix < 16; ix++) {
			LanguageRegistry.addName(new ItemStack(Mho.metaWoolLight,1,ix), metaWoolLightNames[ix]);
		}/*
		LanguageRegistry.addName(new ItemStack(Mho.metaWoolLight,1,0), "Laine lumineuse blanche");
		LanguageRegistry.addName(new ItemStack(Mho.metaWoolLight,1,1), "Laine lumineuse orange");
		LanguageRegistry.addName(new ItemStack(Mho.metaWoolLight,1,2), "Laine lumineuse magenta");
		LanguageRegistry.addName(new ItemStack(Mho.metaWoolLight,1,3), "Laine lumineuse bleu claire");
		LanguageRegistry.addName(new ItemStack(Mho.metaWoolLight,1,4), "Laine lumineuse jaune");
		LanguageRegistry.addName(new ItemStack(Mho.metaWoolLight,1,5), "Laine lumineuse verte");
		LanguageRegistry.addName(new ItemStack(Mho.metaWoolLight,1,6), "Laine lumineuse rose");
		LanguageRegistry.addName(new ItemStack(Mho.metaWoolLight,1,7), "Laine lumineuse grise fonce");
		LanguageRegistry.addName(new ItemStack(Mho.metaWoolLight,1,8), "Laine lumineuse grise");
		LanguageRegistry.addName(new ItemStack(Mho.metaWoolLight,1,9), "Laine lumineuse cyan");
		LanguageRegistry.addName(new ItemStack(Mho.metaWoolLight,1,10), "Laine lumineuse magenta");
		LanguageRegistry.addName(new ItemStack(Mho.metaWoolLight,1,11), "Laine lumineuse bleu");
		LanguageRegistry.addName(new ItemStack(Mho.metaWoolLight,1,12), "Laine lumineuse marron");
		LanguageRegistry.addName(new ItemStack(Mho.metaWoolLight,1,13), "Laine lumineuse vert fonce");
		LanguageRegistry.addName(new ItemStack(Mho.metaWoolLight,1,14), "Laine lumineuse rouge");
		LanguageRegistry.addName(new ItemStack(Mho.metaWoolLight,1,15), "Laine lumineuse noire");
*/
		/** Surfaces **/
		LanguageRegistry.addName(new ItemStack(Mho.surfacePlankOak), "Tapis en planches de chene");
		LanguageRegistry.addName(new ItemStack(Mho.surfaceDirt), "Tapis de merde");
		LanguageRegistry.addName(new ItemStack(Mho.surfaceGravel), "Tapis en gravier");
		LanguageRegistry.addName(new ItemStack(Mho.surfaceStone), "Tapis en pierre");
		LanguageRegistry.addName(new ItemStack(Mho.surfaceLogOak), "Tapis en bois de chene");
		LanguageRegistry.addName(new ItemStack(Mho.surfaceStonebrick), "Tapis en stonebrick");
		LanguageRegistry.addName(new ItemStack(Mho.tapisLog), "Tapis en buche");
		LanguageRegistry.addName(new ItemStack(Mho.tapisLogDark), "Tapis en buche sombre");
		LanguageRegistry.addName(new ItemStack(Mho.tapisPlank), "Tapis en planche");
		LanguageRegistry.addName(new ItemStack(Mho.tapisPlankDark), "Tapis en planche sombre");

		LanguageRegistry.addName(diamondIngot, "\u00C9clat de diamant");

		LanguageRegistry.addName(projectileNPCBlanc, "Projectile NPC Blanc");
		LanguageRegistry.addName(projectileNPCJaune, "Projectile NPC Jaune");
		LanguageRegistry.addName(projectileNPCVert, "Projectile NPC Vert");
		LanguageRegistry.addName(projectileNPCViolet, "Projectile NPC Violet");
		LanguageRegistry.addName(projectileNPCRouge, "Projectile NPC Rouge");
		LanguageRegistry.addName(projectileNPCGris, "Projectile NPC Gris");
		LanguageRegistry.addName(projectileNPCBleu, "Projectile NPC Bleu");

		LanguageRegistry.addName(batWing, "Aile de chauve-souris");
		LanguageRegistry.addName(bigcatHair, "Criniere feline");
		LanguageRegistry.addName(boarHorn, "Defense de sanglier");
		LanguageRegistry.addName(bugWing, "Aile d'insecte");
		LanguageRegistry.addName(cricketLeg, "Patte de criquet");
		LanguageRegistry.addName(deerWood, "Bois de cerf");
		LanguageRegistry.addName(duckLeg, "Patte de canard");
		LanguageRegistry.addName(ectoplasm, "Ectoplasme");
		LanguageRegistry.addName(elephantSkin, "Peau d'elephant");
		LanguageRegistry.addName(enderJaw, "Machoire d'Enderman");
		LanguageRegistry.addName(enderParticles, "Particules d'enderman");
		LanguageRegistry.addName(foxTail, "Queue de renard");
		LanguageRegistry.addName(ghastTentacle, "Tentacule de ghast");
		LanguageRegistry.addName(goatHorn, "Corne de chevre");
		LanguageRegistry.addName(honeyPot, "Pot de miel");
		LanguageRegistry.addName(horseHair, "Crin de cheval");
		LanguageRegistry.addName(jellyJam, "Confiture de meduse");
		LanguageRegistry.addName(mouseMustache, "Moustache de souris");
		LanguageRegistry.addName(ostrichFeather, "Plume d'autruche");
		LanguageRegistry.addName(pigLeg, "Pied de porc");
		LanguageRegistry.addName(rabbitFoot, "Patte de lapin");
		LanguageRegistry.addName(redFabric, "Bout de tissu rouge");
		LanguageRegistry.addName(reptileTooth, "Dent de reptile");
		LanguageRegistry.addName(scorpionSting, "Dard de scorpion");
		LanguageRegistry.addName(sharkFin, "Aileron de requin");
		LanguageRegistry.addName(skinCreeper, "Lambeau de Creeper");
		LanguageRegistry.addName(smallFlame, "Flammeche");
		LanguageRegistry.addName(snailShell, "Coquille d'escargot");
		LanguageRegistry.addName(snakeTongue, "Langue de vipere");
		LanguageRegistry.addName(spiderLegs, "Pattes d araignee");
		LanguageRegistry.addName(spiderVenom, "Glande a venin");
		LanguageRegistry.addName(turtleShell, "Carapace de tortue");
		LanguageRegistry.addName(whiteCloth, "Drap blanc");

		LanguageRegistry.addName(cartes, "Cartes de jeu");

		LanguageRegistry.addName(dollBlue, "Poupee bleu");
		LanguageRegistry.addName(dollBlack, "Poupee noire");
		LanguageRegistry.addName(pelucheMisterxfr, "Peluche MisterXFr");
		LanguageRegistry.addName(pelucheJolirouge, "Peluche Jolirouge");
		LanguageRegistry.addName(pelucheIplay, "Peluche Iplay4You");
		LanguageRegistry.addName(pelucheMikefraise, "Peluche MikeFraise");
		LanguageRegistry.addName(pelucheDeez, "Peluche Deez");
		LanguageRegistry.addName(pelucheNicodelpra, "Peluche Nicodelpra");
		LanguageRegistry.addName(pelucheDilandaufr, "Peluche DilandauFr");
		LanguageRegistry.addName(pelucheNissan, "Peluche Nissan8");
		LanguageRegistry.addName(pelucheBbphok, "Peluche BBphok");
		LanguageRegistry.addName(pelucheBendito, "Peluche Bendito78");
		LanguageRegistry.addName(pelucheSoenguy, "Peluche SoEnguy");
		LanguageRegistry.addName(pelucheChtimarchos, "Peluche Chtimarchos");
		LanguageRegistry.addName(pelucheXdakota, "Peluche xDakota");
		LanguageRegistry.addName(pelucheLoupfeucg, "Peluche Loupfeucg");
		LanguageRegistry.addName(pelucheTedrak, "Peluche Tedrak50");

		LanguageRegistry.addName(minorValysScroll, "Parchemin de teleportation mineur (Valys)");
		LanguageRegistry.addName(mediumValysScroll, "Parchemin de teleportation moyen (Valys)");
		LanguageRegistry.addName(majorValysScroll, "Parchemin de teleportation majeur (Valys)");

		LanguageRegistry.addName(nezarilJar, "Urne de Nezaril (vide)");
		LanguageRegistry.addName(nezarilJarFull, "Urne de Nezaril (pleine)");
		LanguageRegistry.addName(redDragonEgg, "Oeuf de dragon rouge");

		LanguageRegistry.addName(boulon, "Boulon");
		LanguageRegistry.addName(briqueDeSable, "Brique de sable");
		LanguageRegistry.addName(buchette, "Buchette");
		LanguageRegistry.addName(buchetteSombre, "Buchette sombre");
		LanguageRegistry.addName(caisse, "Caisse d\u0027armure du vaillant");
		LanguageRegistry.addName(liquideBleu, "Liquide bleu");
		LanguageRegistry.addName(liquideCyan, "Liquide cyan");
		LanguageRegistry.addName(liquideJaune, "Liquide jaune");
		LanguageRegistry.addName(liquideOrange, "Liquide orange");
		LanguageRegistry.addName(liquideRose, "Liquide rose");
		LanguageRegistry.addName(liquideRouge, "Liquide rouge");
		LanguageRegistry.addName(liquideVert, "Liquide vert");
		LanguageRegistry.addName(liquideViolet, "Liquide violet");
		LanguageRegistry.addName(tuyau, "Tuyau");
		LanguageRegistry.addName(vis, "Vis");
		LanguageRegistry.addName(couponTuto, "Coupon tutoriel");
		LanguageRegistry.addName(bandage, "Bandage");
		LanguageRegistry.addName(sceptreOr, "Sceptre d\u0027or");
		LanguageRegistry.addName(epeeBlanche, "Relique");
		LanguageRegistry.addName(sucreries, "Sucreries");
		LanguageRegistry.addName(grimoireSeth, "Grimoire de Seth");
		LanguageRegistry.addName(totemMage, "Totem de Mage");
		LanguageRegistry.addName(grimoireTelgarad, "Grimoire de Tel\u0027garad");
		LanguageRegistry.addName(grimoireTelsalor, "Grimoire de Tel\u0027salor");
		LanguageRegistry.addName(recommandationHakath, "Recommandation d\u0027Hakath");
		LanguageRegistry.addName(recommandationLomakoth, "Recommandation de Lomakoth");
		LanguageRegistry.addName(pistolet, "Pistolet");
		LanguageRegistry.addName(jambeBois, "Jambe de bois");
		LanguageRegistry.addName(medaillon, "Medaillon de pirate");
		LanguageRegistry.addName(longuevue, "Longue-vue");
		LanguageRegistry.addName(clePrisonValys, "Clef de la prison de Valys");
		LanguageRegistry.addName(boursePetite, "Petite bourse de Hardcoin");
		LanguageRegistry.addName(bourseMoyenne, "Moyenne bourse de Hardcoin");
		LanguageRegistry.addName(bourseGrande, "Grande bourse de Hardcoin");
		LanguageRegistry.addName(grimoireApprenti, "Grimore de l\u0027apprenti");
		LanguageRegistry.addName(vanish, "Vanish");
		LanguageRegistry.addName(enveloppe, "Enveloppe");
		LanguageRegistry.addName(batonAdaoldan, "Baton d\u0027Adaoldan");
		LanguageRegistry.addName(batonAdaoldanEnchant, "Baton d\u0027Adaoldan enchant\u00E9");
		LanguageRegistry.addName(fragmentAdaoldan, "Fragment du baton d\u0027Adaoldan");
		LanguageRegistry.addName(projectileArcanique, "Projectile arcanique");
		LanguageRegistry.addName(marteauForgeron, "Marteau du forgeron");
		LanguageRegistry.addName(lameRuniqueEmeraude, "Lame runique en Emeraude");

		LanguageRegistry.addName(enchantSharpnessT1Small, "Petite rune de puissance mineure");
		LanguageRegistry.addName(enchantSharpnessT1Medium, "Petite rune de puissance");
		LanguageRegistry.addName(enchantSharpnessT1Big, "Petite rune de puissance majeure");
		LanguageRegistry.addName(enchantSharpnessT2Small, "Rune de puissance mineure");
		LanguageRegistry.addName(enchantSharpnessT2Medium, "Rune de puissance");
		LanguageRegistry.addName(enchantSharpnessT2Big, "Rune de puissance majeure");
		LanguageRegistry.addName(enchantSharpnessT3Small, "Grande rune de puissance mineure");
		LanguageRegistry.addName(enchantSharpnessT3Medium, "Grande rune de puissance");
		LanguageRegistry.addName(enchantSharpnessT3Big, "Grande rune de puissance majeure");

		LanguageRegistry.addName(enchantSmiteT1Small, "Petite rune de chatiment mineure");
		LanguageRegistry.addName(enchantSmiteT1Medium, "Petite rune de chatiment");
		LanguageRegistry.addName(enchantSmiteT1Big , "Petite rune de chatiment majeure");
		LanguageRegistry.addName(enchantSmiteT2Small, "Rune de chatiment mineure");
		LanguageRegistry.addName(enchantSmiteT2Medium, "Rune de chatiment");
		LanguageRegistry.addName(enchantSmiteT2Big, "Rune de chatiment majeure");
		LanguageRegistry.addName(enchantSmiteT3Small, "Grande rune de chatiment mineure");
		LanguageRegistry.addName(enchantSmiteT3Medium, "Grande rune de chatiment");
		LanguageRegistry.addName(enchantSmiteT3Big, "Grande rune de chatiment majeure");

		LanguageRegistry.addName(enchantProtectionT1Small, "Petite rune de protection mineure");
		LanguageRegistry.addName(enchantProtectionT1Big, "Petite rune de protection majeure");
		LanguageRegistry.addName(enchantProtectionT2Small, "Rune de protection mineure");
		LanguageRegistry.addName(enchantProtectionT2Big, "Rune de protection majeure");
		LanguageRegistry.addName(enchantProtectionT3Small, "Grande rune de protection mineure");
		LanguageRegistry.addName(enchantProtectionT3Big, "Grande rune de protection majeure");

		LanguageRegistry.addName(enchantBaneofT1Small, "Petite rune du fleau mineure");
		LanguageRegistry.addName(enchantBaneofT1Medium, "Petite rune du fleau");
		LanguageRegistry.addName(enchantBaneofT1Big, "Petite rune du fleau majeure");
		LanguageRegistry.addName(enchantBaneofT2Small, "Rune du fleau mineure");
		LanguageRegistry.addName(enchantBaneofT2Medium, "Rune du fleau");
		LanguageRegistry.addName(enchantBaneofT2Big, "Rune du fleau majeure");
		LanguageRegistry.addName(enchantBaneofT3Small, "Grande rune du fleau mineure");
		LanguageRegistry.addName(enchantBaneofT3Medium, "Grande rune du fleau");
		LanguageRegistry.addName(enchantBaneofT3Big, "Grande rune du fleau majeure");

		LanguageRegistry.addName(enchantEfficacityT1Small, "Petite rune de rapidite mineure");
		LanguageRegistry.addName(enchantEfficacityT1Medium, "Petite rune de rapidite");
		LanguageRegistry.addName(enchantEfficacityT1Big, "Petite rune de rapidite majeure");
		LanguageRegistry.addName(enchantEfficacityT2Small, "Rune de rapidite mineure");
		LanguageRegistry.addName(enchantEfficacityT2Medium, "Rune de rapidite");
		LanguageRegistry.addName(enchantEfficacityT2Big, "Rune de rapidite majeure");
		LanguageRegistry.addName(enchantEfficacityT3Small, "Grande rune de rapidite mineure");
		LanguageRegistry.addName(enchantEfficacityT3Medium, "Grande rune de rapidite");
		LanguageRegistry.addName(enchantEfficacityT3Big, "Grande rune de rapidite majeure");

		LanguageRegistry.addName(enchantDurabilityT1Small, "Petite rune de solidite mineure");
		LanguageRegistry.addName(enchantDurabilityT1Medium, "Petite rune de solidite");
		LanguageRegistry.addName(enchantDurabilityT1Big, "Petite rune de solidite majeure");
		LanguageRegistry.addName(enchantDurabilityT2Small, "Rune de solidite mineure");
		LanguageRegistry.addName(enchantDurabilityT2Medium, "Rune de solidite");
		LanguageRegistry.addName(enchantDurabilityT2Big, "Rune de solidite majeure");
		LanguageRegistry.addName(enchantDurabilityT3Small, "Grande rune de solidite mineure");
		LanguageRegistry.addName(enchantDurabilityT3Medium, "Grande rune de solidite");
		LanguageRegistry.addName(enchantDurabilityT3Big, "Grande rune de solidite majeure");

		LanguageRegistry.addName(enchantFlameT1Small, "Petite rune d embrasement mineure");
		LanguageRegistry.addName(enchantFlameT1Big, "Petite rune d embrasement majeure");
		LanguageRegistry.addName(enchantFlameT2Small, "Rune d embrasement mineure");
		LanguageRegistry.addName(enchantFlameT2Big, "Rune d embrasement majeure");
		LanguageRegistry.addName(enchantFlameT3Small, "Grande rune d embrasement mineure");
		LanguageRegistry.addName(enchantFlameT3Big, "Grande rune d embrasement majeure");

		LanguageRegistry.addName(enchantKnockbackT1Small, "Petite rune de repulsion mineure");
		LanguageRegistry.addName(enchantKnockbackT1Big, "Petite rune de repulsion majeure");
		LanguageRegistry.addName(enchantKnockbackT2Small, "Rune de repulsion mineure");
		LanguageRegistry.addName(enchantKnockbackT2Big, "Rune de repulsion majeure");
		LanguageRegistry.addName(enchantKnockbackT3Small, "Grande rune de repulsion mineure");
		LanguageRegistry.addName(enchantKnockbackT3Big, "Grande rune de repulsion majeure");

		LanguageRegistry.addName(goldKey, "Cl\u00E9 de donjon d\u0027or");
		LanguageRegistry.addName(silverKey, "Cl\u00E9 de donjon d\u0027argent");
		LanguageRegistry.addName(bronzeKey, "Cl\u00E9 de donjon de bronze");
		LanguageRegistry.addName(goldSmallKey, "Cl\u00E9 d\u0027or");
		LanguageRegistry.addName(silverSmallKey, "Cl\u00E9 d\u0027argent");
		LanguageRegistry.addName(bronzeSmallKey, "Cl\u00E9 de bronze");
		
		LanguageRegistry.addName(bronzeCoin, "Hardcoin de bronze");
		LanguageRegistry.addName(silverCoin, "Hardcoin d\u0027argent");
		LanguageRegistry.addName(goldCoin, "Hardcoin d\u0027or");
		LanguageRegistry.addName(diamondCoin, "Hardcoin de diamand");

		LanguageRegistry.addName(trophyGold, "Trophee d\u0027or");
		LanguageRegistry.addName(trophySilver, "Trophee d\u0027argent");
		LanguageRegistry.addName(trophyBronze, "Trophee de bronze");
		LanguageRegistry.addName(trophyGoldChip, "Trophee d\u0027or \u00E9br\u00E9ch\u00E9");

		LanguageRegistry.addName(cacheOeil, "Cache Oeil");
		
		LanguageRegistry.addName(hamburgerFood, "Hamburger");
		LanguageRegistry.addName(fritesFood, "Frites");
		LanguageRegistry.addName(kfcFood, "Nuggets");
		LanguageRegistry.addName(oeufFood, "Oeufs");
		LanguageRegistry.addName(baconFood, "Bacon");
		LanguageRegistry.addName(fromageFood, "Fromage");
		LanguageRegistry.addName(makiFood, "Maki");
		LanguageRegistry.addName(sushiFood, "Sushi");
		LanguageRegistry.addName(brochetteFood, "Brochette");
		LanguageRegistry.addName(rhum, "Rhum");
		
		LanguageRegistry.addName(poeleSword, "Po\u00EAle \u00E0 frire");
		LanguageRegistry.addName(sceptreRouge, "Sceptre Rouge");
		LanguageRegistry.addName(sceptreBleu, "Sceptre Bleu");
		LanguageRegistry.addName(sceptreVert, "Sceptre Vert");
		LanguageRegistry.addName(marteauBois, "Marteau en bois");
		LanguageRegistry.addName(marteauPierre, "Marteau en pierre");
		LanguageRegistry.addName(marteauFer, "Marteau en fer");
		LanguageRegistry.addName(rapier, "Rapier");
		LanguageRegistry.addName(lameRunique, "Lame runique");
		
		LanguageRegistry.addName(chope, "Chope vide");
		LanguageRegistry.addName(beer, "Chope de bi\u00E8re");

		LanguageRegistry.addName(flowerMysterious, "Fleur mysterieuse");
		LanguageRegistry.addName(plantMysterious, "Plante mysterieuse");
		LanguageRegistry.addName(coralMysterious, "Corail mysterieux");
		LanguageRegistry.addName(algueMysterious, "Algue mysterieuse");
		LanguageRegistry.addName(grassMysterious, "Herbe mysterieuse");
		LanguageRegistry.addName(logMysterious, "Buche mysterieuse");
		LanguageRegistry.addName(leavesMysterious, "Feuilles mysterieuses");
		LanguageRegistry.addName(leaves2Mysterious, "Feuilles mysterieuses violettes");
		LanguageRegistry.addName(stoneMysterious, "Pierre mysterieuse");
		LanguageRegistry.addName(dirtMysterious, "Terre mysterieuse");
		LanguageRegistry.addName(grassBlockMysterious, "Bloc d'herbe mysterieuse");
		LanguageRegistry.addName(sugarcaneMysterious, "Canne a sucre mysterieuse");
		LanguageRegistry.addName(grass2Mysterious, "Herbes mysterieuses");

		LanguageRegistry.addName(highGrassMagicBot, "Hautes herbes mysterieuses");
		LanguageRegistry.addName(highGrassMagicTop, "Hautes herbes mysterieuses (haut)");

		LanguageRegistry.addName(pocketCraftingTable, "Table de craft portable");

		LanguageRegistry.addName(coeurLoot, "Coeur");
		LanguageRegistry.addName(cerveauLoot, "Cerveau de zombie");
		LanguageRegistry.addName(brasLoot, "Bras de zombie");
		LanguageRegistry.addName(poudreMagie, "Poudre de magie");
		
		LanguageRegistry.addName(valysInsignes, "Insigne de Valys");
		LanguageRegistry.addName(chasseInsignes, "Insigne de chasse");
		LanguageRegistry.addName(guerreInsignes, "Insigne de guerre");
		LanguageRegistry.addName(agricultureInsignes, "Insigne d\u0027agriculture");
		LanguageRegistry.addName(gastronomieInsignes, "Insigne de gastronomie");
		LanguageRegistry.addName(minageInsignes, "Insigne de minage");
		LanguageRegistry.addName(artisanatInsignes, "Insigne d\u0027artisanat");
		LanguageRegistry.addName(villeInsignes, "Insigne de ville");
		LanguageRegistry.addName(pecheInsignes, "Insigne de p\u00EAche");
		LanguageRegistry.addName(explorationInsignes, "Insigne d\u0027exploration");
		LanguageRegistry.addName(constructionInsignes, "Insigne de construction");
		LanguageRegistry.addName(guildeInsignes, "Insigne de guilde");
		LanguageRegistry.addName(victoireInsignes, "Insigne de victoire");
		LanguageRegistry.addName(participationInsignes, "Insigne de participation");
		LanguageRegistry.addName(magieInsignes, "Insigne de magie");
		
		LanguageRegistry.addName(nocturneLegendaire, "Baton nocturne");
		LanguageRegistry.addName(diurneLegendaire, "Baton du jour");
		LanguageRegistry.addName(teddyBear, "Ours en peluche");
		
		LanguageRegistry.addName(meatBlock, "Bloc de viande");
		LanguageRegistry.addName(leatherBlock, "Bloc de cuir");
		LanguageRegistry.addName(lavaBlock, "Bloc de lave");
		LanguageRegistry.addName(waterBlock, "Bloc d\u0027eau");
		LanguageRegistry.addName(tonneauBlock, "Tonneau");
		LanguageRegistry.addName(caisseVaillant, "Caisse du Vaillant");
		LanguageRegistry.addName(escaladeBlock, "Bloc d\u0027escalade");
		LanguageRegistry.addName(slimeBlock, "Bloc de slime");
		LanguageRegistry.addName(roseBlock, "Vignes de roses");
		LanguageRegistry.addName(cakeLieBlock, "Cake");
		LanguageRegistry.addName(meatCakeBlock, "Viande");
		LanguageRegistry.addName(simpleDirtBlock, "Terre classique");
		LanguageRegistry.addName(grisouBlock, "Bloc de grisou");
		LanguageRegistry.addName(fossileBlock, "Fossile");
		LanguageRegistry.addName(caisseBlock, "Caisse");
		LanguageRegistry.addName(bucheCompleteBlock, "Buche complete");
		LanguageRegistry.addName(bucheFonceCompleteBlock, "Buche fonce complete");
		
		LanguageRegistry.addName(caisseBlockBot,"Grande caisse");
		LanguageRegistry.addName(caisseBlockTop, "Grande caisse (haut)");
		
		
		LanguageRegistry.addName(batonTorcheBot,"Baton lumineux");
		LanguageRegistry.addName(batonTorcheTop, "Baton lumineux (haut)");
		LanguageRegistry.addName(batonBougieBot, "Baton de bougie lumineux");
		LanguageRegistry.addName(batonBougieTop, "Baton de bougie lumineux (haut)");
		LanguageRegistry.addName(batonLanterneBot, "Baton de lanterne lumineux");
		LanguageRegistry.addName(batonLanterneTop, "Baton de lanterne lumineux (haut)");
		
		LanguageRegistry.addName(darkStone, "Pierre sombre");
		LanguageRegistry.addName(darkCobblestone, "Pierre fragmentee sombre");
		LanguageRegistry.addName(darkLeaves, "Feuilles sombre");
		LanguageRegistry.addName(darkDirt, "Terre sombre");
		LanguageRegistry.addName(darkGrass, "Herbe sombre");
		LanguageRegistry.addName(darkLog, "Bois sombre");

		LanguageRegistry.addName(ropeRail, "Cordage");
		
		LanguageRegistry.addName(basalt, "Basalt");
		LanguageRegistry.addName(basaltCobblestone, "Cobblestone de basalt");
		LanguageRegistry.addName(basaltBrick, "Brique de basalt");

		LanguageRegistry.addName(lumiereBougie, "Bougie");
		LanguageRegistry.addName(lumiereLanterne, "Lanterne");
		LanguageRegistry.addName(lumiereSkull, "Bougie de crane");
		LanguageRegistry.addName(lumiereSkullSimple, "Bougie simple de crane");
		
		LanguageRegistry.addName(celeritePotion, "Potion de celerite");
		LanguageRegistry.addName(fatiguePotion, "Potion de fatigue");
		LanguageRegistry.addName(sautPotion, "Potion de saut");
		LanguageRegistry.addName(confusionPotion, "Potion de confusion");
		LanguageRegistry.addName(resistancePotion, "Potion de resistance");
		LanguageRegistry.addName(apneePotion, "Potion d apnee");
		LanguageRegistry.addName(cecitePotion, "Potion de cecite");
		LanguageRegistry.addName(faimPotion, "Potion de faim");
		LanguageRegistry.addName(witherPotion, "Potion de wither");
		
		LanguageRegistry.addName(customPotionWaterWalk, "Potion de marche sur eau");
		LanguageRegistry.addName(customPotionLavaWalk, "Potion de marche sur lave");
		LanguageRegistry.addName(customPotionNoFall, "Potion de resistance a la chute");
		
		LanguageRegistry.addName(testSplash, "EnDev");
		
		LanguageRegistry.addName(coralOrange, "Corail orange");
		LanguageRegistry.addName(coralGreen, "Corail vert");

		LanguageRegistry.addName(coralPurple, "Corail violet");
		LanguageRegistry.addName(coralRose, "Corail rose");
		
		LanguageRegistry.addName(coralBlack, "Corail noir");
		LanguageRegistry.addName(coralBlue, "Corail bleu");

		LanguageRegistry.addName(coralBlockReef, "Corail r\u00E9cif");
		LanguageRegistry.addName(coralBlockSponge, "Corail \u00E9ponge");

		LanguageRegistry.addName(logCherry, "Bois de cerisier");
		LanguageRegistry.addName(logRed, "Bois rouge");
		
		LanguageRegistry.addName(enseigneAlchimie, "Enseigne d'Alchimie");
		LanguageRegistry.addName(enseigneBanque, "Enseigne de Banque");
		LanguageRegistry.addName(enseigneForge, "Enseigne de Forge");
		LanguageRegistry.addName(enseigneBouclier, "Enseigne de Bouclier");
		LanguageRegistry.addName(enseigneSanctuaire, "Enseigne de Sanctuaire");
		LanguageRegistry.addName(enseigneArmurerie, "Enseigne d'Armurerie");
		LanguageRegistry.addName(enseigneLibrairie, "Enseigne de Librairie");
		LanguageRegistry.addName(enseigneRestaurant, "Enseigne de Restaurant");
		LanguageRegistry.addName(enseigneTaverne, "Enseigne de Taverne");
		LanguageRegistry.addName(enseigneMateriaux, "Enseigne de Materiaux");
		LanguageRegistry.addName(enseigneAuberge, "Enseigne d'Auberge");
		LanguageRegistry.addName(enseigneEcurie, "Enseigne d'Ecurie");
		LanguageRegistry.addName(enseigneDiamant, "Enseigne de Diamant");
		LanguageRegistry.addName(enseignePho, "Enseigne de PHO");
		LanguageRegistry.addName(enseigneCristal, "Enseigne de Cristal");
		
		LanguageRegistry.addName(bookBlock, "Livre");

		LanguageRegistry.addName(highGrassSavanaBot, "Hautes herbes de savanne");
		LanguageRegistry.addName(highGrassSavanaTop, "Hautes herbe de savanne (haut)");

		LanguageRegistry.addName(portalPurple, "Portail violet");
		
		LanguageRegistry.addName(chainIron, "Chaine en fer");
		LanguageRegistry.addName(chainRope, "Corde");
		
		LanguageRegistry.addName(logGlacee, "Buche glac\u00E9e");
		LanguageRegistry.addName(leavesGlaceeClair, "Feuilles claires glac\u00E9es");
		LanguageRegistry.addName(leavesGlacee, "Feuilles glac\u00E9es");
		LanguageRegistry.addName(plankGlacee, "Planche glac\u00E9e");
		
		LanguageRegistry.addName(tuileRed, "Petites tuiles rouges");
		LanguageRegistry.addName(tuileBlack, "Petites tuiles noires");
		LanguageRegistry.addName(tuileBlue, "Petites tuiles bleues");
		LanguageRegistry.addName(tuileRedBig, "Grandes tuiles rouges");
		LanguageRegistry.addName(tuileBlackBig, "Grandes tuiles noires");
		LanguageRegistry.addName(tuileBlueBig, "Grandes tuiles bleues");
		LanguageRegistry.addName(tuileBlackAlt, "Petites tuiles noires dechaussees");
		
		LanguageRegistry.addName(stairStone, "Escalier en roche");
		LanguageRegistry.addName(stairGrass, "Escalier d'herbe");
		LanguageRegistry.addName(stairDirt, "Escalier en terre");
		LanguageRegistry.addName(stairGravel, "Escalier en gravier");
		LanguageRegistry.addName(stairMossyCobble, "Escalier en pierre moussue");
		LanguageRegistry.addName(stairObsidian, "Escalier d'obsidienne");
		LanguageRegistry.addName(stairIce, "Escalier de glace");
		LanguageRegistry.addName(stairSnow, "Escalier de neige");
		LanguageRegistry.addName(stairStonebrickMossy, "Escalier en stonebrick moussue");
		LanguageRegistry.addName(stairStonebrickCracked, "Escalier en stonebrick fissuree");
		LanguageRegistry.addName(stairEnderstone, "Escalier en pierre du neant");
		LanguageRegistry.addName(stairSand, "Escalier en pierre du neant");

		LanguageRegistry.addName(stairWoolWhite, "Escalier en laine blanche");
		LanguageRegistry.addName(stairWoolOrange, "Escalier en laine orange");
		LanguageRegistry.addName(stairWoolMagenta, "Escalier en laine magenta");
		LanguageRegistry.addName(stairWoolLightBlue, "Escalier en laine bleu claire");
		LanguageRegistry.addName(stairWoolYellow, "Escalier en laine jaune");
		LanguageRegistry.addName(stairWoolLightGreen, "Escalier en laine verte claire");
		LanguageRegistry.addName(stairWoolPink, "Escalier en laine rose");
		LanguageRegistry.addName(stairWoolGray, "Escalier en laine grise");
		LanguageRegistry.addName(stairWoolLightGray, "Escalier en laine grise claire");
		LanguageRegistry.addName(stairWoolCyan, "Escalier en laine cyan");
		LanguageRegistry.addName(stairWoolPurple, "Escalier en laine violette");
		LanguageRegistry.addName(stairWoolBlue, "Escalier en laine bleu");
		LanguageRegistry.addName(stairWoolBrown, "Escalier en laine marron");
		LanguageRegistry.addName(stairWoolGreen, "Escalier en laine verte");
		LanguageRegistry.addName(stairWoolRed, "Escalier en laine rouge");
		LanguageRegistry.addName(stairWoolBlack, "Escalier en laine noire");
	
		LanguageRegistry.addName(stairWoolWhiteLight, "Escalier en laine blanche lumineuse");
		LanguageRegistry.addName(stairWoolOrangeLight, "Escalier en laine orange lumineuse");
		LanguageRegistry.addName(stairWoolMagentaLight, "Escalier en laine magenta lumineuse");
		LanguageRegistry.addName(stairWoolLightBlueLight, "Escalier en laine bleu claire lumineuse");
		LanguageRegistry.addName(stairWoolYellowLight, "Escalier en laine jaune lumineuse");
		LanguageRegistry.addName(stairWoolLightGreenLight, "Escalier en laine verte claire lumineuse");
		LanguageRegistry.addName(stairWoolPinkLight, "Escalier en laine rose lumineuse");
		LanguageRegistry.addName(stairWoolGrayLight, "Escalier en laine grise lumineuse");
		LanguageRegistry.addName(stairWoolLightGrayLight, "Escalier en laine grise claire lumineuse");
		LanguageRegistry.addName(stairWoolCyanLight, "Escalier en laine cyan lumineuse");
		LanguageRegistry.addName(stairWoolPurpleLight, "Escalier en laine violette lumineuse");
		LanguageRegistry.addName(stairWoolBlueLight, "Escalier en laine bleu lumineuse");
		LanguageRegistry.addName(stairWoolBrownLight, "Escalier en laine marron lumineuse");
		LanguageRegistry.addName(stairWoolGreenLight, "Escalier en laine verte lumineuse");
		LanguageRegistry.addName(stairWoolRedLight, "Escalier en laine rouge lumineuse");
		LanguageRegistry.addName(stairWoolBlackLight, "Escalier en laine noire lumineuse");
		
		LanguageRegistry.addName(lampionBlanc, "Lampion blanc");
		LanguageRegistry.addName(lampionBleu, "Lampion bleu");
		LanguageRegistry.addName(lampionJaune, "Lampion jaune");
		LanguageRegistry.addName(lampionVert, "Lampion vert");
		LanguageRegistry.addName(lampionRouge, "Lampion rouge");
		
		LanguageRegistry.addName(whiteStone, "Pierre blanche");
		LanguageRegistry.addName(whiteCobblestone, "Pierre blanche fragmente");
		LanguageRegistry.addName(whiteStonebrick, "Brique en pierre blanche");
		LanguageRegistry.addName(whiteStonebrickRound, "Brique taillee en pierre blanche");
		LanguageRegistry.addName(whiteStoneDoubleSlab, "Dalle de pierre blanche");
		LanguageRegistry.addName(whiteStoneColumn, "Colonne blanche");
		LanguageRegistry.addName(whiteStoneColumnHead, "Chapeau de colonne blanche");
				
		LanguageRegistry.addName(stonebrickColumn, "Colonne en stonebrick");
		LanguageRegistry.addName(stonebrickColumnHead, "Chapeau de colonne en stonebrick");
		LanguageRegistry.addName(stepStonebrickColumn, "Demi-dalle de colonne en stonebrick");
		LanguageRegistry.addName(stepStonebrickColumnHead, "Demi-dalle de chapeau de colonne en stonebrick");

		LanguageRegistry.addName(iceCobblestone, "Glace fragemente");
		LanguageRegistry.addName(icebrick, "Briques de glace");
		LanguageRegistry.addName(icebrickRound, "Briques taille de glace");
		LanguageRegistry.addName(iceDoubleSlab, "Dalle de glace");
		LanguageRegistry.addName(iceColumn, "Colonne de glace");
		LanguageRegistry.addName(iceColumnHead, "Chapeau de colonne de glace");

		LanguageRegistry.addName(sandstoneStonebrick, "Brique de sandstone");
		LanguageRegistry.addName(sandstoneStonebrickRound, "Brique de sandstone taillee");
		LanguageRegistry.addName(sandstoneDoubleSlab, "Dalle en sandstone");
		LanguageRegistry.addName(sandstoneColumn, "Colonne en sandstone");
		LanguageRegistry.addName(sandstoneColumnHead, "Chapeau de colonne en sandstone");
		
		LanguageRegistry.addName(marbleBlackCobblestone, "Marbre noir fragmente");
		LanguageRegistry.addName(marbleBlackStone, "Marbre noir");
		LanguageRegistry.addName(marbleBlackStonebrick, "Brique de marbre noir");
		LanguageRegistry.addName(marbleBlackStonebrickRound, "Brique taille de marbre noir");
		LanguageRegistry.addName(marbleBlackDoubleSlab, "Dalle de marbre noir");
		LanguageRegistry.addName(marbleBlackColumn, "Colonne de marbre noir");
		LanguageRegistry.addName(marbleBlackColumnHead, "Chapeau de colonne de marbre noir");
		
		LanguageRegistry.addName(marbleDamier, "Damier de marbre");

		LanguageRegistry.addName(ancientCobblestone, "Pierre ancienne fragmente");
		LanguageRegistry.addName(ancientStone, "Pierre ancienne");
		LanguageRegistry.addName(ancientStonebrick, "Brique en pierre ancienne");
		LanguageRegistry.addName(ancientStonebrickRound, "Brique taillee en pierre ancienne");
		LanguageRegistry.addName(ancientDoubleSlab, "Dalle en pierre ancienne");
		LanguageRegistry.addName(ancientColumn, "Colonne en pierre ancienne");
		LanguageRegistry.addName(ancientColumnHead, "Chapeau de colonne en pierre ancienne");
		
		LanguageRegistry.addName(marbleWhiteCobblestone, "Marbre blanc fragmente");
		LanguageRegistry.addName(marbleWhiteStone, "Marbre blanc");
		LanguageRegistry.addName(marbleWhiteStonebrick, "Brique de marbre blanc");
		LanguageRegistry.addName(marbleWhiteStonebrickRound, "Brique taillee de marbre blanc");
		LanguageRegistry.addName(marbleWhiteDoubleSlab, "Dalle de marbre blanc");
		LanguageRegistry.addName(marbleWhiteColumn, "Colonne de marbre blanc");
		LanguageRegistry.addName(marbleWhiteColumnHead, "Chapeau de colonne en marbre blanc");
			
		LanguageRegistry.addName(woodenStone, "Bois lisse");
		LanguageRegistry.addName(woodenStonebrick, "Brique en bois lisse");
		LanguageRegistry.addName(woodenStonebrickRound, "Bois lisse taille");
		LanguageRegistry.addName(woodenDoubleSlab, "Dalle en bois lisse");
		LanguageRegistry.addName(woodenColumn, "Colonne en bois lisse");
		LanguageRegistry.addName(woodenColumnHead, "Chapeau de colonne en bois lisse");
		
		LanguageRegistry.addName(woodenLightStone, "Bois clair lisse");
		LanguageRegistry.addName(woodenLightStonebrick, "Brique de bois clair lisse");
		LanguageRegistry.addName(woodenLightStonebrickRound, "Bois clair lisse taille");
		LanguageRegistry.addName(woodenLightDoubleSlab, "Dalle de bois clair lisse");
		LanguageRegistry.addName(woodenLightColumn, "Colonne en bois clair lisse");
		LanguageRegistry.addName(woodenLightColumnHead, "Chapeau de colonne en bois clair lisse");
		
		LanguageRegistry.addName(metalGrid, "Grille fine en acier");
		LanguageRegistry.addName(metalStonebrick, "Damier en acier");
		LanguageRegistry.addName(metalStonebrickRound, "Acier taille");
		LanguageRegistry.addName(metalDoubleSlab, "Dalle en acier");
		
		//LanguageRegistry.addName(coalBlock, "Bloc de charbon");
		//LanguageRegistry.addName(redstoneBlock, "Bloc de redstone");
		LanguageRegistry.addName(obsidianBlock, "Bloc d'obsidienne cuite");
		LanguageRegistry.addName(shoji, "Mur en papier Shoji");
		
		LanguageRegistry.addName(woodenLantern, "Lanterne en bois");
		LanguageRegistry.addName(ironLantern, "Lanterne en fer");
		
		//LanguageRegistry.addName(straw, "Paille");
		LanguageRegistry.addName(PHOnoir, "Pierre noire du PHO");
		LanguageRegistry.addName(PHOblanc, "Pierre blanche du PHO");
		LanguageRegistry.addName(woeBlock, "Bloc du War of Emperium");
		LanguageRegistry.addName(invisibleBlock, "Bloc invisible");
		LanguageRegistry.addName(pike1, "Pique");
		LanguageRegistry.addName(crate, "Caisse en bois");
		LanguageRegistry.addName(tuileArdoise, "Tuiles en ardoise");
		
		LanguageRegistry.addName(stepWoolWhite, "Demi-dalle en laine blanche");
		LanguageRegistry.addName(stepWoolOrange, "Demi-dalle de laine orange");
		LanguageRegistry.addName(stepWoolMagenta, "Demi-dalle de laine magenta");
		LanguageRegistry.addName(stepWoolLightBlue, "Demi-dalle de laine bleu claire");
		LanguageRegistry.addName(stepWoolYellow, "Demi-dalle de laine jaune");
		LanguageRegistry.addName(stepWoolLightGreen, "Demi-dalle de laine verte claire");
		LanguageRegistry.addName(stepWoolPink, "Demi-dalle en laine rose");
		LanguageRegistry.addName(stepWoolGray, "Demi-dalle en laine grise");
		LanguageRegistry.addName(stepWoolLightGray, "Demi-dalle en laine grise claire");
		LanguageRegistry.addName(stepWoolCyan, "Demi-dalle en laine cyan");
		LanguageRegistry.addName(stepWoolPurple, "Demi-dalle en laine violette");
		LanguageRegistry.addName(stepWoolBlue, "Demi-dalle en laine bleu");
		LanguageRegistry.addName(stepWoolBrown, "Demi-dalle en laine marron");
		LanguageRegistry.addName(stepWoolGreen, "Demi-dalle en laine verte");
		LanguageRegistry.addName(stepWoolRed, "Demi-dalle en laine rouge");
		LanguageRegistry.addName(stepWoolBlack, "Demi-dalle en laine noire");

		LanguageRegistry.addName(stepWoolWhiteLight, "Demi-dalle en laine blanche lumineuse");
		LanguageRegistry.addName(stepWoolOrangeLight, "Demi-dalle en laine orange lumineuse");
		LanguageRegistry.addName(stepWoolMagentaLight, "Demi-dalle en laine magenta lumineuse");
		LanguageRegistry.addName(stepWoolLightBlueLight, "Demi-dalle en laine bleu claire lumineuse");
		LanguageRegistry.addName(stepWoolYellowLight, "Demi-dalle en laine jaune lumineuse");
		LanguageRegistry.addName(stepWoolLightGreenLight, "Demi-dalle en laine verte claire lumineuse");
		LanguageRegistry.addName(stepWoolPinkLight, "Demi-dalle en laine rose lumineuse");
		LanguageRegistry.addName(stepWoolGrayLight, "Demi-dalle en laine grise lumineuse");
		LanguageRegistry.addName(stepWoolLightGrayLight, "Demi-dalle en laine grise claire lumineuse");
		LanguageRegistry.addName(stepWoolCyanLight, "Demi-dalle en laine cyan lumineuse");
		LanguageRegistry.addName(stepWoolPurpleLight, "Demi-dalle en laine violette lumineuse");
		LanguageRegistry.addName(stepWoolBlueLight, "Demi-dalle en laine bleu lumineuse");
		LanguageRegistry.addName(stepWoolBrownLight, "Demi-dalle en laine marron lumineuse");
		LanguageRegistry.addName(stepWoolGreenLight, "Demi-dalle en laine verte lumineuse");
		LanguageRegistry.addName(stepWoolRedLight, "Demi-dalle en laine rouge lumineuse");
		LanguageRegistry.addName(stepWoolBlackLight, "Demi-dalle en laine noire lumineuse");

		LanguageRegistry.addName(stepGrass, "Demi-dalle d'herbe");
		LanguageRegistry.addName(stepDirt, "Demi-dalle de terre");
		LanguageRegistry.addName(stepGravel, "Demi-dalle de gravier");
		LanguageRegistry.addName(stepWood1, "Demi-dalle en chene");
		LanguageRegistry.addName(stepWood2, "Demi-dalle en pin");
		LanguageRegistry.addName(stepWood3, "Demi-dalle en bouleau");
		LanguageRegistry.addName(stepWood4, "Demi-dalle en bois de la jungle");
		LanguageRegistry.addName(stepObsidian, "Demi-dalle en obsidienne");
		LanguageRegistry.addName(stepCobbleMossy, "Demi-dalle de pierre moussue");
		LanguageRegistry.addName(stepIce, "Demi-dalle de glace");
		LanguageRegistry.addName(stepSnow, "Demi-dalle de neige");
		LanguageRegistry.addName(stepStonebrickMossy, "Demi-dalle de stonebrick moussue");
		LanguageRegistry.addName(stepStonebrickCracked, "Demi-dalle de stonebrick craquelee");
		LanguageRegistry.addName(stepNetherbrick, "Demi-dalle de netherbrick");
		LanguageRegistry.addName(stepEnderstone, "Demi-dalle de pierre de l'end");
		LanguageRegistry.addName(stepSand, "Demi-dalle de sable");

		LanguageRegistry.addName(stepStraw, "Demi-dalle de paille");
		LanguageRegistry.addName(stepLanternWood, "Demi-dalle de lanterne en bois");
		LanguageRegistry.addName(stepLanternIron, "Demi-dalle de lanterne en fer");

		LanguageRegistry.addName(stepWhiteStone, "Demi-dalle de pierre blanche");
		LanguageRegistry.addName(stepWhiteCobblestone, "Demi-dalle de pierre blanche fragmente");
		LanguageRegistry.addName(stepWhiteStonebrick, "Demi-dalle de brique blanche");
		LanguageRegistry.addName(stepWhiteDoubleSlab, "Demi-dalle de dalle blanche");
		LanguageRegistry.addName(stepWhiteColumn, "Demi-dalle de colonne blanche");
		LanguageRegistry.addName(stepWhiteColumnHead, "Demi-dalle de chapeau de colonne blanche");

		LanguageRegistry.addName(stepSandstoneDoubleSlab, "Demi-dalle de dalle de sandstone");
		LanguageRegistry.addName(stepSandstoneColumn, "Demi-dalle de colonne de sandstone");
		LanguageRegistry.addName(stepSandstoneColumnHead, "Demi-dalle de chapeau de colonne de sandstone");
		LanguageRegistry.addName(stepSandstoneStonebrick, "Demi-dalle de brique de sandstone");

		LanguageRegistry.addName(stepMarbleBlackCobblestone, "Demi-dalle de marbre noir fragmente");
		LanguageRegistry.addName(stepMarbleBlackStone, "Demi-dalle de marbre noir");
		LanguageRegistry.addName(stepMarbleBlackStonebrick, "Demi-dalle de brique de marbre noir");
		LanguageRegistry.addName(stepMarbleBlackDoubleSlab, "Demi-dalle de dalle de marbre noir");
		LanguageRegistry.addName(stepMarbleBlackColumn, "Demi-dalle de colonne de marbre noir");
		LanguageRegistry.addName(stepMarbleBlackColumnHead, "Demi-dalle de chapeau de colonne de marbre noir");

		LanguageRegistry.addName(stepAncientCobblestone, "Demi-dalle de pierre ancienne fragmente");
		LanguageRegistry.addName(stepAncientStone, "Demi-dalle de pierre ancienne");
		LanguageRegistry.addName(stepAncientStonebrick, "Demi-dalle de brique en pierre ancienne");
		LanguageRegistry.addName(stepAncientDoubleSlab, "Demi-dalle de dalle en pierre ancienne");
		LanguageRegistry.addName(stepAncientColumn, "Demi-dalle de colonne en pierre ancienne");
		LanguageRegistry.addName(stepAncientColumnHead, "Demi-dalle de chapeau de colonne en pierre ancienne");

		LanguageRegistry.addName(stepMarbleWhiteCobblestone, "Demi-dalle de marbre blanc fragmente");
		LanguageRegistry.addName(stepMarbleWhiteStone, "Demi-dalle de marbre blanc");
		LanguageRegistry.addName(stepMarbleWhiteStonebrick, "Demi-dalle de brique de marbre blanc");
		LanguageRegistry.addName(stepMarbleWhiteDoubleSlab, "Demi-dalle de dalle en marbre blanc");
		LanguageRegistry.addName(stepMarbleWhiteColumn, "Demi-dalle de colonne en marbre blanc");
		LanguageRegistry.addName(stepMarbleWhiteColumnHead, "Demi-dalle de chapeau de colonne en marbre blanc");

		LanguageRegistry.addName(stepWoodenStone, "Demi-dalle de bois lisse");
		LanguageRegistry.addName(stepWoodenStonebrick, "Demi-dalle de bois lisse taille");
		LanguageRegistry.addName(stepWoodenDoubleSlab, "Demi-dalle de dalle de bois lisse");
		LanguageRegistry.addName(stepWoodenColumn, "Demi-dalle de colonne en bois lisse");
		LanguageRegistry.addName(stepWoodenColumnHead, "Demi-dalle de chapeau de colonne en bois lisse");

		LanguageRegistry.addName(stepWoodenLightStone, "Demi-dalle de bois clair lisse");
		LanguageRegistry.addName(stepWoodenLightStonebrick, "Demi-dalle de bois clair lisse taille");
		LanguageRegistry.addName(stepWoodenLightDoubleSlab, "Demi-dalle de dalle de bois clair lisse");
		LanguageRegistry.addName(stepWoodenLightColumn, "Demi-dalle de colonne de bois clair lisse");
		LanguageRegistry.addName(stepWoodenLightColumnHead, "Demi-dalle de chapeau de colonne de bois clair lisse");

		LanguageRegistry.addName(stepIceCobblestone, "Demi-dalle de glace fragmente");
		LanguageRegistry.addName(stepIceStonebrick, "Demi-dalle de briques de glace");
		LanguageRegistry.addName(stepIceDoubleSlab, "Demi-dalle de dalle de glace");
		LanguageRegistry.addName(stepIceColumn, "Demi-dalle de colonne de glace");
		LanguageRegistry.addName(stepIceColumnHead, "Demi-dalle de chapeau de colonne de glace");

		LanguageRegistry.addName(stepMarbleDamier, "Demi-dalle de marbre en damier");
		LanguageRegistry.addName(stepMetal, "Demi-dalle en acier");

		LanguageRegistry.addName(stairStraw, "Escalier en paille");

		LanguageRegistry.addName(stairMarbleDamier, "Escalier de marbre en damier");

		LanguageRegistry.addName(stairWhiteStone, "Escalier en pierre blanche");
		LanguageRegistry.addName(stairWhiteStonebrick, "Escalier en brique de pierre blanche");
		LanguageRegistry.addName(stairWhiteCobblestone, "Escalier en pierre blanche fragmente");

		LanguageRegistry.addName(stairAncientStone, "Escalier en pierre ancienne");
		LanguageRegistry.addName(stairAncientStonebrick, "Escalier en brique de pierre ancienne");
		LanguageRegistry.addName(stairAncientCobblestone, "Escalier en pierre ancienne fragmente");

		LanguageRegistry.addName(stairMarbleWhiteStone, "Escalier en marbre blanc");
		LanguageRegistry.addName(stairMarbleWhiteStonebrick, "Escalier en brique de marbre blanc");
		LanguageRegistry.addName(stairMarbleWhiteCobblestone, "Escalier en marbre blanc fragmente");

		LanguageRegistry.addName(stairMarbleBlackStone, "Escalier en marbre noir");
		LanguageRegistry.addName(stairMarbleBlackStonebrick, "Escalier en brique de marbre noir");
		LanguageRegistry.addName(stairMarbleBlackCobblestone, "Escalier en marbre noir fragmente");

		LanguageRegistry.addName(stairIceStonebrick, "Escalier en brique de glace");
		LanguageRegistry.addName(stairIceCobblestone, "Escalier en glace fragmente");

		LanguageRegistry.addName(stairWoodenStone, "Escalier en bois lisse");
		LanguageRegistry.addName(stairWoodenStonebrick, "Escalier en brique de bois lisse");

		LanguageRegistry.addName(stairWoodenLightStone, "Escalier en bois clair lisse");
		LanguageRegistry.addName(stairWoodenLightStonebrick, "Escalier en brique de bois clair lisse");

		LanguageRegistry.addName(stairSandstoneStonebrick, "Escalier en brique de sandstone");

		LanguageRegistry.addName(stairTuileRed, "Escalier de petites tuiles rouges");
		LanguageRegistry.addName(stairTuileBlack, "Escalier de petites tuiles noires");
		LanguageRegistry.addName(stairTuileBlue, "Escalier de petites tuiles bleues");
		LanguageRegistry.addName(stairTuileRedBig, "Escalier de grandes tuiles rouges");
		LanguageRegistry.addName(stairTuileBlackBig, "Escalier de grandes tuiles noires");
		LanguageRegistry.addName(stairTuileBlueBig, "Escalier de grandes tuiles bleues");
		LanguageRegistry.addName(stairTuileBlackAlt, "Escalier de petites tuiles noires dechaussees");

		LanguageRegistry.addName(stepTuileRed, "Demi-dalle de tuile rouge");
		LanguageRegistry.addName(stepTuileBlue, "Demi-dalle de tuile bleu");
		LanguageRegistry.addName(stepTuileBlack, "Demi-dalle de tuile noire");
		LanguageRegistry.addName(stepTuileRedBig, "Demi-dalle de grande tuile rouge");
		LanguageRegistry.addName(stepTuileBlueBig, "Demi-dalle de grande tuile bleu");
		LanguageRegistry.addName(stepTuileBlackBig, "Demi-dalle de grande tuile noire");
		LanguageRegistry.addName(stepTuileBlackAlt, "Demi-dalle de tuile noire dechaussee");

		LanguageRegistry.addName(wallSandstone, "Muret en sandstone");
		LanguageRegistry.addName(wallPlankOak, "Muret en planche");
		LanguageRegistry.addName(wallBrick, "Muret en brique");
		LanguageRegistry.addName(wallStonebrick, "Muret en stonebrick");
		LanguageRegistry.addName(wallNetherbrick, "Muret en netherbrick");
		LanguageRegistry.addName(wallWoodOak, "Muret en bois (chene)");
		LanguageRegistry.addName(wallWoodFir, "Muret en bois (sapin)");
		LanguageRegistry.addName(wallWoodBirch, "Muret en bois (bouleau)");
		LanguageRegistry.addName(wallWoodJungle, "Muret en bois (jungle)");

		LanguageRegistry.addName(wallWhiteStone, "Muret en pierre blanche");
		LanguageRegistry.addName(wallWhiteStonebrick, "Muret en brique de pierre blanche");
		LanguageRegistry.addName(wallWhiteCobblestone, "Muret en pierre blanche fragmente");

		LanguageRegistry.addName(wallMarbleWhiteStone, "Muret en marbre blanc");
		LanguageRegistry.addName(wallMarbleWhiteStonebrick, "Muret en brique de marbre blanc");
		LanguageRegistry.addName(wallMarbleWhiteCobblestone, "Muret en marbre blanc fragmente");

		LanguageRegistry.addName(wallMarbleBlackStone, "Muret en marbre noir");
		LanguageRegistry.addName(wallMarbleBlackStonebrick, "Muret en brique de marbre noir");
		LanguageRegistry.addName(wallMarbleBlackCobblestone, "Muret en marbre noir fragmente");

		LanguageRegistry.addName(wallAncientStone, "Muret en pierre ancienne");
		LanguageRegistry.addName(wallAncientStonebrick, "Muret en brique de pierre ancienne");
		LanguageRegistry.addName(wallAncientCobblestone, "Muret en pierre ancienne fragmente");

		LanguageRegistry.addName(wallWoodenStone, "Muret en bois lisse");
		LanguageRegistry.addName(wallWoodenStonebrick, "Muret en brique de bois lisse");

		LanguageRegistry.addName(wallWoodenLightStone, "Muret en bois clair lisse");
		LanguageRegistry.addName(wallWoodenLightStonebrick, "Muret en brique de bois clair lisse");

		LanguageRegistry.addName(wallIceCobblestone, "Muret en glace fragmente");
		LanguageRegistry.addName(wallIceStonebrick, "Muret en briques de glace");

		LanguageRegistry.addName(fenceWhiteStone, "Barriere en pierre blanche");
		LanguageRegistry.addName(fenceWhiteStonebrick, "Barriere en pierre blanche taillee");
		LanguageRegistry.addName(fenceWhiteCobblestone, "Barriere en pierre blanche fracturee");

		LanguageRegistry.addName(fenceMarbleWhiteStone, "Barriere en marbre blanc");
		LanguageRegistry.addName(fenceMarbleWhiteStonebrick, "Barriere en marbre blanc taille");
		LanguageRegistry.addName(fenceMarbleWhiteCobblestone, "Barriere en marbre blanc fracture");

		LanguageRegistry.addName(fenceMarbleBlackStone, "Barriere en marbre noir");
		LanguageRegistry.addName(fenceMarbleBlackStonebrick, "Barriere en marbre noir taille");
		LanguageRegistry.addName(fenceMarbleBlackCobblestone, "Barriere en marbre noir fracture");

		LanguageRegistry.addName(fenceAncientStone, "Barriere en pierre ancienne");
		LanguageRegistry.addName(fenceAncientStonebrick, "Barriere en pierre ancienne taillee");
		LanguageRegistry.addName(fenceAncientCobblestone, "Barriere en pierre ancienne fracturee");

		LanguageRegistry.addName(fenceWoodenStone, "Barriere en bois lisse");
		LanguageRegistry.addName(fenceWoodenStonebrick, "Barriere en bois lisse taille");

		LanguageRegistry.addName(fenceWoodenLightStone, "Barriere en bois clair lisse");
		LanguageRegistry.addName(fenceWoodenLightStonebrick, "Barriere en bois clair lisse taille");

		LanguageRegistry.addName(fenceIceCobblestone, "Barriere en glace fracture");
		LanguageRegistry.addName(fenceIceStonebrick, "Barriere en glace taillee");

		LanguageRegistry.addName(marbleWhiteAnvil, "Balustrade en marbre blanc");
		LanguageRegistry.addName(marbleWhiteStonebrickAnvil, "Balustarde en brique de marbre blanc");
		LanguageRegistry.addName(marbleBlackAnvil, "Balustrade en marbre noir");
		LanguageRegistry.addName(marbleBlackStonebrickAnvil, "Balustrade en brique de marbre noir");
		LanguageRegistry.addName(whiteStoneAnvil, "Balustrade en pierre blanche");
		LanguageRegistry.addName(whiteStonebrickAnvil, "Balustrade en brique de pierre blanche");
		LanguageRegistry.addName(ancientStoneAnvil, "Balustrade en pierre ancienne");
		LanguageRegistry.addName(ancientStonebrickAnvil, "Balustrade en brique de pierre ancienne");
		LanguageRegistry.addName(sandstoneStonebrickAnvil, "Balustrade en brique de sandstone");
		LanguageRegistry.addName(iceStonebrickAnvil, "Balustrade en brique de glace");

		LanguageRegistry.addName(woodenStoneAnvil, "Balustrade en bois lisse");
		LanguageRegistry.addName(woodenStonebrickAnvil, "Balustrade en brique de bois lisse");

		LanguageRegistry.addName(logAnvil, "Balustrade en bois");
		LanguageRegistry.addName(woodAnvil, "Balustrade en bois normal");
		LanguageRegistry.addName(woodNormalAnvil, "Balustrade en bois blanc");
		LanguageRegistry.addName(woodLightAnvil, "Balustrade en bois brun");
		LanguageRegistry.addName(woodDarkAnvil, "Balustrade en bois fonce");
		
		LanguageRegistry.addName(redGrass, "Roche rouge herbeuse");
		LanguageRegistry.addName(redGravel, "Gravier de pierre rouge");
		LanguageRegistry.addName(beigeRock, "Pierre beige");
		LanguageRegistry.addName(beigeLines, "Strates beiges fines");
		LanguageRegistry.addName(redSilver, "Minerai d'argent rouge");
		LanguageRegistry.addName(silverBlock, "Bloc d'argent de Reder");

		LanguageRegistry.addName(greyRock, "Roche grise");
		LanguageRegistry.addName(greyRockGrass, "Roche grise herbeuse");
		LanguageRegistry.addName(brownRock, "Roche brune");
		LanguageRegistry.addName(brownRockGrass, "Roche brune herbeuse");
		LanguageRegistry.addName(darkRock, "Roche sombre");
		LanguageRegistry.addName(darkRockGrass, "Roche sombre herbeuse");
		LanguageRegistry.addName(blackRock, "Roche noire");
		LanguageRegistry.addName(lavaRock, "Roche volcanique");
		LanguageRegistry.addName(lavaRockRed, "Roche volcanique rouge");

		LanguageRegistry.addName(cristalBlock, "Bloc de cristal");
		LanguageRegistry.addName(cristalLittle, "Petit cristal");
		LanguageRegistry.addName(cristalBig, "Grand cristal");

		LanguageRegistry.addName(colombageCarre, "Colombage carre");
		LanguageRegistry.addName(colombageCroise, "Colombage croise");
		LanguageRegistry.addName(colombageVertical, "Colombage vertical");
		LanguageRegistry.addName(colombageHorizontal, "Colombage horizontal");
		LanguageRegistry.addName(colombageGauche, "Colombage gauche");
		LanguageRegistry.addName(colombageDroite, "Colombage droite");

		LanguageRegistry.addName(fenetreFer, "Fenetre en fer");
		LanguageRegistry.addName(fenetreFerPane, "Fenetre en fer plate");

		LanguageRegistry.addName(colombageCarreFonce, "Colombage carre fonce");
		LanguageRegistry.addName(colombageCroiseFonce, "Colombage croise fonce");
		LanguageRegistry.addName(colombageVerticalFonce, "Colombage vertical fonce");
		LanguageRegistry.addName(colombageHorizontalFonce, "Colombage horizontal fonce");
		LanguageRegistry.addName(colombageGaucheFonce, "Colombage gauche fonce");
		LanguageRegistry.addName(colombageDroiteFonce, "Colombage droite fonce");

		/** Item language **/


		/**CustomPotionEffect**/
		effectPotionWaterWalk = (new PotionCustomEffect(30, false, 0)).setPotionName("potion.effectPotionWaterWalk");
		LanguageRegistry.instance().addStringLocalization("potion.effectPotionWaterWalk", "Potion de marche sur eau");

		effectPotionLavaWalk = (new PotionCustomEffect(31, false, 0)).setPotionName("potion.effectPotionLavaWalk");
		LanguageRegistry.instance().addStringLocalization("potion.effectPotionLavaWalk", "Potion de marche sur lave");

		effectPotionNoFall = (new PotionCustomEffect(29, false, 0)).setPotionName("potion.effectPotionNoFall");
		LanguageRegistry.instance().addStringLocalization("potion.effectPotionNoFall", "Potion de resistance a la chute");
	}

	/**Mob**/
	public static int getUniqueEntityId() 
	{
		do 
		{
			startEntityId++;
		} 
		while (EntityList.getStringFromID(startEntityId) != null);

		return startEntityId;
	}

	public static void registerEntityEgg(Class<? extends Entity> entity, int primaryColor, int secondaryColor) 
	{
		int id = getUniqueEntityId();
		EntityList.IDtoClassMapping.put(id, entity);
		EntityList.entityEggs.put(id, new EntityEggInfo(id, primaryColor, secondaryColor));
	}

	/**3**/		//Recettes (apres les blocs)
	@EventHandler
	public void postload(FMLPostInitializationEvent event)
	{   
		GameRegistry.addShapelessRecipe(new ItemStack(diamondIngot, 9), new Object[]
				{ new ItemStack(Item.diamond) });
		GameRegistry.addRecipe(new ItemStack(Item.diamond, 1), new Object[]
				{ "XXX", "XXX", "XXX", 'X', diamondIngot });
		GameRegistry.addRecipe(new ItemStack(hamburgerFood, 1), new Object[]
				{ " X ", " Y ", " X ", 'X', Item.bread, 'Y', Item.beefCooked });
		GameRegistry.addRecipe(new ItemStack(fritesFood, 1), new Object[]
				{ "   ", "   ", "XX ", 'X', Item.potato });
		GameRegistry.addRecipe(new ItemStack(chope, 1), new Object[]
				{ "X X", "X X", " X ", 'X', Block.wood });
		/**GameRegistry.addRecipe(new ItemStack(beer, 1), new Object[]
				{
				" Y ", " Y ", " X ", 'X', chope, 'Y', chope
				});**/
		GameRegistry.addRecipe(new ItemStack(leatherBlock, 1), new Object[]
				{ "XXX", "XXX", "XXX", 'X', Item.leather });
		//GameRegistry.addRecipe(new ItemStack(Item.redstone, 1), "XXX", "XXX", "XXX", 'X', Mho.redstoneBlock);
		//GameRegistry.addRecipe(new ItemStack(Item.coal, 1), "XXX", "XXX", "XXX", 'X', Mho.coalBlock);

		/** Enchant **/
		//Sharpness
		GameRegistry.addRecipe(new ItemStack(Mho.enchantSharpnessT1Medium,1), "XXX", "XXX", "XXX", 'X', Mho.enchantSharpnessT1Small);
		GameRegistry.addRecipe(new ItemStack(Mho.enchantSharpnessT1Big,1), "XXX", "XXX", "XXX", 'X', Mho.enchantSharpnessT1Medium);

		GameRegistry.addRecipe(new ItemStack(Mho.enchantSharpnessT2Medium,1), "XXX", "XXX", "XXX", 'X', Mho.enchantSharpnessT2Small);
		GameRegistry.addRecipe(new ItemStack(Mho.enchantSharpnessT2Big,1), "XXX", "XXX", "XXX", 'X', Mho.enchantSharpnessT2Medium);

		GameRegistry.addRecipe(new ItemStack(Mho.enchantSharpnessT3Medium,1), "XXX", "XXX", "XXX", 'X', Mho.enchantSharpnessT3Small);
		GameRegistry.addRecipe(new ItemStack(Mho.enchantSharpnessT3Big,1), "XXX", "XXX", "XXX", 'X', Mho.enchantSharpnessT3Medium);

		//Smite
		GameRegistry.addRecipe(new ItemStack(Mho.enchantSmiteT1Medium,1), "XXX", "XXX", "XXX", 'X', Mho.enchantSmiteT1Small);
		GameRegistry.addRecipe(new ItemStack(Mho.enchantSmiteT1Big,1), "XXX", "XXX", "XXX", 'X', Mho.enchantSmiteT1Medium);

		GameRegistry.addRecipe(new ItemStack(Mho.enchantSmiteT2Medium,1), "XXX", "XXX", "XXX", 'X', Mho.enchantSmiteT2Small);
		GameRegistry.addRecipe(new ItemStack(Mho.enchantSmiteT2Big,1), "XXX", "XXX", "XXX", 'X', Mho.enchantSmiteT2Medium);

		GameRegistry.addRecipe(new ItemStack(Mho.enchantSmiteT3Medium,1), "XXX", "XXX", "XXX", 'X', Mho.enchantSmiteT3Small);
		GameRegistry.addRecipe(new ItemStack(Mho.enchantSmiteT3Big,1), "XXX", "XXX", "XXX", 'X', Mho.enchantSmiteT3Medium);

		//Protection
		GameRegistry.addRecipe(new ItemStack(Mho.enchantProtectionT1Big,1), "XXX", "XXX", "XXX", 'X', Mho.enchantProtectionT1Small);
		GameRegistry.addRecipe(new ItemStack(Mho.enchantProtectionT2Big,1), "XXX", "XXX", "XXX", 'X', Mho.enchantProtectionT2Small);
		GameRegistry.addRecipe(new ItemStack(Mho.enchantProtectionT3Big,1), "XXX", "XXX", "XXX", 'X', Mho.enchantProtectionT3Small);

		//Bane of arthropods
		GameRegistry.addRecipe(new ItemStack(Mho.enchantBaneofT1Medium,1), "XXX", "XXX", "XXX", 'X', Mho.enchantBaneofT1Small);
		GameRegistry.addRecipe(new ItemStack(Mho.enchantBaneofT1Big,1), "XXX", "XXX", "XXX", 'X', Mho.enchantBaneofT1Medium);

		GameRegistry.addRecipe(new ItemStack(Mho.enchantBaneofT2Medium,1), "XXX", "XXX", "XXX", 'X', Mho.enchantBaneofT2Small);
		GameRegistry.addRecipe(new ItemStack(Mho.enchantBaneofT2Big,1), "XXX", "XXX", "XXX", 'X', Mho.enchantBaneofT2Medium);

		GameRegistry.addRecipe(new ItemStack(Mho.enchantBaneofT3Medium,1), "XXX", "XXX", "XXX", 'X', Mho.enchantBaneofT3Small);
		GameRegistry.addRecipe(new ItemStack(Mho.enchantBaneofT3Big,1), "XXX", "XXX", "XXX", 'X', Mho.enchantBaneofT3Medium);

		//Efficacity
		GameRegistry.addRecipe(new ItemStack(Mho.enchantEfficacityT1Medium,1), "XXX", "XXX", "XXX", 'X', Mho.enchantEfficacityT1Small);
		GameRegistry.addRecipe(new ItemStack(Mho.enchantEfficacityT1Big,1), "XXX", "XXX", "XXX", 'X', Mho.enchantEfficacityT1Medium);

		GameRegistry.addRecipe(new ItemStack(Mho.enchantEfficacityT2Medium,1), "XXX", "XXX", "XXX", 'X', Mho.enchantEfficacityT2Small);
		GameRegistry.addRecipe(new ItemStack(Mho.enchantEfficacityT2Big,1), "XXX", "XXX", "XXX", 'X', Mho.enchantEfficacityT2Medium);

		GameRegistry.addRecipe(new ItemStack(Mho.enchantEfficacityT3Medium,1), "XXX", "XXX", "XXX", 'X', Mho.enchantEfficacityT3Small);
		GameRegistry.addRecipe(new ItemStack(Mho.enchantEfficacityT3Big,1), "XXX", "XXX", "XXX", 'X', Mho.enchantEfficacityT3Medium);

		//Durability
		GameRegistry.addRecipe(new ItemStack(Mho.enchantDurabilityT1Medium,1), "XXX", "XXX", "XXX", 'X', Mho.enchantDurabilityT1Small);
		GameRegistry.addRecipe(new ItemStack(Mho.enchantDurabilityT1Big,1), "XXX", "XXX", "XXX", 'X', Mho.enchantDurabilityT1Medium);

		GameRegistry.addRecipe(new ItemStack(Mho.enchantDurabilityT2Medium,1), "XXX", "XXX", "XXX", 'X', Mho.enchantDurabilityT2Small);
		GameRegistry.addRecipe(new ItemStack(Mho.enchantDurabilityT2Big,1), "XXX", "XXX", "XXX", 'X', Mho.enchantDurabilityT2Medium);

		GameRegistry.addRecipe(new ItemStack(Mho.enchantDurabilityT3Medium,1), "XXX", "XXX", "XXX", 'X', Mho.enchantDurabilityT3Small);
		GameRegistry.addRecipe(new ItemStack(Mho.enchantDurabilityT3Big,1), "XXX", "XXX", "XXX", 'X', Mho.enchantDurabilityT3Medium);

		//Flame
		//FLAME 2 NON AUTORISE

		//Knockback
		GameRegistry.addRecipe(new ItemStack(Mho.enchantKnockbackT1Big,1), "XXX", "XXX", "XXX", 'X', Mho.enchantKnockbackT1Small);
		GameRegistry.addRecipe(new ItemStack(Mho.enchantKnockbackT2Big,1), "XXX", "XXX", "XXX", 'X', Mho.enchantKnockbackT2Small);
		GameRegistry.addRecipe(new ItemStack(Mho.enchantKnockbackT3Big,1), "XXX", "XXX", "XXX", 'X', Mho.enchantKnockbackT3Small);

		/** Fenetre fer **/
		GameRegistry.addRecipe(new ItemStack(fenetreFer,6), "XXX", "X X", "XXX", 'X', Block.fenceIron);
		GameRegistry.addRecipe(new ItemStack(fenetreFerPane,16), "XXX", "XXX", 'X', Mho.fenetreFer);

		/** White **/
		GameRegistry.addRecipe(new ItemStack(whiteStonebrick, 4), "XX", "XX", 'X', Mho.whiteStone);
		GameRegistry.addRecipe(new ItemStack(whiteStoneColumn, 3), "X", "X", "X", 'X', Mho.whiteStone);

		/** Ancient **/
		GameRegistry.addRecipe(new ItemStack(ancientStonebrick, 4), "XX", "XX", 'X', Mho.ancientStone);
		GameRegistry.addRecipe(new ItemStack(ancientColumn, 3), "X", "X", "X", 'X', Mho.ancientStone);

		/** Marble black **/
		GameRegistry.addRecipe(new ItemStack(marbleBlackStonebrick, 4), "XX", "XX", 'X', Mho.marbleBlackStone);
		GameRegistry.addRecipe(new ItemStack(marbleBlackColumn, 3), "X", "X", "X", 'X', Mho.marbleBlackStone);

		/** Marble white **/
		GameRegistry.addRecipe(new ItemStack(marbleWhiteStonebrick, 4), "XX", "XX", 'X', Mho.marbleWhiteStone);
		GameRegistry.addRecipe(new ItemStack(marbleWhiteColumn, 3), "X", "X", "X", 'X', Mho.marbleWhiteStone);

		/** Sandstone new **/
		GameRegistry.addRecipe(new ItemStack(sandstoneColumn, 3), "X", "X", "X", 'X', Block.sandStone);

		/** Shapeless **/
		GameRegistry.addShapelessRecipe(new ItemStack(whiteStone,1,0), Block.stone, new ItemStack(Item.dyePowder,1,15));
		GameRegistry.addShapelessRecipe(new ItemStack(whiteCobblestone,1,0), Block.cobblestone, new ItemStack(Item.dyePowder,1,15));
		GameRegistry.addShapelessRecipe(new ItemStack(whiteStonebrick,1,0), Block.stoneBrick, new ItemStack(Item.dyePowder,1,15));
		GameRegistry.addShapelessRecipe(new ItemStack(whiteStonebrickRound,1,0), Mho.whiteStonebrick, new ItemStack(Item.dyePowder,1,15));

		/** Step wool **/
		GameRegistry.addRecipe(new ItemStack(stepWoolWhite, 6), "XXX", 'X', new ItemStack(Block.cloth,1,0));
		GameRegistry.addRecipe(new ItemStack(stepWoolOrange, 6), "XXX", 'X', new ItemStack(Block.cloth,1,1));
		GameRegistry.addRecipe(new ItemStack(stepWoolMagenta, 6), "XXX", 'X', new ItemStack(Block.cloth,1,2));
		GameRegistry.addRecipe(new ItemStack(stepWoolLightBlue, 6), "XXX", 'X', new ItemStack(Block.cloth,1,3));
		GameRegistry.addRecipe(new ItemStack(stepWoolYellow, 6), "XXX", 'X', new ItemStack(Block.cloth,1,4));
		GameRegistry.addRecipe(new ItemStack(stepWoolLightGreen, 6), "XXX", 'X', new ItemStack(Block.cloth,1,5));
		GameRegistry.addRecipe(new ItemStack(stepWoolPink, 6), "XXX", 'X', new ItemStack(Block.cloth,1,6));
		GameRegistry.addRecipe(new ItemStack(stepWoolGray, 6), "XXX", 'X', new ItemStack(Block.cloth,1,7));
		GameRegistry.addRecipe(new ItemStack(stepWoolLightGray, 6), "XXX", 'X', new ItemStack(Block.cloth,1,8));
		GameRegistry.addRecipe(new ItemStack(stepWoolCyan, 6), "XXX", 'X', new ItemStack(Block.cloth,1,9));
		GameRegistry.addRecipe(new ItemStack(stepWoolPurple, 6), "XXX", 'X', new ItemStack(Block.cloth,1,10));
		GameRegistry.addRecipe(new ItemStack(stepWoolBlue, 6), "XXX", 'X', new ItemStack(Block.cloth,1,11));
		GameRegistry.addRecipe(new ItemStack(stepWoolBrown, 6), "XXX", 'X', new ItemStack(Block.cloth,1,12));
		GameRegistry.addRecipe(new ItemStack(stepWoolGreen, 6), "XXX", 'X', new ItemStack(Block.cloth,1,13));
		GameRegistry.addRecipe(new ItemStack(stepWoolRed, 6), "XXX", 'X', new ItemStack(Block.cloth,1,14));
		GameRegistry.addRecipe(new ItemStack(stepWoolBlack, 6), "XXX", 'X', new ItemStack(Block.cloth,1,15));

		/** Step wool light **/
		GameRegistry.addRecipe(new ItemStack(stepWoolWhiteLight, 6), "XXX", 'X', new ItemStack(Mho.metaWoolLight,1,0));
		GameRegistry.addRecipe(new ItemStack(stepWoolOrangeLight, 6), "XXX", 'X', new ItemStack(Mho.metaWoolLight,1,1));
		GameRegistry.addRecipe(new ItemStack(stepWoolMagentaLight, 6), "XXX", 'X', new ItemStack(Mho.metaWoolLight,1,2));
		GameRegistry.addRecipe(new ItemStack(stepWoolLightBlueLight, 6), "XXX", 'X', new ItemStack(Mho.metaWoolLight,1,3));
		GameRegistry.addRecipe(new ItemStack(stepWoolYellowLight, 6), "XXX", 'X', new ItemStack(Mho.metaWoolLight,1,4));
		GameRegistry.addRecipe(new ItemStack(stepWoolLightGreenLight, 6), "XXX", 'X', new ItemStack(Mho.metaWoolLight,1,5));
		GameRegistry.addRecipe(new ItemStack(stepWoolPinkLight, 6), "XXX", 'X', new ItemStack(Mho.metaWoolLight,1,6));
		GameRegistry.addRecipe(new ItemStack(stepWoolGrayLight, 6), "XXX", 'X', new ItemStack(Mho.metaWoolLight,1,7));
		GameRegistry.addRecipe(new ItemStack(stepWoolLightGrayLight, 6), "XXX", 'X', new ItemStack(Mho.metaWoolLight,1,8));
		GameRegistry.addRecipe(new ItemStack(stepWoolCyanLight, 6), "XXX", 'X', new ItemStack(Mho.metaWoolLight,1,9));
		GameRegistry.addRecipe(new ItemStack(stepWoolPurpleLight, 6), "XXX", 'X', new ItemStack(Mho.metaWoolLight,1,10));
		GameRegistry.addRecipe(new ItemStack(stepWoolBlueLight, 6), "XXX", 'X', new ItemStack(Mho.metaWoolLight,1,11));
		GameRegistry.addRecipe(new ItemStack(stepWoolBrownLight, 6), "XXX", 'X', new ItemStack(Mho.metaWoolLight,1,12));
		GameRegistry.addRecipe(new ItemStack(stepWoolGreenLight, 6), "XXX", 'X', new ItemStack(Mho.metaWoolLight,1,13));
		GameRegistry.addRecipe(new ItemStack(stepWoolRedLight, 6), "XXX", 'X', new ItemStack(Mho.metaWoolLight,1,14));
		GameRegistry.addRecipe(new ItemStack(stepWoolBlackLight, 6), "XXX", 'X', new ItemStack(Mho.metaWoolLight,1,15));

		/** Step base **/
		GameRegistry.addRecipe(new ItemStack(stepGrass, 6), "XXX", 'X', Block.grass);
		GameRegistry.addRecipe(new ItemStack(stepDirt, 6), "XXX", 'X', Block.dirt);
		GameRegistry.addRecipe(new ItemStack(stepGravel, 6), "XXX", 'X', Block.gravel);
		GameRegistry.addRecipe(new ItemStack(stepWood1, 6), "XXX", 'X', new ItemStack(Block.wood,1,0));
		GameRegistry.addRecipe(new ItemStack(stepWood2, 6), "XXX", 'X', new ItemStack(Block.wood,1,1));
		GameRegistry.addRecipe(new ItemStack(stepWood3, 6), "XXX", 'X', new ItemStack(Block.wood,1,2));
		GameRegistry.addRecipe(new ItemStack(stepWood4, 6), "XXX", 'X', new ItemStack(Block.wood,1,3));
		GameRegistry.addRecipe(new ItemStack(stepCobbleMossy, 6), "XXX", 'X', Block.cobblestoneMossy);
		GameRegistry.addRecipe(new ItemStack(stepObsidian, 6), "XXX", 'X', Block.obsidian);
		GameRegistry.addRecipe(new ItemStack(stepIce, 6), "XXX", 'X', Block.ice);
		GameRegistry.addRecipe(new ItemStack(stepSnow, 6), "XXX", 'X', Block.snow);
		GameRegistry.addRecipe(new ItemStack(stepStonebrickMossy, 6), "XXX", 'X', new ItemStack(Block.stoneBrick,1,1));
		GameRegistry.addRecipe(new ItemStack(stepStonebrickCracked, 6), "XXX", 'X', new ItemStack(Block.stoneBrick,1,2));
		GameRegistry.addRecipe(new ItemStack(stepEnderstone, 6), "XXX", 'X', Block.whiteStone);
		GameRegistry.addRecipe(new ItemStack(stepSand, 6), "XXX", 'X', Block.sand);

		/** Step Tuiles **/
		GameRegistry.addRecipe(new ItemStack(stepTuileRed, 6), "XXX", 'X', Mho.tuileRed);
		GameRegistry.addRecipe(new ItemStack(stepTuileBlack, 6), "XXX", 'X', Mho.tuileBlack);
		GameRegistry.addRecipe(new ItemStack(stepTuileBlue, 6), "XXX", 'X', Mho.tuileBlue);
		GameRegistry.addRecipe(new ItemStack(stepTuileRedBig, 6), "XXX", 'X', Mho.tuileRedBig);
		GameRegistry.addRecipe(new ItemStack(stepTuileBlueBig, 6), "XXX", 'X', Mho.tuileBlueBig);
		GameRegistry.addRecipe(new ItemStack(stepTuileBlackBig, 6), "XXX", 'X', Mho.tuileBlackBig);
		GameRegistry.addRecipe(new ItemStack(stepTuileBlackAlt, 6), "XXX", 'X', Mho.tuileBlackAlt);

		/** Step White **/
		GameRegistry.addRecipe(new ItemStack(stepWhiteStone, 6), "XXX", 'X', Mho.whiteStone);
		GameRegistry.addRecipe(new ItemStack(stepWhiteCobblestone, 6), "XXX", 'X', Mho.whiteCobblestone);
		GameRegistry.addRecipe(new ItemStack(stepWhiteStonebrick, 6), "XXX", 'X', Mho.whiteStonebrick);
		GameRegistry.addRecipe(new ItemStack(stepWhiteDoubleSlab, 6), "XXX", 'X', Mho.whiteStoneDoubleSlab);
		GameRegistry.addRecipe(new ItemStack(stepWhiteColumn, 6), "XXX", 'X', Mho.whiteStoneColumn);
		GameRegistry.addRecipe(new ItemStack(stepWhiteColumnHead, 6), "XXX", 'X', Mho.whiteStoneColumnHead);

		/** Step sandstone **/
		GameRegistry.addRecipe(new ItemStack(stepSandstoneDoubleSlab, 6), "XXX", 'X', Mho.sandstoneDoubleSlab);
		GameRegistry.addRecipe(new ItemStack(stepSandstoneColumn, 6), "XXX", 'X', Mho.sandstoneColumn);
		GameRegistry.addRecipe(new ItemStack(stepSandstoneColumnHead, 6), "XXX", 'X', Mho.sandstoneColumn);
		GameRegistry.addRecipe(new ItemStack(stepSandstoneStonebrick, 6), "XXX", 'X', Mho.sandstoneStonebrick);

		/** Step marble Black**/
		GameRegistry.addRecipe(new ItemStack(stepMarbleBlackCobblestone, 6), "XXX", 'X', Mho.marbleBlackCobblestone);
		GameRegistry.addRecipe(new ItemStack(stepMarbleBlackStone, 6), "XXX", 'X', Mho.marbleBlackStone);
		GameRegistry.addRecipe(new ItemStack(stepMarbleBlackStonebrick, 6), "XXX", 'X', Mho.marbleBlackStonebrick);
		GameRegistry.addRecipe(new ItemStack(stepMarbleBlackDoubleSlab, 6), "XXX", 'X', Mho.marbleBlackDoubleSlab);
		GameRegistry.addRecipe(new ItemStack(stepMarbleBlackColumn, 6), "XXX", 'X', Mho.marbleBlackColumn);
		GameRegistry.addRecipe(new ItemStack(stepMarbleBlackColumnHead, 6), "XXX", 'X', Mho.marbleBlackColumnHead);

		/** Step ancient **/
		GameRegistry.addRecipe(new ItemStack(stepAncientCobblestone, 6), "XXX", 'X', Mho.ancientCobblestone);
		GameRegistry.addRecipe(new ItemStack(stepAncientStone, 6), "XXX", 'X', Mho.ancientStone);
		GameRegistry.addRecipe(new ItemStack(stepAncientStonebrick, 6), "XXX", 'X', Mho.ancientStonebrick);
		GameRegistry.addRecipe(new ItemStack(stepAncientDoubleSlab, 6), "XXX", 'X', Mho.ancientDoubleSlab);
		GameRegistry.addRecipe(new ItemStack(stepAncientColumn, 6), "XXX", 'X', Mho.ancientColumn);
		GameRegistry.addRecipe(new ItemStack(stepAncientColumnHead, 6), "XXX", 'X', Mho.ancientColumnHead);

		/** Step marble white **/
		GameRegistry.addRecipe(new ItemStack(stepMarbleWhiteCobblestone, 6), "XXX", 'X', Mho.marbleWhiteCobblestone);
		GameRegistry.addRecipe(new ItemStack(stepMarbleWhiteStone, 6), "XXX", 'X', Mho.marbleWhiteStone);
		GameRegistry.addRecipe(new ItemStack(stepMarbleWhiteStonebrick, 6), "XXX", 'X', Mho.marbleWhiteStonebrick);
		GameRegistry.addRecipe(new ItemStack(stepMarbleWhiteDoubleSlab, 6), "XXX", 'X', Mho.marbleWhiteDoubleSlab);
		GameRegistry.addRecipe(new ItemStack(stepMarbleWhiteColumn, 6), "XXX", 'X', Mho.marbleWhiteColumn);
		GameRegistry.addRecipe(new ItemStack(stepMarbleWhiteColumnHead, 6), "XXX", 'X', Mho.marbleWhiteColumnHead);

		/** Step wooden **/
		GameRegistry.addRecipe(new ItemStack(stepWoodenStone, 6), "XXX", 'X', Mho.woodenStone);
		GameRegistry.addRecipe(new ItemStack(stepWoodenStonebrick, 6), "XXX", 'X', Mho.woodenStonebrick);
		GameRegistry.addRecipe(new ItemStack(stepWoodenDoubleSlab, 6), "XXX", 'X', Mho.woodenDoubleSlab);
		GameRegistry.addRecipe(new ItemStack(stepWoodenColumn, 6), "XXX", 'X', Mho.woodenColumn);
		GameRegistry.addRecipe(new ItemStack(stepWoodenColumnHead, 6), "XXX", 'X', Mho.woodenColumnHead);

		/** Step wooden light **/
		GameRegistry.addRecipe(new ItemStack(stepWoodenLightStone, 6), "XXX", 'X', Mho.woodenLightStone);
		GameRegistry.addRecipe(new ItemStack(stepWoodenLightStonebrick, 6), "XXX", 'X', Mho.woodenLightStonebrick);
		GameRegistry.addRecipe(new ItemStack(stepWoodenLightDoubleSlab, 6), "XXX", 'X', Mho.woodenLightDoubleSlab);
		GameRegistry.addRecipe(new ItemStack(stepWoodenLightColumn, 6), "XXX", 'X', Mho.woodenLightColumn);
		GameRegistry.addRecipe(new ItemStack(stepWoodenLightColumnHead, 6), "XXX", 'X', Mho.woodenLightColumnHead);

		/**Step ice **/
		GameRegistry.addRecipe(new ItemStack(stepIceCobblestone, 6), "XXX", 'X', Mho.iceCobblestone);
		GameRegistry.addRecipe(new ItemStack(stepIceStonebrick, 6), "XXX", 'X', Mho.icebrick);
		GameRegistry.addRecipe(new ItemStack(stepIceDoubleSlab, 6), "XXX", 'X', Mho.iceDoubleSlab);
		GameRegistry.addRecipe(new ItemStack(stepIceColumn, 6), "XXX", 'X', Mho.iceColumn);
		GameRegistry.addRecipe(new ItemStack(stepIceColumnHead, 6), "XXX", 'X', Mho.iceColumnHead);

		/**Stair tuiles **/
		GameRegistry.addRecipe(new ItemStack(Mho.stairTuileRed, 4), "X  ", "XX ", "XXX", 'X', Mho.tuileRed);
		GameRegistry.addRecipe(new ItemStack(Mho.stairTuileBlack, 4), "X  ", "XX ", "XXX", 'X', Mho.tuileBlack);
		GameRegistry.addRecipe(new ItemStack(Mho.stairTuileBlue, 4), "X  ", "XX ", "XXX", 'X', Mho.tuileBlue);
		GameRegistry.addRecipe(new ItemStack(Mho.stairTuileBlueBig, 4), "X  ", "XX ", "XXX", 'X', Mho.tuileBlueBig);
		GameRegistry.addRecipe(new ItemStack(Mho.stairTuileRedBig, 4), "X  ", "XX ", "XXX", 'X', Mho.tuileRedBig);
		GameRegistry.addRecipe(new ItemStack(Mho.stairTuileBlackBig, 4), "X  ", "XX ", "XXX", 'X', Mho.tuileBlackBig);
		GameRegistry.addRecipe(new ItemStack(Mho.stairTuileBlackAlt, 4), "X  ", "XX ", "XXX", 'X', Mho.tuileBlackAlt);

		/** Stair white **/
		GameRegistry.addRecipe(new ItemStack(Mho.stairWhiteStone, 4), "X  ", "XX ", "XXX", 'X', Mho.whiteStone);
		GameRegistry.addRecipe(new ItemStack(Mho.stairWhiteStonebrick, 4), "X  ", "XX ", "XXX", 'X', Mho.whiteStonebrick);
		GameRegistry.addRecipe(new ItemStack(Mho.stairWhiteCobblestone, 4), "X  ", "XX ", "XXX", 'X', Mho.whiteCobblestone);

		/** Stair ancient **/
		GameRegistry.addRecipe(new ItemStack(Mho.stairAncientStone, 4), "X  ", "XX ", "XXX", 'X', Mho.ancientStone);
		GameRegistry.addRecipe(new ItemStack(Mho.stairAncientStonebrick, 4), "X  ", "XX ", "XXX", 'X', Mho.ancientStonebrick);
		GameRegistry.addRecipe(new ItemStack(Mho.stairAncientCobblestone, 4), "X  ", "XX ", "XXX", 'X', Mho.ancientCobblestone);

		/** Stair marble white **/
		GameRegistry.addRecipe(new ItemStack(Mho.stairMarbleWhiteStone, 4), "X  ", "XX ", "XXX", 'X', Mho.marbleWhiteStone);
		GameRegistry.addRecipe(new ItemStack(Mho.stairMarbleWhiteStonebrick, 4), "X  ", "XX ", "XXX", 'X', Mho.marbleWhiteStonebrick);
		GameRegistry.addRecipe(new ItemStack(Mho.stairMarbleWhiteCobblestone, 4), "X  ", "XX ", "XXX", 'X', Mho.marbleWhiteCobblestone);

		/** Stair marble black **/
		GameRegistry.addRecipe(new ItemStack(Mho.stairMarbleBlackStone, 4), "X  ", "XX ", "XXX", 'X', Mho.marbleBlackStone);
		GameRegistry.addRecipe(new ItemStack(Mho.stairMarbleBlackStonebrick, 4), "X  ", "XX ", "XXX", 'X', Mho.marbleBlackStonebrick);
		GameRegistry.addRecipe(new ItemStack(Mho.stairMarbleBlackCobblestone, 4), "X  ", "XX ", "XXX", 'X', Mho.marbleBlackCobblestone);

		/** Stair ice **/
		GameRegistry.addRecipe(new ItemStack(Mho.stairIceStonebrick, 4), "X  ", "XX ", "XXX", 'X', Mho.icebrick);
		GameRegistry.addRecipe(new ItemStack(Mho.stairIceCobblestone, 4), "X  ", "XX ", "XXX", 'X', Mho.iceCobblestone);

		/** Stair wooden **/
		GameRegistry.addRecipe(new ItemStack(Mho.stairWoodenStone, 4), "X  ", "XX ", "XXX", 'X', Mho.woodenStone);
		GameRegistry.addRecipe(new ItemStack(Mho.stairWoodenStonebrick,4), "X  ", "XX ", "XXX", 'X', Mho.woodenStonebrick);

		/** Stair wooden light **/
		GameRegistry.addRecipe(new ItemStack(Mho.stairWoodenLightStone, 4), "X  ", "XX ", "XXX", 'X', Mho.woodenLightStone);
		GameRegistry.addRecipe(new ItemStack(Mho.stairWoodenLightStonebrick, 4), "X  ", "XX ", "XXX", 'X', Mho.woodenLightStonebrick);

		/** Stair sandstone new **/
		GameRegistry.addRecipe(new ItemStack(Mho.stairSandstoneStonebrick, 4), "X  ", "XX ", "XXX", 'X', Mho.sandstoneStonebrick);

		/** Paille **/
		GameRegistry.addRecipe(new ItemStack(Block.hay, 1), "XXX", "XXX", "XXX", 'X', Item.wheat);
		GameRegistry.addRecipe(new ItemStack(Item.wheat, 9), "X", 'X', Block.hay);
		GameRegistry.addRecipe(new ItemStack(Mho.stepStraw, 6), "XXX", 'X', Block.hay);
		GameRegistry.addRecipe(new ItemStack(Mho.stairStraw, 4), "X  ", "XX ", "XXX", 'X', Block.hay);

		/** Colombages **/
		GameRegistry.addRecipe(new ItemStack(colombageCarre, 4), "XXX", "XYX", "XXX", 'X', new ItemStack(Block.planks,1,0), 'Y', Mho.whiteStone);
		GameRegistry.addRecipe(new ItemStack(colombageCroise, 4), "XYX", "YXY", "XYX", 'X', new ItemStack(Block.planks,1,0), 'Y', Mho.whiteStone);
		GameRegistry.addRecipe(new ItemStack(colombageVertical, 4), "YXY", "YXY", "YXY", 'X', new ItemStack(Block.planks,1,0), 'Y', Mho.whiteStone);
		GameRegistry.addRecipe(new ItemStack(colombageHorizontal, 4), "YYY", "XXX", "YYY", 'X', new ItemStack(Block.planks,1,0), 'Y', Mho.whiteStone);
		GameRegistry.addRecipe(new ItemStack(colombageGauche, 4), "XYY", "YXY", "YYX", 'X', new ItemStack(Block.planks,1,0), 'Y', Mho.whiteStone);
		GameRegistry.addRecipe(new ItemStack(colombageDroite, 4), "YYX", "YXY", "XYY", 'X', new ItemStack(Block.planks,1,0), 'Y', Mho.whiteStone);

		/** Colombages fonces **/
		GameRegistry.addRecipe(new ItemStack(colombageCarreFonce, 4), "XXX", "XYX", "XXX", 'X', new ItemStack(Block.planks,1,1), 'Y', Mho.whiteStone);
		GameRegistry.addRecipe(new ItemStack(colombageCroiseFonce, 4), "XYX", "YXY", "XYX", 'X', new ItemStack(Block.planks,1,1), 'Y', Mho.whiteStone);
		GameRegistry.addRecipe(new ItemStack(colombageVerticalFonce, 4), "YXY", "YXY", "YXY", 'X', new ItemStack(Block.planks,1,1), 'Y', Mho.whiteStone);
		GameRegistry.addRecipe(new ItemStack(colombageHorizontalFonce, 4), "YYY", "XXX", "YYY", 'X', new ItemStack(Block.planks,1,1), 'Y', Mho.whiteStone);
		GameRegistry.addRecipe(new ItemStack(colombageGaucheFonce, 4), "XYY", "YXY", "YYX", 'X', new ItemStack(Block.planks,1,1), 'Y', Mho.whiteStone);
		GameRegistry.addRecipe(new ItemStack(colombageDroiteFonce, 4), "YYX", "YXY", "XYY", 'X', new ItemStack(Block.planks,1,1), 'Y', Mho.whiteStone);

		/** Lanternes et lampions **/
		GameRegistry.addRecipe(new ItemStack(stepLanternWood, 6), "XXX", 'X', Mho.woodenLantern);
		GameRegistry.addRecipe(new ItemStack(stepLanternIron, 6), "XXX", 'X', Mho.ironLantern);
		GameRegistry.addRecipe(new ItemStack(Mho.ironLantern, 2), "XYX", 'X', Item.ingotIron, 'Y', Block.glowStone);
		GameRegistry.addRecipe(new ItemStack(Mho.woodenLantern, 1), "XXX", "XYX", "XXX", 'X', Item.stick, 'Y', Block.glowStone);

		GameRegistry.addShapelessRecipe(new ItemStack (Mho.lampionBlanc,1,0), Block.glowStone, new ItemStack(Item.dyePowder,1,15));
		GameRegistry.addShapelessRecipe(new ItemStack (Mho.lampionBleu,1,0), Block.glowStone, new ItemStack(Item.dyePowder,1,12));
		GameRegistry.addShapelessRecipe(new ItemStack (Mho.lampionJaune,1,0), Block.glowStone, new ItemStack(Item.dyePowder,1,11));
		GameRegistry.addShapelessRecipe(new ItemStack (Mho.lampionVert,1,0), Block.glowStone, new ItemStack(Item.dyePowder,1,10));
		GameRegistry.addShapelessRecipe(new ItemStack (Mho.lampionRouge,1,0), Block.glowStone, new ItemStack(Item.dyePowder,1,1));

		/** Smelting **/
		GameRegistry.addSmelting(ConfigCore.whiteCobblestoneID, new ItemStack(Mho.whiteStone,1,0), 0);
		GameRegistry.addSmelting(ConfigCore.ancientCobblestoneID, new ItemStack(Mho.ancientStone, 1, 0), 0);
		GameRegistry.addSmelting(ConfigCore.marbleWhiteCobblestoneID, new ItemStack(Mho.marbleWhiteStone, 1, 0), 0);
		GameRegistry.addSmelting(ConfigCore.marbleBlackCobblestoneID, new ItemStack(Mho.marbleBlackStone, 1, 0), 0);
	}

	/**4**/
	@ServerStarting
	public void serverStarting(FMLServerStartingEvent event)
	{
		CommandHandler2.initCommands(event);
	}

	private void addAchievementName(String ach, String name)
	{
		LanguageRegistry.instance().addStringLocalization("achievement." + ach, "en_US", name);
	}

	private void addAchievementDesc(String ach, String desc)
	{
		LanguageRegistry.instance().addStringLocalization("achievement." + ach + ".desc", "en_US", desc);
	}

	void addAchievementLocalizations()
	{
		/**this.addAchievementName("obsiIngot", "Lingot d'Obsidian");
                   this.addAchievementDesc("obsiIngot", "Fondre une obsidian.");**/
	}

}