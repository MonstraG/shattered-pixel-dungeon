/*
 * Pixel Dungeon
 * Copyright (C) 2012-2015 Oleg Dolya
 *
 * Shattered Pixel Dungeon
 * Copyright (C) 2014-2024 Evan Debenham
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 */

package com.shatteredpixel.shatteredpixeldungeon.ui.changelist;

import com.shatteredpixel.shatteredpixeldungeon.Assets;
import com.shatteredpixel.shatteredpixeldungeon.Badges;
import com.shatteredpixel.shatteredpixeldungeon.effects.BadgeBanner;
import com.shatteredpixel.shatteredpixeldungeon.items.Torch;
import com.shatteredpixel.shatteredpixeldungeon.items.armor.curses.Bulk;
import com.shatteredpixel.shatteredpixeldungeon.items.artifacts.CloakOfShadows;
import com.shatteredpixel.shatteredpixeldungeon.items.artifacts.DriedRose;
import com.shatteredpixel.shatteredpixeldungeon.items.artifacts.EtherealChains;
import com.shatteredpixel.shatteredpixeldungeon.items.artifacts.HornOfPlenty;
import com.shatteredpixel.shatteredpixeldungeon.items.artifacts.TalismanOfForesight;
import com.shatteredpixel.shatteredpixeldungeon.items.artifacts.TimekeepersHourglass;
import com.shatteredpixel.shatteredpixeldungeon.items.artifacts.UnstableSpellbook;
import com.shatteredpixel.shatteredpixeldungeon.items.food.Food;
import com.shatteredpixel.shatteredpixeldungeon.items.potions.PotionOfHealing;
import com.shatteredpixel.shatteredpixeldungeon.items.rings.RingOfElements;
import com.shatteredpixel.shatteredpixeldungeon.items.rings.RingOfEnergy;
import com.shatteredpixel.shatteredpixeldungeon.items.rings.RingOfEvasion;
import com.shatteredpixel.shatteredpixeldungeon.items.rings.RingOfMight;
import com.shatteredpixel.shatteredpixeldungeon.items.rings.RingOfSharpshooting;
import com.shatteredpixel.shatteredpixeldungeon.items.rings.RingOfWealth;
import com.shatteredpixel.shatteredpixeldungeon.items.stones.StoneOfAugmentation;
import com.shatteredpixel.shatteredpixeldungeon.items.stones.StoneOfEnchantment;
import com.shatteredpixel.shatteredpixeldungeon.items.wands.WandOfCorrosion;
import com.shatteredpixel.shatteredpixeldungeon.items.wands.WandOfCorruption;
import com.shatteredpixel.shatteredpixeldungeon.items.weapon.curses.Wayward;
import com.shatteredpixel.shatteredpixeldungeon.items.weapon.enchantments.Lucky;
import com.shatteredpixel.shatteredpixeldungeon.items.weapon.melee.Dagger;
import com.shatteredpixel.shatteredpixeldungeon.items.weapon.melee.Flail;
import com.shatteredpixel.shatteredpixeldungeon.items.weapon.melee.Greataxe;
import com.shatteredpixel.shatteredpixeldungeon.messages.Messages;
import com.shatteredpixel.shatteredpixeldungeon.scenes.ChangesScene;
import com.shatteredpixel.shatteredpixeldungeon.sprites.CharSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.ItemSprite;
import com.shatteredpixel.shatteredpixeldungeon.sprites.ItemSpriteSheet;
import com.shatteredpixel.shatteredpixeldungeon.ui.BuffIcon;
import com.shatteredpixel.shatteredpixeldungeon.ui.BuffIndicator;
import com.shatteredpixel.shatteredpixeldungeon.ui.Icons;
import com.shatteredpixel.shatteredpixeldungeon.ui.Window;
import com.watabou.noosa.Image;

import java.util.ArrayList;

public class v0_6_X_Changes {

	public static void addAllChanges(ArrayList<ChangeInfo> changeInfos) {
		add_v0_6_5_Changes(changeInfos);
		add_v0_6_4_Changes(changeInfos);
		add_v0_6_3_Changes(changeInfos);
		add_v0_6_2_Changes(changeInfos);
		add_v0_6_1_Changes(changeInfos);
		add_v0_6_0_Changes(changeInfos);
	}

