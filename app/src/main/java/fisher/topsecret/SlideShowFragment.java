package fisher.topsecret;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class SlideShowFragment extends Fragment {


    public static SlideShowFragment newInstance(int id) {
        SlideShowFragment fragment = new SlideShowFragment();
        Bundle args = new Bundle();
        args.putInt("page_id", id);
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        int id = getArguments().getInt("page_id");
        int layoutResource;
        switch (id) {
            case 0:
                layoutResource = 1;//put the actual layout file here i.e. R.layout.fragment_slide_show
                break;
            case 1:
                layoutResource = 2;//put the actual layout file here
                break;
            default:
                layoutResource = 0;
                break;
        }


        return inflater.inflate(layoutResource, container, false);
    }

}
