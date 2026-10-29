            package com.google.android.gms.common.api;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.ReflectedParcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import p000.kb1;
            import p000.re3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class Scope extends AbstractSafeParcelable implements ReflectedParcelable {
                public static final Parcelable.Creator<Scope> CREATOR = new re3(28);

                /* JADX INFO: renamed from: a */
                public final int f3438a;

                /* JADX INFO: renamed from: b */
                public final String f3439b;

                public Scope(int i, String str) {
/* 6 */             kb1.m6059l(str, "scopeUri must not be null or empty");
/* 9 */             this.f3438a = i;
/* 11 */            this.f3439b = str;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 7 */             if (!(obj instanceof Scope)) {
/* 9 */                 return false;
                    }
/* 17 */            return this.f3439b.equals(((Scope) obj).f3439b);
                }

                public final int hashCode() {
/* 3 */             return this.f3439b.hashCode();
                }

                public final String toString() {
/* 1 */             return this.f3439b;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 9 */             w11.m9420b0(parcel, 1, 4);
/* 14 */            parcel.writeInt(this.f3438a);
/* 21 */            w11.m9410T(parcel, 2, this.f3439b, false);
/* 24 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
