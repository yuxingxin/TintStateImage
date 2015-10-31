# TintStateImage
ImageView that changes it's image color depending on the state (pressed, selected...)

## ScreenShots
![image](/screenshots/demo.png)

## Usage
```
<com.yuxingxin.library.TintStateImage
    android:id="@+id/selected_state"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    app:colorStateList="@drawable/bg_radio_btn_style"
    android:src="@mipmap/ic_home_black_24dp"
    />
```
Then

```
TintStateImage selectedImage = (TintStateImage)findViewById(R.id.selected_state);
selectedImage.setSelected(true);
```

