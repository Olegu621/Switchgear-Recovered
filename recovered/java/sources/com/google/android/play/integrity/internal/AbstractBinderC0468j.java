            package com.google.android.play.integrity.internal;

            import android.os.Bundle;
            import android.os.Parcel;
            import android.os.Parcelable;
            import android.os.RemoteException;
            import p000.na3;
            
            /* JADX INFO: renamed from: com.google.android.play.integrity.internal.j */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class AbstractBinderC0468j extends BinderC0464b implements InterfaceC0469k {
                @Override // com.google.android.play.integrity.internal.BinderC0464b
                /* JADX INFO: renamed from: a */
                public final boolean mo2506a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
/* 2 */             if (i == 2) {
/* 60 */                Parcelable.Creator creator = Bundle.CREATOR;
/* 66 */                Bundle bundle = (Bundle) na3.m6955a(parcel);
/* 68 */                na3.m6956b(parcel);
/* 71 */                mo2478e(bundle);
/* 74 */                return true;
                    }
/* 5 */             if (i == 3) {
/* 45 */                Parcelable.Creator creator2 = Bundle.CREATOR;
/* 51 */                Bundle bundle2 = (Bundle) na3.m6955a(parcel);
/* 53 */                na3.m6956b(parcel);
/* 56 */                mo2476c(bundle2);
/* 74 */                return true;
                    }
/* 8 */             if (i == 4) {
/* 30 */                Parcelable.Creator creator3 = Bundle.CREATOR;
/* 36 */                Bundle bundle3 = (Bundle) na3.m6955a(parcel);
/* 38 */                na3.m6956b(parcel);
/* 41 */                mo2477d(bundle3);
/* 74 */                return true;
                    }
/* 11 */            if (i != 5) {
/* 13 */                return false;
                    }
/* 15 */            Parcelable.Creator creator4 = Bundle.CREATOR;
/* 21 */            Bundle bundle4 = (Bundle) na3.m6955a(parcel);
/* 23 */            na3.m6956b(parcel);
/* 26 */            mo2475b(bundle4);
/* 74 */            return true;
                }
            }
