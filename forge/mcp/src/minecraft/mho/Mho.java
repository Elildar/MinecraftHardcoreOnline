package mho;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

import mho.block.build.BlockColumnHead;
import mho.block.build.BlockCristalMho;
import mho.block.build.BlockDoubleCrate;
import mho.block.build.BlockGrisou;
import mho.block.build.BlockIceMho;
import mho.block.build.BlockInvisible;
import mho.block.build.BlockMetaWoolLight;
import mho.block.build.BlockRedRockLines;
import mho.block.build.BlockRockGrass;
import mho.block.build.BlockSlime;
import mho.block.build.BlockStainedGlass;
import mho.block.build.BlockTimbered;
import mho.block.deco.BlockBook;
import mho.block.deco.BlockCake;
import mho.block.deco.BlockCakeLie;
import mho.block.deco.BlockCarpet;
import mho.block.deco.BlockChain;
import mho.block.deco.BlockCoralBreath;
import mho.block.deco.BlockCoralDamage;
import mho.block.deco.BlockCoralPlant;
import mho.block.deco.BlockCristal;
import mho.block.deco.BlockDoubleBrightLower;
import mho.block.deco.BlockDoubleBrightUpper;
import mho.block.deco.BlockDoubleGrassLower;
import mho.block.deco.BlockDoubleGrassUpper;
import mho.block.deco.BlockDragonPortal;
import mho.block.deco.BlockFlowerMho;
import mho.block.deco.BlockLadderMho;
import mho.block.deco.BlockLeavesMho;
import mho.block.deco.BlockPaneMho;
import mho.block.deco.BlockPike;
import mho.block.deco.BlockReedMho;
import mho.block.deco.BlockRopeRail;
import mho.block.deco.BlockSecretDoor;
import mho.block.deco.BlockSecretTrapDoor;
import mho.block.deco.BlockSign;
import mho.block.deco.BlockStainedGlassPane;
import mho.block.deco.BlockTorchMho;
import mho.block.deco.BlockVineMho;
import mho.block.generic.BlockAnim;
import mho.block.generic.BlockAnvilMho;
import mho.block.generic.BlockDirectionalSimple;
import mho.block.generic.BlockDirectionalTopBot;
import mho.block.generic.BlockFenceMho;
import mho.block.generic.BlockGlassMho;
import mho.block.generic.BlockGrassMho;
import mho.block.generic.BlockLogMho;
import mho.block.generic.BlockMcComplete;
import mho.block.generic.BlockMho;
import mho.block.generic.BlockSixFaces;
import mho.block.generic.BlockStairsMho;
import mho.block.generic.BlockStepMho;
import mho.block.generic.BlockStoneMho;
import mho.block.generic.BlockTransparent;
import mho.block.generic.BlockWallMho;
import mho.core.ConfigCore;
import mho.core.TabMho;
import mho.core.command.CommandHandler;
import mho.core.event.CraftEventHandler;
import mho.core.event.PotionEventHandler;
import mho.core.sound.SoundHandler;
import mho.item.ItemBadge;
import mho.item.ItemDoll;
import mho.item.ItemEnchant;
import mho.item.ItemGrey;
import mho.item.ItemMagicPowder;
import mho.item.ItemMho;
import mho.item.ItemPocketCraftingTable;
import mho.item.ItemScrollTpValys;
import mho.item.ItemTeddyBear;
import mho.item.combat.ItemArmorMho;
import mho.item.combat.ItemSourcelame;
import mho.item.combat.ItemStove;
import mho.item.combat.ItemSwordLegendaryDiurnal;
import mho.item.combat.ItemSwordLegendaryNocturnal;
import mho.item.combat.ItemSwordMho;
import mho.item.food.ItemFoodBeer;
import mho.item.food.ItemFoodMho;
import mho.item.food.ItemFoodRhum;
import mho.item.potion.PotionCustomEffect;
import mho.item.potion.PotionLavaWalk;
import mho.item.potion.PotionMho;
import mho.item.potion.PotionNoFall;
import mho.item.potion.PotionWaterWalk;
import mho.item.quest.ItemQuest;
import mho.item.quest.ItemQuestNezarilJar;
import mho.itemblock.ItemBlockDoubleCrate;
import mho.itemblock.ItemBlockSecretDoor;
import mho.itemblock.ItemBlockStainedGlass;
import mho.itemblock.ItemBlockStainedGlassPane;
import mho.itemblock.ItemBlockWoolLight;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod(modid = "MMHO", name = "MMHO's mod", version = "1.0.3")

@NetworkMod(clientSideRequired=true, serverSideRequired=false)

public class Mho
{	
	public static final String modid = "mho";

	@SidedProxy(clientSide = "mho.ClientProxy", serverSide = "mho.CommonProxy")
	public static CommonProxy proxy;
	public static ClientProxy proxya;

	//////////////////// DECLARATION ////////////////////
	
	/** ==================== Tabs ==================== **/
	public static CreativeTabs tabMhoBlocks = new TabMho(CreativeTabs.getNextID(),"Mho : Blocs");
	public static CreativeTabs tabMhoStairs = new TabMho(CreativeTabs.getNextID(),"Mho : Escaliers");
	public static CreativeTabs tabMhoFences = new TabMho(CreativeTabs.getNextID(),"Mho : Barri\u00e8res");
	public static CreativeTabs tabMhoDecorations = new TabMho(CreativeTabs.getNextID(),"Mho : D\u00e9corations");
	public static CreativeTabs tabMhoItems = new TabMho(CreativeTabs.getNextID(), "Mho : Items");
	public static CreativeTabs tabMhoPotions = new TabMho(CreativeTabs.getNextID(), "Mho : Potions");
	public static CreativeTabs tabMhoQuest = new TabMho(CreativeTabs.getNextID(), "MHO : Items de qu\u00eate");
	public static CreativeTabs tabMhoCombat = new TabMho(CreativeTabs.getNextID(), "MHO : Combat");
	public static CreativeTabs tabMhoEnchant = new TabMho(CreativeTabs.getNextID(), "MHO : Runes"); 
	public static CreativeTabs tabMhoGrey = new TabMho(CreativeTabs.getNextID(), "MHO : Items gris");

	/** ==================== Items ==================== **/

	/** Item Quest **/
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
	public static Item nezarilJar;
	public static Item nezarilJarFull;
	public static Item redDragonEgg;

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
	public static Item heart;
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
	public static Item zombieArm;
	public static Item zombieBrain;

	/** Poupee **/
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

	/** Enchant **/
	public static Item enchantSharpnessSmall;
	public static Item enchantSharpnessMedium;
	public static Item enchantSharpnessBig;

	public static Item enchantSmiteSmall;
	public static Item enchantSmiteMedium;
	public static Item enchantSmiteBig;

	public static Item enchantProtectionSmall;
	public static Item enchantProtectionBig;

	public static Item enchantBaneofSmall;
	public static Item enchantBaneofMedium;
	public static Item enchantBaneofBig;

	public static Item enchantEfficacitySmall;
	public static Item enchantEfficacityMedium;
	public static Item enchantEfficacityBig;

	public static Item enchantDurabilitySmall;
	public static Item enchantDurabilityMedium;
	public static Item enchantDurabilityBig;

	public static Item enchantFlameSmall;
	public static Item enchantFlameBig;

	public static Item enchantKnockbackSmall;
	public static Item enchantKnockbackBig;

	/** Insignes **/
	public static Item badgeValys;
	public static Item badgeChasse;
	public static Item badgeGuerre;
	public static Item badgeAgriculture;
	public static Item badgeGastronomie;
	public static Item badgeMinage;
	public static Item badgeArtisanat;
	public static Item badgeVille;
	public static Item badgePeche;
	public static Item badgeExploration;
	public static Item badgeConstruction;
	public static Item badgeGuilde;
	public static Item badgeVictoire;
	public static Item badgeParticipation;
	public static Item badgeMagie;

	/** Food **/
	public static Item mug;
	public static Item beer;
	public static Item foodHamburger;
	public static Item foodFries;
	public static Item foodKfc;
	public static Item foodEgg;
	public static Item foodBacon;
	public static Item foodCheese;
	public static Item foodMaki;
	public static Item foodSushi;
	public static Item foodSkewer;
	public static Item rhum;

	/** ProjectileNPC **/
	public static Item npcProjectileWhite;
	public static Item npcProjectileYellow;
	public static Item npcProjectileGreen;
	public static Item npcProjectilePurple;
	public static Item npcProjectileRed;
	public static Item npcProjectileGrey;
	public static Item npcProjectileBlue;

	/** Legendary **/
	public static Item legendaryNocturnal;
	public static Item legendaryDiurnal;
	static EnumToolMaterial legendaryDiurnalTool = EnumHelper.addToolMaterial("legendaryDiurnalTool", 0, 9, 0.0F, 0, 0);
	static EnumToolMaterial legendaryNocturnalTool = EnumHelper.addToolMaterial("legendaryNocturnalTool", 0, 9, 0.0F, 0, 0);
	
	/** Sword **/
	public static Item stove;
	public static Item scepterRed;
	public static Item scepterBlue;
	public static Item scepterGreen;
	public static Item hammerWood;
	public static Item hammerStone;
	public static Item hammerIron;
	public static Item rapier;
	public static Item runeblade;
	public static Item sourcelame;
	
	static EnumToolMaterial stoveTool = EnumHelper.addToolMaterial("stoveTool", 1, 250, 5.0F, 2, 0);
	static EnumToolMaterial noDmgTool = EnumHelper.addToolMaterial("noDmgTool", 0, 9, 0.0F, 0, 0);
	static EnumToolMaterial sourcelameTool = EnumHelper.addToolMaterial("sourcelameTool", 1, 5000, 10.0F, 6, 0);

	/** Potions **/
	public static Item potionCelerity;
	public static Item potionFatigue;
	public static Item potionJump;
	public static Item potionConfusion;
	public static Item potionResistance;
	public static Item potionApnea;
	public static Item potionBlindness;
	public static Item potionHunger;
	public static Item potionWither;
	public static Item noFallPotion;

	public static Item potionCustomEffectWaterWalk;
	public static Item potionCustomEffectLavaWalk;
	public static Item potionCustomEffectNoFall;
	
	public static Item testSplash;

	/** CustomPotionEffect **/
	public static Potion effectPotionWaterWalk;
	public static Potion effectPotionLavaWalk;
	public static Potion effectPotionNoFall;

	/** Scroll **/
	public static Item minorValysScroll;
	public static Item mediumValysScroll;
	public static Item majorValysScroll;

	/** Key **/
	public static Item goldKey;
	public static Item silverKey;
	public static Item bronzeKey;
	public static Item goldSmallKey;
	public static Item silverSmallKey;
	public static Item bronzeSmallKey;

	/** Coin **/
	public static Item bronzeCoin;
	public static Item silverCoin;
	public static Item goldCoin;
	public static Item diamondCoin;

	/** Trophee **/
	public static Item trophyGold;
	public static Item trophySilver;
	public static Item trophyBronze;
	public static Item trophyGoldChip;

	/** Specials **/
	public static Item eyeCover;
	static EnumArmorMaterial eyeCoverArmor = EnumHelper.addArmorMaterial("armureCacheOeil", 0, new int[]{0, 0, 0, 0}, 0);
	public static Item pocketCraftingTable;
	public static Item magicPowder;
	public static Item teddyBear;

	/** Classics **/
	public static Item diamondShine;
	public static Item cards;
	public static Item magicDust;

	/** ==================== Blocks ==================== **/
	
	/** Sets Of Material **/
	/** Whitestone **/
	public static Block whiteStone;
	public static Block whiteCobblestone;
	public static Block whiteStonebrick;
	public static Block whiteStonebrickRound;
	public static Block whiteStoneDoubleSlab;
	public static Block whiteStoneColumn;
	public static Block whiteStoneColumnHead;

	/** Stone **/
	public static Block stoneColumn;
	public static Block stoneColumnHead;

	/** Sandstone **/
	public static Block sandstoneStonebrick;
	public static Block sandstoneStonebrickRound;
	public static Block sandstoneColumn;
	public static Block sandstoneColumnHead;
	public static Block sandstoneDoubleSlab;

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

	/** Black Marble **/
	public static Block marbleBlackCobblestone;
	public static Block marbleBlackStone;
	public static Block marbleBlackStonebrick;
	public static Block marbleBlackStonebrickRound;
	public static Block marbleBlackDoubleSlab;
	public static Block marbleBlackColumn;
	public static Block marbleBlackColumnHead;

	public static Block marbleCheck;

	/** Ice **/
	public static Block iceCobblestone;
	public static Block iceStonebrick;
	public static Block iceStonebrickRound;
	public static Block iceDoubleSlab;
	public static Block iceColumn;
	public static Block iceColumnHead;

	/** Wood **/
	public static Block woodenStone;
	public static Block woodenStonebrick;
	public static Block woodenStonebrickRound;
	public static Block woodenDoubleSlab;
	public static Block woodenColumn;
	public static Block woodenColumnHead;

	/** Wood light **/
	public static Block woodenLightStone;
	public static Block woodenLightStonebrick;
	public static Block woodenLightStonebrickRound;
	public static Block woodenLightDoubleSlab;
	public static Block woodenLightColumn;
	public static Block woodenLightColumnHead;

	/** Metal **/
	public static Block metalCheck;
	public static Block metalStonebrickRound;
	public static Block metalDoubleSlab;

	/**Basalt**/
	public static Block basalt;
	public static Block basaltCobblestone;
	public static Block basaltStonebrick;

	/** Sets Of Natural Blocks **/
	/** Ice **/
	public static Block iceLog;
	public static Block iceLeavesLight;
	public static Block iceLeaves;
	public static Block icePlank;

	/** Dark **/
	public static Block darkStone;
	public static Block darkCobblestone;
	public static Block darkDirt;
	public static Block darkGrassBlock;
	public static Block darkLog;
	public static Block darkLeaves;

	/** Mysterious **/
	public static Block mysteriousStone;
	public static Block mysteriousDirt;
	public static Block mysteriousGrassBlock;
	public static Block mysteriousLog;
	public static Block mysteriousLeaves;
	public static Block mysteriousLeavesPurple;
	
	public static Block mysteriousFlower;
	public static Block mysteriousPlantPurple;
	public static Block mysteriousCoral;
	public static Block mysteriousAlgue;
	public static Block mysteriousPlant;
	public static Block mysteriousReed;
	public static Block mysteriousGrass;

	/** Red Rock **/
	public static Block redGrassBlock;
	public static Block redGravel;
	public static Block redRockLines;
	public static Block redRockBigLine;
	public static Block redSilver;

	/** Rocks **/
	public static Block greyRock;
	public static Block greyRockGrass;
	public static Block brownRock;
	public static Block brownRockGrass;
	public static Block darkRock;
	public static Block darkRockGrass;
	public static Block blackRock;
	public static Block lavaRock;
	public static Block lavaRockRed;

	/** Colombages **/
	public static Block timberedSquare;
	public static Block timberedCross;
	public static Block timberedVertical;
	public static Block timberedHorizontal;
	public static Block timberedLeft;
	public static Block timberedRight;

	public static Block timberedSquareDark;
	public static Block timberedCrossDark;
	public static Block timberedVerticalDark;
	public static Block timberedHorizontalDark;
	public static Block timberedLeftDark;
	public static Block timberedRightDark;

	/** Signs **/
	public static Block signAlchemy;
	public static Block signBank;
	public static Block signForge;
	public static Block signShield;
	public static Block signSanctuary;
	public static Block signArmory;
	public static Block signLibrary;
	public static Block signRestaurant;
	public static Block signTavern;
	public static Block signMaterials;
	public static Block signHostel;
	public static Block signStable;
	public static Block signDiamond;
	public static Block signPho;
	public static Block signCrystal;
	
	/** Corals **/
	public static Block coralOrange;
	public static Block coralGreen;
	public static Block coralPurple;
	public static Block coralRose;
	public static Block coralBlack;
	public static Block coralBlue;
	
	public static Block coralBlockReef;
	public static Block coralBlockSponge;

	/** Double Blocks **/
	public static Block doubleCrateBlock;
	public static Item doubleCrateItemBlock;
	
	public static Block doubleTorchLower;
	public static Block doubleTorchUpper;
	public static Block doubleCandleLower;
	public static Block doubleCandleUpper;
	public static Block doubleLanternLower;
	public static Block doubleLanternUpper;

	public static Block normalDoubleGrassLower;
	public static Block normalDoubleGrassUpper;
	public static Block savanaDoubleGrassLower;
	public static Block savanaDoubleGrassUpper;
	public static Block mysteriousDoubleGrassLower;
	public static Block mysteriousDoubleGrassUpper;

	/** Meta **/
	public static Block metaWoolLight;
	public static Block metaVitrail;
	public static Block metaVitrailPane;
	private static final String[] dyeFemNames = { "blanche", "orange", "magenta", "bleue claire", "jaune", "verte claire",
		"rose", "grise", "grise claire", "cyan", "violette", "bleue", "marron", "verte", "rouge", "noire"};
	private static final String[] dyeMalNames = { "blanc", "orange", "magenta", "bleu clair", "jaune", "vert clair",
		"rose", "gris", "gris clair", "cyan", "violet", "bleu", "marron", "vert", "rouge", "noir"};
	
	/** Lumineux **/
	public static Block lanternWood;
	public static Block lanternIron;

	public static Block lampionBlanc;
	public static Block lampionBleu;
	public static Block lampionJaune;
	public static Block lampionVert;
	public static Block lampionRouge;

	public static Block lightCandle;
	public static Block lightLantern;
	public static Block lightSkullCandle;
	public static Block lightSkullSpike;

	/** Classic Blocks **/
	public static Block crossCrate;
	public static Block barredCrate;
	public static Block leatherBlock;
	public static Block PHOnoir;
	public static Block PHOblanc;
	public static Block silverBlock;
	public static Block obsidianBlock;
	public static Block shoji;
	public static Block cristalBlock;

	public static Block tileArdoise;
	public static Block tileRed;
	public static Block tileBlack;
	public static Block tileBlue;
	public static Block tileRedBig;
	public static Block tileBlackBig;
	public static Block tileBlueBig;
	public static Block tileBlackAlt;

	/** Special Blocks **/
	public static Block meatBlock;
	public static Block fossileBlock;

	public static Block simpleDirtBlock;
	public static Block completeLogSpruce;
	public static Block completeLogOak;

	public static Block vaillantCrate;

	public static Block ironWindow;
	public static Block metalGrid;

	public static Block woeBlock;
	
	public static Block lavaBlock;
	public static Block waterBlock;
	public static Block logCherry;
	public static Block logRed;
	public static Block barrel;

	public static Block ironWindowPane;

	public static Block grisouBlock;
	public static Block slimeBlock;
	public static Block invisibleBlock;
	public static Block portalPurple;
	public static Block bookBlock;
	public static Block chainIron;
	public static Block chainRope;
	public static Block ropeRail;
	public static Block spikes;
	public static Block climbingLadder;
	public static Block roseVines;
	public static Block cristalLittle;
	public static Block cristalBig;
	public static Block cakeLieBlock;
	public static Block meatCakeBlock;
	public static Block eternalIceBlock;

	/** Secret **/ 
    public static Block blockSecretDoorWood;
    public static Block blockSecretDoorIron;
    public static Block blockSecretTrapDoor;
    
    public static Item itemBlockSecretDoorWood;
    public static Item itemBlockSecretDoorIron;

	/** Stairs **/
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
	public static Block stairStraw;

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

	public static Block stairWhiteStone;
	public static Block stairWhiteCobblestone;
	public static Block stairWhiteStonebrick;

	public static Block stairSandstoneStonebrick;

	public static Block stairAncientStone;
	public static Block stairAncientCobblestone;
	public static Block stairAncientStonebrick;

	public static Block stairIceCobblestone;
	public static Block stairIceStonebrick;

	public static Block stairMarbleWhiteStone;
	public static Block stairMarbleWhiteCobblestone;
	public static Block stairMarbleWhiteStonebrick;

	public static Block stairMarbleBlackStone;
	public static Block stairMarbleBlackCobblestone;
	public static Block stairMarbleBlackStonebrick;
	public static Block stairMarbleCheck;

	public static Block stairWoodenStone;
	public static Block stairWoodenStonebrick;

	public static Block stairWoodenLightStone;
	public static Block stairWoodenLightStonebrick;

	public static Block stairArdoise;
	public static Block stairTileBlack;
	public static Block stairTileRed;
	public static Block stairTileBlue;
	public static Block stairTileBlackBig;
	public static Block stairTileBlueBig;
	public static Block stairTileRedBig;
	public static Block stairTileBlackAlt;
	
	/** Steps **/
	public static Block stepGrass;
	public static Block stepDirt;
	public static Block stepGravel;
	public static Block stepWoodOak;
	public static Block stepWoodSpruce;
	public static Block stepWoodBirch;
	public static Block stepWoodJungle;
	public static Block stepCobbleMossy;
	public static Block stepObsidian;
	public static Block stepIce;
	public static Block stepSnow;
	public static Block stepStonebrickMossy;
	public static Block stepStonebrickCracked;
	public static Block stepEnderstone;
	public static Block stepSand;
	public static Block stepStraw;

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

	public static Block stepStoneColumn;
	public static Block stepStoneColumnHead;

	public static Block stepWhiteStone;
	public static Block stepWhiteStonebrick;
	public static Block stepWhiteColumn;
	public static Block stepWhiteColumnHead;
	public static Block stepWhiteCobblestone;
	public static Block stepWhiteDoubleSlab;

	public static Block stepSandstoneDoubleSlab;
	public static Block stepSandstoneColumn;
	public static Block stepSandstoneColumnHead;
	public static Block stepSandstoneStonebrick;

	public static Block stepAncientCobblestone;
	public static Block stepAncientStone;
	public static Block stepAncientStonebrick;
	public static Block stepAncientDoubleSlab;
	public static Block stepAncientColumn;
	public static Block stepAncientColumnHead;

	public static Block stepIceCobblestone;
	public static Block stepIceStonebrick;
	public static Block stepIceDoubleSlab;
	public static Block stepIceColumn;
	public static Block stepIceColumnHead;

	public static Block stepMarbleWhiteCobblestone;
	public static Block stepMarbleWhiteStone;
	public static Block stepMarbleWhiteStonebrick;
	public static Block stepMarbleWhiteDoubleSlab;
	public static Block stepMarbleWhiteColumn;
	public static Block stepMarbleWhiteColumnHead;

	public static Block stepMarbleBlackCobblestone;
	public static Block stepMarbleBlackStone;
	public static Block stepMarbleBlackStonebrick;
	public static Block stepMarbleBlackDoubleSlab;
	public static Block stepMarbleBlackColumn;
	public static Block stepMarbleBlackColumnHead;

	public static Block stepMarbleCheck;
	
	public static Block stepWoodenStone;
	public static Block stepWoodenStonebrick;
	public static Block stepWoodenDoubleSlab;
	public static Block stepWoodenColumn;
	public static Block stepWoodenColumnHead;

	public static Block stepWoodenLightStone;
	public static Block stepWoodenLightStonebrick;
	public static Block stepWoodenLightDoubleSlab;
	public static Block stepWoodenLightColumn;
	public static Block stepWoodenLightColumnHead;

	public static Block stepMetal;

	public static Block stepArdoise;
	public static Block stepTileRed;
	public static Block stepTileBlue;
	public static Block stepTileBlack;
	public static Block stepTileRedBig;
	public static Block stepTileBlueBig;
	public static Block stepTileBlackBig;
	public static Block stepTileBlackAlt;

	public static Block stepLanternWood;
	public static Block stepLanternIron;
	
	/** Walls **/
	public static Block wallSandstone;
	public static Block wallPlankOak;
	public static Block wallBrick;
	public static Block wallStonebrick;
	public static Block wallNetherbrick;
	public static Block wallWoodOak;
	public static Block wallWoodSpruce;
	public static Block wallWoodBirch;
	public static Block wallWoodJungle;

	public static Block wallWhiteStone;
	public static Block wallWhiteCobblestone;
	public static Block wallWhiteStonebrick;

	public static Block wallAncientStone;
	public static Block wallAncientStonebrick;
	public static Block wallAncientCobblestone;

	public static Block wallIceCobblestone;
	public static Block wallIceStonebrick;
	
	public static Block wallMarbleWhiteStone;
	public static Block wallMarbleWhiteStonebrick;
	public static Block wallMarbleWhiteCobblestone;

	public static Block wallMarbleBlackStone;
	public static Block wallMarbleBlackStonebrick;
	public static Block wallMarbleBlackCobblestone;

	public static Block wallWoodenStone;
	public static Block wallWoodenStonebrick;

	public static Block wallWoodenLightStone;
	public static Block wallWoodenLightStonebrick;

	/** Fence **/
	public static Block fenceWhiteStone;
	public static Block fenceWhiteStonebrick;
	public static Block fenceWhiteCobblestone;

	public static Block fenceAncientStone;
	public static Block fenceAncientStonebrick;
	public static Block fenceAncientCobblestone;

	public static Block fenceIceCobblestone;
	public static Block fenceIceStonebrick;

	public static Block fenceMarbleWhiteStone;
	public static Block fenceMarbleWhiteStonebrick;
	public static Block fenceMarbleWhiteCobblestone;

	public static Block fenceMarbleBlackStone;
	public static Block fenceMarbleBlackStonebrick;
	public static Block fenceMarbleBlackCobblestone;

	public static Block fenceWoodenStone;
	public static Block fenceWoodenStonebrick;

	public static Block fenceWoodenLightStone;
	public static Block fenceWoodenLightStonebrick;
	
	/** Balustrades **/
	public static Block anvilWhiteStone;
	public static Block anvilWhiteStonebrick;
	public static Block anvilSandstoneStonebrick;
	public static Block anvilAncientStone;
	public static Block anvilAncientStonebrick;
	public static Block anvilIceStonebrick;
	public static Block anvilMarbleWhite;
	public static Block anvilMarbleWhiteStonebrick;
	public static Block anvilMarbleBlack;
	public static Block anvilMarbleBlackStonebrick;

	public static Block anvilWoodenStone;
	public static Block anvilWoodenStonebrick;
	public static Block anvilWoodenLightStone;
	public static Block anvilWoodenLightStonebrick;
	
	public static Block anvilWoodOak;
	public static Block anvilPlankJungle;
	public static Block anvilPlankOak;
	public static Block anvilPlankBirch;
	public static Block anvilPlankSpruce;

	/** Carpet **/
	public static Block carpetDirt;
	public static Block carpetGravel;
	public static Block carpetStone;
	public static Block carpetStonebrick;
	public static Block carpetLogOakTop;
	public static Block carpetPlankOak;
	public static Block carpetPlankSpruce;
	public static Block carpetLogOak;
	public static Block carpetLogSpruce;

	/** Unused **/
	public static Item seedHoublon;
	public static Item houblon;
	public static Block cropHoublon;
	public static Item rotator;
	public static Item cannePeche;
	public static Block liquideVertFlowing;
	public static Block liquideVertStill;
	public static Block liquideVioletFlowing;
	public static Block liquideVioletStill;

	// TODO Presentoire de vitrine 197
	
	/**Achievement**/
	public static CraftEventHandler craftHandler = new CraftEventHandler();


/** ==========1========== preInit ==========1========== **/
	@EventHandler		//Config
	public void preInit(FMLPreInitializationEvent event)
	{
		/**Load Custom Sound**/
		MinecraftForge.EVENT_BUS.register(new SoundHandler());
		/**Load Custom Event**/
		MinecraftForge.EVENT_BUS.register(new PotionEventHandler());

		ConfigCore cc = new ConfigCore();
		ConfigCore.loadConfig(event);

		/** ==================== Items ==================== **/

		/** Item Quest **/
		initQuestItems(cc);

		/** Item gris **/
		initGreyItems(cc);

		/** Poupee **/
		initDolls(cc);

		/** Enchant **/
		initRunes(cc);

		/** Insignes **/
		initBadges(cc);
		
		/** Food **/
		initFoods(cc);

		/** ProjectileNPC - Sword **/
		initCombat(cc);
		
		/** Potions **/
		initPotions(cc);
		
		/** Scroll - Key - Coin - Trophee - Specials - Classics **/
		initOtherItems(cc);

		
		/** ==================== Blocks ==================== **/
		
		/** Whitestone - Stonebrick - Sandstone - Ancient stone - White Marble - Black Marble - Ice - Wood - Wood light - Metal - Basalt **/
		initSetsOfMaterial(cc);

		/** Ice - Dark - Mysterious - Red Rock - Rocks **/
		initSetsOfNaturalBlocks(cc);

		/** Colombages **/
		initTimbereds(cc);

		/** Signs **/
		initSigns(cc);
		
		/** Corals **/
		initCorals(cc);

		/** Double Blocks **/
		initDoubleBlocks(cc);

		/** Meta **/
		initMetaBlocks(cc);
		
		/** Lumineux **/
		initBrightBlocks(cc);

		/** Classic Blocks **/
		initSimpleBlocks(cc);

		/** Special Blocks **/
		initSpecialBlocks(cc);

		/** Stairs **/
		initStairs(cc);
		
		/** Steps **/
		initSteps(cc);
		
		/** Walls **/
		initWalls(cc);
		
		/** Fence **/
		initFences(cc);
		
		/** Balustrades **/
		initAnvils(cc);

		/** Carpet **/
		initCarpets(cc);

		
		
		
		
		
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
		

		proxy.registerTextures();
		proxy.registerRenderEntity();
		proxy.initCustomRarityTypes();
		proxy.registerServerTickHandler();
		proxy.registerRenderInformation();
		proxy.initCapes(); 
		this.addAchievementLocalizations();
		GameRegistry.registerCraftingHandler(craftHandler);

		/** Item language **/


		/**CustomPotionEffect**/
		effectPotionWaterWalk = (new PotionCustomEffect(30, false, 0)).setPotionName("potion.effectPotionWaterWalk");
		LanguageRegistry.instance().addStringLocalization("potion.effectPotionWaterWalk", "Marche sur l'eau");

		effectPotionLavaWalk = (new PotionCustomEffect(31, false, 0)).setPotionName("potion.effectPotionLavaWalk");
		LanguageRegistry.instance().addStringLocalization("potion.effectPotionLavaWalk", "Marche sur la lave");

		effectPotionNoFall = (new PotionCustomEffect(29, false, 0)).setPotionName("potion.effectPotionNoFall");
		LanguageRegistry.instance().addStringLocalization("potion.effectPotionNoFall", "R\u00e9sistance \u00e0 la chute");
		
		
	}
	
/** ==========2========== Init ==========2========== **/
	@EventHandler
	public void Init(FMLInitializationEvent event)
	{
		((TabMho) tabMhoBlocks).setIconItem(Mho.whiteStonebrick.blockID);
		((TabMho) tabMhoStairs).setIconItem(Mho.stairWhiteStonebrick.blockID);
		((TabMho) tabMhoFences).setIconItem(Mho.wallWhiteStonebrick.blockID);
		((TabMho) tabMhoDecorations).setIconItem(Mho.lightLantern.blockID);
		((TabMho) tabMhoItems).setIconItem(Mho.goldKey.itemID);
		((TabMho) tabMhoPotions).setIconItem(Mho.potionCustomEffectLavaWalk.itemID);
		((TabMho) tabMhoQuest).setIconItem(Mho.grimoireSeth.itemID);
		((TabMho) tabMhoCombat).setIconItem(Mho.stove.itemID);
		((TabMho) tabMhoEnchant).setIconItem(Mho.enchantFlameBig.itemID); 
		((TabMho) tabMhoGrey).setIconItem(Mho.ghastTentacle.itemID);
	}

/** ==========3========== postInit ==========3========== **/
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{   
		/** ==================== Recipe Items ==================== **/
		
		/** Enchant **/
		addRecipeRunes();

		/** Food **/
		addRecipeFoods();

		/** Others **/
		addRecipeOtherItems();
		
		/** ==================== Recipe Blocks ==================== **/

		/** Whitestone - Stonebrick - Sandstone - Ancient stone - White Marble - Black Marble - Ice - Wood - Wood light - Metal - Basalt **/
		addRecipeSetsOfMaterials();

		/** Ice - Dark - Mysterious - Red Rock - Rocks **/
		addRecipeSetsOfNaturalBlocks();
		
		/** Colombages **/
		addRecipeTimbereds();

		/** Double Blocks **/
		addRecipeDoubleBlocks();

		/** Meta **/
		addRecipeMetaBlocks();
		
		/** Lumineux **/
		addRecipeBrightBlocks();

		/** Classic Blocks **/
		addRecipeSimpleBlocks();

		/** Special Blocks **/
		addRecipeSpecialBlocks();
		
		/** Stairs **/
		addRecipeStairs();
		
		/** Steps **/
		addRecipeSteps();
		
		/** Walls **/
		addRecipeWalls();
		
		/** Fence **/
		addRecipeFences();
		
		/** Balustrades **/
		addRecipeAnvils();

		/** Carpet **/
		addRecipeCarpets();
	}

/** ==================== Init Items ==================== **/
	
	public void initQuestItems(ConfigCore cc)
	{
		boulon = new ItemQuest(cc.boulonID, "boulon", 64, null, false);
		briqueDeSable = new ItemQuest(cc.briqueDeSableID, "briqueDeSable", 64, null, false);
		buchette = new ItemQuest(cc.buchetteID, "buchette", 64, null, false);
		buchetteSombre = new ItemQuest(cc.buchetteSombreID, "buchetteSombre", 64, null, false);
		caisse = new ItemQuest(cc.caisseID, "caisse", 64, null, false);
		liquideBleu = new ItemQuest(cc.liquideBleuID, "liquideBleu", 64, null, false);
		liquideCyan = new ItemQuest(cc.liquideCyanID, "liquideCyan", 64, null, false);
		liquideJaune = new ItemQuest(cc.liquideJauneID, "liquideJaune", 64, null, false);
		liquideOrange = new ItemQuest(cc.liquideOrangeID, "liquideOrange", 64, null, false);
		liquideRose = new ItemQuest(cc.liquideRoseID, "liquideRose", 64, null, false);
		liquideRouge = new ItemQuest(cc.liquideRougeID, "liquideRouge", 64, null, false);
		liquideVert = new ItemQuest(cc.liquideVertID, "liquideVert", 64, null, false);
		liquideViolet = new ItemQuest(cc.liquideVioletID, "liquideViolet", 64, null, false);
		tuyau = new ItemQuest(cc.tuyauID, "tuyau", 64, null, false);
		vis = new ItemQuest(cc.visID, "vis", 64, null, false);
		couponTuto = new ItemQuest(cc.couponTutoID, "couponTuto", 64, "Echangeable mais non remboursable.", false);
		bandage = new ItemQuest(cc.bandageID, "bandage", 64, "Pour faire du bien la ou ca fait mal.", false);
		sceptreOr = new ItemQuest(cc.sceptreOrID, "sceptreOr", 1, null, false);
		epeeBlanche = new ItemQuest(cc.epeeBlancheID, "epeeBlanche", 1, null, false);
		sucreries = new ItemQuest(cc.sucreriesID, "sucreries", 64, null, false);
		grimoireSeth = new ItemQuest(cc.grimoireSethID, "grimoireSeth", 1, null, false);
		totemMage = new ItemQuest(cc.totemMageID, "totemMage", 1, "Objet magique, ne pas secouer.", false);
		grimoireTelgarad = new ItemQuest(cc.grimoireTelgaradID, "grimoireTelgarad", 1, null, false);
		grimoireTelsalor = new ItemQuest(cc.grimoireTelsalorID, "grimoireTelsalor", 1, null, false);
		recommandationHakath = new ItemQuest(cc.recommandationHakathID, "recommandationHakath", 64, null, false);
		recommandationLomakoth = new ItemQuest(cc.recommandationLomakothID, "recommandationLomakoth", 64, null, false);
		pistolet = new ItemQuest(cc.pistoletID, "pistolet", 1, null, false);
		jambeBois = new ItemQuest(cc.jambeBoisID, "jambeBois", 1, null, false);
		medaillon = new ItemQuest(cc.medaillonID, "medaillon", 64, null, false);
		longuevue = new ItemQuest(cc.longuevueID, "longuevue", 1, "On voit loooooooin !", false);
		clePrisonValys = new ItemQuest(cc.clePrisonValysID, "clePrisonValys", 16, null, false);
		boursePetite = new ItemQuest(cc.boursePetiteID, "boursePetite", 64, null, false);
		bourseMoyenne = new ItemQuest(cc.bourseMoyenneID, "bourseMoyenne", 64, null, false);
		bourseGrande = new ItemQuest(cc.bourseGrandeID, "bourseGrande", 64, null, false);
		grimoireApprenti = new ItemQuest(cc.grimoireApprentiID, "grimoireApprenti", 1, null, false);
		vanish = new ItemQuest(cc.vanishID, "Vanish", 1, "Et les taches s\u0027evanouissent !", false);
		enveloppe = new ItemQuest(cc.enveloppeID, "enveloppe", 64, "A livrer sans regarder !", false);
		batonAdaoldan = new ItemQuest(cc.batonAdaoldanID, "batonAdaoldan", 1, null, false);
		batonAdaoldanEnchant = new ItemQuest(cc.batonAdaoldanEnchantID, "batonAdaoldanEnchant", 1, null, true);
		fragmentAdaoldan = new ItemQuest(cc.fragmentAdaoldanID, "fragmentAdaoldan", 16, null, false);
		projectileArcanique = new ItemQuest(cc.projectileArcaniqueID, "projectileArcanique", 64, "Utilis\u00e9 par les mages de la boutique du PHO", false);
		marteauForgeron = new ItemQuest(cc.marteauForgeronID, "marteauForgeron", 1, "C\u0027est en forgeant que l\u0027ont devient...", false);
		lameRuniqueEmeraude = new ItemQuest(cc.lameRuniqueEmeraudeID, "lameRuniqueEmeraude", 1, null, false);
		nezarilJar = new ItemQuestNezarilJar(cc.nezarilJarID, "nezarilJar");
		nezarilJarFull = new ItemQuest(cc.nezarilJarFullID, "nezarilJarFull", 1, null, false);
		redDragonEgg = new ItemQuest(cc.redDragonEggID, "redDragonEgg", 16, null, false);

		LanguageRegistry.addName(boulon, "Boulon");
		LanguageRegistry.addName(briqueDeSable, "Brique de sable");
		LanguageRegistry.addName(buchette, "B\u00fbchette");
		LanguageRegistry.addName(buchetteSombre, "B\u00fbchette sombre");
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
		LanguageRegistry.addName(medaillon, "M\u00e9daillon de pirate");
		LanguageRegistry.addName(longuevue, "Longue-vue");
		LanguageRegistry.addName(clePrisonValys, "Clef de la prison de Valys");
		LanguageRegistry.addName(boursePetite, "Petite bourse de Hardcoin");
		LanguageRegistry.addName(bourseMoyenne, "Moyenne bourse de Hardcoin");
		LanguageRegistry.addName(bourseGrande, "Grande bourse de Hardcoin");
		LanguageRegistry.addName(grimoireApprenti, "Grimoire de l\u0027apprenti");
		LanguageRegistry.addName(vanish, "Vanish");
		LanguageRegistry.addName(enveloppe, "Enveloppe");
		LanguageRegistry.addName(batonAdaoldan, "B\u00e2ton d\u0027Adaoldan");
		LanguageRegistry.addName(batonAdaoldanEnchant, "B\u00e2ton d\u0027Adaoldan enchant\u00E9");
		LanguageRegistry.addName(fragmentAdaoldan, "Fragment du b\u00e2ton d\u0027Adaoldan");
		LanguageRegistry.addName(projectileArcanique, "Projectile arcanique");
		LanguageRegistry.addName(marteauForgeron, "Marteau du forgeron");
		LanguageRegistry.addName(lameRuniqueEmeraude, "Lame runique en Emeraude");
		LanguageRegistry.addName(nezarilJar, "Urne de N\u00e9zaril (vide)");
		LanguageRegistry.addName(nezarilJarFull, "Urne de N\u00e9zaril (pleine)");
		LanguageRegistry.addName(redDragonEgg, "Oeuf de dragon rouge");

	}
	
