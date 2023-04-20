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
import java.util.ArrayList;
import java.util.HashMap;
import android.widget.LinearLayout;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
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
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class SeriesViewActivity extends  AppCompatActivity  { 
	
	private FirebaseDatabase _firebase = FirebaseDatabase.getInstance();
	
	private String trailer = "";
	
	private ArrayList<HashMap<String, Object>> map = new ArrayList<>();
	
	private LinearLayout linear1;
	private LinearLayout linear5;
	private LinearLayout linear2;
	private ImageView poster;
	private LinearLayout linear25;
	private LinearLayout linear28;
	private LinearLayout linear30;
	private LinearLayout linear31;
	private LinearLayout review;
	private LinearLayout ep;
	private ScrollView vscroll1;
	private LinearLayout linear36;
	private TextView vd_review;
	private LinearLayout linear37;
	private LinearLayout linear38;
	private LinearLayout linear39;
	private TextView textview14;
	private TextView textview15;
	private ListView listview4;
	private LinearLayout linear34;
	private LinearLayout linear35;
	private TextView textview11;
	private TextView textview12;
	private LinearLayout linear6;
	private LinearLayout linear7;
	private ImageView cover;
	private LinearLayout linear15;
	private LinearLayout play;
	private TextView name;
	private TextView tag;
	private ImageView imageview4;
	
	private DatabaseReference Episode = _firebase.getReference("Episode");
	private ChildEventListener _Episode_child_listener;
	private DatabaseReference Series = _firebase.getReference("Series");
	private ChildEventListener _Series_child_listener;
	private Intent streamplay = new Intent();
	private Intent strailer = new Intent();
	private Intent vdplay = new Intent();
	private Intent down = new Intent();
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.series_view);
		initialize(_savedInstanceState);
		com.google.firebase.FirebaseApp.initializeApp(this);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		poster = (ImageView) findViewById(R.id.poster);
		linear25 = (LinearLayout) findViewById(R.id.linear25);
		linear28 = (LinearLayout) findViewById(R.id.linear28);
		linear30 = (LinearLayout) findViewById(R.id.linear30);
		linear31 = (LinearLayout) findViewById(R.id.linear31);
		review = (LinearLayout) findViewById(R.id.review);
		ep = (LinearLayout) findViewById(R.id.ep);
		vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
		linear36 = (LinearLayout) findViewById(R.id.linear36);
		vd_review = (TextView) findViewById(R.id.vd_review);
		linear37 = (LinearLayout) findViewById(R.id.linear37);
		linear38 = (LinearLayout) findViewById(R.id.linear38);
		linear39 = (LinearLayout) findViewById(R.id.linear39);
		textview14 = (TextView) findViewById(R.id.textview14);
		textview15 = (TextView) findViewById(R.id.textview15);
		listview4 = (ListView) findViewById(R.id.listview4);
		linear34 = (LinearLayout) findViewById(R.id.linear34);
		linear35 = (LinearLayout) findViewById(R.id.linear35);
		textview11 = (TextView) findViewById(R.id.textview11);
		textview12 = (TextView) findViewById(R.id.textview12);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		linear7 = (LinearLayout) findViewById(R.id.linear7);
		cover = (ImageView) findViewById(R.id.cover);
		linear15 = (LinearLayout) findViewById(R.id.linear15);
		play = (LinearLayout) findViewById(R.id.play);
		name = (TextView) findViewById(R.id.name);
		tag = (TextView) findViewById(R.id.tag);
		imageview4 = (ImageView) findViewById(R.id.imageview4);
		
		linear34.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				textview11.setTextColor(0xFFFFFFFF);
				textview12.setTextColor(0xFF455A64);
				review.setVisibility(View.VISIBLE);
				ep.setVisibility(View.GONE);
			}
		});
		
		linear35.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				textview11.setTextColor(0xFF455A64);
				textview12.setTextColor(0xFFFFFFFF);
				review.setVisibility(View.GONE);
				ep.setVisibility(View.VISIBLE);
			}
		});
		
		play.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				strailer.setClass(getApplicationContext(), StreamActivity.class);
				strailer.putExtra("stream", trailer);
				startActivity(strailer);
			}
		});
		
		_Episode_child_listener = new ChildEventListener() {
			@Override
			public void onChildAdded(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				Episode.addListenerForSingleValueEvent(new ValueEventListener() {
					@Override
					public void onDataChange(DataSnapshot _dataSnapshot) {
						map = new ArrayList<>();
						try {
							GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
							for (DataSnapshot _data : _dataSnapshot.getChildren()) {
								HashMap<String, Object> _map = _data.getValue(_ind);
								map.add(_map);
							}
						}
						catch (Exception _e) {
							_e.printStackTrace();
						}
						listview4.setAdapter(new Listview4Adapter(map));
						((BaseAdapter)listview4.getAdapter()).notifyDataSetChanged();
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
		Episode.addChildEventListener(_Episode_child_listener);
		
		_Series_child_listener = new ChildEventListener() {
			@Override
			public void onChildAdded(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				if (_childKey.equals(getIntent().getStringExtra("k"))) {
					name.setText(_childValue.get("name").toString());
					vd_review.setText(_childValue.get("review").toString());
					Glide.with(getApplicationContext()).load(Uri.parse(_childValue.get("poster").toString())).into(poster);
					Glide.with(getApplicationContext()).load(Uri.parse(_childValue.get("cover").toString())).into(cover);
					tag.setText(_childValue.get("tag").toString());
					trailer = _childValue.get("trailer").toString();
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
		Series.addChildEventListener(_Series_child_listener);
	}
	
	private void initializeLogic() {
		_round_image(cover);
		android.graphics.drawable.GradientDrawable HDGCJAG = new android.graphics.drawable.GradientDrawable();
		HDGCJAG.setColor(Color.parseColor("#FF263238"));
		HDGCJAG.setCornerRadius(25);
		linear6.setBackground(HDGCJAG);
		android.graphics.drawable.GradientDrawable EIFGHIJ = new android.graphics.drawable.GradientDrawable();
		EIFGHIJ.setColor(Color.parseColor("#FFFFC107"));
		EIFGHIJ.setCornerRadius(360);
		play.setBackground(EIFGHIJ);
		vd_review.setText("Saw 1 To 8\n\n\nလို့ပြောလိုက်ရင်သူ့ရဲ့ရက်ရက်စက်စက်သွေးထွက်သံယိုအခန်းတွေကိုပြေးမြင်မိကြမှာပါSaw franchise ရဲ့ ၇ကားမြောက်ဖြစ်တဲ့ဒီကားဟာလဲ saw ဖန်တွေအကြိုက်တွေ့မယ့်ကားတစ်ကားပဲဖြစ်ပါတယ်ရှေ့ကားတွေနဲ့ပြန်ချိတ်ထားတာတွေကလဲ သေသပ်သလို ဇာတ်ကောင်တွေလဲအများကြီးပါဝင်ထားပါတယ်\nပြီးတော့ saw ကားတွေရဲ့ထုံးစံအတိုင်းတစ်ကားနဲ့တစ်ကားမှာအသုံးပြုတဲ့လက်နက်တွေ စက်ပစ္စည်းတွေမတူတာကြောင့်\nစိတ်ဝင်စားစရာကောင်းပါတယ်Plot twist တချို့ကိုလဲချပြသွားပါတယ်သွေးထွက်သံယိုအခန်းတွေအများအပြားပါဝင်ပြီးတကယ်ကို ကွက်ကွက်ကွင်းကွင်းရိုက်ပြထားတာကြောင့် ကြောက်တတ်သူများနဲ့နှလုံးရောဂါအခံရှိသူများမကြည့်သင့်ပါဘူး \n\n\n\n\nFile Size : ( 842 MB , 248 MB)\nQuality : BluRay 720p\nRunning Time : 1 hr 30 min\nFormat : Mp4 \nGenre :  Action , Adventure , Crime\nSubtitle : Myanmar Subtitle (Hard Sub) \nTranslated by Thae Oo San\nEncoded by Moe Myint Lwin\n\n");
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
	
	
	public class Listview4Adapter extends BaseAdapter {
		ArrayList<HashMap<String, Object>> _data;
		public Listview4Adapter(ArrayList<HashMap<String, Object>> _arr) {
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
				_view = _inflater.inflate(R.layout.series_views, null);
			}
			
			final LinearLayout linear8 = (LinearLayout) _view.findViewById(R.id.linear8);
			final LinearLayout linear10 = (LinearLayout) _view.findViewById(R.id.linear10);
			final LinearLayout linear11 = (LinearLayout) _view.findViewById(R.id.linear11);
			final LinearLayout playy = (LinearLayout) _view.findViewById(R.id.playy);
			final LinearLayout download = (LinearLayout) _view.findViewById(R.id.download);
			final TextView textview3 = (TextView) _view.findViewById(R.id.textview3);
			final ImageView play = (ImageView) _view.findViewById(R.id.play);
			final TextView textview4 = (TextView) _view.findViewById(R.id.textview4);
			
			android.graphics.drawable.GradientDrawable BJBBFCD = new android.graphics.drawable.GradientDrawable();
			BJBBFCD.setColor(Color.parseColor("#FFFFC107"));
			BJBBFCD.setCornerRadii(new float[] { 0, 0, 20, 20, 20, 20, 0, 0 });
			linear10.setBackground(BJBBFCD);
			android.graphics.drawable.GradientDrawable HBGADGF = new android.graphics.drawable.GradientDrawable();
			HBGADGF.setColor(Color.parseColor("#FFFFC107"));
			HBGADGF.setCornerRadius(90);
			download.setBackground(HBGADGF);
			android.graphics.drawable.GradientDrawable JBIABBC = new android.graphics.drawable.GradientDrawable();
			JBIABBC.setColor(Color.parseColor("#FFFFC107"));
			JBIABBC.setCornerRadius(360);
			play.setBackground(JBIABBC);
			play.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View _view) {
					vdplay.setClass(getApplicationContext(), StreamActivity.class);
					vdplay.putExtra("stream", map.get((int)_position).get("stream").toString());
					startActivity(vdplay);
				}
			});
			download.setOnClickListener(new View.OnClickListener() {
				@Override
				public void onClick(View _view) {
					down.setAction(Intent.ACTION_VIEW);
					down.setData(Uri.parse(map.get((int)_position).get("download").toString()));
					startActivity(down);
				}
			});
			if (map.get((int)_position).get("post key").toString().equals(getIntent().getStringExtra("k"))) {
				linear8.setVisibility(View.VISIBLE);
				textview3.setText(map.get((int)_position).get("episode").toString());
			}
			else {
				linear8.setVisibility(View.GONE);
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