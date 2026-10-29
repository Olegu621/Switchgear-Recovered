            package p000;

            import android.content.Context;
            import android.content.SharedPreferences;
            import android.util.Log;
            import io.sentry.android.core.AbstractC1245n0;
            import java.io.File;
            import java.io.IOException;
            import okhttp3.HttpUrl;
            import org.json.JSONArray;
            import org.json.JSONObject;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 81 */    public final class xi1 {

                /* JADX INFO: renamed from: a */
                public final SharedPreferences f19168a;

                public xi1(Context context) {
                    boolean zIsEmpty;
/* 7 */             SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.appid", 0);
/* 11 */            this.f19168a = sharedPreferences;
/* 21 */            File file = new File(v00.getNoBackupFilesDir(context), "com.google.android.gms.appid-no-backup");
/* 28 */            if (file.exists()) {
/* 82 */                return;
                    }
                    try {
/* 35 */                if (file.createNewFile()) {
                            synchronized (this) {
/* 42 */                        zIsEmpty = sharedPreferences.getAll().isEmpty();
                            }
/* 47 */                    if (zIsEmpty) {
/* 82 */                        return;
                            }
                            synchronized (this) {
/* 58 */                        sharedPreferences.edit().clear().commit();
                            }
                        }
                    } catch (IOException e) {
/* 77 */                if (Log.isLoggable("FirebaseMessaging", 3)) {
/* 79 */                    e.getMessage();
                        }
                    }
                }

                /* JADX INFO: renamed from: a */
                public void m9969a(String str, Exception exc) {
                    String str2;
/* 3 */             SharedPreferences sharedPreferences = this.f19168a;
/* 7 */             AbstractC1245n0.m4877e("Helpshift_Migrator", str, exc);
/* 12 */            if (exc == null) {
/* 14 */                str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                    } else {
                        try {
/* 40 */                    str2 = exc.getMessage() + " \n " + Log.getStackTraceString(exc);
                        } catch (Exception e) {
/* 114 */                   AbstractC1245n0.m4877e("Helpshift_mgrtLog", "Error setting error logs in prefs", e);
/* 117 */                   return;
                        }
                    }
/* 44 */            String string = sharedPreferences.getString("error_logs", HttpUrl.FRAGMENT_ENCODE_SET);
/* 62 */            JSONArray jSONArray = b40.m1232p(string) ? new JSONArray() : new JSONArray(string);
/* 68 */            JSONObject jSONObject = new JSONObject();
/* 77 */            jSONObject.put("timestamp", System.currentTimeMillis());
/* 82 */            jSONObject.put("message", str);
/* 87 */            jSONObject.put("error", str2);
/* 90 */            jSONArray.put(jSONObject);
/* 105 */           sharedPreferences.edit().putString("error_logs", jSONArray.toString()).commit();
                }

/* 82 */        public xi1(SharedPreferences sharedPreferences) {
/* 84 */            this.f19168a = sharedPreferences;
                }
            }
