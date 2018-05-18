package com.xinlan.tilemapeditor;

import javax.swing.*;
import java.awt.*;

public class CubePanel {
    public static final int WIDTH = 200;

    private App mApp;

    private JPanel mCubeContainer;


    public CubePanel(App app){
        this.mApp = app;

        initView();
    }

    private void initView(){
        mCubeContainer = new JPanel();
        //mCubeContainer.setBackground(Color.BLACK);
        mCubeContainer.setSize(WIDTH , App.SCREEN_HEIGHT);

        mApp.mMainFrame.setLayout(null);
        mApp.mMainFrame.getContentPane().add(mCubeContainer);

        mCubeContainer.setLayout(null);
        mCubeContainer.add(new JLabel("ZONE"));
        JLabel label = new JLabel("ZONE222");
        label.setBounds(10,10,100,100);
        mCubeContainer.add(label);
    }
}//end class
