            package com.google.android.gms.location;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.List;
            import p000.re3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class LocationSettingsRequest extends AbstractSafeParcelable {
                public static final Parcelable.Creator<LocationSettingsRequest> CREATOR = new re3(3);

                /* JADX INFO: renamed from: a */
                public final List f4134a;

                /* JADX INFO: renamed from: b */
                public final boolean f4135b;

                /* JADX INFO: renamed from: c */
                public final boolean f4136c;

                /* JADX INFO: renamed from: d */
                public final zzbj f4137d;

                public LocationSettingsRequest(ArrayList arrayList, boolean z, boolean z2, zzbj zzbjVar) {
/* 4 */             this.f4134a = arrayList;
/* 6 */             this.f4135b = z;
/* 8 */             this.f4136c = z2;
/* 10 */            this.f4137d = zzbjVar;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 15 */            w11.m9414X(parcel, 1, Collections.unmodifiableList(this.f4134a), false);
/* 20 */            w11.m9420b0(parcel, 2, 4);
/* 25 */            parcel.writeInt(this.f4135b ? 1 : 0);
/* 29 */            w11.m9420b0(parcel, 3, 4);
/* 34 */            parcel.writeInt(this.f4136c ? 1 : 0);
/* 40 */            w11.m9409S(parcel, 5, this.f4137d, i, false);
/* 43 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
