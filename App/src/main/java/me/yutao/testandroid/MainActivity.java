package me.yutao.testandroid;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Process;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;
import me.yutao.testandroid.R;

public class MainActivity extends BaseActivity implements OnItemClickListener {

	private ListView listView;
	private Adapter adapter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		listView = (ListView) findViewById(R.id.list);
		listView.setOnItemClickListener(this);
		adapter = new Adapter();
		listView.setAdapter(adapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	class Adapter extends BaseAdapter {

		@Override
		public int getCount() {
			return items.length;
		}

		@Override
		public TestItem getItem(int arg0) {
			return items[arg0];
		}

		@Override
		public long getItemId(int arg0) {
			return arg0;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			View v = convertView;
			if (v == null) {
				v = LayoutInflater.from(parent.getContext()).inflate(
						android.R.layout.simple_list_item_1, parent, false);

			}
			((TextView) v.findViewById(android.R.id.text1))
					.setText(getItem(position).name);
			return v;
		}

	}

	private TestItem[] items = new TestItem[] { 
			new TestItem("Test Wifi", "yutaot://testwifi"),
			new TestItem("Test Event", "yutaot://testevent"),
            new TestItem("Test Event Pass Through", "yutaot://testeventpassthrough"),
            new TestItem("Test Event Vertical Horizontal", "yutaot://eventtestverticalhorizontal"),
            new TestItem("Test TouchDelegate", "yutaot://testtouchdelegateactivity"),
            new TestItem("Drag and Drop", "yutaot://draganddrop"),

			};

	class TestItem {
		TestItem(String n, String u) {
			this.name = n;
			this.url = u;
		}

		String name;
		String url;
	}

	@Override
	public void onItemClick(AdapterView<?> parent, View view, int position,
			long id) {
		final Intent intent = new Intent(Intent.ACTION_VIEW);
		intent.setData(Uri.parse(adapter.getItem(position).url));
		startActivity(intent);
	}
	
	
	
	@Override
	public void finish() {
		// TODO Auto-generated method stub
		super.finish();
		handler.sendEmptyMessageDelayed(0, 400);
	}

	static Handler handler = new Handler() {

		@Override
		public void handleMessage(Message msg) {
			switch (msg.what) {
			case 0:
//				Process.killProcess(Process.myPid());
				System.exit(0);
				break;

			default:
				break;
			}
		}
	};

}
