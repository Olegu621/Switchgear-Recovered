            package com.google.android.gms.location;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import java.util.ArrayList;
            import java.util.List;
            import p000.fm0;
            import p000.md3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class GeofencingRequest extends AbstractSafeParcelable {
                public static final Parcelable.Creator<GeofencingRequest> CREATOR = new md3(9);

                /* JADX INFO: renamed from: a */
                public final List f4114a;

                /* JADX INFO: renamed from: b */
                public final int f4115b;

                /* JADX INFO: renamed from: c */
                public final String f4116c;

                /* JADX INFO: renamed from: d */
                public final String f4117d;

                public GeofencingRequest(ArrayList arrayList, int i, String str, String str2) {
/* 4 */             this.f4114a = arrayList;
/* 6 */             this.f4115b = i;
/* 8 */             this.f4116c = str;
/* 10 */            this.f4117d = str2;
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("GeofencingRequest[geofences=");
/* 10 */            sb.append(this.f4114a);
/* 15 */            sb.append(", initialTrigger=");
/* 20 */            sb.append(this.f4115b);
/* 25 */            sb.append(", tag=");
/* 30 */            sb.append(this.f4116c);
/* 35 */            sb.append(", attributionTag=");
/* 42 */            return fm0.m3789o(sb, this.f4117d, "]");
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9414X(parcel, 1, this.f4114a, false);
/* 16 */            w11.m9420b0(parcel, 2, 4);
/* 21 */            parcel.writeInt(this.f4115b);
/* 27 */            w11.m9410T(parcel, 3, this.f4116c, false);
/* 32 */            w11.m9410T(parcel, 4, this.f4117d, false);
/* 35 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
