            package com.google.android.gms.location;

            import android.os.Bundle;
            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.List;
            import p000.cl3;
            import p000.kb1;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class ActivityTransitionResult extends AbstractSafeParcelable {
                public static final Parcelable.Creator<ActivityTransitionResult> CREATOR = new cl3(23);

                /* JADX INFO: renamed from: a */
                public final List f4110a;

                /* JADX INFO: renamed from: b */
                public final Bundle f4111b;

                public ActivityTransitionResult(ArrayList arrayList, Bundle bundle) {
/* 5 */             this.f4111b = null;
/* 9 */             kb1.m6062o(arrayList, "transitionEvents list can't be null.");
/* 16 */            if (!arrayList.isEmpty()) {
/* 24 */                for (int i = 1; i < arrayList.size(); i++) {
/* 51 */                    kb1.m6054g(((ActivityTransitionEvent) arrayList.get(i)).f4104c >= ((ActivityTransitionEvent) arrayList.get(i + (-1))).f4104c);
                        }
                    }
/* 61 */            this.f4110a = Collections.unmodifiableList(arrayList);
/* 63 */            this.f4111b = bundle;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 5 */             if (obj == null || getClass() != obj.getClass()) {
/* 29 */                return false;
                    }
/* 24 */            return this.f4110a.equals(((ActivityTransitionResult) obj).f4110a);
                }

                public final int hashCode() {
/* 3 */             return this.f4110a.hashCode();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 1 */             kb1.m6061n(parcel);
/* 6 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 14 */            w11.m9414X(parcel, 1, this.f4110a, false);
/* 20 */            w11.m9402L(parcel, 2, this.f4111b, false);
/* 23 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
