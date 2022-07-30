package com.shannon.chess.model

abstract class ChessPiece(
    var name: String
) {
    abstract fun move(newPosition: ChessPosition)
    abstract fun canMove(newPosition: ChessPosition)
    abstract fun getCurrentPosition() : ChessPosition
}