	public void initGreyItems(ConfigCore cc)
	{
		batWing = new ItemGrey(cc.batWingID, "batWing", 64, null);
		bigcatHair = new ItemGrey(cc.bigcatHairID, "bigCatHair", 64, null);
		boarHorn = new ItemGrey(cc.boarHornID, "boarHorn", 64, null);
		bugWing = new ItemGrey(cc.bugWingID, "bugWing", 64, null);
		cricketLeg = new ItemGrey(cc.cricketLegID, "cricketLeg", 64, null);
		deerWood = new ItemGrey(cc.deerWoodID, "deerWood", 64, null);
		duckLeg = new ItemGrey(cc.duckLegID, "duckLeg", 64, null);
		ectoplasm = new ItemGrey(cc.ectoplasmID, "ectoplasm", 64, null);
		elephantSkin = new ItemGrey(cc.elephantSkinID, "elephantSkin", 64, null);
		enderJaw = new ItemGrey(cc.enderJawID, "enderJaw", 64, null);
		enderParticles = new ItemGrey(cc.enderParticlesID, "enderParticles", 64, null);
		foxTail = new ItemGrey(cc.foxTailID, "foxTail", 64, null);
		ghastTentacle = new ItemGrey(cc.ghastTentacleID, "ghastTentacle", 64, null);
		goatHorn = new ItemGrey(cc.goatHornID, "goatHorn", 64, null);
		heart = new ItemGrey(cc.heartID, "heart", 64, null);
		honeyPot = new ItemGrey(cc.honeyPotID, "honeyPot", 64, null);
		horseHair = new ItemGrey(cc.horseHairID, "horseHair", 64, null);
		jellyJam = new ItemGrey(cc.jellyJamID, "jellyJam", 64, null);
		mouseMustache = new ItemGrey(cc.mouseMustacheID, "mouseMustache", 64, null);
		ostrichFeather = new ItemGrey(cc.ostrichFeatherID, "ostrichFeather", 64, null);
		pigLeg = new ItemGrey(cc.pigLegID, "pigLeg", 64, null);
		rabbitFoot = new ItemGrey(cc.rabbitFootID, "rabbitFoot", 64, null);
		redFabric = new ItemGrey(cc.redFabricID, "redFabric", 64, null);
		reptileTooth = new ItemGrey(cc.reptileToothID, "reptileTooth", 64, null);
		scorpionSting = new ItemGrey(cc.scorpionStingID, "scorpionSting", 64, null);
		sharkFin = new ItemGrey(cc.sharkFinID, "sharkFin", 64, null);
		skinCreeper = new ItemGrey(cc.skinCreeperID,"skinCreeper", 64, null);
		smallFlame = new ItemGrey(cc.smallFlameID, "smallFlame", 64, null);
		snailShell = new ItemGrey(cc.snailShellID, "snailShell", 64, null);
		snakeTongue = new ItemGrey(cc.snakeTongueID, "snakeTongue", 64, null);
		spiderLegs = new ItemGrey(cc.spiderLegsID, "spiderLegs", 64, null);
		spiderVenom = new ItemGrey(cc.spiderVenomID, "spiderVenom", 64, null);
		turtleShell = new ItemGrey(cc.turtleShellID, "turtleShell",64, null);
		whiteCloth = new ItemGrey(cc.whiteClothID, "whiteCloth", 64, null);
		zombieArm = new ItemGrey(cc.zombieArmID, "zombieArm", 64, null);
		zombieBrain = new ItemGrey(cc.zombieBrainID, "zombieBrain", 64, null);

		LanguageRegistry.addName(batWing, "Aile de chauve-souris");
		LanguageRegistry.addName(bigcatHair, "Crini\u00e8re f\u00e9line");
		LanguageRegistry.addName(boarHorn, "D\u00e9fense de sanglier");
		LanguageRegistry.addName(bugWing, "Aile d'ins\u00e8cte");
		LanguageRegistry.addName(cricketLeg, "Patte de criquet");
		LanguageRegistry.addName(deerWood, "Bois de cerf");
		LanguageRegistry.addName(duckLeg, "Patte de canard");
		LanguageRegistry.addName(ectoplasm, "Ectoplasme");
		LanguageRegistry.addName(elephantSkin, "Peau d'\u00e9l\u00e9phant");
		LanguageRegistry.addName(enderJaw, "Machoire d'Enderman");
		LanguageRegistry.addName(enderParticles, "Particules d'enderman");
		LanguageRegistry.addName(foxTail, "Queue de renard");
		LanguageRegistry.addName(ghastTentacle, "Tentacule de ghast");
		LanguageRegistry.addName(goatHorn, "Corne de ch\u00e8vre");
		LanguageRegistry.addName(heart, "Coeur");
		LanguageRegistry.addName(honeyPot, "Pot de miel");
		LanguageRegistry.addName(horseHair, "Crin de cheval");
		LanguageRegistry.addName(jellyJam, "Confiture de m\u00e9duse");
		LanguageRegistry.addName(mouseMustache, "Moustache de souris");
		LanguageRegistry.addName(ostrichFeather, "Plume d'autruche");
		LanguageRegistry.addName(pigLeg, "Pied de porc");
		LanguageRegistry.addName(rabbitFoot, "Patte de lapin");
		LanguageRegistry.addName(redFabric, "Bout de tissu rouge");
		LanguageRegistry.addName(reptileTooth, "Dent de reptile");
		LanguageRegistry.addName(scorpionSting, "Dard de scorpion");
		LanguageRegistry.addName(sharkFin, "Aileron de requin");
		LanguageRegistry.addName(skinCreeper, "Lambeau de Creeper");
		LanguageRegistry.addName(smallFlame, "Flamm\u00e8che");
		LanguageRegistry.addName(snailShell, "Coquille d'escargot");
		LanguageRegistry.addName(snakeTongue, "Langue de vip\u00e8re");
		LanguageRegistry.addName(spiderLegs, "Pattes d'araign\u00e9e");
		LanguageRegistry.addName(spiderVenom, "Glande \u00e0 venin");
		LanguageRegistry.addName(turtleShell, "Carapace de tortue");
		LanguageRegistry.addName(whiteCloth, "Drap blanc");
		LanguageRegistry.addName(zombieArm, "Bras de zombie");
		LanguageRegistry.addName(zombieBrain, "Cerveau de zombie");
	}
	
	public void initDolls(ConfigCore cc)
	{
		dollBlue = new ItemDoll(cc.dollBlueID, "dollBlue");
		dollBlack = new ItemDoll(cc.dollBlackID, "dollBlack");
		pelucheMisterxfr = new ItemDoll(cc.pelucheMisterxfrID, "pelucheMisterxfr");
		pelucheJolirouge = new ItemDoll(cc.pelucheJolirougeID, "pelucheJolirouge");
		pelucheIplay = new ItemDoll(cc.pelucheIplayID, "pelucheIPlay");
		pelucheMikefraise = new ItemDoll(cc.pelucheMikefraiseID, "pelucheMikefraise");
		pelucheDeez = new ItemDoll(cc.pelucheDeezID, "pelucheDeez");
		pelucheNicodelpra = new ItemDoll(cc.pelucheNicodelpraID, "pelucheNicodelpra");
		pelucheDilandaufr = new ItemDoll(cc.pelucheDilandaufrID, "pelucheDilandaufr");
		pelucheNissan = new ItemDoll(cc.pelucheNissanID, "pelucheNissan");
		pelucheBbphok = new ItemDoll(cc.pelucheBbphokID, "pelucheBBphok");
		pelucheBendito = new ItemDoll(cc.pelucheBenditoID, "pelucheBendito");
		pelucheSoenguy = new ItemDoll(cc.pelucheSoenguyID, "pelucheSoEnguy");
		pelucheChtimarchos = new ItemDoll(cc.pelucheChtimarchosID, "pelucheChtimarchos");
		pelucheXdakota = new ItemDoll(cc.pelucheXdakotaID, "peluchexDakota");
		pelucheLoupfeucg = new ItemDoll(cc.pelucheLoupfeucgID, "pelucheLoupfeucg");
		pelucheTedrak = new ItemDoll(cc.pelucheTedrakID, "pelucheTedrak50");

		LanguageRegistry.addName(dollBlue, "Poup\u00e9e bleu");
		LanguageRegistry.addName(dollBlack, "Poup\u00e9e noire");
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
	}
	
	public void initRunes(ConfigCore cc)
	{
		enchantSharpnessSmall = new ItemEnchant(cc.enchantSharpnessSmallID, "enchantSharpness", "Niveau I", 2);
		enchantSharpnessMedium = new ItemEnchant(cc.enchantSharpnessMediumID, "enchantSharpness", "Niveau II", 3);
		enchantSharpnessBig = new ItemEnchant(cc.enchantSharpnessBigID, "enchantSharpness", "Niveau III", 4);

		enchantSmiteSmall = new ItemEnchant(cc.enchantSmiteSmallID, "enchantSmite", "Niveau I", 2);
		enchantSmiteMedium = new ItemEnchant(cc.enchantSmiteMediumID, "enchantSmite", "Niveau II", 3);
		enchantSmiteBig = new ItemEnchant(cc.enchantSmiteBigID, "enchantSmite", "Niveau III", 4);

		enchantProtectionSmall = new ItemEnchant(cc.enchantProtectionSmallID, "enchantProtection", "Niveau I", 2);
		enchantProtectionBig = new ItemEnchant(cc.enchantProtectionBigID, "enchantProtection", "Niveau II", 4);

		enchantBaneofSmall = new ItemEnchant(cc.enchantBaneofSmallID, "enchantBaneof", "Niveau I", 2);
		enchantBaneofMedium = new ItemEnchant(cc.enchantBaneofMediumID, "enchantBaneof", "Niveau II", 3);
		enchantBaneofBig = new ItemEnchant(cc.enchantBaneofBigID, "enchantBaneof", "Niveau III", 4);

		enchantEfficacitySmall = new ItemEnchant(cc.enchantEfficacitySmallID, "enchantEfficacity", "Niveau I", 2);
		enchantEfficacityMedium = new ItemEnchant(cc.enchantEfficacityMediumID, "enchantEfficacity", "Niveau II", 3);
		enchantEfficacityBig = new ItemEnchant(cc.enchantEfficacityBigID, "enchantEfficacity", "Niveau III", 4);

		enchantDurabilitySmall = new ItemEnchant(cc.enchantDurabilitySmallID, "enchantDurability", "Niveau I", 2);
		enchantDurabilityMedium = new ItemEnchant(cc.enchantDurabilityMediumID, "enchantDurability", "Niveau II", 3);
		enchantDurabilityBig = new ItemEnchant(cc.enchantDurabilityBigID, "enchantDurability", "Niveau III", 4);

		enchantFlameSmall = new ItemEnchant(cc.enchantFlameSmallID, "enchantFlame", "Niveau I", 2);
		enchantFlameBig = new ItemEnchant(cc.enchantFlameBigID, "enchantFlame", "Niveau II", 4);

		enchantKnockbackSmall = new ItemEnchant(cc.enchantKnockbackSmallID, "enchantKnockback", "Niveau I", 2);
		enchantKnockbackBig = new ItemEnchant(cc.enchantKnockbackBigID, "enchantKnockback", "Niveau II", 4);
		
		LanguageRegistry.addName(enchantSharpnessSmall, "Rune de puissance mineure");
		LanguageRegistry.addName(enchantSharpnessMedium, "Rune de puissance");
		LanguageRegistry.addName(enchantSharpnessBig, "Rune de puissance majeure");

		LanguageRegistry.addName(enchantSmiteSmall, "Rune de ch\u00e2timent mineure");
		LanguageRegistry.addName(enchantSmiteMedium, "Rune de ch\u00e2timent");
		LanguageRegistry.addName(enchantSmiteBig , "Rune de ch\u00e2timent majeure");

		LanguageRegistry.addName(enchantProtectionSmall, "Rune de protection mineure");
		LanguageRegistry.addName(enchantProtectionBig, "Rune de protection majeure");

		LanguageRegistry.addName(enchantBaneofSmall, "Rune du fl\u00e9au mineure");
		LanguageRegistry.addName(enchantBaneofMedium, "Rune du fl\u00e9au");
		LanguageRegistry.addName(enchantBaneofBig, "Rune du fl\u00e9au majeure");

		LanguageRegistry.addName(enchantEfficacitySmall, "Rune de rapidit\u00e9 mineure");
		LanguageRegistry.addName(enchantEfficacityMedium, "Rune de rapidit\u00e9");
		LanguageRegistry.addName(enchantEfficacityBig, "Rune de rapidit\u00e9 majeure");

		LanguageRegistry.addName(enchantDurabilitySmall, "Rune de solidit\u00e9 mineure");
		LanguageRegistry.addName(enchantDurabilityMedium, "Rune de solidit\u00e9");
		LanguageRegistry.addName(enchantDurabilityBig, "Rune de solidit\u00e9 majeure");

		LanguageRegistry.addName(enchantFlameSmall, "Rune d'embrasement mineure");
		LanguageRegistry.addName(enchantFlameBig, "Rune d'embrasement majeure");

		LanguageRegistry.addName(enchantKnockbackSmall, "Rune de r\u00e9pulsion mineure");
		LanguageRegistry.addName(enchantKnockbackBig, "Rune de r\u00e9pulsion majeure");
	}

	public void initBadges(ConfigCore cc)
	{
		badgeValys = new ItemBadge(cc.badgeValysID, "badgeValys");
		badgeChasse = new ItemBadge(cc.badgeChasseID, "badgeChasse");
		badgeGuerre = new ItemBadge(cc.badgeGuerreID, "badgeGuerre");
		badgeAgriculture = new ItemBadge(cc.badgeAgricultureID, "badgeAgriculture");
		badgeGastronomie = new ItemBadge(cc.badgeGastronomieID, "badgeGastronomie");
		badgeMinage = new ItemBadge(cc.badgeMinageID, "badgeMinage");
		badgeArtisanat = new ItemBadge(cc.badgeArtisanatID, "badgeArtisanat");
		badgeVille = new ItemBadge(cc.badgeVilleID, "badgeVille");
		badgePeche = new ItemBadge(cc.badgePecheID, "badgePeche");
		badgeExploration = new ItemBadge(cc.badgeExplorationID, "badgeExploration");
		badgeConstruction = new ItemBadge(cc.badgeConstructionID, "badgeConstruction");
		badgeGuilde = new ItemBadge(cc.badgeGuildeID, "badgeGuilde");
		badgeVictoire = new ItemBadge(cc.badgeVictoireID, "badgeVictoire");
		badgeParticipation = new ItemBadge(cc.badgeParticipationID, "badgeParticipation");
		badgeMagie = new ItemBadge(cc.badgeMagieID, "badgeMagie");

		LanguageRegistry.addName(badgeValys, "Insigne de Valys");
		LanguageRegistry.addName(badgeChasse, "Insigne de chasse");
		LanguageRegistry.addName(badgeGuerre, "Insigne de guerre");
		LanguageRegistry.addName(badgeAgriculture, "Insigne d\u0027agriculture");
		LanguageRegistry.addName(badgeGastronomie, "Insigne de gastronomie");
		LanguageRegistry.addName(badgeMinage, "Insigne de minage");
		LanguageRegistry.addName(badgeArtisanat, "Insigne d\u0027artisanat");
		LanguageRegistry.addName(badgeVille, "Insigne de ville");
		LanguageRegistry.addName(badgePeche, "Insigne de p\u00EAche");
		LanguageRegistry.addName(badgeExploration, "Insigne d\u0027exploration");
		LanguageRegistry.addName(badgeConstruction, "Insigne de construction");
		LanguageRegistry.addName(badgeGuilde, "Insigne de guilde");
		LanguageRegistry.addName(badgeVictoire, "Insigne de victoire");
		LanguageRegistry.addName(badgeParticipation, "Insigne de participation");
		LanguageRegistry.addName(badgeMagie, "Insigne de magie");
	}
	
	public void initFoods(ConfigCore cc)
	{
		mug = new ItemMho(cc.mugID, "mug", 1, null, 2, false).setCreativeTab(CreativeTabs.tabFood);
		beer = new ItemFoodBeer(cc.beerID, 0, 0.5F, false, "beer", "El' ai fraiche !");
		foodHamburger = new ItemFoodMho(cc.foodHamburgerID, 12, 1.0F, true, "hamburger", null);
		foodFries = new ItemFoodMho(cc.foodFriesID, 8, 0.6F, false, "fries", null);
		foodKfc = new ItemFoodMho(cc.foodKfcID, 12, 0.7F, false, "kfc", null);
		foodEgg = new ItemFoodMho(cc.foodEggID, 8, 0.5F, false, "egg", null);
		foodBacon = new ItemFoodMho(cc.foodBaconID, 4, 0.2F, true, "bacon", null);
		foodCheese = new ItemFoodMho(cc.foodCheeseID, 10, 0.8F, false, "cheese", null);
		foodMaki = new ItemFoodMho(cc.foodMakiID, 6, 0.4F, false, "maki", null);
		foodSushi = new ItemFoodMho(cc.foodSushiID, 6, 0.4F, false, "sushi", null);
		foodSkewer = new ItemFoodMho(cc.foodSkewerID, 8, 0.6F, true, "skewer", null);
		rhum = new ItemFoodRhum(cc.rhumID, 0 , 0.5F, false, "rhum", "Outch cay for !");

		LanguageRegistry.addName(mug, "Chope vide");
		LanguageRegistry.addName(beer, "Chope de bi\u00E8re");
		LanguageRegistry.addName(foodHamburger, "Hamburger");
		LanguageRegistry.addName(foodFries, "Frites");
		LanguageRegistry.addName(foodKfc, "Nuggets");
		LanguageRegistry.addName(foodEgg, "Oeufs au plat");
		LanguageRegistry.addName(foodBacon, "Bacon");
		LanguageRegistry.addName(foodCheese, "Fromage");
		LanguageRegistry.addName(foodMaki, "Maki");
		LanguageRegistry.addName(foodSushi, "Sushi");
		LanguageRegistry.addName(foodSkewer, "Brochette");
		LanguageRegistry.addName(rhum, "Rhum");
	}
	
	public void initCombat(ConfigCore cc)
	{
		/**ProjectileNPC**/
		npcProjectileWhite = new ItemMho(cc.npcProjectileWhiteID, "npcProjectileWhite", 64, null, 2, true).setTextureName(Mho.modid + ":combat/npcProjectileWhite").setCreativeTab(Mho.tabMhoCombat);
		npcProjectileYellow = new ItemMho(cc.npcProjectileYellowID, "npcProjectileYellow", 64, null, 2, true).setTextureName(Mho.modid + ":combat/npcProjectileYellow").setCreativeTab(Mho.tabMhoCombat);
		npcProjectileGreen = new ItemMho(cc.npcProjectileGreenID, "npcProjectileGreen", 64, null, 2, true).setTextureName(Mho.modid + ":combat/npcProjectileGreen").setCreativeTab(Mho.tabMhoCombat);
		npcProjectilePurple = new ItemMho(cc.npcProjectilePurpleID, "npcProjectilePurple", 64, null, 2, true).setTextureName(Mho.modid + ":combat/npcProjectilePurple").setCreativeTab(Mho.tabMhoCombat);
		npcProjectileRed = new ItemMho(cc.npcProjectileRedID, "npcProjectileRed", 64, null, 2, true).setTextureName(Mho.modid + ":combat/npcProjectileRed").setCreativeTab(Mho.tabMhoCombat);
		npcProjectileGrey = new ItemMho(cc.npcProjectileGreyID, "npcProjectileGrey", 64, null, 2, true).setTextureName(Mho.modid + ":combat/npcProjectileGrey").setCreativeTab(Mho.tabMhoCombat);
		npcProjectileBlue = new ItemMho(cc.npcProjectileBlueID, "npcProjectileBlue", 64, null, 2, true).setTextureName(Mho.modid + ":combat/npcProjectileBlue").setCreativeTab(Mho.tabMhoCombat);

		LanguageRegistry.addName(npcProjectileWhite, "Projectile NPC Blanc");
		LanguageRegistry.addName(npcProjectileYellow, "Projectile NPC Jaune");
		LanguageRegistry.addName(npcProjectileGreen, "Projectile NPC Vert");
		LanguageRegistry.addName(npcProjectilePurple, "Projectile NPC Violet");
		LanguageRegistry.addName(npcProjectileRed, "Projectile NPC Rouge");
		LanguageRegistry.addName(npcProjectileGrey, "Projectile NPC Gris");
		LanguageRegistry.addName(npcProjectileBlue, "Projectile NPC Bleu");

		/**Legendaire**/
		legendaryNocturnal = new ItemSwordLegendaryNocturnal(cc.legendaryNocturnalID, legendaryNocturnalTool, "legendaryNocturnal", false);
		legendaryDiurnal = new ItemSwordLegendaryDiurnal(cc.legendaryDiurnalID, legendaryDiurnalTool, "legendaryDiurnal", false);
		
		LanguageRegistry.addName(legendaryNocturnal, "B\u00e2ton nocturne");
		LanguageRegistry.addName(legendaryDiurnal, "B\u00e2ton du jour");
		
		/**Sword**/
		stove = new ItemStove(cc.stoveID, stoveTool, "stove", "Booong!!", 2, false);
		scepterRed = new ItemSwordMho(cc.scepterRedID, noDmgTool, "scepterRed", null, 2, false);
		scepterBlue = new ItemSwordMho(cc.scepterBlueID, noDmgTool, "scepterBlue", null, 2, false);
		scepterGreen = new ItemSwordMho(cc.scepterGreenID, noDmgTool, "scepterGreen", null, 2, false);
		hammerWood = new ItemSwordMho(cc.hammerWoodID, noDmgTool, "hammerWood", null, 2, false);
		hammerStone = new ItemSwordMho(cc.hammerStoneID, noDmgTool, "hammerStone", null, 2, false);
		hammerIron = new ItemSwordMho(cc.hammerIronID, noDmgTool, "hammerIron", null, 2, false);
		rapier = new ItemSwordMho(cc.rapierID, noDmgTool, "rapier", null, 2, false);
		runeblade = new ItemSwordMho(cc.runebladeID, noDmgTool, "runeblade", null, 2, false);
		sourcelame = new ItemSourcelame(30239, sourcelameTool, "sourcelame", "L'Ep\u00e9e L\u00e9gendaire", 7, true);
		 
		LanguageRegistry.addName(stove, "Po\u00EAle \u00E0 frire");
		LanguageRegistry.addName(scepterRed, "Sceptre Rouge");
		LanguageRegistry.addName(scepterBlue, "Sceptre Bleu");
		LanguageRegistry.addName(scepterGreen, "Sceptre Vert");
		LanguageRegistry.addName(hammerWood, "Marteau en bois");
		LanguageRegistry.addName(hammerStone, "Marteau en pierre");
		LanguageRegistry.addName(hammerIron, "Marteau en fer");
		LanguageRegistry.addName(rapier, "Rapier");
		LanguageRegistry.addName(runeblade, "Lame runique");
		LanguageRegistry.addName(sourcelame, "Sourcelame");
	}
	
	public void initPotions(ConfigCore cc)
	{
		potionCelerity = new PotionMho(cc.potionCelerityID, "celerity", "C\u00e9l\u00e9rite III - 3 minutes").setPotionEffect(Potion.digSpeed.id, 180, 2, 1.0F);
		potionFatigue = new PotionMho(cc.potionFatigueID, "fatigue", "Fatigue III - 3 minutes").setPotionEffect(Potion.digSlowdown.id, 180, 2, 1.0F);
		potionJump = new PotionMho(cc.potionJumpID, "jump", "Saut II - 3 minutes").setPotionEffect(Potion.jump.id, 180, 1, 1.0F);
		potionConfusion = new PotionMho(cc.potionConfusionID, "confusion", "Confusion III - 3 minutes").setPotionEffect(Potion.confusion.id, 180, 2, 1.0F);
		potionResistance = new PotionMho(cc.potionResistanceID, "resistance", "R\u00e9sistance II - 3 minutes").setPotionEffect(Potion.resistance.id, 180, 1, 1.0F);
		potionApnea = new PotionMho(cc.potionApneaID, "apnea", "Apn\u00e9e I - 3 minutes").setPotionEffect(Potion.waterBreathing.id, 180, 0, 1.0F);
		potionBlindness = new PotionMho(cc.potionBlindnessID, "blindness", "C\u00e9cit\u00e9 I - 3 minutes").setPotionEffect(Potion.blindness.id, 180, 0, 1.0F);
		potionHunger = new PotionMho(cc.potionHungerID, "hunger", "Faim III - 20 seondes").setPotionEffect(Potion.hunger.id, 20, 2, 1.0F);
		potionWither = new PotionMho(cc.potionWitherID, "wither", "Wither I - 20 seondes").setPotionEffect(Potion.wither.id, 20, 0, 1.0F);
		
		potionCustomEffectWaterWalk = new PotionWaterWalk(cc.potionCustomEffectWaterWalkID, "waterWalk", "Marche sur l'eau - 3 minutes");
		potionCustomEffectLavaWalk = new PotionLavaWalk(cc.potionCustomEffectLavaWalkID, "lavaWalk", "Marche sur la lave - 3 minutes");
		potionCustomEffectNoFall = new PotionNoFall(cc.potionCustomEffectNoFallID, "noFall", "R\u00e9sistance \u00e0 la chute - 1 minute");

		//testSplash = new TestSplash(cc.testSplashID, "EnDev").setUnlocalizedName("testSplash");

		LanguageRegistry.addName(potionCelerity, "Potion de c\u00e9l\u00e9rite");
		LanguageRegistry.addName(potionFatigue, "Potion de fatigue");
		LanguageRegistry.addName(potionJump, "Potion de saut");
		LanguageRegistry.addName(potionConfusion, "Potion de confusion");
		LanguageRegistry.addName(potionResistance, "Potion de r\u00e9sistance");
		LanguageRegistry.addName(potionApnea, "Potion d'apn\u00e9e");
		LanguageRegistry.addName(potionBlindness, "Potion de c\u00e9cit\u00e9");
		LanguageRegistry.addName(potionHunger, "Potion de faim");
		LanguageRegistry.addName(potionWither, "Potion de wither");
		
		LanguageRegistry.addName(potionCustomEffectWaterWalk, "Potion de marche sur l'eau");
		LanguageRegistry.addName(potionCustomEffectLavaWalk, "Potion de marche sur la lave");
		LanguageRegistry.addName(potionCustomEffectNoFall, "Potion de r\u00e9sistance \u00e0 la chute");

		//LanguageRegistry.addName(testSplash, "EnDev");
	}
	
	public void initOtherItems(ConfigCore cc)
	{
		/** Scroll **/
		minorValysScroll = new ItemScrollTpValys(cc.minorValysScrollID, "minorValysScroll", "Vous t\u00E9l\u00E9porte \u00e0 Valys. Une fois sur deux !", 50);
		mediumValysScroll = new ItemScrollTpValys(cc.mediumValysScrollID, "mediumValysScroll", "Vous t\u00E9l\u00E9porte \u00e0 Valys. Trois fois sur quatre !", 75);
		majorValysScroll = new ItemScrollTpValys(cc.majorValysScrollID, "majorValysScroll", "Vous t\u00E9l\u00E9porte \u00e0 Valys !", 100);

		LanguageRegistry.addName(minorValysScroll, "Parchemin de t\u00E9l\u00E9portation mineur (Valys)");
		LanguageRegistry.addName(mediumValysScroll, "Parchemin de t\u00E9l\u00E9portation moyen (Valys)");
		LanguageRegistry.addName(majorValysScroll, "Parchemin de t\u00E9l\u00E9portation majeur (Valys)");

		/**Key**/
		goldKey = new ItemMho(cc.goldKeyID, "goldKey", 64, "S\u00E9sam, ouvre-toi !", 7, true);
		silverKey = new ItemMho(cc.silverKeyID, "silverKey", 64, "S\u00E9sam, ouvre-toi !", 7, true);
		bronzeKey = new ItemMho(cc.bronzeKeyID, "bronzeKey", 64, "S\u00E9sam, ouvre-toi !", 7, true);
		goldSmallKey = new ItemMho(cc.goldSmallKeyID, "goldSmallKey", 64, "S\u00E9sam, ouvre-toi !", 7, true);
		silverSmallKey = new ItemMho(cc.silverSmallKeyID, "silverSmallKey", 64, "S\u00E9sam, ouvre-toi !", 7, true);
		bronzeSmallKey = new ItemMho(cc.bronzeSmallKeyID, "bronzeSmallKey", 64, "S\u00E9sam, ouvre-toi !", 7, true);

		LanguageRegistry.addName(goldKey, "Cl\u00E9 de donjon en or");
		LanguageRegistry.addName(silverKey, "Cl\u00E9 de donjon en argent");
		LanguageRegistry.addName(bronzeKey, "Cl\u00E9 de donjon en bronze");
		LanguageRegistry.addName(goldSmallKey, "Cl\u00E9 en or");
		LanguageRegistry.addName(silverSmallKey, "Cl\u00E9 en argent");
		LanguageRegistry.addName(bronzeSmallKey, "Cl\u00E9 en bronze");
		
		/**Coin**/
		bronzeCoin = new ItemMho(cc.bronzeCoinID, "bronzeCoin", 64, null, 2, false);
		silverCoin = new ItemMho(cc.silverCoinID, "silverCoin", 64, null, 2, false);
		goldCoin = new ItemMho(cc.goldCoinID, "goldCoin", 64, null, 2, false);
		diamondCoin = new ItemMho(cc.diamondCoinID, "diamondCoin", 64, null, 2, false);

		LanguageRegistry.addName(bronzeCoin, "Hardcoin de bronze");
		LanguageRegistry.addName(silverCoin, "Hardcoin d\u0027argent");
		LanguageRegistry.addName(goldCoin, "Hardcoin d\u0027or");
		LanguageRegistry.addName(diamondCoin, "Hardcoin de diamant");

		/**Trophee**/
		trophyGold = new ItemMho(cc.trophyGoldID, "trophyGold", 64, "I wiiiiiin", 2, true);
		trophySilver = new ItemMho(cc.trophySilverID, "trophySilver", 64, null, 2, true);
		trophyBronze = new ItemMho(cc.trophyBronzeID, "trophyBronze", 64, null, 2, true);
		trophyGoldChip = new ItemMho(cc.trophyGoldChipID, "trophyGoldChip", 64, null, 2, true);

		LanguageRegistry.addName(trophyGold, "Troph\u00e9e en or");
		LanguageRegistry.addName(trophySilver, "Troph\u00e9e en argent");
		LanguageRegistry.addName(trophyBronze, "Troph\u00e9e en bronze");
		LanguageRegistry.addName(trophyGoldChip, "Troph\u00e9e en or \u00E9br\u00E9ch\u00E9");

		/**Specials**/
		eyeCover = new ItemArmorMho(cc.eyeCoverID, eyeCoverArmor, 0, 0, "eyeCover");
		pocketCraftingTable = new ItemPocketCraftingTable(cc.pocketCraftingTableID, "pocketCraftingTable", "(usage unique)");
		magicPowder = new ItemMagicPowder(cc.magicPowderID, "magicPowder", "Soigne les bobos !");
		teddyBear = new ItemTeddyBear(cc.teddyBearID, "teddyBear");

		LanguageRegistry.addName(eyeCover, "Cache Oeil");
		LanguageRegistry.addName(pocketCraftingTable, "Table de craft portable");
		LanguageRegistry.addName(magicPowder, "Poudre de magie");
		LanguageRegistry.addName(teddyBear, "Ours en peluche");
		
		/**Classics**/
		diamondShine = new ItemMho(cc.diamondShineID, "diamondShine", 64, null, 2, false);
		cards = new ItemMho(cc.cardsID, "cards", 1, null, 2, false);
		magicDust = new ItemMho(cc.magicDustID, "magicDust", 64, null, 2, false);

		LanguageRegistry.addName(diamondShine, "\u00C9clat de diamant");
		LanguageRegistry.addName(cards, "Cartes de jeu");
		LanguageRegistry.addName(magicDust, "Poussi\u00e8re magique");
	}
	
	
/** ==================== Init Blocks ==================== **/
	
