            package com.google.android.gms.signin.internal;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.ConnectionResult;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import com.google.android.gms.common.internal.zav;
            import p000.ub3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zak extends AbstractSafeParcelable {
                public static final Parcelable.Creator<zak> CREATOR = new ub3(5);

                /* JADX INFO: renamed from: a */
                public final int f4276a;

                /* JADX INFO: renamed from: b */
                public final ConnectionResult f4277b;

                /* JADX INFO: renamed from: c */
                public final zav f4278c;

                public zak(int i, ConnectionResult connectionResult, zav zavVar) {
/* 4 */             this.f4276a = i;
/* 6 */             this.f4277b = connectionResult;
/* 8 */             this.f4278c = zavVar;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 9 */             w11.m9420b0(parcel, 1, 4);
/* 14 */            parcel.writeInt(this.f4276a);
/* 21 */            w11.m9409S(parcel, 2, this.f4277b, i, false);
/* 27 */            w11.m9409S(parcel, 3, this.f4278c, i, false);
/* 30 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
