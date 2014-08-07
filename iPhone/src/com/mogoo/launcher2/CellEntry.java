/**  
 * 文 件 名:  CellEntry.java  
 * 描    述：   
 * 版    权： Copyright (c)20010-2011 motone All Rights Reserved.
 * 公    司:  摩通科技 
 * 作    者：  黄悦                     
 * 版    本:  1.0  
 * 创建时间:   2011-3-4
 *  
 * 修改历史：  
 * 时间            作者         版本           描述  
 * ------------------------------------------------------------------  
 * 2011-3-4        黄悦       1.0          1.0 Version  
 */        

package com.mogoo.launcher2;

import java.util.List;

public class CellEntry {
    public int left;
    public int right;
    public int top;
    public int bottom;
    
    public interface CellEntryInface{
        public CellEntry getCellEntry(int cellIndex);
        public List<CellEntry> getCellCoordinateList();
    }
}

