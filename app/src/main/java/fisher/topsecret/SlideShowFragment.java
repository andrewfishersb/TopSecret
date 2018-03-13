package fisher.topsecret;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;


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
        int imageResource;
        switch (id) {
            //todo make an intro page says something like swipe right to start
            case 0:
                textResource = R.string.filler;
                imageResource = R.drawable.placeholder;
                break;
            case 1:
                textResource = R.string.slide_1_tinder;
                imageResource = R.drawable.intro;
                break;
            case 2:
                textResource = R.string.slide_2_tinder;
                imageResource = R.drawable.jenna_profile; //todo sizing off
                break;
            case 3:
                textResource = R.string.slide_3_opening_line;
                imageResource = R.drawable.tinder;
                break;
            case 4:
                textResource = R.string.slide_4_moore_mesa;
                imageResource = R.drawable.moore_mesa;
                        break;
            case 5:
//                //todo christmas break collage
                textResource = R.string.filler;
                imageResource = R.drawable.placeholder;
                break;
            case 6:
                textResource = R.string.slide_6_jan_3rd;
                imageResource = R.drawable.elwood_kiss;
                break;
            case 7:
                textResource = R.string.slide_7_gone_girl;
                imageResource = R.drawable.gone_girl;
                break;
            case 8:
                //todo smitten, try and get the first photo
            textResource = R.string.filler;
            imageResource = R.drawable.placeholder;
                break;
            case 9:
//            todo activities
                textResource = R.string.filler;
                imageResource = R.drawable.placeholder;
                break;
            case 10:
                textResource = R.string.slide_10_grand_budapest;
                imageResource = R.drawable.grand_budapest;
                break;
            case 11:
                textResource = R.string.slide_11_pre_ankle;
                imageResource = R.drawable.swimingly;
                break;
            case 12:
                textResource = R.string.slide_13_broken_ankle;
                imageResource = R.drawable.broken_ankle;
                break;
            case 13:
                textResource = R.string.slide_14_through_sickness;
                imageResource = R.drawable.care_taker;
                break;
            case 14:
                textResource = R.string.filler;
                imageResource = R.drawable.placeholder;
                break;
            case 15:
                textResource = R.string.filler;
                imageResource = R.drawable.placeholder;
                break;
            case 16:
                textResource = R.string.filler;
                imageResource = R.drawable.placeholder;
                break;
            case 17:
                textResource = R.string.filler;
                imageResource = R.drawable.placeholder;
                break;
            case 18:
                textResource = R.string.filler;
                imageResource = R.drawable.placeholder;
                break;
            case 19:
                textResource = R.string.filler;
                imageResource = R.drawable.placeholder;
                break;
            case 20:
                textResource = R.string.filler;
                imageResource = R.drawable.placeholder;
                break;
            case 21:
                textResource = R.string.filler;
                imageResource = R.drawable.placeholder;
                break;
            case 22:
                textResource = R.string.filler;
                imageResource = R.drawable.placeholder;
                break;
            case 23:
                textResource = R.string.filler;
                imageResource = R.drawable.placeholder;
                break;
            case 24:
                textResource = R.string.filler;
                imageResource = R.drawable.placeholder;
                break;
            case 25:
                textResource = R.string.filler;
                imageResource = R.drawable.placeholder;
                break;
            case 26:
                textResource = R.string.filler;
                imageResource = R.drawable.placeholder;
                break;
            case 27:
                textResource = R.string.filler;
                imageResource = R.drawable.placeholder;
                break;
            case 28:
                textResource = R.string.filler;
                imageResource = R.drawable.placeholder;
                break;
            case 29:
                textResource = R.string.filler;
                imageResource = R.drawable.placeholder;
                break;
            case 30:
                textResource = R.string.filler;
                imageResource = R.drawable.placeholder;
                break;
            case 31:
                textResource = R.string.filler;
                imageResource = R.drawable.placeholder;
                break;
            case 32:
                textResource = R.string.filler;
                imageResource = R.drawable.placeholder;
                break;
            case 33:
                textResource = R.string.filler;
                imageResource = R.drawable.placeholder;
                break;
            case 34:
                textResource = R.string.filler;
                imageResource = R.drawable.placeholder;
                break;
            case 35:
                textResource = R.string.filler;
                imageResource = R.drawable.placeholder;
                break;
            case 36:
                textResource = R.string.filler;
                imageResource = R.drawable.placeholder;
                break;
            case 37:
                textResource = R.string.filler;
                imageResource = R.drawable.placeholder;
                break;
            case 38:
                textResource = R.string.filler;
                imageResource = R.drawable.placeholder;
                break;
            case 39:
                textResource = R.string.filler;
                imageResource = R.drawable.placeholder;
                break;
            case 40:
                textResource = R.string.filler;
                imageResource = R.drawable.placeholder;
                break;
            case 41:
                textResource = R.string.filler;
                imageResource = R.drawable.placeholder;
                break;
            case 42:
                textResource = R.string.filler;
                imageResource = R.drawable.placeholder;
                break;
            case 43:
                textResource = R.string.filler;
                imageResource = R.drawable.placeholder;
                break;
            case 44:
                textResource = R.string.filler;
                imageResource = R.drawable.placeholder;
                break;
            case 45:
                textResource = R.string.filler;
                imageResource = R.drawable.placeholder;
                break;
            case 46:
                textResource = R.string.filler;
                imageResource = R.drawable.placeholder;
                break;
            case 47:
                textResource = R.string.filler;
                imageResource = R.drawable.placeholder;
                break;
            case 48:
                textResource = R.string.filler;
                imageResource = R.drawable.placeholder;
                break;
            case 49:
                textResource = R.string.filler;
                imageResource = R.drawable.placeholder;
                break;
            default:
                textResource = R.string.filler;
                imageResource = R.drawable.placeholder;
                break;
        }

//        https://stackoverflow.com/questions/3647993/android-bitmaps-loaded-from-gallery-are-rotated-in-imageview     if images rotated

        layoutResource = R.layout.layout_default;

        View v = inflater.inflate(layoutResource, container, false);

        TextView textView = v.findViewById(R.id.textBox);
        textView.setText(textResource);

        ImageView imgView = v.findViewById(R.id.imageView);
//        imgView.setImageResource(imageResource);

        Glide.with(getContext()).load(imageResource).into(imgView);

        return v;
    }

}