	public void initSetsOfMaterial(ConfigCore cc)
	{
		/** Stone **/
		stoneColumn = new BlockDirectionalSimple(cc.stoneID + cc.columnRank, Material.rock, "stoneColumn");
		stoneColumnHead = new BlockColumnHead(cc.stoneID + cc.columnHeadRank, Material.rock, "stone");
		
		GameRegistry.registerBlock(stoneColumn, "MHOstoneColumn");
		GameRegistry.registerBlock(stoneColumnHead, "MHOstone");
		
		LanguageRegistry.addName(stoneColumn, "Colonne en pierre");
		LanguageRegistry.addName(stoneColumnHead, "Chapeau de colonne en pierre");
		
		/** White blocs **/
		whiteStone = new BlockStoneMho(cc.whiteStoneID, Material.rock, "whiteStone", cc.whiteStoneID + cc.cobblestoneRank);
		whiteCobblestone = new BlockMho(cc.whiteStoneID + cc.cobblestoneRank, Material.rock, "whiteCobblestone");
		whiteStonebrick = new BlockMho(cc.whiteStoneID + cc.stonebrickRank, Material.rock, "whiteStonebrick");
		whiteStonebrickRound = new BlockMho(cc.whiteStoneID + cc.stonebrickRoundRank, Material.rock, "whiteStonebrickRound");
		whiteStoneDoubleSlab = new BlockDirectionalSimple(cc.whiteStoneID + cc.doubleSlabRank, Material.rock, "whiteStoneDoubleSlab");
		whiteStoneColumn = new BlockDirectionalSimple(cc.whiteStoneID + cc.columnRank, Material.rock, "whiteStoneColumn");
		whiteStoneColumnHead = new BlockColumnHead(cc.whiteStoneID + cc.columnHeadRank, Material.rock, "whiteStone");
		
		GameRegistry.registerBlock(whiteStone, "MHOwhiteStone");
		GameRegistry.registerBlock(whiteCobblestone, "MHOwhiteCobblestone");
		GameRegistry.registerBlock(whiteStonebrick, "MHOwhiteStonebrick");
		GameRegistry.registerBlock(whiteStonebrickRound, "MHOwhiteStonebrickRound");
		GameRegistry.registerBlock(whiteStoneDoubleSlab, "MHOwhiteStoneDoubleSlab");
		GameRegistry.registerBlock(whiteStoneColumn, "MHOwhiteStoneColumn");
		GameRegistry.registerBlock(whiteStoneColumnHead, "MHOwhiteStoneColumnHead");
		
		LanguageRegistry.addName(whiteStone, "Pierre blanche");
		LanguageRegistry.addName(whiteCobblestone, "Pierre blanche fragment\u00e9e");
		LanguageRegistry.addName(whiteStonebrick, "Briques en pierre blanche");
		LanguageRegistry.addName(whiteStonebrickRound, "Brique taill\u00e9e en pierre blanche");
		LanguageRegistry.addName(whiteStoneDoubleSlab, "Dalle en pierre blanche");
		LanguageRegistry.addName(whiteStoneColumn, "Colonne en pierre blanche");
		LanguageRegistry.addName(whiteStoneColumnHead, "Chapeau de colonne en pierre blanche");
		
		/** Sandstone new **/
		sandstoneStonebrick = new BlockMho(cc.sandstoneID + cc.stonebrickRank, Material.rock, "sandstoneStonebrick");
		sandstoneStonebrickRound = new BlockMho(cc.sandstoneID + cc.stonebrickRoundRank, Material.rock, "sandstoneStonebrickRound");
		sandstoneDoubleSlab = new BlockDirectionalSimple(cc.sandstoneID + cc.doubleSlabRank, Material.rock, "sandstoneDoubleSlab");
		sandstoneColumn = new BlockDirectionalSimple(cc.sandstoneID + cc.columnRank, Material.rock, "sandstoneColumn");
		sandstoneColumnHead = new BlockColumnHead(cc.sandstoneID + cc.columnHeadRank, Material.rock, "sandstone");

		GameRegistry.registerBlock(sandstoneStonebrick, "MHOsandstoneStonebrick");
		GameRegistry.registerBlock(sandstoneStonebrickRound, "MHOsandstoneStonebrickRound");
		GameRegistry.registerBlock(sandstoneDoubleSlab, "MHOsandstoneDoubleSlab");
		GameRegistry.registerBlock(sandstoneColumn, "MHOsandstoneColumn");
		GameRegistry.registerBlock(sandstoneColumnHead, "MHOsandstoneColumnHead");
		
		LanguageRegistry.addName(sandstoneStonebrick, "Briques en sandstone");
		LanguageRegistry.addName(sandstoneStonebrickRound, "Brique taill\u00e9e en sandstone");
		LanguageRegistry.addName(sandstoneDoubleSlab, "Dalle en sandstone");
		LanguageRegistry.addName(sandstoneColumn, "Colonne en sandstone");
		LanguageRegistry.addName(sandstoneColumnHead, "Chapeau de colonne en sandstone");

		/** Ancient stone **/
		ancientStone = new BlockStoneMho(cc.ancientStoneID, Material.rock, "ancientStone", cc.ancientStoneID + cc.cobblestoneRank);
		ancientCobblestone = new BlockMho(cc.ancientStoneID + cc.cobblestoneRank, Material.rock, "ancientCobblestone");
		ancientStonebrick = new BlockMho(cc.ancientStoneID + cc.stonebrickRank, Material.rock, "ancientStonebrick");
		ancientStonebrickRound = new BlockMho(cc.ancientStoneID + cc.stonebrickRoundRank, Material.rock, "ancientStonebrickRound");
		ancientDoubleSlab = new BlockDirectionalSimple(cc.ancientStoneID + cc.doubleSlabRank, Material.rock, "ancientDoubleSlab");
		ancientColumn = new BlockDirectionalSimple(cc.ancientStoneID + cc.columnRank, Material.rock, "ancientColumn");
		ancientColumnHead = new BlockColumnHead(cc.ancientStoneID + cc.columnHeadRank, Material.rock, "ancient");

		GameRegistry.registerBlock(ancientStone, "MHOancientStone");
		GameRegistry.registerBlock(ancientCobblestone, "MHOancientCobblestone");
		GameRegistry.registerBlock(ancientStonebrick, "MHOancientStonebrick");
		GameRegistry.registerBlock(ancientStonebrickRound, "MHOancientStonebrickRound");
		GameRegistry.registerBlock(ancientDoubleSlab, "MHOancientDoubleSlab");
		GameRegistry.registerBlock(ancientColumn, "MHOancientColumn");
		GameRegistry.registerBlock(ancientColumnHead, "MHOancientColumnHead");
		
		LanguageRegistry.addName(ancientStone, "Pierre ancienne");
		LanguageRegistry.addName(ancientCobblestone, "Pierre ancienne fragment\u00e9e");
		LanguageRegistry.addName(ancientStonebrick, "Briques en pierre ancienne");
		LanguageRegistry.addName(ancientStonebrickRound, "Brique taill\u00e9e en pierre ancienne");
		LanguageRegistry.addName(ancientDoubleSlab, "Dalle en pierre ancienne");
		LanguageRegistry.addName(ancientColumn, "Colonne en pierre ancienne");
		LanguageRegistry.addName(ancientColumnHead, "Chapeau de colonne en pierre ancienne");

		/** Ice blocks **/
		iceCobblestone = new BlockMho(cc.iceID + cc.cobblestoneRank, Material.ice, "iceCobblestone").setStepSound(Block.soundGlassFootstep);
		iceStonebrick = new BlockMho(cc.iceID + cc.stonebrickRank, Material.ice, "iceStonebrick").setStepSound(Block.soundGlassFootstep);
		iceStonebrickRound = new BlockMho(cc.iceID + cc.stonebrickRoundRank, Material.ice, "iceStonebrickRound").setStepSound(Block.soundGlassFootstep);
		iceDoubleSlab = new BlockDirectionalSimple(cc.iceID + cc.doubleSlabRank, Material.ice, "iceDoubleSlab").setStepSound(Block.soundGlassFootstep);
		iceColumn = new BlockDirectionalSimple(cc.iceID + cc.columnRank, Material.ice, "iceColumn").setStepSound(Block.soundGlassFootstep);
		iceColumnHead = new BlockColumnHead(cc.iceID + cc.columnHeadRank, Material.ice, "ice").setStepSound(Block.soundGlassFootstep);

		GameRegistry.registerBlock(iceCobblestone, "MHOiceCobblestone");
		GameRegistry.registerBlock(iceStonebrick, "MHOiceStonebrick");
		GameRegistry.registerBlock(iceStonebrickRound, "MHOiceStonebrickRound");
		GameRegistry.registerBlock(iceDoubleSlab, "MHOiceDoubleSlab");
		GameRegistry.registerBlock(iceColumn, "MHOiceColumn");
		GameRegistry.registerBlock(iceColumnHead, "MHOiceColumnHead");
		
		LanguageRegistry.addName(iceCobblestone, "Glace fragment\u00e9e");
		LanguageRegistry.addName(iceStonebrick, "Briques en glace");
		LanguageRegistry.addName(iceStonebrickRound, "Brique taill\u00e9e en glace");
		LanguageRegistry.addName(iceDoubleSlab, "Dalle en glace");
		LanguageRegistry.addName(iceColumn, "Colonne en glace");
		LanguageRegistry.addName(iceColumnHead, "Chapeau de colonne en glace");

		/** White Marble **/
		marbleWhiteStone = new BlockStoneMho(cc.marbleWhiteID, Material.rock, "marbleWhiteStone", cc.marbleWhiteID + cc.cobblestoneRank);
		marbleWhiteCobblestone = new BlockMho(cc.marbleWhiteID + cc.cobblestoneRank, Material.rock, "marbleWhiteCobblestone");
		marbleWhiteStonebrick = new BlockMho(cc.marbleWhiteID + cc.stonebrickRank, Material.rock, "marbleWhiteStonebrick");
		marbleWhiteStonebrickRound = new BlockMho(cc.marbleWhiteID + cc.stonebrickRoundRank, Material.rock, "marbleWhiteStonebrickRound");
		marbleWhiteDoubleSlab = new BlockDirectionalSimple(cc.marbleWhiteID + cc.doubleSlabRank, Material.rock, "marbleWhiteDoubleSlab");
		marbleWhiteColumn = new BlockDirectionalSimple(cc.marbleWhiteID + cc.columnRank, Material.rock, "marbleWhiteColumn");
		marbleWhiteColumnHead = new BlockColumnHead(cc.marbleWhiteID + cc.columnHeadRank, Material.rock, "marbleWhite");

		GameRegistry.registerBlock(marbleWhiteStone, "MHOmarbleWhiteStone");
		GameRegistry.registerBlock(marbleWhiteCobblestone, "MHOmarbleWhiteCobblestone");
		GameRegistry.registerBlock(marbleWhiteStonebrick, "MHOmarbleWhiteStonebrick");
		GameRegistry.registerBlock(marbleWhiteStonebrickRound, "MHOmarbleWhiteStonebrickRound");
		GameRegistry.registerBlock(marbleWhiteDoubleSlab, "MHOmarbleWhiteDoubleSlab");
		GameRegistry.registerBlock(marbleWhiteColumn, "MHOmarbleWhiteColumn");
		GameRegistry.registerBlock(marbleWhiteColumnHead, "MHOmarbleWhiteColumnHead");
		
		LanguageRegistry.addName(marbleWhiteStone, "Marbre blanc");
		LanguageRegistry.addName(marbleWhiteCobblestone, "Marbre blanc fragment\u00e9");
		LanguageRegistry.addName(marbleWhiteStonebrick, "Briques en marbre blanc");
		LanguageRegistry.addName(marbleWhiteStonebrickRound, "Brique taill\u00e9e en marbre blanc");
		LanguageRegistry.addName(marbleWhiteDoubleSlab, "Dalle en marbre blanc");
		LanguageRegistry.addName(marbleWhiteColumn, "Colonne en marbre blanc");
		LanguageRegistry.addName(marbleWhiteColumnHead, "Chapeau de colonne en marbre blanc");
		
		/** Black Marble **/
		marbleBlackStone = new BlockStoneMho(cc.marbleBlackID, Material.rock, "marbleBlackStone", cc.marbleBlackID + cc.cobblestoneRank);
		marbleBlackCobblestone = new BlockMho(cc.marbleBlackID + cc.cobblestoneRank, Material.rock, "marbleBlackCobblestone");
		marbleBlackStonebrick = new BlockMho(cc.marbleBlackID + cc.stonebrickRank, Material.rock, "marbleBlackStonebrick");
		marbleBlackStonebrickRound = new BlockMho(cc.marbleBlackID + cc.stonebrickRoundRank, Material.rock, "marbleBlackStonebrickRound");
		marbleBlackDoubleSlab = new BlockDirectionalSimple(cc.marbleBlackID + cc.doubleSlabRank, Material.rock, "marbleBlackDoubleSlab");
		marbleBlackColumn = new BlockDirectionalSimple(cc.marbleBlackID + cc.columnRank, Material.rock, "marbleBlackColumn");
		marbleBlackColumnHead = new BlockColumnHead(cc.marbleBlackID + cc.columnHeadRank, Material.rock, "marbleBlack");
		marbleCheck = new BlockMho(cc.marbleBlackID + cc.checkRank, Material.rock, "marbleCheck");

		GameRegistry.registerBlock(marbleBlackStone, "MHOmarbleBlackStone");
		GameRegistry.registerBlock(marbleBlackCobblestone, "MHOmarbleBlackCobblestone");
		GameRegistry.registerBlock(marbleBlackStonebrick, "MHOmarbleBlackStonebrick");
		GameRegistry.registerBlock(marbleBlackStonebrickRound, "MHOmarbleBlackStonebrickRound");
		GameRegistry.registerBlock(marbleBlackDoubleSlab, "MHOmarbleBlackDoubleSlab");
		GameRegistry.registerBlock(marbleBlackColumn, "MHOmarbleBlackColumn");
		GameRegistry.registerBlock(marbleBlackColumnHead, "MHOmarbleBlackColumnHead");
		GameRegistry.registerBlock(marbleCheck, "MHOmarbleCheck");
		
		LanguageRegistry.addName(marbleBlackStone, "Marbre noir");
		LanguageRegistry.addName(marbleBlackCobblestone, "Marbre noir fragment\u00e9");
		LanguageRegistry.addName(marbleBlackStonebrick, "Briques en marbre noir");
		LanguageRegistry.addName(marbleBlackStonebrickRound, "Brique taill\u00e9e en marbre noir");
		LanguageRegistry.addName(marbleBlackDoubleSlab, "Dalle en marbre noir");
		LanguageRegistry.addName(marbleBlackColumn, "Colonne en marbre noir");
		LanguageRegistry.addName(marbleBlackColumnHead, "Chapeau de colonne en marbre noir");
		LanguageRegistry.addName(marbleCheck, "Damier en marbre");

		/** Wood **/
		woodenStone = new BlockMho(cc.woodenDarkID, Material.wood, "woodenStone").setStepSound(Block.soundWoodFootstep);
		woodenStonebrick = new BlockMho(cc.woodenDarkID + cc.stonebrickRank, Material.wood, "woodenStonebrick").setStepSound(Block.soundWoodFootstep);
		woodenStonebrickRound = new BlockMho(cc.woodenDarkID + cc.stonebrickRoundRank, Material.wood, "woodenStonebrickRound").setStepSound(Block.soundWoodFootstep);
		woodenDoubleSlab = new BlockDirectionalSimple(cc.woodenDarkID + cc.doubleSlabRank, Material.wood, "woodenDoubleSlab").setStepSound(Block.soundWoodFootstep);
		woodenColumn = new BlockDirectionalSimple(cc.woodenDarkID + cc.columnRank, Material.wood, "woodenColumn").setStepSound(Block.soundWoodFootstep);
		woodenColumnHead = new BlockColumnHead(cc.woodenDarkID + cc.columnHeadRank, Material.wood, "wooden").setStepSound(Block.soundWoodFootstep);

		GameRegistry.registerBlock(woodenStone, "MHOwoodenStone");
		GameRegistry.registerBlock(woodenStonebrick, "MHOwoodenStonebrick");
		GameRegistry.registerBlock(woodenStonebrickRound, "MHOwoodenStonebrickRound");
		GameRegistry.registerBlock(woodenDoubleSlab, "MHOwoodenDoubleSlab");
		GameRegistry.registerBlock(woodenColumn, "MHOwoodenColumn");
		GameRegistry.registerBlock(woodenColumnHead, "MHOwoodenColumnHead");
		
		LanguageRegistry.addName(woodenStone, "Bois lisse fonc\u00e9");
		LanguageRegistry.addName(woodenStonebrick, "Briques en bois lisse fonc\u00e9");
		LanguageRegistry.addName(woodenStonebrickRound, "Brique taill\u00e9e en bois lisse fonc\u00e9");
		LanguageRegistry.addName(woodenDoubleSlab, "Dalle en bois lisse fonc\u00e9");
		LanguageRegistry.addName(woodenColumn, "Colonne en bois lisse fonc\u00e9");
		LanguageRegistry.addName(woodenColumnHead, "Chapeau de colonne en bois lisse fonc\u00e9");
		
		/** Wood light **/
		woodenLightStone = new BlockMho(cc.woodenLightID, Material.wood, "woodenLightStone").setStepSound(Block.soundWoodFootstep);
		woodenLightStonebrick = new BlockMho(cc.woodenLightID + cc.stonebrickRank, Material.wood, "woodenLightStonebrick").setStepSound(Block.soundWoodFootstep);
		woodenLightStonebrickRound = new BlockMho(cc.woodenLightID + cc.stonebrickRoundRank, Material.wood, "woodenLightStonebrickRound").setStepSound(Block.soundWoodFootstep);
		woodenLightDoubleSlab = new BlockDirectionalSimple(cc.woodenLightID + cc.doubleSlabRank, Material.wood, "woodenLightDoubleSlab").setStepSound(Block.soundWoodFootstep);
		woodenLightColumn = new BlockDirectionalSimple(cc.woodenLightID + cc.columnRank, Material.wood, "woodenLightColumn").setStepSound(Block.soundWoodFootstep);
		woodenLightColumnHead = new BlockColumnHead(cc.woodenLightID + cc.columnHeadRank, Material.wood, "woodenLight").setStepSound(Block.soundWoodFootstep);

		GameRegistry.registerBlock(woodenLightStone, "MHOwoodenLightStone");
		GameRegistry.registerBlock(woodenLightStonebrick, "MHOwoodenLightStonebrick");
		GameRegistry.registerBlock(woodenLightStonebrickRound, "MHOwoodenLightStonebrickRound");
		GameRegistry.registerBlock(woodenLightDoubleSlab, "MHOwoodenLightDoubleSlab");
		GameRegistry.registerBlock(woodenLightColumn, "MHOwoodenLightColumn");
		GameRegistry.registerBlock(woodenLightColumnHead, "MHOwoodenLightColumnHead");
		
		LanguageRegistry.addName(woodenLightStone, "Bois lisse clair");
		LanguageRegistry.addName(woodenLightStonebrick, "Briques en bois lisse clair");
		LanguageRegistry.addName(woodenLightStonebrickRound, "Brique taill\u00e9e en bois lisse clair");
		LanguageRegistry.addName(woodenLightDoubleSlab, "Dalle en bois lisse clair");
		LanguageRegistry.addName(woodenLightColumn, "Colonne en bois lisse clair");
		LanguageRegistry.addName(woodenLightColumnHead, "Chapeau de colonne en bois lisse clair");
		
		/** Metal **/
		metalStonebrickRound = new BlockMho(cc.metalID + cc.stonebrickRoundRank, Material.iron, "metalStonebrickRound").setStepSound(Block.soundMetalFootstep);
		metalDoubleSlab = new BlockDirectionalSimple(cc.metalID + cc.doubleSlabRank, Material.iron, "metalDoubleSlab").setStepSound(Block.soundMetalFootstep);
		metalCheck = new BlockMho(cc.metalID + cc.checkRank, Material.iron, "metalCheck").setStepSound(Block.soundMetalFootstep);

		GameRegistry.registerBlock(metalCheck, "MHOmetalCheck");
		GameRegistry.registerBlock(metalStonebrickRound, "MHOmetalStonebrickRound");
		GameRegistry.registerBlock(metalDoubleSlab, "MHOmetalDoubleSlab");
		
		LanguageRegistry.addName(metalCheck, "Damier en acier");
		LanguageRegistry.addName(metalStonebrickRound, "Acier taill\u00e9");
		LanguageRegistry.addName(metalDoubleSlab, "Dalle en acier");
		
		/** Basalt **/
		basalt = new BlockStoneMho(cc.basaltID, Material.rock, "basalt", cc.basaltID + cc.cobblestoneRank);
		basaltCobblestone = new BlockMho(cc.basaltID + cc.cobblestoneRank, Material.rock, "basaltCobblestone");
		basaltStonebrick = new BlockMho(cc.basaltID + cc.stonebrickRank, Material.rock, "basaltBrick");

		GameRegistry.registerBlock(basalt, "MHObasalt");
		GameRegistry.registerBlock(basaltCobblestone, "MHObasaltCobblestone");
		GameRegistry.registerBlock(basaltStonebrick, "MHObasaltStonebrick");
		
		LanguageRegistry.addName(basalt, "Basalt");
		LanguageRegistry.addName(basaltCobblestone, "Basalt fragment\u00e9");
		LanguageRegistry.addName(basaltStonebrick, "Briques de basalt");
	}

	public void initSetsOfNaturalBlocks(ConfigCore cc)
	{
		/** Ice Blocks **/
		iceLog = new BlockLogMho(cc.iceLogID, "iceLog");
		iceLeaves = new BlockLeavesMho(cc.iceLeavesID, "iceLeaves");
		iceLeavesLight = new BlockLeavesMho(cc.iceLeavesLightID, "iceLeavesLight");
		icePlank = new BlockMho(cc.icePlankID, Material.wood, "icePlank").setStepSound(Block.soundWoodFootstep);

		GameRegistry.registerBlock(iceLog, "MHOiceLog");
		GameRegistry.registerBlock(iceLeaves, "MHOiceLeaves");
		GameRegistry.registerBlock(iceLeavesLight, "MHOiceLeavesLight");
		GameRegistry.registerBlock(icePlank, "MHOicePlank");
		
		LanguageRegistry.addName(iceLog, "B\u00fbche glac\u00E9e");
		LanguageRegistry.addName(iceLeaves, "Feuilles glac\u00E9es");
		LanguageRegistry.addName(iceLeavesLight, "Feuilles claires glac\u00E9es");
		LanguageRegistry.addName(icePlank, "Planche glac\u00E9e");
		
		/** Dark Blocks **/
		darkStone = new BlockStoneMho(cc.darkStoneID, Material.rock, "darkStone", cc.darkCobblestoneID);
		darkCobblestone = new BlockMho(cc.darkCobblestoneID, Material.rock, "darkCobblestone");
		darkDirt = new BlockMho(cc.darkDirtID, Material.ground, "darkDirt").setStepSound(Block.soundGravelFootstep);
		darkGrassBlock = new BlockGrassMho(cc.darkGrassID, "dark");
		darkLog = new BlockLogMho(cc.darkLogID, "darkLog");
		darkLeaves = new BlockLeavesMho(cc.darkLeavesID, "darkLeaves");

		GameRegistry.registerBlock(darkStone, "MHOdarkStone");
		GameRegistry.registerBlock(darkCobblestone, "MHOdarkCobblestone");
		GameRegistry.registerBlock(darkDirt, "MHOdarkDirt");
		GameRegistry.registerBlock(darkGrassBlock, "MHOdarkGrassBlock");
		GameRegistry.registerBlock(darkLog, "MHOdarkLog");
		GameRegistry.registerBlock(darkLeaves, "MHOdarkLeaves");
		
		LanguageRegistry.addName(darkStone, "Pierre sombre");
		LanguageRegistry.addName(darkCobblestone, "Pierre sombre fragment\u00e9e");
		LanguageRegistry.addName(darkDirt, "Terre sombre");
		LanguageRegistry.addName(darkGrassBlock, "Bloc d'herbe sombre");
		LanguageRegistry.addName(darkLog, "B\u00fbche sombre");
		LanguageRegistry.addName(darkLeaves, "Feuilles sombre");

		/** Mysterious Blocks **/
		mysteriousStone = new BlockMho(cc.mysteriousStoneID, Material.rock, "mysteriousStone");
		mysteriousDirt = new BlockMho(cc.mysteriousDirtID, Material.ground, "mysteriousDirt").setStepSound(Block.soundGravelFootstep);
		mysteriousGrassBlock = new BlockGrassMho(cc.mysteriousGrassBlockID, "mysterious");
		mysteriousLog = new BlockLogMho(cc.mysteriousLogID, "mysteriousLog");
		mysteriousLeaves = new BlockLeavesMho(cc.mysteriousLeavesID, "mysteriousLeaves");
		mysteriousLeavesPurple = new BlockLeavesMho(cc.mysteriousLeavesPurpleID, "mysteriousLeavesPurple").setLightValue(0.3F);

		mysteriousFlower = new BlockFlowerMho(cc.mysteriousFlowerID, "mysteriousFlower").setLightValue(0.2F);
		mysteriousPlantPurple = new BlockFlowerMho(cc.mysteriousPlantPurpleID, "mysteriousPlantPurple").setLightValue(0.2F);
		mysteriousCoral = new BlockCoralPlant(cc.mysteriousCoralID, "mysteriousCoral").setLightValue(0.5F);
		mysteriousAlgue = new BlockCoralPlant(cc.mysteriousAlgueID, "mysteriousAlgue").setLightValue(0.5F);
		mysteriousPlant = new BlockFlowerMho(cc.mysteriousPlantID, "mysteriousPlant");
		mysteriousReed = new BlockReedMho(cc.mysteriousReedID, "mysteriousReed").setLightValue(0.2F);
		mysteriousGrass = new BlockFlowerMho(cc.mysteriousGrassID, "mysteriousGrass");

		GameRegistry.registerBlock(mysteriousStone, "MHOmysteriousStone");
		GameRegistry.registerBlock(mysteriousDirt, "MHOmysteriousDirt");
		GameRegistry.registerBlock(mysteriousGrassBlock, "MHOmysteriousGrassBlock");
		GameRegistry.registerBlock(mysteriousLog, "MHOmysteriousLog");
		GameRegistry.registerBlock(mysteriousLeaves, "MHOmysteriousLeaves");
		GameRegistry.registerBlock(mysteriousLeavesPurple, "MHOmysteriousLeavesPurple");

		GameRegistry.registerBlock(mysteriousFlower, "MHOmysteriousFlower");
		GameRegistry.registerBlock(mysteriousPlantPurple, "MHOmysteriousPlantPurple");
		GameRegistry.registerBlock(mysteriousCoral, "MHOmysteriousCoral");
		GameRegistry.registerBlock(mysteriousAlgue, "MHOmysteriousAlgue");
		GameRegistry.registerBlock(mysteriousPlant, "MHOmysteriousPlant");
		GameRegistry.registerBlock(mysteriousReed, "MHOmysteriousReed");
		GameRegistry.registerBlock(mysteriousGrass, "MHOmysteriousGrass");
		
		LanguageRegistry.addName(mysteriousStone, "Pierre myst\u00e9rieuse");
		LanguageRegistry.addName(mysteriousDirt, "Terre myst\u00e9rieuse");
		LanguageRegistry.addName(mysteriousGrassBlock, "Bloc d'herbe myst\u00e9rieuse");
		LanguageRegistry.addName(mysteriousLog, "B\u00fbche myst\u00e9rieuse");
		LanguageRegistry.addName(mysteriousLeaves, "Feuilles myst\u00e9rieuses");
		LanguageRegistry.addName(mysteriousLeavesPurple, "Feuilles myst\u00e9rieuses violettes");

		LanguageRegistry.addName(mysteriousFlower, "Fleur myst\u00e9rieuse");
		LanguageRegistry.addName(mysteriousPlantPurple, "Plante myst\u00e9rieuse violette");
		LanguageRegistry.addName(mysteriousCoral, "Corail myst\u00e9rieux");
		LanguageRegistry.addName(mysteriousAlgue, "Algue myst\u00e9rieuse");
		LanguageRegistry.addName(mysteriousPlant, "Plante myst\u00e9rieuse");
		LanguageRegistry.addName(mysteriousReed, "Canne \u00e0 sucre myst\u00e9rieuse");
		LanguageRegistry.addName(mysteriousGrass, "Herbe myst\u00e9rieuse");

		/** Red Rock **/
		redGrassBlock = new BlockMho(cc.redGrassBlockID, Material.grass, "redGrassBlock").setStepSound(Block.soundGrassFootstep);
		redGravel = new BlockMho(cc.redGravelID, Material.ground, "redGravel").setStepSound(Block.soundGravelFootstep);
		redRockBigLine = new BlockRedRockLines(cc.redRockBigLineID, "redRockBigLine");
		redRockLines = new BlockRedRockLines(cc.redRockLinesID, "redRockLines");
		redSilver = new BlockMho(cc.redSilverID, Material.rock, "redSilver");

		GameRegistry.registerBlock(redGrassBlock, "MHOredGrassBlock");
		GameRegistry.registerBlock(redGravel, "MHOredGravel");
		GameRegistry.registerBlock(redRockBigLine, "MHOredRockBigLine");
		GameRegistry.registerBlock(redRockLines, "MHOredRockLines");
		GameRegistry.registerBlock(redSilver, "MHOredSilver");
		
		LanguageRegistry.addName(redGrassBlock, "Roche rouge herbeuse");
		LanguageRegistry.addName(redGravel, "Gravier de pierre rouge");
		LanguageRegistry.addName(redRockBigLine, "Pierre rouge \u00e0 strate calcaire");
		LanguageRegistry.addName(redRockLines, "Pierre rouge \u00e0 strates fines calcaire");
		LanguageRegistry.addName(redSilver, "Minerai d'argent");

		/** Rocks **/
		greyRock = new BlockDirectionalTopBot(cc.greyRockID, Material.rock, "greyRock");
		greyRockGrass = new BlockRockGrass(cc.greyRockGrassID, "greyRock");
		
		brownRock = new BlockDirectionalTopBot(cc.brownRockID, Material.rock, "brownRock");
		brownRockGrass = new BlockRockGrass(cc.brownRockGrassID, "brownRock");
		
		darkRock = new BlockDirectionalTopBot(cc.darkRockID, Material.rock, "darkRock");
		darkRockGrass = new BlockRockGrass(cc.darkRockGrassID, "darkRock");
		
		blackRock = new BlockDirectionalTopBot(cc.blackRockID, Material.rock, "blackRock");
		
		lavaRock = new BlockDirectionalTopBot(cc.lavaRockID, Material.rock, "lavaRock");
		lavaRockRed = new BlockDirectionalTopBot(cc.lavaRockRedID, Material.rock, "lavaRockRed");

		GameRegistry.registerBlock(greyRock, "MHOgreyRock");
		GameRegistry.registerBlock(greyRockGrass, "MHOgreyRockGrass");

		GameRegistry.registerBlock(brownRock, "MHObrownRock");
		GameRegistry.registerBlock(brownRockGrass, "MHObrownRockGrass");

		GameRegistry.registerBlock(darkRock, "MHOdarkRock");
		GameRegistry.registerBlock(darkRockGrass, "MHOdarkRockGrass");

		GameRegistry.registerBlock(blackRock, "MHOblackRock");

		GameRegistry.registerBlock(lavaRock, "MHOlavaRock");
		GameRegistry.registerBlock(lavaRockRed, "MHOlavaRockRed");
		
		LanguageRegistry.addName(greyRock, "Roche grise");
		LanguageRegistry.addName(greyRockGrass, "Roche grise herbeuse");
		
		LanguageRegistry.addName(brownRock, "Roche brune");
		LanguageRegistry.addName(brownRockGrass, "Roche brune herbeuse");
		
		LanguageRegistry.addName(darkRock, "Roche sombre");
		LanguageRegistry.addName(darkRockGrass, "Roche sombre herbeuse");
		
		LanguageRegistry.addName(blackRock, "Roche noire");
		
		LanguageRegistry.addName(lavaRock, "Roche volcanique");
		LanguageRegistry.addName(lavaRockRed, "Roche volcanique rouge");
	}

	public void initTimbereds(ConfigCore cc)
	{
		timberedSquare = new BlockTimbered(cc.timberedSquareID, "timberedSquare");
		timberedCross = new BlockTimbered(cc.timberedCrossID, "timberedCross");
		timberedVertical = new BlockTimbered(cc.timberedVerticalID, "timberedVertical");
		timberedHorizontal = new BlockTimbered(cc.timberedHorizontalID, "timberedHorizontal");
		timberedLeft = new BlockTimbered(cc.timberedLeftID, "timberedLeft");
		timberedRight = new BlockTimbered(cc.timberedRightID, "timberedRight");

		GameRegistry.registerBlock(timberedSquare, "MHOtimberedSquare");
		GameRegistry.registerBlock(timberedCross, "MHOtimberedCross");
		GameRegistry.registerBlock(timberedVertical, "MHOtimberedVertical");
		GameRegistry.registerBlock(timberedHorizontal, "MHOtimberedHorizontal");
		GameRegistry.registerBlock(timberedLeft, "MHOtimberedLeft");
		GameRegistry.registerBlock(timberedRight, "MHOtimberedRight");
		
		LanguageRegistry.addName(timberedSquare, "Colombage carr\u00e9");
		LanguageRegistry.addName(timberedCross, "Colombage crois\u00e9");
		LanguageRegistry.addName(timberedVertical, "Colombage vertical");
		LanguageRegistry.addName(timberedHorizontal, "Colombage horizontal");
		LanguageRegistry.addName(timberedLeft, "Colombage gauche");
		LanguageRegistry.addName(timberedRight, "Colombage droite");

		timberedSquareDark = new BlockTimbered(cc.timberedSquareDarkID, "timberedSquareDark");
		timberedCrossDark = new BlockTimbered(cc.timberedCrossDarkID, "timberedCrossDark");
		timberedVerticalDark = new BlockTimbered(cc.timberedVerticalDarkID, "timberedVerticalDark");
		timberedHorizontalDark = new BlockTimbered(cc.timberedHorizontalDarkID, "timberedHorizontalDark");
		timberedLeftDark = new BlockTimbered(cc.timberedLeftDarkID, "timberedLeftDark");
		timberedRightDark = new BlockTimbered(cc.timberedRightDarkID, "timberedRightDark");

		GameRegistry.registerBlock(timberedSquareDark, "MHOtimberedSquareDark");
		GameRegistry.registerBlock(timberedCrossDark, "MHOtimberedCrossDark");
		GameRegistry.registerBlock(timberedVerticalDark, "MHOtimberedVerticalDark");
		GameRegistry.registerBlock(timberedHorizontalDark, "MHOtimberedHorizontalDark");
		GameRegistry.registerBlock(timberedLeftDark, "MHOtimberedLeftDark");
		GameRegistry.registerBlock(timberedRightDark, "MHOtimberedRightDark");
		
		LanguageRegistry.addName(timberedSquareDark, "Colombage carr\u00e9 fonc\u00e9");
		LanguageRegistry.addName(timberedCrossDark, "Colombage crois\u00e9 fonc\u00e9");
		LanguageRegistry.addName(timberedVerticalDark, "Colombage vertical fonc\u00e9");
		LanguageRegistry.addName(timberedHorizontalDark, "Colombage horizontal fonc\u00e9");
		LanguageRegistry.addName(timberedLeftDark, "Colombage gauche fonc\u00e9");
		LanguageRegistry.addName(timberedRightDark, "Colombage droite fonc\u00e9");
	}

	public void initSigns(ConfigCore cc)
	{
		signAlchemy = new BlockSign(cc.signAlchemyID, "signAlchemy");
		signBank = new BlockSign(cc.signBankID, "signBank");
		signForge = new BlockSign(cc.signForgeID, "signForge");
		signShield = new BlockSign(cc.signShieldID, "signShield");
		signSanctuary = new BlockSign(cc.signSanctuaryID, "signSanctuary");
		signArmory = new BlockSign(cc.signArmoryID, "signArmory");
		signLibrary = new BlockSign(cc.signLibraryID, "signLibrary");
		signRestaurant = new BlockSign(cc.signRestaurantID, "signRestaurant");
		signTavern = new BlockSign(cc.signTavernID, "signTavern");
		signMaterials = new BlockSign(cc.signMaterialsID, "signMaterials");
		signHostel = new BlockSign(cc.signHostelID, "signHostel");
		signStable = new BlockSign(cc.signStableID, "signStable");
		signDiamond = new BlockSign(cc.signDiamondID, "signDiamond");
		signPho = new BlockSign(cc.signPhoID, "signPho");
		signCrystal = new BlockSign(cc.signCrystalID, "signCrystal");

		GameRegistry.registerBlock(signAlchemy, "MHOsignAlchemy");
		GameRegistry.registerBlock(signBank, "MHOsignBank");
		GameRegistry.registerBlock(signForge, "MHOsignForge");
		GameRegistry.registerBlock(signShield, "MHOsignShield");
		GameRegistry.registerBlock(signSanctuary, "MHOsignSanctuary");
		GameRegistry.registerBlock(signArmory, "MHOsignArmory");
		GameRegistry.registerBlock(signLibrary, "MHOsignLibrary");
		GameRegistry.registerBlock(signRestaurant, "MHOsignRestaurant");
		GameRegistry.registerBlock(signTavern, "MHOsignTavern");
		GameRegistry.registerBlock(signMaterials, "MHOsignMaterials");
		GameRegistry.registerBlock(signHostel, "MHOsignHostel");
		GameRegistry.registerBlock(signStable, "MHOsignStable");
		GameRegistry.registerBlock(signDiamond, "MHOsignDiamond");
		GameRegistry.registerBlock(signPho, "MHOsignPho");
		GameRegistry.registerBlock(signCrystal, "MHOsignCrystal");
		
		LanguageRegistry.addName(signAlchemy, "Enseigne d'Alchimie");
		LanguageRegistry.addName(signBank, "Enseigne de Banque");
		LanguageRegistry.addName(signForge, "Enseigne de Forge");
		LanguageRegistry.addName(signShield, "Enseigne de Bouclier");
		LanguageRegistry.addName(signSanctuary, "Enseigne de Sanctuaire");
		LanguageRegistry.addName(signArmory, "Enseigne d'Armurerie");
		LanguageRegistry.addName(signLibrary, "Enseigne de Librairie");
		LanguageRegistry.addName(signRestaurant, "Enseigne de Restaurant");
		LanguageRegistry.addName(signTavern, "Enseigne de Taverne");
		LanguageRegistry.addName(signMaterials, "Enseigne de Mat\u00e9riaux");
		LanguageRegistry.addName(signHostel, "Enseigne d'Auberge");
		LanguageRegistry.addName(signStable, "Enseigne d'Ecurie");
		LanguageRegistry.addName(signDiamond, "Enseigne de Diamant");
		LanguageRegistry.addName(signPho, "Enseigne de PHO");
		LanguageRegistry.addName(signCrystal, "Enseigne de Cristal");
	}
	
