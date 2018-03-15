package fisher.topsecret;


import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
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
        boolean tooSkewed = false;
        boolean superSkewed = false;
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
                tooSkewed = true;
                break;
            case 3:
                textResource = R.string.slide_3_opening_line; //todo shorten and may tooSkewed = true;
                imageResource = R.drawable.tinder;
                break;
            case 4:
                textResource = R.string.slide_4_moore_mesa;
                imageResource = R.drawable.moore_mesa;
                        break;
            case 5:
                tooSkewed = true;
                textResource = R.string.slide_5_christmas_break;
                imageResource = R.drawable.christmas;
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
            textResource = R.string.slide_8_smitten;
            imageResource = R.drawable.smitten;
                break;
            case 9:
                textResource = R.string.slide_9_activities; //todo move pictures around as beach picure is blocked
                imageResource = R.drawable.activities;
                tooSkewed = true;

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
                textResource = R.string.slide_15_wake_up;//todo a little skewed
                imageResource = R.drawable.night_kiss;
                tooSkewed = true;
                break;
            case 15:
                textResource = R.string.slide_16_mormon_and_meet; //todo super skewed
                imageResource = R.drawable.injured;
                tooSkewed = true;
                break;
            case 16: //todo super skeewed
                textResource = R.string.slide_17_graduation;
                imageResource = R.drawable.jenna_grad_old;
                superSkewed = true;
                break;
            case 17:
                //todo love you
                textResource = R.string.filler;
                imageResource = R.drawable.placeholder;
                break;
            case 18:
                textResource = R.string.slide_19_sb_life;
                imageResource = R.drawable.sb_collage;
                tooSkewed = true;
                break;
            case 19:
                //todo trip_dc
                textResource = R.string.slide_20_spring_break_family;
                imageResource = R.drawable.trip_dc;
                tooSkewed = true;
                break;
            case 20:
                //todo NYC
                textResource = R.string.slide_21_first_nyc;
                imageResource = R.drawable.trip_nyc_2016;
                tooSkewed = true;
                break;
            case 21:
                textResource = R.string.slide_22_portland_move;
                imageResource = R.drawable.apartment;
                break;
            case 22:
                //todo jenna gets a job downtown
                textResource = R.string.filler;
                imageResource = R.drawable.placeholder;
                break;
            case 23:
                //todo start of portland collages...maybe a nature  one, a vibe one, a food one (steal online images) and of course Blazers
                textResource = R.string.love_portland;
                imageResource = R.drawable.portland_nature;
                tooSkewed = true;

                break;
            case 24:
                textResource = R.string.portland_seasons;
                imageResource = R.drawable.seasons;
                break;
            case 25:
                textResource = R.string.slide_25_blazers;
                imageResource = R.drawable.blazers;
                tooSkewed = true;
                break;
            case 26:
                textResource = R.string.slide_26_east_winter;
                imageResource = R.drawable.east_coast_2;
                tooSkewed = true;
                break;
            case 27:
                textResource = R.string.slide_27_east_winter_2;
                imageResource = R.drawable.nye;
                tooSkewed = true; //todo maybe minimize the text and not unskew
                break;
            case 28:
                tooSkewed = true;
                textResource = R.string.slide_28_vancouver;
                imageResource = R.drawable.vancouver;
                break;
            case 29:
                superSkewed = true;
                textResource = R.string.jenna;
                imageResource = R.drawable.placeholder;
                break;
            case 30:
                superSkewed = true;
                textResource = R.string.blank;
                imageResource = R.drawable.will;
                break;
            case 31:
                textResource = R.string.blank;
                imageResource = R.drawable.you;
                break;
            case 32:
                textResource = R.string.blank;
                imageResource = R.drawable.lillard_time_2;
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

        textView.setText(textResource);//or gone instead

            Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/SpecialElite-Regular.ttf");
            textView.setTypeface(font);


        ImageView imgView = v.findViewById(R.id.imageView);

        Glide.with(getContext()).load(imageResource).into(imgView);

        if(tooSkewed){
            RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) imgView.getLayoutParams();
            params.addRule(RelativeLayout.ABOVE,R.id.bottomText);
            imgView.setLayoutParams(params);
        }

        if(superSkewed){
            RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) imgView.getLayoutParams();
            params.addRule(RelativeLayout.ABOVE,R.id.bottomText);
            imgView.setLayoutParams(params);
            imgView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        }

        return v;
    }

}
