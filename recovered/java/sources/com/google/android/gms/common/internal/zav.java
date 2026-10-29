            package com.google.android.gms.common.internal;

            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.ConnectionResult;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import p000.de3;
            import p000.ub3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zav extends AbstractSafeParcelable {
                public static final Parcelable.Creator<zav> CREATOR = new ub3(11);

                /* JADX INFO: renamed from: a */
                public final int f3530a;

                /* JADX INFO: renamed from: b */
                public final IBinder f3531b;

                /* JADX INFO: renamed from: c */
                public final ConnectionResult f3532c;

                /* JADX INFO: renamed from: d */
                public final boolean f3533d;

                /* JADX INFO: renamed from: e */
                public final boolean f3534e;

                public zav(int i, IBinder iBinder, ConnectionResult connectionResult, boolean z, boolean z2) {
/* 4 */             this.f3530a = i;
/* 6 */             this.f3531b = iBinder;
/* 8 */             this.f3532c = connectionResult;
/* 10 */            this.f3533d = z;
/* 12 */            this.f3534e = z2;
                }

                public final boolean equals(Object obj) {
                    Object zztVar;
/* 1 */             if (obj == null) {
/* 83 */                return false;
                    }
/* 4 */             if (this == obj) {
/* 81 */                return true;
                    }
/* 9 */             if (!(obj instanceof zav)) {
/* 83 */                return false;
                    }
/* 12 */            zav zavVar = (zav) obj;
/* 22 */            if (!this.f3532c.equals(zavVar.f3532c)) {
/* 83 */                return false;
                    }
/* 26 */            Object zztVar2 = null;
/* 27 */            IBinder iBinder = this.f3531b;
/* 29 */            if (iBinder == null) {
/* 31 */                zztVar = null;
                    } else {
/* 33 */                int i = IAccountAccessor.Stub.f3503a;
/* 35 */                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
/* 48 */                zztVar = iInterfaceQueryLocalInterface instanceof IAccountAccessor ? (IAccountAccessor) iInterfaceQueryLocalInterface : new zzt(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
                    }
/* 51 */            IBinder iBinder2 = zavVar.f3531b;
/* 53 */            if (iBinder2 != null) {
/* 56 */                int i2 = IAccountAccessor.Stub.f3503a;
/* 58 */                IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
/* 72 */                zztVar2 = iInterfaceQueryLocalInterface2 instanceof IAccountAccessor ? (IAccountAccessor) iInterfaceQueryLocalInterface2 : new zzt(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor");
                    }
                    return de3.m3029k(zztVar, zztVar2);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 9 */             w11.m9420b0(parcel, 1, 4);
/* 14 */            parcel.writeInt(this.f3530a);
/* 20 */            w11.m9405O(parcel, 2, this.f3531b);
/* 27 */            w11.m9409S(parcel, 3, this.f3532c, i, false);
/* 30 */            w11.m9420b0(parcel, 4, 4);
/* 35 */            parcel.writeInt(this.f3533d ? 1 : 0);
/* 39 */            w11.m9420b0(parcel, 5, 4);
/* 44 */            parcel.writeInt(this.f3534e ? 1 : 0);
/* 47 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
