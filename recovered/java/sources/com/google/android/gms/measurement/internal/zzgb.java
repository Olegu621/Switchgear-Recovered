            package com.google.android.gms.measurement.internal;

            import android.os.Parcel;
            import android.os.RemoteException;
            import com.google.android.gms.internal.measurement.zzbl;
            import java.util.List;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzgb extends zzbl implements zzgd {
                @Override // com.google.android.gms.measurement.internal.zzgd
                /* JADX INFO: renamed from: f0 */
                public final void mo2190f0(List list) throws RemoteException {
/* 1 */             Parcel parcelZza = zza();
/* 5 */             parcelZza.writeTypedList(list);
/* 9 */             zzd(2, parcelZza);
                }
            }
