package test.example.com.listviewtest;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends Activity {

   private List<Fruit>fruitList=new ArrayList<Fruit>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        ArrayAdapter<String> adapter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,data);
       initFruits();//初始化水果数据
        FruitAdapter adapter=new FruitAdapter(MainActivity.this,R.layout.fruit_item,fruitList);
        ListView listView = (ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Fruit fruit=fruitList.get(position);
                Toast.makeText(MainActivity.this,fruit.getName(),Toast.LENGTH_SHORT).show();
            }
        });
    }
    private void initFruits(){
        Fruit apple=new Fruit("apple",R.drawable.apple_pic);
        fruitList.add(apple);

        Fruit banana=new Fruit("banana",R.drawable.banana_pic);
        fruitList.add(banana);
        Fruit orange=new Fruit("orange",R.drawable.orange_pic);
        fruitList.add(apple);
        Fruit watermelon=new Fruit("watermelon",R.drawable.watermelon_pic);
        fruitList.add(watermelon);
        Fruit pear=new Fruit("pear",R.drawable.pear_pic);
        fruitList.add(pear); Fruit grape=new Fruit("grape",R.drawable.grape_pic);
        fruitList.add(grape);
        Fruit pineapple=new Fruit("pineapple",R.drawable.pineapple_pic);
        fruitList.add(pineapple);
        Fruit strawberry=new Fruit("strawberry",R.drawable.strawberry_pic);
        fruitList.add(strawberry);
        Fruit cherry=new Fruit("cherry",R.drawable.cherry_pic);
        fruitList.add(cherry);
        Fruit mango=new Fruit("mango",R.drawable.mango_pic);
        fruitList.add(mango);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
