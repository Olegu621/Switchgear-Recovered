            package com.google.android.gms.internal.play_billing;

            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzcz extends zzdw {
                private final Object zza;
                private boolean zzb;

                public zzcz(Object obj) {
/* 4 */             this.zza = obj;
                }

                @Override // java.util.Iterator
                public final boolean hasNext() {
                    return !this.zzb;
                }

                @Override // java.util.Iterator
                public final Object next() {
/* 3 */             if (this.zzb) {
/* 11 */                C1951n4.m6864o();
/* 14 */                return null;
                    }
/* 6 */             this.zzb = true;
/* 8 */             return this.zza;
                }
            }
