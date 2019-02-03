package com.codingame.game.model

import com.codingame.game.Player

class Jarbage: AllInstancesAreConsideredEqual() {
  override fun describe() = Constants.EQUIPMENT.GARBAGE.name

  override fun receiveItem(player: Player, item: Item) {
    player.heldItem = if (item is Dish) Dish() else null
  }
}