            package com.google.android.gms.internal.play_billing;

            import java.util.Map;
            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzht implements Map.Entry {
                private final Map.Entry zza;

                @Override // java.util.Map.Entry
                public final Object getKey() {
/* 3 */             return this.zza.getKey();
                }

                @Override // java.util.Map.Entry
                public final Object getValue() {
/* 10 */            if (((zzhw) this.zza.getValue()) == null) {
/* 9 */                 return null;
                    }
/* 13 */            throw null;
                }

                @Override // java.util.Map.Entry
                public final Object setValue(Object obj) {
/* 3 */             if (obj instanceof zzim) {
/* 15 */                return ((zzhw) this.zza.getValue()).zzc((zzim) obj);
                    }
/* 22 */            C1951n4.m6859j("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
/* 25 */            return null;
                }

                public final zzhw zza() {
/* 7 */             return (zzhw) this.zza.getValue();
                }
            }
