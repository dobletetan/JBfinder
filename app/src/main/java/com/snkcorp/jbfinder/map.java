package com.snkcorp.jbfinder;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class map extends Fragment{

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public map() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment map.
     */
    // TODO: Rename and change types and number of parameters
    public static map newInstance(String param1, String param2) {
        map fragment = new map();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_map,container,false);
        Button buttonmap=(Button) view.findViewById(R.id.mapButton);
        Button buttonrot=(Button) view.findViewById(R.id.rotacionButton);
        Button buttongyro=(Button) view.findViewById(R.id.GyroscopeButton);
        Button buttonprox=(Button) view.findViewById(R.id.proxyButton);
        Button buttonmqtt=(Button) view.findViewById(R.id.mqattButton);
        buttonmap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent elegirIntent = new Intent(getActivity(), mups.class);
                startActivity(elegirIntent);
            }
        });
        buttonrot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent elegirIntent = new Intent(getActivity(), RotationVectorActivity.class);
                startActivity(elegirIntent);
            }
        });
        buttongyro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent elegirIntent = new Intent(getActivity(), GyroscopeActivity.class);
                startActivity(elegirIntent);
            }
        });
        buttonprox.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent elegirIntent = new Intent(getActivity(), ProximityActivity.class);
                startActivity(elegirIntent);
            }
        });
        buttonmqtt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent elegirIntent = new Intent(getActivity(), mqtt.class);
                startActivity(elegirIntent);
            }
        });

        return view;
    }
}