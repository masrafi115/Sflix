package com.codesw.sflix;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.*;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.ActionBarDrawerToggle;
import android.widget.LinearLayout;
import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.webkit.*;
import android.animation.*;
import android.view.animation.*;
import java.util.*;
import java.util.regex.*;
import java.text.*;
import org.json.*;
import java.util.ArrayList;
import java.util.HashMap;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ScrollView;
import android.widget.HorizontalScrollView;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.content.Intent;
import android.net.Uri;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.GenericTypeIndicator;
import com.google.firebase.database.ChildEventListener;
import android.app.Activity;
import android.content.SharedPreferences;
import android.view.View;
import com.bumptech.glide.Glide;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class HoneActivity extends  AppCompatActivity  { 
	
	private FirebaseDatabase _firebase = FirebaseDatabase.getInstance();
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private DrawerLayout _drawer;
	private double dark = 0;
	
	private ArrayList<HashMap<String, Object>> cartoon = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> action = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> koreaa = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> listmap1 = new ArrayList<>();
	private ArrayList<String> horror = new ArrayList<>();
	private ArrayList<String> cartoon_key = new ArrayList<>();
	private ArrayList<String> action_key = new ArrayList<>();
	private ArrayList<String> korea_key = new ArrayList<>();
	private ArrayList<HashMap<String, Object>> series_map = new ArrayList<>();
	private ArrayList<String> series_key = new ArrayList<>();
	
	private LinearLayout linear4;
	private LinearLayout linear3;
	private LinearLayout linear6;
	private LinearLayout linear2;
	private LinearLayout linear1;
	private LinearLayout linear5;
	private LinearLayout linear41;
	private LinearLayout linear40;
	private LinearLayout linear7;
	private LinearLayout linear8;
	private ImageView imageview23;
	private TextView textview1;
	private ImageView search;
	private LinearLayout page1;
	private LinearLayout page2;
	private LinearLayout page3;
	private ScrollView vscroll1;
	private LinearLayout linear15;
	private LinearLayout linear13;
	private LinearLayout linear59;
	private LinearLayout linear14;
	private LinearLayout linear23;
	private LinearLayout linear44;
	private HorizontalScrollView hscroll3;
	private LinearLayout linear45;
	private LinearLayout linear46;
	private LinearLayout linear47;
	private LinearLayout linear48;
	private LinearLayout linear49;
	private ImageView imageview9;
	private LinearLayout linear60;
	private LinearLayout linear61;
	private LinearLayout linear62;
	private ImageView cover1;
	private TextView textview13;
	private ImageView cover2;
	private TextView textview14;
	private ImageView cover3;
	private TextView textview15;
	private LinearLayout linear16;
	private LinearLayout linear18;
	private TextView textview6;
	private LinearLayout linear17;
	private ImageView imageview10;
	private HorizontalScrollView hscroll1;
	private LinearLayout linear63;
	private ListView listview1;
	private LinearLayout linear24;
	private LinearLayout linear25;
	private TextView textview7;
	private LinearLayout linear26;
	private ImageView imageview14;
	private HorizontalScrollView hscroll2;
	private LinearLayout linear64;
	private ListView listview3;
	private LinearLayout linear50;
	private LinearLayout linear52;
	private TextView textview9;
	private LinearLayout linear51;
	private ImageView imageview26;
	private LinearLayout linear65;
	private ListView action_list;
	private LinearLayout linear53;
	private LinearLayout linear54;
	private LinearLayout linear55;
	private ImageView imageview27;
	private LinearLayout linear56;
	private LinearLayout linear58;
	private TextView textview10;
	private LinearLayout linear57;
	private ImageView imageview28;
	private HorizontalScrollView hscroll4;
	private LinearLayout linear66;
	private ListView korea;
	private LinearLayout grid_layout;
	private ListView listview2;
	private ImageView imageview25;
	private LinearLayout button1;
	private LinearLayout button2;
	private LinearLayout button3;
	private ImageView home_;
	private LinearLayout b2;
	private ImageView series_;
	private LinearLayout b3;
	private ImageView live_;
	private LinearLayout _drawer_linear7;
	private LinearLayout _drawer_linear8;
	private LinearLayout _drawer_linear9;
	private LinearLayout _drawer_linear22;
	private LinearLayout _drawer_linear21;
	private ImageView _drawer_dark_on_off;
	private LinearLayout _drawer_pp;
	private LinearLayout _drawer_linear18;
	private ImageView _drawer_profile;
	private TextView _drawer_textview6;
	private TextView _drawer_textview7;
	private LinearLayout _drawer_linear11;
	private LinearLayout _drawer_linear19;
	private LinearLayout _drawer_linear12;
	private LinearLayout _drawer_linear13;
	private LinearLayout _drawer_linear14;
	private LinearLayout _drawer_linear15;
	private LinearLayout _drawer_linear16;
	private ImageView _drawer_imageview3;
	private TextView _drawer_textview1;
	private ImageView _drawer_imageview4;
	private TextView _drawer_textview2;
	private ImageView _drawer_imageview5;
	private TextView _drawer_textview3;
	private ImageView _drawer_imageview6;
	private TextView _drawer_textview4;
	private ImageView _drawer_imageview7;
	private TextView _drawer_textview5;
	private TextView _drawer_textview8;
	
	private Intent i = new Intent();
	private Intent series = new Intent();
	private Intent horror_all = new Intent();
	private Intent horror_view = new Intent();
	private Intent cartoonn = new Intent();
	private Intent action_all_view = new Intent();
	private Intent korea_all_view = new Intent();
	private DatabaseReference Horror = _firebase.getReference("Horror");
	private ChildEventListener _Horror_child_listener;
	private DatabaseReference Cartoon = _firebase.getReference("Cartoon");
	private ChildEventListener _Cartoon_child_listener;
	private DatabaseReference Action = _firebase.getReference("Action");
	private ChildEventListener _Action_child_listener;
	private DatabaseReference Korea = _firebase.getReference("Korea");
	private ChildEventListener _Korea_child_listener;
	private Intent Chinese = new Intent();
	private Intent India = new Intent();
	private Intent war = new Intent();
	private DatabaseReference Series = _firebase.getReference("Series");
	private ChildEventListener _Series_child_listener;
	private SharedPreferences sp;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.hone);
		initialize(_savedInstanceState);
		com.google.firebase.FirebaseApp.initializeApp(this);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		_app_bar = (AppBarLayout) findViewById(R.id._app_bar);
		_coordinator = (CoordinatorLayout) findViewById(R.id._coordinator);
		_toolbar = (Toolbar) findViewById(R.id._toolbar);
		setSupportActionBar(_toolbar);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setHomeButtonEnabled(true);
		_toolbar.setNavigationOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _v) {
				onBackPressed();
			}
		});
		_drawer = (DrawerLayout) findViewById(R.id._drawer);
		ActionBarDrawerToggle _toggle = new ActionBarDrawerToggle(HoneActivity.this, _drawer, _toolbar, R.string.app_name, R.string.app_name);
		_drawer.addDrawerListener(_toggle);
		_toggle.syncState();
		
		LinearLayout _nav_view = (LinearLayout) findViewById(R.id._nav_view);
		
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		linear41 = (LinearLayout) findViewById(R.id.linear41);
		linear40 = (LinearLayout) findViewById(R.id.linear40);
		linear7 = (LinearLayout) findViewById(R.id.linear7);
		linear8 = (LinearLayout) findViewById(R.id.linear8);
		imageview23 = (ImageView) findViewById(R.id.imageview23);
		textview1 = (TextView) findViewById(R.id.textview1);
		search = (ImageView) findViewById(R.id.search);
		page1 = (LinearLayout) findViewById(R.id.page1);
		page2 = (LinearLayout) findViewById(R.id.page2);
		page3 = (LinearLayout) findViewById(R.id.page3);
		vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
		linear15 = (LinearLayout) findViewById(R.id.linear15);
		linear13 = (LinearLayout) findViewById(R.id.linear13);
		linear59 = (LinearLayout) findViewById(R.id.linear59);
		linear14 = (LinearLayout) findViewById(R.id.linear14);
		linear23 = (LinearLayout) findViewById(R.id.linear23);
		linear44 = (LinearLayout) findViewById(R.id.linear44);
		hscroll3 = (HorizontalScrollView) findViewById(R.id.hscroll3);
		linear45 = (LinearLayout) findViewById(R.id.linear45);
		linear46 = (LinearLayout) findViewById(R.id.linear46);
		linear47 = (LinearLayout) findViewById(R.id.linear47);
		linear48 = (LinearLayout) findViewById(R.id.linear48);
		linear49 = (LinearLayout) findViewById(R.id.linear49);
		imageview9 = (ImageView) findViewById(R.id.imageview9);
		linear60 = (LinearLayout) findViewById(R.id.linear60);
		linear61 = (LinearLayout) findViewById(R.id.linear61);
		linear62 = (LinearLayout) findViewById(R.id.linear62);
		cover1 = (ImageView) findViewById(R.id.cover1);
		textview13 = (TextView) findViewById(R.id.textview13);
		cover2 = (ImageView) findViewById(R.id.cover2);
		textview14 = (TextView) findViewById(R.id.textview14);
		cover3 = (ImageView) findViewById(R.id.cover3);
		textview15 = (TextView) findViewById(R.id.textview15);
		linear16 = (LinearLayout) findViewById(R.id.linear16);
		linear18 = (LinearLayout) findViewById(R.id.linear18);
		textview6 = (TextView) findViewById(R.id.textview6);
		linear17 = (LinearLayout) findViewById(R.id.linear17);
		imageview10 = (ImageView) findViewById(R.id.imageview10);
		hscroll1 = (HorizontalScrollView) findViewById(R.id.hscroll1);
		linear63 = (LinearLayout) findViewById(R.id.linear63);
		listview1 = (ListView) findViewById(R.id.listview1);
		linear24 = (LinearLayout) findViewById(R.id.linear24);
		linear25 = (LinearLayout) findViewById(R.id.linear25);
		textview7 = (TextView) findViewById(R.id.textview7);
		linear26 = (LinearLayout) findViewById(R.id.linear26);
		imageview14 = (ImageView) findViewById(R.id.imageview14);
		hscroll2 = (HorizontalScrollView) findViewById(R.id.hscroll2);
		linear64 = (LinearLayout) findViewById(R.id.linear64);
		listview3 = (ListView) findViewById(R.id.listview3);
		linear50 = (LinearLayout) findViewById(R.id.linear50);
		linear52 = (LinearLayout) findViewById(R.id.linear52);
		textview9 = (TextView) findViewById(R.id.textview9);
		linear51 = (LinearLayout) findViewById(R.id.linear51);
		imageview26 = (ImageView) findViewById(R.id.imageview26);
		linear65 = (LinearLayout) findViewById(R.id.linear65);
		action_list = (ListView) findViewById(R.id.action_list);
		linear53 = (LinearLayout) findViewById(R.id.linear53);
		linear54 = (LinearLayout) findViewById(R.id.linear54);
		linear55 = (LinearLayout) findViewById(R.id.linear55);
		imageview27 = (ImageView) findViewById(R.id.imageview27);
		linear56 = (LinearLayout) findViewById(R.id.linear56);
		linear58 = (LinearLayout) findViewById(R.id.linear58);
		textview10 = (TextView) findViewById(R.id.textview10);
		linear57 = (LinearLayout) findViewById(R.id.linear57);
		imageview28 = (ImageView) findViewById(R.id.imageview28);
		hscroll4 = (HorizontalScrollView) findViewById(R.id.hscroll4);
		linear66 = (LinearLayout) findViewById(R.id.linear66);
		korea = (ListView) findViewById(R.id.korea);
		grid_layout = (LinearLayout) findViewById(R.id.grid_layout);
		listview2 = (ListView) findViewById(R.id.listview2);
		imageview25 = (ImageView) findViewById(R.id.imageview25);
		button1 = (LinearLayout) findViewById(R.id.button1);
		button2 = (LinearLayout) findViewById(R.id.button2);
		button3 = (LinearLayout) findViewById(R.id.button3);
		home_ = (ImageView) findViewById(R.id.home_);
		b2 = (LinearLayout) findViewById(R.id.b2);
		series_ = (ImageView) findViewById(R.id.series_);
		b3 = (LinearLayout) findViewById(R.id.b3);
		live_ = (ImageView) findViewById(R.id.live_);
		_drawer_linear7 = (LinearLayout) _nav_view.findViewById(R.id.linear7);
		_drawer_linear8 = (LinearLayout) _nav_view.findViewById(R.id.linear8);
		_drawer_linear9 = (LinearLayout) _nav_view.findViewById(R.id.linear9);
		_drawer_linear22 = (LinearLayout) _nav_view.findViewById(R.id.linear22);
		_drawer_linear21 = (LinearLayout) _nav_view.findViewById(R.id.linear21);
		_drawer_dark_on_off = (ImageView) _nav_view.findViewById(R.id.dark_on_off);
		_drawer_pp = (LinearLayout) _nav_view.findViewById(R.id.pp);
		_drawer_linear18 = (LinearLayout) _nav_view.findViewById(R.id.linear18);
		_drawer_profile = (ImageView) _nav_view.findViewById(R.id.profile);
		_drawer_textview6 = (TextView) _nav_view.findViewById(R.id.textview6);
		_drawer_textview7 = (TextView) _nav_view.findViewById(R.id.textview7);
		_drawer_linear11 = (LinearLayout) _nav_view.findViewById(R.id.linear11);
		_drawer_linear19 = (LinearLayout) _nav_view.findViewById(R.id.linear19);
		_drawer_linear12 = (LinearLayout) _nav_view.findViewById(R.id.linear12);
		_drawer_linear13 = (LinearLayout) _nav_view.findViewById(R.id.linear13);
		_drawer_linear14 = (LinearLayout) _nav_view.findViewById(R.id.linear14);
		_drawer_linear15 = (LinearLayout) _nav_view.findViewById(R.id.linear15);
		_drawer_linear16 = (LinearLayout) _nav_view.findViewById(R.id.linear16);
		_drawer_imageview3 = (ImageView) _nav_view.findViewById(R.id.imageview3);
		_drawer_textview1 = (TextView) _nav_view.findViewById(R.id.textview1);
		_drawer_imageview4 = (ImageView) _nav_view.findViewById(R.id.imageview4);
		_drawer_textview2 = (TextView) _nav_view.findViewById(R.id.textview2);
		_drawer_imageview5 = (ImageView) _nav_view.findViewById(R.id.imageview5);
		_drawer_textview3 = (TextView) _nav_view.findViewById(R.id.textview3);
		_drawer_imageview6 = (ImageView) _nav_view.findViewById(R.id.imageview6);
		_drawer_textview4 = (TextView) _nav_view.findViewById(R.id.textview4);
		_drawer_imageview7 = (ImageView) _nav_view.findViewById(R.id.imageview7);
		_drawer_textview5 = (TextView) _nav_view.findViewById(R.id.textview5);
		_drawer_textview8 = (TextView) _nav_view.findViewById(R.id.textview8);
		sp = getSharedPreferences("a", Activity.MODE_PRIVATE);
		
		linear41.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				_drawer.openDrawer(GravityCompat.START);
			}
		});
		
		imageview9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		cover1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Chinese.setClass(getApplicationContext(), ChineseAllViewActivity.class);
				startActivity(Chinese);
			}
		});
		
		cover2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				India.setClass(getApplicationContext(), IndiaAllViewActivity.class);
				startActivity(India);
			}
		});
		
		cover3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				war.setClass(getApplicationContext(), WarAllViewActivity.class);
				startActivity(war);
			}
		});
		
		imageview10.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				horror_all.setClass(getApplicationContext(), HorrorAllViewActivity.class);
				horror_all.putExtra("tag", "Horror");
				startActivity(horror_all);
			}
		});
		
		imageview14.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				cartoonn.setClass(getApplicationContext(), CartoomAnimationActivity.class);
				cartoonn.putExtra("tag", "Cartoon");
				startActivity(cartoonn);
			}
		});
		
		imageview26.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				action_all_view.setClass(getApplicationContext(), ActionAllViewActivity.class);
				action_all_view.putExtra("tag", "Action");
				startActivity(action_all_view);
			}
		});
		
		imageview28.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				korea_all_view.setClass(getApplicationContext(), KoreaAllViewActivity.class);
				korea_all_view.putExtra("tag", "Korea");
				startActivity(korea_all_view);
			}
		});
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				textview1.setText("MMovies");
				page1.setVisibility(View.VISIBLE);
				page2.setVisibility(View.GONE);
				page3.setVisibility(View.GONE);
				home_.setImageResource(R.drawable.home);
				series_.setImageResource(R.drawable.movies_);
				live_.setImageResource(R.drawable.live);
			}
		});
		
		button2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				textview1.setText("Series");
				page1.setVisibility(View.GONE);
				page2.setVisibility(View.VISIBLE);
				page3.setVisibility(View.GONE);
				home_.setImageResource(R.drawable.home_);
				series_.setImageResource(R.drawable.movies);
				live_.setImageResource(R.drawable.live);
			}
		});
		
		button3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				textview1.setText("Live TV");
				page1.setVisibility(View.GONE);
				page2.setVisibility(View.GONE);
				page3.setVisibility(View.VISIBLE);
				home_.setImageResource(R.drawable.home_);
				series_.setImageResource(R.drawable.movies_);
				live_.setImageResource(R.drawable.live_);
			}
		});
		
		_Horror_child_listener = new ChildEventListener() {
			@Override
			public void onChildAdded(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				Horror.addListenerForSingleValueEvent(new ValueEventListener() {
					@Override
					public void onDataChange(DataSnapshot _dataSnapshot) {
						listmap1 = new ArrayList<>();
						try {
							GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
							for (DataSnapshot _data : _dataSnapshot.getChildren()) {
								HashMap<String, Object> _map = _data.getValue(_ind);
								listmap1.add(_map);
							}
						}
						catch (Exception _e) {
							_e.printStackTrace();
						}
						horror.add(_childKey);
						_Gridview();
					}
					@Override
					public void onCancelled(DatabaseError _databaseError) {
					}
				});
			}
			
			@Override
			public void onChildChanged(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onChildMoved(DataSnapshot _param1, String _param2) {
				
			}
			
			@Override
			public void onChildRemoved(DataSnapshot _param1) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onCancelled(DatabaseError _param1) {
				final int _errorCode = _param1.getCode();
				final String _errorMessage = _param1.getMessage();
				
			}
		};
		Horror.addChildEventListener(_Horror_child_listener);
		
		_Cartoon_child_listener = new ChildEventListener() {
			@Override
			public void onChildAdded(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				Cartoon.addListenerForSingleValueEvent(new ValueEventListener() {
					@Override
					public void onDataChange(DataSnapshot _dataSnapshot) {
						cartoon = new ArrayList<>();
						try {
							GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
							for (DataSnapshot _data : _dataSnapshot.getChildren()) {
								HashMap<String, Object> _map = _data.getValue(_ind);
								cartoon.add(_map);
							}
						}
						catch (Exception _e) {
							_e.printStackTrace();
						}
						cartoon_key.add(_childKey);
						_Cartton_Grid();
					}
					@Override
					public void onCancelled(DatabaseError _databaseError) {
					}
				});
			}
			
			@Override
			public void onChildChanged(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onChildMoved(DataSnapshot _param1, String _param2) {
				
			}
			
			@Override
			public void onChildRemoved(DataSnapshot _param1) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onCancelled(DatabaseError _param1) {
				final int _errorCode = _param1.getCode();
				final String _errorMessage = _param1.getMessage();
				
			}
		};
		Cartoon.addChildEventListener(_Cartoon_child_listener);
		
		_Action_child_listener = new ChildEventListener() {
			@Override
			public void onChildAdded(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				Action.addListenerForSingleValueEvent(new ValueEventListener() {
					@Override
					public void onDataChange(DataSnapshot _dataSnapshot) {
						action = new ArrayList<>();
						try {
							GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
							for (DataSnapshot _data : _dataSnapshot.getChildren()) {
								HashMap<String, Object> _map = _data.getValue(_ind);
								action.add(_map);
							}
						}
						catch (Exception _e) {
							_e.printStackTrace();
						}
						action_key.add(_childKey);
						_Grid_Action();
					}
					@Override
					public void onCancelled(DatabaseError _databaseError) {
					}
				});
			}
			
			@Override
			public void onChildChanged(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onChildMoved(DataSnapshot _param1, String _param2) {
				
			}
			
			@Override
			public void onChildRemoved(DataSnapshot _param1) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onCancelled(DatabaseError _param1) {
				final int _errorCode = _param1.getCode();
				final String _errorMessage = _param1.getMessage();
				
			}
		};
		Action.addChildEventListener(_Action_child_listener);
		
		_Korea_child_listener = new ChildEventListener() {
			@Override
			public void onChildAdded(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				Korea.addListenerForSingleValueEvent(new ValueEventListener() {
					@Override
					public void onDataChange(DataSnapshot _dataSnapshot) {
						koreaa = new ArrayList<>();
						try {
							GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
							for (DataSnapshot _data : _dataSnapshot.getChildren()) {
								HashMap<String, Object> _map = _data.getValue(_ind);
								koreaa.add(_map);
							}
						}
						catch (Exception _e) {
							_e.printStackTrace();
						}
						korea_key.add(_childKey);
						_Grid_Korea();
					}
					@Override
					public void onCancelled(DatabaseError _databaseError) {
					}
				});
			}
			
			@Override
			public void onChildChanged(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onChildMoved(DataSnapshot _param1, String _param2) {
				
			}
			
			@Override
			public void onChildRemoved(DataSnapshot _param1) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onCancelled(DatabaseError _param1) {
				final int _errorCode = _param1.getCode();
				final String _errorMessage = _param1.getMessage();
				
			}
		};
		Korea.addChildEventListener(_Korea_child_listener);
		
		_Series_child_listener = new ChildEventListener() {
			@Override
			public void onChildAdded(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				Series.addListenerForSingleValueEvent(new ValueEventListener() {
					@Override
					public void onDataChange(DataSnapshot _dataSnapshot) {
						series_map = new ArrayList<>();
						try {
							GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
							for (DataSnapshot _data : _dataSnapshot.getChildren()) {
								HashMap<String, Object> _map = _data.getValue(_ind);
								series_map.add(_map);
							}
						}
						catch (Exception _e) {
							_e.printStackTrace();
						}
						series_key.add(_childKey);
						listview2.setAdapter(new Listview2Adapter(series_map));
						((BaseAdapter)listview2.getAdapter()).notifyDataSetChanged();
					}
					@Override
					public void onCancelled(DatabaseError _databaseError) {
					}
				});
			}
			
			@Override
			public void onChildChanged(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onChildMoved(DataSnapshot _param1, String _param2) {
				
			}
			
			@Override
			public void onChildRemoved(DataSnapshot _param1) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onCancelled(DatabaseError _param1) {
				final int _errorCode = _param1.getCode();
				final String _errorMessage = _param1.getMessage();
				
			}
		};
		Series.addChildEventListener(_Series_child_listener);
		
		_drawer_linear7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		_drawer_dark_on_off.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (dark == 0) {
					dark = 1;
				}
				else {
					dark = 0;
				}
			}
		});
		
		_drawer_pp.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
	}
	
	private void initializeLogic() {
		_Cover_ToetusAung(cover1);
		_Cover_ToetusAung(cover2);
		_Cover_ToetusAung(cover3);
		_ToetusAung(imageview9);
		_DG_Hide_Toolbar();
		_DG_DrawerTransparent();
		Series.addListenerForSingleValueEvent(new ValueEventListener() {
			@Override
			public void onDataChange(DataSnapshot _dataSnapshot) {
				series_map = new ArrayList<>();
				try {
					GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
					for (DataSnapshot _data : _dataSnapshot.getChildren()) {
						HashMap<String, Object> _map = _data.getValue(_ind);
						series_map.add(_map);
					}
				}
				catch (Exception _e) {
					_e.printStackTrace();
				}
				_grid_view(series_map);
				listview2.setAdapter(new Listview2Adapter(series_map));
			}
			@Override
			public void onCancelled(DatabaseError _databaseError) {
			}
		});
		_Grid_OnCreate();
		android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable ();
		gd.setColor(android.R.color.transparent);
		gd.setCornerRadius(390);
		_drawer_profile.setClipToOutline(true);
		_drawer_profile.setBackground(gd);
		android.graphics.drawable.GradientDrawable BIFCICG = new android.graphics.drawable.GradientDrawable();
		BIFCICG.setColor(Color.parseColor("#FFFFFF"));
		BIFCICG.setCornerRadius(360);
		_drawer_pp.setBackground(BIFCICG);
		search.getDrawable().setColorFilter(Color.parseColor("#000000"), PorterDuff.Mode.SRC_IN);
		android.graphics.drawable.GradientDrawable CIFEGEF = new android.graphics.drawable.GradientDrawable();
		CIFEGEF.setColor(Color.parseColor("#FFFFFFFF"));
		CIFEGEF.setCornerRadius(50);
		linear8.setBackground(CIFEGEF);
		android.graphics.drawable.GradientDrawable JGCAAFA = new android.graphics.drawable.GradientDrawable();
		JGCAAFA.setColor(Color.parseColor("#FF607D8B"));
		JGCAAFA.setCornerRadii(new float[] { 0, 0, 20, 20, 20, 20, 0, 0 });
		linear53.setBackground(JGCAAFA);
		android.graphics.drawable.GradientDrawable IEHBFAG = new android.graphics.drawable.GradientDrawable();
		IEHBFAG.setColor(Color.parseColor("#FF607D8B"));
		IEHBFAG.setCornerRadii(new float[] { 20, 20, 0, 0, 0, 0, 20, 20 });
		linear55.setBackground(IEHBFAG);
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	@Override
	public void onBackPressed() {
		if (_drawer.isDrawerOpen(GravityCompat.START)) {
			_drawer.closeDrawer(GravityCompat.START);
		}
		else {
			super.onBackPressed();
		}
	}
	public void _Gridview () {
		grid = new GridView(HoneActivity.this);
				
				grid.setLayoutParams(new GridView.LayoutParams(listmap1.size()*(int)getDip(100), GridLayout.LayoutParams.WRAP_CONTENT));
				
				grid.setNumColumns(listmap1.size());
				
				grid.setBackgroundColor(Color.TRANSPARENT);
				
				grid.setVerticalSpacing(5);
				
				grid.setHorizontalSpacing(15);
				
				grid.setStretchMode(GridView.STRETCH_COLUMN_WIDTH);
				
				grid.setAdapter(new Listview1Adapter(listmap1));
				
				linear63.addView(grid);
				grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
						  @Override
						  public void onItemClick(AdapterView parent, View view, int _pos, long id) {
								showMessage(String.valueOf(_pos));
						}
				});
		linear63.removeAllViews();
		
		linear63.addView(grid);
	}
	
	
	public void _Cartton_Grid () {
		grid = new GridView(HoneActivity.this);
				
				grid.setLayoutParams(new GridView.LayoutParams(cartoon.size()*(int)getDip(100), GridLayout.LayoutParams.WRAP_CONTENT));
				
				grid.setNumColumns(cartoon.size());
				
				grid.setBackgroundColor(Color.TRANSPARENT);
				
				grid.setVerticalSpacing(5);
				
				grid.setHorizontalSpacing(15);
				
				grid.setStretchMode(GridView.STRETCH_COLUMN_WIDTH);
				
				grid.setAdapter(new Listview3Adapter(cartoon));
				
				linear64.addView(grid);
				grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
						  @Override
						  public void onItemClick(AdapterView parent, View view, int _pos, long id) {
								showMessage(String.valueOf(_pos));
						}
				});
		linear64.removeAllViews();
		
		linear64.addView(grid);
	}
	
	
	public void _Grid_Action () {
		grid = new GridView(HoneActivity.this);
				
				grid.setLayoutParams(new GridView.LayoutParams(action.size()*(int)getDip(100), GridLayout.LayoutParams.WRAP_CONTENT));
				
				grid.setNumColumns(action.size());
				
				grid.setBackgroundColor(Color.TRANSPARENT);
				
				grid.setVerticalSpacing(5);
				
				grid.setHorizontalSpacing(15);
				
				grid.setStretchMode(GridView.STRETCH_COLUMN_WIDTH);
				
				grid.setAdapter(new Action_listAdapter(action));
				
				linear65.addView(grid);
				grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
						  @Override
						  public void onItemClick(AdapterView parent, View view, int _pos, long id) {
								showMessage(String.valueOf(_pos));
						}
				});
		linear65.removeAllViews();
		
		linear65.addView(grid);
	}
	
	
	public void _Grid_Korea () {
		grid = new GridView(HoneActivity.this);
				
				grid.setLayoutParams(new GridView.LayoutParams(koreaa.size()*(int)getDip(100), GridLayout.LayoutParams.WRAP_CONTENT));
				
				grid.setNumColumns(koreaa.size());
				
				grid.setBackgroundColor(Color.TRANSPARENT);
				
				grid.setVerticalSpacing(5);
				
				grid.setHorizontalSpacing(15);
				
				grid.setStretchMode(GridView.STRETCH_COLUMN_WIDTH);
				
				grid.setAdapter(new KoreaAdapter(koreaa));
				
				linear66.addView(grid);
				grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
						  @Override
						  public void onItemClick(AdapterView parent, View view, int _pos, long id) {
								showMessage(String.valueOf(_pos));
						}
				});
		linear66.removeAllViews();
		
		linear66.addView(grid);
	}
	
	
	public void _Grid_OnCreate () {
	}
		
		private GridView grid; 
		
		
		public class Gridview1Adapter extends BaseAdapter {
						ArrayList<HashMap<String, Object>> _data;
						public Gridview1Adapter(ArrayList<HashMap<String, Object>> _arr) {
									_data = _arr;
						}
						
						@Override
						public int getCount() {
									return _data.size();
						}
						
						@Override
						public HashMap<String, Object> getItem(int _index) {
									return _data.get(_index);
						}
						
						@Override
						public long getItemId(int _index) {
									return _index;
						}
						
						@Override
						public View getView(final int _position, View _view, ViewGroup _viewGroup) {
									LayoutInflater _inflater = (LayoutInflater)getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
									View _v = _view;
									if (_v == null) {
												_v = _inflater.inflate(R.layout.user, null);
									}
									
									final ImageView icon = (ImageView) _v.findViewById(R.id.icon);
			
			
			
			/* Bitmap bm = ((android.graphics.drawable.BitmapDrawable)icon.getDrawable()).getBitmap();

icon.setImageBitmap(getRoundedCornerBitmap(bm, 360));
*/
			
									final TextView text = (TextView) _v.findViewById(R.id.text);
			
			LinearLayout lin2 = (LinearLayout)
			_v.findViewById(R.id.linear1);
			
			
				
									return _v;
						}
	}
		
		private GridView grid1; 
		
		
		public class Gridview2Adapter extends BaseAdapter {
						ArrayList<HashMap<String, Object>> _data;
						public Gridview2Adapter(ArrayList<HashMap<String, Object>> _arr) {
									_data = _arr;
						}
						
						@Override
						public int getCount() {
									return _data.size();
						}
						
						@Override
						public HashMap<String, Object> getItem(int _index) {
									return _data.get(_index);
						}
						
						@Override
						public long getItemId(int _index) {
									return _index;
						}
						
						@Override
						public View getView(final int _position, View _view, ViewGroup _viewGroup) {
									LayoutInflater _inflater = (LayoutInflater)getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
									View _v = _view;
									if (_v == null) {
												_v = _inflater.inflate(R.layout.cartoom, null);
									}
									
									final ImageView icon = (ImageView) _v.findViewById(R.id.icon);
			
			
			
			/* Bitmap bm = ((android.graphics.drawable.BitmapDrawable)icon.getDrawable()).getBitmap();

icon.setImageBitmap(getRoundedCornerBitmap(bm, 360));
*/
			
									final TextView text = (TextView) _v.findViewById(R.id.text);
			
			LinearLayout lin2 = (LinearLayout)
			_v.findViewById(R.id.linear1);
			
			
				
									return _v;
						}
	}
		
		private GridView grid2; 
		
		
		public class Gridview3Adapter extends BaseAdapter {
						ArrayList<HashMap<String, Object>> _data;
						public Gridview3Adapter(ArrayList<HashMap<String, Object>> _arr) {
									_data = _arr;
						}
						
						@Override
						public int getCount() {
									return _data.size();
						}
						
						@Override
						public HashMap<String, Object> getItem(int _index) {
									return _data.get(_index);
						}
						
						@Override
						public long getItemId(int _index) {
									return _index;
						}
						
						@Override
						public View getView(final int _position, View _view, ViewGroup _viewGroup) {
									LayoutInflater _inflater = (LayoutInflater)getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
									View _v = _view;
									if (_v == null) {
												_v = _inflater.inflate(R.layout.action, null);
									}
									
									final ImageView icon = (ImageView) _v.findViewById(R.id.icon);
			
			
			
			/* Bitmap bm = ((android.graphics.drawable.BitmapDrawable)icon.getDrawable()).getBitmap();

icon.setImageBitmap(getRoundedCornerBitmap(bm, 360));
*/
			
									final TextView text = (TextView) _v.findViewById(R.id.text);
			
			LinearLayout lin2 = (LinearLayout)
			_v.findViewById(R.id.linear1);
			
			
				
									return _v;
						}
	}
		
		private GridView grid3; 
		
		
		public class Gridview4Adapter extends BaseAdapter {
						ArrayList<HashMap<String, Object>> _data;
						public Gridview4Adapter(ArrayList<HashMap<String, Object>> _arr) {
									_data = _arr;
						}
						
						@Override
						public int getCount() {
									return _data.size();
						}
						
						@Override
						public HashMap<String, Object> getItem(int _index) {
									return _data.get(_index);
						}
						
						@Override
						public long getItemId(int _index) {
									return _index;
						}
						
						@Override
						public View getView(final int _position, View _view, ViewGroup _viewGroup) {
									LayoutInflater _inflater = (LayoutInflater)getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
									View _v = _view;
									if (_v == null) {
												_v = _inflater.inflate(R.layout.korea, null);
									}
									
									final ImageView icon = (ImageView) _v.findViewById(R.id.icon);
			
			
			
			/* Bitmap bm = ((android.graphics.drawable.BitmapDrawable)icon.getDrawable()).getBitmap();

icon.setImageBitmap(getRoundedCornerBitmap(bm, 360));
*/
			
									final TextView text = (TextView) _v.findViewById(R.id.text);
			
			LinearLayout lin2 = (LinearLayout)
			_v.findViewById(R.id.linear1);
			
			
				
									return _v;
						}
	}
	
	
	public void _grid_view (final ArrayList<HashMap<String, Object>> _listmap) {
		//Change grid_layout to the name of your linear layout for which you'd like to load the gridview.
		GridView gridView = new GridView(this);
		gridView.setLayoutParams(new GridView.LayoutParams(GridLayout.LayoutParams.MATCH_PARENT, GridLayout.LayoutParams.WRAP_CONTENT));
		
		///gridView.setBackgroundColor(Color.WHITE);
		
		gridView.setNumColumns(3);
		gridView.setColumnWidth(GridView.AUTO_FIT);
		
		gridView.setVerticalSpacing(40);
		
		gridView.setHorizontalSpacing(10);
		gridView.setStretchMode(GridView.STRETCH_COLUMN_WIDTH);
		
		gridView.setAdapter(new Listview2Adapter(_listmap));
		
		((BaseAdapter)gridView.getAdapter()).notifyDataSetChanged();
		
		grid_layout.addView(gridView);
	}
	
	
	public void _DG_Hide_Toolbar () {
		getSupportActionBar().hide();
	}
	
	
	public void _DG_DrawerTransparent () {
		final LinearLayout _nav_view = (LinearLayout) findViewById(R.id._nav_view); _nav_view.setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(Color.TRANSPARENT));
	}
	
	
	public void _ToetusAung (final ImageView _image) {
		android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable ();
		gd.setColor(android.R.color.transparent);
		gd.setCornerRadius(20);
		_image.setClipToOutline(true);
		_image.setBackground(gd);
	}
	
	
	public void _Cover_ToetusAung (final ImageView _image) {
		android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable ();
		gd.setColor(android.R.color.transparent);
		gd.setCornerRadius(390);
		_image.setClipToOutline(true);
		_image.setBackground(gd);
	}
	
	
	public class Listview1Adapter extends BaseAdapter {
		ArrayList<HashMap<String, Object>> _data;
		public Listview1Adapter(ArrayList<HashMap<String, Object>> _arr) {
			_data = _arr;
		}
		
		@Override
		public int getCount() {
			return _data.size();
		}
		
		@Override
		public HashMap<String, Object> getItem(int _index) {
			return _data.get(_index);
		}
		
		@Override
		public long getItemId(int _index) {
			return _index;
		}
		@Override
		public View getView(final int _position, View _v, ViewGroup _container) {
			LayoutInflater _inflater = (LayoutInflater)getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			View _view = _v;
			if (_view == null) {
				_view = _inflater.inflate(R.layout.user, null);
			}
			
			final LinearLayout linear1 = (LinearLayout) _view.findViewById(R.id.linear1);
			final ImageView icon = (ImageView) _view.findViewById(R.id.icon);
			
			Glide.with(getApplicationContext()).load(Uri.parse(listmap1.get((int)_position).get("cover").toString())).into(icon);
			linear1.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View _view) {
					horror_view.setClass(getApplicationContext(), HomeViewActivity.class);
					horror_view.putExtra("k", horror.get((int)(_position)));
					horror_view.putExtra("tag", "Horror");
					startActivity(horror_view);
				}
			});
			
			return _view;
		}
	}
	
	public class Listview3Adapter extends BaseAdapter {
		ArrayList<HashMap<String, Object>> _data;
		public Listview3Adapter(ArrayList<HashMap<String, Object>> _arr) {
			_data = _arr;
		}
		
		@Override
		public int getCount() {
			return _data.size();
		}
		
		@Override
		public HashMap<String, Object> getItem(int _index) {
			return _data.get(_index);
		}
		
		@Override
		public long getItemId(int _index) {
			return _index;
		}
		@Override
		public View getView(final int _position, View _v, ViewGroup _container) {
			LayoutInflater _inflater = (LayoutInflater)getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			View _view = _v;
			if (_view == null) {
				_view = _inflater.inflate(R.layout.cartoom, null);
			}
			
			final LinearLayout linear1 = (LinearLayout) _view.findViewById(R.id.linear1);
			final ImageView icon = (ImageView) _view.findViewById(R.id.icon);
			
			Glide.with(getApplicationContext()).load(Uri.parse(cartoon.get((int)_position).get("cover").toString())).into(icon);
			linear1.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View _view) {
					cartoonn.setClass(getApplicationContext(), HomeViewActivity.class);
					cartoonn.putExtra("k", cartoon_key.get((int)(_position)));
					cartoonn.putExtra("tag", "Cartoon");
					startActivity(cartoonn);
				}
			});
			
			return _view;
		}
	}
	
	public class Action_listAdapter extends BaseAdapter {
		ArrayList<HashMap<String, Object>> _data;
		public Action_listAdapter(ArrayList<HashMap<String, Object>> _arr) {
			_data = _arr;
		}
		
		@Override
		public int getCount() {
			return _data.size();
		}
		
		@Override
		public HashMap<String, Object> getItem(int _index) {
			return _data.get(_index);
		}
		
		@Override
		public long getItemId(int _index) {
			return _index;
		}
		@Override
		public View getView(final int _position, View _v, ViewGroup _container) {
			LayoutInflater _inflater = (LayoutInflater)getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			View _view = _v;
			if (_view == null) {
				_view = _inflater.inflate(R.layout.action, null);
			}
			
			final LinearLayout linear1 = (LinearLayout) _view.findViewById(R.id.linear1);
			final ImageView icon = (ImageView) _view.findViewById(R.id.icon);
			
			Glide.with(getApplicationContext()).load(Uri.parse(action.get((int)_position).get("cover").toString())).into(icon);
			linear1.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View _view) {
					action_all_view.setClass(getApplicationContext(), HomeViewActivity.class);
					action_all_view.putExtra("k", action_key.get((int)(_position)));
					action_all_view.putExtra("tag", "Action");
					startActivity(action_all_view);
				}
			});
			
			return _view;
		}
	}
	
	public class KoreaAdapter extends BaseAdapter {
		ArrayList<HashMap<String, Object>> _data;
		public KoreaAdapter(ArrayList<HashMap<String, Object>> _arr) {
			_data = _arr;
		}
		
		@Override
		public int getCount() {
			return _data.size();
		}
		
		@Override
		public HashMap<String, Object> getItem(int _index) {
			return _data.get(_index);
		}
		
		@Override
		public long getItemId(int _index) {
			return _index;
		}
		@Override
		public View getView(final int _position, View _v, ViewGroup _container) {
			LayoutInflater _inflater = (LayoutInflater)getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			View _view = _v;
			if (_view == null) {
				_view = _inflater.inflate(R.layout.korea, null);
			}
			
			final LinearLayout linear1 = (LinearLayout) _view.findViewById(R.id.linear1);
			final ImageView icon = (ImageView) _view.findViewById(R.id.icon);
			
			Glide.with(getApplicationContext()).load(Uri.parse(koreaa.get((int)_position).get("cover").toString())).into(icon);
			linear1.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View _view) {
					korea_all_view.setClass(getApplicationContext(), HomeViewActivity.class);
					korea_all_view.putExtra("k", korea_key.get((int)(_position)));
					korea_all_view.putExtra("tag", "Korea");
					startActivity(korea_all_view);
				}
			});
			
			return _view;
		}
	}
	
	public class Listview2Adapter extends BaseAdapter {
		ArrayList<HashMap<String, Object>> _data;
		public Listview2Adapter(ArrayList<HashMap<String, Object>> _arr) {
			_data = _arr;
		}
		
		@Override
		public int getCount() {
			return _data.size();
		}
		
		@Override
		public HashMap<String, Object> getItem(int _index) {
			return _data.get(_index);
		}
		
		@Override
		public long getItemId(int _index) {
			return _index;
		}
		@Override
		public View getView(final int _position, View _v, ViewGroup _container) {
			LayoutInflater _inflater = (LayoutInflater)getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			View _view = _v;
			if (_view == null) {
				_view = _inflater.inflate(R.layout.series, null);
			}
			
			final LinearLayout linear1 = (LinearLayout) _view.findViewById(R.id.linear1);
			final ImageView imageview1 = (ImageView) _view.findViewById(R.id.imageview1);
			
			Glide.with(getApplicationContext()).load(Uri.parse(series_map.get((int)_position).get("cover").toString())).into(imageview1);
			linear1.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View _view) {
					sp.edit().putString("a", series_key.get((int)(_position))).commit();
					series.setClass(getApplicationContext(), SeriesViewActivity.class);
					series.putExtra("k", series_key.get((int)(_position)));
					startActivity(series);
				}
			});
			
			return _view;
		}
	}
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input){
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels(){
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels(){
		return getResources().getDisplayMetrics().heightPixels;
	}
	
}