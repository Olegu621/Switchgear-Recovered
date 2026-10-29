            package com.google.android.gms.internal.fido;

            import p000.C1951n4;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzbb extends zzbf {
                boolean zza;
                final /* synthetic */ Object zzb;

                public zzbb(Object obj) {
/* 1 */             this.zzb = obj;
                }

                @Override // java.util.Iterator
                public final boolean hasNext() {
                    return !this.zza;
                }

                @Override // java.util.Iterator
                public final Object next() {
/* 3 */             if (this.zza) {
/* 11 */                C1951n4.m6864o();
/* 14 */                return null;
                    }
/* 6 */             this.zza = true;
/* 8 */             return this.zzb;
                }
            }
