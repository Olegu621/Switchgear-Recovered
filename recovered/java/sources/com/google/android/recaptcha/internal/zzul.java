            package com.google.android.recaptcha.internal;

            import java.util.Iterator;
            import java.util.Map;
            import p000.f42;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzul implements Iterator {
                final /* synthetic */ zzuo zza;
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
/* 5 */             zzuo zzuoVar = this.zza;
/* 11 */            if (i >= zzuoVar.zzb) {
                        return !zzuoVar.zzc.isEmpty() && zza().hasNext();
                    }
/* 3 */             return true;
                }

                @Override // java.util.Iterator
                public final /* bridge */ /* synthetic */ Object next() {
/* 2 */             this.zzc = true;
/* 6 */             int i = this.zzb + 1;
/* 7 */             this.zzb = i;
/* 9 */             zzuo zzuoVar = this.zza;
                    return i < zzuoVar.zzb ? (zzuk) zzuoVar.zza[i] : (Map.Entry) zza().next();
                }

                @Override // java.util.Iterator
                public final void remove() {
/* 3 */             if (!this.zzc) {
/* 39 */                f42.m3656l("remove() was called before next()");
/* 42 */                return;
                    }
/* 6 */             this.zzc = false;
/* 8 */             zzuo zzuoVar = this.zza;
/* 1 */             zzuoVar.zzo();
/* 13 */            int i = this.zzb;
/* 19 */            if (i >= zzuoVar.zzb) {
/* 33 */                zza().remove();
                    } else {
/* 23 */                this.zzb = i - 1;
/* 1 */                 zzuoVar.zzm(i);
                    }
                }
            }
