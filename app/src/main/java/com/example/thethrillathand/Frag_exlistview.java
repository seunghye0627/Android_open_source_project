package com.example.thethrillathand;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ExpandableListView;

import java.util.ArrayList;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;



public class Frag_exlistview extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_listview, container, false);
        ExpandableListView mListView;
        mListView = (ExpandableListView) v.findViewById(R.id.exListView_home);
        ArrayList<myGroup> DataList = new ArrayList<myGroup>();
        mListView= (ExpandableListView) v.findViewById(R.id.exListView_home);
        myGroup temp = new myGroup("한글");
        temp.child.add("ㄱ");
        temp.child.add("ㄴ");
        temp.child.add("ㄷ");
        DataList.add(temp);
        temp = new myGroup("영어");
        temp.child.add("a");
        temp.child.add("b");
        temp.child.add("c");
        DataList.add(temp);
        temp = new myGroup("숫자");
        temp.child.add("1");
        temp.child.add("2");
        temp.child.add("3");
        DataList.add(temp);

        AdapterMain adapter = new AdapterMain(getActivity(),R.layout.listviewgroup_home,R.layout.listviewchild_home,DataList);
        //mListView.setIndicatorBounds(width-50, width); //이 코드를 지우면 화살표 위치가 바뀐다.
        mListView.setAdapter(adapter);


        return v;
    }
}