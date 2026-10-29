            package com.google.android.gms.measurement.internal;

            import android.os.Bundle;
            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.util.Iterator;
            import p000.md3;
            import p000.w11;
            import p000.yx2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzbe extends AbstractSafeParcelable implements Iterable<String> {
                public static final Parcelable.Creator<zzbe> CREATOR = new md3(28);

                /* JADX INFO: renamed from: a */
                public final Bundle f4207a;

                public zzbe(Bundle bundle) {
/* 4 */             this.f4207a = bundle;
                }

                /* JADX INFO: renamed from: D1 */
                public final Object m2164D1(String str) {
/* 3 */             return this.f4207a.get(str);
                }

                /* JADX INFO: renamed from: E1 */
                public final Double m2165E1() {
/* 9 */             return Double.valueOf(this.f4207a.getDouble(FirebaseAnalytics.Param.VALUE));
                }

                /* JADX INFO: renamed from: F1 */
                public final String m2166F1() {
/* 5 */             return this.f4207a.getString(FirebaseAnalytics.Param.CURRENCY);
                }

                /* JADX INFO: renamed from: G1 */
                public final Bundle m2167G1() {
/* 5 */             return new Bundle(this.f4207a);
                }

                @Override // java.lang.Iterable
                public final Iterator<String> iterator() {
/* 3 */             return new yx2(this);
                }

                public final String toString() {
/* 3 */             return this.f4207a.toString();
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 13 */            w11.m9402L(parcel, 2, m2167G1(), false);
/* 16 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
