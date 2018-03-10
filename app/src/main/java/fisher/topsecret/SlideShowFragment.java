package fisher.topsecret;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


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
        int textResource;
        switch (id) {
            case 0:
                layoutResource = R.layout.layout1;//put the actual layout file here i.e. R.layout.fragment_slide_show
                textResource = R.string.slide_6_jan_3rd;
                break;
            case 1:
                layoutResource = R.layout.layout2;//put the actual layout file here
                textResource = R.string.slide_7_gone_girl;
                break;
            case 2:
                layoutResource = R.layout.layout_grand_budapest;
                textResource = R.string.slide_10_grand_budapest;
                break;
            default:
                layoutResource = 0;
                textResource = 0;
                break;
        }

        View v =  inflater.inflate(layoutResource, container, false);

        TextView textView = v.findViewById(R.id.textBox);
        textView.setText(textResource);

        return v;
    }

}
