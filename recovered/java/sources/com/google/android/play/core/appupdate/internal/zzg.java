            package com.google.android.play.core.appupdate.internal;

            import android.os.BadParcelableException;
            import android.os.Bundle;
            import android.os.Parcel;
            import android.os.Parcelable;
            import p000.ef3;
            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class zzg extends zzb implements zzh {
                @Override // com.google.android.play.core.appupdate.internal.zzb
                /* JADX INFO: renamed from: a */
                public final boolean mo2440a(int i, Parcel parcel) {
/* 5 */             if (i == 2) {
/* 52 */                Parcelable.Creator creator = Bundle.CREATOR;
/* 54 */                int i2 = ef3.f7674a;
/* 70 */                Bundle bundle = (Bundle) (parcel.readInt() != 0 ? (Parcelable) creator.createFromParcel(parcel) : null);
/* 72 */                int iDataAvail = parcel.dataAvail();
/* 76 */                if (iDataAvail > 0) {
/* 92 */                    throw new BadParcelableException(fm0.m3781g(iDataAvail, "Parcel data not fully consumed, unread size: "));
                        }
/* 78 */                mo2443K(bundle);
/* 81 */                return true;
                    }
/* 8 */             if (i != 3) {
/* 10 */                return false;
                    }
/* 12 */            Parcelable.Creator creator2 = Bundle.CREATOR;
/* 14 */            int i3 = ef3.f7674a;
/* 30 */            Bundle bundle2 = (Bundle) (parcel.readInt() != 0 ? (Parcelable) creator2.createFromParcel(parcel) : null);
/* 32 */            int iDataAvail2 = parcel.dataAvail();
/* 36 */            if (iDataAvail2 > 0) {
/* 51 */                throw new BadParcelableException(fm0.m3781g(iDataAvail2, "Parcel data not fully consumed, unread size: "));
                    }
/* 38 */            zzb(bundle2);
/* 81 */            return true;
                }
            }
