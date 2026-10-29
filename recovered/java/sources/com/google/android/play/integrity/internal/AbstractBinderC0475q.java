            package com.google.android.play.integrity.internal;

            import android.os.Bundle;
            import android.os.Parcel;
            import android.os.Parcelable;
            import android.os.RemoteException;
            import p000.na3;
            
            /* JADX INFO: renamed from: com.google.android.play.integrity.internal.q */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class AbstractBinderC0475q extends BinderC0464b implements InterfaceC0476r {
                @Override // com.google.android.play.integrity.internal.BinderC0464b
                /* JADX INFO: renamed from: a */
                public final boolean mo2506a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
/* 2 */             if (i != 2) {
/* 20 */                return false;
                    }
/* 4 */             Parcelable.Creator creator = Bundle.CREATOR;
/* 10 */            Bundle bundle = (Bundle) na3.m6955a(parcel);
/* 12 */            na3.m6956b(parcel);
/* 15 */            mo2464b(bundle);
/* 18 */            return true;
                }
            }
