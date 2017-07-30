package com.example.sakshi.inboxstylenotification_acad;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.app.NotificationCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button)findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //NotificationCompat for inbox style notifications
              NotificationCompat.InboxStyle inboxStyle = new NotificationCompat.InboxStyle();
                //adding Content title which is shown when the notification is expanded
              inboxStyle.setBigContentTitle("Event Details: ");
                //adding content to the notification
                inboxStyle.addLine("Hi! how are you?");
                inboxStyle.addLine("I am fine!");
                inboxStyle.addLine("What about you?");
                inboxStyle.addLine("Is everything Okay?");
                inboxStyle.addLine("Yeah. Everything is fine!");
                //adding  summary
                inboxStyle.setSummaryText("+2 more");

                //NotificationCompat Builder for setting icon, content title and content text when the notification is not expanded
                NotificationCompat.Builder builder = new NotificationCompat.Builder(MainActivity.this).setSmallIcon(R.mipmap.ic_launcher_round).setContentTitle("Inbox Style Notification").setContentText("you have new  messages").setStyle(inboxStyle);
                //setting inbox style to the builder
                builder.setStyle(inboxStyle);
                //notification manager for managing notification
                NotificationManager mNotificationManager1 = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
                // mId allows you to update the notification later on.
                mNotificationManager1.notify(100, builder.build());
            }
        });
    }
}
