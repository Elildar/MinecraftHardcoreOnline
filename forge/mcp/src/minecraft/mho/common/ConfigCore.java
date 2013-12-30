package mho.common;

import mho.block.MhoTrap;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraftforge.common.Configuration;
import net.minecraftforge.common.Property;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class ConfigCore {

	//Items
	/**Ingot**/
	public static int diamondIngotID;

	/**ProjectileMageNoir
	public static int projectileMNID;**/
	
	/**ProjectileNPC**/
	public static int projectileNPCBlancID;
	public static int projectileNPCJauneID;
	public static int projectileNPCVertID;
	public static int projectileNPCVioletID;
	public static int projectileNPCRougeID;
	public static int projectileNPCGrisID;
	public static int projectileNPCBleuID;
	
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
	
	/**ItemsNPC**/
	public static int sceptreRougeID;
	public static int sceptreBleuID;
	public static int sceptreVertID;
	public static int marteauBoisID;
	public static int marteauPierreID;
	public static int marteauFerID;
	public static int rapierID;
	public static int cartesID;
	public static int lameRuniqueID;
	
	/**Poupee**/
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
	
	/** Quest - Nezaril **/
	public static int nezarilJarID;
	public static int nezarilJarFullID;
	public static int redDragonEggID;

	/** Quest **/
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
	
	/**Key**/
	public static int goldKeyID;
	public static int silverKeyID;
	public static int bronzeKeyID;
	public static int goldSmallKeyID;
	public static int silverSmallKeyID;
	public static int bronzeSmallKeyID;

	/**Coin**/
	public static int bronzeCoinID;
	public static int silverCoinID;
	public static int goldCoinID;
	public static int diamondCoinID;
	
	/**Trophee**/
	public static int trophyGoldID;
	public static int trophySilverID;
	public static int trophyBronzeID;
	public static int trophyGoldChipID;
	
	/**CacheOeil**/
	public static int cacheOeilID;

	/**Food**/
	public static int hamburgerFoodID;
	public static int fritesFoodID;
	public static int kfcFoodID;
	public static int oeufFoodID;
	public static int baconFoodID;
	public static int fromageFoodID;
	public static int makiFoodID;
	public static int sushiFoodID;
	public static int brochetteFoodID;
	public static int rhumID;

	/**Plantes**/
	public static int seedHoublonID;   
	public static int cropHoublonID; 
	public static int houblonID;

	/** Mysterious **/
	public static int flowerMysteriousID;
	public static int plantMysteriousID;
	public static int coralMysteriousID;
	public static int algueMysteriousID;
	public static int grassMysteriousID;
	public static int grass2MysteriousID;
	public static int logMysteriousID;
	public static int leavesMysteriousID;
	public static int leaves2MysteriousID;
	public static int stoneMysteriousID;
	public static int dirtMysteriousID;
	public static int grassBlockMysteriousID;
	public static int sugarcaneMysteriousID;
	
	/** Enchant **/
   public static int enchantSharpnessT1SmallID;
   public static int enchantSharpnessT1MediumID;
   public static int enchantSharpnessT1BigID;
   public static int enchantSharpnessT2SmallID;
   public static int enchantSharpnessT2MediumID;
   public static int enchantSharpnessT2BigID;
   public static int enchantSharpnessT3SmallID;
   public static int enchantSharpnessT3MediumID;
   public static int enchantSharpnessT3BigID;
   
   public static int enchantSmiteT1SmallID;
   public static int enchantSmiteT1MediumID;
   public static int enchantSmiteT1BigID;
   public static int enchantSmiteT2SmallID;
   public static int enchantSmiteT2MediumID;
   public static int enchantSmiteT2BigID;
   public static int enchantSmiteT3SmallID;
   public static int enchantSmiteT3MediumID;
   public static int enchantSmiteT3BigID;
   
   public static int enchantProtectionT1SmallID;
   public static int enchantProtectionT1BigID;
   public static int enchantProtectionT2SmallID;
   public static int enchantProtectionT2BigID;
   public static int enchantProtectionT3SmallID;
   public static int enchantProtectionT3BigID;
   
   public static int enchantBaneofT1SmallID;
   public static int enchantBaneofT1MediumID;
   public static int enchantBaneofT1BigID;
   public static int enchantBaneofT2SmallID;
   public static int enchantBaneofT2MediumID;
   public static int enchantBaneofT2BigID;
   public static int enchantBaneofT3SmallID;
   public static int enchantBaneofT3MediumID;
   public static int enchantBaneofT3BigID;
   
   public static int enchantEfficacityT1SmallID;
   public static int enchantEfficacityT1MediumID;
   public static int enchantEfficacityT1BigID;
   public static int enchantEfficacityT2SmallID;
   public static int enchantEfficacityT2MediumID;
   public static int enchantEfficacityT2BigID;
   public static int enchantEfficacityT3SmallID;
   public static int enchantEfficacityT3MediumID;
   public static int enchantEfficacityT3BigID;
   
   public static int enchantDurabilityT1SmallID;
   public static int enchantDurabilityT1MediumID;
   public static int enchantDurabilityT1BigID;
   public static int enchantDurabilityT2SmallID;
   public static int enchantDurabilityT2MediumID;
   public static int enchantDurabilityT2BigID;
   public static int enchantDurabilityT3SmallID;
   public static int enchantDurabilityT3MediumID;
   public static int enchantDurabilityT3BigID;
   
   public static int enchantFlameT1SmallID;
   public static int enchantFlameT1BigID;
   public static int enchantFlameT2SmallID;
   public static int enchantFlameT2BigID;
   public static int enchantFlameT3SmallID;
   public static int enchantFlameT3BigID;
   
   public static int enchantKnockbackT1SmallID;
   public static int enchantKnockbackT1BigID;
   public static int enchantKnockbackT2SmallID;
   public static int enchantKnockbackT2BigID;
   public static int enchantKnockbackT3SmallID;
   public static int enchantKnockbackT3BigID;
	
	/**Sword**/
	public static int poeleSwordID;

	/**Rotationnator**/
	public static int rotatorID;
	
	/**Table craft portable**/
	public static int pocketCraftingTableID;

	/**Aquaculture**/
	public static int cannepecheID;

	/**Loot**/
	public static int coeurLootID;
	public static int cerveauLootID;
	public static int brasLootID;
	public static int poudreMagieID;

	/**Insigne**/
	public static int valysInsignesID;
	public static int chasseInsignesID;
	public static int guerreInsignesID;
	public static int agricultureInsignesID;
	public static int gastronomieInsignesID;
	public static int minageInsignesID;
	public static int artisanatInsignesID;
	public static int villeInsignesID;
	public static int pecheInsignesID;
	public static int explorationInsignesID;
	public static int constructionInsignesID;
	public static int guildeInsignesID;
	public static int victoireInsignesID;
	public static int participationInsignesID;
	public static int magieInsignesID;
	
	/**Lumiere**/
	public static int lumiereBougieID;
	public static int lumiereLanterneID;
	public static int lumiereSkullID;
	public static int lumiereSkullSimpleID;

	/**Legendaire**/
	public static int nocturneLegendaireID;
	public static int diurneLegendaireID;
	public static int teddyBearID;
	
	/**Blocks**/
	public static int leatherBlockID;
	public static int lavaBlockID;
	public static int waterBlockID;
	public static int tonneauBlockID;
	public static int caisseVaillantID;
	public static int escaladeBlockID;
	public static int slimeBlockID;
	public static int roseBlockID;
	public static int cakeLieBlockID;
	public static int meatCakeBlockID;
	public static int simpleDirtBlockID;
	public static int grisouBlockID;
	public static int fossileBlockID;
	public static int caisseBlockID;
	public static int bucheCompleteBlockID;
	public static int bucheFonceCompleteBlockID;
	public static int caisseBlockBotID;
	public static int caisseBlockTopID;
	public static int batonTorcheBotID;
	public static int batonTorcheTopID;
	public static int batonBougieBotID;
	public static int batonBougieTopID;
	public static int batonLanterneBotID;
	public static int batonLanterneTopID;
	
	public static int darkStoneID;
	public static int darkCobblestoneID;
	public static int darkLeavesID;
	public static int darkDirtID;
	public static int darkGrassID;
	public static int darkLogID;
	
	public static int ropeRailID;
	
	/**Basalt**/
	public static int basaltID;
	public static int basaltCobblestoneID;
	public static int basaltBrickID;

	/**Frigo**/
	public static int offFrigoID;
	public static int onFrigoID;

	/**Drapeau**/
	public static int bannerID;

	/**Trapes**//*
	public static int stoneTrapID;
	public static int dirtTrapID;
	public static int logTrapID;
	public static int stoneBrickTrapID;
	public static int woodTrapID;
	public static int woodLightTrapID;
	public static int woodNormalTrapID;
	public static int woodDarkTrapID;
	
	/**Doors**//*
	public static int stoneItemDoorID;
	public static int stoneDoorID;
	public static int dirtItemDoorID;
	public static int dirtDoorID;
	public static int logItemDoorID;
	public static int logDoorID;
	public static int stoneBrickItemDoorID;
	public static int stoneBrickDoorID;
	public static int woodItemDoorID;
	public static int woodDoorID;
	public static int woodLightItemDoorID;
	public static int woodLightDoorID;
	public static int woodNormalItemDoorID;
	public static int woodNormalDoorID;
	public static int woodDarkItemDoorID;
	public static int woodDarkDoorID;

	/**Potions**/
	public static int celeritePotionID;
	public static int fatiguePotionID;
	public static int sautPotionID;
	public static int confusionPotionID;
	public static int resistancePotionID;
	public static int apneePotionID;
	public static int cecitePotionID;
	public static int faimPotionID;
	public static int witherPotionID;

	/**Custom Potion**/
	public static int customPotionWaterWalkID;
	public static int customPotionLavaWalkID;
	public static int customPotionNoFallID;

	/**Splash**/
	public static int testSplashID;

	/**Coraux**/
	public static int coralOrangeID;
	public static int coralGreenID;
	public static int coralPurpleID;
	public static int coralRoseID;
	public static int coralBlackID;
	public static int coralBlueID;
	public static int coralBlockReefID;
	public static int coralBlockSpongeID;

	/** WTF
	public static boolean isAwesome;**/

	//Blocks
	public static int blockMetaTapisID;
	public static int metaWoolLightID;
	public static int metaVitrailID;
	public static int metaVitrailPaneID;

	/** New slabs **/
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

	public static int stepGrassID;
	public static int stepDirtID;
	public static int stepGravelID;
	public static int stepWood1ID;
	public static int stepWood2ID;
	public static int stepWood3ID;
	public static int stepWood4ID;
	public static int stepCobbleMossyID;
	public static int stepObsidianID;
	public static int stepIceID;
	public static int stepSnowID;
	public static int stepStonebrickMossyID;
	public static int stepStonebrickCrackedID;
	public static int stepNetherbrickID;
	public static int stepEndstoneID;
	public static int stepSandID;

	public static int stepStrawID;
	public static int stepLanternWoodID;
	public static int stepLanternIronID;
	
	//2980
	public static int stepWhiteStoneID;
	public static int stepWhiteCobblestoneID;
	public static int stepWhiteStonebrickID;
	public static int stepWhiteDoubleSlabID;
	public static int stepWhiteColumnID;
	public static int stepWhiteColumnHeadID;
	
	//2970
	public static int stepSandstoneStonebrickID;
	public static int stepSandstoneDoubleSlabID;
	public static int stepSandstoneColumnID;
	public static int stepSandstoneColumnHeadID;

	//2930
	public static int stepMarbleBlackCobblestoneID;
	public static int stepMarbleBlackStoneID;
	public static int stepMarbleBlackStonebrickID;
	public static int stepMarbleBlackDoubleSlabID;
	public static int stepMarbleBlackColumnID;
	public static int stepMarbleBlackColumnHeadID;

	//2920
	public static int stepAncientCobblestoneID;
	public static int stepAncientStoneID;
	public static int stepAncientStonebrickID;
	public static int stepAncientDoubleSlabID;
	public static int stepAncientColumnID;
	public static int stepAncientColumnHeadID;

	//2910
	public static int stepMarbleWhiteCobblestoneID;
	public static int stepMarbleWhiteStoneID;
	public static int stepMarbleWhiteStonebrickID;
	public static int stepMarbleWhiteDoubleSlabID;
	public static int stepMarbleWhiteColumnID;
	public static int stepMarbleWhiteColumnHeadID;

	//2940
	public static int stepWoodenStoneID;
	public static int stepWoodenStonebrickID;
	public static int stepWoodenDoubleSlabID;
	public static int stepWoodenColumnID;
	public static int stepWoodenColumnHeadID;

	//2950
	public static int stepWoodenLightStoneID;
	public static int stepWoodenLightStonebrickID;
	public static int stepWoodenLightDoubleSlabID;
	public static int stepWoodenLightColumnID;
	public static int stepWoodenLightColumnHeadID;

	//2900
	public static int stepIceCobblestoneID;
	public static int stepIceStonebrickID;
	public static int stepIceDoubleSlabID;
	public static int stepIceColumnID;
	public static int stepIceColumnHeadID;
	
	//2960
	public static int stepMarbleDamierID;
	public static int stepMetalID;

	/** New walls **/
	public static int wallSandstoneID;
	public static int wallPlankOakID;
	public static int wallBrickID;
	public static int wallStonebrickID;
	public static int wallNetherbrickID;
	public static int wallWoodOakID;
	public static int wallWoodFirID;
	public static int wallWoodBirchID;
	public static int wallWoodJungleID;

	public static int wallWhiteStoneID;
	public static int wallWhiteCobblestoneID;
	public static int wallWhiteStonebrickID;

	public static int wallMarbleWhiteStoneID;
	public static int wallMarbleWhiteStonebrickID;
	public static int wallMarbleWhiteCobblestoneID;

	public static int wallMarbleBlackStoneID;
	public static int wallMarbleBlackStonebrickID;
	public static int wallMarbleBlackCobblestoneID;

	public static int wallAncientStoneID;
	public static int wallAncientStonebrickID;
	public static int wallAncientCobblestoneID;

	public static int wallWoodenStoneID;
	public static int wallWoodenStonebrickID;

	public static int wallWoodenLightStoneID;
	public static int wallWoodenLightStonebrickID;

	public static int wallIceCobblestoneID;
	public static int wallIceStonebrickID;
	
	/** Fence **/
	public static int fenceWhiteStoneID;
	public static int fenceWhiteStonebrickID;
	public static int fenceWhiteCobblestoneID;
	
	public static int fenceMarbleWhiteStoneID;
	public static int fenceMarbleWhiteStonebrickID;
	public static int fenceMarbleWhiteCobblestoneID;
	
	public static int fenceMarbleBlackStoneID;
	public static int fenceMarbleBlackStonebrickID;
	public static int fenceMarbleBlackCobblestoneID;
	
	public static int fenceAncientStoneID;
	public static int fenceAncientStonebrickID;
	public static int fenceAncientCobblestoneID;
	
	public static int fenceWoodenStoneID;
	public static int fenceWoodenStonebrickID;
	
	public static int fenceWoodenLightStoneID;
	public static int fenceWoodenLightStonebrickID;
	
	public static int fenceIceCobblestoneID;
	public static int fenceIceStonebrickID;
	
	/** New stairs **/
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
	public static int stairEnderstoneID;
	public static int stairSandID;

	public static int stairStrawID;

	public static int stairWhiteStoneID;
	public static int stairWhiteStonebrickID;
	public static int stairWhiteCobblestoneID;

	public static int stairAncientStoneID;
	public static int stairAncientStonebrickID;
	public static int stairAncientCobblestoneID;

	public static int stairMarbleBlackStoneID;
	public static int stairMarbleBlackStonebrickID;
	public static int stairMarbleBlackCobblestoneID;

	public static int stairMarbleWhiteStoneID;
	public static int stairMarbleWhiteStonebrickID;
	public static int stairMarbleWhiteCobblestoneID;

	public static int stairIceCobblestoneID;
	public static int stairIceStonebrickID;

	public static int stairWoodenStoneID;
	public static int stairWoodenStonebrickID;

	public static int stairWoodenLightStoneID;
	public static int stairWoodenLightStonebrickID;
	
	public static int stairSandstoneStonebrickID;
	
	public static int stairMarbleDamierID;

	/** Lampions **/
	public static int lampionBlancID;
	public static int lampionBleuID;
	public static int lampionJauneID;
	public static int lampionVertID;
	public static int lampionRougeID;

	/** White blocs **/
	public static int whiteStoneID;
	public static int whiteCobblestoneID;
	public static int whiteStonebrickID;
	public static int whiteStonebrickRoundID;
	public static int whiteStoneDoubleSlabID;
	public static int whiteColumnID;
	public static int whiteColumnHeadID;
	
	public static int stonebrickColumnID;
	public static int stonebrickColumnHeadID;
	public static int stepStonebrickColumnID;
	public static int stepStonebrickColumnHeadID;
	
	/** Ice blocks **/
	//2800
	public static int iceCobblestoneID;
	public static int iceStonebrickID;
	public static int iceStonebrickRoundID;
	public static int iceDoubleSlabID;
	public static int iceColumnHeadID;
	public static int iceColumnID;

	/** Black marble **/
	//2830
	public static int marbleBlackCobblestoneID;
	public static int marbleBlackStoneID;
	public static int marbleBlackStonebrickID;
	public static int marbleBlackStonebrickRoundID;
	public static int marbleBlackDoubleSlabID;
	public static int marbleBlackColumnID;
	public static int marbleBlackColumnHeadID;

	public static int marbleDamierID;

	/** Ancient stone **/
	//2820
	public static int ancientCobblestoneID;
	public static int ancientStoneID;
	public static int ancientStonebrickID;
	public static int ancientStonebrickRoundID;
	public static int ancientDoubleSlabID;
	public static int ancientColumnID;
	public static int ancientColumnHeadID;

	/** White marble **/
	//2810
	public static int marbleWhiteCobblestoneID;
	public static int marbleWhiteStoneID;
	public static int marbleWhiteStonebrickID;
	public static int marbleWhiteStonebrickRoundID;
	public static int marbleWhiteDoubleSlabID;
	public static int marbleWhiteColumnID;
	public static int marbleWhiteColumnHeadID;

	/** Wood **/
	//2840
	public static int woodenStoneID;
	public static int woodenStonebrickID;
	public static int woodenStonebrickRoundID;
	public static int woodenDoubleSlabID;
	public static int woodenColumnID;
	public static int woodenColumnHeadID;

	/** Wood light **/
	//2850
	public static int woodenLightStoneID;
	public static int woodenLightStonebrickID;
	public static int woodenLightStonebrickRoundID;
	public static int woodenLightDoubleSlabID;
	public static int woodenLightColumnID;
	public static int woodenLightColumnHeadID;

	/** Metal **/
	//2860
	public static int metalGridID;
	public static int metalStonebrickID;
	public static int metalStonebrickRoundID;
	public static int metalDoubleSlabID;

	/** Sandstone new **/
	public static int sandstoneStonebrickID;
	public static int sandstoneStonebrickRoundID;
	public static int sandstoneDoubleSlabID;
	public static int sandstoneColumnID;
	public static int sandstoneColumnHeadID;

	/** Bloc Minerais **/
	//public static int redstoneBlockID;
	//public static int coalBlockID;

	/** Autres **/
	//public static int strawID;
	public static int PHOnoirID;
	public static int PHOblancID;
	public static int woeBlockID;
	public static int invisibleBlockID;
	public static int pikeID;
	public static int portalPurpleID;
	public static int crateID;
	public static int shojiID;
	public static int tuileArdoiseID;
	public static int obsidianBlockID;

	/** Lumineux **/
	public static int ironLanternID;
	public static int woodenLanternID;

	/** Chain, ropes **/
	public static int chainIronID;
	public static int chainRopeID;
	
	/**Blocs glacee**/
	public static int logGlaceeID;
	public static int leavesGlaceeClairID;
	public static int leavesGlaceeID;
	public static int plankGlaceeID;

	/** Balustrades **/
	public static int marbleBlackAnvilID;
	public static int marbleBlackStonebrickAnvilID;
	public static int marbleWhiteAnvilID;
	public static int marbleWhiteStonebrickAnvilID;
	public static int whiteStoneAnvilID;
	public static int whiteStonebrickAnvilID;
	public static int ancientStoneAnvilID;
	public static int ancientStonebrickAnvilID;
	public static int sandstoneStonebrickAnvilID;
	public static int iceStonebrickAnvilID;
	
	public static int woodenStoneAnvilID;
	public static int woodenStonebrickAnvilID;

	public static int logAnvilID;
	public static int woodAnvilID;
	public static int woodNormalAnvilID;
	public static int woodLightAnvilID;
	public static int woodDarkAnvilID;

	/** Red rock **/
	//3260
	public static int redGrassID;
	public static int redGravelID;
	public static int beigeLinesID;
	public static int beigeRockID;
	public static int redSilverID;
	public static int silverBlockID;

	/** Tuiles **/
	public static int tuileRedID;
	public static int tuileBlackID;
	public static int tuileBlueID;
	public static int tuileRedBigID;
	public static int tuileBlackBigID;
	public static int tuileBlueBigID;
	public static int tuileBlackAltID;

	/** New rock **/
	//3270
	public static int greyRockID;
	public static int greyRockGrassID;
	public static int brownRockID;
	public static int brownRockGrassID;
	public static int darkRockID;
	public static int darkRockGrassID;
	public static int blackRockID;
	public static int lavaRockID;
	public static int lavaRockRedID;

	/** Surface **/
	public static int surfacePlankOakID;
	public static int surfacePlankFirID;
	public static int surfacePlankBirchID;
	public static int surfacePlankJungleID;

	public static int surfaceGrassID;
	public static int surfaceDirtID;
	public static int surfaceGravelID;
	public static int surfaceStoneID;

	public static int surfaceLogOakID;
	public static int surfaceLogFirID;
	public static int surfaceLogBirchID;
	public static int surfaceLogJungleID;
	
	public static int surfaceStonebrickID;

	public static int tapisPlankID;
	public static int tapisPlankDarkID;
	public static int tapisLogID;
	public static int tapisLogDarkID;
	
	/** Herbe haute **/
	public static int highGrassSavanaTopID;
	public static int highGrassSavanaBotID;

	public static int highGrassMagicBotID;
	public static int highGrassMagicTopID;
	
	/**Liquide**/
	public static int liquideVertFlowingID;
	public static int liquideVertStillID;
	public static int liquideVioletFlowingID;
	public static int liquideVioletStillID;

	/** Cristaux **/
	public static int cristalBlockID;
	public static int cristalLittleID;
	public static int cristalBigID;

	/** Colombages **/
	public static int colombageCarreID;
	public static int colombageCroiseID;
	public static int colombageVerticalID;
	public static int colombageHorizontalID;
	public static int colombageGaucheID;
	public static int colombageDroiteID;

	public static int fenetreFerID;
	public static int fenetreFerPaneID;

	public static int colombageCarreFonceID;
	public static int colombageCroiseFonceID;
	public static int colombageVerticalFonceID;
	public static int colombageHorizontalFonceID;
	public static int colombageGaucheFonceID;
	public static int colombageDroiteFonceID;

	/** Enseignes **/

	public static int enseigneAlchimieID;
	public static int enseigneBanqueID;
	public static int enseigneForgeID;
	public static int enseigneBouclierID;
	public static int enseigneSanctuaireID;
	public static int enseigneArmurerieID;
	public static int enseigneLibrairieID;
	public static int enseigneRestaurantID;
	public static int enseigneTaverneID;
	public static int enseigneMateriauxID;
	public static int enseigneAubergeID;
	public static int enseigneEcurieID;
	public static int enseigneDiamantID;
	public static int enseignePhoID;
	public static int enseigneCristalID;

	/** Stair tuiles **/
	public static int stairTuileRedID;
	public static int stairTuileBlackID;
	public static int stairTuileBlueID;
	public static int stairTuileRedBigID;
	public static int stairTuileBlackBigID;
	public static int stairTuileBlueBigID;
	public static int stairTuileBlackAltID;

	/** Step tuile **/
	public static int stepTuileRedID;
	public static int stepTuileBlueID;
	public static int stepTuileBlackID;
	public static int stepTuileRedBigID;
	public static int stepTuileBlueBigID;
	public static int stepTuileBlackBigID;
	public static int stepTuileBlackAltID;

	/** New logs **/
	public static int logCherryID;
	public static int logRedID;

	public static int meatBlockID;

	public static void loadConfig(FMLPreInitializationEvent e){
		Configuration config = new Configuration(e.getSuggestedConfigurationFile()); //Gets the file

		config.load(); //Loads it

		//Items
		/**Ingot**/
		diamondIngotID = config.getItem("Eclat de diamant", 30155).getInt();
		
		/**Projectile MageNoir
		projectileMNID = config.getItem("Projectile du Mage Noir", 29999).getInt();**/
		
		/**Projectile NPC**/
		projectileNPCBlancID = config.getItem("Projectile NPC Blanc", 30174).getInt();
		projectileNPCJauneID = config.getItem("Projectile NPC Jaune", 30175).getInt();
		projectileNPCVertID = config.getItem("Projectile NPC Vert", 30176).getInt();
		projectileNPCVioletID = config.getItem("Projectile NPC Violet", 30177).getInt();
		projectileNPCRougeID = config.getItem("Projectile NPC Rouge", 30178).getInt();
		projectileNPCGrisID = config.getItem("Projectile NPC Gris", 30179).getInt();
		projectileNPCBleuID = config.getItem("Projectile NPC Bleu", 30180).getInt();
		
		/**ItemsNPC**/
		sceptreRougeID = config.getItem("Sceptre Rouge", 30230).getInt();
		sceptreBleuID = config.getItem("Sceptre Bleu", 30231).getInt();
		sceptreVertID = config.getItem("Sceptre Vert", 30232).getInt();
		marteauBoisID = config.getItem("Marteau en bois", 30233).getInt();
		marteauPierreID = config.getItem("Marteau en pierre", 30234).getInt();
		marteauFerID = config.getItem("Marteau en fer", 30235).getInt();
		rapierID = config.getItem("Rapier", 30236).getInt();
		cartesID = config.getItem("Cartes de jeu", 30237).getInt();
		lameRuniqueID = config.getItem("Lame runique", 30238).getInt();
		
		/** Item gris **/
		batWingID = config.getItem("Ailes de chauve-souris", 30267).getInt();
		boarHornID = config.getItem("Defense de sanglier", 30274).getInt();
		bugWingID = config.getItem("Aile d'insecte", 30289).getInt();
		cricketLegID = config.getItem("Patte de criquet", 30290).getInt();
		bigcatHairID = config.getItem("Criniere feline", 30277).getInt();
		deerWoodID = config.getItem("Bois de cerf", 30278).getInt();
	   	duckLegID = config.getItem("Patte de canard", 30276).getInt();
	   	ectoplasmID = config.getItem("Ectoplasme", 30280).getInt();
	   	elephantSkinID = config.getItem("Peau d'elephant", 30295).getInt();
	   	enderJawID = config.getItem("Machoire d'enderman",30263).getInt();
	   	enderParticlesID = config.getItem("Particule d'enderman", 30264).getInt();
	   	foxTailID = config.getItem("Queue de renard", 30282).getInt();
	   	ghastTentacleID = config.getItem("Tentacule de ghast", 30262).getInt();
	   	goatHornID = config.getItem("Corne de chevre", 30287).getInt();
	   	honeyPotID = config.getItem("Pot de miel", 30275).getInt();
	   	horseHairID = config.getItem("Crin de cheval", 30273).getInt();
	   	jellyJamID = config.getItem("Confiture de meduse", 30286).getInt();
	   	mouseMustacheID = config.getItem("Moustache de souris",30271).getInt();
	   	ostrichFeatherID = config.getItem("Plume d'autruche", 31741).getInt();
	   	pigLegID = config.getItem("Pied de porc",30294).getInt();
	   	rabbitFootID = config.getItem("Patte de lapin", 30268).getInt();
	   	redFabricID = config.getItem("Bout de tissu rouge",30279).getInt();
	   	reptileToothID = config.getItem("Dent de reptile", 30285).getInt();
	   	scorpionStingID = config.getItem("Dard de scorpion", 30284).getInt();
	   	sharkFinID = config.getItem("Nageoire de requin",30283).getInt();
	   	skinCreeperID = config.getItem("Lambeau de creeper", 30260).getInt();
	   	smallFlameID = config.getItem("Flammeche",30266).getInt();
	   	snailShellID = config.getItem("Coquille d'escargot", 30291).getInt();
	   	snakeTongueID = config.getItem("Langue de vipere",30269).getInt();
	   	spiderLegsID = config.getItem("Pattes d'araignee",30261).getInt();
	   	spiderVenomID = config.getItem("Glande a venin", 30265).getInt();
	   	turtleShellID = config.getItem("Carapace de tortue",30270).getInt();
	   	whiteClothID = config.getItem("Drap blanc",30281).getInt();
		
		/**Poupee**/
		dollBlueID = config.getItem("Poupee bleu", 30181).getInt();
		dollBlackID = config.getItem("Poupee noire", 30182).getInt();
		pelucheMisterxfrID = config.getItem("Peluche MisterXFr", 30183).getInt();
		pelucheJolirougeID = config.getItem("Peluche Jolirouge", 30184).getInt();
		pelucheIplayID = config.getItem("Peluche Iplay4You", 30185).getInt();
		pelucheMikefraiseID = config.getItem("Peluche Mikefraise", 30186).getInt();
		pelucheDeezID = config.getItem("Peluche Deez", 30187).getInt();
		pelucheNicodelpraID = config.getItem("Peluche Nicodelpra", 30188).getInt();
		pelucheDilandaufrID = config.getItem("Peluche DilandauFr", 30189).getInt();
		pelucheNissanID = config.getItem("Peluche Nissan8", 30190).getInt();
		pelucheBbphokID = config.getItem("Peluche BBphok", 30191).getInt();
		pelucheBenditoID = config.getItem("Peluche Bendito78", 30192).getInt();
		pelucheSoenguyID = config.getItem("Peluche SoEnguy", 30193).getInt();
		pelucheChtimarchosID = config.getItem("Peluche Chtimarchos", 30194).getInt();
		pelucheXdakotaID = config.getItem("Peluche xDakota", 30195).getInt();
		pelucheLoupfeucgID = config.getItem("Peluche Loupfeucg", 30196).getInt();
		pelucheTedrakID = config.getItem("Peluche Tedrak50", 30197).getInt();
		
		/**Key**/
		goldKeyID = config.getItem("Cle de donjon d or", 30145).getInt();
		silverKeyID = config.getItem("Cle de donjon d argent", 30146).getInt();
		bronzeKeyID = config.getItem("Cle de donjon de bronze", 30147).getInt();
		goldSmallKeyID = config.getItem("Cle d or", 30148).getInt();
		silverSmallKeyID = config.getItem("Cle d argent", 30149).getInt();
		bronzeSmallKeyID = config.getItem("Cle de bronze", 30150).getInt();

		/**Coin**/
		bronzeCoinID = config.getItem("Hardcoin de bronze", 30151).getInt();
		silverCoinID = config.getItem("Hardcoin d argent", 30152).getInt();
		goldCoinID = config.getItem("Hardcoin d or", 30153).getInt();
		diamondCoinID = config.getItem("Hardcoin de diamant", 30154).getInt();
		
		/** Enchant **/
	   enchantSharpnessT1SmallID = config.getItem("Petite rune de puissance mineure",10259).getInt();
	   enchantSharpnessT1MediumID = config.getItem("Petite rune de puissance",10260).getInt();
	   enchantSharpnessT1BigID = config.getItem("Petite rune de puissance majeure",10261).getInt();
	   enchantSharpnessT2SmallID = config.getItem("Rune de puissance mineure",10262).getInt();
	   enchantSharpnessT2MediumID = config.getItem("Rune de puissance",10263).getInt();
	   enchantSharpnessT2BigID = config.getItem("Rune de puissance majeure",10264).getInt();
	   enchantSharpnessT3SmallID = config.getItem("Grande rune de puissance mineure",10265).getInt();
	   enchantSharpnessT3MediumID = config.getItem("Grande rune de puissance",10266).getInt();
	   enchantSharpnessT3BigID = config.getItem("Grande rune de puissance majeure",10267).getInt();
	   
	   enchantSmiteT1SmallID = config.getItem("Petite rune de chatiment mineure",10268).getInt();
	   enchantSmiteT1MediumID = config.getItem("Petite rune de chatiment",10269).getInt();
	   enchantSmiteT1BigID = config.getItem("Petite rune de chatiment majeure",10270).getInt();
	   enchantSmiteT2SmallID = config.getItem("Rune de chatiment mineure",10271).getInt();
	   enchantSmiteT2MediumID = config.getItem("Rune de chatiment",10272).getInt();
	   enchantSmiteT2BigID = config.getItem("Rune de chatiment majeure",10273).getInt();
	   enchantSmiteT3SmallID = config.getItem("Grande rune de chatiment mineure",10274).getInt();
	   enchantSmiteT3MediumID = config.getItem("Grande rune de chatiment",10275).getInt();
	   enchantSmiteT3BigID = config.getItem("Grande rune de chatiment majeure",10276).getInt();
	   
	   enchantProtectionT1SmallID = config.getItem("Petite rune de protection mineure",10277).getInt();
	   enchantProtectionT1BigID = config.getItem("Petite rune de protection majeure",10278).getInt();
	   enchantProtectionT2SmallID = config.getItem("Rune de protection mineure",10279).getInt();
	   enchantProtectionT2BigID = config.getItem("Rune de protection majeure",10280).getInt();
	   enchantProtectionT3SmallID = config.getItem("Grande rune de protection mineure",10281).getInt();
	   enchantProtectionT3BigID = config.getItem("Grande rune de protection majeure",10282).getInt();
	   
	   enchantBaneofT1SmallID = config.getItem("Petite rune du fleau mineure",10283).getInt();
	   enchantBaneofT1MediumID = config.getItem("Petite rune du fleau",10284).getInt();
	   enchantBaneofT1BigID = config.getItem("Petite rune du fleau majeure",10285).getInt();
	   enchantBaneofT2SmallID = config.getItem("Rune du fleau mineure",10286).getInt();
	   enchantBaneofT2MediumID = config.getItem("Rune du fleau",10287).getInt();
	   enchantBaneofT2BigID = config.getItem("Rune du fleau majeure",10288).getInt();
	   enchantBaneofT3SmallID = config.getItem("Grande rune du fleau mineure",10289).getInt();
	   enchantBaneofT3MediumID = config.getItem("Grande rune du fleau",10290).getInt();
	   enchantBaneofT3BigID = config.getItem("Grande rune du fleau majeure",10291).getInt();
	   
	   enchantEfficacityT1SmallID = config.getItem("Petite rune de rapidite mineure",10292).getInt();
	   enchantEfficacityT1MediumID = config.getItem("Petite rune de rapidite",10293).getInt();
	   enchantEfficacityT1BigID = config.getItem("Petite rune de rapidite majeure",10294).getInt();
	   enchantEfficacityT2SmallID = config.getItem("Rune de rapidite mineure",10295).getInt();
	   enchantEfficacityT2MediumID = config.getItem("Rune de rapidite",10296).getInt();
	   enchantEfficacityT2BigID = config.getItem("Rune de rapidite majeure",10297).getInt();
	   enchantEfficacityT3SmallID = config.getItem("Grande rune de rapidite mineure",10298).getInt();
	   enchantEfficacityT3MediumID = config.getItem("Grande rune de rapidite",10299).getInt();
	   enchantEfficacityT3BigID = config.getItem("Grande rune de rapidite majeure",10300).getInt();
	   
	   enchantDurabilityT1SmallID = config.getItem("Petite rune de solidite mineure",10301).getInt();
	   enchantDurabilityT1MediumID = config.getItem("Petite rune de solidite",10302).getInt();
	   enchantDurabilityT1BigID = config.getItem("Petite rune de solidite majeure",10303).getInt();
	   enchantDurabilityT2SmallID = config.getItem("Rune de solidite mineure",10304).getInt();
	   enchantDurabilityT2MediumID = config.getItem("Rune de solidite",10305).getInt();
	   enchantDurabilityT2BigID = config.getItem("Rune de solidite majeure",10306).getInt();
	   enchantDurabilityT3SmallID = config.getItem("Grande rune de solidite mineure",10307).getInt();
	   enchantDurabilityT3MediumID = config.getItem("Grande rune de solidite",10308).getInt();
	   enchantDurabilityT3BigID = config.getItem("Grande rune de solidite majeure",10309).getInt();
	   
	   enchantFlameT1SmallID = config.getItem("Petite rune d embrasement mineure",10310).getInt();
	   enchantFlameT1BigID = config.getItem("Petite rune d embrasement majeure",10311).getInt();
	   enchantFlameT2SmallID = config.getItem("Rune d embrasement mineure",10312).getInt();
	   enchantFlameT2BigID = config.getItem("Rune d embrasement majeure",10313).getInt();
	   enchantFlameT3SmallID = config.getItem("Grande rune d embrasement mineure",10314).getInt();
	   enchantFlameT3BigID = config.getItem("Grande rune d embrasement majeure",10315).getInt();
	   
	   enchantKnockbackT1SmallID = config.getItem("Petite rune de repulsion mineure",10316).getInt();
	   enchantKnockbackT1BigID = config.getItem("Petite rune de repulsion majeure",10317).getInt();
	   enchantKnockbackT2SmallID = config.getItem("Rune de repulsion mineure",10318).getInt();
	   enchantKnockbackT2BigID = config.getItem("Rune de repulsion majeure",10319).getInt();
	   enchantKnockbackT3SmallID = config.getItem("Grande rune de repulsion mineure",10320).getInt();
	   enchantKnockbackT3BigID = config.getItem("Grande rune de repulsion majeure",10321).getInt();
		
		/**Trophee**/
		trophyGoldID = config.getItem("Trophee d or", 30400).getInt();
		trophySilverID = config.getItem("Trophee d argent", 30401).getInt();
		trophyBronzeID = config.getItem("Trophee de bronze", 30402).getInt();
		trophyGoldChipID = config.getItem("Trophee d or ebreche", 30403).getInt();
		
		/**CacheOeil**/
		cacheOeilID = config.getItem("Cache Oeil", 30404).getInt();

		/**Food**/
		hamburgerFoodID = config.getItem("Hamburger", 30200).getInt();
		fritesFoodID = config.getItem("Frites", 30201).getInt();
		kfcFoodID = config.getItem("Nuggets", 30202).getInt();
		oeufFoodID = config.getItem("Oeufs", 30203).getInt();
		baconFoodID = config.getItem("Bacon", 30204).getInt();
		fromageFoodID = config.getItem("Fromage", 30205).getInt();
		makiFoodID = config.getItem("Maki", 30206).getInt();
		sushiFoodID = config.getItem("Sushi", 30207).getInt();
		brochetteFoodID = config.getItem("Brochette", 30208).getInt();
		rhumID = config.getItem("Rhum", 30209).getInt();

		/**Plantes**/
		seedHoublonID = config.getItem("Graine de houblon", 30220).getInt();
		/**cropHoublonID = config.getItem("Pousse de houblon", 3820).getInt();**/
		houblonID = config.getItem("Houblon", 30221).getInt();

		/** Stair tuile **/
		stairTuileRedID = config.getBlock("Escalier de tuile rouge", 3136).getInt();
		stairTuileBlackID = config.getBlock("Escalier de tuile noire", 3137).getInt();
		stairTuileBlueID = config.getBlock("Escalier de tuile bleue", 3138).getInt();
		stairTuileRedBigID = config.getBlock("Escalier de grande tuile rouge", 3139).getInt();
		stairTuileBlackBigID = config.getBlock("Escalier de grande tuile noire", 3140).getInt();
		stairTuileBlueBigID = config.getBlock("Escalier de grande tuile bleu", 3141).getInt();
		stairTuileBlackAltID = config.getBlock("Escalier de tuile noire dechaussee", 3142).getInt();

		/** New logs **/
		logRedID = config.getBlock("Buche Rouge", 2436).getInt();
		logCherryID = config.getBlock("Bois de cerisier", 2435).getInt();

		/** Step tuile **/
		stepTuileRedID = config.getBlock("Demi-dalle de tuile rouge", 3143).getInt();
		stepTuileBlackID = config.getBlock("Demi-dalle de tuile noire", 3144).getInt();
		stepTuileBlueID = config.getBlock("Demi-dalle de tuile bleu", 3145).getInt();
		stepTuileRedBigID = config.getBlock("Demi-dalle de grande tuile rouge", 3146).getInt();
		stepTuileBlackBigID = config.getBlock("Demi-dalle de grande tuile noire", 3147).getInt();
		stepTuileBlueBigID = config.getBlock("Demi-dalle de grande tuile bleu", 3148).getInt();
		stepTuileBlackAltID = config.getBlock("Demi-dalle de tuile noire dechaussee", 3149).getInt();

		/** Mysterious **/
		flowerMysteriousID = config.getBlock("Fleur mysterieuse", 2702).getInt();
		plantMysteriousID = config.getBlock("Plante mysterieuse", 2703).getInt();
		coralMysteriousID = config.getBlock("Corail mysterieux", 2704).getInt();
		algueMysteriousID = config.getBlock("Algue mysterieuse", 2705).getInt();
		grassMysteriousID = config.getBlock("Herbe mysterieuse", 2706).getInt();
		grass2MysteriousID = config.getBlock("Herbe mysterieuse 2", 2714).getInt();
		logMysteriousID = config.getBlock("Buche mysterieuse", 2707).getInt();
		leavesMysteriousID = config.getBlock("Feuilles mysterieuses", 2708).getInt();;
		leaves2MysteriousID = config.getBlock("Feuilles mysterieuses violettes", 2709).getInt();
		stoneMysteriousID = config.getBlock("Pierre mysterieuse", 3116).getInt();
		dirtMysteriousID = config.getBlock("Terre mysterieuse", 3117).getInt();
		grassBlockMysteriousID = config.getBlock("Bloc d'herbe mysterieuse", 3118).getInt();
		sugarcaneMysteriousID = config.getBlock("Canne a sucre mysterieuse", 3119).getInt();

		/**Aquaculture**/
		cannepecheID = config.getItem("Canne a peche", 30157).getInt();

		/**Loot**/
		coeurLootID = config.getItem("Coeur", 30000).getInt();
		cerveauLootID = config.getItem("Cerveau de zombie", 30001).getInt();
		brasLootID = config.getItem("Bras de zombie", 30002).getInt();
		poudreMagieID = config.getItem("Poudre de magie", 30003).getInt();

		/**Insignes**/
		valysInsignesID = config.getItem("Insigne de Valys", 30130).getInt();
		chasseInsignesID = config.getItem("Insigne de chasse", 30131).getInt();
		guerreInsignesID = config.getItem("Insigne d guerre", 30132).getInt();
		agricultureInsignesID = config.getItem("Insigne d agriculture", 30133).getInt();
		gastronomieInsignesID = config.getItem("Insigne de gastronomie", 30134).getInt();
		minageInsignesID = config.getItem("Insigne de minage", 30135).getInt();
		artisanatInsignesID = config.getItem("Insigne d artisanat", 30136).getInt();
		villeInsignesID = config.getItem("Insigne de ville", 30137).getInt();
		pecheInsignesID = config.getItem("Insigne de peche", 30138).getInt();
		explorationInsignesID = config.getItem("Insigne d exploration", 30139).getInt();
		constructionInsignesID = config.getItem("Insigne de construction", 30140).getInt();
		guildeInsignesID = config.getItem("Insigne de guilde", 30141).getInt();
		victoireInsignesID = config.getItem("Insigne de victoire", 30142).getInt();
		participationInsignesID = config.getItem("Insigne de participation", 30143).getInt();
		magieInsignesID = config.getItem("Insigne de magie", 30144).getInt();

		/** Quest - Nezaril **/
		nezarilJarID = config.getItem("Urne de Nezaril (vide)", 30250).getInt();
		nezarilJarFullID = config.getItem("Urne de Nezaril (pleine)", 30251).getInt();
		redDragonEggID = config.getItem("Oeuf de dragon rouge", 30252).getInt();
		
		/** Quest **/
		boulonID = config.getItem("Boulon - Quete", 27300).getInt();
		briqueDeSableID = config.getItem("Brique de sable - Quete", 27301).getInt();
		buchetteID = config.getItem("Buchette - Quete", 27302).getInt();
		buchetteSombreID = config.getItem("Buchette sombre - Quete", 27303).getInt();
		caisseID = config.getItem("Caisse - Quete", 27304).getInt();
		liquideBleuID = config.getItem("Liquide bleu - Quete", 27305).getInt();
		liquideCyanID = config.getItem("Liquide cyan - Quete", 27306).getInt();
		liquideJauneID = config.getItem("Liquide jaune - Quete", 27307).getInt();
		liquideOrangeID = config.getItem("Liquide orange - Quete", 27308).getInt();
		liquideRoseID = config.getItem("Liquide rose - Quete", 27309).getInt();
		liquideRougeID = config.getItem("Liquide rouge - Quete", 27310).getInt();
		liquideVertID = config.getItem("Liquide vert - Quete", 27311).getInt();
		liquideVioletID = config.getItem("Liquide violet - Quete", 27312).getInt();
		tuyauID = config.getItem("Tuyau - Quete", 27313).getInt();
		visID = config.getItem("Vis - Quete", 27314).getInt();
		couponTutoID = config.getItem("Coupon tutoriel - Quete", 27315).getInt();
		bandageID = config.getItem("Bandage - Quete", 27316).getInt();
		sceptreOrID = config.getItem("Sceptre dor - Quete", 27317).getInt();
		epeeBlancheID = config.getItem("Relique - Quete", 27318).getInt();
		sucreriesID = config.getItem("Sucreries - Quete", 27319).getInt();
		grimoireSethID = config.getItem("Grimoire de Seth - Quete", 27320).getInt();
		totemMageID = config.getItem("Totem de Mage - Quete", 27321).getInt();
		grimoireTelgaradID = config.getItem("Grimoire de Telgarad - Quete", 27322).getInt();
		grimoireTelsalorID = config.getItem("Grimoire de Telsalor - Quete", 27323).getInt();
		recommandationHakathID = config.getItem("Recommandation Hakath - Quete", 27324).getInt();
		recommandationLomakothID = config.getItem("Recommandation Lomakoth - Quete", 27325).getInt();
		pistoletID = config.getItem("Pistolet - Quete", 27326).getInt();
		jambeBoisID = config.getItem("Jambe de bois - Quete", 27327).getInt();
		medaillonID = config.getItem("Medaillon de pirate - Quete", 27328).getInt();
		longuevueID = config.getItem("Longue-vue - Quete", 27329).getInt();
		clePrisonValysID = config.getItem("Cle prison Valys - Quete", 27330).getInt();
		boursePetiteID = config.getItem("Petite bourse HC - Quete", 27331).getInt();
		bourseMoyenneID = config.getItem("Moyenne bourse HC - Quete", 27332).getInt();
		bourseGrandeID = config.getItem("Grande bourse HC - Quete", 27333).getInt();
		grimoireApprentiID = config.getItem("Grimoire Apprenti - Quete", 27334).getInt();
		vanishID = config.getItem("Vanish - Quete", 27335).getInt();
		enveloppeID = config.getItem("Enveloppe - Quete", 27336).getInt();
		batonAdaoldanID = config.getItem("Baton Adaoldan - Quete", 27337).getInt();
		batonAdaoldanEnchantID = config.getItem("Baton Adaoldan Enchant - Quete", 27338).getInt();
		fragmentAdaoldanID = config.getItem("Fragment Adaoldan - Quete", 27339).getInt();
		projectileArcaniqueID = config.getItem("Projectile arcanique - Quete", 27340).getInt();
		marteauForgeronID = config.getItem("Marteau forgeron - Quete", 27341).getInt();
		lameRuniqueEmeraudeID = config.getItem("Lame Runique Emeraude - Quete", 27342).getInt();
		
		/**Legendaire**/
		nocturneLegendaireID = config.getItem("Baton nocturne", 30100).getInt();
		diurneLegendaireID = config.getItem("Baton de jour", 30101).getInt();
		teddyBearID = config.getItem("Ours en peluche", 30102).getInt();
		
		/**Sword**/
		poeleSwordID = config.getItem("Poele a frire", 30158).getInt();

		/**Rotationnator**/
		rotatorID = config.getItem("Le Rotationnator", 30159).getInt();
		
		/**Table craft portable**/
		pocketCraftingTableID = config.getItem("Table de craft portable", 30156).getInt();

		/**Blocks**/
		meatBlockID = config.getBlock("Bloc de viande", 3207).getInt();
		caisseVaillantID = config.getBlock("Caisse du Vaillant", 3208).getInt();
		leatherBlockID = config.getBlock("Bloc de cuir", 3800).getInt();
		lavaBlockID = config.getBlock("Bloc de lave", 3801).getInt();
		waterBlockID = config.getBlock("Bloc d eau", 3802).getInt();
		tonneauBlockID = config.getBlock("Tonneau", 3803).getInt();
		escaladeBlockID = config.getBlock("Bloc d escalade", 3804).getInt();
		slimeBlockID = config.getBlock("Bloc de slime", 3805).getInt();
		roseBlockID = config.getBlock("Vignes de roses", 3806).getInt();
		cakeLieBlockID = config.getBlock("Cake", 3807).getInt();
		meatCakeBlockID = config.getBlock("Viande", 3808).getInt();
		simpleDirtBlockID = config.getBlock("Terre classique", 3809).getInt();
		grisouBlockID = config.getBlock("Bloc grisou", 4081).getInt();
		fossileBlockID = config.getBlock("Bloc Fossile", 4086).getInt();
		caisseBlockID = config.getBlock("Caisse", 4087).getInt();
		bucheCompleteBlockID = config.getBlock("Buche complete", 4091).getInt();
		bucheFonceCompleteBlockID = config.getBlock("Buche fonce complete", 4092).getInt();
		caisseBlockBotID = config.getBlock("Grande caisse", 2404).getInt();
		caisseBlockTopID = config.getBlock("Grande caisse (haut)", 2405).getInt();
		batonTorcheBotID = config.getBlock("Baton lumineux", 2406).getInt();
		batonTorcheTopID = config.getBlock("Baton lumineux (haut)", 2407).getInt();
		batonBougieBotID = config.getBlock("Baton de bougie lumineux", 2408).getInt();
		batonBougieTopID = config.getBlock("Baton de bougie lumineux (haut)", 2409).getInt();
		batonLanterneBotID = config.getBlock("Baton de lanterne lumineux", 2410).getInt();
		batonLanterneTopID = config.getBlock("Baton de lanterne lumineux (haut)", 2411).getInt();
		
		darkStoneID = config.getBlock("Pierre sombre", 3280).getInt();
		darkCobblestoneID = config.getBlock("Cobblestone sombre", 3281).getInt();
		darkLeavesID = config.getBlock("Feuilles sombres", 3282).getInt();
		darkDirtID = config.getBlock("Terre sombre", 3283).getInt();
		darkGrassID = config.getBlock("Herbe sombre", 3284).getInt();
		darkLogID = config.getBlock("Bois sombre", 3285).getInt();
		
		ropeRailID = config.getBlock("Cordage", 3253).getInt();
		
		/**Basalt**/
		basaltID = config.getBlock("Basalt", 4088).getInt();
		basaltCobblestoneID = config.getBlock("Cobblestone de basalt", 4089).getInt();
		basaltBrickID = config.getBlock("Brique de basalt", 4090).getInt();

		/**Lumiere**/
		lumiereBougieID = config.getBlock("Bougie", 4082).getInt();
		lumiereLanterneID = config.getBlock("Lanterne", 4083).getInt();
		lumiereSkullID = config.getBlock("Bougie en crane", 4084).getInt();
		lumiereSkullSimpleID = config.getBlock("Bougie simple en crane", 4085).getInt();
		
		/**Frigo**/
		offFrigoID = config.getBlock("Frigo", 3850).getInt();
		onFrigoID = config.getBlock("Frigo Actif", 3851).getInt();

		/**Drapeau**/
		/**bannerID = config.getBlock("Drapeau 1", 3854).getInt();**/

		/**Trapes**//*
		stoneTrapID = config.getBlock("Trappe en stone", 3830).getInt();
		dirtTrapID = config.getBlock("Trappe en dirt", 3831).getInt();
		logTrapID = config.getBlock("Trappe en bois", 3832).getInt();
		stoneBrickTrapID = config.getBlock("Trappe en stonebrick", 3833).getInt();
		woodTrapID = config.getBlock("Trappe en bois normal", 3834).getInt();
		woodLightTrapID = config.getBlock("Trappe en bois blanc", 3835).getInt();
		woodNormalTrapID = config.getBlock("Trappe en bois brun", 3836).getInt();
		woodDarkTrapID = config.getBlock("Trappe en bois fonce", 3837).getInt();
		
	    /**Doors**//*
	    stoneDoorID = config.getBlock("Porte en stone", 3900).getInt();
	    stoneItemDoorID = config.getBlock("Porte en stone", 30300).getInt();
	    dirtDoorID = config.getBlock("Porte en terre", 3901).getInt();
	    dirtItemDoorID = config.getBlock("Porte en terre", 30301).getInt();
	    logDoorID = config.getBlock("Porte en bois", 3902).getInt();
	    logItemDoorID = config.getBlock("Porte en bois", 30302).getInt();
	    stoneBrickDoorID = config.getBlock("Porte en stonebrick", 3903).getInt();
	    stoneBrickItemDoorID = config.getBlock("Porte en stonebrick", 30303).getInt();
	    woodDoorID = config.getBlock("Porte en bois normal", 3904).getInt();
	    woodItemDoorID = config.getBlock("Porte en bois normal", 30304).getInt();
	    woodLightDoorID = config.getBlock("Porte en bois blanc", 3905).getInt();
	    woodLightItemDoorID = config.getBlock("Porte en bois blanc", 30305).getInt();
	    woodNormalDoorID = config.getBlock("Porte en bois brun", 3906).getInt();
	    woodNormalItemDoorID = config.getBlock("Porte en bois brun", 30306).getInt();
	    woodDarkDoorID = config.getBlock("Porte en bois fonce", 3907).getInt();
	    woodDarkItemDoorID = config.getBlock("Porte en bois fonce", 30307).getInt();

		/**Potions**/
		celeritePotionID = config.getItem("Potion de celerite", 30160).getInt();
		fatiguePotionID = config.getItem("Potion de fatigue", 30161).getInt();
		sautPotionID = config.getItem("Potion de saut", 30162).getInt();
		confusionPotionID = config.getItem("Potion de confusion", 30163).getInt();
		resistancePotionID = config.getItem("Potion de resistance", 30164).getInt();
		apneePotionID = config.getItem("Potion d apnee", 30165).getInt();
		cecitePotionID = config.getItem("Potion de cecite", 30166).getInt();
		faimPotionID = config.getItem("Potion de faim", 30167).getInt();
		witherPotionID = config.getItem("Potion de wither", 30168).getInt();

		/**Splash**/
		testSplashID = config.getItem("EnDev", 30169).getInt();

		/**Custom Potion**/
		customPotionWaterWalkID = config.getItem("Potion de marche sur eau", 30170).getInt();
		customPotionLavaWalkID = config.getItem("Potion de marche sur lave", 30171).getInt();
		customPotionNoFallID = config.getItem("Potion de resistance a la chute", 30172).getInt();

		/**Coraux**/
		coralOrangeID = config.getBlock("Corail orange", 3810).getInt();
		coralGreenID = config.getBlock("Corail vert", 3811).getInt();
		coralPurpleID = config.getBlock("Corail violet", 3812).getInt();
		coralRoseID = config.getBlock("Corail rose", 3813).getInt();
		coralBlackID = config.getBlock("Corail noir", 3814).getInt();
		coralBlueID = config.getBlock("Corail bleu", 3815).getInt();
		coralBlockReefID = config.getBlock("Corail recif", 3816).getInt();
		coralBlockSpongeID = config.getBlock("Corail eponge", 3817).getInt();

		/** WTF
		isAwesome = config.get(config.CATEGORY_GENERAL, "Is the mod awesome", true).getBoolean(true); **/

		//Blocks
		/** Herbe haute **/
		highGrassSavanaBotID = config.getBlock("Herbe haute de savanne (bas)", 2400).getInt();
		highGrassSavanaTopID = config.getBlock("Herbe haute de savanne (haut)", 2401).getInt();

		highGrassMagicBotID = config.getBlock("Herbe haute magique (bas)", 2402).getInt();
		highGrassMagicTopID = config.getBlock("Herbe haute magique (haut)", 2403).getInt();

		/**Liquide**/
		liquideVertFlowingID = config.getBlock("Liquide vert", 3300).getInt();
		liquideVertStillID = config.getBlock("Liquide vert (stationnaire)", 3301).getInt();
		liquideVioletFlowingID = config.getBlock("Liquide violet", 3302).getInt();
		liquideVioletStillID = config.getBlock("Liquide violet (stationnaire)", 3303).getInt();
		
		/** Tuiles **/
		tuileRedID = config.getBlock("Tuile rouge", 2864).getInt();
		tuileBlackID = config.getBlock("Tuile noire", 2865).getInt();
		tuileBlueID = config.getBlock("Tuile bleu", 2866).getInt();
		tuileRedBigID = config.getBlock("Tuile rouge grande", 2867).getInt();
		tuileBlackBigID = config.getBlock("Tuile noire grande", 2868).getInt();
		tuileBlueBigID = config.getBlock("Tuile bleu grande", 2869).getInt();
		tuileBlackAltID = config.getBlock("Tuile noire dechaussee", 2870).getInt();

		/** Surface **/
		surfacePlankOakID = config.getBlock("Surface de planche en chene", 2500).getInt();
		surfacePlankFirID = config.getBlock("Surface de planche en pin", 2501).getInt();
		surfacePlankBirchID = config.getBlock("Surface de planche en bouleau", 2502).getInt();
		surfacePlankJungleID = config.getBlock("Surface de planche en jungle", 2503).getInt();

		surfaceGrassID = config.getBlock("Surface en herbe", 2504).getInt();
		surfaceDirtID = config.getBlock("Surface en terre", 2505).getInt();
		surfaceGravelID = config.getBlock("Surface en gravier", 2506).getInt();
		surfaceStoneID = config.getBlock("Surface en pierre", 2507).getInt();

		surfaceLogOakID = config.getBlock("Surface en buche de chene", 2508).getInt();
		surfaceLogFirID = config.getBlock("Surface en buche de pin", 2509).getInt();
		surfaceLogBirchID = config.getBlock("Surface en buche de bouleau", 2510).getInt();
		surfaceLogJungleID = config.getBlock("Surface en buche de jungle", 2511).getInt();
		
		surfaceStonebrickID = config.getBlock("Surface en stonebrick", 2512).getInt();
		
		tapisPlankID = config.getBlock("Tapis en planche", 2513).getInt();
		tapisPlankDarkID = config.getBlock("Tapis en planche sombre", 2514).getInt();
		tapisLogID = config.getBlock("Tapis en buche", 2515).getInt();
		tapisLogDarkID = config.getBlock("Tapis en buche sombre", 2516).getInt();
		
		/** New slabs **/
		stepWoolWhiteID = config.getBlock("Dalle de laine blanche", 3020).getInt();
		stepWoolOrangeID = config.getBlock("Dalle de laine orange",3021).getInt();
		stepWoolMagentaID = config.getBlock("Dalle de laine magenta",3022).getInt();
		stepWoolLightBlueID = config.getBlock("Dalle de laine bleu claire",3023).getInt();
		stepWoolYellowID = config.getBlock("Dalle de laine jaune",3024).getInt();
		stepWoolLightGreenID = config.getBlock("Dalle de laine verte claire",3025).getInt();
		stepWoolPinkID = config.getBlock("Dalle de laine rose",3026).getInt();
		stepWoolGrayID = config.getBlock("Dalle de laine grise",3027).getInt();
		stepWoolLightGrayID = config.getBlock("Dalle de laine grise claire",3028).getInt();
		stepWoolCyanID = config.getBlock("Dalle de laine cyan",3029).getInt();
		stepWoolPurpleID = config.getBlock("Dalle de laine violette",3030).getInt();
		stepWoolBlueID = config.getBlock("Dalle de laine bleu",3031).getInt();
		stepWoolBrownID = config.getBlock("Dalle de laine marron",3032).getInt();
		stepWoolGreenID = config.getBlock("Dalle de laine verte",3033).getInt();
		stepWoolRedID = config.getBlock("Dalle de laine rouge", 3034).getInt();
		stepWoolBlackID = config.getBlock("Dalle de laine noire", 3035).getInt();

		stepWoolWhiteLightID = config.getBlock("Dalle de laine blanche lumineuse",3120).getInt();
		stepWoolOrangeLightID = config.getBlock("Dalle de laine orange lumineuse",3121).getInt();
		stepWoolMagentaLightID = config.getBlock("Dalle de laine magenta lumineuse",3122).getInt();
		stepWoolLightBlueLightID = config.getBlock("Dalle de laine bleu claire lumineuse",3123).getInt();
		stepWoolYellowLightID = config.getBlock("Dalle de laine jaune lumineuse",3124).getInt();
		stepWoolLightGreenLightID = config.getBlock("Dalle de laine verte claire lumineuse",3125).getInt();
		stepWoolPinkLightID = config.getBlock("Dalle de laine rose lumineuse",3126).getInt();
		stepWoolGrayLightID = config.getBlock("Dalle de laine grise lumineuse",3127).getInt();
		stepWoolLightGrayLightID = config.getBlock("Dalle de laine grise claire lumineuse",3128).getInt();
		stepWoolCyanLightID = config.getBlock("Dalle de laine cyan lumineuse",3129).getInt();
		stepWoolPurpleLightID = config.getBlock("Dalle de laine violette lumineuse",3130).getInt();
		stepWoolBlueLightID = config.getBlock("Dalle de laine bleu lumineuse",3131).getInt();
		stepWoolBrownLightID = config.getBlock("Dalle de laine marron lumineuse",3132).getInt();
		stepWoolGreenLightID = config.getBlock("Dalle de laine verte lumineuse",3133).getInt();
		stepWoolRedLightID = config.getBlock("Dalle de laine rouge lumineuse",3134).getInt();
		stepWoolBlackLightID = config.getBlock("Dalle de laine noire lumineuse", 3135).getInt();

		stepGrassID = config.getBlock("Dalle en herbe", 3061).getInt();
		stepDirtID = config.getBlock("Dalle en terre", 3062).getInt();
		stepGravelID = config.getBlock("Dalle en gravier", 3063).getInt();
		stepWood1ID = config.getBlock("Dalle en bois (chene)", 3064).getInt();
		stepWood2ID = config.getBlock("Dalle en bois (pin)", 3065).getInt();
		stepWood3ID = config.getBlock("Dalle en bois (bouleau)", 3066).getInt();
		stepWood4ID = config.getBlock("Dalle en bois (jungle)",3067).getInt();
		stepCobbleMossyID = config.getBlock("Dalle en cobblestone moussue",3068).getInt();
		stepObsidianID = config.getBlock("Dalle en obsidienne", 3069).getInt();
		stepIceID = config.getBlock("Dalle en glace",3070).getInt();
		stepSnowID = config.getBlock("Dalle en neige",3071).getInt();
		stepStonebrickMossyID = config.getBlock("Dalle en stonebrick moussue",3072).getInt();
		stepStonebrickCrackedID = config.getBlock("Dalle en stonebrick craquee",3073).getInt();
		stepNetherbrickID = config.getBlock("Dalle en netherbrick", 3074).getInt();
		stepEndstoneID = config.getBlock("Dalle en pierre du neant",3075).getInt();
		stepSandID = config.getBlock("Dalle en sable",3076).getInt();
		
		//2930
		stepMarbleBlackCobblestoneID = config.getBlock("Demi-dalle de marbre noir fragmente", 2930).getInt();
		stepMarbleBlackStoneID = config.getBlock("Demi-dalle de marbre noir", 2931).getInt();
		stepMarbleBlackStonebrickID = config.getBlock("Demi-dalle de brique de Marbre noir", 2932).getInt();
		stepMarbleBlackDoubleSlabID = config.getBlock("Demi-dalle de dalle de Marbre noir", 2934).getInt();
		stepMarbleBlackColumnID = config.getBlock("Demi-dalle de colonne en Marbre noir", 2935).getInt();
		stepMarbleBlackColumnHeadID = config.getBlock("Demi-dalle de chapeau de Colonne en Marbre noir", 2936).getInt();

		//2920
		stepAncientCobblestoneID = config.getBlock("Demi-dalle de pierre ancienne fragmentee", 2920).getInt();
		stepAncientStoneID = config.getBlock("Demi-dalle de pierre ancienne", 2921).getInt();
		stepAncientStonebrickID = config.getBlock("Demi-dalle de brique de pierre ancienne", 2922).getInt();
		stepAncientDoubleSlabID = config.getBlock("Demi-dalle de dalle de pierre ancienne", 2924).getInt();
		stepAncientColumnID = config.getBlock("Demi-dalle de colonne en pierre ancienne", 2925).getInt();
		stepAncientColumnHeadID = config.getBlock("Demi-dalle de chapeau de colonne en pierre ancienne", 2926).getInt();

		//2910
		stepMarbleWhiteCobblestoneID = config.getBlock("Demi-dalle de marbre blanc fragmente", 2910).getInt();
		stepMarbleWhiteStoneID = config.getBlock("Demi-dalle de marbre blanc", 2911).getInt();
		stepMarbleWhiteStonebrickID = config.getBlock("Demi-dalle de brique de Marbre blanc", 2912).getInt();
		stepMarbleWhiteDoubleSlabID = config.getBlock("Demi-dalle de dalle de Marbre blanc", 2914).getInt();
		stepMarbleWhiteColumnID = config.getBlock("Demi-dalle de colonne de Marbre blanc", 2915).getInt();
		stepMarbleWhiteColumnHeadID = config.getBlock("Demi-dalle de chapeau de colonne de Marbre blanc", 2916).getInt();

		//2940
		stepWoodenStoneID = config.getBlock("Demi-dalle de bois lisse", 2940).getInt();
		stepWoodenStonebrickID = config.getBlock("Demi-dalle de brique de bois lisse", 2941).getInt();
		stepWoodenDoubleSlabID = config.getBlock("Demi-dalle de dalle de bois lisse", 2943).getInt();
		stepWoodenColumnID = config.getBlock("Demi-dalle de colonne en bois lisse", 2944).getInt();
		stepWoodenColumnHeadID = config.getBlock("Demi-dalle de chapeau de colonne en bois lisse", 2945).getInt();

		//2950
		stepWoodenLightStoneID = config.getBlock("Demi-dalle de bois clair lisse", 2950).getInt();
		stepWoodenLightStonebrickID = config.getBlock("Demi-dalle de brique de bois clair lisse", 2951).getInt();
		stepWoodenLightDoubleSlabID = config.getBlock("Demi-dalle de dalle de bois clair lisse", 2953).getInt();
		stepWoodenLightColumnID = config.getBlock("Demi-dalle de colonne en bois clair lisse", 2954).getInt();
		stepWoodenLightColumnHeadID = config.getBlock("Demi-dalle de chapeau de colonne en bois clair lisse", 2955).getInt();

		//2900
		stepIceCobblestoneID = config.getBlock("Demi-dalle de glace fragmente", 2901).getInt();
		stepIceStonebrickID = config.getBlock("Demi-dalle de briques de glace", 2902).getInt();
		stepIceDoubleSlabID = config.getBlock("Demi-dalle de dalle en glace", 2903).getInt();
		stepIceColumnID = config.getBlock("Demi-dalle de colonne de glace", 2904).getInt();
		stepIceColumnHeadID = config.getBlock("Demi-dalle de chapeau de colonne en glace", 2905).getInt();
		
		//2960
		stepMarbleDamierID = config.getBlock("Demi-dalle de marbre en damier", 2960).getInt();
		stepMetalID = config.getBlock("Demi-dalle en acier", 2961).getInt();
		stepStonebrickColumnID = config.getBlock("Demi-dalle de colonne en stonebrick", 2962).getInt();
		stepStonebrickColumnHeadID = config.getBlock("Demi-dalle de chapeau de colonne en stonebrick", 2963).getInt();
		stepStrawID = config.getBlock("Demi-dalle en paille", 2964).getInt();
		stepLanternWoodID = config.getBlock("Demi-dalle de lanterne en bois", 3150).getInt();
		stepLanternIronID = config.getBlock("Demi-dalle de lanterne en fer", 3151).getInt();

		//2970
		stepSandstoneStonebrickID = config.getBlock("Demi-dalle de brique de sandstone", 2972).getInt();
		stepSandstoneDoubleSlabID = config.getBlock("Demi-dalle de dalle en sandstone", 2973).getInt();
		stepSandstoneColumnID = config.getBlock("Demi-dalle de colonne de sandstone", 2974).getInt();
		stepSandstoneColumnHeadID = config.getBlock("Demi-dalle de chapeau de colonne en sandstone", 2975).getInt();
		
		//2980
		stepWhiteCobblestoneID = config.getBlock("Demi-dalle de pierre blanche fragmentee", 2980).getInt();
		stepWhiteStoneID = config.getBlock("Demi-dalle de pierre blanche", 2981).getInt();
		stepWhiteStonebrickID = config.getBlock("Demi-dalle de brique de pierre blanche", 2982).getInt();
		stepWhiteDoubleSlabID = config.getBlock("Demi-dalle de dalle de pierre blanche", 2983).getInt();
		stepWhiteColumnID = config.getBlock("Demi-dalle de colonne en pierre blanche", 2984).getInt();
		stepWhiteColumnHeadID = config.getBlock("Demi-dalle de chapeau de colonne en pierre blanche", 2985).getInt();
		
		/** New walls **/
		wallSandstoneID = config.getBlock("Muret en sandstone", 1500).getInt();
		wallPlankOakID = config.getBlock("Muret en planche (chene)", 1501).getInt();
		wallBrickID = config.getBlock("Muret en brique", 1505).getInt();
		wallStonebrickID = config.getBlock("Muret en stonebrick", 1506).getInt();
		wallNetherbrickID = config.getBlock("Muret en netherbrick", 1510).getInt();
		wallWoodOakID = config.getBlock("Muret en bois (chene)", 1511).getInt();
		wallWoodFirID = config.getBlock("Muret en bois (sapin)", 1512).getInt();
		wallWoodBirchID = config.getBlock("Muret en bois (bouleau)", 1513).getInt();
		wallWoodJungleID = config.getBlock("Muret en bois (jungle)", 1514).getInt();


		wallWhiteStoneID = config.getBlock("Muret en pierre blanche", 1800).getInt();
		wallWhiteCobblestoneID = config.getBlock("Muret en cobblestone blanche", 1801).getInt();
		wallWhiteStonebrickID = config.getBlock("Muret en stonebrick blanche", 1802).getInt();

		wallMarbleWhiteStoneID = config.getBlock("Muret en marbre blanc", 1803).getInt();
		wallMarbleWhiteStonebrickID = config.getBlock("Muret en brique de marbre blanc", 1804).getInt();
		wallMarbleWhiteCobblestoneID = config.getBlock("Muret en marbre blanc fragmente", 1805).getInt();

		wallMarbleBlackStoneID = config.getBlock("Muret en marbre noir", 1806).getInt();
		wallMarbleBlackStonebrickID = config.getBlock("Muret en brique de marbre noir", 1807).getInt();
		wallMarbleBlackCobblestoneID = config.getBlock("Muret en marbre noir fragmente", 1808).getInt();

		wallAncientStoneID = config.getBlock("Muret en pierre ancienne", 1809).getInt();
		wallAncientStonebrickID = config.getBlock("Muret en brique de pierre ancienne", 1810).getInt();
		wallAncientCobblestoneID = config.getBlock("Muret en pierre ancienne fragmente", 1811).getInt();

		wallWoodenStoneID = config.getBlock("Muret en bois lisse", 1812).getInt();
		wallWoodenStonebrickID = config.getBlock("Muret en brique de bois lisse", 1813).getInt();

		wallWoodenLightStoneID = config.getBlock("Muret en bois clair lisse", 1814).getInt();
		wallWoodenLightStonebrickID = config.getBlock("Muret en brique de bois clair lisse", 1815).getInt();

		wallIceCobblestoneID = config.getBlock("Muret en glace fragmente", 1816).getInt();
		wallIceStonebrickID = config.getBlock("Muret en briques de glace", 1817).getInt();
		
		/** Fence **/
		fenceWhiteStoneID = config.getBlock("Barriere en pierre blanche", 2760).getInt();
		fenceWhiteStonebrickID = config.getBlock("Barriere en pierre blanche taille", 2761).getInt();
		fenceWhiteCobblestoneID = config.getBlock("Barriere en pierre blanche fragmentee", 2762).getInt();
	
		fenceMarbleWhiteStoneID = config.getBlock("Barriere en marbre blanc", 2763).getInt();
		fenceMarbleWhiteStonebrickID = config.getBlock("Barriere en marbre blanc taille", 2764).getInt();
		fenceMarbleWhiteCobblestoneID = config.getBlock("Barriere en marbre blanc fragmente", 2765).getInt();
		
		fenceMarbleBlackStoneID = config.getBlock("Barriere en marbre noir", 2766).getInt();
		fenceMarbleBlackStonebrickID = config.getBlock("Barriere en marbre noir taille", 2767).getInt();
		fenceMarbleBlackCobblestoneID = config.getBlock("Barriere en marbre noir fragmente", 2768).getInt();
		
		fenceAncientStoneID = config.getBlock("Barriere en pierre ancienne", 2769).getInt();
		fenceAncientStonebrickID = config.getBlock("Barriere en pierre ancienne taillee", 2770).getInt();
		fenceAncientCobblestoneID = config.getBlock("Barriere en pierre ancienne fragmentee", 2771).getInt();
	
		fenceWoodenStoneID = config.getBlock("Barriere en bois lisse", 2772).getInt();
		fenceWoodenStonebrickID = config.getBlock("Barriere en bois lisse taille", 2773).getInt();
		
		fenceWoodenLightStoneID = config.getBlock("Barriere en bois clair lisse", 2774).getInt();
		fenceWoodenLightStonebrickID = config.getBlock("Barriere en bois clair lisse taille", 2775).getInt();
		
		fenceIceCobblestoneID = config.getBlock("Barriere en glace fragmente", 2776).getInt();
		fenceIceStonebrickID = config.getBlock("Barriere en glace taille", 2777).getInt();
		
		/** New stair **/
		stairWoolWhiteID = config.getBlock("Escalier de laine blanche", 3000).getInt();
		stairWoolOrangeID = config.getBlock("Escalier de laine orange", 3001).getInt();
		stairWoolMagentaID = config.getBlock("Escalier de laine magenta", 3002).getInt();
		stairWoolLightBlueID = config.getBlock("Escalier de laine bleu claire", 3003).getInt();
		stairWoolYellowID = config.getBlock("Escalier en laine jaune", 3004).getInt();
		stairWoolLightGreenID = config.getBlock("Escalier en laine verte claire", 3005).getInt();
		stairWoolPinkID = config.getBlock("Escalier en laine rose", 3006).getInt();
		stairWoolGrayID = config.getBlock("Escalier en laine grise", 3007).getInt();
		stairWoolLightGrayID = config.getBlock("Escalier en laine grise claire", 3008).getInt();
		stairWoolCyanID = config.getBlock("Escalier en laine cyan", 3009).getInt();
		stairWoolPurpleID = config.getBlock("Escalier en laine violette", 3010).getInt();
		stairWoolBlueID = config.getBlock("Escalier en laine bleu", 3011).getInt();
		stairWoolBrownID = config.getBlock("Escalier en laine marron", 3012).getInt();
		stairWoolGreenID = config.getBlock("Escalier en laine verte", 3013).getInt();
		stairWoolRedID = config.getBlock("Escalier en laine rouge", 3014).getInt();
		stairWoolBlackID = config.getBlock("Escalier en laine noire", 3015).getInt();

		stairWoolWhiteLightID = config.getBlock("Escalier de laine blanche lumineuse", 3100).getInt();
		stairWoolOrangeLightID = config.getBlock("Escalier de laine orange lumineuse", 3101).getInt();
		stairWoolMagentaLightID = config.getBlock("Escalier de laine magenta lumineuse", 3102).getInt();
		stairWoolLightBlueLightID = config.getBlock("Escalier de laine bleu claire lumineuse", 3103).getInt();
		stairWoolYellowLightID = config.getBlock("Escalier en laine jaune lumineuse", 3104).getInt();
		stairWoolLightGreenLightID = config.getBlock("Escalier en laine verte claire lumineuse", 3105).getInt();
		stairWoolPinkLightID = config.getBlock("Escalier en laine rose lumineuse", 3106).getInt();
		stairWoolGrayLightID = config.getBlock("Escalier en laine grise lumineuse", 3107).getInt();
		stairWoolLightGrayLightID = config.getBlock("Escalier en laine grise claire lumineuse", 3108).getInt();
		stairWoolCyanLightID = config.getBlock("Escalier en laine cyan lumineuse", 3109).getInt();
		stairWoolPurpleLightID = config.getBlock("Escalier en laine violette lumineuse", 3110).getInt();
		stairWoolBlueLightID = config.getBlock("Escalier en laine bleu lumineuse", 3111).getInt();
		stairWoolBrownLightID = config.getBlock("Escalier en laine marron lumineuse", 3112).getInt();
		stairWoolGreenLightID = config.getBlock("Escalier en laine verte lumineuse", 3113).getInt();
		stairWoolRedLightID = config.getBlock("Escalier en laine rouge lumineuse", 3114).getInt();
		stairWoolBlackLightID = config.getBlock("Escalier en laine noire lumineuse", 3115).getInt();

		stairStoneID = config.getBlock("Escalier en roche", 3040).getInt();
		stairGrassID = config.getBlock("Escalier d'herbe", 3041).getInt();
		stairDirtID = config.getBlock("Escalier de terre", 3042).getInt();
		stairGravelID = config.getBlock("Escalier de gravier", 3043).getInt();
		stairMossyCobbleID = config.getBlock("Pierre moussue", 3048).getInt();
		stairObsidianID = config.getBlock("Escalier d'obsidienne", 3049).getInt();
		stairIceID = config.getBlock("Escalier de glace", 3050).getInt();
		stairSnowID = config.getBlock("Escalier de neige", 3051).getInt();
		stairStonebrickMossyID = config.getBlock("Escalier en stonebrick moussue", 3052).getInt();
		stairStonebrickCrackedID = config.getBlock("Escalier en stonebrick craquee", 3053).getInt();
		stairEnderstoneID = config.getBlock("Escalier en pierre de l'ender", 3055).getInt();
		stairSandID = config.getBlock("Escalier en sable", 3056).getInt();

		stairStrawID = config.getBlock("Escalier en paille", 2754).getInt();
		
		stairWhiteStoneID = config.getBlock("Escalier en pierre blanche", 2725).getInt();
		stairWhiteCobblestoneID = config.getBlock("Escalier en pierre blanche fragmente", 2726).getInt();
		stairWhiteStonebrickID = config.getBlock("Escalier en brique de pierre blanche", 2727).getInt();

		stairAncientStoneID = config.getBlock("Escalier en pierre ancienne", 2720).getInt();
		stairAncientStonebrickID = config.getBlock("Escalier en brique de pierre ancienne", 2722).getInt();
		stairAncientCobblestoneID = config.getBlock("Escalier en pierre ancienne fragmente", 2721).getInt();

		stairMarbleBlackStoneID = config.getBlock("Escalier en marbre noir", 2730).getInt();
		stairMarbleBlackStonebrickID = config.getBlock("Escalier en brique de marbre noir", 2732).getInt();
		stairMarbleBlackCobblestoneID = config.getBlock("Escalier en marbre noir fragmente", 2731).getInt();

		stairMarbleWhiteStoneID = config.getBlock("Escalier en marbre blanc", 2710).getInt();
		stairMarbleWhiteStonebrickID = config.getBlock("Escalier en brique de marbre blanc", 2712).getInt();
		stairMarbleWhiteCobblestoneID = config.getBlock("Escalier en marbre blanc fragmente", 2711).getInt();

		stairIceStonebrickID = config.getBlock("Escalier en brique de glace", 2701).getInt();
		stairIceCobblestoneID = config.getBlock("Escalier en glace fragmente", 2700).getInt();

		stairWoodenStoneID = config.getBlock("Escalier en bois lisse", 2740).getInt();
		stairWoodenStonebrickID = config.getBlock("Escalier en brique de bois lisse", 2741).getInt();

		stairWoodenLightStoneID = config.getBlock("Escalier en bois clair lisse", 2750).getInt();
		stairWoodenLightStonebrickID = config.getBlock("Escalier en brique de bois clair lisse", 2751).getInt();
		
		stairMarbleDamierID = config.getBlock("Escalier de marbre en damier", 2752).getInt();

		stairSandstoneStonebrickID = config.getBlock("Escalier en brique de sandstone", 2753).getInt();
		
		/** Lampion **/
		lampionBlancID = config.getBlock("Lampion blanc", 3202).getInt();
		lampionBleuID = config.getBlock("Lampion bleu", 3203).getInt();
		lampionJauneID = config.getBlock("Lampion jaune", 3204).getInt();
		lampionVertID = config.getBlock("Lampion vert", 3205).getInt();
		lampionRougeID = config.getBlock("Lampion rouge", 3206).getInt();

		/** Meta **/
		blockMetaTapisID = config.getBlock("Tapis", 2699).getInt();
		metaWoolLightID = config.getBlock("Laines lumineuses", 2799).getInt();
		metaVitrailID = config.getBlock("Vitraux", 2798).getInt();
		metaVitrailPaneID = config.getBlock("Vitraux plats", 2797).getInt();

		/** White blocs **/
		whiteStoneID = config.getBlock("Stone blanche", 2880).getInt();
		whiteCobblestoneID = config.getBlock("Cobblestone blanche", 2881).getInt();
		whiteStonebrickID = config.getBlock("Stonebrick blanche", 2882).getInt();
		whiteStonebrickRoundID = config.getBlock("Stonebrick taillee blanche", 2883).getInt();
		whiteStoneDoubleSlabID = config.getBlock("Dalle lisse blanche", 2884).getInt();
		whiteColumnID = config.getBlock("Colonne blanche", 2885).getInt();
		whiteColumnHeadID = config.getBlock("Tete de colonne blanche", 2886).getInt();
		
		stonebrickColumnID = config.getBlock("Colonne en stonebrick", 2856).getInt();
		stonebrickColumnHeadID = config.getBlock("Chapeau de colonne en stonebrick", 2857).getInt();
		
		/** Ice blocks **/
		iceCobblestoneID = config.getBlock("Cobblestone de glace", 2800).getInt();
		iceStonebrickID = config.getBlock("Stonebrick de glace", 2801).getInt();
		iceStonebrickRoundID = config.getBlock("Stonebrick taillee de glace", 2802).getInt();
		iceDoubleSlabID = config.getBlock("Dalle lisse de glace", 2803).getInt();
		iceColumnID = config.getBlock("Colonne de glace", 2804).getInt();
		iceColumnHeadID = config.getBlock("Tete de colonne en glace", 2805).getInt();

		/** Sandstone new **/
		sandstoneStonebrickID = config.getBlock("Brique de sandstone", 2641).getInt();
		sandstoneStonebrickRoundID = config.getBlock("Brique de sandstone taillee", 2642).getInt();
		sandstoneDoubleSlabID = config.getBlock("Dalle de sandstone lisse", 2643).getInt();
		sandstoneColumnID = config.getBlock("Colonne de sandstone",2644).getInt();
		sandstoneColumnHeadID = config.getBlock("Tete de colonne de sandstone", 2645).getInt();

		/** Black Marble **/
		//2830
		marbleBlackCobblestoneID = config.getBlock("Marbre noir fragmente", 2830).getInt();
		marbleBlackStoneID = config.getBlock("Marbre noir", 2831).getInt();
		marbleBlackStonebrickID = config.getBlock("Brique de Marbre noir", 2832).getInt();
		marbleBlackStonebrickRoundID = config.getBlock("Brique taillee de Marbre noir", 2833).getInt();
		marbleBlackDoubleSlabID = config.getBlock("Dalle de Marbre noir", 2834).getInt();
		marbleBlackColumnID = config.getBlock("Colonne en Marbre noir", 2835).getInt();
		marbleBlackColumnHeadID = config.getBlock("Chapeau de Colonne en Marbre noir", 2836).getInt();

		marbleDamierID = config.getBlock("Damier de marbre", 2846).getInt();

		/** Ancient stone **/
		//2820
		ancientCobblestoneID = config.getBlock("Pierre ancienne fragmentee", 2820).getInt();
		ancientStoneID = config.getBlock("Pierre ancienne", 2821).getInt();
		ancientStonebrickID = config.getBlock("Brique de pierre ancienne", 2822).getInt();
		ancientStonebrickRoundID = config.getBlock("Brique de pierre ancienne taillee", 2823).getInt();
		ancientDoubleSlabID = config.getBlock("Dalle de pierre ancienne", 2824).getInt();
		ancientColumnID = config.getBlock("Colonne en pierre ancienne", 2825).getInt();
		ancientColumnHeadID = config.getBlock("Chapeau de colonne en pierre ancienne", 2826).getInt();

		/** White marble **/
		//2810
		marbleWhiteCobblestoneID = config.getBlock("Marbre blanc fragmente", 2810).getInt();
		marbleWhiteStoneID = config.getBlock("Marbre blanc", 2811).getInt();
		marbleWhiteStonebrickID = config.getBlock("Brique de Marbre blanc", 2812).getInt();
		marbleWhiteStonebrickRoundID = config.getBlock("Brique taille de Marbre blanc", 2813).getInt();
		marbleWhiteDoubleSlabID = config.getBlock("Dalle de Marbre blanc", 2814).getInt();
		marbleWhiteColumnID = config.getBlock("Colonne de Marbre blanc", 2815).getInt();
		marbleWhiteColumnHeadID = config.getBlock("Chapeau de colonne de Marbre blanc", 2816).getInt();

		/** Wood **/
		//2840
		woodenStoneID = config.getBlock("Bois lisse", 2840).getInt();
		woodenStonebrickID = config.getBlock("Brique de bois lisse", 2841).getInt();
		woodenStonebrickRoundID = config.getBlock("Bois lisse taille", 2842).getInt();
		woodenDoubleSlabID = config.getBlock("Dalle de bois lisse", 2843).getInt();
		woodenColumnID = config.getBlock("Colonne en bois lisse", 2844).getInt();
		woodenColumnHeadID = config.getBlock("Chapeau de colonne en bois lisse", 2845).getInt();

		/** Wood light **/
		//2850
		woodenLightStoneID = config.getBlock("Bois clair lisse", 2850).getInt();
		woodenLightStonebrickID = config.getBlock("Brique de bois clair lisse", 2851).getInt();
		woodenLightStonebrickRoundID = config.getBlock("Bois clair lisse taille", 2852).getInt();
		woodenLightDoubleSlabID = config.getBlock("Dalle de bois clair lisse", 2853).getInt();
		woodenLightColumnID = config.getBlock("Colonne en bois clair lisse", 2854).getInt();
		woodenLightColumnHeadID = config.getBlock("Chapeau de colonne en bois clair lisse", 2855).getInt();

		/** Metal **/
		//2860
		metalGridID = config.getBlock("Grille fine en acier", 2860).getInt();
		metalStonebrickID = config.getBlock("Damier en acier", 2861).getInt();
		metalStonebrickRoundID = config.getBlock("Acier taille", 2862).getInt();
		metalDoubleSlabID = config.getBlock("Dalle en acier", 2863).getInt();

		/** Lumineux **/
		woodenLanternID = config.getBlock("Lanterne en bois", 3200).getInt();
		ironLanternID = config.getBlock("Lanterne en fer", 3201).getInt();

		/** Autres **/
		PHOnoirID = config.getBlock("Pierre noire du PHO", 3213).getInt();
		PHOblancID = config.getBlock("Pierre blanche du PHO", 3214).getInt();
		woeBlockID = config.getBlock("Bloc du War of Emperium", 3215).getInt();
		invisibleBlockID = config.getBlock("Bloc invisble", 4095).getInt();
		pikeID = config.getBlock("Pique", 4080).getInt();
		portalPurpleID = config.getBlock("Portail violet", 2900).getInt();
		crateID = config.getBlock("Caisse en bois", 2499).getInt();
		shojiID = config.getBlock("Mur en papier Shoji", 3212).getInt();
		tuileArdoiseID = config.getBlock("Tuiles en ardoise", 3209).getInt();
		obsidianBlockID = config.getBlock("Bloc d'obsidienne cuite", 3210).getInt();

		/** Chain, ropes **/
		chainIronID = config.getBlock("Chaine en fer", 3251).getInt();
		chainRopeID = config.getBlock("Corde", 3252).getInt();

		/**Blocs glacee**/
		logGlaceeID = config.getBlock("Buche glacee", 3160).getInt();
		leavesGlaceeClairID = config.getBlock("Feuilles clair glacee", 3161).getInt();
		leavesGlaceeID = config.getBlock("Feuille glacee", 3162).getInt();
		plankGlaceeID = config.getBlock("Planche glacee", 3163).getInt();
		
		/** Red rock **/
		//3260
		redGrassID = config.getBlock("Roche rouge herbeuse", 3260).getInt();
		redGravelID = config.getBlock("Gravier de roche rouge", 3261).getInt();
		beigeLinesID = config.getBlock("Strates beiges fines", 3262).getInt();
		beigeRockID = config.getBlock("Roche beige", 3263).getInt();
		redSilverID = config.getBlock("Minerai d argent", 3264).getInt();
		silverBlockID = config.getBlock("Bloc d argent de Reder", 3265).getInt();

		/** New rock **/
		//3270
		greyRockID = config.getBlock("Roche grise", 3270).getInt();
		greyRockGrassID = config.getBlock("Roche grise herbeuse", 3271).getInt();
		brownRockID = config.getBlock("Roche brune", 3272).getInt();
		brownRockGrassID = config.getBlock("Roche brune herbeuse", 3273).getInt();
		darkRockID = config.getBlock("Roche sombre", 3274).getInt();
		darkRockGrassID = config.getBlock("Roche sombre herbeuse", 3275).getInt();
		blackRockID = config.getBlock("Roche noire", 3276).getInt();
		lavaRockID = config.getBlock("Roche volcanique", 3277).getInt();
		lavaRockRedID = config.getBlock("Roche volcanique rouge", 3278).getInt();

		/** Balustrades **/
		//2650
		marbleBlackAnvilID = config.getBlock("Balustarde en marbre noir", 2650).getInt();
		marbleBlackStonebrickAnvilID = config.getBlock("Balustrade en brique de marbre noir", 2651).getInt();
		marbleWhiteAnvilID = config.getBlock("Balustrade en marbre blanc", 2652).getInt();
		marbleWhiteStonebrickAnvilID = config.getBlock("Balustrade en brique de marbre blanc", 2653).getInt();
		whiteStoneAnvilID = config.getBlock("Balustrade en pierre blanche", 2654).getInt();
		whiteStonebrickAnvilID = config.getBlock("Balustrade en brique de pierre blanche", 2655).getInt();
		ancientStoneAnvilID = config.getBlock("Balustrade en pierre ancienne", 2656).getInt();
		ancientStonebrickAnvilID = config.getBlock("Balustrade en brique de pierre ancienne", 2657).getInt();
		sandstoneStonebrickAnvilID = config.getBlock("Balustrade en brique de sandstone", 2658).getInt();
		iceStonebrickAnvilID = config.getBlock("Balustrade en brique de glace", 2664).getInt();
		woodenStoneAnvilID = config.getBlock("Balustrade en bois lisse", 2665).getInt();
		woodenStonebrickAnvilID = config.getBlock("Balustrade en brique de bois lisse", 2666).getInt();
		
		logAnvilID = config.getBlock("Balustrade en bois", 2659).getInt();
		woodAnvilID = config.getBlock("Balustrade en bois normal", 2660).getInt();
		woodNormalAnvilID = config.getBlock("Balustrade en bois blanc", 2661).getInt();
		woodLightAnvilID = config.getBlock("Balustrade en bois brun", 2662).getInt();
		woodDarkAnvilID = config.getBlock("Balustrade en bois fonce", 2663).getInt();
		
		/** Colombage **/
		colombageCarreID = config.getBlock("Colombage carre", 2686).getInt();
		colombageCroiseID = config.getBlock("Colombage croise", 2687).getInt();
		colombageVerticalID = config.getBlock("Colombage vertical", 2688).getInt();
		colombageHorizontalID = config.getBlock("Colombage horizontal", 2689).getInt();
		colombageGaucheID = config.getBlock("Colombage gauche", 2690).getInt();
		colombageDroiteID = config.getBlock("Colombage droite", 2691).getInt();

		fenetreFerID = config.getBlock("Fenetre en fer", 2692).getInt();
		fenetreFerPaneID = config.getBlock("Fenetre en fer plate", 2713).getInt();

		colombageCarreFonceID = config.getBlock("Colombage carre fonce", 2693).getInt();
		colombageCroiseFonceID = config.getBlock("Colombage croise fonce", 2694).getInt();
		colombageVerticalFonceID = config.getBlock("Colombage vertical fonce", 2695).getInt();
		colombageHorizontalFonceID = config.getBlock("Colombage horizontal fonce", 2696).getInt();
		colombageGaucheFonceID = config.getBlock("Colombage gauche fonce", 2697).getInt();
		colombageDroiteFonceID = config.getBlock("Colombage droite fonce", 2698).getInt();

		/** Cristaux **/
		cristalBlockID = config.getBlock("Bloc de cristal", 2837).getInt();
		cristalLittleID = config.getBlock("Petit cristal", 2838).getInt();
		cristalBigID = config.getBlock("Gros cristal", 2839).getInt();

		/** Enseignes **/
		enseigneAlchimieID = config.getBlock("Enseigne d'Alchimie", 2600).getInt();
		enseigneBanqueID = config.getBlock("Enseigne de Banque", 2601).getInt();
		enseigneForgeID = config.getBlock("Enseigne de Forge", 2602).getInt();
		enseigneBouclierID = config.getBlock("Enseigne de Bouclier", 2603).getInt();
		enseigneSanctuaireID = config.getBlock("Enseigne de Sanctuaire", 2604).getInt();
		enseigneArmurerieID = config.getBlock("Enseigne d'Armurerie", 2605).getInt();
		enseigneLibrairieID = config.getBlock("Enseigne de Librairie", 2606).getInt();
		enseigneRestaurantID = config.getBlock("Enseigne de Restaurant", 2607).getInt();
		enseigneTaverneID = config.getBlock("Enseigne de Taverne", 2608).getInt();
		enseigneMateriauxID = config.getBlock("Enseigne de Materiaux", 2609).getInt();
		enseigneAubergeID = config.getBlock("Enseigne d'Auberge", 2610).getInt();
		enseigneDiamantID = config.getBlock("Enseigne de Diamant", 2611).getInt();
		enseignePhoID = config.getBlock("Enseigne de PHO", 2612).getInt();
		enseigneEcurieID = config.getBlock("Enseigne d'Ecurie", 2613).getInt();
		enseigneCristalID = config.getBlock("Enseigne de cristal", 2614).getInt();

		config.save(); //Saves the file
	}
}