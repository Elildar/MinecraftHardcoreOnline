package mho.core;

import net.minecraft.block.Block;
import net.minecraft.item.EnumArmorMaterial;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.Item;
import net.minecraft.potion.Potion;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.EnumHelper;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class ConfigCore {

	/** ==================== Items ==================== **/

	/** Item Quest **/
	public static int boulonID;
	public static int briqueDeSableID;
	public static int buchetteID;
	public static int buchetteSombreID;
	public static int caisseID;
	public static int liquideBleuID;
	public static int liquideCyanID;
	public static int liquideJauneID;
	public static int liquideOrangeID;
	public static int liquideRoseID;
	public static int liquideRougeID;
	public static int liquideVertID;
	public static int liquideVioletID;
	public static int tuyauID;
	public static int visID;
	public static int couponTutoID;
	public static int bandageID;
	public static int sceptreOrID;
	public static int epeeBlancheID;
	public static int sucreriesID;
	public static int grimoireSethID;
	public static int totemMageID;
	public static int grimoireTelgaradID;
	public static int grimoireTelsalorID;
	public static int recommandationHakathID;
	public static int recommandationLomakothID;
	public static int pistoletID;
	public static int jambeBoisID;
	public static int medaillonID;
	public static int longuevueID;
	public static int clePrisonValysID;
	public static int boursePetiteID;
	public static int bourseMoyenneID;
	public static int bourseGrandeID;
	public static int grimoireApprentiID;
	public static int vanishID;
	public static int enveloppeID;
	public static int batonAdaoldanID;
	public static int batonAdaoldanEnchantID;
	public static int fragmentAdaoldanID;
	public static int projectileArcaniqueID;
	public static int marteauForgeronID;
	public static int lameRuniqueEmeraudeID;
	public static int nezarilJarID;
	public static int nezarilJarFullID;
	public static int redDragonEggID;

	/** Item gris **/
	public static int batWingID;
	public static int bigcatHairID;
	public static int boarHornID;
	public static int bugWingID;
	public static int cricketLegID;
	public static int deerWoodID;
   	public static int duckLegID;
   	public static int ectoplasmID;
   	public static int elephantSkinID;
   	public static int enderJawID;
   	public static int enderParticlesID;
   	public static int foxTailID;
   	public static int ghastTentacleID;
   	public static int goatHornID;
	public static int heartID;
   	public static int honeyPotID;
   	public static int horseHairID;
   	public static int jellyJamID;
   	public static int mouseMustacheID;
   	public static int ostrichFeatherID;
   	public static int pigLegID;
   	public static int rabbitFootID;
   	public static int redFabricID;
   	public static int reptileToothID;
   	public static int scorpionStingID;
   	public static int sharkFinID;
   	public static int skinCreeperID;
   	public static int smallFlameID;
   	public static int snailShellID;
   	public static int snakeTongueID;
   	public static int spiderLegsID;
   	public static int spiderVenomID;
   	public static int turtleShellID;
   	public static int whiteClothID;
	public static int zombieBrainID;
	public static int zombieArmID;

	/** Poupee **/
	public static int dollBlueID;
	public static int dollBlackID;
	public static int pelucheMisterxfrID;
	public static int pelucheJolirougeID;
	public static int pelucheIplayID;
	public static int pelucheMikefraiseID;
	public static int pelucheDeezID;
	public static int pelucheNicodelpraID;
	public static int pelucheDilandaufrID;
	public static int pelucheNissanID;
	public static int pelucheBbphokID;
	public static int pelucheBenditoID;
	public static int pelucheSoenguyID;
	public static int pelucheChtimarchosID;
	public static int pelucheXdakotaID;
	public static int pelucheLoupfeucgID;
	public static int pelucheTedrakID;
	
	/** Enchant **/
	public static int enchantSharpnessSmallID;
	public static int enchantSharpnessMediumID;
	public static int enchantSharpnessBigID;
	
	public static int enchantSmiteSmallID;
	public static int enchantSmiteMediumID;
	public static int enchantSmiteBigID;
	
	public static int enchantProtectionSmallID;
	public static int enchantProtectionBigID;
	
	public static int enchantBaneofSmallID;
	public static int enchantBaneofMediumID;
	public static int enchantBaneofBigID;
	
	public static int enchantEfficacitySmallID;
	public static int enchantEfficacityMediumID;
	public static int enchantEfficacityBigID;
	
	public static int enchantDurabilitySmallID;
	public static int enchantDurabilityMediumID;
	public static int enchantDurabilityBigID;
	
	public static int enchantFlameSmallID;
	public static int enchantFlameBigID;
	
	public static int enchantKnockbackSmallID;
	public static int enchantKnockbackBigID;
		
	/** Insignes **/
	public static int badgeValysID;
	public static int badgeChasseID;
	public static int badgeGuerreID;
	public static int badgeAgricultureID;
	public static int badgeGastronomieID;
	public static int badgeMinageID;
	public static int badgeArtisanatID;
	public static int badgeVilleID;
	public static int badgePecheID;
	public static int badgeExplorationID;
	public static int badgeConstructionID;
	public static int badgeGuildeID;
	public static int badgeVictoireID;
	public static int badgeParticipationID;
	public static int badgeMagieID;
	
	/** Food **/
	public static int mugID;
	public static int beerID;
	public static int foodHamburgerID;
	public static int foodFriesID;
	public static int foodKfcID;
	public static int foodEggID;
	public static int foodBaconID;
	public static int foodCheeseID;
	public static int foodMakiID;
	public static int foodSushiID;
	public static int foodSkewerID;
	public static int rhumID;

	/** ProjectileNPC **/
	public static int npcProjectileWhiteID;
	public static int npcProjectileYellowID;
	public static int npcProjectileGreenID;
	public static int npcProjectilePurpleID;
	public static int npcProjectileRedID;
	public static int npcProjectileGreyID;
	public static int npcProjectileBlueID;

	/** Legendary **/
	public static int legendaryNocturnalID;
	public static int legendaryDiurnalID;
	
	/** Sword **/
	public static int stoveID;
	public static int scepterRedID;
	public static int scepterBlueID;
	public static int scepterGreenID;
	public static int hammerWoodID;
	public static int hammerStoneID;
	public static int hammerIronID;
	public static int rapierID;
	public static int runebladeID;
	
	/** Potions **/
	public static int potionCelerityID;
	public static int potionFatigueID;
	public static int potionJumpID;
	public static int potionConfusionID;
	public static int potionResistanceID;
	public static int potionApneaID;
	public static int potionBlindnessID;
	public static int potionHungerID;
	public static int potionWitherID;

	public static int potionCustomEffectWaterWalkID;
	public static int potionCustomEffectLavaWalkID;
	public static int potionCustomEffectNoFallID;

	public static int testSplashID;
	
	/** Scroll **/
	public static int minorValysScrollID;
	public static int mediumValysScrollID;
	public static int majorValysScrollID;

	/** Key **/
	public static int goldKeyID;
	public static int silverKeyID;
	public static int bronzeKeyID;
	public static int neptuniumSmallKeyID;
	public static int goldSmallKeyID;
	public static int silverSmallKeyID;
	public static int bronzeSmallKeyID;

	/** Coin **/
	public static int bronzeCoinID;
	public static int silverCoinID;
	public static int goldCoinID;
	public static int diamondCoinID;

	/** Trophee **/
	public static int trophyGoldID;
	public static int trophySilverID;
	public static int trophyBronzeID;
	public static int trophyGoldChipID;

	/** Specials **/
	public static int eyeCoverID;
	public static int pocketCraftingTableID;
	public static int magicPowderID;
	public static int teddyBearID;

	/** Classics **/
	public static int diamondShineID;
	public static int cardsID;
	public static int mysteriousDustID;

	
	/** ==================== Blocks ==================== **/
	
	/** Sets Of Material **/
	public static int stoneID;
	public static int whiteStoneID;
	public static int sandstoneID;
	public static int ancientStoneID;
	public static int iceID;
	public static int marbleWhiteID;
	public static int marbleBlackID;
	public static int woodenDarkID;
	public static int woodenLightID;
	public static int metalID;
	public static int basaltID;

	public static int cobblestoneRank = 1;
	public static int stonebrickRank = 2;
	public static int stonebrickRoundRank = 3;
	public static int doubleSlabRank = 4;
	public static int columnRank = 5;
	public static int columnHeadRank = 6;
	public static int checkRank = 7;
	public static int stairStoneRank = 8;
	public static int stairCobblestoneRank = 9;
	public static int stairStonebrickRank = 10;
	public static int stairCheckRank = 11;
	public static int stepStoneRank = 12;
	public static int stepCobblestoneRank = 13;
	public static int stepStonebrickRank = 14;
	public static int stepDoubleSlabRank = 15;
	public static int stepColumnRank = 16;
	public static int stepColumnHeadRank = 17;
	public static int stepCheckRank = 18;
	public static int wallStoneRank = 19;
	public static int wallCobblestoneRank = 20;
	public static int wallStonebrickRank = 21;
	public static int fenceStoneRank = 22;
	public static int fenceCobblestoneRank = 23;
	public static int fenceStonebrickRank = 24;
	public static int anvilStoneRank = 25;
	public static int anvilStonebrickRank = 26;
	
	/** Sets Of Natural Blocks **/
	public static int naturalIceID;
	public static int naturalDarkID;
	public static int naturalMysteriousID;
	public static int naturalRedRockID;
	public static int naturalRocksID;

	/* Ice */
	public static int iceLogID;
	public static int iceLeavesLightID;
	public static int iceLeavesID;
	public static int icePlankID;
	
	/* Dark */
	public static int darkStoneID;
	public static int darkCobblestoneID;
	public static int darkDirtID;
	public static int darkGrassID;
	public static int darkLogID;
	public static int darkLeavesID;
	
	/* Mysterious */
	public static int mysteriousStoneID;
	public static int mysteriousDirtID;
	public static int mysteriousGrassBlockID;
	public static int mysteriousLogID;
	public static int mysteriousLeavesID;
	public static int mysteriousLeavesPurpleID;
	
	public static int mysteriousFlowerID;
	public static int mysteriousPlantPurpleID;
	public static int mysteriousCoralID;
	public static int mysteriousAlgueID;
	public static int mysteriousPlantID;
	public static int mysteriousReedID;
	public static int mysteriousGrassID;
	
	/* Red Rock */
	public static int redGrassBlockID;
	public static int redGravelID;
	public static int redRockLinesID;
	public static int redRockBigLineID;
	public static int redSilverID;

	/* Rocks */
	public static int greyRockID;
	public static int greyRockGrassID;
	public static int brownRockID;
	public static int brownRockGrassID;
	public static int darkRockID;
	public static int darkRockGrassID;
	public static int blackRockID;
	public static int lavaRockID;
	public static int lavaRockRedID;

	/** Colombages **/
	public static int timberedLightID;
	public static int timberedDarkID;
	
	public static int timberedSquareID;
	public static int timberedCrossID;
	public static int timberedVerticalID;
	public static int timberedHorizontalID;
	public static int timberedLeftID;
	public static int timberedRightID;

	public static int timberedSquareDarkID;
	public static int timberedCrossDarkID;
	public static int timberedVerticalDarkID;
	public static int timberedHorizontalDarkID;
	public static int timberedLeftDarkID;
	public static int timberedRightDarkID;

	/** Signs **/
	public static int signsID;
	
	public static int signAlchemyID;
	public static int signBankID;
	public static int signForgeID;
	public static int signShieldID;
	public static int signSanctuaryID;
	public static int signArmoryID;
	public static int signLibraryID;
	public static int signRestaurantID;
	public static int signTavernID;
	public static int signMaterialsID;
	public static int signHostelID;
	public static int signStableID;
	public static int signDiamondID;
	public static int signPhoID;
	public static int signCrystalID;
	
	/** Corals **/
	public static int coralOrangeID;
	public static int coralGreenID;
	public static int coralPurpleID;
	public static int coralRoseID;
	public static int coralBlackID;
	public static int coralBlueID;
	
	public static int coralBlockReefID;
	public static int coralBlockSpongeID;

	/** Double Blocks **/
	public static int doubleCrateBlockID;
	public static int doubleCrateItemBlockID;
	
	public static int doubleTorchLowerID;
	public static int doubleTorchUpperID;
	public static int doubleCandleLowerID;
	public static int doubleCandleUpperID;
	public static int doubleLanternLowerID;
	public static int doubleLanternUpperID;

	public static int normalDoubleGrassUpperID;
	public static int normalDoubleGrassLowerID;
	public static int savanaDoubleGrassUpperID;
	public static int savanaDoubleGrassLowerID;
	public static int mysteriousDoubleGrassLowerID;
	public static int mysteriousDoubleGrassUpperID;
	
	/** Meta **/
	public static int metaWoolLightID;
	public static int metaVitrailID;
	public static int metaVitrailPaneID;
	
	/** Lumineux **/
	public static int lanternWoodID;
	public static int lanternIronID;

	public static int lampionBlancID;
	public static int lampionBleuID;
	public static int lampionJauneID;
	public static int lampionVertID;
	public static int lampionRougeID;

	public static int lightCandleID;
	public static int lightLanternID;
	public static int lightSkullCandleID;
	public static int lightSkullSpikeID;

	/** Classic Blocks **/
	public static int crossCrateID;
	public static int barredCrateID;
	public static int leatherBlockID;
	public static int PHOnoirID;
	public static int PHOblancID;
	public static int silverBlockID;
	public static int obsidianBlockID;
	public static int shojiID;
	public static int cristalBlockID;

	public static int tileID;
	
	public static int tileArdoiseID;
	public static int tileRedID;
	public static int tileBlackID;
	public static int tileBlueID;
	public static int tileRedBigID;
	public static int tileBlackBigID;
	public static int tileBlueBigID;
	public static int tileBlackAltID;

	/** Special Blocks **/
	public static int meatBlockID;
	public static int fossileBlockID;

	public static int simpleDirtBlockID;
	public static int completeLogOakID;
	public static int completeLogSpruceID;

	public static int vaillantCrateID;

	public static int ironWindowID;
	public static int metalGridID;

	public static int woeBlockID;

	public static int lavaBlockID;
	public static int waterBlockID;
	public static int logCherryID;
	public static int logRedID;
	public static int barrelID;

	public static int ironWindowPaneID;

	public static int grisouBlockID;
	public static int slimeBlockID;
	public static int invisibleBlockID;
	public static int portalPurpleID;
	public static int bookBlockID;
	public static int chainIronID;
	public static int chainRopeID;
	public static int ropeRailID;
	public static int spikesID;
	public static int climbingLadderID;
	public static int roseVinesID;
	public static int cristalLittleID;
	public static int cristalBigID;
	public static int cakeLieBlockID;
	public static int meatCakeBlockID;
	public static int eternalIceBlockID;

	/** Secret **/ 
    public static int secretDoorWoodBlockID;
    public static int secretDoorIronBlockID;
    public static int secretTrapDoorBlockID;
    
    public static int secretDoorWoodItemBlockID;
    public static int secretDoorIronItemBlockID;
    
	/** Stairs **/
    public static int setStone;
    public static int setGrass;
    public static int setDirt;
    public static int setGravel;
    public static int setSand;
    public static int setSandstone;
    public static int setWoodOak;
    public static int setWoodSpruce;
    public static int setWoodBirch;
    public static int setWoodJungle;
    public static int setPlanksOak;
    public static int setPlanksSpruce;
    public static int setPlanksBirch;
    public static int setPlanksJungle;
    public static int setMossyCobble;
    public static int setStonebrick;
    public static int setStonebrickMossy;
    public static int setStonebrickCracked;
    public static int setBrick;
    public static int setObsidian;
    public static int setIce;
    public static int setSnow;
    public static int setEnderstone;
    public static int setNetherbrick;
    public static int setStraw;
	
	public static int stairStoneID;
	public static int stairGrassID;
	public static int stairDirtID;
	public static int stairGravelID;
	public static int stairMossyCobbleID;
	public static int stairObsidianID;
	public static int stairIceID;
	public static int stairSnowID;
	public static int stairStonebrickMossyID;
	public static int stairStonebrickCrackedID;
	public static int stairSandID;
	public static int stairEnderstoneID;
	public static int stairStrawID;

	public static int stairWoolID;
	
	public static int stairWoolWhiteID;
	public static int stairWoolOrangeID;
	public static int stairWoolMagentaID;
	public static int stairWoolLightBlueID;
	public static int stairWoolYellowID;
	public static int stairWoolLightGreenID;
	public static int stairWoolPinkID;
	public static int stairWoolGrayID;
	public static int stairWoolLightGrayID;
	public static int stairWoolCyanID;
	public static int stairWoolPurpleID;
	public static int stairWoolBlueID;
	public static int stairWoolBrownID;
	public static int stairWoolGreenID;
	public static int stairWoolRedID;
	public static int stairWoolBlackID;

	public static int stairWoolLightID;
	
	public static int stairWoolWhiteLightID;
	public static int stairWoolOrangeLightID;
	public static int stairWoolMagentaLightID;
	public static int stairWoolLightBlueLightID;
	public static int stairWoolYellowLightID;
	public static int stairWoolLightGreenLightID;
	public static int stairWoolPinkLightID;
	public static int stairWoolGrayLightID;
	public static int stairWoolLightGrayLightID;
	public static int stairWoolCyanLightID;
	public static int stairWoolPurpleLightID;
	public static int stairWoolBlueLightID;
	public static int stairWoolBrownLightID;
	public static int stairWoolGreenLightID;
	public static int stairWoolRedLightID;
	public static int stairWoolBlackLightID;

	public static int stairTileID;
	
	public static int stairArdoiseID;
	public static int stairTileRedID;
	public static int stairTileBlackID;
	public static int stairTileBlueID;
	public static int stairTileRedBigID;
	public static int stairTileBlackBigID;
	public static int stairTileBlueBigID;
	public static int stairTileBlackAltID;
	
	/** Steps **/
	public static int stepGrassID;
	public static int stepDirtID;
	public static int stepGravelID;
	public static int stepWoodOakID;
	public static int stepWoodSpruceID;
	public static int stepWoodBirchID;
	public static int stepWoodJungleID;
	public static int stepCobbleMossyID;
	public static int stepObsidianID;
	public static int stepIceID;
	public static int stepSnowID;
	public static int stepStonebrickMossyID;
	public static int stepStonebrickCrackedID;
	public static int stepEndstoneID;
	public static int stepSandID;
	public static int stepStrawID;

	public static int stepWoolWhiteID;
	public static int stepWoolOrangeID;
	public static int stepWoolMagentaID;
	public static int stepWoolLightBlueID;
	public static int stepWoolYellowID;
	public static int stepWoolLightGreenID;
	public static int stepWoolPinkID;
	public static int stepWoolGrayID;
	public static int stepWoolLightGrayID;
	public static int stepWoolCyanID;
	public static int stepWoolPurpleID;
	public static int stepWoolBlueID;
	public static int stepWoolBrownID;
	public static int stepWoolGreenID;
	public static int stepWoolRedID;
	public static int stepWoolBlackID;

	public static int stepWoolWhiteLightID;
	public static int stepWoolOrangeLightID;
	public static int stepWoolMagentaLightID;
	public static int stepWoolLightBlueLightID;
	public static int stepWoolYellowLightID;
	public static int stepWoolLightGreenLightID;
	public static int stepWoolPinkLightID;
	public static int stepWoolGrayLightID;
	public static int stepWoolLightGrayLightID;
	public static int stepWoolCyanLightID;
	public static int stepWoolPurpleLightID;
	public static int stepWoolBlueLightID;
	public static int stepWoolBrownLightID;
	public static int stepWoolGreenLightID;
	public static int stepWoolRedLightID;
	public static int stepWoolBlackLightID;

	public static int stepArdoiseID;
	public static int stepTileRedID;
	public static int stepTileBlueID;
	public static int stepTileBlackID;
	public static int stepTileRedBigID;
	public static int stepTileBlueBigID;
	public static int stepTileBlackBigID;
	public static int stepTileBlackAltID;

	public static int stepLanternWoodID;
	public static int stepLanternIronID;
	
	/** Walls **/
	public static int wallSandstoneID;
	public static int wallPlankOakID;
	public static int wallBrickID;
	public static int wallStonebrickID;
	public static int wallNetherbrickID;
	public static int wallWoodOakID;
	public static int wallWoodSpruceID;
	public static int wallWoodBirchID;
	public static int wallWoodJungleID;

	/** Fence **/
	
	/** Balustrades **/
	public static int anvilWoodOakID;
	public static int anvilPlankJungleID;
	public static int anvilPlankOakID;
	public static int anvilPlankBirchID;
	public static int anvilPlankSpruceID;

	/** Carpet **/
	public static int carpetDirtID;
	public static int carpetGravelID;
	public static int carpetStoneID;
	public static int carpetStonebrickID;
	public static int carpetLogOakTopID;
	public static int carpetPlankOakID;
	public static int carpetPlankSpruceID;
	public static int carpetLogOakID;
	public static int carpetLogSpruceID;

	/** Unused **/
	public static int seedHoublonID;
	public static int houblonID;
	public static int cropHoublonID;
	public static int rotatorID;
	public static int cannepecheID;
	public static int liquideVertFlowingID;
	public static int liquideVertStillID;
	public static int liquideVioletFlowingID;
	public static int liquideVioletStillID;
	public static int offFrigoID;
	public static int onFrigoID;
	public static int bannerID;

	
	public static void loadConfig(FMLPreInitializationEvent e){
		Configuration config = new Configuration(e.getSuggestedConfigurationFile()); //Gets the file
		config.load(); //Loads it

		/** ==================== Items ==================== **/

		/** Item Quest **/
		boulonID = config.get("Item IDs - 1 : Quete", "Boulon", 27300).getInt();
		briqueDeSableID = config.get("Item IDs - 1 : Quete", "Brique de sable", 27301).getInt();
		buchetteID = config.get("Item IDs - 1 : Quete", "Buchette", 27302).getInt();
		buchetteSombreID = config.get("Item IDs - 1 : Quete", "Buchette sombre", 27303).getInt();
		caisseID = config.get("Item IDs - 1 : Quete", "Caisse", 27304).getInt();
		liquideBleuID = config.get("Item IDs - 1 : Quete", "Liquide bleu", 27305).getInt();
		liquideCyanID = config.get("Item IDs - 1 : Quete", "Liquide cyan", 27306).getInt();
		liquideJauneID = config.get("Item IDs - 1 : Quete", "Liquide jaune", 27307).getInt();
		liquideOrangeID = config.get("Item IDs - 1 : Quete", "Liquide orange", 27308).getInt();
		liquideRoseID = config.get("Item IDs - 1 : Quete", "Liquide rose", 27309).getInt();
		liquideRougeID = config.get("Item IDs - 1 : Quete", "Liquide rouge", 27310).getInt();
		liquideVertID = config.get("Item IDs - 1 : Quete", "Liquide vert", 27311).getInt();
		liquideVioletID = config.get("Item IDs - 1 : Quete", "Liquide violet", 27312).getInt();
		tuyauID = config.get("Item IDs - 1 : Quete", "Tuyau", 27313).getInt();
		visID = config.get("Item IDs - 1 : Quete", "Vis", 27314).getInt();
		couponTutoID = config.get("Item IDs - 1 : Quete", "Coupon tutoriel", 27315).getInt();
		bandageID = config.get("Item IDs - 1 : Quete", "Bandage", 27316).getInt();
		sceptreOrID = config.get("Item IDs - 1 : Quete", "Sceptre d'or", 27317).getInt();
		epeeBlancheID = config.get("Item IDs - 1 : Quete", "Relique", 27318).getInt();
		sucreriesID = config.get("Item IDs - 1 : Quete", "Sucreries", 27319).getInt();
		grimoireSethID = config.get("Item IDs - 1 : Quete", "Grimoire de Seth", 27320).getInt();
		totemMageID = config.get("Item IDs - 1 : Quete", "Totem de Mage", 27321).getInt();
		grimoireTelgaradID = config.get("Item IDs - 1 : Quete", "Grimoire de Tel'garad", 27322).getInt();
		grimoireTelsalorID = config.get("Item IDs - 1 : Quete", "Grimoire de Tel'salor", 27323).getInt();
		recommandationHakathID = config.get("Item IDs - 1 : Quete", "Recommandation d'Hakath", 27324).getInt();
		recommandationLomakothID = config.get("Item IDs - 1 : Quete", "Recommandation de Lomakoth", 27325).getInt();
		pistoletID = config.get("Item IDs - 1 : Quete", "Pistolet", 27326).getInt();
		jambeBoisID = config.get("Item IDs - 1 : Quete", "Jambe de bois", 27327).getInt();
		medaillonID = config.get("Item IDs - 1 : Quete", "Medaillon de pirate", 27328).getInt();
		longuevueID = config.get("Item IDs - 1 : Quete", "Longue-vue", 27329).getInt();
		clePrisonValysID = config.get("Item IDs - 1 : Quete", "Clef de la prison de Valys", 27330).getInt();
		boursePetiteID = config.get("Item IDs - 1 : Quete", "Petite bourse de Hardcoin", 27331).getInt();
		bourseMoyenneID = config.get("Item IDs - 1 : Quete", "Moyenne bourse de Hardcoin", 27332).getInt();
		bourseGrandeID = config.get("Item IDs - 1 : Quete", "Grande bourse de Hardcoin", 27333).getInt();
		grimoireApprentiID = config.get("Item IDs - 1 : Quete", "Grimoire de l'apprenti", 27334).getInt();
		vanishID = config.get("Item IDs - 1 : Quete", "Vanish", 27335).getInt();
		enveloppeID = config.get("Item IDs - 1 : Quete", "Enveloppe", 27336).getInt();
		batonAdaoldanID = config.get("Item IDs - 1 : Quete", "Baton d'Adaoldan", 27337).getInt();
		batonAdaoldanEnchantID = config.get("Item IDs - 1 : Quete", "Baton d'Adaoldan enchante", 27338).getInt();
		fragmentAdaoldanID = config.get("Item IDs - 1 : Quete", "Fragment du baton d'Adaoldan", 27339).getInt();
		projectileArcaniqueID = config.get("Item IDs - 1 : Quete", "Projectile arcanique", 27340).getInt();
		marteauForgeronID = config.get("Item IDs - 1 : Quete", "Marteau du forgeron", 27341).getInt();
		lameRuniqueEmeraudeID = config.get("Item IDs - 1 : Quete", "Lame Runique en Emeraude", 27342).getInt();
		nezarilJarID = config.get("Item IDs - 1 : Quete", "Urne de Nezaril (vide)", 30250).getInt();
		nezarilJarFullID = config.get("Item IDs - 1 : Quete", "Urne de Nezaril (pleine)", 30251).getInt();
		redDragonEggID = config.get("Item IDs - 1 : Quete", "Oeuf de dragon rouge", 30252).getInt();
		
		/** Item gris **/
		batWingID = config.get("Item IDs - 2 : Gris", "Ailes de chauve-souris", 30267).getInt();
		bigcatHairID = config.get("Item IDs - 2 : Gris", "Criniere feline", 30277).getInt();
		boarHornID = config.get("Item IDs - 2 : Gris", "Defense de sanglier", 30274).getInt();
		bugWingID = config.get("Item IDs - 2 : Gris", "Aile d'insecte", 30289).getInt();
		cricketLegID = config.get("Item IDs - 2 : Gris", "Patte de criquet", 30290).getInt();
		deerWoodID = config.get("Item IDs - 2 : Gris", "Bois de cerf", 30278).getInt();
	   	duckLegID = config.get("Item IDs - 2 : Gris", "Patte de canard", 30276).getInt();
	   	ectoplasmID = config.get("Item IDs - 2 : Gris", "Ectoplasme", 30280).getInt();
	   	elephantSkinID = config.get("Item IDs - 2 : Gris", "Peau d'elephant", 30295).getInt();
	   	enderJawID = config.get("Item IDs - 2 : Gris", "Machoire d'enderman",30263).getInt();
	   	enderParticlesID = config.get("Item IDs - 2 : Gris", "Particule d'enderman", 30264).getInt();
	   	foxTailID = config.get("Item IDs - 2 : Gris", "Queue de renard", 30282).getInt();
	   	ghastTentacleID = config.get("Item IDs - 2 : Gris", "Tentacule de ghast", 30262).getInt();
	   	goatHornID = config.get("Item IDs - 2 : Gris", "Corne de chevre", 30287).getInt();
		heartID = config.get("Item IDs - 2 : Gris", "Coeur", 30000).getInt();
	   	honeyPotID = config.get("Item IDs - 2 : Gris", "Pot de miel", 30275).getInt();
	   	horseHairID = config.get("Item IDs - 2 : Gris", "Crin de cheval", 30273).getInt();
	   	jellyJamID = config.get("Item IDs - 2 : Gris", "Confiture de meduse", 30286).getInt();
	   	mouseMustacheID = config.get("Item IDs - 2 : Gris", "Moustache de souris",30271).getInt();
	   	ostrichFeatherID = config.get("Item IDs - 2 : Gris", "Plume d'autruche", 31741).getInt();
	   	pigLegID = config.get("Item IDs - 2 : Gris", "Pied de porc",30294).getInt();
	   	rabbitFootID = config.get("Item IDs - 2 : Gris", "Patte de lapin", 30268).getInt();
	   	redFabricID = config.get("Item IDs - 2 : Gris", "Bout de tissu rouge",30279).getInt();
	   	reptileToothID = config.get("Item IDs - 2 : Gris", "Dent de reptile", 30285).getInt();
	   	scorpionStingID = config.get("Item IDs - 2 : Gris", "Dard de scorpion", 30284).getInt();
	   	sharkFinID = config.get("Item IDs - 2 : Gris", "Nageoire de requin",30283).getInt();
	   	skinCreeperID = config.get("Item IDs - 2 : Gris", "Lambeau de creeper", 30260).getInt();
	   	smallFlameID = config.get("Item IDs - 2 : Gris", "Flammeche",30266).getInt();
	   	snailShellID = config.get("Item IDs - 2 : Gris", "Coquille d'escargot", 30291).getInt();
	   	snakeTongueID = config.get("Item IDs - 2 : Gris", "Langue de vipere",30269).getInt();
	   	spiderLegsID = config.get("Item IDs - 2 : Gris", "Pattes d'araignee",30261).getInt();
	   	spiderVenomID = config.get("Item IDs - 2 : Gris", "Glande a venin", 30265).getInt();
	   	turtleShellID = config.get("Item IDs - 2 : Gris", "Carapace de tortue",30270).getInt();
	   	whiteClothID = config.get("Item IDs - 2 : Gris", "Drap blanc",30281).getInt();
		zombieArmID = config.get("Item IDs - 2 : Gris", "Bras de zombie", 30002).getInt();
		zombieBrainID = config.get("Item IDs - 2 : Gris", "Cerveau de zombie", 30001).getInt();
		
		/** Poupee **/
		dollBlueID = config.get("Item IDs - 3 : Peluches", "Poupee bleu", 30181).getInt();
		dollBlackID = config.get("Item IDs - 3 : Peluches", "Poupee noire", 30182).getInt();
		pelucheMisterxfrID = config.get("Item IDs - 3 : Peluches", "Peluche MisterXFr", 30183).getInt();
		pelucheJolirougeID = config.get("Item IDs - 3 : Peluches", "Peluche Jolirouge", 30184).getInt();
		pelucheIplayID = config.get("Item IDs - 3 : Peluches", "Peluche Iplay4You", 30185).getInt();
		pelucheMikefraiseID = config.get("Item IDs - 3 : Peluches", "Peluche Mikefraise", 30186).getInt();
		pelucheDeezID = config.get("Item IDs - 3 : Peluches", "Peluche Deez", 30187).getInt();
		pelucheNicodelpraID = config.get("Item IDs - 3 : Peluches", "Peluche Nicodelpra", 30188).getInt();
		pelucheDilandaufrID = config.get("Item IDs - 3 : Peluches", "Peluche DilandauFr", 30189).getInt();
		pelucheNissanID = config.get("Item IDs - 3 : Peluches", "Peluche Nissan8", 30190).getInt();
		pelucheBbphokID = config.get("Item IDs - 3 : Peluches", "Peluche BBphok", 30191).getInt();
		pelucheBenditoID = config.get("Item IDs - 3 : Peluches", "Peluche Bendito78", 30192).getInt();
		pelucheSoenguyID = config.get("Item IDs - 3 : Peluches", "Peluche SoEnguy", 30193).getInt();
		pelucheChtimarchosID = config.get("Item IDs - 3 : Peluches", "Peluche Chtimarchos", 30194).getInt();
		pelucheXdakotaID = config.get("Item IDs - 3 : Peluches", "Peluche xDakota", 30195).getInt();
		pelucheLoupfeucgID = config.get("Item IDs - 3 : Peluches", "Peluche Loupfeucg", 30196).getInt();
		pelucheTedrakID = config.get("Item IDs - 3 : Peluches", "Peluche Tedrak50", 30197).getInt();

		/** Enchant **/
		enchantSharpnessSmallID = config.get("Item IDs - 4 : Runes", "Rune de puissance mineure",10259).getInt();
		enchantSharpnessMediumID = config.get("Item IDs - 4 : Runes", "Rune de puissance",10260).getInt();
		enchantSharpnessBigID = config.get("Item IDs - 4 : Runes", "Rune de puissance majeure",10261).getInt();
		
		enchantSmiteSmallID = config.get("Item IDs - 4 : Runes", "Rune de chatiment mineure",10268).getInt();
		enchantSmiteMediumID = config.get("Item IDs - 4 : Runes", "Rune de chatiment",10269).getInt();
		enchantSmiteBigID = config.get("Item IDs - 4 : Runes", "Rune de chatiment majeure",10270).getInt();
		
		enchantProtectionSmallID = config.get("Item IDs - 4 : Runes", "Rune de protection mineure",10277).getInt();
		enchantProtectionBigID = config.get("Item IDs - 4 : Runes", "Rune de protection majeure",10278).getInt();
		
		enchantBaneofSmallID = config.get("Item IDs - 4 : Runes", "Rune du fleau mineure",10283).getInt();
		enchantBaneofMediumID = config.get("Item IDs - 4 : Runes", "Rune du fleau",10284).getInt();
		enchantBaneofBigID = config.get("Item IDs - 4 : Runes", "Rune du fleau majeure",10285).getInt();
		
		enchantEfficacitySmallID = config.get("Item IDs - 4 : Runes", "Rune de rapidite mineure",10292).getInt();
		enchantEfficacityMediumID = config.get("Item IDs - 4 : Runes", "Rune de rapidite",10293).getInt();
		enchantEfficacityBigID = config.get("Item IDs - 4 : Runes", "Rune de rapidite majeure",10294).getInt();
		
		enchantDurabilitySmallID = config.get("Item IDs - 4 : Runes", "Rune de solidite mineure",10301).getInt();
		enchantDurabilityMediumID = config.get("Item IDs - 4 : Runes", "Rune de solidite",10302).getInt();
		enchantDurabilityBigID = config.get("Item IDs - 4 : Runes", "Rune de solidite majeure",10303).getInt();
		
		enchantFlameSmallID = config.get("Item IDs - 4 : Runes", "Rune d'embrasement mineure",10310).getInt();
		enchantFlameBigID = config.get("Item IDs - 4 : Runes", "Rune d'embrasement majeure",10311).getInt();
		
		enchantKnockbackSmallID = config.get("Item IDs - 4 : Runes", "Rune de repulsion mineure",10316).getInt();
		enchantKnockbackBigID = config.get("Item IDs - 4 : Runes", "Rune de repulsion majeure",10317).getInt();
			
		/** Insignes **/
		badgeValysID = config.get("Item IDs - 5 : Insignes", "Insigne de Valys", 30130).getInt();
		badgeChasseID = config.get("Item IDs - 5 : Insignes", "Insigne de chasse", 30131).getInt();
		badgeGuerreID = config.get("Item IDs - 5 : Insignes", "Insigne de guerre", 30132).getInt();
		badgeAgricultureID = config.get("Item IDs - 5 : Insignes", "Insigne d'agriculture", 30133).getInt();
		badgeGastronomieID = config.get("Item IDs - 5 : Insignes", "Insigne de gastronomie", 30134).getInt();
		badgeMinageID = config.get("Item IDs - 5 : Insignes", "Insigne de minage", 30135).getInt();
		badgeArtisanatID = config.get("Item IDs - 5 : Insignes", "Insigne d'artisanat", 30136).getInt();
		badgeVilleID = config.get("Item IDs - 5 : Insignes", "Insigne de ville", 30137).getInt();
		badgePecheID = config.get("Item IDs - 5 : Insignes", "Insigne de peche", 30138).getInt();
		badgeExplorationID = config.get("Item IDs - 5 : Insignes", "Insigne d'exploration", 30139).getInt();
		badgeConstructionID = config.get("Item IDs - 5 : Insignes", "Insigne de construction", 30140).getInt();
		badgeGuildeID = config.get("Item IDs - 5 : Insignes", "Insigne de guilde", 30141).getInt();
		badgeVictoireID = config.get("Item IDs - 5 : Insignes", "Insigne de victoire", 30142).getInt();
		badgeParticipationID = config.get("Item IDs - 5 : Insignes", "Insigne de participation", 30143).getInt();
		badgeMagieID = config.get("Item IDs - 5 : Insignes", "Insigne de magie", 30144).getInt();

		
		/** Food **/
		mugID = config.get("Item IDs - 6 : Nourriture", "Chope vide", 1663).getInt();
		beerID = config.get("Item IDs - 6 : Nourriture", "Chope de biere", 1664).getInt();
		foodHamburgerID = config.get("Item IDs - 6 : Nourriture", "Hamburger", 30200).getInt();
		foodFriesID = config.get("Item IDs - 6 : Nourriture", "Frites", 30201).getInt();
		foodKfcID = config.get("Item IDs - 6 : Nourriture", "Nuggets", 30202).getInt();
		foodEggID = config.get("Item IDs - 6 : Nourriture", "Oeufs", 30203).getInt();
		foodBaconID = config.get("Item IDs - 6 : Nourriture", "Bacon", 30204).getInt();
		foodCheeseID = config.get("Item IDs - 6 : Nourriture", "Fromage", 30205).getInt();
		foodMakiID = config.get("Item IDs - 6 : Nourriture", "Maki", 30206).getInt();
		foodSushiID = config.get("Item IDs - 6 : Nourriture", "Sushi", 30207).getInt();
		foodSkewerID = config.get("Item IDs - 6 : Nourriture", "Brochette", 30208).getInt();
		rhumID = config.get("Item IDs - 6 : Nourriture", "Rhum", 30209).getInt();

		/** ProjectileNPC **/
		npcProjectileWhiteID = config.get("Item IDs - 7 : Combat", "Projectile NPC Blanc", 30174).getInt();
		npcProjectileYellowID = config.get("Item IDs - 7 : Combat", "Projectile NPC Jaune", 30175).getInt();
		npcProjectileGreenID = config.get("Item IDs - 7 : Combat", "Projectile NPC Vert", 30176).getInt();
		npcProjectilePurpleID = config.get("Item IDs - 7 : Combat", "Projectile NPC Violet", 30177).getInt();
		npcProjectileRedID = config.get("Item IDs - 7 : Combat", "Projectile NPC Rouge", 30178).getInt();
		npcProjectileGreyID = config.get("Item IDs - 7 : Combat", "Projectile NPC Gris", 30179).getInt();
		npcProjectileBlueID = config.get("Item IDs - 7 : Combat", "Projectile NPC Bleu", 30180).getInt();
		
		/** Legendary **/
		legendaryNocturnalID = config.get("Item IDs - 7 : Combat", "Baton nocturne", 30100).getInt();
		legendaryDiurnalID = config.get("Item IDs - 7 : Combat", "Baton du jour", 30101).getInt();
		
		/** Sword **/
		stoveID = config.get("Item IDs - 7 : Combat", "Poele a frire", 30158).getInt();
		scepterRedID = config.get("Item IDs - 7 : Combat", "Sceptre Rouge", 30230).getInt();
		scepterBlueID = config.get("Item IDs - 7 : Combat", "Sceptre Bleu", 30231).getInt();
		scepterGreenID = config.get("Item IDs - 7 : Combat", "Sceptre Vert", 30232).getInt();
		hammerWoodID = config.get("Item IDs - 7 : Combat", "Marteau en bois", 30233).getInt();
		hammerStoneID = config.get("Item IDs - 7 : Combat", "Marteau en pierre", 30234).getInt();
		hammerIronID = config.get("Item IDs - 7 : Combat", "Marteau en fer", 30235).getInt();
		rapierID = config.get("Item IDs - 7 : Combat", "Rapier", 30236).getInt();
		runebladeID = config.get("Item IDs - 7 : Combat", "Lame runique", 30238).getInt();
		
		
		/** Potions **/
		potionCelerityID = config.get("Item IDs - 8 : Potions", "Potion de celerite", 30160).getInt();
		potionFatigueID = config.get("Item IDs - 8 : Potions", "Potion de fatigue", 30161).getInt();
		potionJumpID = config.get("Item IDs - 8 : Potions", "Potion de saut", 30162).getInt();
		potionConfusionID = config.get("Item IDs - 8 : Potions", "Potion de confusion", 30163).getInt();
		potionResistanceID = config.get("Item IDs - 8 : Potions", "Potion de resistance", 30164).getInt();
		potionApneaID = config.get("Item IDs - 8 : Potions", "Potion d'apnee", 30165).getInt();
		potionBlindnessID = config.get("Item IDs - 8 : Potions", "Potion de cecite", 30166).getInt();
		potionHungerID = config.get("Item IDs - 8 : Potions", "Potion de faim", 30167).getInt();
		potionWitherID = config.get("Item IDs - 8 : Potions", "Potion de wither", 30168).getInt();

		potionCustomEffectWaterWalkID = config.get("Item IDs - 8 : Potions", "Potion de marche sur l'eau", 30170).getInt();
		potionCustomEffectLavaWalkID = config.get("Item IDs - 8 : Potions", "Potion de marche sur la lave", 30171).getInt();
		potionCustomEffectNoFallID = config.get("Item IDs - 8 : Potions", "Potion de resistance a la chute", 30172).getInt();

		//testSplashID = config.get("Item IDs - 8 : Potions", "EnDev", 30169).getInt();

		/** Scroll **/
		minorValysScrollID = config.get("Item IDs - 9 : Others", "Parchemin de teleportation mineur (Valys)", 10000).getInt();
		mediumValysScrollID = config.get("Item IDs - 9 : Others", "Parchemin de teleportation moyen (Valys)", 10001).getInt();
		majorValysScrollID = config.get("Item IDs - 9 : Others", "Parchemin de teleportation majeur (Valys)", 10002).getInt();

		/** Key **/
		goldKeyID = config.get("Item IDs - 9 : Others", "Cle de donjon en or", 30145).getInt();
		silverKeyID = config.get("Item IDs - 9 : Others", "Cle de donjon en argent", 30146).getInt();
		bronzeKeyID = config.get("Item IDs - 9 : Others", "Cle de donjon en bronze", 30147).getInt();
		neptuniumSmallKeyID = config.get("Item IDs - 9 : Others", "Cle en neptunium", 30157).getInt();
		goldSmallKeyID = config.get("Item IDs - 9 : Others", "Cle en or", 30148).getInt();
		silverSmallKeyID = config.get("Item IDs - 9 : Others", "Cle en argent", 30149).getInt();
		bronzeSmallKeyID = config.get("Item IDs - 9 : Others", "Cle en bronze", 30150).getInt();

		/** Coin **/
		bronzeCoinID = config.get("Item IDs - 9 : Others", "Hardcoin de bronze", 30151).getInt();
		silverCoinID = config.get("Item IDs - 9 : Others", "Hardcoin d'argent", 30152).getInt();
		goldCoinID = config.get("Item IDs - 9 : Others", "Hardcoin d'or", 30153).getInt();
		diamondCoinID = config.get("Item IDs - 9 : Others", "Hardcoin de diamant", 30154).getInt();
		
		/** Trophee **/
		trophyGoldID = config.get("Item IDs - 9 : Others", "Trophee en or", 30400).getInt();
		trophySilverID = config.get("Item IDs - 9 : Others", "Trophee en argent", 30401).getInt();
		trophyBronzeID = config.get("Item IDs - 9 : Others", "Trophee en bronze", 30402).getInt();
		trophyGoldChipID = config.get("Item IDs - 9 : Others", "Trophee en or ebreche", 30403).getInt();

		/** Specials **/
		eyeCoverID = config.get("Item IDs - 9 : Others", "Cache Oeil", 30404).getInt();
		pocketCraftingTableID = config.get("Item IDs - 9 : Others", "Table de craft portable", 30156).getInt();
		magicPowderID = config.get("Item IDs - 9 : Others", "Poudre de magie", 30003).getInt();
		teddyBearID = config.get("Item IDs - 9 : Others", "Ours en peluche", 30102).getInt();

		/** Classics **/
		diamondShineID = config.get("Item IDs - 9 : Others", "Eclat de diamant", 30155).getInt();
		cardsID = config.get("Item IDs - 9 : Others", "Cartes de jeu", 30237).getInt();
		mysteriousDustID = config.get("Item IDs - 9 : Others", "Poussiere mysterieuse", 30004).getInt();

		
		/** ==================== Blocks ==================== **/

		/** Sets Of Material **/
		stoneID = config.get("Block IDs - 01 : Sets Of Material", "Pierre normale (30 IDs large, def:2500)", 2500).getInt();
		whiteStoneID = config.get("Block IDs - 01 : Sets Of Material", "Pierre blanche (30 IDs large, def:2530)", 2530).getInt();
		sandstoneID = config.get("Block IDs - 01 : Sets Of Material", "Sandstone (30 IDs large, def:2560)", 2560).getInt();
		ancientStoneID = config.get("Block IDs - 01 : Sets Of Material", "Pierre ancienne (30 IDs large, def:2590)", 2590).getInt();
		iceID = config.get("Block IDs - 01 : Sets Of Material", "Glace (30 IDs large, def:2620)", 2620).getInt();
		marbleWhiteID = config.get("Block IDs - 01 : Sets Of Material", "Marbre blanc (30 IDs large, def:2650)", 2650).getInt();
		marbleBlackID = config.get("Block IDs - 01 : Sets Of Material", "Marbre noir (30 IDs large, def:2680)", 2680).getInt();
		woodenDarkID = config.get("Block IDs - 01 : Sets Of Material", "Bois lisse fonce (30 IDs large, def:2710)", 2710).getInt();
		woodenLightID = config.get("Block IDs - 01 : Sets Of Material", "Bois lisse clair (30 IDs large, def:2740)", 2740).getInt();
		metalID = config.get("Block IDs - 01 : Sets Of Material", "Acier (30 IDs large, def:2770)", 2770).getInt();
		basaltID = config.get("Block IDs - 01 : Sets Of Material", "Basalt (30 IDs large, def:2800)", 2800).getInt();

		/** Sets Of Natural Blocks **/
		naturalIceID = config.get("Block IDs - 02 : Sets Of Natural Blocks", "Glace (10 IDs large, def:2900)", 2900).getInt();
		naturalDarkID = config.get("Block IDs - 02 : Sets Of Natural Blocks", "Dark (10 IDs large, def:2910)", 2910).getInt();
		naturalMysteriousID = config.get("Block IDs - 02 : Sets Of Natural Blocks", "Mysterieux (20 IDs large, def:2920)", 2920).getInt();
		naturalRedRockID = config.get("Block IDs - 02 : Sets Of Natural Blocks", "Roche rouge (10 IDs large, def:2940)", 2940).getInt();
		naturalRocksID = config.get("Block IDs - 02 : Sets Of Natural Blocks", "Roches (10 IDs large, def:2950)", 2950).getInt();

		/* Ice */
		iceLogID = naturalIceID + 1;
		iceLeavesID = naturalIceID + 2;
		iceLeavesLightID = naturalIceID + 3;
		icePlankID = naturalIceID + 4;
		
		/* Dark */
		darkStoneID = naturalDarkID;
		darkCobblestoneID = naturalDarkID + 1;
		darkDirtID = naturalDarkID + 2;
		darkGrassID = naturalDarkID + 3;
		darkLogID = naturalDarkID + 4;
		darkLeavesID = naturalDarkID + 5;
		
		/* Mysterious */
		mysteriousStoneID = naturalMysteriousID;
		mysteriousDirtID = naturalMysteriousID + 1;
		mysteriousGrassBlockID = naturalMysteriousID + 2;
		mysteriousLogID = naturalMysteriousID + 3;
		mysteriousLeavesID = naturalMysteriousID + 4;
		mysteriousLeavesPurpleID = naturalMysteriousID + 5;

		mysteriousFlowerID = naturalMysteriousID + 10;
		mysteriousPlantPurpleID = naturalMysteriousID + 11;
		mysteriousCoralID = naturalMysteriousID + 12;
		mysteriousAlgueID = naturalMysteriousID + 13;
		mysteriousPlantID = naturalMysteriousID + 14;
		mysteriousReedID = naturalMysteriousID + 15;
		mysteriousGrassID = naturalMysteriousID + 16;

		/* Red Rock */
		redGrassBlockID = naturalRedRockID;
		redGravelID = naturalRedRockID + 1;
		redRockBigLineID = naturalRedRockID + 2;
		redRockLinesID = naturalRedRockID + 3;
		redSilverID = naturalRedRockID + 4;
		
		/* Rocks */
		greyRockID = naturalRocksID;
		greyRockGrassID = naturalRocksID + 1;
		brownRockID = naturalRocksID + 2;
		brownRockGrassID = naturalRocksID + 3;
		darkRockID = naturalRocksID + 4;
		darkRockGrassID = naturalRocksID + 5;
		blackRockID = naturalRocksID + 6;
		lavaRockID = naturalRocksID + 7;
		lavaRockRedID = naturalRocksID + 8;

		/** Colombages **/
		timberedLightID = config.get("Block IDs - 03 : Colombages", "Colombages clairs (10 IDs large, def:3000)", 3000).getInt();
		timberedDarkID = config.get("Block IDs - 03 : Colombages", "Colombages fonces (10 IDs large, def:3010)", 3010).getInt();
		
		timberedSquareID = timberedLightID;
		timberedCrossID = timberedLightID + 1;
		timberedVerticalID = timberedLightID + 2;
		timberedHorizontalID = timberedLightID + 3;
		timberedLeftID = timberedLightID + 4;
		timberedRightID = timberedLightID + 5;

		timberedSquareDarkID = timberedDarkID;
		timberedCrossDarkID = timberedDarkID + 1;
		timberedVerticalDarkID = timberedDarkID + 2;
		timberedHorizontalDarkID = timberedDarkID + 3;
		timberedLeftDarkID = timberedDarkID + 4;
		timberedRightDarkID = timberedDarkID + 5;

		/** Signs **/
		signsID = config.get("Block IDs - 04 : Enseignes", "Enseignes (20 IDs large, def:3020)", 3020).getInt();
		
		signAlchemyID = signsID;
		signBankID = signsID + 1;
		signForgeID = signsID + 2;
		signShieldID = signsID + 3;
		signSanctuaryID = signsID + 4;
		signArmoryID = signsID + 5;
		signLibraryID = signsID + 6;
		signRestaurantID = signsID + 7;
		signTavernID = signsID + 8;
		signMaterialsID = signsID + 9;
		signHostelID = signsID + 10;
		signDiamondID = signsID + 11;
		signPhoID = signsID + 12;
		signStableID = signsID + 13;
		signCrystalID = signsID + 14;

		/** Corals **/
		coralOrangeID = config.get("Block IDs - 05 : Coraux", "Corail orange (def:3040)", 3040).getInt();
		coralGreenID = config.get("Block IDs - 05 : Coraux", "Corail vert (def:3041)", 3041).getInt();
		coralPurpleID = config.get("Block IDs - 05 : Coraux", "Corail violet (def:3042)", 3042).getInt();
		coralRoseID = config.get("Block IDs - 05 : Coraux", "Corail rose (def:3043)", 3043).getInt();
		coralBlackID = config.get("Block IDs - 05 : Coraux", "Corail noir (def:3044)", 3044).getInt();
		coralBlueID = config.get("Block IDs - 05 : Coraux", "Corail bleu (def:3045)", 3045).getInt();
		
		coralBlockReefID = config.get("Block IDs - 05 : Coraux", "Corail recif (def:3046)", 3046).getInt();
		coralBlockSpongeID = config.get("Block IDs - 05 : Coraux", "Corail eponge (def:3047)", 3047).getInt();

		/** Double Blocks **/
		doubleCrateBlockID = config.get("Block IDs - 06 : Blocs doubles", "Grande caisse (bloc, def:3050)", 3050).getInt();
		doubleCrateItemBlockID = config.get("Block IDs - 06 : Blocs doubles", "Grande caisse (item, def:30500)", 30500).getInt();
		
		doubleTorchLowerID = config.get("Block IDs - 06 : Blocs doubles", "Grande torche (2 IDs large, def:3051)", 3051).getInt();
		doubleTorchUpperID = doubleTorchLowerID + 1;
		doubleCandleLowerID = config.get("Block IDs - 06 : Blocs doubles", "Grande bougie (2 IDs large, def:3053)", 3053).getInt();
		doubleCandleUpperID = doubleCandleLowerID + 1;
		doubleLanternLowerID = config.get("Block IDs - 06 : Blocs doubles", "Lampadaire (2 IDs large, def:3055)", 3055).getInt();
		doubleLanternUpperID = doubleLanternLowerID + 1;

		normalDoubleGrassLowerID = config.get("Block IDs - 06 : Blocs doubles", "Hautes herbes (2 IDs large, def:3057)", 3057).getInt();
		normalDoubleGrassUpperID = normalDoubleGrassLowerID + 1;
		savanaDoubleGrassLowerID = config.get("Block IDs - 06 : Blocs doubles", "Hautes herbes de savanne (2 IDs large, def:3059)", 3059).getInt();
		savanaDoubleGrassUpperID = savanaDoubleGrassLowerID + 1;
		mysteriousDoubleGrassLowerID = config.get("Block IDs - 06 : Blocs doubles", "Hautes herbes mysterieuses (2 IDs large, def:3060)", 3061).getInt();
		mysteriousDoubleGrassUpperID = mysteriousDoubleGrassLowerID + 1;

		/** Meta **/
		metaWoolLightID = config.get("Block IDs - 07 : Meta", "Laines lumineuses (def:3070)", 3070).getInt();
		metaVitrailID = config.get("Block IDs - 07 : Meta", "Vitraux (def:3071)", 3071).getInt();
		metaVitrailPaneID = config.get("Block IDs - 07 : Meta", "Vitraux plats (def:3072)", 3072).getInt();

		/** Lumineux **/
		lanternWoodID = config.get("Block IDs - 08 : Lumineux", "Lanterne en bois (def:3080)", 3080).getInt();
		lanternIronID = config.get("Block IDs - 08 : Lumineux", "Lanterne en fer (def:3081)", 3081).getInt();

		lampionBlancID = config.get("Block IDs - 08 : Lumineux", "Lampion blanc (def:3082)", 3082).getInt();
		lampionBleuID = config.get("Block IDs - 08 : Lumineux", "Lampion bleu (def:3083)", 3083).getInt();
		lampionJauneID = config.get("Block IDs - 08 : Lumineux", "Lampion jaune (def:3084)", 3084).getInt();
		lampionVertID = config.get("Block IDs - 08 : Lumineux", "Lampion vert (def:3085)", 3085).getInt();
		lampionRougeID = config.get("Block IDs - 08 : Lumineux", "Lampion rouge (def:3086)", 3086).getInt();

		lightCandleID = config.get("Block IDs - 08 : Lumineux", "Bougie (def:3087)", 3087).getInt();
		lightLanternID = config.get("Block IDs - 08 : Lumineux", "Lanterne (def:3088)", 3088).getInt();
		lightSkullCandleID = config.get("Block IDs - 08 : Lumineux", "Bougie sur crane (def:3089)", 3089).getInt();
		lightSkullSpikeID = config.get("Block IDs - 08 : Lumineux", "Crane lumineux (def:3090)", 3090).getInt();

		/** Simple Blocks **/
		crossCrateID = config.get("Block IDs - 09 : Blocs simples", "Caisse croisee (def:3110)", 3110).getInt();
		barredCrateID = config.get("Block IDs - 09 : Blocs simples", "Caisse barree (def:3111)", 3111).getInt();
		leatherBlockID = config.get("Block IDs - 09 : Blocs simples", "Bloc de cuir (def:3126)", 3126).getInt();
		PHOnoirID = config.get("Block IDs - 09 : Blocs simples", "Pierre noire du PHO (def:3118)", 3118).getInt();
		PHOblancID = config.get("Block IDs - 09 : Blocs simples", "Pierre blanche du PHO (def:3119)", 3119).getInt();
		silverBlockID = config.get("Block IDs - 09 : Blocs simples", "Bloc d'argent de Reder (def:3123)", 3123).getInt();
		obsidianBlockID = config.get("Block IDs - 09 : Blocs simples", "Bloc d'obsidienne en fusion (def:3124)", 3124).getInt();
		shojiID = config.get("Block IDs - 09 : Blocs simples", "Mur en papier Shoji (def:3125)", 3125).getInt();

		tileID = config.get("Block IDs - 09 : Blocs simples", "Tuiles (10 IDs large, def:3100)", 3100).getInt();
		tileArdoiseID = tileID;
		tileRedID = tileID + 1;
		tileBlackID = tileID + 2;
		tileBlueID = tileID + 3;
		tileRedBigID = tileID + 4;
		tileBlackBigID = tileID + 5;
		tileBlueBigID = tileID + 6;
		tileBlackAltID = tileID + 7;

		/** Special Blocks **/
		meatBlockID = config.get("Block IDs - 10 : Blocs speciaux", "Bloc de viande (def:3129)", 3129).getInt();
		fossileBlockID = config.get("Block IDs - 10 : Blocs speciaux", "Fossile (def:3127)", 3127).getInt();

		simpleDirtBlockID = config.get("Block IDs - 10 : Blocs speciaux", "Terre classique (def:3128)", 3128).getInt();
		completeLogOakID = config.get("Block IDs - 10 : Blocs speciaux", "Buche de chene complete (def:3114)", 3114).getInt();
		completeLogSpruceID = config.get("Block IDs - 10 : Blocs speciaux", "Buche de pin complete (def:3115)", 3115).getInt();

		vaillantCrateID = config.get("Block IDs - 10 : Blocs speciaux", "Caisse du Vaillant (def:3112)", 3112).getInt();

		ironWindowID = config.get("Block IDs - 10 : Blocs speciaux", "Fenetre en fer (def:3135)", 3135).getInt();
		metalGridID = config.get("Block IDs - 10 : Blocs speciaux", "Grille fine en acier (def:3134)", 3134).getInt();

		woeBlockID = config.get("Block IDs - 10 : Blocs speciaux", "Bloc du War of Emperium (def:3120)", 3120).getInt();

		lavaBlockID = config.get("Block IDs - 10 : Blocs speciaux", "Bloc de lave (def:3121)", 3121).getInt();
		waterBlockID = config.get("Block IDs - 10 : Blocs speciaux", "Bloc d'eau (def:3122)", 3122).getInt();
		
		logCherryID = config.get("Block IDs - 10 : Blocs speciaux", "Buche de cerisier (def:3116)", 3116).getInt();
		logRedID = config.get("Block IDs - 10 : Blocs speciaux", "Buche Rouge (def:3117)", 3117).getInt();
		barrelID = config.get("Block IDs - 10 : Blocs speciaux", "Tonneau (def:3113)", 3113).getInt();

		ironWindowPaneID = config.get("Block IDs - 10 : Blocs speciaux", "Fenetre plate en fer (def:3136)", 3136).getInt();

		grisouBlockID = config.get("Block IDs - 10 : Blocs speciaux", "Bloc de grisou (def:3130)", 3130).getInt();
		slimeBlockID = config.get("Block IDs - 10 : Blocs speciaux", "Bloc de slime (def:3131)", 3131).getInt();
		invisibleBlockID = config.get("Block IDs - 10 : Blocs speciaux", "Bloc invisble (def:3133)", 3133).getInt();
		portalPurpleID = config.get("Block IDs - 10 : Blocs speciaux", "Portail violet (def:3132)", 3132).getInt();
		bookBlockID = config.get("Block IDs - 10 : Blocs speciaux", "Livre (def:3146)", 3146).getInt();
		chainIronID = config.get("Block IDs - 10 : Blocs speciaux", "Chaine en fer (def:3140)", 3140).getInt();
		chainRopeID = config.get("Block IDs - 10 : Blocs speciaux", "Corde (def:3141)", 3141).getInt();
		ropeRailID = config.get("Block IDs - 10 : Blocs speciaux", "Cordage (def:3142)", 3142).getInt();
		spikesID = config.get("Block IDs - 10 : Blocs speciaux", "Piques (def:3143)", 3143).getInt();
		climbingLadderID = config.get("Block IDs - 10 : Blocs speciaux", "Bloc d'escalade (def:3144)", 3144).getInt();
		roseVinesID = config.get("Block IDs - 10 : Blocs speciaux", "Vignes de roses (def:3145)", 3145).getInt();
		cristalLittleID = config.get("Block IDs - 10 : Blocs speciaux", "Petit cristal (def:3138)", 3138).getInt();
		cristalBigID = config.get("Block IDs - 10 : Blocs speciaux", "Gros cristal (def:3139)", 3139).getInt();
		cristalBlockID = config.get("Block IDs - 10 : Blocs speciaux", "Bloc de cristal (def:3137)", 3137).getInt();
		cakeLieBlockID = config.get("Block IDs - 10 : Blocs speciaux", "Cake (def:3147)", 3147).getInt();
		meatCakeBlockID = config.get("Block IDs - 10 : Blocs speciaux", "Viande (def:3148)", 3148).getInt();
		eternalIceBlockID = config.get("Block IDs - 10 : Blocs speciaux", "Glace eternelle (def:3154)", 3154).getInt();

		/** Secret **/ 
		secretDoorWoodBlockID = config.get("Block IDs - 10 : Blocs speciaux", "Porte secrete en bois (bloc, def:3150)", 3150).getInt();
		secretDoorIronBlockID = config.get("Block IDs - 10 : Blocs speciaux", "Porte secrete en fer (bloc, def:3151)", 3151).getInt();
		secretTrapDoorBlockID = config.get("Block IDs - 10 : Blocs speciaux", "Trappe secrete (def:3149)", 3149).getInt();
		
		secretDoorWoodItemBlockID = config.get("Block IDs - 10 : Blocs speciaux", "Porte secrete en bois (item, def:3152)", 3152).getInt();
		secretDoorIronItemBlockID = config.get("Block IDs - 10 : Blocs speciaux", "Porte secrete en fer (item, def:3153)", 3153).getInt();
		
		/** Stairs + Steps **/
		stairWoolID = config.get("Block IDs - 11 : Escaliers et demi-dalles", "Laines (32 IDs large, def:3200)", 3200).getInt();
		stairWoolWhiteID = stairWoolID;
		stairWoolOrangeID = stairWoolID + 2;
		stairWoolMagentaID = stairWoolID + 4;
		stairWoolLightBlueID = stairWoolID + 6;
		stairWoolYellowID = stairWoolID + 8;
		stairWoolLightGreenID = stairWoolID + 10;
		stairWoolPinkID = stairWoolID + 12;
		stairWoolGrayID = stairWoolID + 14;
		stairWoolLightGrayID = stairWoolID + 16;
		stairWoolCyanID = stairWoolID + 18;
		stairWoolPurpleID = stairWoolID + 20;
		stairWoolBlueID = stairWoolID + 22;
		stairWoolBrownID = stairWoolID + 24;
		stairWoolGreenID = stairWoolID + 26;
		stairWoolRedID = stairWoolID + 28;
		stairWoolBlackID = stairWoolID + 30;

		stepWoolWhiteID = stairWoolWhiteID + 1;
		stepWoolOrangeID = stairWoolOrangeID + 1;
		stepWoolMagentaID = stairWoolMagentaID + 1;
		stepWoolLightBlueID = stairWoolLightBlueID + 1;
		stepWoolYellowID = stairWoolYellowID + 1;
		stepWoolLightGreenID = stairWoolLightGreenID + 1;
		stepWoolPinkID = stairWoolPinkID + 1;
		stepWoolGrayID = stairWoolGrayID + 1;
		stepWoolLightGrayID = stairWoolLightGrayID + 1;
		stepWoolCyanID = stairWoolCyanID + 1;
		stepWoolPurpleID = stairWoolPurpleID + 1;
		stepWoolBlueID = stairWoolBlueID + 1;
		stepWoolBrownID = stairWoolBrownID + 1;
		stepWoolGreenID = stairWoolGreenID + 1;
		stepWoolRedID = stairWoolRedID + 1;
		stepWoolBlackID = stairWoolBlackID + 1;

		stairWoolLightID = config.get("Block IDs - 11 : Escaliers et demi-dalles", "Laines lumineuses (32 IDs large, def:3240)", 3240).getInt();
		stairWoolWhiteLightID = stairWoolLightID;
		stairWoolOrangeLightID = stairWoolLightID + 2;
		stairWoolMagentaLightID = stairWoolLightID + 4;
		stairWoolLightBlueLightID = stairWoolLightID + 6;
		stairWoolYellowLightID = stairWoolLightID + 8;
		stairWoolLightGreenLightID = stairWoolLightID + 10;
		stairWoolPinkLightID = stairWoolLightID + 12;
		stairWoolGrayLightID = stairWoolLightID + 14;
		stairWoolLightGrayLightID = stairWoolLightID + 16;
		stairWoolCyanLightID = stairWoolLightID + 18;
		stairWoolPurpleLightID = stairWoolLightID + 20;
		stairWoolBlueLightID = stairWoolLightID + 22;
		stairWoolBrownLightID = stairWoolLightID + 24;
		stairWoolGreenLightID = stairWoolLightID + 26;
		stairWoolRedLightID = stairWoolLightID + 28;
		stairWoolBlackLightID = stairWoolLightID + 30;

		stepWoolWhiteLightID = stairWoolWhiteLightID + 1;
		stepWoolOrangeLightID = stairWoolOrangeLightID + 1;
		stepWoolMagentaLightID = stairWoolMagentaLightID + 1;
		stepWoolLightBlueLightID = stairWoolLightBlueLightID + 1;
		stepWoolYellowLightID = stairWoolYellowLightID + 1;
		stepWoolLightGreenLightID = stairWoolLightGreenLightID + 1;
		stepWoolPinkLightID = stairWoolPinkLightID + 1;
		stepWoolGrayLightID = stairWoolGrayLightID + 1;
		stepWoolLightGrayLightID = stairWoolLightGrayLightID + 1;
		stepWoolCyanLightID = stairWoolCyanLightID + 1;
		stepWoolPurpleLightID = stairWoolPurpleLightID + 1;
		stepWoolBlueLightID = stairWoolBlueLightID + 1;
		stepWoolBrownLightID = stairWoolBrownLightID + 1;
		stepWoolGreenLightID = stairWoolGreenLightID + 1;
		stepWoolRedLightID = stairWoolRedLightID + 1;
		stepWoolBlackLightID = stairWoolBlackLightID + 1;

		stairTileID = config.get("Block IDs - 11 : Escaliers et demi-dalles", "Tuiles (20 IDs large, def:3280)", 3280).getInt();
		stairArdoiseID = stairTileID;
		stairTileRedID = stairTileID + 2;
		stairTileBlackID = stairTileID + 4;
		stairTileBlueID = stairTileID + 6;
		stairTileRedBigID = stairTileID + 8;
		stairTileBlackBigID = stairTileID + 10;
		stairTileBlueBigID = stairTileID + 12;
		stairTileBlackAltID = stairTileID + 14;
		
		stepArdoiseID = stairArdoiseID + 1;
		stepTileRedID = stairTileRedID + 1;
		stepTileBlackID = stairTileBlackID + 1;
		stepTileBlueID = stairTileBlueID + 1;
		stepTileRedBigID = stairTileRedBigID + 1;
		stepTileBlackBigID = stairTileBlackBigID + 1;
		stepTileBlueBigID = stairTileBlueBigID + 1;
		stepTileBlackAltID = stairTileBlackAltID + 1;

		stepLanternWoodID = config.get("Block IDs - 11 : Escaliers et demi-dalles", "Demi-dalle de lanterne en bois (def:3300)", 3300).getInt();
		stepLanternIronID = config.get("Block IDs - 11 : Escaliers et demi-dalles", "Demi-dalle de lanterne en fer (def:3301)", 3301).getInt();

		/** Classic Stairs + Steps + Walls + Balustrades **/
		setStone = config.get("Block IDs - 11 : Escaliers, demi-dalles, murets et balustrades classiques", "Pierre (5 IDs large, def:2350)", 2350).getInt();
		setGrass = config.get("Block IDs - 11 : Escaliers, demi-dalles, murets et balustrades classiques", "Herbe (5 IDs large, def:2355)", 2355).getInt();
		setDirt = config.get("Block IDs - 11 : Escaliers, demi-dalles, murets et balustrades classiques", "Terre (5 IDs large, def:2360)", 2360).getInt();
		setGravel = config.get("Block IDs - 11 : Escaliers, demi-dalles, murets et balustrades classiques", "Gravier (5 IDs large, def:2365)", 2365).getInt();
		setSand = config.get("Block IDs - 11 : Escaliers, demi-dalles, murets et balustrades classiques", "Sable (5 IDs large, def:2370)", 2370).getInt();
		setSandstone = config.get("Block IDs - 11 : Escaliers, demi-dalles, murets et balustrades classiques", "Sandstone (5 IDs large, def:2375)", 2375).getInt();
		setWoodOak = config.get("Block IDs - 11 : Escaliers, demi-dalles, murets et balustrades classiques", "Bois de chene (5 IDs large, def:2400)", 2400).getInt();
		setWoodSpruce = config.get("Block IDs - 11 : Escaliers, demi-dalles, murets et balustrades classiques", "Bois de pin (5 IDs large, def:2405)", 2405).getInt();
		setWoodBirch = config.get("Block IDs - 11 : Escaliers, demi-dalles, murets et balustrades classiques", "Bois de bouleau (5 IDs large, def:2410)", 2410).getInt();
		setWoodJungle = config.get("Block IDs - 11 : Escaliers, demi-dalles, murets et balustrades classiques", "Bois de la jungle (5 IDs large, def:2415)", 2415).getInt();
		setPlanksOak = config.get("Block IDs - 11 : Escaliers, demi-dalles, murets et balustrades classiques", "Planches de chene (5 IDs large, def:2420)", 2420).getInt();
		setPlanksSpruce = config.get("Block IDs - 11 : Escaliers, demi-dalles, murets et balustrades classiques", "Planches de pin (5 IDs large, def:2425)", 2425).getInt();
		setPlanksBirch = config.get("Block IDs - 11 : Escaliers, demi-dalles, murets et balustrades classiques", "Planches de bouleau (5 IDs large, def:2430)", 2430).getInt();
		setPlanksJungle = config.get("Block IDs - 11 : Escaliers, demi-dalles, murets et balustrades classiques", "Planches de la jungle (5 IDs large, def:2435)", 2435).getInt();
		setMossyCobble = config.get("Block IDs - 11 : Escaliers, demi-dalles, murets et balustrades classiques", "MossyCobble (5 IDs large, def:2440)", 2440).getInt();
		setStonebrick = config.get("Block IDs - 11 : Escaliers, demi-dalles, murets et balustrades classiques", "Stonebrick (5 IDs large, def:2445)", 2445).getInt();
		setStonebrickMossy = config.get("Block IDs - 11 : Escaliers, demi-dalles, murets et balustrades classiques", "StonebrickMossy (5 IDs large, def:2450)", 2450).getInt();
		setStonebrickCracked = config.get("Block IDs - 11 : Escaliers, demi-dalles, murets et balustrades classiques", "StonebrickCracked (5 IDs large, def:2455)", 2455).getInt();
		setBrick = config.get("Block IDs - 11 : Escaliers, demi-dalles, murets et balustrades classiques", "Brique (5 IDs large, def:2460)", 2460).getInt();
		setObsidian = config.get("Block IDs - 11 : Escaliers, demi-dalles, murets et balustrades classiques", "Obsidienne (5 IDs large, def:2465)", 2465).getInt();
		setIce = config.get("Block IDs - 11 : Escaliers, demi-dalles, murets et balustrades classiques", "Glace (5 IDs large, def:2470)", 2470).getInt();
		setSnow = config.get("Block IDs - 11 : Escaliers, demi-dalles, murets et balustrades classiques", "Neige (5 IDs large, def:2475)", 2475).getInt();
		setNetherbrick = config.get("Block IDs - 11 : Escaliers, demi-dalles, murets et balustrades classiques", "Pierre du nether (5 IDs large, def:2480)", 2480).getInt();
		setEnderstone = config.get("Block IDs - 11 : Escaliers, demi-dalles, murets et balustrades classiques", "Pierre de l'end (5 IDs large, def:2485)", 2485).getInt();
		setStraw = config.get("Block IDs - 11 : Escaliers, demi-dalles, murets et balustrades classiques", "Paille (5 IDs large, def:2490)", 2490).getInt();

		stairStoneID = setStone;
		stairGrassID = setGrass;
		stairDirtID = setDirt;
		stairGravelID = setGravel;
		stairSandID = setSand;
		stairMossyCobbleID = setMossyCobble;
		stairStonebrickMossyID = setStonebrickMossy;
		stairStonebrickCrackedID = setStonebrickCracked;
		stairObsidianID = setObsidian;
		stairIceID = setIce;
		stairSnowID = setSnow;
		stairEnderstoneID = setEnderstone;
		stairStrawID = setStraw;

		stepGrassID = setGrass + 1;
		stepDirtID = setDirt + 1;
		stepGravelID = setGravel + 1;
		stepSandID = setSand + 1;
		stepWoodOakID = setWoodOak + 1;
		stepWoodSpruceID = setWoodSpruce + 1;
		stepWoodBirchID = setWoodBirch + 1;
		stepWoodJungleID = setWoodJungle + 1;
		stepCobbleMossyID = setMossyCobble + 1;
		stepStonebrickMossyID = setStonebrickMossy + 1;
		stepStonebrickCrackedID = setStonebrickCracked + 1;
		stepObsidianID = setObsidian + 1;
		stepIceID = setIce + 1;
		stepSnowID = setSnow + 1;
		stepEndstoneID = setEnderstone + 1;
		stepStrawID = setStraw + 1;

		/** Walls **/
		wallSandstoneID = setSandstone + 2;
		wallPlankOakID = setPlanksOak + 2;
		wallBrickID = setBrick + 2;
		wallStonebrickID = setStonebrick + 2;
		wallNetherbrickID = setNetherbrick + 2;
		wallWoodOakID = setWoodOak + 2;
		wallWoodSpruceID = setWoodSpruce + 2;
		wallWoodBirchID = setWoodBirch + 2;
		wallWoodJungleID = setWoodJungle + 2;

		/** Fence **/
		
		/** Balustrades **/
		anvilWoodOakID = setWoodOak + 4;
		anvilPlankOakID = setPlanksOak + 4;
		anvilPlankSpruceID = setPlanksSpruce + 4;
		anvilPlankBirchID = setPlanksBirch + 4;
		anvilPlankJungleID = setPlanksJungle + 4;
		
		/** Carpet **/
		carpetDirtID = config.get("Block IDs - 12 : Tapis", "Tapis en terre", 3310).getInt();
		carpetGravelID = config.get("Block IDs - 12 : Tapis", "Tapis en gravier", 3311).getInt();
		carpetStoneID = config.get("Block IDs - 12 : Tapis", "Tapis en pierre", 3312).getInt();
		carpetStonebrickID = config.get("Block IDs - 12 : Tapis", "Tapis en stonebrick", 3313).getInt();
		
		carpetPlankOakID = config.get("Block IDs - 12 : Tapis", "Tapis en planches de chene", 3314).getInt();
		carpetPlankSpruceID = config.get("Block IDs - 12 : Tapis", "Tapis en planches de pin", 3315).getInt();
		carpetLogOakTopID = config.get("Block IDs - 12 : Tapis", "Tapis en buche de chene", 3316).getInt();
		carpetLogOakID = config.get("Block IDs - 12 : Tapis", "Tapis en bois de chene", 3317).getInt();
		carpetLogSpruceID = config.get("Block IDs - 12 : Tapis", "Tapis en bois de pin", 3318).getInt();

		/** Unused **/
		//seedHoublonID = config.get("Block IDs - 99 : Unused", "Graine de houblon", 30220).getInt();
		//houblonID = config.get("Block IDs - 99 : Unused", "Houblon", 30221).getInt();
		//cropHoublonID = config.get("Block IDs - 99 : Unused", "Pousse de houblon", 3820).getInt();
		//rotatorID = config.get("Block IDs - 99 : Unused", "Le Rotationnator", 30159).getInt();
		//cannepecheID = config.get("Block IDs - 99 : Unused", "Canne a peche", 30157).getInt();
		//liquideVertFlowingID = config.get("Block IDs - 99 : Unused", "Liquide vert", 3300).getInt();
		//liquideVertStillID = config.get("Block IDs - 99 : Unused", "Liquide vert (stationnaire)", 3301).getInt();
		//liquideVioletFlowingID = config.get("Block IDs - 99 : Unused", "Liquide violet", 3302).getInt();
		//liquideVioletStillID = config.get("Block IDs - 99 : Unused", "Liquide violet (stationnaire)", 3303).getInt();
		
		config.save();
	}
}