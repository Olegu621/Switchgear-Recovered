            package com.google.android.gms.common.server.response;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import java.util.ArrayList;
            import java.util.Map;
            import p000.ub3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 54 */    public final class zal extends AbstractSafeParcelable {
                public static final Parcelable.Creator<zal> CREATOR = new ub3(8);

                /* JADX INFO: renamed from: a */
                public final int f3591a;

                /* JADX INFO: renamed from: b */
                public final String f3592b;

                /* JADX INFO: renamed from: c */
                public final ArrayList f3593c;

                public zal(String str, Map map) {
                    ArrayList arrayList;
/* 5 */             this.f3591a = 1;
/* 7 */             this.f3592b = str;
/* 9 */             if (map == null) {
/* 11 */                arrayList = null;
                    } else {
/* 15 */                arrayList = new ArrayList();
/* 30 */                for (String str2 : map.keySet()) {
/* 49 */                    arrayList.add(new zam((FastJsonResponse$Field) map.get(str2), str2));
                        }
                    }
/* 53 */            this.f3593c = arrayList;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 9 */             w11.m9420b0(parcel, 1, 4);
/* 14 */            parcel.writeInt(this.f3591a);
/* 21 */            w11.m9410T(parcel, 2, this.f3592b, false);
/* 27 */            w11.m9414X(parcel, 3, this.f3593c, false);
/* 30 */            w11.m9428f0(iM9422c0, parcel);
                }

/* 55 */        public zal(int i, String str, ArrayList arrayList) {
/* 57 */            this.f3591a = i;
                    this.f3592b = str;
                    this.f3593c = arrayList;
                }
            }
