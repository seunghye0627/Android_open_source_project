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
        myGroup temp = new myGroup("낚시 매듭");
        temp.child.add("유니 매듭");
        DataList.add(temp);
        temp = new myGroup("한반도 대표 어종");
        temp.child.add("으악");
        DataList.add(temp);
        temp = new myGroup("국내 어종 포인트");
        temp.child.add("으악");

        DataList.add(temp);

        ExpandAdapter adapter = new ExpandAdapter(getActivity(),R.layout.exlistview_group,R.layout.exlistview_child,DataList);
        mListView.setAdapter(adapter);


        return v;
    }
}