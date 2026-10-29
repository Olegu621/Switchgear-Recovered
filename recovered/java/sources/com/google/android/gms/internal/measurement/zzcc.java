            package com.google.android.gms.internal.measurement;

            import android.content.SharedPreferences;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Map;
            import java.util.Objects;
            import java.util.Set;
            import p000.C1951n4;
            import p000.ub2;
            import p000.vb2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzcc implements SharedPreferences.Editor {
                boolean zza;
                final Set zzb;
                final Map zzc;
                final /* synthetic */ zzcd zzd;

                public /* synthetic */ zzcc(zzcd zzcdVar, byte[] bArr) {
/* 1 */             Objects.requireNonNull(zzcdVar);
/* 4 */             this.zzd = zzcdVar;
/* 10 */            this.zza = false;
/* 17 */            this.zzb = new HashSet();
/* 24 */            this.zzc = new HashMap();
                }

                private final void zza(String str, Object obj) {
/* 1 */             if (obj != null) {
/* 5 */                 this.zzc.put(str, obj);
                    } else {
/* 9 */                 remove(str);
                    }
                }

                @Override // android.content.SharedPreferences.Editor
                public final void apply() {
/* 1 */             commit();
                }

                @Override // android.content.SharedPreferences.Editor
                public final SharedPreferences.Editor clear() {
/* 2 */             this.zza = true;
/* 4 */             return this;
                }

                @Override // android.content.SharedPreferences.Editor
                public final boolean commit() {
/* 3 */             if (this.zza) {
/* 11 */                this.zzd.zza().clear();
                    }
/* 14 */            zzcd zzcdVar = this.zzd;
/* 16 */            Set set = this.zzb;
/* 26 */            zzcdVar.zza().keySet().removeAll(set);
/* 29 */            Map map = this.zzc;
/* 43 */            for (Map.Entry entry : map.entrySet()) {
/* 65 */                zzcdVar.zza().put((String) entry.getKey(), entry.getValue());
                    }
/* 82 */            for (SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener : zzcdVar.zzb()) {
/* 90 */                Set setKeySet = map.keySet();
/* 94 */                if (set == null) {
/* 132 */                   C1951n4.m6868s("set1");
/* 81 */                    return false;
                        }
/* 96 */                if (setKeySet == null) {
/* 126 */                   C1951n4.m6868s("set2");
/* 81 */                    return false;
                        }
/* 105 */               ub2 ub2Var = new ub2(new vb2(set, setKeySet));
/* 112 */               while (ub2Var.hasNext()) {
/* 120 */                   onSharedPreferenceChangeListener.onSharedPreferenceChanged(zzcdVar, (String) ub2Var.next());
                        }
                    }
                    return (!this.zza && set.isEmpty() && map.isEmpty()) ? false : true;
                }

                @Override // android.content.SharedPreferences.Editor
                public final SharedPreferences.Editor putBoolean(String str, boolean z) {
/* 5 */             zza(str, Boolean.valueOf(z));
/* 8 */             return this;
                }

                @Override // android.content.SharedPreferences.Editor
                public final SharedPreferences.Editor putFloat(String str, float f) {
/* 5 */             zza(str, Float.valueOf(f));
/* 8 */             return this;
                }

                @Override // android.content.SharedPreferences.Editor
                public final SharedPreferences.Editor putInt(String str, int i) {
/* 5 */             zza(str, Integer.valueOf(i));
/* 8 */             return this;
                }

                @Override // android.content.SharedPreferences.Editor
                public final SharedPreferences.Editor putLong(String str, long j) {
/* 5 */             zza(str, Long.valueOf(j));
/* 8 */             return this;
                }

                @Override // android.content.SharedPreferences.Editor
                public final SharedPreferences.Editor putString(String str, String str2) {
/* 1 */             zza(str, str2);
/* 4 */             return this;
                }

                @Override // android.content.SharedPreferences.Editor
                public final SharedPreferences.Editor putStringSet(String str, Set set) {
/* 1 */             zza(str, set);
/* 4 */             return this;
                }

                @Override // android.content.SharedPreferences.Editor
                public final SharedPreferences.Editor remove(String str) {
/* 3 */             this.zzb.add(str);
/* 6 */             return this;
                }
            }
