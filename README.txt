--------------------------------------------------------------------------------
|            ___                        _____ _                                |
|           |_  |                      /  __ \ |                               |
|             | |_ __   ___  __ _  __ _| /  \/ |__   ___  ___ ___              |
|             | | '_ \ / _ \/ _` |/ _` | |   | '_ \ / _ \/ __/ __|             |
|         /\__/ / | | |  __/ (_| | (_| | \__/\ | | |  __/\__ \__ \             |
|         \____/|_| |_|\___|\__, |\__,_|\____/_| |_|\___||___/___/             |
|                            __/ |                                             |
|                           |___/                                              |
|                                                                              |
--------------------------------------------------------------------------------
| Written by Thomas Schaffer <thomas.schaffer@epitech.eu> in Java.             |
| Licensed under the MIT license.                                              |
--------------------------------------------------------------------------------

--------------------------------------------------------------------------------
| Description                                                                  |
--------------------------------------------------------------------------------

JnegaChess is a simple Chess game written by myself in Java for the purpose of
discovering game tree search techniques (minimax, negamax, alpha-beta...).

It uses a Negamax solver with alpha-beta pruning as its core, which
can look between 6 and 8 plies ahead. The number of plies is kept small for
real-time performance.

Leaf nodes in the game tree are evaluated using a simplified evaluation
function proposed by Polish researcher Tomasz Michniewski, using
only material evaluation (piece values) and position matrixes for each
piece type. No quiescence search or other chess-specific optimizations
are applied since this was not the goal pursued.

Human player plays white, good luck!

--------------------------------------------------------------------------------
| Versions                                                                     |
--------------------------------------------------------------------------------

2013-03-01	Version 0.1
