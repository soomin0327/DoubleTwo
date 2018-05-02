package com.example.dogyubin.doubletwo;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class SignUpActivity extends AppCompatActivity {

    LinearLayout signup_linearlayout1;
    ImageView signup_back_button;
    Button signup_next_button;
    FrameLayout signup_framelayout;
    RelativeLayout signup_relativelayout;
    SignUp1Fragment signUp1Fragment;
    SignUp2Fragment signUp2Fragment;
    SignUp3Fragment signUp3Fragment;
    SignUp4Fragment signUp4Fragment;
    SignUp5Fragment signUp5Fragment;
    FragmentManager fragmentManager;
    ImageView signup_toggle5, signup_toggle4, signup_toggle3, signup_toggle2, signup_toggle1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);


        fragmentManager = getSupportFragmentManager();
        signUp1Fragment = new SignUp1Fragment();
        signUp2Fragment = new SignUp2Fragment();
        signUp3Fragment = new SignUp3Fragment();
        signUp4Fragment = new SignUp4Fragment();
        signUp5Fragment = new SignUp5Fragment();

        signup_toggle5 = findViewById(R.id.signup_toggle5);
        signup_toggle4 = findViewById(R.id.signup_toggle4);
        signup_toggle3 = findViewById(R.id.signup_toggle3);
        signup_toggle2 = findViewById(R.id.signup_toggle2);
        signup_toggle1 = findViewById(R.id.signup_toggle1);
        signup_next_button = findViewById(R.id.signup_next_button);
        signup_back_button = findViewById(R.id.signup_back_button);
        signup_linearlayout1 = findViewById(R.id.signup_linearlayout1);
        signup_framelayout = findViewById(R.id.signup_framelayout);
        signup_relativelayout = findViewById(R.id.signup_relativelayout);

        signup_relativelayout.bringChildToFront(signup_back_button);
        signup_relativelayout.bringChildToFront(signup_next_button);

        setToggle1();
        fragmentManager.beginTransaction().add(R.id.signup_framelayout, signUp1Fragment, "signup1fragment").commit();

        signup_next_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment currFragment = fragmentManager.findFragmentById(R.id.signup_framelayout);
                if (currFragment.getTag().equals("signup1fragment")) {
                    setToggle2();
                    fragmentManager.beginTransaction()
                            .setCustomAnimations(R.anim.left_to_right, R.anim.left_to_right,R.anim.left_to_right, R.anim.left_to_right)
                            .add(R.id.signup_framelayout, signUp2Fragment, "signup2fragment")
                            .commit();
                } else if (currFragment.getTag().equals("signup2fragment")) {
                    setToggle3();
                    fragmentManager.beginTransaction()
                            .setCustomAnimations(R.anim.left_to_right, R.anim.left_to_right,R.anim.left_to_right, R.anim.left_to_right)
                            .add(R.id.signup_framelayout, signUp3Fragment, "signup3fragment").commit();
                }else if (currFragment.getTag().equals("signup3fragment")) {
                    setToggle4();
                    fragmentManager.beginTransaction()
                            .setCustomAnimations(R.anim.left_to_right, R.anim.left_to_right,R.anim.left_to_right, R.anim.left_to_right)
                            .add(R.id.signup_framelayout, signUp4Fragment, "signup4fragment").commit();
                }else if (currFragment.getTag().equals("signup4fragment")) {
                    setToggle5();
                    fragmentManager.beginTransaction()
                            .setCustomAnimations(R.anim.left_to_right, R.anim.left_to_right,R.anim.left_to_right, R.anim.left_to_right)
                            .add(R.id.signup_framelayout, signUp5Fragment, "signup5fragment").commit();
                }else if (currFragment.getTag().equals("signup5fragment")) {
                    Toast.makeText(getApplicationContext(),"끝",Toast.LENGTH_SHORT).show();
                }
            }
        });

        signup_back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Fragment currFragment = fragmentManager.findFragmentById(R.id.signup_framelayout);
                if(currFragment.getTag().equals("signup1fragment")){
                    SignUpActivity.super.onBackPressed();
                }else if(currFragment.getTag().equals("signup2fragment")){
                    setToggle1();
                    fragmentManager.beginTransaction()
                            .setCustomAnimations(R.anim.right_to_left, R.anim.right_to_left,R.anim.right_to_left, R.anim.right_to_left)
                            .replace(R.id.signup_framelayout, signUp1Fragment, "signup1fragment").commit();
                }else if(currFragment.getTag().equals("signup3fragment")){
                    setToggle2();
                    fragmentManager.beginTransaction()
                            .setCustomAnimations(R.anim.right_to_left, R.anim.right_to_left,R.anim.right_to_left, R.anim.right_to_left)
                            .remove(signUp3Fragment).commit();
                }else if(currFragment.getTag().equals("signup4fragment")){
                    setToggle3();
                    fragmentManager.beginTransaction()
                            .setCustomAnimations(R.anim.right_to_left, R.anim.right_to_left,R.anim.right_to_left, R.anim.right_to_left)
                            .remove(signUp4Fragment).commit();
                }else if(currFragment.getTag().equals("signup5fragment")){
                    setToggle4();
                    fragmentManager.beginTransaction()
                            .setCustomAnimations(R.anim.right_to_left, R.anim.right_to_left,R.anim.right_to_left, R.anim.right_to_left)
                            .remove(signUp5Fragment).commit();
                }
            }
        });


        ShapeDrawable.ShaderFactory shaderFactory = new ShapeDrawable.ShaderFactory() {
            @Override
            public Shader resize(int width, int height) {
                LinearGradient linearGradient = new LinearGradient(0, 0, width, height,
                        new int[]{
                                getColor(R.color.gradient_start),
                                getColor(R.color.gradient_center1),
                                getColor(R.color.gradient_center2),
                                getColor(R.color.gradient_end)}, //substitute the correct colors for these
                        new float[]{
                                0, 0.33f, 0.66f, 1},
                        Shader.TileMode.REPEAT);
                return linearGradient;
            }
        };


        PaintDrawable paint = new PaintDrawable();
        paint.setShape(new RectShape());
        paint.setShaderFactory(shaderFactory);
        signup_linearlayout1.setBackground(paint);

    }

    void setToggle1(){
        Glide.with(this).load(R.drawable.ic_circle_full).into(signup_toggle1);
        Glide.with(this).load(R.drawable.ic_circle_empty).into(signup_toggle2);
        Glide.with(this).load(R.drawable.ic_circle_empty).into(signup_toggle3);
        Glide.with(this).load(R.drawable.ic_circle_empty).into(signup_toggle4);
        Glide.with(this).load(R.drawable.ic_circle_empty).into(signup_toggle5);
    }
    void setToggle2(){
        Glide.with(this).load(R.drawable.ic_circle_full).into(signup_toggle1);
        Glide.with(this).load(R.drawable.ic_circle_full).into(signup_toggle2);
        Glide.with(this).load(R.drawable.ic_circle_empty).into(signup_toggle3);
        Glide.with(this).load(R.drawable.ic_circle_empty).into(signup_toggle4);
        Glide.with(this).load(R.drawable.ic_circle_empty).into(signup_toggle5);
    }
    void setToggle3(){
        Glide.with(this).load(R.drawable.ic_circle_full).into(signup_toggle1);
        Glide.with(this).load(R.drawable.ic_circle_full).into(signup_toggle2);
        Glide.with(this).load(R.drawable.ic_circle_full).into(signup_toggle3);
        Glide.with(this).load(R.drawable.ic_circle_empty).into(signup_toggle4);
        Glide.with(this).load(R.drawable.ic_circle_empty).into(signup_toggle5);
    }
    void setToggle4() {
        Glide.with(this).load(R.drawable.ic_circle_full).into(signup_toggle1);
        Glide.with(this).load(R.drawable.ic_circle_full).into(signup_toggle2);
        Glide.with(this).load(R.drawable.ic_circle_full).into(signup_toggle3);
        Glide.with(this).load(R.drawable.ic_circle_full).into(signup_toggle4);
        Glide.with(this).load(R.drawable.ic_circle_empty).into(signup_toggle5);
    }
    void setToggle5(){
        Glide.with(this).load(R.drawable.ic_circle_full).into(signup_toggle1);
        Glide.with(this).load(R.drawable.ic_circle_full).into(signup_toggle2);
        Glide.with(this).load(R.drawable.ic_circle_full).into(signup_toggle3);
        Glide.with(this).load(R.drawable.ic_circle_full).into(signup_toggle4);
        Glide.with(this).load(R.drawable.ic_circle_full).into(signup_toggle5);
    }
}
