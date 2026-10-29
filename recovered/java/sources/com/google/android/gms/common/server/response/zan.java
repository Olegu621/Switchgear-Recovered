            package com.google.android.gms.common.server.response;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.Map;
            import p000.kb1;
            import p000.ub3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zan extends AbstractSafeParcelable {
                public static final Parcelable.Creator<zan> CREATOR = new ub3(7);

                /* JADX INFO: renamed from: a */
                public final int f3597a;

                /* JADX INFO: renamed from: b */
                public final HashMap f3598b;

                /* JADX INFO: renamed from: c */
                public final String f3599c;

                public zan(int i, String str, ArrayList arrayList) {
/* 4 */             this.f3597a = i;
/* 8 */             HashMap map = new HashMap();
/* 11 */            int size = arrayList.size();
/* 17 */            for (int i2 = 0; i2 < size; i2++) {
/* 23 */                zal zalVar = (zal) arrayList.get(i2);
/* 25 */                String str2 = zalVar.f3592b;
/* 27 */                ArrayList arrayList2 = zalVar.f3593c;
/* 31 */                HashMap map2 = new HashMap();
/* 34 */                kb1.m6061n(arrayList2);
/* 37 */                int size2 = arrayList2.size();
/* 42 */                for (int i3 = 0; i3 < size2; i3++) {
/* 48 */                    zam zamVar = (zam) arrayList2.get(i3);
/* 54 */                    map2.put(zamVar.f3595b, zamVar.f3596c);
                        }
/* 60 */                map.put(str2, map2);
                    }
/* 66 */            this.f3598b = map;
/* 68 */            kb1.m6061n(str);
/* 71 */            this.f3599c = str;
/* 77 */            Iterator it = map.keySet().iterator();
/* 85 */            while (it.hasNext()) {
/* 97 */                Map map3 = (Map) map.get((String) it.next());
/* 103 */               Iterator it2 = map3.keySet().iterator();
/* 111 */               while (it2.hasNext()) {
/* 125 */                   ((FastJsonResponse$Field) map3.get((String) it2.next())).f3573U = this;
                        }
                    }
                }

                public final String toString() {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 6 */             HashMap map = this.f3598b;
/* 20 */            for (String str : map.keySet()) {
/* 28 */                sb.append(str);
/* 33 */                sb.append(":\n");
/* 40 */                Map map2 = (Map) map.get(str);
/* 54 */                for (String str2 : map2.keySet()) {
/* 64 */                    sb.append("  ");
/* 67 */                    sb.append(str2);
/* 72 */                    sb.append(": ");
/* 79 */                    sb.append(map2.get(str2));
                        }
                    }
/* 83 */            return sb.toString();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 9 */             w11.m9420b0(parcel, 1, 4);
/* 14 */            parcel.writeInt(this.f3597a);
/* 19 */            ArrayList arrayList = new ArrayList();
/* 22 */            HashMap map = this.f3598b;
/* 36 */            for (String str : map.keySet()) {
/* 55 */                arrayList.add(new zal(str, (Map) map.get(str)));
                    }
/* 61 */            w11.m9414X(parcel, 2, arrayList, false);
/* 67 */            w11.m9410T(parcel, 3, this.f3599c, false);
/* 70 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
