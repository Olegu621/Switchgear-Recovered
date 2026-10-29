            package com.google.android.gms.location;

            import android.location.Location;
            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.ReflectedParcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            import p000.fm0;
            import p000.re3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class LocationResult extends AbstractSafeParcelable implements ReflectedParcelable {

                /* JADX INFO: renamed from: a */
                public final List f4133a;

                /* JADX INFO: renamed from: b */
                public static final List f4132b = Collections.EMPTY_LIST;
                public static final Parcelable.Creator<LocationResult> CREATOR = new re3(0);

                public LocationResult(List list) {
/* 4 */             this.f4133a = list;
                }

                public final boolean equals(Object obj) {
/* 4 */             if (!(obj instanceof LocationResult)) {
/* 3 */                 return false;
                    }
/* 8 */             List list = ((LocationResult) obj).f4133a;
/* 10 */            int size = list.size();
/* 14 */            List list2 = this.f4133a;
/* 20 */            if (size != list2.size()) {
/* 3 */                 return false;
                    }
/* 23 */            Iterator it = list.iterator();
/* 27 */            Iterator it2 = list2.iterator();
/* 35 */            while (it.hasNext()) {
/* 59 */                if (((Location) it2.next()).getTime() != ((Location) it.next()).getTime()) {
/* 3 */                     return false;
                        }
                    }
/* 62 */            return true;
                }

                public final int hashCode() {
/* 3 */             Iterator it = this.f4133a.iterator();
/* 7 */             int i = 17;
/* 13 */            while (it.hasNext()) {
/* 21 */                long time = ((Location) it.next()).getTime();
/* 33 */                i = (i * 31) + ((int) (time ^ (time >>> 32)));
                    }
/* 35 */            return i;
                }

                public final String toString() {
/* 3 */             String strValueOf = String.valueOf(this.f4133a);
/* 22 */            return fm0.m3790p(new StringBuilder(strValueOf.length() + 27), "LocationResult[locations: ", strValueOf, "]");
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9414X(parcel, 1, this.f4133a, false);
/* 14 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
