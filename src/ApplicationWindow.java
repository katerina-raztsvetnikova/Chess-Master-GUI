import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ApplicationWindow extends JFrame {
	
	
	JPanel gameBoard = new JPanel();
	JLabel chessPiece = new JLabel();
	JPanel squareOfBoard = new JPanel( new BorderLayout() );
	
				
	public ApplicationWindow () {
		
		Dimension boardSize = new Dimension(500, 500);
		gameBoard.setLayout(new GridLayout(10, 10));
		gameBoard.setPreferredSize( boardSize );
		gameBoard.setBounds(0,0, boardSize.width, boardSize.height);
		getContentPane().add(gameBoard);
		gameBoard.setPreferredSize(boardSize);
		gameBoard.addMouseListener(new MouseAction());
	      
		
		for(int square = 0; square < 100; square++) {
			JPanel squareOfBoard = new JPanel( new BorderLayout() );
			gameBoard.add( squareOfBoard );
			
			
			int row = (square / 10) % 2;
			if (row == 0) {
				
				squareOfBoard.setBackground( square % 2 == 0 ? Color.black : Color.white );
			
			}else {
				
				squareOfBoard.setBackground( square % 2 == 0 ? Color.white : Color.black );
			}		
		}
			
		
		JLabel piece = new JLabel( new ImageIcon("D:\\Programming\\Java-Eclipse\\Chess Master GUI\\Chess Pieces\\75px-Chess_rdt45.svg.png") );
		JPanel panel = (JPanel)gameBoard.getComponent(0);
		panel.add(piece);
		piece = new JLabel(new ImageIcon("D:\\Programming\\Java-Eclipse\\Chess Master GUI\\Chess Pieces\\75px-Chess_ndt45.svg.png"));
		panel = (JPanel)gameBoard.getComponent(1);
		panel.add(piece);
		piece = new JLabel(new ImageIcon("D:\\Programming\\Java-Eclipse\\Chess Master GUI\\Chess Pieces\\75px-Chess_bdt45.svg.png"));
		panel = (JPanel)gameBoard.getComponent(2);
		panel.add(piece);
		piece = new JLabel(new ImageIcon("D:\\Programming\\Java-Eclipse\\Chess Master GUI\\Chess Pieces\\75px-Chess_qdt45.svg.png"));
		panel = (JPanel)gameBoard.getComponent(3);
		panel.add(piece);
		piece = new JLabel(new ImageIcon("D:\\Programming\\Java-Eclipse\\Chess Master GUI\\Chess Pieces\\75px-Chess_kdt45.svg.png"));
		panel = (JPanel)gameBoard.getComponent(4);
		panel.add(piece);
		piece = new JLabel(new ImageIcon("D:\\Programming\\Java-Eclipse\\Chess Master GUI\\Chess Pieces\\75px-Chess_bdt45.svg.png"));
		panel = (JPanel)gameBoard.getComponent(5);
		panel.add(piece);
		piece = new JLabel(new ImageIcon("D:\\Programming\\Java-Eclipse\\Chess Master GUI\\Chess Pieces\\75px-Chess_ndt45.svg.png"));
		panel = (JPanel)gameBoard.getComponent(6);
		panel.add(piece);
		piece = new JLabel(new ImageIcon("D:\\Programming\\Java-Eclipse\\Chess Master GUI\\Chess Pieces\\75px-Chess_rdt45.svg.png"));
		panel = (JPanel)gameBoard.getComponent(7);
		panel.add(piece);
		piece = new JLabel(new ImageIcon("D:\\Programming\\Java-Eclipse\\Chess Master GUI\\Chess Pieces\\75px-Chess_pdt45.svg.png"));
		panel = (JPanel)gameBoard.getComponent(10);
		panel.add(piece);
		piece = new JLabel(new ImageIcon("D:\\Programming\\Java-Eclipse\\Chess Master GUI\\Chess Pieces\\75px-Chess_pdt45.svg.png"));
		panel = (JPanel)gameBoard.getComponent(11);
		panel.add(piece);
		piece = new JLabel(new ImageIcon("D:\\Programming\\Java-Eclipse\\Chess Master GUI\\Chess Pieces\\75px-Chess_pdt45.svg.png"));
		panel = (JPanel)gameBoard.getComponent(12);
		panel.add(piece);
		piece = new JLabel(new ImageIcon("D:\\Programming\\Java-Eclipse\\Chess Master GUI\\Chess Pieces\\75px-Chess_pdt45.svg.png"));
		panel = (JPanel)gameBoard.getComponent(13);
		panel.add(piece);
		piece = new JLabel(new ImageIcon("D:\\Programming\\Java-Eclipse\\Chess Master GUI\\Chess Pieces\\75px-Chess_pdt45.svg.png"));
		panel = (JPanel)gameBoard.getComponent(14);
		panel.add(piece);
		piece = new JLabel(new ImageIcon("D:\\Programming\\Java-Eclipse\\Chess Master GUI\\Chess Pieces\\75px-Chess_pdt45.svg.png"));
		panel = (JPanel)gameBoard.getComponent(15);
		panel.add(piece);
		piece = new JLabel(new ImageIcon("D:\\Programming\\Java-Eclipse\\Chess Master GUI\\Chess Pieces\\75px-Chess_pdt45.svg.png"));
		panel = (JPanel)gameBoard.getComponent(16);
		panel.add(piece);
		piece = new JLabel(new ImageIcon("D:\\Programming\\Java-Eclipse\\Chess Master GUI\\Chess Pieces\\75px-Chess_pdt45.svg.png"));
		panel = (JPanel)gameBoard.getComponent(17);
		panel.add(piece);
		piece = new JLabel(new ImageIcon("D:\\Programming\\Java-Eclipse\\Chess Master GUI\\Chess Pieces\\Chess_plt45.svg.png"));
		panel = (JPanel)gameBoard.getComponent(80);
		panel.add(piece);
		piece = new JLabel(new ImageIcon("D:\\Programming\\Java-Eclipse\\Chess Master GUI\\Chess Pieces\\Chess_plt45.svg.png"));
		panel = (JPanel)gameBoard.getComponent(81);
		panel.add(piece);
		piece = new JLabel(new ImageIcon("D:\\Programming\\Java-Eclipse\\Chess Master GUI\\Chess Pieces\\Chess_plt45.svg.png"));
		panel = (JPanel)gameBoard.getComponent(82);
		panel.add(piece);
		piece = new JLabel(new ImageIcon("D:\\Programming\\Java-Eclipse\\Chess Master GUI\\Chess Pieces\\Chess_plt45.svg.png"));
		panel = (JPanel)gameBoard.getComponent(83);
		panel.add(piece);
		piece = new JLabel(new ImageIcon("D:\\Programming\\Java-Eclipse\\Chess Master GUI\\Chess Pieces\\Chess_plt45.svg.png"));
		panel = (JPanel)gameBoard.getComponent(84);
		panel.add(piece);
		piece = new JLabel(new ImageIcon("D:\\Programming\\Java-Eclipse\\Chess Master GUI\\Chess Pieces\\Chess_plt45.svg.png"));
		panel = (JPanel)gameBoard.getComponent(85);
		panel.add(piece);
		piece = new JLabel(new ImageIcon("D:\\Programming\\Java-Eclipse\\Chess Master GUI\\Chess Pieces\\Chess_plt45.svg.png"));
		panel = (JPanel)gameBoard.getComponent(86);
		panel.add(piece);
		piece = new JLabel(new ImageIcon("D:\\Programming\\Java-Eclipse\\Chess Master GUI\\Chess Pieces\\Chess_plt45.svg.png"));
		panel = (JPanel)gameBoard.getComponent(87);
		panel.add(piece);
		piece = new JLabel(new ImageIcon("D:\\Programming\\Java-Eclipse\\Chess Master GUI\\Chess Pieces\\75px-Chess_rlt45.svg.png"));
		panel = (JPanel)gameBoard.getComponent(90);
		panel.add(piece);
		piece = new JLabel(new ImageIcon("D:\\Programming\\Java-Eclipse\\Chess Master GUI\\Chess Pieces\\75px-Chess_nlt45.svg.png"));
		panel = (JPanel)gameBoard.getComponent(91);
		panel.add(piece);
		piece = new JLabel(new ImageIcon("D:\\Programming\\Java-Eclipse\\Chess Master GUI\\Chess Pieces\\Chess_blt45.svg.png"));
		panel = (JPanel)gameBoard.getComponent(92);
		panel.add(piece);
		piece = new JLabel(new ImageIcon("D:\\Programming\\Java-Eclipse\\Chess Master GUI\\Chess Pieces\\75px-Chess_qlt45.svg.png"));
		panel = (JPanel)gameBoard.getComponent(93);
		panel.add(piece);
		piece = new JLabel(new ImageIcon("D:\\Programming\\Java-Eclipse\\Chess Master GUI\\Chess Pieces\\Chess_klt45.svg.png"));
		panel = (JPanel)gameBoard.getComponent(94);
		panel.add(piece);
		piece = new JLabel(new ImageIcon("D:\\Programming\\Java-Eclipse\\Chess Master GUI\\Chess Pieces\\Chess_blt45.svg.png"));
		panel = (JPanel)gameBoard.getComponent(95);
		panel.add(piece);
		piece = new JLabel(new ImageIcon("D:\\Programming\\Java-Eclipse\\Chess Master GUI\\Chess Pieces\\75px-Chess_nlt45.svg.png"));
		panel = (JPanel)gameBoard.getComponent(96);
		panel.add(piece);
		piece = new JLabel(new ImageIcon("D:\\Programming\\Java-Eclipse\\Chess Master GUI\\Chess Pieces\\75px-Chess_rlt45.svg.png"));
		panel = (JPanel)gameBoard.getComponent(97);
		panel.add(piece);
	
	}
	
	
	class MouseAction implements MouseListener {
		

		@Override
		public void mouseClicked(MouseEvent e) {		
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	
	}	
}

	

	


