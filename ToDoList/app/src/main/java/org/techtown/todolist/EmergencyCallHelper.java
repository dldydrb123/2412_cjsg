package org.techtown.todolist;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.widget.Toast;

public class EmergencyCallHelper {
    public static void makeEmergencyCall(Context context, String phoneNumber) {
        //Intent.ACTION_CALL 안드로이드에서 전화를 걸기 위한 표준 액션
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:" + phoneNumber));

        try {
            context.startActivity(intent);
        } catch (SecurityException e) {
            Toast.makeText(context, "전화거는 권한이 필요합니다.", Toast.LENGTH_SHORT).show();
        }

    }
    /*  MainActivity 버튼 필요
    *   Button emergencyButton = findViewById(R.id.emergency_button);
        emergencyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EmergencyCallHelper.makeEmergencyCall(MainActivity.this, "911");
            }
        });
    * */
}
