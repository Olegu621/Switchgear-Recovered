            package com.google.android.gms.common.server.converter;

            import android.os.Parcel;
            import android.os.Parcelable;
            import android.util.SparseArray;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import java.util.ArrayList;
            import java.util.HashMap;
            import p000.qd3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class StringToIntConverter extends AbstractSafeParcelable {
                public static final Parcelable.Creator<StringToIntConverter> CREATOR = new qd3(26);

                /* JADX INFO: renamed from: a */
                public final int f3565a;

                /* JADX INFO: renamed from: b */
                public final HashMap f3566b = new HashMap();

                /* JADX INFO: renamed from: c */
                public final SparseArray f3567c = new SparseArray();

                public StringToIntConverter(int i, ArrayList arrayList) {
/* 4 */             this.f3565a = i;
/* 20 */            int size = arrayList.size();
/* 25 */            for (int i2 = 0; i2 < size; i2++) {
/* 31 */                zac zacVar = (zac) arrayList.get(i2);
/* 33 */                String str = zacVar.f3571b;
/* 35 */                int i3 = zacVar.f3572c;
/* 43 */                this.f3566b.put(str, Integer.valueOf(i3));
/* 48 */                this.f3567c.put(i3, str);
                    }
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 9 */             w11.m9420b0(parcel, 1, 4);
/* 14 */            parcel.writeInt(this.f3565a);
/* 19 */            ArrayList arrayList = new ArrayList();
/* 22 */            HashMap map = this.f3566b;
/* 36 */            for (String str : map.keySet()) {
/* 59 */                arrayList.add(new zac(str, ((Integer) map.get(str)).intValue()));
                    }
/* 65 */            w11.m9414X(parcel, 2, arrayList, false);
/* 68 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
