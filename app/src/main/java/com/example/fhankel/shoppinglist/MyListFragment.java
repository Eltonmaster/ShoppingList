package com.example.fhankel.shoppinglist;

import android.app.ListFragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.Stack;

/**
 * Created by fhankel on 28.09.17.
 */

public class MyListFragment extends ListFragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.my_list_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        ArrayAdapter adapter =ArrayAdapter.createFromResource(getActivity(),R.array.ShoppingItems,android.R.layout.simple_list_item_1);

        setListAdapter(adapter);


    }
    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        int i = 0;

        Toast.makeText(getActivity(),l.getItemAtPosition(position) + " Added to Cart", Toast.LENGTH_SHORT).show();

        Stack Cart = new Stack();
        Cart.push(l.getItemAtPosition(position));


        super.onListItemClick(l, v, position, id);
    }

}
