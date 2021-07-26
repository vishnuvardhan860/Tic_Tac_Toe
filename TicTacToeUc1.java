package com.tictactoe;

public class TicTacToeUc1 {
	 public static void main(String[] args) {
	        char[] board = new char[10];
	        for(int i = 0; i < board.length; i++) {
	            board[i] = '-';
	        }
	        System.out.println(board);
	    }
	}