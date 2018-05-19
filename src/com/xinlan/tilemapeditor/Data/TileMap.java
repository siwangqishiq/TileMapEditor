package com.xinlan.tilemapeditor.Data;

import java.util.ArrayList;
import java.util.List;

public class TileMap {
    private int mCubeSize;
    private int mCubeWidth;
    private int mCubeHeight;

    private List<Cube> mCubeList = new ArrayList<Cube>(32);

    public TileMap(int size , int width , int height){
        this.mCubeSize = size;
        this.mCubeWidth = width;
        this.mCubeHeight = height;
    }


}//end class
