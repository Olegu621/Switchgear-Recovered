            package androidx.profileinstaller;

            import android.content.BroadcastReceiver;
            import android.content.Context;
            import android.content.Intent;
            import android.content.pm.PackageManager;
            import android.os.Bundle;
            import android.os.Process;
            import java.io.File;
            import p000.er0;
            import p000.he3;
            import p000.qd1;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class ProfileInstallReceiver extends BroadcastReceiver {
                @Override // android.content.BroadcastReceiver
                public final void onReceive(Context context, Intent intent) {
                    Bundle extras;
/* 1 */             if (intent == null) {
/* 216 */               return;
                    }
/* 5 */             String action = intent.getAction();
/* 17 */            if ("androidx.profileinstaller.action.INSTALL_PROFILE".equals(action)) {
/* 30 */                he3.m4202y(context, new qd1(), new er0(this, 10), true);
/* 33 */                return;
                    }
/* 41 */            if ("androidx.profileinstaller.action.SKIP_FILE".equals(action)) {
/* 43 */                Bundle extras2 = intent.getExtras();
/* 47 */                if (extras2 != null) {
/* 51 */                    String string = extras2.getString("EXTRA_SKIP_FILE_OPERATION");
/* 61 */                    if (!"WRITE_SKIP_FILE".equals(string)) {
/* 109 */                       if ("DELETE_SKIP_FILE".equals(string)) {
/* 122 */                           new File(context.getFilesDir(), "profileinstaller_profileWrittenFor_lastUpdateTime.dat").delete();
/* 127 */                           setResultCode(11);
/* 130 */                           return;
                                }
/* 216 */                       return;
                            }
/* 65 */                    er0 er0Var = new er0(this, 10);
                            try {
/* 89 */                        he3.m4189j(context.getPackageManager().getPackageInfo(context.getApplicationContext().getPackageName(), 0), context.getFilesDir());
/* 92 */                        er0Var.mo1180f(10, null);
/* 216 */                       return;
                            } catch (PackageManager.NameNotFoundException e) {
/* 99 */                        er0Var.mo1180f(7, e);
/* 216 */                       return;
                            }
                        }
/* 216 */               return;
                    }
/* 137 */           if ("androidx.profileinstaller.action.SAVE_PROFILE".equals(action)) {
/* 143 */               Process.sendSignal(Process.myPid(), 10);
/* 148 */               setResultCode(12);
/* 151 */               return;
                    }
/* 158 */           if (!"androidx.profileinstaller.action.BENCHMARK_OPERATION".equals(action) || (extras = intent.getExtras()) == null) {
/* 216 */               return;
                    }
/* 168 */           String string2 = extras.getString("EXTRA_BENCHMARK_OPERATION");
/* 174 */           er0 er0Var2 = new er0(this, 10);
/* 183 */           if (!"DROP_SHADER_CACHE".equals(string2)) {
/* 213 */               er0Var2.mo1180f(16, null);
                    } else if (w11.m9433i(context.createDeviceProtectedStorageContext().getCodeCacheDir())) {
/* 201 */               er0Var2.mo1180f(14, null);
                    } else {
/* 207 */               er0Var2.mo1180f(15, null);
                    }
                }
            }
