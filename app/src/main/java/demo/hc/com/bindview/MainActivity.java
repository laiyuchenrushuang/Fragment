package demo.hc.com.bindview;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.vp)
    ViewPager vp;
    private FragmentManager manage;
    ArrayList<Fragment> listF = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        //initdata();
        manage = getSupportFragmentManager();
        listF.add(new My1Fragment());
        listF.add(new My2Fragment());
        vp.setAdapter(new FragmentAdapter(manage, listF));
        vp.setCurrentItem(0);
        vp.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }

//    private void initdata() {
//        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.heng1);
//        BitmapFactory.Options options = new BitmapFactory.Options();
//        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
//        options.inSampleSize = 3;
//        ByteArrayOutputStream baos = new ByteArrayOutputStream();
//        int optionsInt = 100;
////        while (baos.toByteArray().length/1024 > 100) {
////            baos.reset();
//        bitmap.compress(Bitmap.CompressFormat.JPEG, optionsInt, baos);
////            optionsInt -= 10;
////            if (optionsInt <= 0) {
////                break;
////            }
////        }
//
//        byte[] datas = baos.toByteArray();
//
////        ByteArrayOutputStream baos = new ByteArrayOutputStream();
////
////        ByteArrayInputStream isBm = new ByteArrayInputStream(baos.toByteArray());
////        BitmapFactory.Options newOpts = new BitmapFactory.Options();
////        newOpts.inJustDecodeBounds = true;
////        newOpts.inSampleSize=1;
////
////        Bitmap bitmap1 = BitmapFactory.decodeStream(isBm, null, newOpts);
////        ByteArrayOutputStream bao = new ByteArrayOutputStream();
//
////        bitmap1.compress(Bitmap.CompressFormat.JPEG, 100, baos);
//        ByteArrayInputStream isBm = new ByteArrayInputStream(datas);//把压缩后的数据baos存放到ByteArrayInputStream中
//        Bitmap newBitmap = BitmapFactory.decodeStream(isBm, null, options);
//        //Bitmap newBitmap = BitmapFactory.decodeByteArray(datas, 0, datas.length,options);
//        iv_picture.setImageBitmap(newBitmap);
//    }
}
