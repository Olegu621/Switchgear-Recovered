            package com.google.android.gms.common.internal;

            import android.os.Bundle;
            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.Feature;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import p000.tf3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzj extends AbstractSafeParcelable {
                public static final Parcelable.Creator<zzj> CREATOR = new tf3(28);

                /* JADX INFO: renamed from: a */
                public Bundle f3543a;

                /* JADX INFO: renamed from: b */
                public Feature[] f3544b;

                /* JADX INFO: renamed from: c */
                public int f3545c;

                /* JADX INFO: renamed from: d */
                public ConnectionTelemetryConfiguration f3546d;

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9402L(parcel, 1, this.f3543a, false);
/* 17 */            w11.m9413W(parcel, 2, this.f3544b, i);
/* 20 */            int i2 = this.f3545c;
/* 24 */            w11.m9420b0(parcel, 3, 4);
/* 27 */            parcel.writeInt(i2);
/* 32 */            w11.m9409S(parcel, 4, this.f3546d, i, false);
/* 35 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
