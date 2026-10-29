            package com.google.android.recaptcha.internal;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzsl implements zzsc {
                final int zza;
                final zzvg zzb;

                public zzsl(zzsq zzsqVar, int i, zzvg zzvgVar, boolean z, boolean z2) {
/* 4 */             this.zza = i;
/* 6 */             this.zzb = zzvgVar;
                }

                @Override // java.lang.Comparable
                public final /* synthetic */ int compareTo(Object obj) {
/* 7 */             return this.zza - ((zzsl) obj).zza;
                }

                @Override // com.google.android.recaptcha.internal.zzsc
                public final int zza() {
/* 1 */             return this.zza;
                }

                @Override // com.google.android.recaptcha.internal.zzsc
                public final zztr zzb(zztr zztrVar, zzts zztsVar) {
/* 1 */             zzsh zzshVar = (zzsh) zztrVar;
/* 5 */             zzshVar.zzh((zzsn) zztsVar);
/* 8 */             return zzshVar;
                }

                @Override // com.google.android.recaptcha.internal.zzsc
                public final zztx zzc(zztx zztxVar, zztx zztxVar2) {
/* 6 */             throw new UnsupportedOperationException();
                }

                @Override // com.google.android.recaptcha.internal.zzsc
                public final zzvg zzd() {
/* 1 */             return this.zzb;
                }

                @Override // com.google.android.recaptcha.internal.zzsc
                public final zzvh zze() {
/* 3 */             return this.zzb.zza();
                }

                @Override // com.google.android.recaptcha.internal.zzsc
                public final boolean zzf() {
/* 1 */             return false;
                }

                @Override // com.google.android.recaptcha.internal.zzsc
                public final boolean zzg() {
/* 1 */             return false;
                }
            }
