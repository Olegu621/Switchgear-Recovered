            package com.google.android.gms.internal.play_billing;

            import java.util.Iterator;
            import java.util.Map;
            import p000.f42;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzjc implements Iterator {
                final /* synthetic */ zzjf zza;
                private int zzb = -1;
                private boolean zzc;
                private Iterator zzd;

                private final Iterator zza() {
/* 3 */             if (this.zzd == null) {
/* 19 */                this.zzd = this.zza.zzc.entrySet().iterator();
                    }
/* 21 */            return this.zzd;
                }

                @Override // java.util.Iterator
                public final boolean hasNext() {
/* 4 */             int i = this.zzb + 1;
/* 5 */             zzjf zzjfVar = this.zza;
/* 11 */            if (i >= zzjfVar.zzb) {
                        return !zzjfVar.zzc.isEmpty() && zza().hasNext();
                    }
/* 3 */             return true;
                }

                @Override // java.util.Iterator
                public final /* bridge */ /* synthetic */ Object next() {
/* 2 */             this.zzc = true;
/* 6 */             int i = this.zzb + 1;
/* 7 */             this.zzb = i;
/* 9 */             zzjf zzjfVar = this.zza;
                    return i < zzjfVar.zzb ? (zzjb) zzjfVar.zza[i] : (Map.Entry) zza().next();
                }

                @Override // java.util.Iterator
                public final void remove() {
/* 3 */             if (!this.zzc) {
/* 41 */                f42.m3656l("remove() was called before next()");
/* 44 */                return;
                    }
/* 6 */             this.zzc = false;
/* 1 */             this.zza.zzo();
/* 13 */            int i = this.zzb;
/* 15 */            zzjf zzjfVar = this.zza;
/* 21 */            if (i >= zzjfVar.zzb) {
/* 35 */                zza().remove();
                    } else {
/* 25 */                this.zzb = i - 1;
/* 1 */                 zzjfVar.zzm(i);
                    }
                }
            }
