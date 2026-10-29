            package com.google.firebase;

            import android.os.Parcel;
            import android.os.Parcelable;
            import kotlin.Metadata;
            import kotlin.jvm.functions.Function1;
            import okhttp3.HttpUrl;
            import p000.AbstractC0886en;
            import p000.C1772ix;
            import p000.ds0;
            import p000.fm0;
            import p000.pm2;
            import p000.po2;
            import p000.qd3;
            import p000.qo2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002¨\u0006\u0003"}, m6176d2 = {"Lcom/google/firebase/Timestamp;", HttpUrl.FRAGMENT_ENCODE_SET, "Landroid/os/Parcelable;", "com.google.firebase-firebase-common"}, m6177k = 1, m6178mv = {1, 8, 0}, m6180xi = 48)
            public final class Timestamp implements Comparable<Timestamp>, Parcelable {
                public static final Parcelable.Creator<Timestamp> CREATOR = new qd3(13);

                /* JADX INFO: renamed from: a */
                public final long f5282a;

                /* JADX INFO: renamed from: b */
                public final int f5283b;

                public Timestamp(int i, long j) {
/* 4 */             if (i < 0 || i >= 1000000000) {
/* 51 */                ds0.m3200q(fm0.m3781g(i, "Timestamp nanoseconds out of range: "));
/* 55 */                throw null;
                    }
/* 18 */            if (-62135596800L > j || j >= 253402300800L) {
/* 40 */                ds0.m3200q(pm2.m7488k("Timestamp seconds out of range: ", j));
/* 44 */                throw null;
                    }
/* 29 */            this.f5282a = j;
/* 31 */            this.f5283b = i;
                }

                @Override // java.lang.Comparable
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final int compareTo(Timestamp timestamp) {
/* 1 */             timestamp.getClass();
/* 5 */             Function1[] function1Arr = {po2.f15222b, qo2.f15675b};
/* 18 */            for (int i = 0; i < 2; i++) {
/* 20 */                Function1 function1 = function1Arr[i];
/* 34 */                int iM5609a = C1772ix.m5609a((Comparable) function1.invoke(this), (Comparable) function1.invoke(timestamp));
/* 38 */                if (iM5609a != 0) {
/* 40 */                    return iM5609a;
                        }
                    }
/* 9 */             return 0;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
/* 1 */             return 0;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj != this) {
                        return (obj instanceof Timestamp) && compareTo((Timestamp) obj) == 0;
                    }
/* 18 */            return true;
                }

                public final int hashCode() {
/* 1 */             long j = this.f5282a;
/* 15 */            return (((((int) j) * 1369) + ((int) (j >> 32))) * 37) + this.f5283b;
                }

                public final String toString() {
/* 5 */             StringBuilder sb = new StringBuilder("Timestamp(seconds=");
/* 10 */            sb.append(this.f5282a);
/* 15 */            sb.append(", nanoseconds=");
/* 22 */            return AbstractC0886en.m3510n(sb, this.f5283b, ')');
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 1 */             parcel.getClass();
/* 6 */             parcel.writeLong(this.f5282a);
/* 11 */            parcel.writeInt(this.f5283b);
                }
            }