	public void initCorals(ConfigCore cc)
	{
		coralOrange = new BlockCoralPlant(cc.coralOrangeID, "coralOrange").setLightValue(1.0F);
		coralGreen = new BlockCoralBreath(cc.coralGreenID, "coralGreen");
		coralPurple = new BlockCoralPlant(cc.coralPurpleID, "coralPurple").setLightValue(1.0F);
		coralRose = new BlockCoralDamage(cc.coralRoseID, "coralRose");
		coralBlack = new BlockCoralBreath(cc.coralBlackID, "coralBlack");
		coralBlue = new BlockCoralPlant(cc.coralBlueID, "coralBlue");

		coralBlockReef = new BlockMho(cc.coralBlockReefID, Material.grass, "coralBlockReef").setLightValue(0.3F).setStepSound(Block.soundGrassFootstep);
		coralBlockSponge = new BlockMho(cc.coralBlockSpongeID, Material.grass, "coralBlockSponge").setLightValue(0.3F).setStepSound(Block.soundGrassFootstep);

		GameRegistry.registerBlock(coralOrange, "MHOcoralOrange");
		GameRegistry.registerBlock(coralGreen, "MHOcoralGreen");
		GameRegistry.registerBlock(coralPurple, "MHOcoralPurple");
		GameRegistry.registerBlock(coralRose, "MHOcoralRose");
		GameRegistry.registerBlock(coralBlack, "MHOcoralBlack");
		GameRegistry.registerBlock(coralBlue, "MHOcoralBlue");

		GameRegistry.registerBlock(coralBlockReef, "MHOcoralBlockReef");
		GameRegistry.registerBlock(coralBlockSponge, "MHOcoralBlockSponge");

		LanguageRegistry.addName(coralOrange, "Corail orange");
		LanguageRegistry.addName(coralGreen, "Corail vert");
		LanguageRegistry.addName(coralPurple, "Corail violet");
		LanguageRegistry.addName(coralRose, "Corail rose");
		LanguageRegistry.addName(coralBlack, "Corail noir");
		LanguageRegistry.addName(coralBlue, "Corail bleu");

		LanguageRegistry.addName(coralBlockReef, "Corail r\u00E9cif");
		LanguageRegistry.addName(coralBlockSponge, "Corail \u00E9ponge");
	}

	public void initDoubleBlocks(ConfigCore cc)
	{
		doubleCrateBlock = new BlockDoubleCrate(cc.doubleCrateBlockID, "doubleCrate");
		doubleCrateItemBlock = new ItemBlockDoubleCrate(cc.doubleCrateItemBlockID);
		
		doubleTorchLower = new BlockDoubleBrightLower(cc.doubleTorchLowerID, Material.wood,"doubleTorch").setStepSound(Block.soundWoodFootstep);
		doubleTorchUpper = new BlockDoubleBrightUpper(cc.doubleTorchUpperID, Material.wood,"doubleTorch").setStepSound(Block.soundWoodFootstep);
		doubleCandleLower = new BlockDoubleBrightLower(cc.doubleCandleLowerID, Material.wood,"doubleCandle").setStepSound(Block.soundWoodFootstep);
		doubleCandleUpper = new BlockDoubleBrightUpper(cc.doubleCandleUpperID, Material.wood,"doubleCandle").setStepSound(Block.soundWoodFootstep);
		doubleLanternLower = new BlockDoubleBrightLower(cc.doubleLanternLowerID, Material.iron,"doubleLantern").setStepSound(Block.soundMetalFootstep);
		doubleLanternUpper = new BlockDoubleBrightUpper(cc.doubleLanternUpperID, Material.iron,"doubleLantern").setStepSound(Block.soundMetalFootstep);
		
		normalDoubleGrassLower = new BlockDoubleGrassLower(cc.normalDoubleGrassLowerID, "normalDoubleGrass");
		normalDoubleGrassUpper = new BlockDoubleGrassUpper(cc.normalDoubleGrassUpperID, "normalDoubleGrass");
		savanaDoubleGrassLower = new BlockDoubleGrassLower(cc.savanaDoubleGrassLowerID, "savanaDoubleGrass");
		savanaDoubleGrassUpper = new BlockDoubleGrassUpper(cc.savanaDoubleGrassUpperID, "savanaDoubleGrass");
		mysteriousDoubleGrassLower = new BlockDoubleGrassLower(cc.mysteriousDoubleGrassLowerID, "mysteriousDoubleGrass");
		mysteriousDoubleGrassUpper = new BlockDoubleGrassUpper(cc.mysteriousDoubleGrassUpperID, "mysteriousDoubleGrass").setLightValue(0.3F);

		GameRegistry.registerBlock(doubleCrateBlock, "MHOdoubleCrateBlock");

		GameRegistry.registerBlock(doubleTorchLower, "MHOdoubleTorchLower");
		GameRegistry.registerBlock(doubleTorchUpper, "MHOdoubleTorchUpper");
		GameRegistry.registerBlock(doubleCandleLower, "MHOdoubleCandleLower");
		GameRegistry.registerBlock(doubleCandleUpper, "MHOdoubleCandleUpper");
		GameRegistry.registerBlock(doubleLanternLower, "MHOdoubleLanternLower");
		GameRegistry.registerBlock(doubleLanternUpper, "MHOdoubleLanternUpper");

		GameRegistry.registerBlock(normalDoubleGrassLower, "MHOnormalDoubleGrassLower");
		GameRegistry.registerBlock(normalDoubleGrassUpper, "MHOnormalDoubleGrassUpper");
		GameRegistry.registerBlock(savanaDoubleGrassLower, "MHOsavanaDoubleGrassLower");
		GameRegistry.registerBlock(savanaDoubleGrassUpper, "MHOsavanaDoubleGrassUpper");
		GameRegistry.registerBlock(mysteriousDoubleGrassLower, "MHOmysteriousDoubleGrassLower");
		GameRegistry.registerBlock(mysteriousDoubleGrassUpper, "MHOmysteriousDoubleGrassUpper");

		LanguageRegistry.addName(doubleCrateItemBlock, "Grande caisse");
		
		LanguageRegistry.addName(doubleTorchUpper, "Grande torche");
		LanguageRegistry.addName(doubleCandleUpper, "Grande bougie");
		LanguageRegistry.addName(doubleLanternUpper, "Lampadaire");

		LanguageRegistry.addName(normalDoubleGrassUpper, "Hautes herbes");
		LanguageRegistry.addName(savanaDoubleGrassUpper, "Hautes herbes de savanne");
		LanguageRegistry.addName(mysteriousDoubleGrassUpper, "Hautes herbes myst\u00e9rieuses");
	}

	public void initMetaBlocks(ConfigCore cc)
	{
		metaWoolLight = new BlockMetaWoolLight(cc.metaWoolLightID).setUnlocalizedName("MHOwoolColoredLight");
		metaVitrail = new BlockStainedGlass(cc.metaVitrailID).setUnlocalizedName("MHOvitrail");
		metaVitrailPane = new BlockStainedGlassPane(cc.metaVitrailPaneID).setUnlocalizedName("MHOvitrailPane");

		GameRegistry.registerBlock(metaWoolLight, ItemBlockWoolLight.class,"MHOwoolColoredLight");
		GameRegistry.registerBlock(Mho.metaVitrail, ItemBlockStainedGlass.class,"MHOvitrail");
		GameRegistry.registerBlock(Mho.metaVitrailPane, ItemBlockStainedGlassPane.class,"MHOvitrailPane");

		for (int ix = 0; ix < 16; ix++) {
			LanguageRegistry.addName(new ItemStack(metaWoolLight, 1, ix), "Laine lumineuse " + dyeFemNames[ix]);
		}

		for (int ix = 0; ix < 16; ix++) {
			LanguageRegistry.addName(new ItemStack(metaVitrail, 1, ix), "Vitrail " + dyeMalNames[ix]);
		}

		for (int ix = 0; ix < 16; ix++) {
			LanguageRegistry.addName(new ItemStack(metaVitrailPane, 1, ix), "Vitrail plat " + dyeMalNames[ix]);
		}
	}

	public void initBrightBlocks(ConfigCore cc)
	{
		lanternWood = new BlockMho(cc.lanternWoodID, Material.wood, "lanternWood").setLightValue(1.0F).setStepSound(Block.soundGlassFootstep);
		lanternIron = new BlockMho(cc.lanternIronID, Material.iron, "lanternIron").setLightValue(1.0F).setStepSound(Block.soundGlassFootstep);

		lampionBlanc = new BlockDirectionalTopBot(cc.lampionBlancID, Material.cloth, "lampionBlanc").setLightValue(1.0F).setStepSound(Block.soundClothFootstep);
		lampionBleu = new BlockDirectionalTopBot(cc.lampionBleuID, Material.cloth, "lampionBleu").setLightValue(1.0F).setStepSound(Block.soundClothFootstep);
		lampionJaune = new BlockDirectionalTopBot(cc.lampionJauneID, Material.cloth, "lampionJaune").setLightValue(1.0F).setStepSound(Block.soundClothFootstep);
		lampionVert = new BlockDirectionalTopBot(cc.lampionVertID, Material.cloth, "lampionVert").setLightValue(1.0F).setStepSound(Block.soundClothFootstep);
		lampionRouge = new BlockDirectionalTopBot(cc.lampionRougeID, Material.cloth, "lampionRouge").setLightValue(1.0F).setStepSound(Block.soundClothFootstep);

		lightCandle = new BlockTorchMho(cc.lightCandleID, "lightCandle");
		lightLantern = new BlockTorchMho(cc.lightLanternID, "lightLantern");
		lightSkullCandle = new BlockTorchMho(cc.lightSkullCandleID, "lightSkullCandle");
		lightSkullSpike = new BlockTorchMho(cc.lightSkullSpikeID, "lightSkullSpike");

		GameRegistry.registerBlock(lanternWood, "MHOlanternWood");
		GameRegistry.registerBlock(lanternIron, "MHOlanternIron");

		GameRegistry.registerBlock(lampionBlanc, "MHOlampionBlanc");
		GameRegistry.registerBlock(lampionBleu, "MHOlampionBleu");
		GameRegistry.registerBlock(lampionJaune, "MHOlampionJaune");
		GameRegistry.registerBlock(lampionVert, "MHOlampionVert");
		GameRegistry.registerBlock(lampionRouge, "MHOlampionRouge");

		GameRegistry.registerBlock(lightCandle, "MHOlightCandle");
		GameRegistry.registerBlock(lightLantern, "MHOlightLantern");
		GameRegistry.registerBlock(lightSkullCandle, "MHOlightSkullCandle");
		GameRegistry.registerBlock(lightSkullSpike, "lightSkullSpike");
		
		LanguageRegistry.addName(lanternWood, "Lanterne en bois");
		LanguageRegistry.addName(lanternIron, "Lanterne en fer");

		LanguageRegistry.addName(lampionBlanc, "Lampion blanc");
		LanguageRegistry.addName(lampionBleu, "Lampion bleu");
		LanguageRegistry.addName(lampionJaune, "Lampion jaune");
		LanguageRegistry.addName(lampionVert, "Lampion vert");
		LanguageRegistry.addName(lampionRouge, "Lampion rouge");

		LanguageRegistry.addName(lightCandle, "Bougie");
		LanguageRegistry.addName(lightLantern, "Lanterne");
		LanguageRegistry.addName(lightSkullCandle, "Bougie sur cr\u00e2ne");
		LanguageRegistry.addName(lightSkullSpike, "Cr\u00e2ne lumineux");
	}
	
	public void initSimpleBlocks(ConfigCore cc)
	{
		crossCrate = new BlockMho(cc.crossCrateID, Material.wood, "crossCrate").setStepSound(Block.soundWoodFootstep);
		barredCrate = new BlockMho(cc.barredCrateID, Material.wood, "barredCrate").setStepSound(Block.soundWoodFootstep).setTextureName("doubleCrateTop");
		leatherBlock = new BlockMho(cc.leatherBlockID, Material.cloth, "leatherBlock").setStepSound(Block.soundClothFootstep);
		PHOnoir = new BlockMho(cc.PHOnoirID, Material.rock, "phoNoir");
		PHOblanc = new BlockMho(cc.PHOblancID, Material.rock, "phoBlanc");
		silverBlock = new BlockMho(cc.silverBlockID, Material.iron, "silverBlock").setStepSound(Block.soundMetalFootstep);
		obsidianBlock = new BlockMho(cc.obsidianBlockID, Material.rock, "obsidianBlock");
		shoji = new BlockMho(cc.shojiID, Material.cloth, "shoji").setLightOpacity(100).setStepSound(Block.soundClothFootstep);

		GameRegistry.registerBlock(crossCrate, "MHOcrossCrate");
		GameRegistry.registerBlock(barredCrate, "MHObarredCrate");
		GameRegistry.registerBlock(leatherBlock, "MHOleatherBlock");
		GameRegistry.registerBlock(PHOnoir, "MHOPHOnoir");
		GameRegistry.registerBlock(PHOblanc, "MHOPHOblanc");
		GameRegistry.registerBlock(silverBlock, "MHOsilverBlock");
		GameRegistry.registerBlock(obsidianBlock, "MHOobsidianBlock");
		GameRegistry.registerBlock(shoji, "MHOshoji");
		
		LanguageRegistry.addName(crossCrate, "Caisse crois\u00e9e");
		LanguageRegistry.addName(barredCrate, "Caisse barr\u00e9e");
		LanguageRegistry.addName(leatherBlock, "Bloc de cuir");
		LanguageRegistry.addName(PHOnoir, "Pierre noire du PHO");
		LanguageRegistry.addName(PHOblanc, "Pierre blanche du PHO");
		LanguageRegistry.addName(silverBlock, "Bloc d'argent de Reder");
		LanguageRegistry.addName(obsidianBlock, "Bloc d'obsidienne en fusion");
		LanguageRegistry.addName(shoji, "Mur en papier Shoji");
		
		/** Tiles **/
		tileArdoise = new BlockMho(cc.tileArdoiseID, Material.rock, "tileArdoise");
		tileRed = new BlockMho(cc.tileRedID, Material.rock, "tileRed");
		tileBlack = new BlockMho(cc.tileBlackID, Material.rock, "tileBlack");
		tileBlue = new BlockMho(cc.tileBlueID, Material.rock, "tileBlue");
		tileRedBig = new BlockMho(cc.tileRedBigID, Material.rock, "tileRedBig");
		tileBlackBig = new BlockMho(cc.tileBlackBigID, Material.rock, "tileBlackBig");
		tileBlueBig = new BlockMho(cc.tileBlueBigID, Material.rock, "tileBlueBig");
		tileBlackAlt = new BlockMho(cc.tileBlackAltID, Material.rock, "tileBlackAlt");

		GameRegistry.registerBlock(tileArdoise, "MHOtileArdoise");
		GameRegistry.registerBlock(tileRed, "MHOtileRed");
		GameRegistry.registerBlock(tileBlack, "MHOtileBlack");
		GameRegistry.registerBlock(tileBlue, "MHOtileBlue");
		GameRegistry.registerBlock(tileRedBig, "MHOtileRedBig");
		GameRegistry.registerBlock(tileBlackBig, "MHOtileBlackBig");
		GameRegistry.registerBlock(tileBlueBig, "MHOtileBlueBig");
		GameRegistry.registerBlock(tileBlackAlt, "MHOtileBlackAlt");
		
		LanguageRegistry.addName(tileArdoise, "Ardoises");
		LanguageRegistry.addName(tileRed, "Tuiles rouges");
		LanguageRegistry.addName(tileBlack, "Tuiles noires");
		LanguageRegistry.addName(tileBlue, "Tuiles bleues");
		LanguageRegistry.addName(tileRedBig, "Grandes tuiles rouges");
		LanguageRegistry.addName(tileBlackBig, "Grandes tuiles noires");
		LanguageRegistry.addName(tileBlueBig, "Grandes tuiles bleues");
		LanguageRegistry.addName(tileBlackAlt, "Tuiles noires d\u00e9chauss\u00e9es");
	}
	
	public void initSpecialBlocks(ConfigCore cc)
	{
		meatBlock = new BlockSixFaces(cc.meatBlockID, Material.cloth, "meatBlock").setStepSound(Block.soundClothFootstep);
		fossileBlock = new BlockSixFaces(cc.fossileBlockID, Material.rock, "fossileBlock");
		
		GameRegistry.registerBlock(meatBlock, "MHOmeatBlock");
		GameRegistry.registerBlock(fossileBlock, "MHOfossileBlock");
		
		LanguageRegistry.addName(meatBlock, "Bloc de viande");
		LanguageRegistry.addName(fossileBlock, "Fossile");

		simpleDirtBlock = new BlockMcComplete(cc.simpleDirtBlockID, Block.dirt, 0, "classicDirt");
		completeLogOak = new BlockMcComplete(cc.completeLogOakID, Block.wood, 0, "completeLogOak");
		completeLogSpruce = new BlockMcComplete(cc.completeLogSpruceID, Block.wood, 1, "completeLogSpruce");

		GameRegistry.registerBlock(simpleDirtBlock, "MHOsimpleDirtBlock");
		GameRegistry.registerBlock(completeLogOak, "MHOcompleteLogOak");
		GameRegistry.registerBlock(completeLogSpruce, "MHOcompleteLogSpruce");
		
		LanguageRegistry.addName(simpleDirtBlock, "Terre classique");
		LanguageRegistry.addName(completeLogOak, "B\u00fbche de ch\u00eane compl\u00e8te");
		LanguageRegistry.addName(completeLogSpruce, "B\u00fbche de pin compl\u00e8te");
		
		vaillantCrate = new BlockDirectionalSimple(cc.vaillantCrateID, Material.wood, "vaillantCrate");

		GameRegistry.registerBlock(vaillantCrate, "MHOvaillantCrate");
		
		LanguageRegistry.addName(vaillantCrate, "Caisse du Vaillant");

		ironWindow = new BlockGlassMho(cc.ironWindowID, Material.iron, "ironWindow").setStepSound(Block.soundMetalFootstep);
		metalGrid = new BlockGlassMho(cc.metalGridID, Material.iron, "metalGrid").setStepSound(Block.soundMetalFootstep);
		
		GameRegistry.registerBlock(ironWindow, "MHOironWindow");
		GameRegistry.registerBlock(metalGrid, "MHOmetalGrid");
		
		LanguageRegistry.addName(ironWindow, "Fen\u00eatre en fer");
		LanguageRegistry.addName(metalGrid, "Grille fine en acier");

		woeBlock = new BlockTransparent(cc.woeBlockID, Material.glass, "woeBlock").setLightValue(0.5F).setStepSound(Block.soundGlassFootstep);
		
		GameRegistry.registerBlock(woeBlock, "MHOwoeBlock");
		
		LanguageRegistry.addName(woeBlock, "Bloc du War of Emperium");
		
		lavaBlock = new BlockAnim(cc.lavaBlockID, Material.lava, "lava_still");
		waterBlock = new BlockAnim(cc.waterBlockID, Material.water, "water_still");

		GameRegistry.registerBlock(lavaBlock, "MHOlavaBlock");
		GameRegistry.registerBlock(waterBlock, "MHOwaterBlock");
		
		LanguageRegistry.addName(lavaBlock, "Bloc de lave");
		LanguageRegistry.addName(waterBlock, "Bloc d\u0027eau");
		
		logCherry = new BlockLogMho(cc.logCherryID, "logCherry");
		logRed = new BlockLogMho(cc.logRedID, "logRed");
		barrel = new BlockLogMho(cc.barrelID, "tonneau");

		GameRegistry.registerBlock(logCherry, "MHOlogCherry");
		GameRegistry.registerBlock(logRed, "MHOlogRed");
		GameRegistry.registerBlock(barrel, "MHObarrel");
		
		LanguageRegistry.addName(logCherry, "B\u00fbche de cerisier");
		LanguageRegistry.addName(logRed, "B\u00fbche rouge");
		LanguageRegistry.addName(barrel, "Tonneau");
		
		ironWindowPane = new BlockPaneMho(cc.ironWindowPaneID, "ironWindow", "ironWindowPane");

		GameRegistry.registerBlock(ironWindowPane, "MHOironWindowPane");
		
		LanguageRegistry.addName(ironWindowPane, "Fen\u00eatre plate en fer");

		grisouBlock = new BlockGrisou(cc.grisouBlockID, Material.rock, "grisouBlock").setTextureName("stone");
		slimeBlock = new BlockSlime(cc.slimeBlockID, "slimeBlock");
		invisibleBlock = new BlockInvisible(cc.invisibleBlockID, "invisible");
		portalPurple = new BlockDragonPortal(cc.portalPurpleID, "portalPurple");
		bookBlock = new BlockBook(cc.bookBlockID, "bookBlock");
		chainIron = new BlockChain(cc.chainIronID, "chain");
		chainRope = new BlockChain (cc.chainRopeID, "rope"); 
		ropeRail = new BlockRopeRail(cc.ropeRailID, "rope");
		spikes = new BlockPike(cc.spikesID, "spike").setStepSound(Block.soundMetalFootstep);
		climbingLadder = new BlockLadderMho(cc.climbingLadderID, "climbingLadder").setStepSound(Block.soundStoneFootstep);
		roseVines = new BlockVineMho(cc.roseVinesID, "roseVine");
		cristalLittle = new BlockCristal(cc.cristalLittleID, "cristalLittle");
		cristalBig = new BlockCristal(cc.cristalBigID, "cristalBig");
		cristalBlock = new BlockCristalMho(cc.cristalBlockID, "cristalBlock");
		cakeLieBlock = new BlockCakeLie(cc.cakeLieBlockID, Material.cake, "cakeLieBlock");
		meatCakeBlock = new BlockCake(cc.meatCakeBlockID, "meatBlock");
		eternalIceBlock = new BlockIceMho(cc.eternalIceBlockID, "eternalIce");

		GameRegistry.registerBlock(grisouBlock, "MHOgrisouBlock");
		GameRegistry.registerBlock(slimeBlock, "MHOslimeBlock");
		GameRegistry.registerBlock(invisibleBlock, "MHOinvisibleBlock");
		GameRegistry.registerBlock(portalPurple, "MHOportalPurple");
		GameRegistry.registerBlock(bookBlock, "MHObookBlock");
		GameRegistry.registerBlock(chainIron, "MHOchainIron");
		GameRegistry.registerBlock(chainRope, "MHOchainRope");
		GameRegistry.registerBlock(ropeRail, "MHOropeRail");
		GameRegistry.registerBlock(spikes, "MHOspikes");
		GameRegistry.registerBlock(climbingLadder, "MHOclimbingLadder");
		GameRegistry.registerBlock(roseVines, "MHOroseVines");
		GameRegistry.registerBlock(cristalLittle, "MHOcristalLittle");
		GameRegistry.registerBlock(cristalBig, "MHOcristalBig");
		GameRegistry.registerBlock(cristalBlock, "MHOcristalBlock");
		GameRegistry.registerBlock(cakeLieBlock, "MHOcakeLieBlock");
		GameRegistry.registerBlock(meatCakeBlock, "MHOmeatCakeBlock");
		GameRegistry.registerBlock(eternalIceBlock, "MHOeternalIceBlock");
		
		LanguageRegistry.addName(grisouBlock, "Bloc de grisou");
		LanguageRegistry.addName(slimeBlock, "Bloc de slime");
		LanguageRegistry.addName(invisibleBlock, "Bloc invisible");
		LanguageRegistry.addName(portalPurple, "Portail violet");
		LanguageRegistry.addName(bookBlock, "Livre");
		LanguageRegistry.addName(chainIron, "Cha\u00eene en fer");
		LanguageRegistry.addName(chainRope, "Corde");
		LanguageRegistry.addName(ropeRail, "Cordage");
		LanguageRegistry.addName(spikes, "Piques");
		LanguageRegistry.addName(climbingLadder, "Bloc d\u0027escalade");
		LanguageRegistry.addName(roseVines, "Vignes de roses");
		LanguageRegistry.addName(cristalLittle, "Petit cristal");
		LanguageRegistry.addName(cristalBig, "Grand cristal");
		LanguageRegistry.addName(cristalBlock, "Bloc de cristal");
		LanguageRegistry.addName(cakeLieBlock, "Cake");
		LanguageRegistry.addName(meatCakeBlock, "Viande");
		LanguageRegistry.addName(eternalIceBlock, "Glace \u00e9ternelle");

		/** Secret **/ 
    	blockSecretDoorWood = new BlockSecretDoor(cc.secretDoorWoodBlockID, Material.wood, "secretDoorWood").setHardness(1.2F).setStepSound(Block.soundWoodFootstep);
        blockSecretDoorIron = new BlockSecretDoor(cc.secretDoorIronBlockID, Material.iron, "secretDoorIron").setHardness(5.0F).setStepSound(Block.soundMetalFootstep);
        blockSecretTrapDoor = new BlockSecretTrapDoor(cc.secretTrapDoorBlockID, Material.wood, "secretTrapDoor");
        itemBlockSecretDoorIron = new ItemBlockSecretDoor(cc.secretDoorIronItemBlockID, Material.iron, "secretDoorIron", null);
        itemBlockSecretDoorWood = new ItemBlockSecretDoor(cc.secretDoorWoodItemBlockID, Material.wood, "secretDoorWood", null);
        
        GameRegistry.registerBlock(blockSecretDoorWood, "secretDoorWood");
        GameRegistry.registerBlock(blockSecretDoorIron, "secretDoorIron");
        GameRegistry.registerBlock(blockSecretTrapDoor, "secretTrapDoor");
        
        LanguageRegistry.addName(itemBlockSecretDoorWood, "Porte secr\u00e8te en bois");
        LanguageRegistry.addName(itemBlockSecretDoorIron, "Porte secr\u00e8te en fer");
        LanguageRegistry.addName(blockSecretTrapDoor, "Trappe secr\u00e8te");
        
	}
	
