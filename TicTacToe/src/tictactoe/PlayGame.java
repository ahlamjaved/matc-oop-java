/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

/**
 *
 * @author ahlamjaved
 */
public class PlayGame {
    char userMark;

    Board board = new Board();
    UserInput ui = new UserInput();
    int uNum = 1;
    int move = 0;

    public void play() {
        userMark = ui.selectMark();
        if (userMark == 'x') {
            board.setxo('o');
        } else {
            board.setxo('x');
        }
        do {
            move++;
            switch (ui.move()) {
                case 1: {
                    board.markTopLeft(uNum, userMark);
                    break;
                }
                case 2: {
                    board.markTopMiddle(uNum, userMark);
                    break;
                }
                case 3: {
                    board.markTopRight(uNum, userMark);
                    break;
                }
                case 4: {
                    board.markMiddleLeft(uNum, userMark);
                    break;
                }
                case 5: {
                    board.markMiddle(uNum, userMark);
                    break;
                }
                case 6: {
                    board.markMiddleRight(uNum, userMark);
                    break;
                }
                case 7: {
                    board.markBottomLeft(uNum, userMark);
                    break;
                }
                case 8: {
                    board.markBottomMiddle(uNum, userMark);
                    break;
                }
                case 9: {
                    board.markBottomRight(uNum, userMark);
                    break;
                }
                default: {
                    ui.error();
                    break;
                }
            }
            ui.board(board.board);
            board.move();
            ui.board(board.board);
            move++;

        } while (move < 9);
    }
}
