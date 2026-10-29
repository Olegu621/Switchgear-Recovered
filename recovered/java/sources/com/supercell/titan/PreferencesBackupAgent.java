            package com.supercell.titan;

            import android.app.backup.BackupAgentHelper;
            import android.app.backup.SharedPreferencesBackupHelper;
            import io.sentry.android.core.AbstractC1245n0;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class PreferencesBackupAgent extends BackupAgentHelper {
                @Override // android.app.backup.BackupAgent
                public void onCreate() {
/* 5 */             AbstractC1245n0.m4876d("PreferencesBackupAgent", "PreferencesBackupAgent.onCreate");
                    try {
/* 23 */                addHelper("app_prefs", new SharedPreferencesBackupHelper(this, "storage", "storage_new"));
                    } catch (Exception e) {
/* 30 */                AbstractC1245n0.m4877e("PreferencesBackupAgent", HttpUrl.FRAGMENT_ENCODE_SET, e);
                    }
                }
            }
