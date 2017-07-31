package com.example.hp.mynavigation;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;


public class BlankFragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public BlankFragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @return A new instance of fragment BlankFragment.
     */
    // TODO: Rename and change types and number of parameters
  public static BlankFragment newInstance() {
        BlankFragment fragment = new BlankFragment();
        Bundle args = new Bundle();
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
        View view = inflater.inflate(R.layout.fragment_blank, container, false);
        ImageView img = (ImageView) view.findViewById(R.id.immm);
        ImageView img1 = (ImageView) view.findViewById(R.id.im2);
        ImageView img2 = (ImageView) view.findViewById(R.id.im3);
        ImageView img3 = (ImageView) view.findViewById(R.id.im4);
        ImageView img4 = (ImageView) view.findViewById(R.id.im5);
        ImageView img5= (ImageView) view.findViewById(R.id.im6);
        Context c = getActivity().getApplicationContext();
        Picasso.with(c).load("http://jonvilma.com/images/apple-16.jpg")
                .placeholder(R.drawable.pi)
                .error(R.drawable.pi)
                .into(img);
        Picasso.with(c).load("https://pbs.twimg.com/profile_images/826558134906929157/NkPLMpA4.jpg")
                .placeholder(R.drawable.pi)
                .error(R.drawable.pi)
                .into(img1);
        Picasso.with(c).load("https://pbs.twimg.com/profile_images/826558134906929157/NkPLMpA4.jpg")
                .placeholder(R.drawable.pi)
                .error(R.drawable.pi)
                .into(img2);
        Picasso.with(c).load("https://yt3.ggpht.com/-KdgJnz1HIdQ/AAAAAAAAAAI/AAAAAAAAAAA/4vVN7slJqj4/s900-c-k-no-mo-rj-c0xffffff/photo.jpg")
                .placeholder(R.drawable.pi)
                .error(R.drawable.pi)
                .into(img3);
        Picasso.with(c).load("https://pbs.twimg.com/profile_images/826558134906929157/NkPLMpA4.jpg")
                .placeholder(R.drawable.pi)
                .error(R.drawable.pi)
                .into(img4);
        Picasso.with(c).load("http://cdn.wccftech.com/wp-content/uploads/2017/03/Apple-Disney-Rumours-01-Header.jpg")
                .placeholder(R.drawable.pi)
                .error(R.drawable.pi)
                .into(img5);

        return view;


    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(String uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }


    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    /*public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }*/

}
