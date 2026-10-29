            package com.google.android.gms.internal.location;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.ClientIdentity;
            import java.util.List;
            import p000.qj3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzk implements Parcelable.Creator<zzj> {
                @Override // android.os.Parcelable.Creator
                public final zzj createFromParcel(Parcel parcel) {
/* 1 */             int iM7883P = qj3.m7883P(parcel);
/* 5 */             com.google.android.gms.location.zzs zzsVar = zzj.zzb;
/* 7 */             List<ClientIdentity> listM7903n = zzj.zza;
/* 9 */             String strM7899j = null;
/* 14 */            while (parcel.dataPosition() < iM7883P) {
/* 16 */                int i = parcel.readInt();
/* 20 */                char c = (char) i;
/* 22 */                if (c == 1) {
/* 52 */                    zzsVar = (com.google.android.gms.location.zzs) qj3.m7898i(parcel, i, com.google.android.gms.location.zzs.CREATOR);
                        } else if (c == 2) {
/* 41 */                    listM7903n = qj3.m7903n(parcel, i, ClientIdentity.CREATOR);
                        } else if (c != 3) {
/* 30 */                    qj3.m7878K(i, parcel);
                        } else {
/* 34 */                    strM7899j = qj3.m7899j(i, parcel);
                        }
                    }
/* 55 */            qj3.m7908s(iM7883P, parcel);
/* 60 */            return new zzj(zzsVar, listM7903n, strM7899j);
                }

                @Override // android.os.Parcelable.Creator
                public final /* bridge */ /* synthetic */ zzj[] newArray(int i) {
/* 1 */             return new zzj[i];
                }
            }
