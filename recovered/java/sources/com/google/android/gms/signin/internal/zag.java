            package com.google.android.gms.signin.internal;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.api.Status;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import java.util.ArrayList;
            import java.util.List;
            import p000.p42;
            import p000.ub3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zag extends AbstractSafeParcelable implements p42 {
                public static final Parcelable.Creator<zag> CREATOR = new ub3(2);

                /* JADX INFO: renamed from: a */
                public final List f4272a;

                /* JADX INFO: renamed from: b */
                public final String f4273b;

                public zag(String str, ArrayList arrayList) {
/* 4 */             this.f4272a = arrayList;
/* 6 */             this.f4273b = str;
                }

                @Override // p000.p42
                public final Status getStatus() {
                    return this.f4273b != null ? Status.f3440e : Status.f3444w;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 10 */            w11.m9412V(parcel, this.f4272a, 1);
/* 17 */            w11.m9410T(parcel, 2, this.f4273b, false);
/* 20 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