	public void initStairs(ConfigCore cc)
	{
		/** Mc **/
		Block.stairsBrick.setCreativeTab(Mho.tabMhoStairs);
		Block.stairsCobblestone.setCreativeTab(Mho.tabMhoStairs);
		Block.stairsNetherBrick.setCreativeTab(Mho.tabMhoStairs);
		Block.stairsNetherQuartz.setCreativeTab(Mho.tabMhoStairs);
		Block.stairsSandStone.setCreativeTab(Mho.tabMhoStairs);
		Block.stairsStoneBrick.setCreativeTab(Mho.tabMhoStairs);
		Block.stairsWoodBirch.setCreativeTab(Mho.tabMhoStairs);
		Block.stairsWoodJungle.setCreativeTab(Mho.tabMhoStairs);
		Block.stairsWoodOak.setCreativeTab(Mho.tabMhoStairs);
		Block.stairsWoodSpruce.setCreativeTab(Mho.tabMhoStairs);
		
		/** Mc new **/
		stairStone = new BlockStairsMho(cc.stairStoneID, Block.stone, 0, "stairStone");
		stairGrass = new BlockStairsMho(cc.stairGrassID, Block.grass, 0, "stairGrass");
		stairDirt = new BlockStairsMho(cc.stairDirtID, Block.dirt, 0, "stairDirt");
		stairGravel = new BlockStairsMho(cc.stairGravelID, Block.gravel, 0, "stairGravel");
		stairMossyCobble = new BlockStairsMho(cc.stairMossyCobbleID, Block.cobblestoneMossy, 0, "stairMossyCobble");
		stairObsidian = new BlockStairsMho(cc.stairObsidianID, Block.obsidian, 0, "stairObsidian");
		stairIce = new BlockStairsMho(cc.stairIceID, Block.ice, 0, "stairIce").setLightOpacity(3);
		stairSnow = new BlockStairsMho(cc.stairSnowID, Block.blockSnow, 0, "stairSnow");
		stairStonebrickMossy = new BlockStairsMho(cc.stairStonebrickMossyID, Block.stoneBrick, 1, "stairStonebrickMossy");
		stairStonebrickCracked = new BlockStairsMho(cc.stairStonebrickCrackedID, Block.stoneBrick, 2, "stairStonebrickCracked");
		stairEnderstone = new BlockStairsMho(cc.stairEnderstoneID, Block.whiteStone, 0, "stairEnderstone");
		stairSand = new BlockStairsMho(cc.stairSandID, Block.sand, 0, "stairSand");
		stairStraw = new BlockStairsMho(cc.stairStrawID, Block.hay, 0, "stairStraw");

		GameRegistry.registerBlock(stairStone, "MHOstairStone");
		GameRegistry.registerBlock(stairGrass, "MHOstairGrass");
		GameRegistry.registerBlock(stairDirt, "MHOstairDirt");
		GameRegistry.registerBlock(stairGravel, "MHOstairGravel");
		GameRegistry.registerBlock(stairMossyCobble, "MHOstairMossyCobble");
		GameRegistry.registerBlock(stairObsidian, "MHOstairObsidian");
		GameRegistry.registerBlock(stairIce, "MHOstairIce");
		GameRegistry.registerBlock(stairSnow, "MHOstairSnow");
		GameRegistry.registerBlock(stairStonebrickMossy, "MHOstairStonebrickMossy");
		GameRegistry.registerBlock(stairStonebrickCracked, "MHOstairStonebrickCracked");
		GameRegistry.registerBlock(stairEnderstone, "MHOstairEnderstone");
		GameRegistry.registerBlock(stairSand, "MHOstairSand");
		GameRegistry.registerBlock(stairStraw, "MHOstairStraw");
		
		LanguageRegistry.addName(stairStone, "Escalier en roche");
		LanguageRegistry.addName(stairGrass, "Escalier d'herbe");
		LanguageRegistry.addName(stairDirt, "Escalier en terre");
		LanguageRegistry.addName(stairGravel, "Escalier en gravier");
		LanguageRegistry.addName(stairMossyCobble, "Escalier en pierre moussue");
		LanguageRegistry.addName(stairObsidian, "Escalier en obsidienne");
		LanguageRegistry.addName(stairIce, "Escalier en glace");
		LanguageRegistry.addName(stairSnow, "Escalier en neige");
		LanguageRegistry.addName(stairStonebrickMossy, "Escalier en stonebrick moussue");
		LanguageRegistry.addName(stairStonebrickCracked, "Escalier en stonebrick fissur\u00e9e");
		LanguageRegistry.addName(stairEnderstone, "Escalier en pierre du n\u00e9ant");
		LanguageRegistry.addName(stairSand, "Escalier en sable");
		LanguageRegistry.addName(stairStraw, "Escalier en paille");

		/** Wool **/
		stairWoolWhite = new BlockStairsMho(cc.stairWoolWhiteID, Block.cloth, 0, "stairWoolWhite");
		stairWoolOrange = new BlockStairsMho(cc.stairWoolOrangeID, Block.cloth, 1, "stairWoolOrange");
		stairWoolMagenta = new BlockStairsMho(cc.stairWoolMagentaID, Block.cloth, 2, "stairWoolMagenta");
		stairWoolLightBlue = new BlockStairsMho(cc.stairWoolLightBlueID, Block.cloth, 3, "stairWoolLightBlue");
		stairWoolYellow = new BlockStairsMho(cc.stairWoolYellowID, Block.cloth, 4, "stairWoolYellow");
		stairWoolLightGreen = new BlockStairsMho(cc.stairWoolLightGreenID, Block.cloth, 5, "stairWoolLightGreen");
		stairWoolPink = new BlockStairsMho(cc.stairWoolPinkID, Block.cloth, 6, "stairWoolPink");
		stairWoolGray = new BlockStairsMho(cc.stairWoolGrayID, Block.cloth, 7, "stairWoolGray");
		stairWoolLightGray = new BlockStairsMho(cc.stairWoolLightGrayID, Block.cloth, 8, "stairWoolLightGray");
		stairWoolCyan = new BlockStairsMho(cc.stairWoolCyanID, Block.cloth, 9, "stairWoolCyan");
		stairWoolPurple = new BlockStairsMho(cc.stairWoolPurpleID, Block.cloth, 10, "stairWoolPurple");
		stairWoolBlue = new BlockStairsMho(cc.stairWoolBlueID, Block.cloth, 11, "stairWoolBlue");
		stairWoolBrown = new BlockStairsMho(cc.stairWoolBrownID, Block.cloth, 12, "stairWoolBrown");
		stairWoolGreen = new BlockStairsMho(cc.stairWoolGreenID, Block.cloth, 13, "stairWoolGreen");
		stairWoolRed = new BlockStairsMho(cc.stairWoolRedID, Block.cloth, 14, "stairWoolRed");
		stairWoolBlack = new BlockStairsMho(cc.stairWoolBlackID, Block.cloth, 15, "stairWoolBlack");
		
		GameRegistry.registerBlock(stairWoolWhite, "MHOstairWoolWhite");
		GameRegistry.registerBlock(stairWoolOrange, "MHOstairWoolOrange");
		GameRegistry.registerBlock(stairWoolMagenta, "MHOstairWoolMagenta");
		GameRegistry.registerBlock(stairWoolLightBlue, "MHOstairWoolLightBlue");
		GameRegistry.registerBlock(stairWoolYellow, "MHOstairWoolYellow");
		GameRegistry.registerBlock(stairWoolLightGreen, "MHOstairWoolLightGreen");
		GameRegistry.registerBlock(stairWoolPink, "MHOstairWoolPink");
		GameRegistry.registerBlock(stairWoolGray, "MHOstairWoolGray");
		GameRegistry.registerBlock(stairWoolLightGray, "MHOstairWoolLightGray");
		GameRegistry.registerBlock(stairWoolCyan, "MHOstairWoolCyan");
		GameRegistry.registerBlock(stairWoolPurple, "MHOstairWoolPurple");
		GameRegistry.registerBlock(stairWoolBlue, "MHOstairWoolBlue");
		GameRegistry.registerBlock(stairWoolBrown, "MHOstairWoolBrown");
		GameRegistry.registerBlock(stairWoolGreen, "MHOstairWoolGreen");
		GameRegistry.registerBlock(stairWoolRed, "MHOstairWoolRed");
		GameRegistry.registerBlock(stairWoolBlack, "MHOstairWoolBlack");

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
	
		/** Wool Light **/
		stairWoolWhiteLight = new BlockStairsMho(cc.stairWoolWhiteLightID, Block.cloth, 0, "stairWoolWhiteLight").setLightValue(1.0F);
		stairWoolOrangeLight = new BlockStairsMho(cc.stairWoolOrangeLightID, Block.cloth, 1, "stairWoolOrangeLight").setLightValue(1.0F);
		stairWoolMagentaLight = new BlockStairsMho(cc.stairWoolMagentaLightID, Block.cloth, 2, "stairWoolMagentaLight").setLightValue(1.0F);
		stairWoolLightBlueLight = new BlockStairsMho(cc.stairWoolLightBlueLightID, Block.cloth, 3, "stairWoolLightBlueLight").setLightValue(1.0F);
		stairWoolYellowLight = new BlockStairsMho(cc.stairWoolYellowLightID, Block.cloth, 4, "stairWoolYellowLight").setLightValue(1.0F);
		stairWoolLightGreenLight = new BlockStairsMho(cc.stairWoolLightGreenLightID, Block.cloth, 5, "stairWoolLightGreenLight").setLightValue(1.0F);
		stairWoolPinkLight = new BlockStairsMho(cc.stairWoolPinkLightID, Block.cloth, 6, "stairWoolPinkLight").setLightValue(1.0F);
		stairWoolGrayLight = new BlockStairsMho(cc.stairWoolGrayLightID, Block.cloth, 7, "stairWoolGrayLight").setLightValue(1.0F);
		stairWoolLightGrayLight = new BlockStairsMho(cc.stairWoolLightGrayLightID, Block.cloth, 8, "stairWoolLightGrayLight").setLightValue(1.0F);
		stairWoolCyanLight = new BlockStairsMho(cc.stairWoolCyanLightID, Block.cloth, 9, "stairWoolCyanLight").setLightValue(1.0F);
		stairWoolPurpleLight = new BlockStairsMho(cc.stairWoolPurpleLightID, Block.cloth, 10, "stairWoolPurpleLight").setLightValue(1.0F);
		stairWoolBlueLight = new BlockStairsMho(cc.stairWoolBlueLightID, Block.cloth, 11, "stairWoolBlueLight").setLightValue(1.0F);
		stairWoolBrownLight = new BlockStairsMho(cc.stairWoolBrownLightID, Block.cloth, 12, "stairWoolBrownLight").setLightValue(1.0F);
		stairWoolGreenLight = new BlockStairsMho(cc.stairWoolGreenLightID, Block.cloth, 13, "stairWoolGreenLight").setLightValue(1.0F);
		stairWoolRedLight = new BlockStairsMho(cc.stairWoolRedLightID, Block.cloth, 14, "stairWoolRedLight").setLightValue(1.0F);
		stairWoolBlackLight = new BlockStairsMho(cc.stairWoolBlackLightID, Block.cloth, 15, "stairWoolBlackLight").setLightValue(1.0F);

		GameRegistry.registerBlock(stairWoolWhiteLight, "MHOstairWoolWhiteLight");
		GameRegistry.registerBlock(stairWoolOrangeLight, "MHOstairWoolOrangeLight");
		GameRegistry.registerBlock(stairWoolMagentaLight, "MHOstairWoolMagentaLight");
		GameRegistry.registerBlock(stairWoolLightBlueLight, "MHOstairWoolLightBlueLight");
		GameRegistry.registerBlock(stairWoolYellowLight, "MHOstairWoolYellowLight");
		GameRegistry.registerBlock(stairWoolLightGreenLight, "MHOstairWoolLightGreenLight");
		GameRegistry.registerBlock(stairWoolPinkLight, "MHOstairWoolPinkLight");
		GameRegistry.registerBlock(stairWoolGrayLight, "MHOstairWoolGrayLight");
		GameRegistry.registerBlock(stairWoolLightGrayLight, "MHOstairWoolLightGrayLight");
		GameRegistry.registerBlock(stairWoolCyanLight, "MHOstairWoolCyanLight");
		GameRegistry.registerBlock(stairWoolPurpleLight, "MHOstairWoolPurpleLight");
		GameRegistry.registerBlock(stairWoolBlueLight, "MHOstairWoolBlueLight");
		GameRegistry.registerBlock(stairWoolBrownLight, "MHOstairWoolBrownLight");
		GameRegistry.registerBlock(stairWoolGreenLight, "MHOstairWoolGreenLight");
		GameRegistry.registerBlock(stairWoolRedLight, "MHOstairWoolRedLight");
		GameRegistry.registerBlock(stairWoolBlackLight, "MHOstairWoolBlackLight");

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
		
		/** Sets of materials **/
		stairWhiteStone = new BlockStairsMho(cc.whiteStoneID + cc.stairStoneRank, Mho.whiteStone, 0, "stairWhiteStone");
		stairWhiteCobblestone = new BlockStairsMho(cc.whiteStoneID + cc.stairCobblestoneRank, Mho.whiteCobblestone, 0, "stairWhiteCobblestone");
		stairWhiteStonebrick = new BlockStairsMho(cc.whiteStoneID + cc.stairStonebrickRank, Mho.whiteStonebrick, 0, "stairWhiteStonebrick");

		stairSandstoneStonebrick = new BlockStairsMho(cc.sandstoneID + cc.stairStonebrickRank, Mho.sandstoneStonebrick, 0, "stairSandstoneStonebrick");

		stairAncientStone = new BlockStairsMho(cc.ancientStoneID + cc.stairStoneRank, Mho.ancientStone, 0, "stairAncientStone");
		stairAncientCobblestone = new BlockStairsMho(cc.ancientStoneID + cc.stairCobblestoneRank, Mho.ancientCobblestone, 0, "stairAncientCobblestone");
		stairAncientStonebrick = new BlockStairsMho(cc.ancientStoneID + cc.stairStonebrickRank, Mho.ancientStonebrick, 0, "stairAncientStonebrick");

		stairIceCobblestone = new BlockStairsMho(cc.iceID + cc.stairCobblestoneRank, Mho.iceCobblestone, 0, "stairIceCobblestone");
		stairIceStonebrick = new BlockStairsMho(cc.iceID + cc.stairStonebrickRank, Mho.iceStonebrick, 0, "stairIceStonebrick");

		stairMarbleWhiteStone = new BlockStairsMho(cc.marbleWhiteID + cc.stairStoneRank, Mho.marbleWhiteStone, 0, "stairMarbleWhiteStone");
		stairMarbleWhiteCobblestone = new BlockStairsMho(cc.marbleWhiteID + cc.stairCobblestoneRank, Mho.marbleWhiteCobblestone, 0, "stairMarbleWhiteCobblestone");
		stairMarbleWhiteStonebrick = new BlockStairsMho(cc.marbleWhiteID + cc.stairStonebrickRank, Mho.marbleWhiteStonebrick, 0, "stairMarbleWhiteStonebrick");

		stairMarbleBlackStone = new BlockStairsMho(cc.marbleBlackID + cc.stairStoneRank, Mho.marbleBlackStone, 0, "stairMarbleBlackStone");
		stairMarbleBlackCobblestone = new BlockStairsMho(cc.marbleBlackID + cc.stairCobblestoneRank, Mho.marbleBlackCobblestone, 0, "stairMarbleBlackCobblestone");
		stairMarbleBlackStonebrick = new BlockStairsMho(cc.marbleBlackID + cc.stairStonebrickRank, Mho.marbleBlackStonebrick, 0, "stairMarbleBlackStonebrick");

		stairMarbleCheck = new BlockStairsMho(cc.marbleBlackID + cc.stairCheckRank, Mho.marbleCheck, 0, "stairMarbleCheck");

		stairWoodenStone = new BlockStairsMho(cc.woodenDarkID + cc.stairStoneRank, Mho.woodenStone, 0, "stairWoodenStone");
		stairWoodenStonebrick = new BlockStairsMho(cc.woodenDarkID + cc.stairStonebrickRank, Mho.woodenStonebrick, 0, "stairWoodenStonebrick");

		stairWoodenLightStone = new BlockStairsMho(cc.woodenLightID + cc.stairStoneRank, Mho.woodenLightStone, 0, "stairWoodenLightStone");
		stairWoodenLightStonebrick = new BlockStairsMho(cc.woodenLightID + cc.stairStonebrickRank, Mho.woodenLightStonebrick, 0, "stairWoodenLightStonebrick");

		GameRegistry.registerBlock(stairWhiteStone, "MHOstairWhiteStone");
		GameRegistry.registerBlock(stairWhiteCobblestone, "MHOstairWhiteCobblestone");
		GameRegistry.registerBlock(stairWhiteStonebrick, "MHOstairWhiteStonebrick");

		GameRegistry.registerBlock(stairSandstoneStonebrick, "MHOstairSandstoneStonebrick");
		
		GameRegistry.registerBlock(stairAncientStone, "MHOstairAncientStone");
		GameRegistry.registerBlock(stairAncientCobblestone, "MHOstairAncientCobblestone");
		GameRegistry.registerBlock(stairAncientStonebrick, "MHOstairAncientStonebrick");

		GameRegistry.registerBlock(stairIceCobblestone, "MHOstairIceCobblestone");
		GameRegistry.registerBlock(stairIceStonebrick, "MHOstairIceStonebrick");

		GameRegistry.registerBlock(stairMarbleWhiteStone, "MHOstairMarbleWhiteStone");
		GameRegistry.registerBlock(stairMarbleWhiteCobblestone, "MHOstairMarbleWhiteCobblestone");
		GameRegistry.registerBlock(stairMarbleWhiteStonebrick, "MHOstairMarbleWhiteStonebrick");

		GameRegistry.registerBlock(stairMarbleBlackStone, "MHOstairMarbleBlackStone");
		GameRegistry.registerBlock(stairMarbleBlackCobblestone, "MHOstairMarbleBlackCobblestone");
		GameRegistry.registerBlock(stairMarbleBlackStonebrick, "MHOstairMarbleBlackStonebrick");

		GameRegistry.registerBlock(stairMarbleCheck, "MHOstairMarbleCheck");

		GameRegistry.registerBlock(stairWoodenStone, "MHOstairWoodenStone");
		GameRegistry.registerBlock(stairWoodenStonebrick, "MHOstairWoodenStonebrick");

		GameRegistry.registerBlock(stairWoodenLightStone, "MHOstairWoodenLightStone");
		GameRegistry.registerBlock(stairWoodenLightStonebrick, "MHOstairWoodenLightStonebrick");

		LanguageRegistry.addName(stairWhiteStone, "Escalier en pierre blanche");
		LanguageRegistry.addName(stairWhiteCobblestone, "Escalier en pierre blanche fragment\u00e9e");
		LanguageRegistry.addName(stairWhiteStonebrick, "Escalier en briques de pierre blanche");

		LanguageRegistry.addName(stairSandstoneStonebrick, "Escalier en briques de sandstone");

		LanguageRegistry.addName(stairAncientStone, "Escalier en pierre ancienne");
		LanguageRegistry.addName(stairAncientCobblestone, "Escalier en pierre ancienne fragment\u00e9e");
		LanguageRegistry.addName(stairAncientStonebrick, "Escalier en briques de pierre ancienne");

		LanguageRegistry.addName(stairIceCobblestone, "Escalier en glace fragment\u00e9");
		LanguageRegistry.addName(stairIceStonebrick, "Escalier en briques de glace");

		LanguageRegistry.addName(stairMarbleWhiteStone, "Escalier en marbre blanc");
		LanguageRegistry.addName(stairMarbleWhiteCobblestone, "Escalier en marbre blanc fragment\u00e9");
		LanguageRegistry.addName(stairMarbleWhiteStonebrick, "Escalier en briques de marbre blanc");

		LanguageRegistry.addName(stairMarbleBlackStone, "Escalier en marbre noir");
		LanguageRegistry.addName(stairMarbleBlackCobblestone, "Escalier en marbre noir fragment\u00e9");
		LanguageRegistry.addName(stairMarbleBlackStonebrick, "Escalier en briques de marbre noir");

		LanguageRegistry.addName(stairMarbleCheck, "Escalier de marbre en damier");

		LanguageRegistry.addName(stairWoodenStone, "Escalier en bois lisse fonc\u00e9");
		LanguageRegistry.addName(stairWoodenStonebrick, "Escalier en briques de bois lisse fonc\u00e9");

		LanguageRegistry.addName(stairWoodenLightStone, "Escalier en bois lisse clair");
		LanguageRegistry.addName(stairWoodenLightStonebrick, "Escalier en briques de bois lisse clair");

		/** Tiles **/
		stairArdoise = new BlockStairsMho(cc.stairArdoiseID, Mho.tileArdoise, 0, "stairArdoise");
		stairTileRed = new BlockStairsMho(cc.stairTileRedID, Mho.tileRed, 0, "stairTileRed");
		stairTileBlack = new BlockStairsMho(cc.stairTileBlackID, Mho.tileBlack, 0, "stairTileBlack");
		stairTileBlue = new BlockStairsMho(cc.stairTileBlueID, Mho.tileBlue, 0, "stairTileBlue");
		stairTileRedBig = new BlockStairsMho(cc.stairTileRedBigID, Mho.tileRedBig, 0, "stairTileRedBig");
		stairTileBlackBig = new BlockStairsMho(cc.stairTileBlackBigID, Mho.tileBlackBig, 0, "stairTileBlackBig");
		stairTileBlueBig = new BlockStairsMho(cc.stairTileBlueBigID, Mho.tileBlueBig, 0, "stairTileBlueBig");
		stairTileBlackAlt = new BlockStairsMho(cc.stairTileBlackAltID, Mho.tileBlackAlt, 0, "stairTileBlackAlt");

		GameRegistry.registerBlock(stairArdoise, "MHOstairArdoise");
		GameRegistry.registerBlock(stairTileRed, "MHOstairTileRed");
		GameRegistry.registerBlock(stairTileBlack, "MHOstairTileBlack");
		GameRegistry.registerBlock(stairTileBlue, "MHOstairTileBlue");
		GameRegistry.registerBlock(stairTileRedBig, "MHOstairTileRedBig");
		GameRegistry.registerBlock(stairTileBlackBig, "MHOstairTileBlackBig");
		GameRegistry.registerBlock(stairTileBlueBig, "MHOstairTileBlueBig");
		GameRegistry.registerBlock(stairTileBlackAlt, "MHOstairTileBlackAlt");

		LanguageRegistry.addName(stairArdoise, "Escalier d'ardoises");
		LanguageRegistry.addName(stairTileRed, "Escalier de tuiles rouges");
		LanguageRegistry.addName(stairTileBlack, "Escalier de tuiles noires");
		LanguageRegistry.addName(stairTileBlue, "Escalier de tuiles bleues");
		LanguageRegistry.addName(stairTileRedBig, "Escalier de grandes tuiles rouges");
		LanguageRegistry.addName(stairTileBlackBig, "Escalier de grandes tuiles noires");
		LanguageRegistry.addName(stairTileBlueBig, "Escalier de grandes tuiles bleues");
		LanguageRegistry.addName(stairTileBlackAlt, "Escalier de tuiles noires d\u00e9chauss\u00e9es");
	}
	
	public void initSteps(ConfigCore cc)
	{
		/** Mc **/
		Block.stoneSingleSlab.setCreativeTab(Mho.tabMhoStairs).setLightOpacity(5);
		Block.woodSingleSlab.setCreativeTab(Mho.tabMhoStairs).setLightOpacity(5);
		
		/** Mc new **/
		stepGrass = new BlockStepMho(cc.stepGrassID, Block.grass, 0, "stepGrass").setStepSound(Block.soundGrassFootstep);
		stepDirt = new BlockStepMho(cc.stepDirtID, Block.dirt, 0, "stepDirt").setStepSound(Block.soundGravelFootstep);
		stepGravel = new BlockStepMho(cc.stepGravelID, Block.gravel, 0, "stepGravel").setStepSound(Block.soundGravelFootstep);
		stepWoodOak = new BlockStepMho(cc.stepWoodOakID, Block.wood, 0, "stepWoodOak").setStepSound(Block.soundWoodFootstep);
		stepWoodSpruce = new BlockStepMho(cc.stepWoodSpruceID, Block.wood, 1, "stepWoodSpruce").setStepSound(Block.soundWoodFootstep);
		stepWoodBirch = new BlockStepMho(cc.stepWoodBirchID, Block.wood, 2, "stepWoodBirch").setStepSound(Block.soundWoodFootstep);
		stepWoodJungle = new BlockStepMho(cc.stepWoodJungleID, Block.wood, 3, "stepWoodJungle").setStepSound(Block.soundWoodFootstep);
		stepCobbleMossy = new BlockStepMho(cc.stepCobbleMossyID, Block.cobblestoneMossy, 0, "stepCobbleMossy");
		stepObsidian = new BlockStepMho(cc.stepObsidianID, Block.obsidian, 0, "stepObsidian");
		stepIce = new BlockStepMho(cc.stepIceID, Block.ice, 0, "stepIce").setStepSound(Block.soundGlassFootstep);
		stepSnow = new BlockStepMho(cc.stepSnowID, Block.blockSnow, 0, "stepSnow").setStepSound(Block.soundSnowFootstep);
		stepStonebrickMossy = new BlockStepMho(cc.stepStonebrickMossyID, Block.stoneBrick, 1, "stepStonebrickMossy");
		stepStonebrickCracked = new BlockStepMho(cc.stepStonebrickCrackedID, Block.stoneBrick, 2, "stepStonebrickCracked");
		stepEnderstone = new BlockStepMho(cc.stepEndstoneID, Block.whiteStone, 0, "stepEnderstone");
		stepSand = new BlockStepMho(cc.stepSandID, Block.sand, 0, "stepSand").setStepSound(Block.soundSandFootstep);
		stepStraw = new BlockStepMho(cc.stepStrawID, Block.hay, 0, "stepStraw").setStepSound(Block.soundGrassFootstep);

		GameRegistry.registerBlock(stepGrass, "MHOstepGrass");
		GameRegistry.registerBlock(stepDirt, "MHOstepDirt");
		GameRegistry.registerBlock(stepGravel, "MHOstepGravel");
		GameRegistry.registerBlock(stepWoodOak, "MHOstepWoodOak");
		GameRegistry.registerBlock(stepWoodSpruce, "MHOstepWoodSpruce");
		GameRegistry.registerBlock(stepWoodBirch, "MHOstepWoodBirch");
		GameRegistry.registerBlock(stepWoodJungle, "MHOstepWoodJungle");
		GameRegistry.registerBlock(stepCobbleMossy, "MHOstepCobbleMossy");
		GameRegistry.registerBlock(stepObsidian, "MHOstepObsidian");
		GameRegistry.registerBlock(stepIce, "MHOstepIce");
		GameRegistry.registerBlock(stepSnow, "MHOstepSnow");
		GameRegistry.registerBlock(stepStonebrickMossy, "MHOstepStonebrickMossy");
		GameRegistry.registerBlock(stepStonebrickCracked, "MHOstepStonebrickCracked");
		GameRegistry.registerBlock(stepEnderstone, "MHOstepEnderstone");
		GameRegistry.registerBlock(stepSand, "MHOstepSand");
		GameRegistry.registerBlock(stepStraw, "MHOstepStraw");
		
		LanguageRegistry.addName(stepGrass, "Demi-dalle d'herbe");
		LanguageRegistry.addName(stepDirt, "Demi-dalle en terre");
		LanguageRegistry.addName(stepGravel, "Demi-dalle en gravier");
		LanguageRegistry.addName(stepWoodOak, "Demi-dalle en bois de ch\u00eane");
		LanguageRegistry.addName(stepWoodSpruce, "Demi-dalle en bois de pin");
		LanguageRegistry.addName(stepWoodBirch, "Demi-dalle en bois de bouleau");
		LanguageRegistry.addName(stepWoodJungle, "Demi-dalle en bois de la jungle");
		LanguageRegistry.addName(stepCobbleMossy, "Demi-dalle en pierre moussue");
		LanguageRegistry.addName(stepObsidian, "Demi-dalle en obsidienne");
		LanguageRegistry.addName(stepIce, "Demi-dalle en glace");
		LanguageRegistry.addName(stepSnow, "Demi-dalle en neige");
		LanguageRegistry.addName(stepStonebrickMossy, "Demi-dalle en stonebrick moussue");
		LanguageRegistry.addName(stepStonebrickCracked, "Demi-dalle en stonebrick craquel\u00e9e");
		LanguageRegistry.addName(stepEnderstone, "Demi-dalle en pierre du n\u00e9ant");
		LanguageRegistry.addName(stepSand, "Demi-dalle en sable");
		LanguageRegistry.addName(stepStraw, "Demi-dalle en paille");
		
		/** Wool **/
		stepWoolWhite = new BlockStepMho(cc.stepWoolWhiteID, Block.cloth, 0, "stepWoolWhite").setStepSound(Block.soundClothFootstep);
		stepWoolOrange = new BlockStepMho(cc.stepWoolOrangeID, Block.cloth, 1, "stepWoolOrange").setStepSound(Block.soundClothFootstep);
		stepWoolMagenta = new BlockStepMho(cc.stepWoolMagentaID, Block.cloth, 2, "stepWoolMagenta").setStepSound(Block.soundClothFootstep);
		stepWoolLightBlue = new BlockStepMho(cc.stepWoolLightBlueID, Block.cloth, 3, "stepWoolLightBlue").setStepSound(Block.soundClothFootstep);
		stepWoolYellow = new BlockStepMho(cc.stepWoolYellowID, Block.cloth, 4, "stepWoolYellow").setStepSound(Block.soundClothFootstep);
		stepWoolLightGreen = new BlockStepMho(cc.stepWoolLightGreenID, Block.cloth, 5, "stepWoolLightGreen").setStepSound(Block.soundClothFootstep);
		stepWoolPink = new BlockStepMho(cc.stepWoolPinkID, Block.cloth, 6, "stepWoolPink").setStepSound(Block.soundClothFootstep);
		stepWoolGray = new BlockStepMho(cc.stepWoolGrayID, Block.cloth, 7, "stepWoolGray").setStepSound(Block.soundClothFootstep);
		stepWoolLightGray = new BlockStepMho(cc.stepWoolLightGrayID, Block.cloth, 8, "stepWoolLightGray").setStepSound(Block.soundClothFootstep);
		stepWoolCyan = new BlockStepMho(cc.stepWoolCyanID, Block.cloth, 9, "stepWoolCyan").setStepSound(Block.soundClothFootstep);
		stepWoolPurple = new BlockStepMho(cc.stepWoolPurpleID, Block.cloth, 10, "stepWoolPurple").setStepSound(Block.soundClothFootstep);
		stepWoolBlue = new BlockStepMho(cc.stepWoolBlueID, Block.cloth, 11, "stepWoolBlue").setStepSound(Block.soundClothFootstep);
		stepWoolBrown = new BlockStepMho(cc.stepWoolBrownID, Block.cloth, 12, "stepWoolBrown").setStepSound(Block.soundClothFootstep);
		stepWoolGreen = new BlockStepMho(cc.stepWoolGreenID, Block.cloth, 13, "stepWoolGreen").setStepSound(Block.soundClothFootstep);
		stepWoolRed = new BlockStepMho(cc.stepWoolRedID, Block.cloth, 14, "stepWoolRed").setStepSound(Block.soundClothFootstep);
		stepWoolBlack = new BlockStepMho(cc.stepWoolBlackID, Block.cloth, 15, "stepWoolBlack").setStepSound(Block.soundClothFootstep);

		GameRegistry.registerBlock(stepWoolWhite, "MHOstepWoolWhite");
		GameRegistry.registerBlock(stepWoolOrange, "MHOstepWoolOrange");
		GameRegistry.registerBlock(stepWoolMagenta, "MHOstepWoolMagenta");
		GameRegistry.registerBlock(stepWoolLightBlue, "MHOstepWoolLightBlue");
		GameRegistry.registerBlock(stepWoolYellow, "MHOstepWoolYellow");
		GameRegistry.registerBlock(stepWoolLightGreen, "MHOstepWoolLightGreen");
		GameRegistry.registerBlock(stepWoolPink, "MHOstepWoolPink");
		GameRegistry.registerBlock(stepWoolGray, "MHOstepWoolGray");
		GameRegistry.registerBlock(stepWoolLightGray, "MHOstepWoolLightGray");
		GameRegistry.registerBlock(stepWoolCyan, "MHOstepWoolCyan");
		GameRegistry.registerBlock(stepWoolPurple, "MHOstepWoolPurple");
		GameRegistry.registerBlock(stepWoolBlue, "MHOstepWoolBlue");
		GameRegistry.registerBlock(stepWoolBrown, "MHOstepWoolBrown");
		GameRegistry.registerBlock(stepWoolGreen, "MHOstepWoolGreen");
		GameRegistry.registerBlock(stepWoolRed, "MHOstepWoolRed");
		GameRegistry.registerBlock(stepWoolBlack, "MHOstepWoolBlack");

		LanguageRegistry.addName(stepWoolWhite, "Demi-dalle en laine blanche");
		LanguageRegistry.addName(stepWoolOrange, "Demi-dalle en laine orange");
		LanguageRegistry.addName(stepWoolMagenta, "Demi-dalle en laine magenta");
		LanguageRegistry.addName(stepWoolLightBlue, "Demi-dalle en laine bleu claire");
		LanguageRegistry.addName(stepWoolYellow, "Demi-dalle en laine jaune");
		LanguageRegistry.addName(stepWoolLightGreen, "Demi-dalle en laine verte claire");
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

		/** Wool light **/
		stepWoolWhiteLight = new BlockStepMho(cc.stepWoolWhiteLightID, Block.cloth, 0, "stepWoolWhiteLight").setLightValue(1.0F).setStepSound(Block.soundClothFootstep);
		stepWoolOrangeLight = new BlockStepMho(cc.stepWoolOrangeLightID, Block.cloth, 1, "stepWoolOrangeLight").setLightValue(1.0F).setStepSound(Block.soundClothFootstep);
		stepWoolMagentaLight = new BlockStepMho(cc.stepWoolMagentaLightID, Block.cloth, 2, "stepWoolMagentaLight").setLightValue(1.0F).setStepSound(Block.soundClothFootstep);
		stepWoolLightBlueLight = new BlockStepMho(cc.stepWoolLightBlueLightID, Block.cloth, 3, "stepWoolLightBlueLight").setLightValue(1.0F).setStepSound(Block.soundClothFootstep);
		stepWoolYellowLight = new BlockStepMho(cc.stepWoolYellowLightID, Block.cloth, 4, "stepWoolYellowLight").setLightValue(1.0F).setStepSound(Block.soundClothFootstep);
		stepWoolLightGreenLight = new BlockStepMho(cc.stepWoolLightGreenLightID, Block.cloth, 5, "stepWoolLightGreenLight").setLightValue(1.0F).setStepSound(Block.soundClothFootstep);
		stepWoolPinkLight = new BlockStepMho(cc.stepWoolPinkLightID, Block.cloth, 6, "stepWoolPinkLight").setLightValue(1.0F).setStepSound(Block.soundClothFootstep);
		stepWoolGrayLight = new BlockStepMho(cc.stepWoolGrayLightID, Block.cloth, 7, "stepWoolGrayLight").setLightValue(1.0F).setStepSound(Block.soundClothFootstep);
		stepWoolLightGrayLight = new BlockStepMho(cc.stepWoolLightGrayLightID, Block.cloth, 8, "stepWoolLightGrayLight").setLightValue(1.0F).setStepSound(Block.soundClothFootstep);
		stepWoolCyanLight = new BlockStepMho(cc.stepWoolCyanLightID, Block.cloth, 9, "stepWoolCyanLight").setLightValue(1.0F).setStepSound(Block.soundClothFootstep);
		stepWoolPurpleLight = new BlockStepMho(cc.stepWoolPurpleLightID, Block.cloth, 10, "stepWoolPurpleLight").setLightValue(1.0F).setStepSound(Block.soundClothFootstep);
		stepWoolBlueLight = new BlockStepMho(cc.stepWoolBlueLightID, Block.cloth, 11, "stepWoolBlueLight").setLightValue(1.0F).setStepSound(Block.soundClothFootstep);
		stepWoolBrownLight = new BlockStepMho(cc.stepWoolBrownLightID, Block.cloth, 12, "stepWoolBrownLight").setLightValue(1.0F).setStepSound(Block.soundClothFootstep);
		stepWoolGreenLight = new BlockStepMho(cc.stepWoolGreenLightID, Block.cloth, 13, "stepWoolGreenLight").setLightValue(1.0F).setStepSound(Block.soundClothFootstep);
		stepWoolRedLight = new BlockStepMho(cc.stepWoolRedLightID, Block.cloth, 14, "stepWoolRedLight").setLightValue(1.0F).setStepSound(Block.soundClothFootstep);
		stepWoolBlackLight = new BlockStepMho(cc.stepWoolBlackLightID, Block.cloth, 15, "stepWoolBlackLight").setLightValue(1.0F).setStepSound(Block.soundClothFootstep);

		GameRegistry.registerBlock(stepWoolWhiteLight, "MHOstepWoolWhiteLight");
		GameRegistry.registerBlock(stepWoolOrangeLight, "MHOstepWoolOrangeLight");
		GameRegistry.registerBlock(stepWoolMagentaLight, "MHOstepWoolMagentaLight");
		GameRegistry.registerBlock(stepWoolLightBlueLight, "MHOstepWoolLightBlueLight");
		GameRegistry.registerBlock(stepWoolYellowLight, "MHOstepWoolYellowLight");
		GameRegistry.registerBlock(stepWoolLightGreenLight, "MHOstepWoolLightGreenLight");
		GameRegistry.registerBlock(stepWoolPinkLight, "MHOstepWoolPinkLight");
		GameRegistry.registerBlock(stepWoolGrayLight, "MHOstepWoolGrayLight");
		GameRegistry.registerBlock(stepWoolLightGrayLight, "MHOstepWoolLightGrayLight");
		GameRegistry.registerBlock(stepWoolCyanLight, "MHOstepWoolCyanLight");
		GameRegistry.registerBlock(stepWoolPurpleLight, "MHOstepWoolPurpleLight");
		GameRegistry.registerBlock(stepWoolBlueLight, "MHOstepWoolBlueLight");
		GameRegistry.registerBlock(stepWoolBrownLight, "MHOstepWoolBrownLight");
		GameRegistry.registerBlock(stepWoolGreenLight, "MHOstepWoolGreenLight");
		GameRegistry.registerBlock(stepWoolRedLight, "MHOstepWoolRedLight");
		GameRegistry.registerBlock(stepWoolBlackLight, "MHOstepWoolBlackLight");
		
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

		/** Sets of materials **/
		stepStoneColumn = new BlockStepMho(cc.stoneID + cc.stepColumnRank, Mho.stoneColumn, 0, "stepStoneColumn");
		stepStoneColumnHead = new BlockStepMho(cc.stoneID + cc.stepColumnHeadRank, Mho.stoneColumnHead, 0, "stepStoneColumnHead");
		
		stepWhiteStone = new BlockStepMho(cc.whiteStoneID + cc.stepStoneRank, Mho.whiteStone, 0, "stepWhiteStone");
		stepWhiteCobblestone = new BlockStepMho(cc.whiteStoneID + cc.stepCobblestoneRank, Mho.whiteCobblestone, 0, "stepWhiteCobblestone");
		stepWhiteStonebrick = new BlockStepMho(cc.whiteStoneID + cc.stepStonebrickRank, Mho.whiteStonebrick, 0, "stepWhiteStonebrick");
		stepWhiteDoubleSlab = new BlockStepMho(cc.whiteStoneID + cc.stepDoubleSlabRank, Mho.whiteStoneDoubleSlab, 0, "stepWhiteDoubleSlab");
		stepWhiteColumn = new BlockStepMho(cc.whiteStoneID + cc.stepColumnRank, Mho.whiteStoneColumn, 0, "stepWhiteColumn");
		stepWhiteColumnHead = new BlockStepMho(cc.whiteStoneID + cc.stepColumnHeadRank, Mho.whiteStoneColumnHead, 0, "stepWhiteColumnHead");

		stepSandstoneStonebrick = new BlockStepMho(cc.sandstoneID + cc.stepStonebrickRank, Mho.sandstoneStonebrick, 0, "stepSandstoneStonebrick");
		stepSandstoneDoubleSlab = new BlockStepMho(cc.sandstoneID + cc.stepDoubleSlabRank, Mho.sandstoneDoubleSlab, 0, "stepSandstoneDoubleSlab");
		stepSandstoneColumn = new BlockStepMho(cc.sandstoneID + cc.stepColumnRank, Mho.sandstoneColumn, 0, "stepSandstoneColumn");
		stepSandstoneColumnHead = new BlockStepMho(cc.sandstoneID + cc.stepColumnHeadRank, Mho.sandstoneColumnHead, 0, "stepSandstoneColumnHead");

		stepAncientStone = new BlockStepMho(cc.ancientStoneID + cc.stepStoneRank, Mho.ancientStone, 0, "stepAncientStone");
		stepAncientCobblestone = new BlockStepMho(cc.ancientStoneID + cc.stepCobblestoneRank, Mho.ancientCobblestone, 0, "stepAncientCobblestone");
		stepAncientStonebrick = new BlockStepMho(cc.ancientStoneID + cc.stepStonebrickRank, Mho.ancientStonebrick, 0, "stepAncientStonebrick");
		stepAncientDoubleSlab = new BlockStepMho(cc.ancientStoneID + cc.stepDoubleSlabRank, Mho.ancientDoubleSlab, 0, "stepAncientDoubleSlab");
		stepAncientColumn = new BlockStepMho(cc.ancientStoneID + cc.stepColumnRank, Mho.ancientColumn, 0, "stepAncientColumn");
		stepAncientColumnHead = new BlockStepMho(cc.ancientStoneID + cc.stepColumnHeadRank, Mho.ancientColumnHead, 0, "stepAncientColumnHead");

		stepIceCobblestone = new BlockStepMho(cc.iceID + cc.stepCobblestoneRank, Mho.iceCobblestone, 0, "stepIceCobblestone").setStepSound(Block.soundGlassFootstep);
		stepIceStonebrick = new BlockStepMho(cc.iceID + cc.stepStonebrickRank, Mho.iceStonebrick, 0, "stepIceStonebrick").setStepSound(Block.soundGlassFootstep);
		stepIceDoubleSlab = new BlockStepMho(cc.iceID + cc.stepDoubleSlabRank, Mho.iceDoubleSlab, 0, "stepIceDoubleSlab").setStepSound(Block.soundGlassFootstep);
		stepIceColumn = new BlockStepMho(cc.iceID + cc.stepColumnRank, Mho.iceColumn, 0, "stepIceColumn").setStepSound(Block.soundGlassFootstep);
		stepIceColumnHead = new BlockStepMho(cc.iceID + cc.stepColumnHeadRank, Mho.iceColumnHead, 0, "stepIceColumnHead").setStepSound(Block.soundGlassFootstep);

		stepMarbleWhiteStone = new BlockStepMho(cc.marbleWhiteID + cc.stepStoneRank, Mho.marbleWhiteStone, 0, "stepMarbleWhiteStone");
		stepMarbleWhiteCobblestone = new BlockStepMho(cc.marbleWhiteID + cc.stepCobblestoneRank, Mho.marbleWhiteCobblestone, 0, "stepMarbleWhiteCobblestone");
		stepMarbleWhiteStonebrick = new BlockStepMho(cc.marbleWhiteID + cc.stepStonebrickRank, Mho.marbleWhiteStonebrick, 0, "stepMarbleWhiteStonebrick");
		stepMarbleWhiteDoubleSlab = new BlockStepMho(cc.marbleWhiteID + cc.stepDoubleSlabRank, Mho.marbleWhiteDoubleSlab, 0, "stepMarbleWhiteDoubleSlab");
		stepMarbleWhiteColumn = new BlockStepMho(cc.marbleWhiteID + cc.stepColumnRank, Mho.marbleWhiteColumn, 0, "stepMarbleWhiteColumn");
		stepMarbleWhiteColumnHead = new BlockStepMho(cc.marbleWhiteID + cc.stepColumnHeadRank, Mho.marbleWhiteColumnHead, 0, "stepMarbleWhiteColumnHead");

		stepMarbleBlackStone = new BlockStepMho(cc.marbleBlackID + cc.stepStoneRank, Mho.marbleBlackStone, 0, "stepMarbleBlackStone");
		stepMarbleBlackCobblestone = new BlockStepMho(cc.marbleBlackID + cc.stepCobblestoneRank, Mho.marbleBlackCobblestone, 0, "stepMarbleBlackCobblestone");
		stepMarbleBlackStonebrick = new BlockStepMho(cc.marbleBlackID + cc.stepStonebrickRank, Mho.marbleBlackStonebrick, 0, "stepMarbleBlackStonebrick");
		stepMarbleBlackDoubleSlab = new BlockStepMho(cc.marbleBlackID + cc.stepDoubleSlabRank, Mho.marbleBlackDoubleSlab, 0, "stepMarbleBlackDoubleSlab");
		stepMarbleBlackColumn = new BlockStepMho(cc.marbleBlackID + cc.stepColumnRank, Mho.marbleBlackColumn, 0, "stepMarbleBlackColumn");
		stepMarbleBlackColumnHead = new BlockStepMho(cc.marbleBlackID + cc.stepColumnHeadRank, Mho.marbleBlackColumnHead, 0, "stepMarbleBlackColumnHead");

		stepMarbleCheck = new BlockStepMho(cc.marbleBlackID + cc.stepCheckRank, Mho.marbleCheck, 0, "stepMarbleCheck");

		stepWoodenStone = new BlockStepMho(cc.woodenDarkID + cc.stepStoneRank, Mho.woodenStone, 0, "stepWoodenStone").setStepSound(Block.soundWoodFootstep);
		stepWoodenStonebrick = new BlockStepMho(cc.woodenDarkID + cc.stepStonebrickRank, Mho.woodenStonebrick, 0, "stepWoodenStonebrick").setStepSound(Block.soundWoodFootstep);
		stepWoodenDoubleSlab = new BlockStepMho(cc.woodenDarkID + cc.stepDoubleSlabRank, Mho.woodenDoubleSlab, 0, "stepWoodenDoubleSlab").setStepSound(Block.soundWoodFootstep);
		stepWoodenColumn = new BlockStepMho(cc.woodenDarkID + cc.stepColumnRank, Mho.woodenColumn, 0, "stepWoodenColumn").setStepSound(Block.soundWoodFootstep);
		stepWoodenColumnHead = new BlockStepMho(cc.woodenDarkID + cc.stepColumnHeadRank, Mho.woodenColumnHead, 0, "stepWoodenColumnHead").setStepSound(Block.soundWoodFootstep);

		stepWoodenLightStone = new BlockStepMho(cc.woodenLightID + cc.stepStoneRank, Mho.woodenLightStone, 0, "stepWoodenLightStone").setStepSound(Block.soundWoodFootstep);
		stepWoodenLightStonebrick = new BlockStepMho(cc.woodenLightID + cc.stepStonebrickRank, Mho.woodenLightStonebrick, 0, "stepWoodenLightStonebrick").setStepSound(Block.soundWoodFootstep);
		stepWoodenLightDoubleSlab = new BlockStepMho(cc.woodenLightID + cc.stepDoubleSlabRank, Mho.woodenLightDoubleSlab, 0, "stepWoodenLightDoubleSlab").setStepSound(Block.soundWoodFootstep);
		stepWoodenLightColumn = new BlockStepMho(cc.woodenLightID + cc.stepColumnRank, Mho.woodenLightColumn, 0, "stepWoodenLightColumn").setStepSound(Block.soundWoodFootstep);
		stepWoodenLightColumnHead = new BlockStepMho(cc.woodenLightID + cc.stepColumnHeadRank, Mho.woodenLightColumnHead, 0, "stepWoodenLightColumnHead").setStepSound(Block.soundWoodFootstep);

		stepMetal = new BlockStepMho(cc.metalID + cc.stepDoubleSlabRank, Mho.metalDoubleSlab, 0, "stepMetal").setStepSound(Block.soundMetalFootstep);

		GameRegistry.registerBlock(stepStoneColumn, "MHOstepStoneColumn");
		GameRegistry.registerBlock(stepStoneColumnHead, "MHOstepStoneColumnHead");

		GameRegistry.registerBlock(stepWhiteStone, "MHOstepWhiteStone");
		GameRegistry.registerBlock(stepWhiteCobblestone, "MHOstepWhiteCobblestone");
		GameRegistry.registerBlock(stepWhiteStonebrick, "MHOstepWhiteStonebrick");
		GameRegistry.registerBlock(stepWhiteDoubleSlab, "MHOstepWhiteDoubleSlab");
		GameRegistry.registerBlock(stepWhiteColumn, "MHOstepWhiteColumn");
		GameRegistry.registerBlock(stepWhiteColumnHead, "MHOstepWhiteColumnHead");

		GameRegistry.registerBlock(stepSandstoneStonebrick, "MHOstepSandstoneStonebrick");
		GameRegistry.registerBlock(stepSandstoneDoubleSlab, "MHOstepSandstoneDoubleSlab");
		GameRegistry.registerBlock(stepSandstoneColumn, "MHOstepSandstoneColumn");
		GameRegistry.registerBlock(stepSandstoneColumnHead, "MHOstepSandstoneColumnHead");

		GameRegistry.registerBlock(stepAncientStone, "MHOstepAncientStone");
		GameRegistry.registerBlock(stepAncientCobblestone, "MHOstepAncientCobblestone");
		GameRegistry.registerBlock(stepAncientStonebrick, "MHOstepAncientStonebrick");
		GameRegistry.registerBlock(stepAncientDoubleSlab, "MHOstepAncientDoubleSlab");
		GameRegistry.registerBlock(stepAncientColumn, "MHOstepAncientColumn");
		GameRegistry.registerBlock(stepAncientColumnHead, "MHOstepAncientColumnHead");

		GameRegistry.registerBlock(stepIceCobblestone, "MHOstepIceCobblestone");
		GameRegistry.registerBlock(stepIceStonebrick, "MHOstepIceStonebrick");
		GameRegistry.registerBlock(stepIceDoubleSlab, "MHOstepIceDoubleSlab");
		GameRegistry.registerBlock(stepIceColumn, "MHOstepIceColumn");
		GameRegistry.registerBlock(stepIceColumnHead, "MHOstepIceColumnHead");

		GameRegistry.registerBlock(stepMarbleWhiteStone, "MHOstepMarbleWhiteStone");
		GameRegistry.registerBlock(stepMarbleWhiteCobblestone, "MHOstepMarbleWhiteCobblestone");
		GameRegistry.registerBlock(stepMarbleWhiteStonebrick, "MHOstepMarbleWhiteStonebrick");
		GameRegistry.registerBlock(stepMarbleWhiteDoubleSlab, "MHOstepMarbleWhiteDoubleSlab");
		GameRegistry.registerBlock(stepMarbleWhiteColumn, "MHOstepMarbleWhiteColumn");
		GameRegistry.registerBlock(stepMarbleWhiteColumnHead, "MHOstepMarbleWhiteColumnHead");

		GameRegistry.registerBlock(stepMarbleBlackStone, "MHOstepMarbleBlackStone");
		GameRegistry.registerBlock(stepMarbleBlackCobblestone, "MHOstepMarbleBlackCobblestone");
		GameRegistry.registerBlock(stepMarbleBlackStonebrick, "MHOstepMarbleBlackStonebrick");
		GameRegistry.registerBlock(stepMarbleBlackDoubleSlab, "MHOstepMarbleBlackDoubleSlab");
		GameRegistry.registerBlock(stepMarbleBlackColumn, "MHOstepMarbleBlackColumn");
		GameRegistry.registerBlock(stepMarbleBlackColumnHead, "MHOstepMarbleBlackColumnHead");

		GameRegistry.registerBlock(stepMarbleCheck, "MHOstepMarbleCheck");

		GameRegistry.registerBlock(stepWoodenStone, "MHOstepWoodenStone");
		GameRegistry.registerBlock(stepWoodenStonebrick, "MHOstepWoodenStonebrick");
		GameRegistry.registerBlock(stepWoodenDoubleSlab, "MHOstepWoodenDoubleSlab");
		GameRegistry.registerBlock(stepWoodenColumn, "MHOstepWoodenColumn");
		GameRegistry.registerBlock(stepWoodenColumnHead, "MHOstepWoodenColumnHead");

		GameRegistry.registerBlock(stepWoodenLightStone, "MHOstepWoodenLightStone");
		GameRegistry.registerBlock(stepWoodenLightStonebrick, "MHOstepWoodenLightStonebrick");
		GameRegistry.registerBlock(stepWoodenLightDoubleSlab, "MHOstepWoodenLightDoubleSlab");
		GameRegistry.registerBlock(stepWoodenLightColumn, "MHOstepWoodenLightColumn");
		GameRegistry.registerBlock(stepWoodenLightColumnHead, "MHOstepWoodenLightColumnHead");

		GameRegistry.registerBlock(stepMetal, "MHOstepMetal");

		LanguageRegistry.addName(stepStoneColumn, "Demi-dalle en colonne de pierre");
		LanguageRegistry.addName(stepStoneColumnHead, "Demi-dalle en chapeau de colonne de pierre");

		LanguageRegistry.addName(stepWhiteStone, "Demi-dalle en pierre blanche");
		LanguageRegistry.addName(stepWhiteCobblestone, "Demi-dalle en pierre blanche fragment\u00e9e");
		LanguageRegistry.addName(stepWhiteStonebrick, "Demi-dalle en briques de pierre blanche");
		LanguageRegistry.addName(stepWhiteDoubleSlab, "Demi-dalle en dalle de pierre blanche");
		LanguageRegistry.addName(stepWhiteColumn, "Demi-dalle en colonne de pierre blanche");
		LanguageRegistry.addName(stepWhiteColumnHead, "Demi-dalle en chapeau de colonne de pierre blanche");

		LanguageRegistry.addName(stepSandstoneStonebrick, "Demi-dalle en briques de sandstone");
		LanguageRegistry.addName(stepSandstoneDoubleSlab, "Demi-dalle en dalle de sandstone");
		LanguageRegistry.addName(stepSandstoneColumn, "Demi-dalle en colonne de sandstone");
		LanguageRegistry.addName(stepSandstoneColumnHead, "Demi-dalle en chapeau de colonne de sandstone");

		LanguageRegistry.addName(stepAncientStone, "Demi-dalle en pierre ancienne");
		LanguageRegistry.addName(stepAncientCobblestone, "Demi-dalle en pierre ancienne fragment\u00e9e");
		LanguageRegistry.addName(stepAncientStonebrick, "Demi-dalle en brique de pierre ancienne");
		LanguageRegistry.addName(stepAncientDoubleSlab, "Demi-dalle en dalle de pierre ancienne");
		LanguageRegistry.addName(stepAncientColumn, "Demi-dalle en colonne de pierre ancienne");
		LanguageRegistry.addName(stepAncientColumnHead, "Demi-dalle en chapeau de colonne de pierre ancienne");

		LanguageRegistry.addName(stepIceCobblestone, "Demi-dalle en glace fragment\u00e9e");
		LanguageRegistry.addName(stepIceStonebrick, "Demi-dalle en briques de glace");
		LanguageRegistry.addName(stepIceDoubleSlab, "Demi-dalle en dalle de glace");
		LanguageRegistry.addName(stepIceColumn, "Demi-dalle en colonne de glace");
		LanguageRegistry.addName(stepIceColumnHead, "Demi-dalle en chapeau de colonne de glace");

		LanguageRegistry.addName(stepMarbleWhiteStone, "Demi-dalle en marbre blanc");
		LanguageRegistry.addName(stepMarbleWhiteCobblestone, "Demi-dalle en marbre blanc fragment\u00e9");
		LanguageRegistry.addName(stepMarbleWhiteStonebrick, "Demi-dalle en briques de marbre blanc");
		LanguageRegistry.addName(stepMarbleWhiteDoubleSlab, "Demi-dalle en dalle de marbre blanc");
		LanguageRegistry.addName(stepMarbleWhiteColumn, "Demi-dalle en colonne de marbre blanc");
		LanguageRegistry.addName(stepMarbleWhiteColumnHead, "Demi-dalle en chapeau de colonne de marbre blanc");

		LanguageRegistry.addName(stepMarbleBlackStone, "Demi-dalle en marbre noir");
		LanguageRegistry.addName(stepMarbleBlackCobblestone, "Demi-dalle en marbre noir fragment\u00e9");
		LanguageRegistry.addName(stepMarbleBlackStonebrick, "Demi-dalle en briques de marbre noir");
		LanguageRegistry.addName(stepMarbleBlackDoubleSlab, "Demi-dalle en dalle de marbre noir");
		LanguageRegistry.addName(stepMarbleBlackColumn, "Demi-dalle en colonne de marbre noir");
		LanguageRegistry.addName(stepMarbleBlackColumnHead, "Demi-dalle en chapeau de colonne de marbre noir");

		LanguageRegistry.addName(stepMarbleCheck, "Demi-dalle en damier de marbre");

		LanguageRegistry.addName(stepWoodenStone, "Demi-dalle en bois lisse fonc\u00e9");
		LanguageRegistry.addName(stepWoodenStonebrick, "Demi-dalle en briques de bois lisse fonc\u00e9");
		LanguageRegistry.addName(stepWoodenDoubleSlab, "Demi-dalle en dalle de bois lisse fonc\u00e9");
		LanguageRegistry.addName(stepWoodenColumn, "Demi-dalle en colonne de bois lisse fonc\u00e9");
		LanguageRegistry.addName(stepWoodenColumnHead, "Demi-dalle en chapeau de colonne de bois lisse fonc\u00e9");

		LanguageRegistry.addName(stepWoodenLightStone, "Demi-dalle en bois lisse clair");
		LanguageRegistry.addName(stepWoodenLightStonebrick, "Demi-dalle en briques de bois lisse clair");
		LanguageRegistry.addName(stepWoodenLightDoubleSlab, "Demi-dalle en dalle de bois lisse clair");
		LanguageRegistry.addName(stepWoodenLightColumn, "Demi-dalle en colonne de bois lisse clair");
		LanguageRegistry.addName(stepWoodenLightColumnHead, "Demi-dalle en chapeau de colonne de bois lisse clair");

		LanguageRegistry.addName(stepMetal, "Demi-dalle en acier");

		/** Tiles **/
		stepArdoise = new BlockStepMho(cc.stepArdoiseID, Mho.tileArdoise, 0, "stepArdoise");
		stepTileRed = new BlockStepMho(cc.stepTileRedID, Mho.tileRed, 0, "stepTileRed");
		stepTileBlue = new BlockStepMho(cc.stepTileBlueID, Mho.tileBlue, 0, "stepTileBlue");
		stepTileBlack = new BlockStepMho(cc.stepTileBlackID, Mho.tileBlack, 0, "stepTileBlack");
		stepTileRedBig = new BlockStepMho(cc.stepTileRedBigID, Mho.tileRedBig, 0, "stepTileRedBig");
		stepTileBlueBig = new BlockStepMho(cc.stepTileBlueBigID, Mho.tileBlueBig, 0, "stepTileBlueBig");
		stepTileBlackBig = new BlockStepMho(cc.stepTileBlackBigID, Mho.tileBlackBig, 0, "stepTileBlackBig");
		stepTileBlackAlt = new BlockStepMho(cc.stepTileBlackAltID, Mho.tileBlackAlt, 0, "stepTileBlackAlt");

		GameRegistry.registerBlock(stepArdoise, "MHOstepArdoise");
		GameRegistry.registerBlock(stepTileRed, "MHOstepTileRed");
		GameRegistry.registerBlock(stepTileBlue, "MHOstepTileBlue");
		GameRegistry.registerBlock(stepTileBlack, "MHOstepTileBlack");
		GameRegistry.registerBlock(stepTileRedBig, "MHOstepTileRedBig");
		GameRegistry.registerBlock(stepTileBlueBig, "MHOstepTileBlueBig");
		GameRegistry.registerBlock(stepTileBlackBig, "MHOstepTileBlackBig");
		GameRegistry.registerBlock(stepTileBlackAlt, "MHOstepTileBlackAlt");

		LanguageRegistry.addName(stepArdoise, "Demi-dalle d'ardoises");
		LanguageRegistry.addName(stepTileRed, "Demi-dalle de tuiles rouges");
		LanguageRegistry.addName(stepTileBlue, "Demi-dalle de tuiles bleues");
		LanguageRegistry.addName(stepTileBlack, "Demi-dalle de tuiles noires");
		LanguageRegistry.addName(stepTileRedBig, "Demi-dalle de grandes tuiles rouges");
		LanguageRegistry.addName(stepTileBlueBig, "Demi-dalle de grandes tuiles bleues");
		LanguageRegistry.addName(stepTileBlackBig, "Demi-dalle de grandes tuiles noires");
		LanguageRegistry.addName(stepTileBlackAlt, "Demi-dalle de tuiles noires d\u00e9chauss\u00e9es");

		/** Others **/
		stepLanternWood = new BlockStepMho(cc.stepLanternWoodID, Mho.lanternWood, 0, "stepLanternWood").setLightValue(1.0F).setStepSound(Block.soundGlassFootstep);
		stepLanternIron = new BlockStepMho(cc.stepLanternIronID, Mho.lanternIron, 0, "stepLanternIron").setLightValue(1.0F).setStepSound(Block.soundGlassFootstep);

		GameRegistry.registerBlock(stepLanternWood, "MHOstepLanternWood");
		GameRegistry.registerBlock(stepLanternIron, "MHOstepLanternIron");

		LanguageRegistry.addName(stepLanternWood, "Demi-dalle de lanterne en bois");
		LanguageRegistry.addName(stepLanternIron, "Demi-dalle de lanterne en fer");
	}
	
