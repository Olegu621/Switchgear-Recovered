            package com.google.android.gms.measurement.internal;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import java.util.ArrayList;
            import java.util.List;
            import p000.cl3;
            import p000.w11;
            import p000.zl3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzon extends AbstractSafeParcelable {
                public static final Parcelable.Creator<zzon> CREATOR = new cl3(18);

                /* JADX INFO: renamed from: a */
                public final List f4225a;

                public zzon(ArrayList arrayList) {
/* 4 */             this.f4225a = arrayList;
                }

                /* JADX INFO: renamed from: D1 */
                public static zzon m2196D1(zl3... zl3VarArr) {
/* 4 */             ArrayList arrayList = new ArrayList(1);
/* 16 */            arrayList.add(Integer.valueOf(zl3VarArr[0].f20243a));
/* 21 */            return new zzon(arrayList);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 7 */             List list = this.f4225a;
/* 9 */             if (list != null) {
/* 13 */                int iM9422c1 = w11.m9422c0(1, parcel);
/* 17 */                int size = list.size();
/* 21 */                parcel.writeInt(size);
/* 25 */                for (int i2 = 0; i2 < size; i2++) {
/* 37 */                    parcel.writeInt(((Integer) list.get(i2)).intValue());
                        }
/* 43 */                w11.m9428f0(iM9422c1, parcel);
                    }
/* 46 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
