            package com.google.android.recaptcha.internal;

            import android.content.Context;
            import android.content.SharedPreferences;
            import java.util.Map;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzci {
                private final SharedPreferences zza;

                public zzci(Context context) {
/* 11 */            this.zza = context.getSharedPreferences("_GRECAPTCHA", 0);
                }

                public final String zza() {
/* 6 */             String string = this.zza.getString("_GRECAPTCHA_KC", null);
                    return string == null ? HttpUrl.FRAGMENT_ENCODE_SET : string;
                }

                public final void zzb(Map map) {
/* 3 */             SharedPreferences.Editor editorEdit = this.zza.edit();
/* 19 */            for (Map.Entry entry : map.entrySet()) {
/* 39 */                editorEdit.putString((String) entry.getKey(), (String) entry.getValue());
                    }
/* 43 */            editorEdit.commit();
                }
            }
