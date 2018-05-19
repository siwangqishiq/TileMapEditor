package com.xinlan.tilemapeditor.Controller;

import com.xinlan.tilemapeditor.Data.TileMap;

public class MapManager {
    private TileMap mMap;

    private MapManager(){

    }

    public static MapManager newInstance(){
        return new MapManager();
    }

    public void createNewMap(int cubeSize, int width , int height){
        mMap = new TileMap(cubeSize , width , height);
    }
}//end class
