            package com.google.android.recaptcha.internal;

            import java.io.Serializable;
            import java.util.ArrayDeque;
            import java.util.Collection;
            import java.util.Queue;
            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzmj extends zzmn implements Serializable {
                final int zza;
                private final Queue zzb;

                private zzmj(int i) {
/* 4 */             if (i < 0) {
/* 30 */                C1951n4.m6859j(zzmg.zza("maxSize (%s) must >= 0", Integer.valueOf(i)));
/* 34 */                throw null;
                    }
/* 11 */            this.zzb = new ArrayDeque(i);
/* 13 */            this.zza = i;
                }

                public static zzmj zza(int i) {
/* 3 */             return new zzmj(i);
                }

                @Override // com.google.android.recaptcha.internal.zzml, java.util.Collection, java.util.Queue
                public final boolean add(Object obj) {
/* 1 */             obj.getClass();
/* 4 */             int i = this.zza;
/* 7 */             if (i == 0) {
/* 6 */                 return true;
                    }
/* 14 */            if (size() == i) {
/* 18 */                this.zzb.remove();
                    }
/* 23 */            this.zzb.add(obj);
/* 6 */             return true;
                }

                @Override // com.google.android.recaptcha.internal.zzml, java.util.Collection
                public final boolean addAll(Collection collection) {
/* 1 */             int size = collection.size();
/* 5 */             int i = this.zza;
/* 7 */             if (size < i) {
/* 41 */                return zzmq.zza(this, collection.iterator());
                    }
/* 9 */             clear();
/* 12 */            int i2 = size - i;
/* 20 */            zzmd.zzb(i2 >= 0, "number to skip cannot be negative");
/* 32 */            return zzmq.zza(this, new zzmp(collection, i2).iterator());
                }

                @Override // com.google.android.recaptcha.internal.zzmn, java.util.Queue
                public final boolean offer(Object obj) {
/* 1 */             add(obj);
/* 4 */             return true;
                }

                @Override // com.google.android.recaptcha.internal.zzml, com.google.android.recaptcha.internal.zzmm
                public final /* synthetic */ Object zzb() {
/* 1 */             return this.zzb;
                }

                @Override // com.google.android.recaptcha.internal.zzmn, com.google.android.recaptcha.internal.zzml
                public final /* synthetic */ Collection zzc() {
/* 1 */             return this.zzb;
                }

                @Override // com.google.android.recaptcha.internal.zzmn
                public final Queue zzd() {
/* 1 */             return this.zzb;
                }
            }
