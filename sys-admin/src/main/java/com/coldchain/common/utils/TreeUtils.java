package com.coldchain.common.utils;

import com.coldchain.common.core.domain.Ztree;

import java.util.ArrayList;
import java.util.List;

/**
 * 树结构处理工具类
 */
public class TreeUtils {

    //递归转树
    public static Ztree findChildren(Ztree ztree, List<Ztree> ztrees){
        for (Ztree node: ztrees) {
            if (node.getpId().equals(ztree.getId())){
                if(null == ztree.getChildren()){
                    ztree.setChildren(new ArrayList<Ztree>());
                }
                ztree.getChildren().add(findChildren(node,ztrees));
            }
        }
        return ztree;
    }
}