	public static void add_v0_6_5_Changes(ArrayList<ChangeInfo> changeInfos) {
		ChangeInfo changes = new ChangeInfo("v0.6.5", true, "");
		changes.hardlight(Window.TITLE_COLOR);
		changeInfos.add(changes);

		changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
		changes.hardlight(Window.TITLE_COLOR);
		changeInfos.add(changes);

		changes.addButton(new ChangeButton(Icons.get(Icons.SHPX), "Developer Commentary",
				"""
						_-_ Released May 3rd, 2018
						_-_ 32 days after Shattered v0.6.4

						v0.6.5 was the third major design iteration for glyphs, with the first being from Pixel Dungeon and the second from v0.4.0. In both of these earlier iterations glyphs had big trade-offs, which led many players to dislike or outright ignore them. I finally just decided to make them like enchantments. With that, plus the new augmentation functionality, armor finally had some of the variability in stats and effects that weapons had, though adding full blown armor types is still a common suggestion.

						I also made another attempt at designing the Berserker in v0.6.5. Prior to this update his death-defying rage would always trigger if it was available. That built-in safety net translated to a win rate that was hugely higher than the other subclasses, so I decided to make building rage and cheating death much harder to access. The Berserker retained his simple up-front gameplay, but started requiring investment in armor and rage management to access his power."""));

		changes.addButton(new ChangeButton(new StoneOfAugmentation(),
				"""
						The weightstone is now the runestone of augmentation!

						Usability on weapons unchanged, can still be used to enhance either speed or damage at the cost of the other.

						Can now be used on armor! Armor can be modified to enhance either defense or evasion, at the cost of the other.

						Every shop now stocks a runestone of augmentation and an ankh, instead of one or the other."""));

		changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.ARMOR_CLOTH, new Bulk().glowing()), "New Curses",
				"""
						Added 4 new curses:

						_-_ Friendly curse makes weapons sometimes charm both you and the enemy.
						_-_ Elastic curse lets weapons apply knockback, but reduces damage to 0.

						_-_ Bulk curse makes armor large, slowing movement through doorways.
						_-_ Overgrowth curse causes random plant effects when you are struck."""));

		changes.addButton(new ChangeButton(BadgeBanner.image(Badges.Badge.CHAMPION_3.image), "New and Changed Badges",
				"""
						_-_ Added badges for winning with 3 challenges at once and 6 challenges at once.

						_-_ 'Death by glyph' badge is now 'death by deferred damage'.

						_-_ Removed rare monster slayer badge."""));

		changes.addButton(new ChangeButton(new Image(Assets.Sprites.WARRIOR, 0, 90, 12, 15), "Berserker",
				"""
						Even with recent nerfs the berserker is still much stronger than other subclasses. Rather than continually nerfing his existing mechanics, which makes the subclass unfun, I have instead opted to give him a small rework.

						These changes focus on giving the berserker some of his old power back, but making it more difficult to access that power.

						_-_ Rage is built by taking physical damage
						_-_ Rage fades over time, lasts longer at low HP
						_-_ Rage builds faster with better armor
						_-_ Rage grants bonus damage, max of +50%
						_-_ Berserker now needs full rage to berserk
						_-_ Berserking no longer reduces max hp
						_-_ Berserk bonus shielding doubled
						_-_ Berserk bonus damage reduced to +50%
						_-_ Removed exhaustion damage penalty
						_-_ Berserker can't gain rage while recovering"""));

		changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
		changes.hardlight(CharSprite.WARNING);
		changeInfos.add(changes);

		changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.STYLUS, null), "Glyph Changes",
				"""
						Glyphs were originally designed with the intention that taking no glyph should be a valid option. Now with augmenting armor, glyphs can be more about added bonuses, somewhat like enchantments. Several glyphs have been adjusted:

						_-_ Entanglement now only roots if you stand still.

						_-_ Potential no longer self-damages and grants charge more consistently.

						_-_ Viscocity now always defers some damage, instead of sometimes deferring all damage.

						_-_ Stone reworked. Now sets evasion to 0 and grants armor in proportion to evasion.

						_-_ Swiftness reworked. Now grants movement speed when no enemies are near.

						_-_ Viscocity is now a common glyph, Stone is now uncommon."""));

		changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), Messages.get(ChangesScene.class, "misc"),
				"""
						_-_ All bags now have 20 spaces. Previously only the default bag had 20, and the others had 12.

						_-_ Updated the sprites for runestones and throwing stones

						_-_ Loading screen transitions are now faster in many cases

						_-_ Improved the layout of translator credits in landscape"""));

		changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
				"""
						Fixed:
						_-_ Various rare crash bugs
						_-_ Antimagic applying to elemental damage
						_-_ 'Happy end' badge not appearing in rankings
						_-_ 'Death from falling' badge not triggering
						_-_ Hero rarely appearing alive when dead
						_-_ Sungrass not interrupting resting at full hp
						_-_ Timekeeper's hourglass unusable at 1 charge
						_-_ Artifacts rarely appearing when blocked by a challenge
						_-_ Hero spending a turn before actually opening a lock
						_-_ Specific cases where an invisible hero would not surprise attack
						_-_ Shields granting full defense when hero does not have enough strength
						_-_ Piranha incorrectly being affect by vertigo
						_-_ Ambitious imp spawning on top of traps
						_-_ Enemies spawning faster than intended in specific cases"""));

		changes.addButton(new ChangeButton(Icons.get(Icons.LANGS), Messages.get(ChangesScene.class, "language"),
				"Updated Translations"));

		changes = new ChangeInfo(Messages.get(ChangesScene.class, "buffs"), false, null);
		changes.hardlight(CharSprite.POSITIVE);
		changeInfos.add(changes);

		changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.SWORD, new Lucky().glowing()), "Lucky Enchantment",
				"""
						The Lucky enchant is a nice overall DPS increase, but comes at the cost of consistency. The problem is that with a bit of bad luck it's possible to do 0x damage many times in a row.

						Lucky has been adjusted to reign in the extremes of bad luck, and to give a little more strategy to using it.

						_-_ Base chance to deal 2x damage reduced to 50% from 60%
						_-_ Each time 0x damage is dealt, the next hit will be much more likely to deal 2x damage"""));

		changes.addButton(new ChangeButton(new Image(Assets.Sprites.MAGE, 0, 90, 12, 15), "Warlock",
				"""
						Soul mark chance changed. Now has a 10% chance to activate per wand level, stacking multiplicatively, with a base of 10% at +0.
						e.g. +0 is 10%, +1 is 19%, +2 is 27%, etc.

						Previous soul mark chance was 9% at base plus 6% per level, stacking linearly.

						This substantially increases soul mark chance at wand levels +1 to +5"""));

		changes.addButton(new ChangeButton(new Image(Assets.Sprites.HUNTRESS, 0, 15, 12, 15), "Huntress",
				"Huntress ranged weapon durability boost now stacks with magical holster durability boost, for a total of 180% durability."));

		changes = new ChangeInfo(Messages.get(ChangesScene.class, "nerfs"), false, null);
		changes.hardlight(CharSprite.NEGATIVE);
		changeInfos.add(changes);

		changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.SHORTSWORD, new Wayward().glowing()), "Wayward curse",
				"""
						Wayward's accuracy penalty was very extreme, often making it impossible to win fights without doors. Wayward should punish non-guaranteed attacks, but this extent of this has been lessened.

						_-_ Reduced wayward accuracy penalty by 50%"""));

		changes.addButton(new ChangeButton(new Image(Assets.Sprites.SKELETON, 0, 0, 12, 15), "Skeletons",
				"""
						Skeletons have been adjusted to be more counterable with armor, and to give less inventory-clogging loot.

						_-_ Bone explosion damage up to 6-12 from 2-10
						_-_ Armor is now 2x effective against bone explosion, up from 0.5x

						_-_ Loot drop chance reduced to 1/8, from 1/5"""));

		changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.KIT, null), "Rogue Garb and Huntress Cloak",
				"""
						Eventually I want to totally overhaul class armors. In the meantime though, two of the armors are disproportionately powerful with mind vision, and need to be adjusted:

						_-_ Rogue's smoke bomb now has a max range of 8 and does not go through walls

						_-_ Huntress's spectral blades now have a max range of 12"""));
	}

	public static void add_v0_6_4_Changes(ArrayList<ChangeInfo> changeInfos) {
		ChangeInfo changes = new ChangeInfo("v0.6.4", true, "");
		changes.hardlight(Window.TITLE_COLOR);
		changeInfos.add(changes);

		changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
		changes.hardlight(Window.TITLE_COLOR);
		changeInfos.add(changes);

		changes.addButton(new ChangeButton(Icons.get(Icons.SHPX), "Developer Commentary",
				"""
						_-_ Released April 1st, 2018
						_-_ 46 days after Shattered v0.6.3

						v0.6.4 was a smaller update, mostly focused on additions and fixes following v0.6.3. Probably the most interesting content that came in v0.6.4 was the crossbow! This weapon was an attempt to fulfill the common request for an ammo-based ranged weapon, without actually having an ammo system in the game. I felt that an ammo system would be more cumbersome than it would be worth. Letting darts piggyback on an equipped weapon seemed like a great compromise.

						I also made some important changes to challenges in v0.6.4, primarily to make stacked challenge games a bit easier. This made high-challenge games more feasible without extreme luck, which led to a big increase in challenge interest among highly skilled players."""));

		changes.addButton(new ChangeButton(Icons.get(Icons.CHALLENGE_ON), "Challenges",
				"""
						Challenges have received several major changes, with the goal of making them more fair and interesting.

						_-_ Challenges now have descriptions

						_-_ On diet now provides small rations, rather than removing all food
						_-_ Cloth armor is now allowed on faith is my armor
						_-_ Pharmacophobia is unchanged
						_-_ Barren land now allows seeds to drop, but they cannot be planted
						_-_ Swarm intelligence now draws nearby enemies, not all enemies
						_-_ Into darkness now limits light more harshly, but provides torches
						_-_ Forbidden runes now removes 50% of upgrade scrolls, and no other scrolls"""));

		changes.addButton(new ChangeButton(Icons.get(Icons.INFO), "Start game UI",
				"""
						The interface for starting and loading a game has been completely overhauled!

						_-_ Game now supports 4 save slots of any hero class, rather than 1 slot per class
						_-_ Hero select and challenge select are now more streamlined and informative
						_-_ Hero select is now a window, offering more flexibility of where games can be started
						_-_ More details are now shown for games in progress before they are loaded"""));

		changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.CROSSBOW, null), "New Weapons",
				"""
						Three new weapons have been added!

						Throwing spears are a basic tier 3 missile weapon, fishing spears have been reduced to tier 2. Tiers 2-5 now each have a basic missile weapon.

						The crossbow is a tier 4 melee weapon which enhances darts! You'll do less damage up-front, but thrown darts will pack a punch!

						The gauntlet is a tier 5 fast melee weapon, similar to the sai. Excellent for chaining combos or enchantments."""));

		changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
		changes.hardlight(CharSprite.WARNING);
		changeInfos.add(changes);

		changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.HOLSTER, null), "Inventory changes",
				"""
						Since the ranged weapon improvements in 0.6.3, inventory space has become a bit too congested. Rather than make a small change that only helps the issue for a few more updates, I have decided to make a larger-scale adjustment to available inventory space:

						_-_ The wand holster is now the magical holster, and can store missile weapons as well as wands.

						_-_ The seed pouch is now the velvet pouch, and can store runestones as well as seeds.

						_-_ Every hero now starts the game with an extra container."""));

		changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), Messages.get(ChangesScene.class, "misc"),
				"""
						_-_ It is now possible to back up game data using ADB backup on android 4.0+ and android auto-backup on android 6.0+. Runs in progress are not backed up to prevent cheating.

						_-_ Firebloom plants will no longer appear in garden rooms. Accidentally running into them is massively more harmful than any other plant.

						_-_ Mage and Warrior tutorial functionality has been removed, as more players found it confusing than helpful.

						_-_ Added a new visual effect to the loading screen

						_-_ Piranha treasure rooms now have a one tile wide buffer

						_-_ Bags are now unsellable

						_-_ The dwarf king is now immune to blindness

						_-_ Made adjustments to sending gameplay data. Data use should be slightly reduced."""));

		changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
				"""
						Fixed:
						_-_ Crashes involving corrupted mimics
						_-_ Various rare crash bugs
						_-_ Various minor visual bugs
						_-_ Skeletons exploding when falling in chasms
						_-_ Thrown weapons lost when used on sheep
						_-_ Warden gaining benefits from rotberry bush
						_-_ Rare cases where music wouldn't play
						_-_ Unstable enchant not being able to activate venom"""));

		changes.addButton(new ChangeButton(Icons.get(Icons.LANGS), Messages.get(ChangesScene.class, "language"),
				"Updated Translations"));

		changes = new ChangeInfo(Messages.get(ChangesScene.class, "buffs"), false, null);
		changes.hardlight(CharSprite.POSITIVE);
		changeInfos.add(changes);

		changes.addButton(new ChangeButton(new TimekeepersHourglass(),
				"""
						The timekeeper's hourglass has been adjusted to cap at 10 charges, instead of 20, and to have a bit more power without upgrades:

						_-_ Number of charges halved
						_-_ 2x freeze duration per charge
						_-_ 5x stasis duration per charge
						_-_ Overall recharge speed increased at +0, unchanged at +10"""));

		changes.addButton(new ChangeButton(new TalismanOfForesight(),
				"""
						The talisman of foresight now builds power for scrying slightly faster

						_-_ Charge speed increased by 20% at +0, scaling to 50% increased at +10
						_-_ Charge gain when discovering traps unchanged"""));

		changes = new ChangeInfo(Messages.get(ChangesScene.class, "nerfs"), false, null);
		changes.hardlight(CharSprite.NEGATIVE);
		changeInfos.add(changes);

		changes.addButton(new ChangeButton(new BuffIcon(BuffIndicator.PARALYSIS, true), "Paralysis changes",
				"""
						Paralysis is an extremely powerful debuff, and its ability to completely immobilize the player or an enemy while they are killed needs to be adjusted.

						Chance to resist paralysis is now based on all recent damage taken while paralyzed, instead of each specific instance of damage separately.

						This means that after taking around half current HP in damage, breaking from paralysis becomes very likely, and immediately re-applying paralysis will not reset this resist chance."""));

		changes.addButton(new ChangeButton(new Image(Assets.Environment.TILES_SEWERS, 176, 16, 16, 16), "Chasm changes",
				"""
						Dropping enemies into chasms is a very fun way to deal with enemies, but killing an enemy instantly and getting almost the full reward is simply too strong. This change should keep killing via chasms fun and useful, without it being as strong.

						_-_ Enemies killed via chasms now only award 50% exp"""));

		changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.SEED_SUNGRASS, null), "Seed adjustments",
				"""
						Sungrass is almost as effective as a potion of healing when used properly, which is extremely strong for a seed. I am increasing the time it takes to heal, so that hunger and combat while waiting can add some cost to the otherwise very powerful healing sungrass provides.

						_-_ Sungrass now grants healing significantly more slowly, scaling to ~40% speed at high levels
						_-_ Taking damage no longer reduces sungrass healing
						_-_ Sungrass healing no longer dissapears at full HP

						Earthroot is also problematic, as its 50% damage resist makes it an extremely potent tool against bosses, yet not so useful against regular enemies. My hope is that this change levels its power out over both situations.

						_-_ Earthroot now blocks up to a certain amount of damage, based on depth, rather than 50% damage"""));

		changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.POTION_CRIMSON, null), new PotionOfHealing().trueName(),
				"""
						Heal potion drops have had their RNG bounded in shattered for a long time, but this bound was always fairly lax. This meant that people who wanted to slowly farm for potions could still amass large numbers of them. I have decided to reign this in more harshly.

						_-_ Health potion drops now lower in probability more quickly after potions have already been dropped from a given enemy type

						This change should not seriously affect the average player, but does make hoarding health potions much less feasible."""));
	}

	public static void add_v0_6_3_Changes(ArrayList<ChangeInfo> changeInfos) {
		ChangeInfo changes = new ChangeInfo("v0.6.3", true, "");
		changes.hardlight(Window.TITLE_COLOR);
		changeInfos.add(changes);

		changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
		changes.hardlight(Window.TITLE_COLOR);
		changeInfos.add(changes);

		changes.addButton(new ChangeButton(Icons.get(Icons.SHPX), "Developer Commentary",
				"""
						_-_ Released February 14th, 2018
						_-_ 113 days after Shattered v0.6.2

						Prior to v0.6.3 thrown weapons broke on a single hit each and so weren't useful for much. I didn't want to just amp up their quantity though, as players would just horde them and use them against bosses. By lowering quantity but also giving thrown weapons durability, I was able to make them much more useful without making hoarding problematic.

						v0.6.3 is also an excellent case for why I run betas for every Shattered update. In the original beta for v0.6.3 thrown weapons were seriously overpowered, and threatened to make regular weapons pointless. I ended up significantly reducing their stats and quantity before the full release.

						This update also demonstrates Shattered's ever-increasing scope and update size. Despite reworking a whole category of items, I ended up just calling this a minor update."""));

		changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.TRIDENT, null), "Ranged Weapons Overhaul!",
				"""
						Ranged weapons have been completely overhauled!

						_-_ Quantity of ranged weapons decreased, however most ranged weapons now last for several uses before breaking.

						_-_ Ranged weapon effectiveness increased significantly.

						_-_ Ranged weapons are now dropped in more situations, and do not replace melee weapons.

						_-_ Existing ranged weapons reworked, 5 new ranged weapons added.

						_-_ Warrior now starts with throwing stones, rogue starts with throwing knives"""));

		changes.addButton(new ChangeButton(new Image(Assets.Sprites.HUNTRESS, 0, 15, 12, 15), "Huntress",
				"""
						Huntress adjusted due to ranged weapon changes (note that this is not a full class rework):

						_-_ Huntress no longer has a chance to reclaim a single ranged weapon.

						_-_ Missile weapons now have 50% greater durability when used by the huntress.

						_-_ Boomerang dmg increased to 1-6 from 1-5
						_-_ Boomerang str req reduced to 9 from 10
						_-_ Knuckleduster dmg reduced to 1-5 from 1-6"""));

		changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.CHILLING_DART, null), "Expanded Alchemy",
				"""
						It is now possible to use alchemy to tip darts!

						_-_ Every seed (except blandfruit) can now be combined with two darts to make two tipped darts.

						_-_ Tipped dart effects are similar to their potion/seed counterparts.

						_-_ Curare darts are now paralytic darts, and paralyze for 5 turns, up from 3

						_-_ Alchemy interface now features a recipes button to show you what you can create."""));

		changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.RING_TOPAZ, null), Messages.get(RingOfSharpshooting.class, "name"),
				"""
						Ring of Sharpshooting overhauled

						_-_ No longer grants bonus accuracy

						_-_ Now increases ranged weapon durability, instead of giving a chance to not consume them

						_-_ Now increases ranged weapon damage, scaling based on the weapon's initial damage."""));

		changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
		changes.hardlight(CharSprite.WARNING);
		changeInfos.add(changes);

		changes.addButton(new ChangeButton(new BuffIcon(BuffIndicator.FIRE, true), "Changes to debuffs and resistances",
				"""
						The game's resistance system has been totally overhauled, to allow for more flexibility and consistency.

						Previously, if a character was resistant to something, its effect would be reduced by a random amount between 0% and 100%.

						Now, resistances are much less random, applying a specific reduction to harmful effects. Currently all resistances are 50%.

						Resistances are also now much more consistent between different creatures. e.g. all non-organic enemies are now immune to bleed.

						A few things have been adjusted due to this:

						_-_ The Rotting Fist is now immune to paralysis.
						_-_ Psionic blast now deals 100% of current HP, instead of 100% of max HP.
						_-_ Damage from fire now scales with max HP, and is slightly lower below 40 max HP."""));

		changes.addButton(new ChangeButton(new WandOfCorrosion(),
				"""
						Wand of venom is now wand of corrosion. This is primarily a visual rework, with only some changes to functionality:

						_-_ Wand now shoots bolts of caustic gas, instead of venom gas
						_-_ Venom debuff is now corrosion debuff, functionality unchanged

						_-_ Battlemage now inflicts ooze with a staff of corrosion, instead of poison."""));

		changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), Messages.get(ChangesScene.class, "misc"),
				"""
						_-_ Performance improvements to the fog of war & mind vision.

						_-_ Improved the consistency of how ranged traps pick targets.

						_-_ Weapons and armor can now be found upgraded and cursed. Overall curse chance unchanged.

						_-_ Each shop now always stocks 2 random tipped darts

						_-_ Starting weapons can no longer appear in hero's remains

						_-_ The ghost hero is no longer unaffected by all buffs, and is also immune to corruption"""));

		changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
				"""
						Fixed:
						_-_ Various crash bugs
						_-_ Serious memory leaks on android 8.0+
						_-_ Rankings not retaining challenges completed
						_-_ Scroll of psionic blast debuffing a dead hero
						_-_ Rot lashers not being considered minibosses
						_-_ Wand of corruption ignoring NPCs
						_-_ NPCs being valid targets for assassin
						_-_ Wand of frost battlemage effect not activating as often as it should.
						_-_ Items in the alchemy window rarely being lost
						_-_ Various minor visual bugs"""));

		changes.addButton(new ChangeButton(Icons.get(Icons.LANGS), Messages.get(ChangesScene.class, "language"),
				"""
						In English:
						_-_ Fixed inconsistent text when equipping cursed artifacts

						Updated Translations"""));

		changes = new ChangeInfo(Messages.get(ChangesScene.class, "buffs"), false, null);
		changes.hardlight(CharSprite.POSITIVE);
		changeInfos.add(changes);

		changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.RING_EMERALD, null), Messages.get(RingOfElements.class, "name"),
				"""
						Thanks to the increased flexibility of the improved resistance system, buffing the ring of elements is now possible!

						_-_ Now reduces the duration and damage of harmful effects significantly more at higher levels.

						_-_ Rather than granting a chance to resist elemental/magic damage, ring now grants a set percentage resistance to these effects, which increases each level.

						_-_ Ring now applies to more elemental/magical effects than before."""));

		changes.addButton(new ChangeButton(new Image(Assets.Sprites.MAGE, 0, 90, 12, 15), "Warlock",
				"""
						The warlock is underperforming relative to the battlemage at the moment, and so he is getting an adjustment to his ability.

						This should hopefully both increase his power, and further encourage investing upgrades in wands.

						_-_ Reduced the base soul mark chance by 40%
						_-_ Increased soul mark chance scaling by 100%

						Soul mark chance reaches pre-adjustment levels at a +2 wand, and grows from there."""));

		changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.WAND_MAGIC_MISSILE, null), "Minor Wand buffs",
				"""
						Wand of Corruption:
						_-_ Reduced the corruption resistance of wraiths by ~40%
						_-_ Enemies now drop their loot (including ranged weapons) when corrupted.
						_-_ If an enemy is immune to a particular debuff, corruption will now try to give a different debuff, instead of doing nothing.

						Wand of Corrosion:
						_-_ Corrosion damage growth will continue at 1/2 speed when the damage cap is reached, rather than stopping completely."""));

		changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.FLAIL, null), "Weapon and Glyph buffs",
				"""
						Weapons with non-standard accuracy are generally weak, so they have been buffed across the board:

						_-_ Flail accuracy penalty reduced by 10%
						_-_ Handaxe accuracy bonus increased by 9.5%
						_-_ Mace accuracy bonus increased by 8%
						_-_ BattleAxe accuracy bonus increased by 6.5%
						_-_ WarHammer accuracy bonus increased by 5%

						Glyph Buffs:
						_-_ Glyph of obfuscation no longer reduces damage blocking, but is also less powerful.
						_-_ Glyph of entanglement now gives more herbal armor, and root duration decreases at higher armor levels."""));

		changes = new ChangeInfo(Messages.get(ChangesScene.class, "nerfs"), false, null);
		changes.hardlight(CharSprite.NEGATIVE);
		changeInfos.add(changes);

		changes.addButton(new ChangeButton(new Image(Assets.Sprites.WARRIOR, 0, 90, 12, 15), "Berserker",
				"""
						The previous berserker nerf from 0.6.2 had little effect on his overall winrate, so I'm trying again with a different approach, based around having a permanent penalty for each use of berserk.

						_-_ Reverted exhaustion nerf from 0.6.2

						_-_ Decreased lvls to recover rage to 2 from 3
						_-_ Berserking now reduces max health by 20%"""));

		changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.RING_ONYX, null), new RingOfEvasion().trueName(),
				"""
						The ring of evasion has always been a very powerful ring, but the recent freerunner rework has increased the power of evasiveness in general, making the ring overbearingly strong.

						Evasion synergy has been adjusted:
						_-_ Ring of evasion no longer synergizes as strongly with freerunner or armor of swiftness.
						_-_ Previously their affects would multiply together, they now add to eachother instead.

						And the ring itself has been nerf/simplified:
						_-_ Ring of evasion no longer grants stealth"""));
	}

	public static void add_v0_6_2_Changes(ArrayList<ChangeInfo> changeInfos) {
		ChangeInfo changes = new ChangeInfo("v0.6.2", true, "");
		changes.hardlight(Window.TITLE_COLOR);
		changeInfos.add(changes);

		changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
		changes.hardlight(Window.TITLE_COLOR);
		changeInfos.add(changes);

		changes.addButton(new ChangeButton(Icons.get(Icons.SHPX), "Developer Commentary",
				"""
						_-_ Released October 24th, 2017
						_-_ 70 days after Shattered v0.6.1

						Before v0.6.2 secret rooms weren't a purposeful part of level generation, they occurred when the levelgen algorithm randomly hid all of the doors leading to a room. This caused a lot of problems, as secrets were often easy to find, but could also sometimes hide important progression items! I changed this to make secret rooms more deliberate, which let me fine tune their rewards and difficulty of discovery.

						This update also featured a proper rework for the Rogue! The cloak of shadows from v0.2.0 was kept, and I made a bunch of changes focused on consolidating his benefits, which did a lot to make the Rogue's strengths more pronounced and focused.

						Lastly, v0.6.2 (and v0.6.1) included some important AI changes that made character behaviour much more consistent when allies are concerned. This paved the way for ally additions in future updates."""));

		changes.addButton(new ChangeButton(Icons.get(Icons.STAIRS), "Dungeon Secrets!",
				"""
						The secrets of the dungeon have been totally redesigned!

						_-_ Regular rooms can no longer be totally hidden

						_-_ 12 new secret rooms added, which are always hidden

						_-_ Hidden doors are now harder to find automatically

						_-_ Searching now consumes 6 turns of hunger, up from 2.

						This is a big adjustment to how secrets work in the dungeon. The goal is to make secrets more interesting, harder to find, and also more optional."""));

		changes.addButton(new ChangeButton(new Image(Assets.Sprites.ROGUE, 0, 15, 12, 15), "Rogue Rework!",
				"""
						The rogue has been reworked! His abilities have received a number of changes to make his strengths more pronounced and focused.

						These abilities have been _removed:_
						_-_ Gains evasion from excess strength on armor
						_-_ Gains hunger 20% more slowly
						_-_ Identifies rings by wearing them
						_-_ Has an increased chance to detect secrets

						These abilities have been _added:_
						_-_ Searches in a wider radius than other heroes
						_-_ Is able to find more secrets in the dungeon

						Make sure to check out the Cloak of Shadows and Dagger changes as well."""));

		changes.addButton(new ChangeButton(new Image(Assets.Sprites.ROGUE, 0, 90, 12, 15), "Rogue Subclasses Rework!",
				"""
						Both of the rogue's subclasses has been reworked, with an emphasis on more powerful abilities that need more interaction from the player.

						_The Assassin:_
						_-_ No longer gains a free +25% damage on surprise attacks
						_-_ Now prepares for a deadly strike while invisible, the longer he waits the more powerful the strike becomes.
						_-_ Charged attacks have special effects, such as blinking to the target and dealing bonus damage to weakened enemies.

						_The Freerunner:_
						_-_ No longer gains movement speed when not hungry or encumbered
						_-_ Now gains 'momentum' as he runs. Momentum increases evasion and movement speed as it builds.
						_-_ Momentum is rapidly lost when standing still.
						_-_ Evasion gained from momentum scales with excess strength on armor."""));

		changes.addButton(new ChangeButton(new Image(Assets.Environment.TERRAIN_FEATURES, 16, 0, 16, 16), "Trap Overhaul!",
				"""
						Most of the game's traps have received changes, some have been overhauled entirely!

						_-_ Removed Spear and Paralytic Gas Traps
						_-_ Lightning Trap is now Shocking and Storm traps
						_-_ Elemental Traps now all create fields of their element
						_-_ Worn and Poison Trap are now Worn and Poison Dart Trap
						_-_ Dart traps, Rockfall Trap, and Disintegration Trap are now always visible, but attack at a range
						_-_ Warping Trap reworked, no longer sends to previous floors
						_-_ Gripping and Flashing Traps now never deactivate, but are less harmful

						_-_ Tengu now uses Gripping Traps

						_-_ Significantly reduced instances of items appearing ontop of item-destroying traps"""));

		changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.LOCKED_CHEST, null), "Chest Adjustments",
				"""
						_-_ Crystal chests are now opened by crystal keys.

						_-_ Golden chests now sometimes appear in the dungeon, containing more valuable items."""));

		changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.IRON_KEY, null), "New Key Display",
				"""
						The key display has been overhauled!

						_-_ Each key type now has its own icon, instead of all special keys being shown as golden.

						_-_ Can now display up to 6 keys, up from 3. After 3 keys the key icons will become smaller.

						_-_ Button background now dims as keys are collected, for added visual clarity."""));


		changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
		changes.hardlight(CharSprite.WARNING);
		changeInfos.add(changes);

		changes.addButton(new ChangeButton(new WandOfCorruption(),
				"""
						The Wand of Corruption has been reworked!

						_-_ Corruption resistance is now based on enemy exp values, not max HP. Low HP and debuffs still reduce enemy corruption resistance.

						_-_ Wand now only spends 1 charge per shot, and inflicts debuffs on enemies if it fails to corrupt. Debuffs become stronger the closer the wand got to corrupting.

						_-_ Corrupted enemies are now considered by the game to be ally characters.

						_-_ Corrupted enemies award exp immediately as they are corrupted.

						These changes are aimed at making the wand more powerful, and also less of an all-in wand. Wand of Corruption is now useful even if it doesn't corrupt an enemy."""));

		changes.addButton(new ChangeButton(new Image(Assets.Sprites.STATUE, 0, 0, 12, 15), "AI and Enemy Changes",
				"""
						_-_ Characters now have an internal alignment and choose enemies based on that. Friendly characters should now never attack eachother.

						_-_ Injured characters will now always have a persistent health bar, even if they aren't being targeted.

						_-_ Improved enemy emote visuals, they now appear more frequently and there is now one for losing a target.

						_-_ Enemies now always lose their target after being teleported."""));

		changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), Messages.get(ChangesScene.class, "misc"),
				"""
						_-_ Buff icons can now be tinted, several buffs take advantage of this to better display their state.

						_-_ Wands that fire magical bolts now push on their detonation area, opening doors and trampling grass.

						_-_ Crystal chest rooms will now always have a different item type in each chest.

						_-_ Burning and freezing now destroy held items in a more consistent manner.

						_-_ Reduced enemies in dark floors to 1.5x, from 2x.
						_-_ Increased the brightness of the fog of war.
						_-_ Various internal code improvements.
						_-_ Added a new interface and graphics for alchemy.
						_-_ Zooming is now less stiff at low resolutions.
						_-_ Improved VFX when items are picked up.
						_-_ Improved older updates in the changes list.
						_-_ Game now mutes during phone calls on android 6.0+"""));

		changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
				"""
						Fixed:
						_-_ Various crash bugs
						_-_ Various exploits players could use to determine map shape
						_-_ Artifacts sometimes removed from quickslot when equipped
						_-_ Items removed from quickslots when containers are bought
						_-_ Swapping misc items not working with a full inventory
						_-_ Enemies sometimes not waking from sleep
						_-_ Swarms not duplicating over hazards
						_-_ Black bars on certain modern phones
						_-_ Action button not persisting between floors
						_-_ Various bugs with multiplicity curse
						_-_ Various minor visual bugs
						_-_ Plants not updating terrain correctly
						_-_ Enemies spawning ontop of exit stairs
						_-_ Evil Eyes sometimes skipping beam chargeup
						_-_ Warrior's seal being disabled by armor kit
						_-_ Gladiator being able to combo non-visible enemies
						_-_ Music volume being ignored in certain cases
						_-_ Game music not correctly pausing on android 2.2/2.3
						_-_ Game failing to save in rare cases"""));

		changes.addButton(new ChangeButton(Icons.get(Icons.LANGS), Messages.get(ChangesScene.class, "language"),
				"""
						In English:
						_-_ Improved some common game log entries
						_-_ Fixed a typo when enemies die out of view
						_-_ Fixed a typo in the ghost hero's introduction
						_-_ Fixed a typo in dirk description
						_-_ Fixed various text errors with venom

						_-_ Translation Updates
						_-_ Various Translation Updates
						_-_ Added new language: _Turkish_
						_-_ New Language: _Czech_"""));

		changes = new ChangeInfo(Messages.get(ChangesScene.class, "buffs"), false, null);
		changes.hardlight(CharSprite.POSITIVE);
		changeInfos.add(changes);

		changes.addButton(new ChangeButton(new CloakOfShadows(),
				"""
						As part of the rogue rework, the cloak of shadows has been significantly buffed:

						_-_ Max charges have been halved, however each charge is roughly twice as useful.
						_-_ As there are half as many charges total, charge rate is effectively increased.
						_-_ Cooldown mechanic removed, cloak can now be used multiple times in a row.
						_-_ Cloak levelling progression changed, it is now much more dependant on hero level

						These changes should let the rogue go invisible more often, and with more flexibility."""));

		changes.addButton(new ChangeButton(new Dagger(),
				"""
						As part of the rogue rework, sneak attack weapons have been buffed:

						_-_ Dagger sneak attack minimum damage increased to 75% from 50%.
						_-_ Dirk sneak attack minimum damage increased to 67% from 50%
						_-_ Assassin's blade sneak attack minimum damage unchanged at 50%

						This change should hopefully give the rogue some needed earlygame help, and give him a more clear choice as to what item he should upgrade, if no items were found in the dungeon."""));

		changes.addButton(new ChangeButton(new Flail(),
				"""
						The flail's downsides were too harsh, so one of them has been changed both to make its weaknesses more centralized and to hopefully increase its power.

						_-_ Flail no longer attacks at 0.8x speed, instead it has 20% reduced accuracy."""));

		changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.POTION_GOLDEN, null), "Potion Adjustments",
				"""
						Potion of Purification buffed:
						_-_ Drinking effect now lasts for 20 turns, up from 15.
						_-_ Drinking now provides immunity to all area-bound effects, not just gasses.

						Potion of Frost buffed:
						_-_ Now creates a freezing field which lasts for several turns."""));

		changes = new ChangeInfo(Messages.get(ChangesScene.class, "nerfs"), false, null);
		changes.hardlight(CharSprite.NEGATIVE);
		changeInfos.add(changes);

		changes.addButton(new ChangeButton(new Image(Assets.Sprites.WARRIOR, 0, 90, 12, 15), "Berserker",
				"""
						The Berserker's survivability and power have been reduced to help bring him into line with the other subclasses:

						_-_ Bonus damage from low health reduced significantly when below 50% HP. 2x damage while berserking is unchanged.

						_-_ Turns of exhaustion after berserking increased to 60 from 40. Damage reduction from exhaustion stays higher for longer."""));

		changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.REMAINS, null), "Heroes Remains",
				"""
						_-_ Remains can no longer contain progression items, such as potions of strength or scrolls of upgrade.

						_-_ All upgradeable items dropped by remains are now capped at +3 (+0 for artifacts)

						The intention for remains is so a previously failed run can give a nice surprise and tiny boost to the next one, but these items are both too strong and too easy to abuse.

						In compensation, it is now much less likely to receive gold from remains, unless that character died with very few items."""));
	}

	public static void add_v0_6_1_Changes(ArrayList<ChangeInfo> changeInfos) {
		ChangeInfo changes = new ChangeInfo("v0.6.1", true, "");
		changes.hardlight(Window.TITLE_COLOR);
		changeInfos.add(changes);

		changes = new ChangeInfo(Messages.get(ChangesScene.class, "new"), false, null);
		changes.hardlight(Window.TITLE_COLOR);
		changeInfos.add(changes);

		changes.addButton(new ChangeButton(Icons.get(Icons.SHPX), "Developer Commentary",
				"""
						_-_ Released August 15th, 2017
						_-_ 72 days after Shattered v0.6.0

						v0.6.1 was light on core game content, but made some critical improvements to the new player experience by expanding the journal system. I really wanted to make the player feel less compelled to seek out external guides for Shattered, and so I wrote up an in-game guide that pointed the player in the right direction without spoiling too much.  The previous system used signposts at the start of each floor, which were the same every run and couldn't be read at any time.

						v0.6.1 also overhauled the changes screen, which you're viewing right now! Long text-based changelogs just don't work on mobile screens, as there's much less screen real-estate to work with. I didn't want Shattered's changelog to be a big wall of text, but I also didn't want to abbreviate lots of details. The solution was to keep the full text, but hide it behind categories and icons!"""));

		changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.GUIDE_PAGE, null), "Journal Additions",
				"""
						_-_ Overhauled the Journal window with loads of new functionality

						_-_ Added a completely overhauled tutorial experience, which replaces the existing signpost system.

						_-_ Massively expanded the items catalog, now contains every identifiable item in the game."""));

		changes.addButton(new ChangeButton(BadgeBanner.image(Badges.Badge.ALL_ITEMS_IDENTIFIED.image), "Badge Changes",
				"""
						_-_ Added new badges for identifying all weapons, armor, wands, and artifacts.

						_-_ All identification-based badges are now tied to the new item list system, and progress for them will persist between runs.

						_-_ Removed the Night Hunter badge

						_-_ The 'Many Deaths' badge now covers all death related badges, previously it was not covering 2 of them.

						_-_ Reduced the numbers of games needed for the 'games played' badges from 10/100/500/2000 to 10/50/250/1000

						_-_ Blank badges shown in the badges menu are now accurate to how many badges you have left to unlock."""));

		changes.addButton(new ChangeButton(Icons.get(Icons.STAIRS), "Dungeon Changes",
				"""
						_-_ Added 5 new regional rooms
						_-_ Added two new uncommon room types
						_-_ Added a new type of tunnel room

						_-_ Level layouts now more likely to be dense and interconnected.

						_-_ Tunnels will now appear more consistently.

						_-_ Ascending stairs, descending stairs, and mining no longer increase hunger."""));

		changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.RING_TOPAZ, null), new RingOfEnergy().trueName(),
				"_-_ Added the ring of energy."));

		changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.CHEST, null), "Sprites",
				"""
						New sprites for the following:
						_-_ Chests & Mimics
						_-_ Darts
						_-_ Javelins
						_-_ Tomahawks"""));

		changes = new ChangeInfo(Messages.get(ChangesScene.class, "changes"), false, null);
		changes.hardlight(CharSprite.WARNING);
		changeInfos.add(changes);

		changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.RING_DIAMOND, null), "Ring Mechanics Changes",
				"""
						Rings now handle upgrades and curses more similarly to other items:

						_-_ Rings are now found at +0, down from +1, but are more powerful to compensate.

						_-_ Curses no longer affect ring upgrades, it is now impossible to find negatively upgraded rings.

						_-_ Cursed rings are now always harmful regardless of their level, until the curse is cleansed.

						_-_ Scrolls of upgrade have a chance to remove curses on a ring, scrolls of remove curse will always remove the curse."""));

		changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.RING_AMETHYST, null), new RingOfWealth().trueName(),
				"""
						The ring of wealth is getting a change in emphasis, moving away from affecting items generally, and instead affecting item drops more strongly.

						_-_ No longer grants any benefit to item spawns when levels are generated.

						_-_ Now has a chance to generate extra loot when defeating enemies.

						I'm planning to make further tweaks to this item in future updates."""));

		changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.POTION_CRIMSON, null), new PotionOfHealing().trueName(),
				"""
						Health Potions are getting a changeup to make hoarding and chugging them less effective, and to encourage a bit more strategy than to just drink them on the verge of death.

						_-_ Health potions now heal in a burst that fades over time, rather than instantly.

						_-_ Health potions now heal more than max HP at low levels, and slightly less than max HP at high levels.

						Make sure to read the dew vial changes as well."""));

		changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.VIAL, null), "Dew Vial",
				"""
						The dew vial (and dew) are having their healing abilities enhanced to improve the availability of healing in the sewers, and to help offset the health potion changes.

						_-_ Dew drops now heal 5% of max HP

						_-_ Dew vial now always spawns on floor 1

						_-_ The dew vial is now full at 20 drops, drinking heals 5% per drop and is instantaneous.

						_-_ Dew will always be collected into an available vial, even if the hero is below full HP.

						_-_ When drinking from the vial, the hero will now only drink as many drops as they need to reach full HP."""));

		changes.addButton(new ChangeButton(new Image(Assets.Sprites.STATUE, 0, 0, 12, 15), "AI Changes",
				"""
						_-_ Improvements to pathfinding. Characters are now more prone to take efficient paths to their targets, and will prefer to wait instead of taking a very inefficient path.

						_-_ Characters will now more consistently decide who to attack based on distance and who they are being attacked by."""));

		changes.addButton(new ChangeButton(new Image(Assets.Sprites.SPINNER, 144, 0, 16, 16), Messages.get(ChangesScene.class, "bugfixes"),
				"""
						Fixed:
						_-_ Issues with Android 7.0+ multi-window
						_-_ Rare stability issues on certain devices
						_-_ Numerous rare crash and freeze bugs
						_-_ Chasm death not showing in rankings
						_-_ Resting icon sometimes not appearing
						_-_ Various minor graphical bugs
						_-_ The ambitious imp rarely blocking paths
						_-_ Berserk prematurely ending after loading
						_-_ Mind vision not updating while waiting
						_-_ Troll blacksmith destroying broken seal
						_-_ Wands always being uncursed by upgrades
						_-_ Various bugs with Evil Eyes
						_-_ Thieves being able to escape while visible
						_-_ Enemies not visually dying in rare cases
						_-_ Visuals flickering while zooming on low resolution devices.
						_-_ Various minor bugs with the buff indicator
						_-_ Sleep-immune enemies being affected by magical sleep
						_-_ Sad Ghost being affected by corruption
						_-_ Switching places with the Sad Ghost over chasms causing the hero to fall"""));

		changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), Messages.get(ChangesScene.class, "misc"),
				"""
						_-_ Completely overhauled the changes scene (which you're currently reading!)
						_-_ Item and enemy spawn RNG is now more consistent. Should prevent things like finding 4 crabs on floor 3.
						_-_ The compass marker now points toward entrances after the amulet has been acquired.
						_-_ Improved quickslot behaviour when items are removed by monks or thieves.
						_-_ Allies are now better able to follow you through bosses.
						_-_ Lloyd's Beacon's return function is no longer blocked by none-hostile creatures.
						_-_ Performance tweaks on devices with 2+ cpu cores
						_-_ Stepping on plants now interrupts the hero
						_-_ Improved potion and scroll inventory icons
						_-_ Increased landscape width of some windows
						_-_ Un-IDed artifacts no longer display charge"""));

		changes.addButton(new ChangeButton(Icons.get(Icons.LANGS), Messages.get(ChangesScene.class, "language"),
				"""
						Fixed in English:
						_-_ Missing capitalization in Prison Guard text
						_-_ Typo when trying a locked chest with no key
						_-_ Missing period in alarm trap description

						_-_ Added new Language: _Catalan_

						_-_ Various translation updates"""));

		changes = new ChangeInfo(Messages.get(ChangesScene.class, "buffs"), false, null);
		changes.hardlight(CharSprite.POSITIVE);
		changeInfos.add(changes);

		changes.addButton(new ChangeButton(new UnstableSpellbook(),
				"""
						The Unstable spellbook wasn't really worth upgrading, so it's getting some new effects to make it worth investing in!

						_-_ Infusing a scroll into the unstable spellbook will now grant a unique empowered effect whenever that scroll's spell is cast from the book.

						To compensate, charge mechanics have been adjusted:

						_-_ Max charges reduced from 3-8 to 2-6

						_-_ Recharge speed has been reduced slightly"""));

		changes.addButton(new ChangeButton(new DriedRose().upgrade(10),
				"""
						The ghost hero summoned by the rose is now much more capable and is also much less temporary:

						_-_ Ghost can now be equipped with a weapon and armor and uses them just like the hero.
						_-_ Ghost no longer takes damage over time as long as the rose remains equipped.
						_-_ Ghost health increased by 10
						_-_ Ghost now has a persistent HP bar
						_-_ Ghost can now follow you between floors

						However:

						_-_ Ghost no longer gains damage and defense from rose levels, instead gains strength to use better equipment.
						_-_ Rose no longer recharges while ghost is summoned
						_-_ Rose takes 25% longer to fully charge"""));

		changes.addButton(new ChangeButton(Icons.get(Icons.BACKPACK), "Inventory",
				"""
						_-_ Inventory space increased from 19 slots to 20 slots.

						_-_ Gold indicator has been moved to the top-right of the inventory window to make room for the extra slot."""));

		changes = new ChangeInfo(Messages.get(ChangesScene.class, "nerfs"), false, null);
		changes.hardlight(CharSprite.NEGATIVE);
		changeInfos.add(changes);

		changes.addButton(new ChangeButton(new HornOfPlenty(),
				"""
						The Horn of Plenty was providing a bit too much value in the earlygame, especially without upgrades:

						_-_ Charge Speed reduced, primarily at lower levels:
						-20% at +0
						-7.5% at +10

						_-_ Upgrade rate adjusted, Food now contributes towards upgrades exactly in line with how much hunger it restores. This means smaller food items will contribute more, larger ones will contribute less. Rations still grant exactly 1 upgrade each."""));

		changes.addButton(new ChangeButton(new ItemSprite(ItemSpriteSheet.RING_GARNET, null), new RingOfMight().trueName(),
				"""
						The Ring of Might's strength bonus is already extremely valuable, having it also provide an excellent health boost was simply too much:

						_-_ Health granted reduced from +5 per upgrade to +3.5% of max hp per upgrade.

						This is a massive reduction to its earlygame health boosting power, however as the player levels up this will improve. By hero level 26 it will be as strong as before this change."""));

		changes.addButton(new ChangeButton(new EtherealChains(),
				"""
						The ability for Ethereal Chains to pull you literally anywhere limits design possibilities for future updates, so I've added a limitation.

						_-_ Ethereal chains now cannot reach locations the player cannot reach by walking or flying. e.g. the chains can no longer reach into a locked room.

						_-_ Ethereal chains can now reach through walls on boss floors, but the above limitation still applies."""));
	}

	public static void add_v0_6_0_Changes(ArrayList<ChangeInfo> changeInfos) {
		ChangeInfo changes = new ChangeInfo("v0.6.0", true, "");
		changes.hardlight(Window.TITLE_COLOR);
		changeInfos.add(changes);

		changes.addButton(new ChangeButton(Icons.get(Icons.SHPX), "Developer Commentary",
				"""
						_-_ Released June 4th, 2017
						_-_ 116 days after Shattered v0.5.0

						v0.6.0 was another major content change focused on the dungeon, this time to level generation! After v0.6.0 rooms were able to specify their own shape and size before the levelgen algorithm then tried to fit them all together. Previously levelgen would create the shape of a level first and then try to place rooms in that shape.

						I'm really proud of this levelgen algorithm even to this day. v0.6.0 both improved levelgen on its own and paved the way for future improvements in updates like v0.6.2 and v0.9.1.

						I feel v0.6.0 also represents the start of another era in Shattered's development. While Shattered was still missing some big updates (most notably v0.8.0), after v0.6.0 Shattered started to resemble its current incarnation more than the original Pixel Dungeon."""));

		changes.addButton(new ChangeButton(Icons.get(Icons.STAIRS), "Levelgen Overhaul!",
				"""
						Level creation algorithm overhauled!

						_-_ Levels are now much less box-shaped
						_-_ Sewers are now smaller, caves+ are now larger
						_-_ Some rooms can now be much larger than before
						_-_ Added 8 new standard room types, and loads of new standard room layouts

						_-_ Reduced number of traps in later chapters"""));

		changes.addButton(new ChangeButton(new ItemSprite(new Torch()), "Light Source Buffs",
				"""
						_-_ Light sources now grant significantly more vision
						_-_ Light from torches now lasts 20% longer
						_-_ Slightly increased visibility on floor 22+
						_-_ Floor 21 shop now sells 3 torches, up from 2"""));

		changes.addButton(new ChangeButton(new ItemSprite(new Food()), "Food Buffs",
				"_-_ Meat and small rations are 50% more filling\n" +
						"_-_ Pasties and blandfruit are 12.5% more filling"));

		changes.addButton(new ChangeButton(new ItemSprite(new Greataxe()), "Tier-5 Weapon Buffs",
				"_-_ Greataxe base damage increased by ~22%\n" +
						"_-_ Greatshield base damage increased by ~17%"));

		changes.addButton(new ChangeButton(new ItemSprite(new StoneOfEnchantment()), "Enchant and Glyph Balance Changes",
				"""
						_-_ Vampiric enchant lifesteal reduced by 20%

						Lucky enchant rebalanced:
						_-_ now deals 2x/0x damage, instead of min/max
						_-_ base chance to deal 2x increased by ~10%

						Glyph of Viscosity rebalanced:
						_-_ proc chance reduced by ~25%\s
						_-_ damage over time reverted from 15% to 10%

						_-_ Glyph of Entanglement root time reduced by 40%

						Glyph of Potential rebalanced:
						_-_ self-damage no longer scales with max hp
						_-_ grants more charge at higher levels"""));

		changes.addButton(new ChangeButton(Icons.get(Icons.PREFS), Messages.get(ChangesScene.class, "misc"),
				"""
						_-_ Visiting floor 21 before completing the imp quest no longer prevents his shop from spawning

						_-_ Floor 2 entry doors are now only hidden for new players

						_-_ Falling damage tweaked to be less random

						_-_ Resume indicator now appears in more cases"""));
	}
}
