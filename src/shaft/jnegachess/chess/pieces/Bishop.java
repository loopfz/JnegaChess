/*
 * The MIT License
 *
 * Copyright 2013 Thomas Schaffer <thomas.schaffer@epitech.eu>.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package shaft.jnegachess.chess.pieces;

import shaft.jnegachess.chess.IChessBoard;
import shaft.jnegachess.chess.IChessPiece;

/**
 *
 * @author Thomas Schaffer <thomas.schaffer@epitech.eu>
 */
public class Bishop extends AChessPiece {
    final private static int[] _posMatrix = {
        -20, -10, -10, -10, -10, -10, -10, -20,
        -10, 0, 0, 0, 0, 0, 0, -10,
        -10, 0, 5, 10, 10, 5, 0, -10,
        -10, 5, 5, 10, 10, 5, 5, -10,
        -10, 0, 10, 10, 10, 10, 0, -10,
        -10, 10, 10, 10, 10, 10, 10, -10,
        -10, 5, 0, 0, 0, 0, 5, -10,
        -20, -10, -10, -10, -10, -10, -10, -20
    };
    
    @Override
    protected int[] getPositionMatrix() {
        return _posMatrix;
    }

    public Bishop(int x, int y, boolean color) {
        super(x, y, color, IChessPiece.BISHOP, 330);
    }
    
    private Bishop(Bishop other) {
        super(other);
    }

    @Override
    public void nextMoves(IChessBoard board) {
        moveNDiagonally(board, 8);
    }
    
    @Override
    public boolean threatens(IChessBoard board, int x, int y) {
        return threatenNDiagonally(board, 8, x, y);
    }

    @Override
    public IChessPiece copyPiece() {
        return new Bishop(this);
    }
    
}
