package chess.engine.Move;

import chess.engine.Board.Board;
import chess.engine.Pieces.Piece;


public class Attack_Move extends Move {

    private Piece attackedPiece ;

    /**
     *
     * @param board                     The current board .
     * @param destinationCoordinate     The destination that the piece wished to move to
     * @param movedPiece                The moved piece
     * @param attackedPiece             The piece on the destination coordinate .
     */
    public Attack_Move(Board board, int destinationCoordinate, Piece movedPiece , Piece attackedPiece) {
        super(board, destinationCoordinate, movedPiece);
        this.attackedPiece = attackedPiece ;
    }

    @Override
    public Piece getAttackedPiece() {
        return attackedPiece;
    }

    @Override
    public boolean isAttack() {
        return true;
    }


    @Override
    public boolean equals(final Object other) {
        if (other == this)
            return true ;

        if (!(other instanceof Attack_Move))
            return false ;

        Attack_Move comparedAttackMove = (Attack_Move) other ;
        return super.equals(other) && attackedPiece.equals(comparedAttackMove.getAttackedPiece()) ;
    }

    @Override
    public int hashCode() {
        return super.hashCode() + attackedPiece.hashCode() ;
    }

}
