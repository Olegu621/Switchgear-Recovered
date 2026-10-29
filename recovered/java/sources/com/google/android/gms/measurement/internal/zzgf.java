            package com.google.android.gms.measurement.internal;

            import android.os.Parcel;
            import com.google.android.gms.internal.measurement.zzbm;
            import com.google.android.gms.internal.measurement.zzbn;
            import p000.pm3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class zzgf extends zzbm implements zzgg {
                @Override // com.google.android.gms.internal.measurement.zzbm
                public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) {
/* 2 */             if (i != 2) {
/* 22 */                return false;
                    }
/* 10 */            zzop zzopVar = (zzop) zzbn.zzb(parcel, zzop.CREATOR);
/* 12 */            zzbn.zzf(parcel);
/* 17 */            ((pm3) this).mo2191i0(zzopVar);
/* 20 */            return true;
                }
            }
