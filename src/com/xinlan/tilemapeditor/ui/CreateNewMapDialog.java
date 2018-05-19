package com.xinlan.tilemapeditor.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateNewMapDialog extends JDialog implements ActionListener {
    private App mApp;

    private JTextField mCubeSizeText;
    private JTextField mCubeWdithText;
    private JTextField mCubeHeightText;

    private JButton mConfirmBtn;

    public CreateNewMapDialog(App app){
        this.setTitle("新建地图");
        this.setModal(true);

        mApp = app;

        setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        add(new JLabel("地图方格尺寸:"));
        mCubeSizeText = new JTextField(10);
        add(mCubeSizeText);

        add(new JLabel("地图宽度:"));
        mCubeWdithText = new JTextField(10);
        add(mCubeWdithText);

        add(new JLabel("地图高度:"));
        mCubeHeightText = new JTextField(10);
        add(mCubeHeightText);

        mConfirmBtn = new JButton("创建");
        add(mConfirmBtn);

        mConfirmBtn.addActionListener(this);

        pack();
        setLocation(App.SCREEN_WIDTH / 2  - 300, App.SCREEN_HEIGHT / 2 -300);

        //System.out.println("width = "+getWidth());
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        int cubeSize = Integer.parseInt(mCubeSizeText.getText());
        int width = Integer.parseInt(mCubeWdithText.getText());
        int height = Integer.parseInt(mCubeHeightText.getText());

        mApp.mMapManager.createNewMap(cubeSize , width , height);

        dispose();
    }

    public void buildNewMap(){

    }
}//end class