	public void initWalls(ConfigCore cc)
	{
		/** Mc **/
		Block.cobblestoneWall.setCreativeTab(Mho.tabMhoFences);
		
		/** Mc new **/
		wallSandstone = new BlockWallMho(cc.wallSandstoneID, Block.sandStone, 0, "wallSandstone");
		wallPlankOak = new BlockWallMho(cc.wallPlankOakID, Block.planks, 0, "wallPlankOak");
		wallBrick = new BlockWallMho(cc.wallBrickID, Block.brick, 0, "wallBrick");
		wallStonebrick = new BlockWallMho(cc.wallStonebrickID, Block.stoneBrick, 0, "wallStonebrick");
		wallNetherbrick = new BlockWallMho(cc.wallNetherbrickID, Block.netherBrick, 0, "wallNetherbrick");
		wallWoodOak = new BlockWallMho(cc.wallWoodOakID, Block.wood, 0, "wallWoodOak");
		wallWoodSpruce = new BlockWallMho(cc.wallWoodSpruceID, Block.wood, 1, "wallWoodSpruce");
		wallWoodBirch = new BlockWallMho(cc.wallWoodBirchID, Block.wood, 2, "wallWoodBirch");
		wallWoodJungle = new BlockWallMho(cc.wallWoodJungleID, Block.wood, 3, "wallWoodJungle");
		
		GameRegistry.registerBlock(wallSandstone, "MHOwallSandstone");
		GameRegistry.registerBlock(wallPlankOak, "MHOwallPlankOak");
		GameRegistry.registerBlock(wallBrick, "MHOwallBrick");
		GameRegistry.registerBlock(wallStonebrick, "MHOwallStonebrick");
		GameRegistry.registerBlock(wallNetherbrick, "MHOwallNetherbrick");
		GameRegistry.registerBlock(wallWoodOak, "MHOwallWoodOak");
		GameRegistry.registerBlock(wallWoodSpruce, "MHOwallWoodSpruce");
		GameRegistry.registerBlock(wallWoodBirch, "MHOwallWoodBirch");
		GameRegistry.registerBlock(wallWoodJungle, "MHOwallWoodJungle");

		LanguageRegistry.addName(wallSandstone, "Muret en sandstone");
		LanguageRegistry.addName(wallPlankOak, "Muret en planches de ch\u00eane");
		LanguageRegistry.addName(wallBrick, "Muret en briques");
		LanguageRegistry.addName(wallStonebrick, "Muret en briques de pierre");
		LanguageRegistry.addName(wallNetherbrick, "Muret en briques du Nether");
		LanguageRegistry.addName(wallWoodOak, "Muret en bois de ch\u00eane");
		LanguageRegistry.addName(wallWoodSpruce, "Muret en bois de sapin");
		LanguageRegistry.addName(wallWoodBirch, "Muret en bois de bouleau");
		LanguageRegistry.addName(wallWoodJungle, "Muret en bois de la jungle");

		/** Sets of materials **/
		wallWhiteStone = new BlockWallMho(cc.whiteStoneID + cc.wallStoneRank, Mho.whiteStone, 0, "wallWhiteStone");
		wallWhiteCobblestone = new BlockWallMho(cc.whiteStoneID + cc.wallCobblestoneRank, Mho.whiteCobblestone, 0, "wallWhiteCobblestone");
		wallWhiteStonebrick = new BlockWallMho(cc.whiteStoneID + cc.wallStonebrickRank, Mho.whiteStonebrick, 0, "wallWhiteStonebrick");

		wallAncientStone = new BlockWallMho(cc.ancientStoneID + cc.wallStoneRank, Mho.ancientStone, 0, "wallAncientStone");
		wallAncientCobblestone = new BlockWallMho(cc.ancientStoneID + cc.wallCobblestoneRank, Mho.ancientCobblestone, 0, "wallAncientCobblestone");
		wallAncientStonebrick = new BlockWallMho(cc.ancientStoneID + cc.wallStonebrickRank, Mho.ancientStonebrick, 0, "wallAncientStonebrick");

		wallIceCobblestone = new BlockWallMho(cc.iceID + cc.wallCobblestoneRank, Mho.iceCobblestone, 0, "wallIceCobblestone");
		wallIceStonebrick = new BlockWallMho(cc.iceID + cc.wallStonebrickRank, Mho.iceStonebrick, 0, "wallIceStonebrick");

		wallMarbleWhiteStone = new BlockWallMho(cc.marbleWhiteID + cc.wallStoneRank, Mho.marbleWhiteStone, 0, "wallMarbleWhiteStone");
		wallMarbleWhiteCobblestone = new BlockWallMho(cc.marbleWhiteID + cc.wallCobblestoneRank, Mho.marbleWhiteCobblestone, 0, "wallMarbleWhiteCobblestone");
		wallMarbleWhiteStonebrick = new BlockWallMho(cc.marbleWhiteID + cc.wallStonebrickRank, Mho.marbleWhiteStonebrick, 0, "wallMarbleWhiteStonebrick");

		wallMarbleBlackStone = new BlockWallMho(cc.marbleBlackID + cc.wallStoneRank, Mho.marbleBlackStone, 0, "wallMarbleBlackStone");
		wallMarbleBlackCobblestone = new BlockWallMho(cc.marbleBlackID + cc.wallCobblestoneRank, Mho.marbleBlackCobblestone, 0, "wallMarbleBlackCobblestone");
		wallMarbleBlackStonebrick = new BlockWallMho(cc.marbleBlackID + cc.wallStonebrickRank, Mho.marbleBlackStonebrick, 0, "wallMarbleBlackStonebrick");

		wallWoodenStone = new BlockWallMho(cc.woodenDarkID + cc.wallStoneRank, Mho.woodenStone, 0, "wallWoodenStone");
		wallWoodenStonebrick = new BlockWallMho(cc.woodenDarkID + cc.wallStonebrickRank, Mho.woodenStonebrick, 0, "wallWoodenStonebrick");

		wallWoodenLightStone = new BlockWallMho(cc.woodenLightID + cc.wallStoneRank, Mho.woodenLightStone, 0, "wallWoodenLightStone");
		wallWoodenLightStonebrick = new BlockWallMho(cc.woodenLightID + cc.wallStonebrickRank, Mho.woodenLightStonebrick, 0, "wallWoodenLightStonebrick");

		GameRegistry.registerBlock(wallWhiteStone, "MHOwallWhiteStone");
		GameRegistry.registerBlock(wallWhiteCobblestone, "MHOwallWhiteCobblestone");
		GameRegistry.registerBlock(wallWhiteStonebrick, "MHOwallWhiteStonebrick");

		GameRegistry.registerBlock(wallAncientStone, "MHOwallAncientStone");
		GameRegistry.registerBlock(wallAncientCobblestone, "MHOwallAncientCobblestone");
		GameRegistry.registerBlock(wallAncientStonebrick, "MHOwallAncientStonebrick");

		GameRegistry.registerBlock(wallIceCobblestone, "MHOwallIceCobblestone");
		GameRegistry.registerBlock(wallIceStonebrick, "MHOwallIceStonebrick");

		GameRegistry.registerBlock(wallMarbleWhiteStone, "MHOwallMarbleWhiteStone");
		GameRegistry.registerBlock(wallMarbleWhiteCobblestone, "MHOwallMarbleWhiteCobblestone");
		GameRegistry.registerBlock(wallMarbleWhiteStonebrick, "MHOwallMarbleWhiteStonebrick");

		GameRegistry.registerBlock(wallMarbleBlackStone, "MHOwallMarbleBlackStone");
		GameRegistry.registerBlock(wallMarbleBlackCobblestone, "MHOwallMarbleBlackCobblestone");
		GameRegistry.registerBlock(wallMarbleBlackStonebrick, "MHOwallMarbleBlackStonebrick");

		GameRegistry.registerBlock(wallWoodenStone, "MHOwallWoodenStone");
		GameRegistry.registerBlock(wallWoodenStonebrick, "MHOwallWoodenStonebrick");

		GameRegistry.registerBlock(wallWoodenLightStone, "MHOwallWoodenLightStone");
		GameRegistry.registerBlock(wallWoodenLightStonebrick, "MHOwallWoodenLightStonebrick");

		LanguageRegistry.addName(wallWhiteStone, "Muret en pierre blanche");
		LanguageRegistry.addName(wallWhiteCobblestone, "Muret en pierre blanche fragment\u00e9e");
		LanguageRegistry.addName(wallWhiteStonebrick, "Muret en briques de pierre blanche");

		LanguageRegistry.addName(wallAncientStone, "Muret en pierre ancienne");
		LanguageRegistry.addName(wallAncientCobblestone, "Muret en pierre ancienne fragment\u00e9e");
		LanguageRegistry.addName(wallAncientStonebrick, "Muret en briques de pierre ancienne");

		LanguageRegistry.addName(wallIceCobblestone, "Muret en glace fragment\u00e9e");
		LanguageRegistry.addName(wallIceStonebrick, "Muret en briques de glace");
		
		LanguageRegistry.addName(wallMarbleWhiteStone, "Muret en marbre blanc");
		LanguageRegistry.addName(wallMarbleWhiteCobblestone, "Muret en marbre blanc fragment\u00e9");
		LanguageRegistry.addName(wallMarbleWhiteStonebrick, "Muret en briques de marbre blanc");

		LanguageRegistry.addName(wallMarbleBlackStone, "Muret en marbre noir");
		LanguageRegistry.addName(wallMarbleBlackCobblestone, "Muret en marbre noir fragment\u00e9");
		LanguageRegistry.addName(wallMarbleBlackStonebrick, "Muret en briques de marbre noir");

		LanguageRegistry.addName(wallWoodenStone, "Muret en bois lisse fonc\u00e9");
		LanguageRegistry.addName(wallWoodenStonebrick, "Muret en briques de bois lisse fonc\u00e9");

		LanguageRegistry.addName(wallWoodenLightStone, "Muret en bois lisse clair");
		LanguageRegistry.addName(wallWoodenLightStonebrick, "Muret en briques de bois lisse clair");
	}
	
	public void initFences(ConfigCore cc)
	{
		/** Mc **/
		Block.fence.setCreativeTab(Mho.tabMhoFences);
		
		/** Sets of materials **/
		fenceWhiteStone = new BlockFenceMho(cc.whiteStoneID + cc.fenceStoneRank, Mho.whiteStone, 0, "fenceWhiteStone");
		fenceWhiteCobblestone = new BlockFenceMho(cc.whiteStoneID + cc.fenceCobblestoneRank, Mho.whiteCobblestone, 0, "fenceWhiteCobblestone");
		fenceWhiteStonebrick = new BlockFenceMho(cc.whiteStoneID + cc.fenceStonebrickRank, Mho.whiteStonebrick, 0, "fenceWhiteStonebrick");

		fenceAncientStone = new BlockFenceMho(cc.ancientStoneID + cc.fenceStoneRank, Mho.ancientStone, 0, "fenceAncientStone");
		fenceAncientCobblestone = new BlockFenceMho(cc.ancientStoneID + cc.fenceCobblestoneRank, Mho.ancientCobblestone, 0, "fenceAncientCobblestone");
		fenceAncientStonebrick = new BlockFenceMho(cc.ancientStoneID + cc.fenceStonebrickRank, Mho.ancientStonebrick, 0, "fenceAncientStonebrick");

		fenceIceCobblestone = new BlockFenceMho(cc.iceID + cc.fenceCobblestoneRank, Mho.iceCobblestone, 0, "fenceIceCobblestone");
		fenceIceStonebrick = new BlockFenceMho(cc.iceID + cc.fenceStonebrickRank, Mho.iceStonebrick, 0, "fenceIceStonebrick");

		fenceMarbleWhiteStone = new BlockFenceMho(cc.marbleWhiteID + cc.fenceStoneRank, Mho.marbleWhiteStone, 0, "fenceMarbleWhiteStone");
		fenceMarbleWhiteCobblestone = new BlockFenceMho(cc.marbleWhiteID + cc.fenceCobblestoneRank, Mho.marbleWhiteCobblestone, 0, "fenceMarbleWhiteCobblestone");
		fenceMarbleWhiteStonebrick = new BlockFenceMho(cc.marbleWhiteID + cc.fenceStonebrickRank, Mho.marbleWhiteStonebrick, 0, "fenceMarbleWhiteStonebrick");

		fenceMarbleBlackStone = new BlockFenceMho(cc.marbleBlackID + cc.fenceStoneRank, Mho.marbleBlackStone, 0, "fenceMarbleBlackStone");
		fenceMarbleBlackCobblestone = new BlockFenceMho(cc.marbleBlackID + cc.fenceCobblestoneRank, Mho.marbleBlackCobblestone, 0, "fenceMarbleBlackCobblestone");
		fenceMarbleBlackStonebrick = new BlockFenceMho(cc.marbleBlackID + cc.fenceStonebrickRank, Mho.marbleBlackStonebrick, 0, "fenceMarbleBlackStonebrick");

		fenceWoodenStone = new BlockFenceMho(cc.woodenDarkID + cc.fenceStoneRank, Mho.woodenStone, 0, "fenceWoodenStone");
		fenceWoodenStonebrick = new BlockFenceMho(cc.woodenDarkID + cc.fenceStonebrickRank, Mho.woodenStonebrick, 0, "fenceWoodenStonebrick");

		fenceWoodenLightStone = new BlockFenceMho(cc.woodenLightID + cc.fenceStoneRank, Mho.woodenLightStone, 0, "fenceWoodenLightStone");
		fenceWoodenLightStonebrick = new BlockFenceMho(cc.woodenLightID + cc.fenceStonebrickRank, Mho.woodenLightStonebrick, 0, "fenceWoodenLightStonebrick");

		GameRegistry.registerBlock(fenceWhiteStone, "MHOfenceWhiteStone");
		GameRegistry.registerBlock(fenceWhiteCobblestone, "MHOfenceWhiteCobblestone");
		GameRegistry.registerBlock(fenceWhiteStonebrick, "MHOfenceWhiteStonebrick");

		GameRegistry.registerBlock(fenceAncientStone, "MHOfenceAncientStone");
		GameRegistry.registerBlock(fenceAncientCobblestone, "MHOfenceAncientCobblestone");
		GameRegistry.registerBlock(fenceAncientStonebrick, "MHOfenceAncientStonebrick");

		GameRegistry.registerBlock(fenceIceCobblestone, "MHOfenceIceCobblestone");
		GameRegistry.registerBlock(fenceIceStonebrick, "MHOfenceIceStonebrick");
		
		GameRegistry.registerBlock(fenceMarbleWhiteStone, "MHOfenceMarbleWhiteStone");
		GameRegistry.registerBlock(fenceMarbleWhiteCobblestone, "MHOfenceMarbleWhiteCobblestone");
		GameRegistry.registerBlock(fenceMarbleWhiteStonebrick, "MHOfenceMarbleWhiteStonebrick");

		GameRegistry.registerBlock(fenceMarbleBlackStone, "MHOfenceMarbleBlackStone");
		GameRegistry.registerBlock(fenceMarbleBlackCobblestone, "MHOfenceMarbleBlackCobblestone");
		GameRegistry.registerBlock(fenceMarbleBlackStonebrick, "MHOfenceMarbleBlackStonebrick");

		GameRegistry.registerBlock(fenceWoodenStone, "MHOfenceWoodenStone");
		GameRegistry.registerBlock(fenceWoodenStonebrick, "MHOfenceWoodenStonebrick");

		GameRegistry.registerBlock(fenceWoodenLightStone, "MHOfenceWoodenLightStone");
		GameRegistry.registerBlock(fenceWoodenLightStonebrick, "MHOfenceWoodenLightStonebrick");

		LanguageRegistry.addName(fenceWhiteStone, "Barri\u00e8re en pierre blanche");
		LanguageRegistry.addName(fenceWhiteCobblestone, "Barri\u00e8re en pierre blanche fractur\u00e9e");
		LanguageRegistry.addName(fenceWhiteStonebrick, "Barri\u00e8re en briques de pierre blanche");

		LanguageRegistry.addName(fenceAncientStone, "Barri\u00e8re en pierre ancienne");
		LanguageRegistry.addName(fenceAncientCobblestone, "Barri\u00e8re en pierre ancienne fractur\u00e9e");
		LanguageRegistry.addName(fenceAncientStonebrick, "Barri\u00e8re en briques de pierre ancienne");

		LanguageRegistry.addName(fenceIceCobblestone, "Barri\u00e8re en glace fractur\u00e9e");
		LanguageRegistry.addName(fenceIceStonebrick, "Barri\u00e8re en briques de glace");

		LanguageRegistry.addName(fenceMarbleWhiteStone, "Barri\u00e8re en marbre blanc");
		LanguageRegistry.addName(fenceMarbleWhiteCobblestone, "Barri\u00e8re en marbre blanc fractur\u00e9");
		LanguageRegistry.addName(fenceMarbleWhiteStonebrick, "Barri\u00e8re en briques de marbre blanc");

		LanguageRegistry.addName(fenceMarbleBlackStone, "Barri\u00e8re en marbre noir");
		LanguageRegistry.addName(fenceMarbleBlackCobblestone, "Barri\u00e8re en marbre noir fractur\u00e9");
		LanguageRegistry.addName(fenceMarbleBlackStonebrick, "Barri\u00e8re en briques de marbre noir");

		LanguageRegistry.addName(fenceWoodenStone, "Barri\u00e8re en bois lisse fonc\u00e9");
		LanguageRegistry.addName(fenceWoodenStonebrick, "Barri\u00e8re en briques de bois lisse fonc\u00e9");

		LanguageRegistry.addName(fenceWoodenLightStone, "Barri\u00e8re en bois lisse clair");
		LanguageRegistry.addName(fenceWoodenLightStonebrick, "Barri\u00e8re en briques de bois lisse clair");
	}
	
