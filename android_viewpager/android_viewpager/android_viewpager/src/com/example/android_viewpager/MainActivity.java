package com.example.android_viewpager;

import java.util.ArrayList;
import java.util.List;

import cn.sharesdk.framework.ShareSDK;
import cn.sharesdk.onekeyshare.OnekeyShare;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
//import android.support.v4.app.Fragment;
//import android.support.v4.app.FragmentActivity;
import android.support.v4.view.PagerTabStrip;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity implements OnPageChangeListener{

	private ViewPager pager;
	private List<View>viewList;
	private List<String>titleList;
	private PagerTabStrip tab;
	//private List<Fragment>fragList;
	private Button bt1;
	private Context mContext;
	Button mBtnShareToSina;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
        
		

		/*ShareSDK.initSDK(getApplicationContext());
		mBtnShareToSina=(Button) this.findViewById(R.id.share_sina);
		mBtnShareToSina.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// һ������
				OnekeyShare oneKeyShare=new OnekeyShare();
				oneKeyShare.setTitle("Ӣ��ѧϰ���ַ���");
				oneKeyShare.setText("��ѧϰӢ����?��Ӣ��ѧϰ����APP!");
				//oneKeyShare.setImagePath("");
				//��ʾ�����б�
				oneKeyShare.show(MainActivity.this);
			
			}
		});*/
		View view1 = View.inflate(this, R.layout.view1, null);
        

       /* mContext=this;
        bt1=(Button) findViewById(R.id.button11);
		bt1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO �Զ����ɵķ������
				
				 //* ��һ�������������Ķ���this
				 //* �ڶ���������Ŀ���ļ�
				 //* 
				Intent intent=new Intent(mContext,DanciList2.class);
				//intent.setAction("aaa.bbb.ccc");
				//intent.addCategory("android.intent.category.DEFAULT");
				startActivity(intent);
				
			}
		});*/
        View view2 = View.inflate(this, R.layout.view2, null);
        View view3 = View.inflate(this, R.layout.view3, null);
        
		viewList=new ArrayList<View>();
		viewList.add(view1);
		viewList.add(view2);
		viewList.add(view3);
		
		titleList=new ArrayList<String>();
		titleList.add("����");
		titleList.add("����");
		titleList.add("�����ڴ�");
		
		tab=(PagerTabStrip) findViewById(R.id.tab);
		tab.setBackgroundColor(Color.GRAY);
		tab.setTabIndicatorColor(Color.BLUE);
		tab.setDrawFullUnderline(false);
		tab.setTextColor(Color.GREEN);
		
		
		pager=(ViewPager) findViewById(R.id.pager);
		MyViewPagerAdapter adapter=new MyViewPagerAdapter(viewList, titleList);
		pager.setAdapter(adapter);
		
		bt1=(Button) view1.findViewById(R.id.button11);
		bt1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent=new Intent(MainActivity.this,DanciList2.class);
				//intent.setAction("aaa.bbb.ccc");
				intent.addCategory("android.intent.category.DEFAULT");
				startActivity(intent);
			}
		});
		
		/*fragList=new ArrayList<Fragment>();
		fragList.add(new Fragment1());
		fragList.add(new Fragment2());
		fragList.add(new Fragment3());*/
	
//		MyFragmentPagerAdapter adapter2=new MyFragmentPagerAdapter(getSupportFragmentManager(), fragList, titleList);
//		pager.setAdapter(adapter2);		
		
//		
//		MyFragmentPagerAdapter2 adapter3=new MyFragmentPagerAdapter2(getSupportFragmentManager(), fragList, titleList);
//		pager.setAdapter(adapter3);	
		pager.setOnPageChangeListener(this);
	}

	@Override
	public void onPageScrollStateChanged(int arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onPageScrolled(int arg0, float arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onPageSelected(int arg0) {
		// TODO Auto-generated method stub
	
		Toast.makeText(this, "���ǵ�"+(arg0+1)+"������", Toast.LENGTH_SHORT).show();
	}



}