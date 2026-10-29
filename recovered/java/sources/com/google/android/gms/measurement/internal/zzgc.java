            package com.google.android.gms.measurement.internal;

            import android.os.Parcel;
            import com.google.android.gms.internal.measurement.zzbm;
            import com.google.android.gms.internal.measurement.zzbn;
            import java.util.ArrayList;
            import p000.om3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class zzgc extends zzbm implements zzgd {
                @Override // com.google.android.gms.internal.measurement.zzbm
                public final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) {
/* 2 */             if (i != 2) {
/* 20 */                return false;
                    }
/* 6 */             ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(zzog.CREATOR);
/* 10 */            zzbn.zzf(parcel);
/* 15 */            ((om3) this).mo2190f0(arrayListCreateTypedArrayList);
/* 18 */            return true;
                }
            }