	public void initAnvils(ConfigCore cc)
	{
		/** Mc new **/
		anvilWoodOak = new BlockAnvilMho(cc.anvilWoodOakID, Block.wood, 0, "anvilWoodOak");
		anvilPlankOak = new BlockAnvilMho(cc.anvilPlankOakID, Block.planks, 0, "anvilPlankOak");
		anvilPlankSpruce = new BlockAnvilMho(cc.anvilPlankSpruceID, Block.planks, 1, "anvilPlankSpruce");
		anvilPlankBirch = new BlockAnvilMho(cc.anvilPlankBirchID, Block.planks, 2, "anvilPlankBirch");
		anvilPlankJungle = new BlockAnvilMho(cc.anvilPlankJungleID, Block.planks, 3, "anvilPlankJungle");
		
		GameRegistry.registerBlock(anvilWoodOak, "MHOanvilWoodOak");
		GameRegistry.registerBlock(anvilPlankOak, "MHOanvilPlankOak");
		GameRegistry.registerBlock(anvilPlankSpruce, "MHOanvilPlankSpruce");
		GameRegistry.registerBlock(anvilPlankBirch, "MHOanvilPlankBirch");
		GameRegistry.registerBlock(anvilPlankJungle, "MHOanvilPlankJungle");
		
		LanguageRegistry.addName(anvilWoodOak, "Balustrade en bois de ch\u00eane");
		LanguageRegistry.addName(anvilPlankOak, "Balustrade en planches de ch\u00eane");
		LanguageRegistry.addName(anvilPlankSpruce, "Balustrade en planches de pin");
		LanguageRegistry.addName(anvilPlankBirch, "Balustrade en planches de bouleau");
		LanguageRegistry.addName(anvilPlankJungle, "Balustrade en planches de la jungle");
		
		/** Sets of materials **/
		anvilWhiteStone = new BlockAnvilMho(cc.whiteStoneID + cc.anvilStoneRank, Mho.whiteStone, 0, "anvilWhiteStone");
		anvilWhiteStonebrick = new BlockAnvilMho(cc.whiteStoneID + cc.anvilStonebrickRank, Mho.whiteStonebrick, 0, "anvilWhiteStonebrick");

		anvilSandstoneStonebrick = new BlockAnvilMho(cc.sandstoneID + cc.anvilStonebrickRank, Mho.sandstoneStonebrick, 0, "anvilSandstoneStonebrick");
		
		anvilAncientStone = new BlockAnvilMho(cc.ancientStoneID + cc.anvilStoneRank, Mho.ancientStone, 0, "anvilAncientStone");
		anvilAncientStonebrick = new BlockAnvilMho(cc.ancientStoneID + cc.anvilStonebrickRank, Mho.ancientStonebrick, 0, "anvilAncientStonebrick");
		
		anvilIceStonebrick = new BlockAnvilMho(cc.iceID + cc.anvilStonebrickRank, Mho.iceStonebrick, 0, "anvilIceStonebrick");
		
		anvilMarbleWhite = new BlockAnvilMho(cc.marbleWhiteID + cc.anvilStoneRank, Mho.marbleWhiteStone, 0, "anvilMarbleWhite");
		anvilMarbleWhiteStonebrick = new BlockAnvilMho(cc.marbleWhiteID + cc.anvilStonebrickRank, Mho.marbleWhiteStonebrick, 0, "anvilMarbleWhiteStonebrick");
		
		anvilMarbleBlack = new BlockAnvilMho(cc.marbleBlackID + cc.anvilStoneRank, Mho.marbleBlackStone, 0, "anvilMarbleBlack");
		anvilMarbleBlackStonebrick = new BlockAnvilMho(cc.marbleBlackID + cc.anvilStonebrickRank, Mho.marbleBlackStonebrick, 0, "anvilMarbleBlackStonebrick");
		
		anvilWoodenStone = new BlockAnvilMho(cc.woodenDarkID + cc.anvilStoneRank, Mho.woodenStone, 0, "anvilWoodenStone");
		anvilWoodenStonebrick = new BlockAnvilMho(cc.woodenDarkID + cc.anvilStonebrickRank, Mho.woodenStonebrick, 0, "anvilWoodenStonebrick");
		
		anvilWoodenLightStone = new BlockAnvilMho(cc.woodenLightID + cc.anvilStoneRank, Mho.woodenLightStone, 0, "anvilWoodenLightStone");
		anvilWoodenLightStonebrick = new BlockAnvilMho(cc.woodenLightID + cc.anvilStonebrickRank, Mho.woodenLightStonebrick, 0, "anvilWoodenLightStonebrick");

		GameRegistry.registerBlock(anvilWhiteStone, "MHOanvilWhiteStone");
		GameRegistry.registerBlock(anvilWhiteStonebrick, "MHOanvilWhiteStonebrick");

		GameRegistry.registerBlock(anvilSandstoneStonebrick, "MHOanvilSandstoneStonebrick");

		GameRegistry.registerBlock(anvilAncientStone, "MHOanvilAncientStone");
		GameRegistry.registerBlock(anvilAncientStonebrick, "MHOanvilAncientStonebrick");

		GameRegistry.registerBlock(anvilIceStonebrick, "MHOanvilIceStonebrick");

		GameRegistry.registerBlock(anvilMarbleWhite, "MHOanvilMarbleWhite");
		GameRegistry.registerBlock(anvilMarbleWhiteStonebrick, "MHOanvilMarbleWhiteStonebrick");

		GameRegistry.registerBlock(anvilMarbleBlack, "MHOanvilMarbleBlack");
		GameRegistry.registerBlock(anvilMarbleBlackStonebrick, "MHOanvilMarbleBlackStonebrick");

		GameRegistry.registerBlock(anvilWoodenStone, "MHOanvilWoodenStone");
		GameRegistry.registerBlock(anvilWoodenStonebrick, "MHOanvilWoodenStonebrick");

		GameRegistry.registerBlock(anvilWoodenLightStone, "MHOanvilWoodenLightStone");
		GameRegistry.registerBlock(anvilWoodenLightStonebrick, "MHOanvilWoodenLightStonebrick");

		LanguageRegistry.addName(anvilWhiteStone, "Balustrade en pierre blanche");
		LanguageRegistry.addName(anvilWhiteStonebrick, "Balustrade en briques de pierre blanche");

		LanguageRegistry.addName(anvilSandstoneStonebrick, "Balustrade en briques de sandstone");
		
		LanguageRegistry.addName(anvilAncientStone, "Balustrade en pierre ancienne");
		LanguageRegistry.addName(anvilAncientStonebrick, "Balustrade en briques de pierre ancienne");
		
		LanguageRegistry.addName(anvilIceStonebrick, "Balustrade en briques de glace");
		
		LanguageRegistry.addName(anvilMarbleWhite, "Balustrade en marbre blanc");
		LanguageRegistry.addName(anvilMarbleWhiteStonebrick, "Balustarde en briques de marbre blanc");
		
		LanguageRegistry.addName(anvilMarbleBlack, "Balustrade en marbre noir");
		LanguageRegistry.addName(anvilMarbleBlackStonebrick, "Balustrade en briques de marbre noir");
		
		LanguageRegistry.addName(anvilWoodenStone, "Balustrade en bois lisse fonc\u00e9");
		LanguageRegistry.addName(anvilWoodenStonebrick, "Balustrade en briques de bois lisse fonc\u00e9");

		LanguageRegistry.addName(anvilWoodenLightStone, "Balustrade en bois lisse clair");
		LanguageRegistry.addName(anvilWoodenLightStonebrick, "Balustrade en briques de bois lisse clair");
	}

	public void initCarpets(ConfigCore cc)
	{
		carpetDirt = new BlockCarpet(cc.carpetDirtID, Block.dirt, "carpetDirt").setTextureName("dirt");
		carpetGravel = new BlockCarpet(cc.carpetGravelID, Block.gravel, "carpetGravel").setTextureName("gravel");
		carpetStone = new BlockCarpet(cc.carpetStoneID, Block.stone, "carpetStone").setTextureName("stone");
		carpetStonebrick = new BlockCarpet(cc.carpetStonebrickID, Block.stoneBrick, "carpetStonebrick").setTextureName("stonebrick");

		carpetPlankOak = new BlockCarpet(cc.carpetPlankOakID, Block.planks, "carpetPlankOak").setTextureName("planks_oak");
		carpetPlankSpruce = new BlockCarpet(cc.carpetPlankSpruceID, Block.planks, "carpetPlankSpruce").setTextureName("planks_spruce");
		carpetLogOakTop = new BlockCarpet(cc.carpetLogOakTopID, Block.wood, "carpetLogOakTop").setTextureName("log_oak_top");
		carpetLogOak = new BlockCarpet(cc.carpetLogOakID, Block.wood, "carpetLogOak").setTextureName("log_oak");
		carpetLogSpruce = new BlockCarpet(cc.carpetLogSpruceID, Block.wood, "carpetLogSpruce").setTextureName("log_spruce");

		GameRegistry.registerBlock(carpetDirt, "MHOcarpetDirt");
		GameRegistry.registerBlock(carpetGravel, "MHOcarpetGravel");
		GameRegistry.registerBlock(carpetStone, "MHOcarpetStone");
		GameRegistry.registerBlock(carpetStonebrick, "MHOcarpetStonebrick");

		GameRegistry.registerBlock(carpetPlankOak, "MHOcarpetPlankOak");
		GameRegistry.registerBlock(carpetPlankSpruce, "MHOcarpetPlankSpruce");
		GameRegistry.registerBlock(carpetLogOakTop, "MHOcarpetLogOakTop");
		GameRegistry.registerBlock(carpetLogOak, "MHOcarpetLogOak");
		GameRegistry.registerBlock(carpetLogSpruce, "MHOcarpetLogSpruce");
		
		LanguageRegistry.addName(new ItemStack(Mho.carpetDirt), "Tapis de merde");
		LanguageRegistry.addName(new ItemStack(Mho.carpetGravel), "Tapis en gravier");
		LanguageRegistry.addName(new ItemStack(Mho.carpetStone), "Tapis en pierre");
		LanguageRegistry.addName(new ItemStack(Mho.carpetStonebrick), "Tapis en stonebrick");
		
		LanguageRegistry.addName(new ItemStack(Mho.carpetPlankOak), "Tapis en planches de ch\u00eane");
		LanguageRegistry.addName(new ItemStack(Mho.carpetPlankSpruce), "Tapis en planches de pin");
		LanguageRegistry.addName(new ItemStack(Mho.carpetLogOakTop), "Tapis en b\u00fbche de ch\u00eane");
		LanguageRegistry.addName(new ItemStack(Mho.carpetLogOak), "Tapis en bois de ch\u00eane");
		LanguageRegistry.addName(new ItemStack(Mho.carpetLogSpruce), "Tapis en bois de pin");
	}

/** ==================== Recipe Items ==================== **/

	public void addRecipeRunes()
	{
		//Sharpness
		GameRegistry.addRecipe(new ItemStack(Mho.enchantSharpnessMedium,1), "XXX", "XXX", "XXX", 'X', Mho.enchantSharpnessSmall);
		GameRegistry.addRecipe(new ItemStack(Mho.enchantSharpnessBig,1), "XXX", "XXX", "XXX", 'X', Mho.enchantSharpnessMedium);

		//Smite
		GameRegistry.addRecipe(new ItemStack(Mho.enchantSmiteMedium,1), "XXX", "XXX", "XXX", 'X', Mho.enchantSmiteSmall);
		GameRegistry.addRecipe(new ItemStack(Mho.enchantSmiteBig,1), "XXX", "XXX", "XXX", 'X', Mho.enchantSmiteMedium);

		//Protection
		GameRegistry.addRecipe(new ItemStack(Mho.enchantProtectionBig,1), "XXX", "XXX", "XXX", 'X', Mho.enchantProtectionSmall);

		//Bane of arthropods
		GameRegistry.addRecipe(new ItemStack(Mho.enchantBaneofMedium,1), "XXX", "XXX", "XXX", 'X', Mho.enchantBaneofSmall);
		GameRegistry.addRecipe(new ItemStack(Mho.enchantBaneofBig,1), "XXX", "XXX", "XXX", 'X', Mho.enchantBaneofMedium);

		//Efficacity
		GameRegistry.addRecipe(new ItemStack(Mho.enchantEfficacityMedium,1), "XXX", "XXX", "XXX", 'X', Mho.enchantEfficacitySmall);
		GameRegistry.addRecipe(new ItemStack(Mho.enchantEfficacityBig,1), "XXX", "XXX", "XXX", 'X', Mho.enchantEfficacityMedium);

		//Durability
		GameRegistry.addRecipe(new ItemStack(Mho.enchantDurabilityMedium,1), "XXX", "XXX", "XXX", 'X', Mho.enchantDurabilitySmall);
		GameRegistry.addRecipe(new ItemStack(Mho.enchantDurabilityBig,1), "XXX", "XXX", "XXX", 'X', Mho.enchantDurabilityMedium);

		//Flame
		//FLAME 2 NON AUTORISE

		//Knockback
		GameRegistry.addRecipe(new ItemStack(Mho.enchantKnockbackBig,1), "XXX", "XXX", "XXX", 'X', Mho.enchantKnockbackSmall);
	}
	
	public void addRecipeFoods()
	{
		GameRegistry.addRecipe(new ItemStack(mug, 1), "X X", "X X", " X ", 'X', Block.glass);
		//GameRegistry.addRecipe(new ItemStack(beer, 1), "X X", "X X", "X X", 'X', Item.);
		GameRegistry.addRecipe(new ItemStack(foodHamburger, 2), "X", "Y", "X", 'X', Item.bread, 'Y', Item.beefCooked);
		GameRegistry.addRecipe(new ItemStack(foodFries, 2), " X ", "YXY", "YYY", 'X', Item.bakedPotato, 'Y', Item.paper);
		//GameRegistry.addRecipe(new ItemStack(foodKfc, 1), "X X", "X X", "X X", 'X', Item.);
		//GameRegistry.addRecipe(new ItemStack(foodEgg, 1), "X X", "X X", "X X", 'X', Item.);
		GameRegistry.addRecipe(new ItemStack(foodBacon, 4), "XX", 'X', Item.porkCooked);
		//GameRegistry.addRecipe(new ItemStack(foodCheese, 1), "X X", "X X", "X X", 'X', Item.);
		//GameRegistry.addRecipe(new ItemStack(foodMaki, 1), "X X", "X X", "X X", 'X', Item.);
		//GameRegistry.addRecipe(new ItemStack(foodSushi, 1), "X X", "X X", "X X", 'X', Item.);
		GameRegistry.addShapelessRecipe(new ItemStack(foodSkewer, 1, 0), Item.beefCooked, Item.stick);
		GameRegistry.addShapelessRecipe(new ItemStack(foodSkewer, 1, 0), Item.porkCooked, Item.stick);
		//GameRegistry.addRecipe(new ItemStack(rhum, 1), "X X", "X X", "X X", 'X', Item.);
	}
	
	public void addRecipeOtherItems()
	{
		GameRegistry.addShapelessRecipe(new ItemStack(magicDust, 9, 0), Mho.magicPowder);
		
		GameRegistry.addShapelessRecipe(new ItemStack(diamondShine, 9), Item.diamond);
		GameRegistry.addRecipe(new ItemStack(Item.diamond, 1), "XXX", "XXX", "XXX", 'X', Mho.diamondShine);
		GameRegistry.addRecipe(new ItemStack(Mho.magicPowder, 1), "XXX", "XXX", "XXX", 'X', Mho.magicDust);
	}
	
/** ==================== Recipe Blocks ==================== **/

	public void addRecipeSetsOfMaterials()
	{
		/** White **/
		GameRegistry.addShapelessRecipe(new ItemStack(whiteStone, 1, 0), Block.stone, new ItemStack(Item.dyePowder,1,15));
		GameRegistry.addShapelessRecipe(new ItemStack(whiteCobblestone, 1, 0), Block.cobblestone, new ItemStack(Item.dyePowder,1,15));
		GameRegistry.addShapelessRecipe(new ItemStack(whiteStonebrick, 1, 0), Block.stoneBrick, new ItemStack(Item.dyePowder,1,15));
		GameRegistry.addShapelessRecipe(new ItemStack(whiteStonebrickRound, 1, 0), new ItemStack(Block.stoneBrick,1,3), new ItemStack(Item.dyePowder,1,15));
		
		GameRegistry.addRecipe(new ItemStack(whiteStonebrick, 4), "XX", "XX", 'X', Mho.whiteStone);
		GameRegistry.addRecipe(new ItemStack(whiteStoneDoubleSlab, 2), "X", "X", 'X', Mho.whiteStonebrick);
		GameRegistry.addRecipe(new ItemStack(whiteStoneColumn, 3), "X", "X", "X", 'X', Mho.whiteStone);
		GameRegistry.addRecipe(new ItemStack(whiteStoneColumnHead, 2), "X", "Y", 'X', Mho.whiteStoneDoubleSlab, 'Y', Mho.whiteStoneColumn);

		GameRegistry.addRecipe(new ItemStack(whiteCobblestone, 1), "X", "X", 'X', Mho.stepWhiteCobblestone);
		GameRegistry.addRecipe(new ItemStack(whiteStoneDoubleSlab, 1), "X", "X", 'X', Mho.stepWhiteStone);
		GameRegistry.addRecipe(new ItemStack(whiteStoneDoubleSlab, 1), "X", "X", 'X', Mho.stepWhiteDoubleSlab);
		GameRegistry.addRecipe(new ItemStack(whiteStoneColumnHead, 1), "X", "Y", 'X', Mho.stepWhiteDoubleSlab, 'Y', Mho.stepWhiteColumn);

		GameRegistry.addSmelting(ConfigCore.whiteStoneID + ConfigCore.cobblestoneRank, new ItemStack(Mho.whiteStone, 1, 0), 0);

		/** Stone **/
		GameRegistry.addRecipe(new ItemStack(stoneColumn, 3), "X", "X", "X", 'X', Block.stone);
		GameRegistry.addRecipe(new ItemStack(stoneColumnHead, 2), "X", "Y", 'X', Block.stoneDoubleSlab, 'Y', Mho.stoneColumn);

		GameRegistry.addRecipe(new ItemStack(stoneColumnHead, 1), "X", "Y", 'X', Block.stoneSingleSlab, 'Y', Mho.stepStoneColumn);

		GameRegistry.addRecipe(new ItemStack(stepStoneColumn, 6), "XXX", 'X', Mho.stoneColumn);
		GameRegistry.addRecipe(new ItemStack(stepStoneColumnHead, 6), "XXX", 'X', Mho.stoneColumnHead);
		
		/** Sandstone **/
		GameRegistry.addRecipe(new ItemStack(sandstoneStonebrick, 4), "XX", "XX", 'X', Block.sandStone);
		GameRegistry.addRecipe(new ItemStack(sandstoneDoubleSlab, 2), "X", "X", 'X', Mho.sandstoneStonebrick);
		GameRegistry.addRecipe(new ItemStack(sandstoneStonebrickRound, 8), "XXX", "X X", "XXX", 'X', Block.sandStone);
		GameRegistry.addRecipe(new ItemStack(sandstoneColumn, 3), "X", "X", "X", 'X', Block.sandStone);
		GameRegistry.addRecipe(new ItemStack(sandstoneColumnHead, 2), "X", "Y", 'X', Mho.sandstoneDoubleSlab, 'Y', Mho.sandstoneColumn);

		GameRegistry.addRecipe(new ItemStack(sandstoneDoubleSlab, 1), "X", "X", 'X', new ItemStack(Block.stoneSingleSlab,1,1));
		GameRegistry.addRecipe(new ItemStack(sandstoneDoubleSlab, 1), "X", "X", 'X', Mho.stepSandstoneDoubleSlab);
		GameRegistry.addRecipe(new ItemStack(sandstoneColumnHead, 1), "X", "Y", 'X', Mho.stepSandstoneDoubleSlab, 'Y', Mho.stepSandstoneColumn);

		/** Ancient **/
		GameRegistry.addRecipe(new ItemStack(ancientStone, 8), "XXX", "XYX", "XXX", 'X', Block.stone, 'Y', Item.compass);

		GameRegistry.addRecipe(new ItemStack(ancientStonebrick, 4), "XX", "XX", 'X', Mho.ancientStone);
		GameRegistry.addRecipe(new ItemStack(ancientDoubleSlab, 2), "X", "X", 'X', Mho.ancientStonebrick);
		GameRegistry.addRecipe(new ItemStack(ancientStonebrickRound, 8), "XXX", "X X", "XXX", 'X', Mho.ancientStone);
		GameRegistry.addRecipe(new ItemStack(ancientColumn, 3), "X", "X", "X", 'X', Mho.ancientStone);
		GameRegistry.addRecipe(new ItemStack(ancientColumnHead, 2), "X", "Y", 'X', Mho.ancientDoubleSlab, 'Y', Mho.ancientColumn);

		GameRegistry.addRecipe(new ItemStack(ancientCobblestone, 1), "X", "X", 'X', Mho.stepAncientCobblestone);
		GameRegistry.addRecipe(new ItemStack(ancientDoubleSlab, 1), "X", "X", 'X', Mho.stepAncientStone);
		GameRegistry.addRecipe(new ItemStack(ancientDoubleSlab, 1), "X", "X", 'X', Mho.stepAncientDoubleSlab);
		GameRegistry.addRecipe(new ItemStack(ancientColumnHead, 1), "X", "Y", 'X', Mho.stepAncientDoubleSlab, 'Y', Mho.stepAncientColumn);

		GameRegistry.addSmelting(ConfigCore.ancientStoneID + ConfigCore.cobblestoneRank, new ItemStack(Block.stone, 1, 0), 0);

		/** Ice blocks **/
		GameRegistry.addShapelessRecipe(new ItemStack(iceCobblestone, 1, 0), Block.ice);
		
		GameRegistry.addRecipe(new ItemStack(iceStonebrick, 4), "XX", "XX", 'X', Block.ice);
		GameRegistry.addRecipe(new ItemStack(iceDoubleSlab, 2), "X", "X", 'X', Mho.iceStonebrick);
		GameRegistry.addRecipe(new ItemStack(iceStonebrickRound, 8), "XXX", "X X", "XXX", 'X', Block.ice);
		GameRegistry.addRecipe(new ItemStack(iceColumn, 3), "X", "X", "X", 'X', Block.ice);
		GameRegistry.addRecipe(new ItemStack(iceColumnHead, 2), "X", "Y", 'X', Mho.iceDoubleSlab, 'Y', Mho.iceColumn);

		GameRegistry.addRecipe(new ItemStack(iceCobblestone, 1), "X", "X", 'X', Mho.stepIceCobblestone);
		GameRegistry.addRecipe(new ItemStack(iceDoubleSlab, 1), "X", "X", 'X', Mho.stepIce);
		GameRegistry.addRecipe(new ItemStack(iceDoubleSlab, 1), "X", "X", 'X', Mho.stepIceDoubleSlab);
		GameRegistry.addRecipe(new ItemStack(iceColumnHead, 1), "X", "Y", 'X', Mho.stepIceDoubleSlab, 'Y', Mho.stepIceColumn);

		/** Marble white **/
		GameRegistry.addShapelessRecipe(new ItemStack(marbleWhiteStone, 1, 0), Mho.obsidianBlock, new ItemStack(Item.dyePowder,1,15));
		
		GameRegistry.addRecipe(new ItemStack(marbleWhiteStonebrick, 4), "XX", "XX", 'X', Mho.marbleWhiteStone);
		GameRegistry.addRecipe(new ItemStack(marbleWhiteDoubleSlab, 2), "X", "X", 'X', Mho.marbleWhiteStonebrick);
		GameRegistry.addRecipe(new ItemStack(marbleWhiteStonebrickRound, 8), "XXX", "X X", "XXX", 'X', Mho.marbleWhiteStone);
		GameRegistry.addRecipe(new ItemStack(marbleWhiteColumn, 3), "X", "X", "X", 'X', Mho.marbleWhiteStone);
		GameRegistry.addRecipe(new ItemStack(marbleWhiteColumnHead, 2), "X", "Y", 'X', Mho.marbleWhiteDoubleSlab, 'Y', Mho.marbleWhiteColumn);

		GameRegistry.addRecipe(new ItemStack(marbleWhiteCobblestone, 1), "X", "X", 'X', Mho.stepMarbleWhiteCobblestone);
		GameRegistry.addRecipe(new ItemStack(marbleWhiteDoubleSlab, 1), "X", "X", 'X', Mho.stepMarbleWhiteStone);
		GameRegistry.addRecipe(new ItemStack(marbleWhiteDoubleSlab, 1), "X", "X", 'X', Mho.stepMarbleWhiteDoubleSlab);
		GameRegistry.addRecipe(new ItemStack(marbleWhiteColumnHead, 1), "X", "Y", 'X', Mho.stepMarbleWhiteDoubleSlab, 'Y', Mho.stepMarbleWhiteColumn);

		GameRegistry.addSmelting(ConfigCore.marbleWhiteID + ConfigCore.cobblestoneRank, new ItemStack(Mho.obsidianBlock, 1, 0), 0);

		/** Marble black **/
		GameRegistry.addShapelessRecipe(new ItemStack(marbleBlackStone, 1, 0), Mho.obsidianBlock, new ItemStack(Item.dyePowder,1,0));
		
		GameRegistry.addRecipe(new ItemStack(marbleBlackStonebrick, 4), "XX", "XX", 'X', Mho.marbleBlackStone);
		GameRegistry.addRecipe(new ItemStack(marbleBlackDoubleSlab, 2), "X", "X", 'X', Mho.marbleBlackStonebrick);
		GameRegistry.addRecipe(new ItemStack(marbleBlackStonebrickRound, 8), "XXX", "X X", "XXX", 'X', Mho.marbleBlackStone);
		GameRegistry.addRecipe(new ItemStack(marbleBlackColumn, 3), "X", "X", "X", 'X', Mho.marbleBlackStone);
		GameRegistry.addRecipe(new ItemStack(marbleBlackColumnHead, 2), "X", "Y", 'X', Mho.marbleBlackDoubleSlab, 'Y', Mho.marbleBlackColumn);
		GameRegistry.addRecipe(new ItemStack(marbleCheck, 4), "XY", "YX", 'X', Mho.marbleBlackStone, 'Y', Mho.marbleWhiteStone);
		GameRegistry.addRecipe(new ItemStack(marbleCheck, 4), "YX", "XY", 'X', Mho.marbleBlackStone, 'Y', Mho.marbleWhiteStone);

		GameRegistry.addRecipe(new ItemStack(marbleBlackCobblestone, 1), "X", "X", 'X', Mho.stepMarbleBlackCobblestone);
		GameRegistry.addRecipe(new ItemStack(marbleBlackDoubleSlab, 1), "X", "X", 'X', Mho.stepMarbleBlackStone);
		GameRegistry.addRecipe(new ItemStack(marbleBlackDoubleSlab, 1), "X", "X", 'X', Mho.stepMarbleBlackDoubleSlab);
		GameRegistry.addRecipe(new ItemStack(marbleBlackColumnHead, 1), "X", "Y", 'X', Mho.stepMarbleBlackDoubleSlab, 'Y', Mho.stepMarbleBlackColumn);
		GameRegistry.addRecipe(new ItemStack(marbleCheck, 1), "X", "X", 'X', Mho.stepMarbleCheck);

		GameRegistry.addSmelting(ConfigCore.marbleBlackID + ConfigCore.cobblestoneRank, new ItemStack(Mho.obsidianBlock, 1, 0), 0);

		/** Wood **/
		GameRegistry.addRecipe(new ItemStack(woodenStone, 8), "XXX", "XYX", "XXX", 'X', new ItemStack(Block.planks, 1, 1), 'Y', Mho.beer);
		
		GameRegistry.addRecipe(new ItemStack(woodenStonebrick, 4), "XX", "XX", 'X', Mho.woodenStone);
		GameRegistry.addRecipe(new ItemStack(woodenDoubleSlab, 2), "X", "X", 'X', Mho.woodenStonebrick);
		GameRegistry.addRecipe(new ItemStack(woodenStonebrickRound, 8), "XXX", "X X", "XXX", 'X', Mho.woodenStone);
		GameRegistry.addRecipe(new ItemStack(woodenColumn, 3), "X", "X", "X", 'X', Mho.woodenStone);
		GameRegistry.addRecipe(new ItemStack(woodenColumnHead, 2), "X", "Y", 'X', Mho.woodenDoubleSlab, 'Y', Mho.woodenColumn);

		GameRegistry.addRecipe(new ItemStack(woodenDoubleSlab, 1), "X", "X", 'X', Mho.stepWoodenStone);
		GameRegistry.addRecipe(new ItemStack(woodenDoubleSlab, 1), "X", "X", 'X', Mho.stepWoodenDoubleSlab);
		GameRegistry.addRecipe(new ItemStack(woodenColumnHead, 1), "X", "Y", 'X', Mho.stepWoodenDoubleSlab, 'Y', Mho.stepWoodenColumn);

		/** Wood light **/
		GameRegistry.addRecipe(new ItemStack(woodenLightStone, 8), "XXX", "XYX", "XXX", 'X', new ItemStack(Block.planks, 1, 2), 'Y', Mho.beer);
		
		GameRegistry.addRecipe(new ItemStack(woodenLightStonebrick, 4), "XX", "XX", 'X', Mho.woodenLightStone);
		GameRegistry.addRecipe(new ItemStack(woodenLightDoubleSlab, 2), "X", "X", 'X', Mho.woodenLightStonebrick);
		GameRegistry.addRecipe(new ItemStack(woodenLightStonebrickRound, 8), "XXX", "X X", "XXX", 'X', Mho.woodenLightStone);
		GameRegistry.addRecipe(new ItemStack(woodenLightColumn, 3), "X", "X", "X", 'X', Mho.woodenLightStone);
		GameRegistry.addRecipe(new ItemStack(woodenLightColumnHead, 2), "X", "Y", 'X', Mho.woodenLightDoubleSlab, 'Y', Mho.woodenLightColumn);

		GameRegistry.addRecipe(new ItemStack(woodenLightDoubleSlab, 1), "X", "X", 'X', Mho.stepWoodenLightStone);
		GameRegistry.addRecipe(new ItemStack(woodenLightDoubleSlab, 1), "X", "X", 'X', Mho.stepWoodenLightDoubleSlab);
		GameRegistry.addRecipe(new ItemStack(woodenLightColumnHead, 1), "X", "Y", 'X', Mho.stepWoodenLightDoubleSlab, 'Y', Mho.stepWoodenLightColumn);

		/** Metal **/
		GameRegistry.addRecipe(new ItemStack(metalDoubleSlab, 4), "XYX", "XYX", 'X', Block.blockIron, 'Y', Item.coal);
		GameRegistry.addRecipe(new ItemStack(metalStonebrickRound, 8), "XXX", "XYX", "XXX", 'X', Block.blockIron, 'Y', Block.coalBlock);
		GameRegistry.addRecipe(new ItemStack(metalCheck, 2), "XX", 'X', Mho.metalDoubleSlab);

		GameRegistry.addRecipe(new ItemStack(metalDoubleSlab, 1), "X", "X", 'X', Mho.stepMetal);

		/** Basalt **/
		GameRegistry.addShapelessRecipe(new ItemStack(basaltCobblestone, 1, 0), Item.coal, Block.cobblestone);
		GameRegistry.addShapelessRecipe(new ItemStack(basaltCobblestone, 1, 0), new ItemStack(Item.coal,1,1), Block.cobblestone);
		
		GameRegistry.addRecipe(new ItemStack(basaltStonebrick, 4), "XX", "XX", 'X', Mho.basalt);

		GameRegistry.addSmelting(ConfigCore.basaltID + ConfigCore.cobblestoneRank, new ItemStack(Mho.basalt, 1, 0), 0);
	}

	public void addRecipeSetsOfNaturalBlocks()
	{
		/** Ice Blocks **/
		//iceLog
		//iceLeaves
		//iceLeavesLight
		GameRegistry.addShapelessRecipe(new ItemStack(icePlank, 4, 0), iceLog);

		/** Dark Blocks **/
		//GameRegistry.addRecipe(new ItemStack(darkStone, 1), "X X", "X X", "X X", 'X', Block.);
		//darkCobblestone
		//GameRegistry.addRecipe(new ItemStack(darkDirt, 1), "X X", "X X", "X X", 'X', Block.);
		//GameRegistry.addRecipe(new ItemStack(darkGrassBlock, 1), "X X", "X X", "X X", 'X', Block.);
		//darkLog
		//darkLeaves

		/** Mysterious Blocks **/
		GameRegistry.addShapelessRecipe(new ItemStack(mysteriousStone, 1, 0), Block.stone, magicDust);
		GameRegistry.addShapelessRecipe(new ItemStack(mysteriousDirt, 1, 0), Block.dirt, magicDust);
		GameRegistry.addShapelessRecipe(new ItemStack(mysteriousGrassBlock, 1, 0), Block.grass, magicDust);
		GameRegistry.addShapelessRecipe(new ItemStack(mysteriousLog, 1, 0), Block.wood, magicDust);
		GameRegistry.addShapelessRecipe(new ItemStack(mysteriousLeaves, 1, 0), Block.leaves, magicDust);
		GameRegistry.addShapelessRecipe(new ItemStack(mysteriousLeavesPurple, 1, 0), Block.leaves, magicDust, magicDust);

		GameRegistry.addShapelessRecipe(new ItemStack(mysteriousFlower, 1, 0), Block.plantYellow, magicDust);
		GameRegistry.addShapelessRecipe(new ItemStack(mysteriousPlantPurple, 1, 0), Block.plantRed, magicDust);
		GameRegistry.addShapelessRecipe(new ItemStack(mysteriousCoral, 1, 0), Mho.coralOrange, magicDust);
		GameRegistry.addShapelessRecipe(new ItemStack(mysteriousAlgue, 1, 0), Mho.coralRose, magicDust);
		GameRegistry.addShapelessRecipe(new ItemStack(mysteriousPlant, 1, 0), new ItemStack(Block.tallGrass, 1, 2), magicDust);
		GameRegistry.addShapelessRecipe(new ItemStack(mysteriousReed, 1, 0), Item.reed, magicDust);
		GameRegistry.addShapelessRecipe(new ItemStack(mysteriousGrass, 1, 0), new ItemStack(Block.tallGrass, 1, 1), magicDust);

		/** Red Rock **/
		//GameRegistry.addRecipe(new ItemStack(redGrassBlock, 1), "X X", "X X", "X X", 'X', Block.);
		//GameRegistry.addRecipe(new ItemStack(redGravel, 1), "X X", "X X", "X X", 'X', Block.);
		//GameRegistry.addRecipe(new ItemStack(redRockBigLine, 1), "X X", "X X", "X X", 'X', Block.);
		//GameRegistry.addRecipe(new ItemStack(redRockLines, 1), "X X", "X X", "X X", 'X', Block.);
		//redSilver

		/** Rocks **/
		//GameRegistry.addRecipe(new ItemStack(greyRock, 1), "X X", "X X", "X X", 'X', Block.);
		//GameRegistry.addRecipe(new ItemStack(greyRockGrass, 1), "X X", "X X", "X X", 'X', Block.);

		//GameRegistry.addRecipe(new ItemStack(brownRock, 1), "X X", "X X", "X X", 'X', Block.);
		//GameRegistry.addRecipe(new ItemStack(brownRockGrass, 1), "X X", "X X", "X X", 'X', Block.);

		//GameRegistry.addRecipe(new ItemStack(brownRockGrass, 1), "X X", "X X", "X X", 'X', Block.);
		//GameRegistry.addRecipe(new ItemStack(darkRockGrass, 1), "X X", "X X", "X X", 'X', Block.);

		//GameRegistry.addRecipe(new ItemStack(blackRock, 1), "X X", "X X", "X X", 'X', Block.);

		//GameRegistry.addRecipe(new ItemStack(lavaRock, 1), "X X", "X X", "X X", 'X', Block.);
		//GameRegistry.addRecipe(new ItemStack(lavaRockRed, 1), "X X", "X X", "X X", 'X', Block.);
	}
	
	public void addRecipeTimbereds()
	{
		/** Colombages **/
		GameRegistry.addRecipe(new ItemStack(Mho.timberedSquare, 4), "XXX", "XYX", "XXX", 'X', new ItemStack(Block.planks,1,0), 'Y', Mho.whiteStone);
		GameRegistry.addRecipe(new ItemStack(Mho.timberedCross, 4), "XYX", "YXY", "XYX", 'X', new ItemStack(Block.planks,1,0), 'Y', Mho.whiteStone);
		GameRegistry.addRecipe(new ItemStack(Mho.timberedVertical, 4), "YXY", "YXY", "YXY", 'X', new ItemStack(Block.planks,1,0), 'Y', Mho.whiteStone);
		GameRegistry.addRecipe(new ItemStack(Mho.timberedHorizontal, 4), "YYY", "XXX", "YYY", 'X', new ItemStack(Block.planks,1,0), 'Y', Mho.whiteStone);
		GameRegistry.addRecipe(new ItemStack(Mho.timberedLeft, 4), "XYY", "YXY", "YYX", 'X', new ItemStack(Block.planks,1,0), 'Y', Mho.whiteStone);
		GameRegistry.addRecipe(new ItemStack(Mho.timberedRight, 4), "YYX", "YXY", "XYY", 'X', new ItemStack(Block.planks,1,0), 'Y', Mho.whiteStone);

		/** Colombages fonces **/
		GameRegistry.addRecipe(new ItemStack(Mho.timberedSquareDark, 4), "XXX", "XYX", "XXX", 'X', new ItemStack(Block.planks,1,1), 'Y', Mho.whiteStone);
		GameRegistry.addRecipe(new ItemStack(Mho.timberedCrossDark, 4), "XYX", "YXY", "XYX", 'X', new ItemStack(Block.planks,1,1), 'Y', Mho.whiteStone);
		GameRegistry.addRecipe(new ItemStack(Mho.timberedVerticalDark, 4), "YXY", "YXY", "YXY", 'X', new ItemStack(Block.planks,1,1), 'Y', Mho.whiteStone);
		GameRegistry.addRecipe(new ItemStack(Mho.timberedHorizontalDark, 4), "YYY", "XXX", "YYY", 'X', new ItemStack(Block.planks,1,1), 'Y', Mho.whiteStone);
		GameRegistry.addRecipe(new ItemStack(Mho.timberedLeftDark, 4), "XYY", "YXY", "YYX", 'X', new ItemStack(Block.planks,1,1), 'Y', Mho.whiteStone);
		GameRegistry.addRecipe(new ItemStack(Mho.timberedRightDark, 4), "YYX", "YXY", "XYY", 'X', new ItemStack(Block.planks,1,1), 'Y', Mho.whiteStone);
	}

