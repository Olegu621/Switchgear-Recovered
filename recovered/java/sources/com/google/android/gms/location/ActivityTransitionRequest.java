            package com.google.android.gms.location;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Iterator;
            import java.util.List;
            import java.util.TreeSet;
            import p000.cl3;
            import p000.de3;
            import p000.fm0;
            import p000.kb1;
            import p000.w11;
            import p000.wa3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class ActivityTransitionRequest extends AbstractSafeParcelable {
                public static final Parcelable.Creator<ActivityTransitionRequest> CREATOR = new cl3(15);

                /* JADX INFO: renamed from: e */
                public static final wa3 f4105e = new wa3(23);

                /* JADX INFO: renamed from: a */
                public final List f4106a;

                /* JADX INFO: renamed from: b */
                public final String f4107b;

                /* JADX INFO: renamed from: c */
                public final List f4108c;

                /* JADX INFO: renamed from: d */
                public final String f4109d;

                public ActivityTransitionRequest(ArrayList arrayList, String str, ArrayList arrayList2, String str2) {
/* 6 */             kb1.m6062o(arrayList, "transitions can't be null");
/* 20 */            kb1.m6053f("transitions can't be empty.", arrayList.size() > 0);
/* 27 */            TreeSet treeSet = new TreeSet(f4105e);
/* 30 */            Iterator it = arrayList.iterator();
/* 38 */            while (it.hasNext()) {
/* 44 */                ActivityTransition activityTransition = (ActivityTransition) it.next();
/* 60 */                kb1.m6053f(String.format("Found duplicated transition: %s.", activityTransition), treeSet.add(activityTransition));
                    }
/* 68 */            this.f4106a = Collections.unmodifiableList(arrayList);
/* 70 */            this.f4107b = str;
/* 81 */            this.f4108c = arrayList2 == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(arrayList2);
/* 83 */            this.f4109d = str2;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (this == obj) {
/* 1 */                 return true;
                    }
/* 6 */             if (obj != null && getClass() == obj.getClass()) {
/* 19 */                ActivityTransitionRequest activityTransitionRequest = (ActivityTransitionRequest) obj;
/* 29 */                if (de3.m3029k(this.f4106a, activityTransitionRequest.f4106a) && de3.m3029k(this.f4107b, activityTransitionRequest.f4107b) && de3.m3029k(this.f4109d, activityTransitionRequest.f4109d) && de3.m3029k(this.f4108c, activityTransitionRequest.f4108c)) {
/* 1 */                     return true;
                        }
                    }
/* 5 */             return false;
                }

                public final int hashCode() {
/* 7 */             int iHashCode = this.f4106a.hashCode() * 31;
/* 10 */            String str = this.f4107b;
/* 21 */            int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
/* 23 */            List list = this.f4108c;
/* 34 */            int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 31;
/* 36 */            String str2 = this.f4109d;
/* 44 */            return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
                }

                public final String toString() {
/* 3 */             String strValueOf = String.valueOf(this.f4106a);
/* 9 */             String strValueOf2 = String.valueOf(this.f4108c);
/* 13 */            int length = strValueOf.length();
/* 17 */            String str = this.f4107b;
/* 23 */            int length2 = String.valueOf(str).length();
/* 27 */            int length3 = strValueOf2.length();
/* 31 */            String str2 = this.f4109d;
/* 48 */            StringBuilder sb = new StringBuilder(length + 79 + length2 + length3 + String.valueOf(str2).length());
/* 55 */            fm0.m3796v(sb, "ActivityTransitionRequest [mTransitions=", strValueOf, ", mTag='", str);
/* 62 */            fm0.m3796v(sb, "', mClients=", strValueOf2, ", mAttributionTag=", str2);
/* 67 */            sb.append(']');
/* 70 */            return sb.toString();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 1 */             kb1.m6061n(parcel);
/* 6 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 14 */            w11.m9414X(parcel, 1, this.f4106a, false);
/* 20 */            w11.m9410T(parcel, 2, this.f4107b, false);
/* 26 */            w11.m9414X(parcel, 3, this.f4108c, false);
/* 32 */            w11.m9410T(parcel, 4, this.f4109d, false);
/* 35 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
