# Custom Crayon Button

### Introduction

A simple Button that extends appCompatButton that's meant to look like a crayon to add a more playful touch to your apps.

![alt text](https://github.com/NikShuvalov/Custom-Crayon-Buttons/blob/master/crayon_views_screen.png "Example Screenshot")

### How To Include

#### Including the library
You can include the dependency using JitPack, directions provided on the page:

https://jitpack.io/#NikShuvalov/Custom-Crayon-Buttons/v0.1

--or--

If you already have the JitPack repository included in your root gradle file, just add the following line to your dependencies:

    compile 'com.github.NikShuvalov:Custom-Crayon-Buttons:v0.1'

#### Using the buttons

Treat the Custom Crayon Button like a typical button; just add the button in your xml layout. 

    <shuvalov.nikita.customcrayonviews.CustomCrayonButton
        android:layout_width="match_parent"  
        android:layout_height="wrap_content"  
        android:textColor="#FFF"
        android:text="Press me"
        android:textSize="16sp"
        android:background="@drawable/crayon_blue_selector"
        android:layout_margin="8dp"
        app:autoPadding="false"/>
        
### Options

#### Backgrounds

There are 4 background colors included in this library:

    "@drawable/crayon_blue_selector"
    "@drawable/crayon_yellow_selector"
    "@drawable/crayon_red_selector"
    "@drawable/crayon_green_selector"
    
##### Adding your own background colors

If you want to add other background colors make a drawable xml and replace the solid color value.

    <?xml version="1.0" encoding="utf-8"?>
    <shape xmlns:android="http://schemas.android.com/apk/res/android">
        <stroke
          android:color="#000"
          android:width="2dp"/>
        <corners
            android:radius="2dp"/>
        <solid
          android:color="colorOfYourChoosing"/>
    </shape>
    
I recommend making two files, one for how your crayon looks when unpressed and one how it looks like when it's pressed and using a selector such as the one below:

    <?xml version="1.0" encoding="utf-8"?>
    <selector xmlns:android="http://schemas.android.com/apk/res/android">
        <item
            android:drawable="@drawable/your_crayon_unpressed_xml" android:state_pressed="false"/>
        <item
            android:drawable="@drawable/your_crayon_pressed_xml" android:state_pressed="true"/>
    </selector>
    
Then just set this selector as the background for the button.

#### Auto-Padding

Auto-padding provides left and right padding to keep the text contained within the inner vertical lines of the crayon button.
Auto-padding defaults to false if left empty. 

![alt text](https://github.com/NikShuvalov/Custom-Crayon-Buttons/blob/master/auto_padding_example.png "Auto-Padding example")

