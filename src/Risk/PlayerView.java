package Risk;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JSlider;
import javax.swing.ImageIcon;

public class PlayerView extends JFrame {

	private JPanel contentPane;
	private JPanel Player_management;
	private JPanel Map;
	private JPanel DiceManager;
	private JPanel TurnManager;
	private JPanel PlayerStates;
	private JLabel lblNewLabel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PlayerView frame = new PlayerView();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public PlayerView() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		Player_management = new JPanel();
		playerManager();
		
		Map = new JPanel();
		contentPane.add(Map, BorderLayout.CENTER);
		
		lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("/Users/brayden/Desktop/Risk_board.svg.png"));
		Map.add(lblNewLabel);
		
		
	}

	private void playerManager() {
		contentPane.add(Player_management, BorderLayout.EAST);
		Player_management.setPreferredSize(new Dimension(150, 200));
		Player_management.setLayout(new BorderLayout(0, 0));
		
		DiceManager = new JPanel();
		Player_management.add(DiceManager, BorderLayout.NORTH);
		DiceManager.setPreferredSize(new Dimension(50, 200));
		
		TurnManager = new JPanel();
		Player_management.add(TurnManager, BorderLayout.SOUTH);
		TurnManager.setPreferredSize(new Dimension(50,200));
		
		PlayerStates = new JPanel();
		Player_management.add(PlayerStates, BorderLayout.CENTER);
		PlayerStates.setPreferredSize(new Dimension(50, 150));
	}

}
