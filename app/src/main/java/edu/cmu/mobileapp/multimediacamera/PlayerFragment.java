package edu.cmu.mobileapp.multimediacamera;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import java.util.List;

import edu.cmu.mobileapp.model.MediaFile;
import edu.cmu.mobileapp.util.MediaUtils;

/**
 * Created by srikrishnan_suresh on 03-07-2015.
 */
public class PlayerFragment extends Fragment {
    private GridView gridView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.player_layout, container, false);

        List<MediaFile> files = MediaUtils.getMediaFiles(getActivity().getContentResolver());

        gridView = (GridView) rootView.findViewById(R.id.gridView);

        gridView.setAdapter(new GridItemAdapter(getActivity(), files));
        return rootView;
    }

}
