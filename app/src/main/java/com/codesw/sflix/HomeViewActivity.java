package com.codesw.sflix;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.*;
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
import java.util.HashMap;
import java.util.ArrayList;
import android.widget.LinearLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ScrollView;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.EditText;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.GenericTypeIndicator;
import com.google.firebase.database.ChildEventListener;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import com.bumptech.glide.Glide;
import android.graphics.Typeface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class HomeViewActivity extends  AppCompatActivity  { 
	
	private FirebaseDatabase _firebase = FirebaseDatabase.getInstance();
	
	private HashMap<String, Object> m = new HashMap<>();
	private HashMap<String, Object> cmt = new HashMap<>();
	private String download_link = "";
	private String stream = "";
	
	private ArrayList<HashMap<String, Object>> comment = new ArrayList<>();
	
	private LinearLayout linear1;
	private LinearLayout linear2;
	private LinearLayout linear6;
	private LinearLayout linear8;
	private LinearLayout linear9;
	private LinearLayout linear5;
	private LinearLayout linear4;
	private LinearLayout linear3;
	private ImageView imageview1;
	private TextView title;
	private TextView textview2;
	private TextView textview3;
	private TextView textview4;
	private LinearLayout page1;
	private LinearLayout page2;
	private LinearLayout page3;
	private LinearLayout linear13;
	private LinearLayout linear14;
	private LinearLayout linear15;
	private LinearLayout linear18;
	private LinearLayout linear17;
	private LinearLayout linear16;
	private ImageView poster;
	private LinearLayout linear20;
	private LinearLayout linear21;
	private LinearLayout linear22;
	private TextView rate;
	private TextView textview8;
	private TextView resolution;
	private TextView textview12;
	private TextView size;
	private TextView textview10;
	private LinearLayout linear19;
	private TextView textview6;
	private ScrollView vscroll1;
	private LinearLayout linear26;
	private LinearLayout linear23;
	private LinearLayout linear24;
	private LinearLayout linear25;
	private TextView review;
	private ImageView imageview4;
	private TextView movies_name;
	private LinearLayout linear31;
	private ImageView imageview7;
	private TextView tage;
	private LinearLayout linear30;
	private LinearLayout linear28;
	private ListView listview1;
	private LinearLayout linear29;
	private ImageView imageview5;
	private EditText edittext1;
	
	private DatabaseReference DB = _firebase.getReference("Horror");
	private ChildEventListener _DB_child_listener;
	private DatabaseReference Cartoon = _firebase.getReference("Cartoon");
	private ChildEventListener _Cartoon_child_listener;
	private DatabaseReference Action = _firebase.getReference("Action");
	private ChildEventListener _Action_child_listener;
	private DatabaseReference Korea = _firebase.getReference("Korea");
	private ChildEventListener _Korea_child_listener;
	private DatabaseReference Comment = _firebase.getReference("Comment");
	private ChildEventListener _Comment_child_listener;
	private Intent download = new Intent();
	private DatabaseReference China = _firebase.getReference("China");
	private ChildEventListener _China_child_listener;
	private Intent play = new Intent();
	private DatabaseReference India = _firebase.getReference("India");
	private ChildEventListener _India_child_listener;
	private DatabaseReference War = _firebase.getReference("War");
	private ChildEventListener _War_child_listener;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.home_view);
		initialize(_savedInstanceState);
		com.google.firebase.FirebaseApp.initializeApp(this);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		linear8 = (LinearLayout) findViewById(R.id.linear8);
		linear9 = (LinearLayout) findViewById(R.id.linear9);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		title = (TextView) findViewById(R.id.title);
		textview2 = (TextView) findViewById(R.id.textview2);
		textview3 = (TextView) findViewById(R.id.textview3);
		textview4 = (TextView) findViewById(R.id.textview4);
		page1 = (LinearLayout) findViewById(R.id.page1);
		page2 = (LinearLayout) findViewById(R.id.page2);
		page3 = (LinearLayout) findViewById(R.id.page3);
		linear13 = (LinearLayout) findViewById(R.id.linear13);
		linear14 = (LinearLayout) findViewById(R.id.linear14);
		linear15 = (LinearLayout) findViewById(R.id.linear15);
		linear18 = (LinearLayout) findViewById(R.id.linear18);
		linear17 = (LinearLayout) findViewById(R.id.linear17);
		linear16 = (LinearLayout) findViewById(R.id.linear16);
		poster = (ImageView) findViewById(R.id.poster);
		linear20 = (LinearLayout) findViewById(R.id.linear20);
		linear21 = (LinearLayout) findViewById(R.id.linear21);
		linear22 = (LinearLayout) findViewById(R.id.linear22);
		rate = (TextView) findViewById(R.id.rate);
		textview8 = (TextView) findViewById(R.id.textview8);
		resolution = (TextView) findViewById(R.id.resolution);
		textview12 = (TextView) findViewById(R.id.textview12);
		size = (TextView) findViewById(R.id.size);
		textview10 = (TextView) findViewById(R.id.textview10);
		linear19 = (LinearLayout) findViewById(R.id.linear19);
		textview6 = (TextView) findViewById(R.id.textview6);
		vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
		linear26 = (LinearLayout) findViewById(R.id.linear26);
		linear23 = (LinearLayout) findViewById(R.id.linear23);
		linear24 = (LinearLayout) findViewById(R.id.linear24);
		linear25 = (LinearLayout) findViewById(R.id.linear25);
		review = (TextView) findViewById(R.id.review);
		imageview4 = (ImageView) findViewById(R.id.imageview4);
		movies_name = (TextView) findViewById(R.id.movies_name);
		linear31 = (LinearLayout) findViewById(R.id.linear31);
		imageview7 = (ImageView) findViewById(R.id.imageview7);
		tage = (TextView) findViewById(R.id.tage);
		linear30 = (LinearLayout) findViewById(R.id.linear30);
		linear28 = (LinearLayout) findViewById(R.id.linear28);
		listview1 = (ListView) findViewById(R.id.listview1);
		linear29 = (LinearLayout) findViewById(R.id.linear29);
		imageview5 = (ImageView) findViewById(R.id.imageview5);
		edittext1 = (EditText) findViewById(R.id.edittext1);
		
		textview2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				textview2.setTextColor(0xFFFFFFFF);
				textview3.setTextColor(0xFF455A64);
				textview4.setTextColor(0xFF455A64);
				page1.setVisibility(View.VISIBLE);
				page2.setVisibility(View.GONE);
				page3.setVisibility(View.GONE);
			}
		});
		
		textview3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				textview2.setTextColor(0xFF455A64);
				textview3.setTextColor(0xFFFFFFFF);
				textview4.setTextColor(0xFF455A64);
				page1.setVisibility(View.GONE);
				page2.setVisibility(View.VISIBLE);
				page3.setVisibility(View.GONE);
			}
		});
		
		textview4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				textview2.setTextColor(0xFF455A64);
				textview3.setTextColor(0xFF455A64);
				textview4.setTextColor(0xFFFFFFFF);
				page1.setVisibility(View.GONE);
				page2.setVisibility(View.GONE);
				page3.setVisibility(View.VISIBLE);
			}
		});
		
		linear19.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				download.setAction(Intent.ACTION_VIEW);
				download.setData(Uri.parse(download_link));
				startActivity(download);
			}
		});
		
		imageview7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				play.setClass(getApplicationContext(), StreamActivity.class);
				play.putExtra("stream", stream);
				startActivity(play);
			}
		});
		
		imageview5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				cmt = new HashMap<>();
				cmt.put("post key", getIntent().getStringExtra("k"));
				cmt.put("comment", edittext1.getText().toString());
				Comment.push().updateChildren(cmt);
				cmt.clear();
			}
		});
		
		_DB_child_listener = new ChildEventListener() {
			@Override
			public void onChildAdded(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				if (_childKey.equals(getIntent().getStringExtra("k"))) {
					title.setText(_childValue.get("name").toString());
					movies_name.setText(title.getText().toString());
					rate.setText(_childValue.get("rate").toString());
					size.setText(_childValue.get("size").toString());
					resolution.setText(_childValue.get("resolution").toString());
					Glide.with(getApplicationContext()).load(Uri.parse(_childValue.get("cover").toString())).into(poster);
					Glide.with(getApplicationContext()).load(Uri.parse(_childValue.get("cover").toString())).into(imageview4);
					review.setText(_childValue.get("review").toString());
					download_link = _childValue.get("download").toString();
					stream = _childValue.get("stream").toString();
				}
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
		DB.addChildEventListener(_DB_child_listener);
		
		_Cartoon_child_listener = new ChildEventListener() {
			@Override
			public void onChildAdded(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				if (_childKey.equals(getIntent().getStringExtra("k"))) {
					title.setText(_childValue.get("name").toString());
					movies_name.setText(title.getText().toString());
					rate.setText(_childValue.get("rate").toString());
					size.setText(_childValue.get("size").toString());
					resolution.setText(_childValue.get("resolution").toString());
					Glide.with(getApplicationContext()).load(Uri.parse(_childValue.get("cover").toString())).into(poster);
					Glide.with(getApplicationContext()).load(Uri.parse(_childValue.get("cover").toString())).into(imageview4);
					review.setText(_childValue.get("review").toString());
					download_link = _childValue.get("download").toString();
					stream = _childValue.get("stream").toString();
				}
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
				if (_childKey.equals(getIntent().getStringExtra("k"))) {
					title.setText(_childValue.get("name").toString());
					movies_name.setText(title.getText().toString());
					rate.setText(_childValue.get("rate").toString());
					size.setText(_childValue.get("size").toString());
					resolution.setText(_childValue.get("resolution").toString());
					Glide.with(getApplicationContext()).load(Uri.parse(_childValue.get("cover").toString())).into(poster);
					Glide.with(getApplicationContext()).load(Uri.parse(_childValue.get("cover").toString())).into(imageview4);
					review.setText(_childValue.get("review").toString());
					download_link = _childValue.get("download").toString();
					stream = _childValue.get("stream").toString();
				}
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
				if (_childKey.equals(getIntent().getStringExtra("k"))) {
					title.setText(_childValue.get("name").toString());
					movies_name.setText(title.getText().toString());
					rate.setText(_childValue.get("rate").toString());
					size.setText(_childValue.get("size").toString());
					resolution.setText(_childValue.get("resolution").toString());
					Glide.with(getApplicationContext()).load(Uri.parse(_childValue.get("cover").toString())).into(poster);
					Glide.with(getApplicationContext()).load(Uri.parse(_childValue.get("cover").toString())).into(imageview4);
					review.setText(_childValue.get("review").toString());
					download_link = _childValue.get("download").toString();
					stream = _childValue.get("stream").toString();
				}
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
		
		_Comment_child_listener = new ChildEventListener() {
			@Override
			public void onChildAdded(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				Comment.addListenerForSingleValueEvent(new ValueEventListener() {
					@Override
					public void onDataChange(DataSnapshot _dataSnapshot) {
						comment = new ArrayList<>();
						try {
							GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
							for (DataSnapshot _data : _dataSnapshot.getChildren()) {
								HashMap<String, Object> _map = _data.getValue(_ind);
								comment.add(_map);
							}
						}
						catch (Exception _e) {
							_e.printStackTrace();
						}
						listview1.setAdapter(new Listview1Adapter(comment));
						((BaseAdapter)listview1.getAdapter()).notifyDataSetChanged();
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
		Comment.addChildEventListener(_Comment_child_listener);
		
		_China_child_listener = new ChildEventListener() {
			@Override
			public void onChildAdded(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				if (_childKey.equals(getIntent().getStringExtra("k"))) {
					title.setText(_childValue.get("name").toString());
					movies_name.setText(title.getText().toString());
					rate.setText(_childValue.get("rate").toString());
					size.setText(_childValue.get("size").toString());
					resolution.setText(_childValue.get("resolution").toString());
					Glide.with(getApplicationContext()).load(Uri.parse(_childValue.get("cover").toString())).into(poster);
					Glide.with(getApplicationContext()).load(Uri.parse(_childValue.get("cover").toString())).into(imageview4);
					review.setText(_childValue.get("review").toString());
					download_link = _childValue.get("download").toString();
					stream = _childValue.get("stream").toString();
				}
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
		China.addChildEventListener(_China_child_listener);
		
		_India_child_listener = new ChildEventListener() {
			@Override
			public void onChildAdded(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				if (_childKey.equals(getIntent().getStringExtra("k"))) {
					title.setText(_childValue.get("name").toString());
					movies_name.setText(title.getText().toString());
					rate.setText(_childValue.get("rate").toString());
					size.setText(_childValue.get("size").toString());
					resolution.setText(_childValue.get("resolution").toString());
					Glide.with(getApplicationContext()).load(Uri.parse(_childValue.get("cover").toString())).into(poster);
					Glide.with(getApplicationContext()).load(Uri.parse(_childValue.get("cover").toString())).into(imageview4);
					review.setText(_childValue.get("review").toString());
					download_link = _childValue.get("download").toString();
					stream = _childValue.get("stream").toString();
				}
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
		India.addChildEventListener(_India_child_listener);
		
		_War_child_listener = new ChildEventListener() {
			@Override
			public void onChildAdded(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				if (_childKey.equals(getIntent().getStringExtra("k"))) {
					title.setText(_childValue.get("name").toString());
					movies_name.setText(title.getText().toString());
					rate.setText(_childValue.get("rate").toString());
					size.setText(_childValue.get("size").toString());
					resolution.setText(_childValue.get("resolution").toString());
					Glide.with(getApplicationContext()).load(Uri.parse(_childValue.get("cover").toString())).into(poster);
					Glide.with(getApplicationContext()).load(Uri.parse(_childValue.get("cover").toString())).into(imageview4);
					review.setText(_childValue.get("review").toString());
					download_link = _childValue.get("download").toString();
					stream = _childValue.get("stream").toString();
				}
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
		War.addChildEventListener(_War_child_listener);
	}
	
	private void initializeLogic() {
		_round_image(imageview4);
		_round_image(poster);
		android.graphics.drawable.GradientDrawable HECCIBH = new android.graphics.drawable.GradientDrawable();
		HECCIBH.setColor(Color.parseColor("#FF455A64"));
		HECCIBH.setCornerRadii(new float[] { 0, 0, 20, 20, 20, 20, 0, 0 });
		linear18.setBackground(HECCIBH);
		android.graphics.drawable.GradientDrawable ECEBIGI = new android.graphics.drawable.GradientDrawable();
		ECEBIGI.setColor(Color.parseColor("#FF455A64"));
		ECEBIGI.setCornerRadii(new float[] { 20, 20, 0, 0, 0, 0, 20, 20 });
		linear16.setBackground(ECEBIGI);
		android.graphics.drawable.GradientDrawable HJFEDJE = new android.graphics.drawable.GradientDrawable();
		HJFEDJE.setColor(Color.parseColor("#FF263238"));
		HJFEDJE.setCornerRadius(50);
		HJFEDJE.setStroke(4, Color.parseColor("#FFFFFFFF"));
		linear19.setBackground(HJFEDJE);
		android.graphics.drawable.GradientDrawable DAIHBHC = new android.graphics.drawable.GradientDrawable();
		DAIHBHC.setColor(Color.parseColor("#263238"));
		DAIHBHC.setCornerRadius(20);
		linear23.setBackground(DAIHBHC);
		if(Build.VERSION.SDK_INT >= 21) { linear23.setElevation(20f); }
		android.graphics.drawable.GradientDrawable IGCDHID = new android.graphics.drawable.GradientDrawable();
		IGCDHID.setColor(Color.parseColor("#FFFFC107"));
		IGCDHID.setCornerRadius(50);
		tage.setBackground(IGCDHID);
		android.graphics.drawable.GradientDrawable EGIEGIH = new android.graphics.drawable.GradientDrawable();
		EGIEGIH.setColor(Color.parseColor("#FFB0BEC5"));
		EGIEGIH.setCornerRadius(50);
		linear29.setBackground(EGIEGIH);
		title.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/mmm.ttf"), 0);
		textview6.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/mmm.ttf"), 0);
		review.setText("(Unicode)\n\nIT ပထမရုပ်ရှင်မှာ ပန်နီဝိုက်စ် ကို Loser club က အနိုင်ယူခဲ့ပါပြီ။ဒါပေမယ့် အဲဒီအရာက တကယ်သေသွားတာ မဟုတ်ခဲ့ပါဘူး။ဒီလိုသာ မသေခဲ့ရင် ၂၇နှစ်အကြာမှာ ပြန်ပေါ်လာမှာကို တွေးမိတဲ့ဘေလ်တို့အဖွဲ့ဟာ ၂၇ နှစ်ကြာလို့ အဲဒါ ပြန်ပေါ်လာရင်ပြန်စုပေါင်းပြီး တိုက်ခိုက်ဖို့ သစ္စာပြုခဲ့ကြပါတယ်။\n၂၇ နှစ် အကြာကာလရဲ့ ဇာတ်လမ်းဖြစ်တာကြောင့်ဒီဇာတ်ကားရဲ့ ဇာတ်လိုက်တွေကအသက်၃၀ ကျော်လူကြီးတွေ ဖြစ်နေပါလိမ့်မယ်။ဒါပေမယ့် သူတိုကိုယ်စားပြုတဲ့ ကလေးကာရိုက်တာတွေကိုအကောင်းဆုံးပုံဖော်ပြထားတာကြောင်း အရမ်းကိုကြည့်ကောင်းနေပါလိမ့်မယ်။ပန်နီဝိုက်စ်ကလည်း ကလေးတွေကို ခြောက်တုန်းကထက်ပိုကြမ်းလာပါလိမ့်မယ်။ဒီတော့ အားရပါးရကြောက်ဖို့ ဘာသာပြန်ပေးလိုက်ပါတယ်။ဘာသာပြန်သူကတော့ Littleneo ပဲဖြစ်ပါတယ်….\n\n\n(Zawgyi)IT\n\n\nပထမ႐ုပ္ရွင္မွာ ပန္နီဝိုက္စ္ ကို Loser club က အႏိုင္ယူခဲ့ပါၿပီ။ဒါေပမယ့္ အဲဒီအရာက တကယ္ေသသြားတာ မဟုတ္ခဲ့ပါဘူး။ဒီလိုသာ မေသခဲ့ရင္ ၂၇ႏွစ္အၾကာမွာ ျပန္ေပၚလာမွာကို ေတြးမိတဲ့ေဘလ္တို႔အဖြဲ႕ဟာ ၂၇ ႏွစ္ၾကာလို႔အဲဒါ ျပန္ေပၚလာရင္ျပန္စုေပါင္းၿပီး တိုက္ခိုက္ဖို႔ သစၥာျပဳခဲ့ၾကပါတယ္။၂၇ ႏွစ္ အၾကာကာလရဲ႕ ဇာတ္လမ္းျဖစ္တာေၾကာင့္ဒီဇာတ္ကားရဲ႕ ဇာတ္လိုက္ေတြကအသက္၃၀ ေက်ာ္လူႀကီးေတြ ျဖစ္ေနပါလိမ့္မယ္။ဒါေပမယ့္ သူတိုကိုယ္စားျပဳတဲ့ ကေလးကာ႐ိုက္တာေတြကိုအေကာင္းဆုံးပုံေဖာ္ျပထားတာေၾကာင္း အရမ္းကိုၾကည့္ေကာင္းေနပါလိမ့္မယ္။ပန္နီဝိုက္စ္ကလည္း ကေလးေတြကို ေျခာက္တုန္းကထက္ပိုၾကမ္းလာပါလိမ့္မယ္။ဒီေတာ့ အားရပါးရေၾကာက္ဖို႔ ဘာသာျပန္ေပးလိုက္ပါတယ္။ဘာသာျပန္သူကေတာ့ Littleneo ပဲျဖစ္ပါတယ္…. File \n\n\n\n\n\n\nSize : (2.70 GB),(1.30 GB) And (650 MB)\nQuality : Blu-Ray (1080p 5.1,720p,480p)\nRunning Time : 2hr 49min\nFormat : Mp4\nGenre : Drama, Fantasy, Horror\nSubtitle : Myanmar Subtitle (Hard Sub)\nSource : 1080p.BluRay.x264.DTS-MT\nTranslated by Littleneo\nEncoded by Thanhtike Zaw\n\n");
		tage.setText(getIntent().getStringExtra("tag"));
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	public void _round_image (final ImageView _image) {
		android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable ();
		gd.setColor(android.R.color.transparent);
		gd.setCornerRadius(20);
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
				_view = _inflater.inflate(R.layout.comment, null);
			}
			
			final LinearLayout linear3 = (LinearLayout) _view.findViewById(R.id.linear3);
			final LinearLayout linear1 = (LinearLayout) _view.findViewById(R.id.linear1);
			final LinearLayout linear2 = (LinearLayout) _view.findViewById(R.id.linear2);
			final ImageView imageview1 = (ImageView) _view.findViewById(R.id.imageview1);
			final TextView textview1 = (TextView) _view.findViewById(R.id.textview1);
			
			if (comment.get((int)_position).get("post key").toString().equals(getIntent().getStringExtra("k"))) {
				linear3.setVisibility(View.VISIBLE);
				textview1.setText(comment.get((int)_position).get("comment").toString());
			}
			else {
				linear3.setVisibility(View.GONE);
			}
			
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