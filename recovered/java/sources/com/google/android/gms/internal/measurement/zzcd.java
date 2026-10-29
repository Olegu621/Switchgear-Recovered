            package com.google.android.gms.internal.measurement;

            import android.content.SharedPreferences;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Map;
            import java.util.Set;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzcd implements SharedPreferences {
                private final Map zza = new HashMap();
                private final Set zzb = new HashSet();

                private final Object zzc(String str, Object obj) {
/* 3 */             Object obj2 = this.zza.get(str);
                    return obj2 != null ? obj2 : obj;
                }

                @Override // android.content.SharedPreferences
                public final boolean contains(String str) {
/* 3 */             return this.zza.containsKey(str);
                }

                @Override // android.content.SharedPreferences
                public final SharedPreferences.Editor edit() {
/* 4 */             return new zzcc(this, null);
                }

                @Override // android.content.SharedPreferences
                public final Map getAll() {
/* 1 */             return this.zza;
                }

                @Override // android.content.SharedPreferences
                public final boolean getBoolean(String str, boolean z) {
/* 11 */            return ((Boolean) zzc(str, Boolean.valueOf(z))).booleanValue();
                }

                @Override // android.content.SharedPreferences
                public final float getFloat(String str, float f) {
/* 11 */            return ((Float) zzc(str, Float.valueOf(f))).floatValue();
                }

                @Override // android.content.SharedPreferences
                public final int getInt(String str, int i) {
/* 11 */            return ((Integer) zzc(str, Integer.valueOf(i))).intValue();
                }

                @Override // android.content.SharedPreferences
                public final long getLong(String str, long j) {
/* 11 */            return ((Long) zzc(str, Long.valueOf(j))).longValue();
                }

                @Override // android.content.SharedPreferences
                public final String getString(String str, String str2) {
/* 5 */             return (String) zzc(str, str2);
                }

                @Override // android.content.SharedPreferences
                public final Set getStringSet(String str, Set set) {
/* 5 */             return (Set) zzc(str, set);
                }

                @Override // android.content.SharedPreferences
                public final void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
/* 3 */             this.zzb.add(onSharedPreferenceChangeListener);
                }

                @Override // android.content.SharedPreferences
                public final void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
/* 3 */             this.zzb.remove(onSharedPreferenceChangeListener);
                }

                public final /* synthetic */ Map zza() {
/* 1 */             return this.zza;
                }

                public final /* synthetic */ Set zzb() {
/* 1 */             return this.zzb;
                }
            }