	public void addRecipeDoubleBlocks()
	{
		GameRegistry.addRecipe(new ItemStack(doubleCrateItemBlock, 1), "X", "X", 'X', Mho.barredCrate);

		GameRegistry.addRecipe(new ItemStack(doubleTorchUpper, 1), "X", "Y", "Y", 'X', Block.torchWood, 'Y', Item.stick);
		GameRegistry.addRecipe(new ItemStack(doubleCandleUpper, 1), "X", "Y", "Y", 'X', Mho.lightCandle, 'Y', Item.stick);
		GameRegistry.addRecipe(new ItemStack(doubleLanternUpper, 1), "X", "Y", "Y", 'X', Mho.lightLantern, 'Y', Item.ingotIron);

		GameRegistry.addShapelessRecipe(new ItemStack(normalDoubleGrassUpper, 2, 0), new ItemStack(Block.tallGrass, 1, 1), new ItemStack(Block.tallGrass, 1, 1), new ItemStack(Item.dyePowder,1,15));
		GameRegistry.addShapelessRecipe(new ItemStack(savanaDoubleGrassUpper, 2, 0), new ItemStack(Block.tallGrass, 1, 1), new ItemStack(Block.tallGrass, 1, 1), Item.coal, new ItemStack(Item.dyePowder,1,15));
		GameRegistry.addShapelessRecipe(new ItemStack(savanaDoubleGrassUpper, 2, 0), new ItemStack(Block.tallGrass, 1, 1), new ItemStack(Block.tallGrass, 1, 1), new ItemStack(Item.coal, 1, 1), new ItemStack(Item.dyePowder,1,15));
		GameRegistry.addShapelessRecipe(new ItemStack(mysteriousDoubleGrassUpper, 2, 0), new ItemStack(Block.tallGrass, 1, 1), new ItemStack(Block.tallGrass, 1, 1), magicDust, new ItemStack(Item.dyePowder,1,15));
	}

	public void addRecipeMetaBlocks()
	{
		for (int ix = 0; ix < 16; ix++) {
			GameRegistry.addShapelessRecipe(new ItemStack(metaWoolLight, 1, ix), new ItemStack(Block.cloth, 1, ix), Item.glowstone);
		}

		for (int ix = 0; ix < 16; ix++) {
			GameRegistry.addShapelessRecipe(new ItemStack(metaVitrail, 2, ix), Block.glass, new ItemStack(Item.dyePowder, 1, 15 - ix), Item.ingotIron);
		}

		for (int ix = 0; ix < 16; ix++) {
			GameRegistry.addRecipe(new ItemStack(metaVitrailPane, 16, ix), "XXX", 'X', new ItemStack(Mho.metaVitrail, 1, ix));
		}
	}
	
	public void addRecipeBrightBlocks()
	{
		GameRegistry.addRecipe(new ItemStack(Mho.lanternWood, 1), "XXX", "XYX", "XXX", 'X', Item.stick, 'Y', Block.glowStone);
		GameRegistry.addRecipe(new ItemStack(Mho.lanternIron, 2), "XYX", 'X', Item.ingotIron, 'Y', Block.glowStone);

		GameRegistry.addRecipe(new ItemStack (Mho.lampionBlanc, 1), "WXW", "XYX", "WZW", 'W', Item.stick, 'X', Item.paper, 'Y', Block.torchWood, 'Z', new ItemStack(Item.dyePowder,1,15));
		GameRegistry.addRecipe(new ItemStack (Mho.lampionBleu, 1), "WXW", "XYX", "WZW", 'W', Item.stick, 'X', Item.paper, 'Y', Block.torchWood, 'Z', new ItemStack(Item.dyePowder,1,12));
		GameRegistry.addRecipe(new ItemStack (Mho.lampionJaune, 1), "WXW", "XYX", "WZW", 'W', Item.stick, 'X', Item.paper, 'Y', Block.torchWood, 'Z', new ItemStack(Item.dyePowder,1,11));
		GameRegistry.addRecipe(new ItemStack (Mho.lampionVert, 1), "WXW", "XYX", "WZW", 'W', Item.stick, 'X', Item.paper, 'Y', Block.torchWood, 'Z', new ItemStack(Item.dyePowder,1,10));
		GameRegistry.addRecipe(new ItemStack (Mho.lampionRouge, 1), "WXW", "XYX", "WZW", 'W', Item.stick, 'X', Item.paper, 'Y', Block.torchWood, 'Z', new ItemStack(Item.dyePowder,1,1));

		GameRegistry.addShapelessRecipe(new ItemStack(lightCandle, 1, 0), Item.slimeBall, Item.silk);
		GameRegistry.addRecipe(new ItemStack(lightLantern, 2), " X ", "XYX", " X ", 'X', Item.ingotIron, 'Y', Mho.lightCandle);
		GameRegistry.addRecipe(new ItemStack(lightSkullCandle, 1), "X", "Y", 'X', Mho.lightCandle, 'Y', Item.skull);
		GameRegistry.addRecipe(new ItemStack(lightSkullSpike, 1), "X", "Y", 'X', Item.skull, 'Y', Block.torchWood);
	}
	
	public void addRecipeSimpleBlocks()
	{
		GameRegistry.addRecipe(new ItemStack(crossCrate, 1), "X X", " Y ", "X X", 'X', Block.planks, 'Y', Block.chest);
		GameRegistry.addRecipe(new ItemStack(barredCrate, 1), " X ", "XYX", " X ", 'X', Block.planks, 'Y', Block.chest);
		GameRegistry.addRecipe(new ItemStack(leatherBlock, 1), "XXX", "XXX", "XXX", 'X', Item.leather);
		//PHOnoir
		//PHOblanc
		//GameRegistry.addRecipe(new ItemStack(silverBlock, 1), "X X", "X X", "X X", 'X', Block.);
		GameRegistry.addSmelting(Block.obsidian.blockID, new ItemStack(Mho.obsidianBlock, 1, 0), 0);
		GameRegistry.addRecipe(new ItemStack(shoji, 1), "XXX", "XYX", "XXX", 'X', Item.stick, 'Y', Item.paper);
		
		/** Tiles **/
		GameRegistry.addRecipe(new ItemStack(tileArdoise, 1), "XX", "XX", 'X', Item.flint);
		GameRegistry.addRecipe(new ItemStack(tileRed, 1), " X ", "X X", 'X', Item.brick);
		GameRegistry.addRecipe(new ItemStack(tileBlack, 1), " X ", "XYX", 'X', Item.brick, 'Y', new ItemStack(Item.dyePowder,1,0));
		GameRegistry.addRecipe(new ItemStack(tileBlue, 1), " X ", "XYX", 'X', Item.brick, 'Y', new ItemStack(Item.dyePowder,1,4));
		GameRegistry.addRecipe(new ItemStack(tileRedBig, 2), " X ", "XXX", "X X", 'X', Item.brick);
		GameRegistry.addRecipe(new ItemStack(tileBlackBig, 2), " X ", "XXX", "XYX", 'X', Item.brick, 'Y', new ItemStack(Item.dyePowder,1,0));
		GameRegistry.addRecipe(new ItemStack(tileBlueBig, 2), " X ", "XXX", "XYX", 'X', Item.brick, 'Y', new ItemStack(Item.dyePowder,1,4));
		GameRegistry.addRecipe(new ItemStack(tileBlackAlt, 1), " Y ", " X ", "X X", 'X', Item.brick, 'Y', new ItemStack(Item.dyePowder,1,0));
	}
	
	public void addRecipeSpecialBlocks()
	{
		GameRegistry.addRecipe(new ItemStack(meatBlock, 1), "XXX", "XXX", "XXX", 'X', Item.beefRaw);
		//fossileBlock

		//simpleDirtBlock
		//completeLogOak
		//completeLogSpruce

		//vaillantCrate

		GameRegistry.addRecipe(new ItemStack(ironWindow, 6), "XXX", "X X", "XXX", 'X', Block.fenceIron);
		GameRegistry.addRecipe(new ItemStack(metalGrid, 2), "XXX", "XYX", "XXX", 'X', Item.ingotIron, 'Y', Item.coal);
		
		//woeBlock
		
		//lavaBlock
		//waterBlock

		//logCherry
		//logRed
		GameRegistry.addRecipe(new ItemStack(barrel, 1), "ZXZ", " Y ", "ZXZ", 'X', Block.planks, 'Y', Block.chest, 'Z', Item.ingotIron);

		GameRegistry.addRecipe(new ItemStack(ironWindowPane, 16), "XXX", "XXX", 'X', Mho.ironWindow);

		//grisouBlock
		//GameRegistry.addRecipe(new ItemStack(slimeBlock, 1), "X X", "X X", "X X", 'X', Block.);
		//invisibleBlock
		//portalPurple
		//GameRegistry.addRecipe(new ItemStack(bookBlock, 1), "X X", "X X", "X X", 'X', Block.);
		//GameRegistry.addRecipe(new ItemStack(chainIron, 1), "X X", "X X", "X X", 'X', Block.);
		//GameRegistry.addRecipe(new ItemStack(chainRope, 1), "X X", "X X", "X X", 'X', Block.);
		//GameRegistry.addRecipe(new ItemStack(ropeRail, 1), "X X", "X X", "X X", 'X', Block.);
		//spikes
		//GameRegistry.addRecipe(new ItemStack(climbingLadder, 1), "X X", "X X", "X X", 'X', Block.);
		GameRegistry.addShapelessRecipe(new ItemStack(roseVines, 1, 0), Block.plantRed, Block.vine);
		//GameRegistry.addRecipe(new ItemStack(cristalLittle, 1), "X X", "X X", "X X", 'X', Block.);
		GameRegistry.addRecipe(new ItemStack(cristalBig, 1), "XX", "XX", 'X', Mho.cristalLittle);
		GameRegistry.addRecipe(new ItemStack(cristalBlock, 1), "XX", "XX", 'X', Mho.cristalBig);
		//GameRegistry.addRecipe(new ItemStack(cakeLieBlock, 1), "X X", "X X", "X X", 'X', Block.);
		//GameRegistry.addRecipe(new ItemStack(meatCakeBlock, 1), "X X", "X X", "X X", 'X', Block.);
		//GameRegistry.addRecipe(new ItemStack(eternalIceBlock, 1), "X X", "X X", "X X", 'X', Block.);

		/** Secret **/
        GameRegistry.addRecipe(new ItemStack(itemBlockSecretDoorWood, 1), "XXG", "XDG", "XXG", 'X', Block.bookShelf, 'D', Item.doorWood, 'G', Block.leaves);
        GameRegistry.addRecipe(new ItemStack(itemBlockSecretDoorWood, 1), "GXX", "GDX", "GXX", 'X', Block.bookShelf, 'D', Item.doorWood, 'G', Block.leaves);
        GameRegistry.addRecipe(new ItemStack(itemBlockSecretDoorWood, 1), "XXG", "XDG", "XXG", 'X', Block.bookShelf, 'D', Item.doorWood, 'G', Block.vine);
        GameRegistry.addRecipe(new ItemStack(itemBlockSecretDoorWood, 1), "GXX", "GDX", "GXX", 'X', Block.bookShelf, 'D', Item.doorWood, 'G', Block.vine);
        GameRegistry.addRecipe(new ItemStack(itemBlockSecretDoorIron, 1), "XXG", "XDG", "XXG", 'X', Block.bookShelf, 'D', Item.doorIron, 'G', Block.leaves);
        GameRegistry.addRecipe(new ItemStack(itemBlockSecretDoorIron, 1), "GXX", "GDX", "GXX", 'X', Block.bookShelf, 'D', Item.doorIron, 'G', Block.leaves);
        GameRegistry.addRecipe(new ItemStack(itemBlockSecretDoorIron, 1), "XXG", "XDG", "XXG", 'X', Block.bookShelf, 'D', Item.doorIron, 'G', Block.vine);
        GameRegistry.addRecipe(new ItemStack(itemBlockSecretDoorIron, 1), "GXX", "GDX", "GXX", 'X', Block.bookShelf, 'D', Item.doorIron, 'G', Block.vine);
        GameRegistry.addRecipe(new ItemStack(blockSecretTrapDoor, 1), "GGG", "XDX", "XXX", 'X', Block.bookShelf, 'D', Block.trapdoor, 'G', Block.leaves);
        GameRegistry.addRecipe(new ItemStack(blockSecretTrapDoor, 1), "XXX", "XDX", "GGG", 'X', Block.bookShelf, 'D', Block.trapdoor, 'G', Block.leaves);
        GameRegistry.addRecipe(new ItemStack(blockSecretTrapDoor, 1), "GGG", "XDX", "XXX", 'X', Block.bookShelf, 'D', Block.trapdoor, 'G', Block.vine);
        GameRegistry.addRecipe(new ItemStack(blockSecretTrapDoor, 1), "XXX", "XDX", "GGG", 'X', Block.bookShelf, 'D', Block.trapdoor, 'G', Block.vine);
	}
	
	public void addRecipeStairs()
	{
		GameRegistry.addRecipe(new ItemStack(Mho.stairStraw, 4), "X  ", "XX ", "XXX", 'X', Block.hay);
		
		/** Stair white **/
		GameRegistry.addRecipe(new ItemStack(Mho.stairWhiteStone, 4), "X  ", "XX ", "XXX", 'X', Mho.whiteStone);
		GameRegistry.addRecipe(new ItemStack(Mho.stairWhiteStonebrick, 4), "X  ", "XX ", "XXX", 'X', Mho.whiteStonebrick);
		GameRegistry.addRecipe(new ItemStack(Mho.stairWhiteCobblestone, 4), "X  ", "XX ", "XXX", 'X', Mho.whiteCobblestone);

		/** Stair sandstone **/
		GameRegistry.addRecipe(new ItemStack(Mho.stairSandstoneStonebrick, 4), "X  ", "XX ", "XXX", 'X', Mho.sandstoneStonebrick);

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
		GameRegistry.addRecipe(new ItemStack(Mho.stairMarbleCheck, 4), "X  ", "XX ", "XXX", 'X', Mho.marbleCheck);

		/** Stair ice **/
		GameRegistry.addRecipe(new ItemStack(Mho.stairIce, 4), "X  ", "XX ", "XXX", 'X', Block.ice);
		GameRegistry.addRecipe(new ItemStack(Mho.stairIceStonebrick, 4), "X  ", "XX ", "XXX", 'X', Mho.iceStonebrick);
		GameRegistry.addRecipe(new ItemStack(Mho.stairIceCobblestone, 4), "X  ", "XX ", "XXX", 'X', Mho.iceCobblestone);

		/** Stair wooden **/
		GameRegistry.addRecipe(new ItemStack(Mho.stairWoodenStone, 4), "X  ", "XX ", "XXX", 'X', Mho.woodenStone);
		GameRegistry.addRecipe(new ItemStack(Mho.stairWoodenStonebrick, 4), "X  ", "XX ", "XXX", 'X', Mho.woodenStonebrick);

		/** Stair wooden light **/
		GameRegistry.addRecipe(new ItemStack(Mho.stairWoodenLightStone, 4), "X  ", "XX ", "XXX", 'X', Mho.woodenLightStone);
		GameRegistry.addRecipe(new ItemStack(Mho.stairWoodenLightStonebrick, 4), "X  ", "XX ", "XXX", 'X', Mho.woodenLightStonebrick);

		/**Stair tuiles **/
		GameRegistry.addRecipe(new ItemStack(Mho.stairArdoise, 4), "X  ", "XX ", "XXX", 'X', Mho.tileArdoise);
		GameRegistry.addRecipe(new ItemStack(Mho.stairTileRed, 4), "X  ", "XX ", "XXX", 'X', Mho.tileRed);
		GameRegistry.addRecipe(new ItemStack(Mho.stairTileBlack, 4), "X  ", "XX ", "XXX", 'X', Mho.tileBlack);
		GameRegistry.addRecipe(new ItemStack(Mho.stairTileBlue, 4), "X  ", "XX ", "XXX", 'X', Mho.tileBlue);
		GameRegistry.addRecipe(new ItemStack(Mho.stairTileBlueBig, 4), "X  ", "XX ", "XXX", 'X', Mho.tileBlueBig);
		GameRegistry.addRecipe(new ItemStack(Mho.stairTileRedBig, 4), "X  ", "XX ", "XXX", 'X', Mho.tileRedBig);
		GameRegistry.addRecipe(new ItemStack(Mho.stairTileBlackBig, 4), "X  ", "XX ", "XXX", 'X', Mho.tileBlackBig);
		GameRegistry.addRecipe(new ItemStack(Mho.stairTileBlackAlt, 4), "X  ", "XX ", "XXX", 'X', Mho.tileBlackAlt);
	}
	
	public void addRecipeSteps()
	{
		/** Step base **/
		GameRegistry.addRecipe(new ItemStack(stepGrass, 6), "XXX", 'X', Block.grass);
		GameRegistry.addRecipe(new ItemStack(stepDirt, 6), "XXX", 'X', Block.dirt);
		GameRegistry.addRecipe(new ItemStack(stepGravel, 6), "XXX", 'X', Block.gravel);
		GameRegistry.addRecipe(new ItemStack(stepWoodOak, 6), "XXX", 'X', new ItemStack(Block.wood,1,0));
		GameRegistry.addRecipe(new ItemStack(stepWoodSpruce, 6), "XXX", 'X', new ItemStack(Block.wood,1,1));
		GameRegistry.addRecipe(new ItemStack(stepWoodBirch, 6), "XXX", 'X', new ItemStack(Block.wood,1,2));
		GameRegistry.addRecipe(new ItemStack(stepWoodJungle, 6), "XXX", 'X', new ItemStack(Block.wood,1,3));
		GameRegistry.addRecipe(new ItemStack(stepCobbleMossy, 6), "XXX", 'X', Block.cobblestoneMossy);
		GameRegistry.addRecipe(new ItemStack(stepObsidian, 6), "XXX", 'X', Block.obsidian);
		GameRegistry.addRecipe(new ItemStack(stepIce, 6), "XXX", 'X', Block.ice);
		GameRegistry.addRecipe(new ItemStack(stepSnow, 6), "XXX", 'X', Block.snow);
		GameRegistry.addRecipe(new ItemStack(stepStonebrickMossy, 6), "XXX", 'X', new ItemStack(Block.stoneBrick,1,1));
		GameRegistry.addRecipe(new ItemStack(stepStonebrickCracked, 6), "XXX", 'X', new ItemStack(Block.stoneBrick,1,2));
		GameRegistry.addRecipe(new ItemStack(stepEnderstone, 6), "XXX", 'X', Block.whiteStone);
		GameRegistry.addRecipe(new ItemStack(stepSand, 6), "XXX", 'X', Block.sand);
		GameRegistry.addRecipe(new ItemStack(Mho.stepStraw, 6), "XXX", 'X', Block.hay);

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

		/** Step White **/
		GameRegistry.addRecipe(new ItemStack(stepWhiteStone, 6), "XXX", 'X', Mho.whiteStone);
		GameRegistry.addRecipe(new ItemStack(stepWhiteCobblestone, 6), "XXX", 'X', Mho.whiteCobblestone);
		GameRegistry.addRecipe(new ItemStack(stepWhiteStonebrick, 6), "XXX", 'X', Mho.whiteStonebrick);
		GameRegistry.addRecipe(new ItemStack(stepWhiteDoubleSlab, 6), "XXX", 'X', Mho.whiteStoneDoubleSlab);
		GameRegistry.addRecipe(new ItemStack(stepWhiteColumn, 6), "XXX", 'X', Mho.whiteStoneColumn);
		GameRegistry.addRecipe(new ItemStack(stepWhiteColumnHead, 6), "XXX", 'X', Mho.whiteStoneColumnHead);

		/** Step sandstone **/
		GameRegistry.addRecipe(new ItemStack(stepSandstoneStonebrick, 6), "XXX", 'X', Mho.sandstoneStonebrick);
		GameRegistry.addRecipe(new ItemStack(stepSandstoneDoubleSlab, 6), "XXX", 'X', Mho.sandstoneDoubleSlab);
		GameRegistry.addRecipe(new ItemStack(stepSandstoneColumn, 6), "XXX", 'X', Mho.sandstoneColumn);
		GameRegistry.addRecipe(new ItemStack(stepSandstoneColumnHead, 6), "XXX", 'X', Mho.sandstoneColumnHead);

		/** Step ancient **/
		GameRegistry.addRecipe(new ItemStack(stepAncientStone, 6), "XXX", 'X', Mho.ancientStone);
		GameRegistry.addRecipe(new ItemStack(stepAncientCobblestone, 6), "XXX", 'X', Mho.ancientCobblestone);
		GameRegistry.addRecipe(new ItemStack(stepAncientStonebrick, 6), "XXX", 'X', Mho.ancientStonebrick);
		GameRegistry.addRecipe(new ItemStack(stepAncientDoubleSlab, 6), "XXX", 'X', Mho.ancientDoubleSlab);
		GameRegistry.addRecipe(new ItemStack(stepAncientColumn, 6), "XXX", 'X', Mho.ancientColumn);
		GameRegistry.addRecipe(new ItemStack(stepAncientColumnHead, 6), "XXX", 'X', Mho.ancientColumnHead);

		/** Step ice **/
		GameRegistry.addRecipe(new ItemStack(stepIce, 6), "XXX", 'X', Block.ice);
		GameRegistry.addRecipe(new ItemStack(stepIceCobblestone, 6), "XXX", 'X', Mho.iceCobblestone);
		GameRegistry.addRecipe(new ItemStack(stepIceStonebrick, 6), "XXX", 'X', Mho.iceStonebrick);
		GameRegistry.addRecipe(new ItemStack(stepIceDoubleSlab, 6), "XXX", 'X', Mho.iceDoubleSlab);
		GameRegistry.addRecipe(new ItemStack(stepIceColumn, 6), "XXX", 'X', Mho.iceColumn);
		GameRegistry.addRecipe(new ItemStack(stepIceColumnHead, 6), "XXX", 'X', Mho.iceColumnHead);

		/** Step marble white **/
		GameRegistry.addRecipe(new ItemStack(stepMarbleWhiteStone, 6), "XXX", 'X', Mho.marbleWhiteStone);
		GameRegistry.addRecipe(new ItemStack(stepMarbleWhiteCobblestone, 6), "XXX", 'X', Mho.marbleWhiteCobblestone);
		GameRegistry.addRecipe(new ItemStack(stepMarbleWhiteStonebrick, 6), "XXX", 'X', Mho.marbleWhiteStonebrick);
		GameRegistry.addRecipe(new ItemStack(stepMarbleWhiteDoubleSlab, 6), "XXX", 'X', Mho.marbleWhiteDoubleSlab);
		GameRegistry.addRecipe(new ItemStack(stepMarbleWhiteColumn, 6), "XXX", 'X', Mho.marbleWhiteColumn);
		GameRegistry.addRecipe(new ItemStack(stepMarbleWhiteColumnHead, 6), "XXX", 'X', Mho.marbleWhiteColumnHead);

		/** Step marble Black**/
		GameRegistry.addRecipe(new ItemStack(stepMarbleBlackStone, 6), "XXX", 'X', Mho.marbleBlackStone);
		GameRegistry.addRecipe(new ItemStack(stepMarbleBlackCobblestone, 6), "XXX", 'X', Mho.marbleBlackCobblestone);
		GameRegistry.addRecipe(new ItemStack(stepMarbleBlackStonebrick, 6), "XXX", 'X', Mho.marbleBlackStonebrick);
		GameRegistry.addRecipe(new ItemStack(stepMarbleBlackDoubleSlab, 6), "XXX", 'X', Mho.marbleBlackDoubleSlab);
		GameRegistry.addRecipe(new ItemStack(stepMarbleBlackColumn, 6), "XXX", 'X', Mho.marbleBlackColumn);
		GameRegistry.addRecipe(new ItemStack(stepMarbleBlackColumnHead, 6), "XXX", 'X', Mho.marbleBlackColumnHead);
		GameRegistry.addRecipe(new ItemStack(stepMarbleCheck, 6), "XXX", 'X', Mho.marbleCheck);

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

		/** Step Metal **/
		GameRegistry.addRecipe(new ItemStack(stepMetal, 6), "XXX", 'X', Mho.metalDoubleSlab);
		
		/** Step Tuiles **/
		GameRegistry.addRecipe(new ItemStack(stepArdoise, 6), "XXX", 'X', Mho.tileArdoise);
		GameRegistry.addRecipe(new ItemStack(stepTileRed, 6), "XXX", 'X', Mho.tileRed);
		GameRegistry.addRecipe(new ItemStack(stepTileBlack, 6), "XXX", 'X', Mho.tileBlack);
		GameRegistry.addRecipe(new ItemStack(stepTileBlue, 6), "XXX", 'X', Mho.tileBlue);
		GameRegistry.addRecipe(new ItemStack(stepTileRedBig, 6), "XXX", 'X', Mho.tileRedBig);
		GameRegistry.addRecipe(new ItemStack(stepTileBlueBig, 6), "XXX", 'X', Mho.tileBlueBig);
		GameRegistry.addRecipe(new ItemStack(stepTileBlackBig, 6), "XXX", 'X', Mho.tileBlackBig);
		GameRegistry.addRecipe(new ItemStack(stepTileBlackAlt, 6), "XXX", 'X', Mho.tileBlackAlt);

		/** Step Lanternes **/
		GameRegistry.addRecipe(new ItemStack(Mho.stepLanternWood, 6), "XXX", 'X', Mho.lanternWood);
		GameRegistry.addRecipe(new ItemStack(Mho.stepLanternIron, 6), "XXX", 'X', Mho.lanternIron);
	}

	public void addRecipeWalls()
	{
		/** Mc new **/
		GameRegistry.addRecipe(new ItemStack (wallSandstone, 6), "XXX", "XXX", 'X', Block.sandStone);
		GameRegistry.addRecipe(new ItemStack (wallPlankOak, 6), "XXX", "XXX", 'X', Block.planks);
		GameRegistry.addRecipe(new ItemStack (wallBrick, 6), "XXX", "XXX", 'X', Block.brick);
		GameRegistry.addRecipe(new ItemStack (wallStonebrick, 6), "XXX", "XXX", 'X', Block.stoneBrick);
		GameRegistry.addRecipe(new ItemStack (wallNetherbrick, 6), "XXX", "XXX", 'X', Block.netherBrick);
		GameRegistry.addRecipe(new ItemStack (wallWoodOak, 6), "XXX", "XXX", 'X', new ItemStack(Block.wood,1,0));
		GameRegistry.addRecipe(new ItemStack (wallWoodSpruce, 6), "XXX", "XXX", 'X', new ItemStack(Block.wood,1,1));
		GameRegistry.addRecipe(new ItemStack (wallWoodBirch, 6), "XXX", "XXX", 'X', new ItemStack(Block.wood,1,2));
		GameRegistry.addRecipe(new ItemStack (wallWoodJungle, 6), "XXX", "XXX", 'X', new ItemStack(Block.wood,1,3));
		
		/** Sets of materials **/
		GameRegistry.addRecipe(new ItemStack (wallWhiteStone, 6), "XXX", "XXX", 'X', Mho.whiteStone);
		GameRegistry.addRecipe(new ItemStack (wallWhiteCobblestone, 6), "XXX", "XXX", 'X', Mho.whiteCobblestone);
		GameRegistry.addRecipe(new ItemStack (wallWhiteStonebrick, 6), "XXX", "XXX", 'X', Mho.whiteStonebrick);

		GameRegistry.addRecipe(new ItemStack (wallMarbleWhiteStone, 6), "XXX", "XXX", 'X', Mho.marbleWhiteStone);
		GameRegistry.addRecipe(new ItemStack (wallMarbleWhiteCobblestone, 6), "XXX", "XXX", 'X', Mho.marbleWhiteCobblestone);
		GameRegistry.addRecipe(new ItemStack (wallMarbleWhiteStonebrick, 6), "XXX", "XXX", 'X', Mho.marbleWhiteStonebrick);

		GameRegistry.addRecipe(new ItemStack (wallMarbleBlackStone, 6), "XXX", "XXX", 'X', Mho.marbleBlackStone);
		GameRegistry.addRecipe(new ItemStack (wallMarbleBlackCobblestone, 6), "XXX", "XXX", 'X', Mho.marbleBlackCobblestone);
		GameRegistry.addRecipe(new ItemStack (wallMarbleBlackStonebrick, 6), "XXX", "XXX", 'X', Mho.marbleBlackStonebrick);

		GameRegistry.addRecipe(new ItemStack (wallAncientStone, 6), "XXX", "XXX", 'X', Mho.ancientStone);
		GameRegistry.addRecipe(new ItemStack (wallAncientCobblestone, 6), "XXX", "XXX", 'X', Mho.ancientCobblestone);
		GameRegistry.addRecipe(new ItemStack (wallAncientStonebrick, 6), "XXX", "XXX", 'X', Mho.ancientStonebrick);

		GameRegistry.addRecipe(new ItemStack (wallWoodenStone, 6), "XXX", "XXX", 'X', Mho.woodenStone);
		GameRegistry.addRecipe(new ItemStack (wallWoodenStonebrick, 6), "XXX", "XXX", 'X', Mho.woodenStonebrick);

		GameRegistry.addRecipe(new ItemStack (wallWoodenLightStone, 6), "XXX", "XXX", 'X', Mho.woodenLightStone);
		GameRegistry.addRecipe(new ItemStack (wallWoodenLightStonebrick, 6), "XXX", "XXX", 'X', Mho.woodenLightStonebrick);

		GameRegistry.addRecipe(new ItemStack (wallIceCobblestone, 6), "XXX", "XXX", 'X', Mho.iceCobblestone);
		GameRegistry.addRecipe(new ItemStack (wallIceStonebrick, 6), "XXX", "XXX", 'X', Mho.iceStonebrick);
	}

	public void addRecipeFences()
	{
		GameRegistry.addRecipe(new ItemStack (fenceWhiteStone, 6), "XXX", "X X", 'X', Mho.whiteStone);
		GameRegistry.addRecipe(new ItemStack (fenceWhiteCobblestone, 6), "XXX", "X X", 'X', Mho.whiteCobblestone);
		GameRegistry.addRecipe(new ItemStack (fenceWhiteStonebrick, 6), "XXX", "X X", 'X', Mho.whiteStonebrick);

		GameRegistry.addRecipe(new ItemStack (fenceMarbleWhiteStone, 6), "XXX", "X X", 'X', Mho.marbleWhiteStone);
		GameRegistry.addRecipe(new ItemStack (fenceMarbleWhiteCobblestone, 6), "XXX", "X X", 'X', Mho.marbleWhiteCobblestone);
		GameRegistry.addRecipe(new ItemStack (fenceMarbleWhiteStonebrick, 6), "XXX", "X X", 'X', Mho.marbleWhiteStonebrick);

		GameRegistry.addRecipe(new ItemStack (fenceMarbleBlackStone, 6), "XXX", "X X", 'X', Mho.marbleBlackStone);
		GameRegistry.addRecipe(new ItemStack (fenceMarbleBlackCobblestone, 6), "XXX", "X X", 'X', Mho.marbleBlackCobblestone);
		GameRegistry.addRecipe(new ItemStack (fenceMarbleBlackStonebrick, 6), "XXX", "X X", 'X', Mho.marbleBlackStonebrick);

		GameRegistry.addRecipe(new ItemStack (fenceAncientStone, 6), "XXX", "X X", 'X', Mho.ancientStone);
		GameRegistry.addRecipe(new ItemStack (fenceAncientCobblestone, 6), "XXX", "X X", 'X', Mho.ancientCobblestone);
		GameRegistry.addRecipe(new ItemStack (fenceAncientStonebrick, 6), "XXX", "X X", 'X', Mho.ancientStonebrick);

		GameRegistry.addRecipe(new ItemStack (fenceWoodenStone, 6), "XXX", "X X", 'X', Mho.woodenStone);
		GameRegistry.addRecipe(new ItemStack (fenceWoodenStonebrick, 6), "XXX", "X X", 'X', Mho.woodenStonebrick);

		GameRegistry.addRecipe(new ItemStack (fenceWoodenLightStone, 6), "XXX", "X X", 'X', Mho.woodenLightStone);
		GameRegistry.addRecipe(new ItemStack (fenceWoodenLightStonebrick, 6), "XXX", "X X", 'X', Mho.woodenLightStonebrick);

		GameRegistry.addRecipe(new ItemStack (fenceIceCobblestone, 6), "XXX", "X X", 'X', Mho.iceCobblestone);
		GameRegistry.addRecipe(new ItemStack (fenceIceStonebrick, 6), "XXX", "X X", 'X', Mho.iceStonebrick);
	}

	public void addRecipeAnvils()
	{
		/** Mc new **/
		GameRegistry.addRecipe(new ItemStack (anvilWoodOak, 4), "XXX", " X ", 'X', new ItemStack(Block.wood,1,0));
		GameRegistry.addRecipe(new ItemStack (anvilPlankOak, 4), "XXX", " X ", 'X', new ItemStack(Block.planks,1,0));
		GameRegistry.addRecipe(new ItemStack (anvilPlankSpruce, 4), "XXX", " X ", 'X', new ItemStack(Block.planks,1,1));
		GameRegistry.addRecipe(new ItemStack (anvilPlankBirch, 4), "XXX", " X ", 'X', new ItemStack(Block.planks,1,2));
		GameRegistry.addRecipe(new ItemStack (anvilPlankJungle, 4), "XXX", " X ", 'X', new ItemStack(Block.planks,1,3));
		
		/** Sets of materials **/
		GameRegistry.addRecipe(new ItemStack (anvilMarbleWhite, 4), "XXX", " X ", 'X', Mho.marbleWhiteStone);
		GameRegistry.addRecipe(new ItemStack (anvilMarbleWhiteStonebrick, 4), "XXX", " X ", 'X', Mho.marbleWhiteStonebrick);

		GameRegistry.addRecipe(new ItemStack (anvilMarbleBlack, 4), "XXX", " X ", 'X', Mho.marbleBlackStone);
		GameRegistry.addRecipe(new ItemStack (anvilMarbleBlackStonebrick, 4), "XXX", " X ", 'X', Mho.marbleBlackStonebrick);

		GameRegistry.addRecipe(new ItemStack (anvilWhiteStone, 4), "XXX", " X ", 'X', Mho.whiteStone);
		GameRegistry.addRecipe(new ItemStack (anvilWhiteStonebrick, 4), "XXX", " X ", 'X', Mho.whiteStonebrick);

		GameRegistry.addRecipe(new ItemStack (anvilAncientStone, 4), "XXX", " X ", 'X', Mho.ancientStone);
		GameRegistry.addRecipe(new ItemStack (anvilAncientStonebrick, 4), "XXX", " X ", 'X', Mho.ancientStonebrick);

		GameRegistry.addRecipe(new ItemStack (anvilSandstoneStonebrick, 4), "XXX", " X ", 'X', Mho.sandstoneStonebrick);

		GameRegistry.addRecipe(new ItemStack (anvilIceStonebrick, 4), "XXX", " X ", 'X', Mho.iceStonebrick);

		GameRegistry.addRecipe(new ItemStack (anvilWoodenStone, 4), "XXX", " X ", 'X', Mho.woodenStone);
		GameRegistry.addRecipe(new ItemStack (anvilWoodenStonebrick, 4), "XXX", " X ", 'X', Mho.woodenStonebrick);

		GameRegistry.addRecipe(new ItemStack (anvilWoodenLightStone, 4), "XXX", " X ", 'X', Mho.woodenLightStone);
		GameRegistry.addRecipe(new ItemStack (anvilWoodenLightStonebrick, 4), "XXX", " X ", 'X', Mho.woodenLightStonebrick);
	}

	public void addRecipeCarpets()
	{
		GameRegistry.addRecipe(new ItemStack (carpetDirt, 3), "XX", 'X', Block.dirt);
		GameRegistry.addRecipe(new ItemStack (carpetGravel, 3), "XX", 'X', Block.gravel);
		//GameRegistry.addRecipe(new ItemStack (carpetStone, 3), "XX", 'X', Block.stone);
		GameRegistry.addRecipe(new ItemStack (carpetStonebrick, 3), "XX", 'X', Block.stoneBrick);
		//GameRegistry.addRecipe(new ItemStack (carpetPlankOak, 3), "XX", 'X', new ItemStack(Block.planks,1,0));
		//GameRegistry.addRecipe(new ItemStack (carpetPlankSpruce, 3), "XX", 'X', new ItemStack(Block.planks,1,1));
		//GameRegistry.addRecipe(new ItemStack (carpetLogOakTop, 3), "XX", 'X', Block.);
		GameRegistry.addRecipe(new ItemStack (carpetLogOak, 3), "XX", 'X', new ItemStack(Block.wood,1,0));
		GameRegistry.addRecipe(new ItemStack (carpetLogSpruce, 3), "XX", 'X', new ItemStack(Block.wood,1,1));
	}
	
	
/** ==========4========== serverStarting ==========4========== **/
	@EventHandler
	public void serverStarting(FMLServerStartingEvent event)
	{
		CommandHandler.initCommands(event);
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