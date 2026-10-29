            package com.google.android.gms.location;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import p000.re3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Deprecated
            public final class zzbj extends AbstractSafeParcelable {
                public static final Parcelable.Creator<zzbj> CREATOR = new re3(2);

                /* JADX INFO: renamed from: a */
                public final String f4166a;

                /* JADX INFO: renamed from: b */
                public final String f4167b;

                /* JADX INFO: renamed from: c */
                public final String f4168c;

                public zzbj(String str, String str2, String str3) {
/* 4 */             this.f4168c = str;
/* 6 */             this.f4166a = str2;
/* 8 */             this.f4167b = str3;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9410T(parcel, 1, this.f4166a, false);
/* 17 */            w11.m9410T(parcel, 2, this.f4167b, false);
/* 23 */            w11.m9410T(parcel, 5, this.f4168c, false);
/* 26 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
