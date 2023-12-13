RPG: Character Creator and Battle Simulator 

This project is designed as an implementation of a simplified custom role-playing system.
(For specifics on the role-playing system see below.)

It allows users to interact with a graphical user interface to select the traits of and choose
the name of their character.(For specifics see below.)

Once done with creating their character, the user can choose to engage in a simulated battle.
In this battle one of three preset enemies are selected to by the opponent, at random.
The user has the choice to attack or defend, rolling dice for a chance to do damage against
their opponent, or recovering their stamina and some health.
(For specifics on the battle mechanics see below.)

After either, or both combatants are eliminated a pop up informs the user of the result
and reloads the character creation menu, allowing the user to modify their character and
fight again or simply close the application.

ROLE-PLAYING SYSTEM:

This simplified system uses three selectable attributes of the character to define their
base stats.

BASE STATS:
The base stats are health, stamina, hit chance, and defense.

        HEALTH: This represents the amount of damage that can be taken before the player dies.
                STARTING VALUE(BEFORE MODIFIERS): 100

        STAMINA: This represents how energy the player has. Determines if player can attack and their chance to hit.
                STARTING VALUE(BEFORE MODIFIERS): 100

        HIT CHANCE: This represents player's chance to land an attack. In conjunction with stamina, it determines if a player attack lands. 
                STARTING VALUE(BEFORE MODIFIERS): 50

        DEFENSE: This represents player's chance to avoid an attack. In conjunction with stamina, it determines if an opponent's attack lands. 
                STARTING VALUE(BEFORE MODIFIERS): 50

SELECTABLE ATTRIBUTES:
The selectable attributes are character class, race, and talent.

        CHARACTER CLASSES:
            MAGE:A class good at landing hits but physically weak and easily exhausted.
                MODIFIERS: (HEALTH -10) (STAMINA -10) (Hit Chance +20) (Defense +0)

            WARRIOR: A physically strong class, but it's wild nature leaves the player easily exhausted and with poor accuracy.
                MODIFIERS: (HEALTH +10) (STAMINA -10) (Hit Chance -10) (Defense +10)

            ROGUE: A vulnerable and physically week class, but it compensates with great endurance and precision.
                MODIFIERS: (HEALTH -10) (STAMINA +10) (Hit Chance +10) (Defense -10)

        RACES:
            Human: The most adaptable and versatile, they have no major strengths compared to their peers but also no weaknesses.
                MODIFIERS: (HEALTH +0) (STAMINA +0) (Hit Chance +0) (Defense +0)

            Elf: Physically fragile but their featherweight build and accuracy compensate for this deficiency.
                MODIFIERS: (HEALTH -20) (STAMINA +20) (Hit Chance +10) (Defense -10)

            Dwarf: The sturdiest built and all around toughest group around, but their short height and stocky build has downsides.
                MODIFIERS: (HEALTH +20) (STAMINA -20) (Hit Chance -10) (Defense +10)

        Talents:
            LEFT HANDER: With the weapon held in the left hand attacks can more easily sneak past an opponents shield.
                MODIFIERS: (Hit Chance + 10) 

            STOCKY: Being built tough is helpful but being this large means a giant target not to mention making precise, careful difficult.
                MODIFIERS: (HEALTH +10) (Defense -10)

            TALL: Long arms and legs make it easier to safely land hits on an opponent and quicker to move away from danger.
                MODIFIERS: (Hit Chance +5) (Defense +5)

            TALL: Long arms and legs make it easier to safely land hits on an opponent and quicker to move away from danger.
                MODIFIERS: (Hit Chance +5) (Defense +5)
                
            TALL: Long arms and legs make it easier to safely land hits on an opponent and quicker to move away from danger.
                MODIFIERS: (Hit Chance +5) (Defense +5)

BATTLE SYSTEM:



external library considered: https://github.com/alexv-anderson/WildPi-Dice