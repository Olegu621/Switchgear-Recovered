            package com.google.android.gms.internal.drive;

            import android.os.Parcel;
            import android.os.Parcelable;
            import p000.qj3;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzae implements Parcelable.Creator<zzad> {
                @Override // android.os.Parcelable.Creator
                public final zzad createFromParcel(Parcel parcel) {
/* 1 */             int iM7883P = qj3.m7883P(parcel);
/* 9 */             while (parcel.dataPosition() < iM7883P) {
/* 15 */                qj3.m7878K(parcel.readInt(), parcel);
                    }
/* 19 */            qj3.m7908s(iM7883P, parcel);
/* 24 */            return new zzad();
                }

                @Override // android.os.Parcelable.Creator
                public final /* synthetic */ zzad[] newArray(int i) {
/* 1 */             return new zzad[i];
                }
            }
