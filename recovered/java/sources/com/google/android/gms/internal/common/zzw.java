            package com.google.android.gms.internal.common;

            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            import p000.AbstractC0208c9;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzw {
                private final zzp zza;
                private final boolean zzb;
                private final zzu zzc;

                private zzw(zzu zzuVar, boolean z, zzp zzpVar, int i) {
/* 4 */             this.zzc = zzuVar;
/* 6 */             this.zzb = z;
/* 8 */             this.zza = zzpVar;
                }

                public static zzw zza(zzp zzpVar) {
/* 14 */            return new zzw(new zzu(zzpVar), false, zzo.zza, AbstractC0208c9.API_PRIORITY_OTHER);
                }

                public final zzw zzb() {
/* 11 */            return new zzw(this.zzc, true, this.zza, AbstractC0208c9.API_PRIORITY_OTHER);
                }

                public final Iterable zzc(CharSequence charSequence) {
/* 3 */             return new zzt(this, charSequence);
                }

                public final List zzd(CharSequence charSequence) {
/* 1 */             charSequence.getClass();
/* 6 */             Iterator itZza = this.zzc.zza(this, charSequence);
/* 12 */            ArrayList arrayList = new ArrayList();
/* 19 */            while (itZza.hasNext()) {
/* 27 */                arrayList.add((String) itZza.next());
                    }
/* 31 */            return Collections.unmodifiableList(arrayList);
                }

                public final /* synthetic */ Iterator zze(CharSequence charSequence) {
/* 3 */             return this.zzc.zza(this, charSequence);
                }

                public final /* synthetic */ zzp zzf() {
/* 1 */             return this.zza;
                }

                public final /* synthetic */ boolean zzg() {
/* 1 */             return this.zzb;
                }
            }
