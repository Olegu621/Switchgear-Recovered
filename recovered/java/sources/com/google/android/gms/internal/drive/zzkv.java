            package com.google.android.gms.internal.drive;

            import java.util.Map;
            import p000.C1951n4;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzkv<K> implements Map.Entry<K, Object> {
                private Map.Entry<K, zzkt> zztf;

                private zzkv(Map.Entry<K, zzkt> entry) {
/* 4 */             this.zztf = entry;
                }

                @Override // java.util.Map.Entry
                public final K getKey() {
/* 3 */             return this.zztf.getKey();
                }

                @Override // java.util.Map.Entry
                public final Object getValue() {
/* 9 */             if (this.zztf.getValue() == null) {
/* 11 */                return null;
                    }
/* 13 */            return zzkt.zzdp();
                }

                @Override // java.util.Map.Entry
                public final Object setValue(Object obj) {
/* 3 */             if (obj instanceof zzlq) {
/* 15 */                return this.zztf.getValue().zzi((zzlq) obj);
                    }
/* 22 */            C1951n4.m6859j("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
/* 25 */            return null;
                }

                public final zzkt zzdq() {
/* 3 */             return this.zztf.getValue();
                }
            }
