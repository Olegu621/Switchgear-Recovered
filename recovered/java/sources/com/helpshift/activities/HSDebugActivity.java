            package com.helpshift.activities;

            import android.content.Intent;
            import android.content.SharedPreferences;
            import android.os.Bundle;
            import android.widget.TextView;
            import androidx.appcompat.app.AppCompatActivity;
            import com.helpshift.R$id;
            import com.helpshift.R$layout;
            import com.pichillilorenzo.flutter_inappwebview_android.chrome_custom_tabs.ActionBroadcastReceiver;
            import com.pichillilorenzo.flutter_inappwebview_android.credential_database.URLProtectionSpaceContract;
            import io.sentry.android.core.AbstractC1245n0;
            import io.sentry.instrumentation.file.C1498e;
            import io.sentry.instrumentation.file.C1501h;
            import java.io.BufferedReader;
            import java.io.File;
            import java.util.Arrays;
            import okhttp3.HttpUrl;
            import p000.aa1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class HSDebugActivity extends AppCompatActivity {
                @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
                public final void onCreate(Bundle bundle) {
/* 1 */             super.onCreate(bundle);
/* 6 */             setContentView(R$layout.hs__debug_layout);
                }

                @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
                public final void onResume() {
/* 5 */             String string = HttpUrl.FRAGMENT_ENCODE_SET;
/* 7 */             super.onResume();
/* 16 */            TextView textView = (TextView) findViewById(R$id.debug_log_message);
/* 20 */            textView.setText("Preparing logs...");
                    try {
/* 26 */                SharedPreferences sharedPreferences = getSharedPreferences("__hs_lite_sdk_store", 0);
/* 58 */                String str = sharedPreferences.getString("domain", HttpUrl.FRAGMENT_ENCODE_SET) + "." + sharedPreferences.getString(URLProtectionSpaceContract.FeedEntry.COLUMN_NAME_HOST, HttpUrl.FRAGMENT_ENCODE_SET);
                        try {
/* 74 */                    string = getApplicationInfo().loadLabel(getPackageManager()).toString();
                        } catch (Exception unused) {
                        }
/* 106 */               File file = new File(getFilesDir() + File.separator + aa1.f137f);
/* 111 */               StringBuilder sb = new StringBuilder();
/* 114 */               File[] fileArrListFiles = file.listFiles();
/* 122 */               if (file.exists() && fileArrListFiles != null && fileArrListFiles.length > 0) {
/* 129 */                   Arrays.sort(fileArrListFiles);
/* 133 */                   for (File file2 : fileArrListFiles) {
/* 139 */                       sb.append("Log File: ");
/* 146 */                       sb.append(file2.getName());
/* 149 */                       sb.append("\n \n");
/* 164 */                       BufferedReader bufferedReader = new BufferedReader(new C1501h(new C1498e(file2)));
                                while (true) {
/* 167 */                           String line = bufferedReader.readLine();
/* 171 */                           if (line != null) {
/* 173 */                               sb.append(line);
/* 178 */                               sb.append("\n");
                                    }
                                }
/* 184 */                       sb.append("\n \n");
                            }
                        }
/* 194 */               Intent intent = new Intent("android.intent.action.SEND");
/* 199 */               intent.setType("text/plain");
/* 210 */               intent.putExtra("android.intent.extra.EMAIL", new String[]{"bugs@helpshift.com"});
/* 219 */               intent.putExtra("android.intent.extra.TEXT", sb.toString());
/* 252 */               intent.putExtra(ActionBroadcastReceiver.KEY_URL_TITLE, str + " / " + string + " / " + getPackageName());
/* 261 */               startActivity(Intent.createChooser(intent, "Send email..."));
/* 264 */               finish();
                    } catch (Exception e) {
/* 272 */               AbstractC1245n0.m4877e("Helpshift_DebugAct", "Error when sharing/reading log", e);
/* 293 */               textView.setText("Error preparing logs: " + e.getMessage());
                    }
                }
            }
