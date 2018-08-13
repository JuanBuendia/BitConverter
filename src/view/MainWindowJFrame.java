package view;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.GridLayout;
import javax.swing.ImageIcon;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import java.awt.event.ActionListener;

public class MainWindowJFrame extends JFrame{

	private JButton btnConvert;
	private JTextField txCharacter;
	private PanelCharacters pnChar;
	private static final long serialVersionUID = 1L;
	private static final String BTN_TEXT = "Translate";
	private static final String TITLE = "BitConverter";
	private static final Color BACKGROUND = Color.decode("#263238");
	private static final Color FOREGROUND = Color.decode("#ECEFF1");
	private static final String TEXT_FIELD_VALUE = "Enter data to convert";
	private ImageIcon LOGO = new ImageIcon(getClass().getResource("/img/logo.png"));

	public MainWindowJFrame(ActionListener controller) {
		setTitle(TITLE);
		setIconImage(LOGO.getImage());
		setExtendedState(MAXIMIZED_BOTH);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		pnChar = new PanelCharacters(controller);
		add(pnChar, BorderLayout.CENTER);
		
		JPanel pnBottomRow = new JPanel();
		pnBottomRow.setLayout(new GridLayout(1, 2));
		
		txCharacter = new JTextField(TEXT_FIELD_VALUE);
		txCharacter.setFont(txCharacter.getFont().deriveFont(18.f));
		pnBottomRow.add(txCharacter);
		
		btnConvert = new JButton(BTN_TEXT);
		btnConvert.setBackground(BACKGROUND);
		btnConvert.setForeground(FOREGROUND);
		btnConvert.addActionListener(controller);
//		btnConvert.setActionCommand("lorem ipsum");
		btnConvert.setFont(btnConvert.getFont().deriveFont(18.f));
		pnBottomRow.add(btnConvert);
		
		add(pnBottomRow, BorderLayout.SOUTH);
		setVisible(true);
	}
}