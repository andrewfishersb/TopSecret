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
        int textResource;
        int imageResource;
        boolean tooSkewed = false;
        boolean superSkewed = false;
        int layoutResource = R.layout.layout_default;

        switch (id) {
            //todo make an intro page says something like swipe right to start
            case 33:
                layoutResource = R.layout.layout_intro_slide;
                textResource = R.string.filler;
                imageResource = R.drawable.placeholder;
                break;
            case 32:
                textResource = R.string.slide_1_tinder;
                imageResource = R.drawable.intro;
                break;
            case 31:
                textResource = R.string.slide_2_tinder;
                imageResource = R.drawable.jenna_profile; //todo sizing off
                tooSkewed = true;
                break;
            case 30:
                tooSkewed = true;
                textResource = R.string.slide_3_opening_line; //todo shorten and may tooSkewed = true;
                imageResource = R.drawable.tinder;
                break;
            case 29:
                textResource = R.string.slide_4_moore_mesa;
                imageResource = R.drawable.moore_mesa;
                break;
            case 28:
                tooSkewed = true;
                textResource = R.string.slide_5_christmas_break;
                imageResource = R.drawable.christmas;
                break;
            case 27:
                textResource = R.string.slide_6_jan_3rd;
                imageResource = R.drawable.elwood_kiss;
                break;
            case 26:
                textResource = R.string.slide_7_gone_girl;
                imageResource = R.drawable.gone_girl;
                break;
            case 25:
                //todo smitten, try and get the first photo
                textResource = R.string.slide_8_smitten;
                imageResource = R.drawable.smitten;
                break;
            case 24:
                textResource = R.string.slide_9_activities; //todo move pictures around as beach picure is blocked
                imageResource = R.drawable.activities;
                tooSkewed = true;

                break;
            case 23:
                textResource = R.string.slide_10_grand_budapest;
                imageResource = R.drawable.grand_budapest;
                break;
            case 22:
                textResource = R.string.slide_11_pre_ankle;
                imageResource = R.drawable.swimingly;
                break;
            case 21:
                textResource = R.string.slide_13_broken_ankle;
                imageResource = R.drawable.broken_ankle;
                break;
            case 20:
                textResource = R.string.slide_14_through_sickness;
                imageResource = R.drawable.care_taker;
                break;
            case 19:
                textResource = R.string.slide_15_wake_up;//todo a little skewed
                imageResource = R.drawable.night_kiss;
                tooSkewed = true;
                break;
            case 18:
                textResource = R.string.slide_16_mormon_and_meet; //todo super skewed
                imageResource = R.drawable.injured;
                tooSkewed = true;
                break;
            case 17: //todo super skeewed
                textResource = R.string.slide_17_graduation;
                imageResource = R.drawable.jenna_grad_old;
                superSkewed = true;
                break;
            case 16:
                //todo love you
                textResource = R.string.filler;
                imageResource = R.drawable.placeholder;
                break;
            case 15:
                textResource = R.string.slide_19_sb_life;
//                imageResource = R.drawable.sb_collage;
                imageResource = R.drawable.sb_collage_2;
                tooSkewed = true;
                break;
            case 14:
                //todo trip_dc
                textResource = R.string.slide_20_spring_break_family;
                imageResource = R.drawable.trip_dc;
                tooSkewed = true;
                break;
            case 13:
                //todo NYC
                textResource = R.string.slide_21_first_nyc;
                imageResource = R.drawable.trip_nyc_2016;
                tooSkewed = true;
                break;
            case 12:
                textResource = R.string.slide_22_portland_move;
                imageResource = R.drawable.apartment;//todo maybe a portland collage, her building, bridges, salt n straw or city scape
                break;
            case 11:
                //todo start of portland collages...maybe a nature  one, a vibe one, a food one (steal online images) and of course Blazers
                textResource = R.string.love_portland;
                imageResource = R.drawable.portland_nature;
                tooSkewed = true;
                break;
            case 10:
                textResource = R.string.portland_seasons;
                imageResource = R.drawable.seasons;
                break;
            case 9:
                textResource = R.string.slide_25_blazers;
                imageResource = R.drawable.blazers;
                tooSkewed = true;
                break;
            case 8:
                textResource = R.string.slide_26_east_winter;
                imageResource = R.drawable.east_coast_2;
                tooSkewed = true;
                break;
            case 7:
                textResource = R.string.slide_27_east_winter_2;
                imageResource = R.drawable.nye;
                tooSkewed = true; //todo maybe minimize the text and not unskew
                break;
            case 6:
                tooSkewed = true;
                textResource = R.string.slide_28_vancouver;
                imageResource = R.drawable.vancouver;
                break;
            case 5:
                textResource = R.string.hawaii;
                imageResource = R.drawable.placeholder;
                break;
            case 4:
                textResource = R.string.question;
                imageResource = R.drawable.placeholder;
                break;
            case 3:
                superSkewed = true;
                textResource = R.string.jenna;
                imageResource = R.drawable.placeholder;
                break;
            case 2:
                superSkewed = true;
                textResource = R.string.blank;
                imageResource = R.drawable.will;
                break;
            case 1:
                superSkewed = true;

                textResource = R.string.blank;
                imageResource = R.drawable.you;
                break;
            case 0:
                textResource = R.string.blank;
                imageResource = R.drawable.marry_time;
                break;
            default:
                textResource = R.string.filler;
                imageResource = R.drawable.placeholder;
                break;
        }

//        https://stackoverflow.com/questions/3647993/android-bitmaps-loaded-from-gallery-are-rotated-in-imageview     if images rotated

        View v = inflater.inflate(layoutResource, container, false);

        if(layoutResource == R.layout.layout_default){
            TextView textView = v.findViewById(R.id.textBox);

            if(textResource == R.string.blank){
                textView.setVisibility(View.GONE);
            }else{
                textView.setText(textResource);//or gone instead
                changeFont(textView);
            }

            ImageView imgView = v.findViewById(R.id.imageView);

            Glide.with(getContext()).load(imageResource).into(imgView);

            if (tooSkewed) {
                RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) imgView.getLayoutParams();
                params.addRule(RelativeLayout.ABOVE, R.id.bottomText);
                imgView.setLayoutParams(params);
            }

            if (superSkewed) {
                RelativeLayout.LayoutParams params = (RelativeLayout.LayoutParams) imgView.getLayoutParams();
                params.addRule(RelativeLayout.ABOVE, R.id.bottomText);
                imgView.setLayoutParams(params);
                imgView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            }

        }else{
            TextView txtSwipe = v.findViewById(R.id.swipe);
            TextView txtRight = v.findViewById(R.id.right);
            TextView txtTo = v.findViewById(R.id.to);
            TextView txtContinue= v.findViewById(R.id.continueString);

            changeFont(txtSwipe);
            changeFont(txtRight);
            changeFont(txtTo);
            changeFont(txtContinue);
        }

        return v;
    }

    public void changeFont(TextView textView){
        Typeface font = Typeface.createFromAsset(getActivity().getAssets(), "fonts/SpecialElite-Regular.ttf");
        textView.setTypeface(font);
    }

}
