package chess.engine.Move;

import chess.engine.Board.Board;
import chess.engine.Pieces.Piece;

/**
 * Created by dania on 2/18/17.
 */
public class PawnAttackMove extends AttackMove {
    /**
     * @param board                 The current board .
     * @param destinationCoordinate The destination that the piece wished to move to
     * @param movedPiece            The moved piece
     * @param attackedPiece         The piece on the destination coordinate .
     */
    public PawnAttackMove(Board board, int destinationCoordinate, Piece movedPiece, Piece attackedPiece) {
        super(board, destinationCoordinate, movedPiece, attackedPiece);
    }

}
