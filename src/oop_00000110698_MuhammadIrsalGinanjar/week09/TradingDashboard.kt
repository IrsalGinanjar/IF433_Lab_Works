package oop_00000110698_MuhammadIrsalGinanjar.week09

fun main() {
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 20, 15.5, "CLOSED"),
        TradeLog("ETHUSDT", "SHORT", 10, -5.2, "CLOSED"),
        TradeLog("BTCUSDT", "LONG", 50, 45.0, "OPEN"),
        TradeLog("SOLUSDT", "SHORT", 5, 2.5, "CLOSED"),
        TradeLog("ETHUSDT", "LONG", 15, -12.0, "CLOSED"),
        TradeLog("SOLUSDT", "LONG", 10, -1.5, "OPEN")
    )

    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }
    val winningTrades = closedTrades.filter { it.roe > 0 }
    val losingTrades = closedTrades.filter { it.roe <= 0 }
}