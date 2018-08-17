# NumberScrollTextView

具体代码如下：

 NumberScrollTextView numscrollview = findViewById(R.id.numscrollview);

 numscrollview.setCharacterLists(NumScrollUtils.provideNumberList());//可以有小数点，"/"字符
 numscrollview.setAnimationInterpolator(new DecelerateInterpolator());
 numscrollview.setTypeface(Typeface.MONOSPACE);
 numscrollview.setText(Double.toString(123.123456));//显示
 
布局如下：

    <com.yitaiyun.numscrolltextview.NumScrollView
        android:id="@+id/numscrollview"
        android:layout_width="match_parent"
        android:layout_height="40dp"
        android:gravity="center"
        android:text="Hello World!"
        android:textSize="22sp"
        app:numScroll_animationDuration="1000"
        app:numScroll_defaultCharacterList="number" />
