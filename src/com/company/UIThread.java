package com.company;

import javax.swing.*;

import java.awt.*;

import static javax.swing.GroupLayout.Alignment.BASELINE;
import static javax.swing.GroupLayout.Alignment.LEADING;

public class UIThread extends Thread {

    private JLabel jLabelMainMenu = new JLabel("Select an action");
    private JButton jButtonFactorCopy = new JButton("FactorCopy");
    private JButton jButtonScreenShots = new JButton("ScreenShots");

    private JFileChooser searchFileJFileChooser = new JFileChooser();

    private JFrame mainMenuJFrame = new JFrame();

    private JPanel mainMenuJPanel = new JPanel();
    private JPanel factorJPanel = new JPanel();
    public void run (){
//        initMainMenuFrame();
        initFactorCopyFrame();
    }

    public void initMainMenuFrame(){


        GroupLayout mainMenu = new GroupLayout(mainMenuJPanel);
        mainMenuJPanel.setLayout(mainMenu);

        mainMenu.setAutoCreateGaps(true);
        mainMenu.setAutoCreateContainerGaps(true);

        mainMenu.setHorizontalGroup(mainMenu.createSequentialGroup()

                .addGroup(mainMenu.createParallelGroup(LEADING)

                        .addGroup(mainMenu.createSequentialGroup()
                                .addGroup(mainMenu.createParallelGroup(LEADING)
                                        .addComponent(jLabelMainMenu)))

                        .addGroup(mainMenu.createSequentialGroup()
                                .addGroup(mainMenu.createParallelGroup(LEADING)
                                        .addComponent(jButtonScreenShots))
                                .addGroup(mainMenu.createParallelGroup(LEADING)
                                        .addComponent(jButtonFactorCopy)))
                )
        );
        mainMenu.setVerticalGroup(mainMenu.createSequentialGroup()

                .addGroup(mainMenu.createParallelGroup(LEADING)
                        .addGroup(mainMenu.createSequentialGroup()
                                .addGroup(mainMenu.createParallelGroup(BASELINE)
                                        .addComponent(jLabelMainMenu))))

                .addGroup(mainMenu.createParallelGroup(LEADING)
                        .addGroup(mainMenu.createParallelGroup()
                                .addGroup(mainMenu.createParallelGroup(BASELINE))
                                .addComponent(jButtonScreenShots))
                        .addGroup(mainMenu.createParallelGroup()
                                .addComponent(jButtonFactorCopy))
                        )

        );
        //mainMenu END
        mainMenuJFrame.setVisible(true);
        mainMenuJFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainMenuJFrame.setLocationRelativeTo(null);
        mainMenuJFrame.setResizable(false);
        mainMenuJFrame.add(mainMenuJPanel);
        mainMenuJFrame.pack();
    }
    public void initFactorCopyFrame (){
    factorJPanel.setLayout(new GridLayout(5,5,2,2));
    factorJPanel.add(searchFileJFileChooser);
    mainMenuJFrame.add(factorJPanel);
        mainMenuJFrame.pack();
    }
}
