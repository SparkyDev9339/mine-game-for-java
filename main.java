import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MiningGame extends JFrame implements ActionListener {
    private int score = 0;
    private int level = 1;
    private JLabel scoreLabel, levelLabel;
    private JButton miningButton;

    public MiningGame() {
        super("Mining Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(3, 2));

        scoreLabel = new JLabel("Score: " + score);
        panel.add(scoreLabel);

        levelLabel = new JLabel("Level: " + level);
        panel.add(levelLabel);

        miningButton = new JButton("Mine");
        miningButton.addActionListener(this);
        panel.add(miningButton);

        setContentPane(panel);
        setSize(300, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == miningButton) {
            score += level;
            scoreLabel.setText("Score: " + score);

            if (score >= level * 10) {
                level++;
                levelLabel.setText("Level: " + level);
            }
        }
    }

    public static void main(String[] args) {
        new MiningGame();
    }
}
