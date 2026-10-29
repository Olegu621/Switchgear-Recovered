            package com.google.android.gms.drive.query;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import com.google.android.gms.drive.query.internal.zzr;
            import java.util.ArrayList;
            import java.util.List;
            import java.util.Locale;
            import p000.md3;
            import p000.w11;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class Query extends AbstractSafeParcelable {
                public static final Parcelable.Creator<Query> CREATOR = new md3(12);

                /* JADX INFO: renamed from: a */
                public final zzr f3690a;

                /* JADX INFO: renamed from: b */
                public final String f3691b;

                /* JADX INFO: renamed from: c */
                public final SortOrder f3692c;

                /* JADX INFO: renamed from: d */
                public final List f3693d;

                /* JADX INFO: renamed from: e */
                public final boolean f3694e;

                /* JADX INFO: renamed from: f */
                public final List f3695f;

                /* JADX INFO: renamed from: i */
                public final boolean f3696i;

                public Query(zzr zzrVar, String str, SortOrder sortOrder, List list, boolean z, ArrayList arrayList, boolean z2) {
/* 4 */             this.f3690a = zzrVar;
/* 6 */             this.f3691b = str;
/* 8 */             this.f3692c = sortOrder;
/* 10 */            this.f3693d = list;
/* 12 */            this.f3694e = z;
/* 14 */            this.f3695f = arrayList;
/* 16 */            this.f3696i = z2;
                }

                public final String toString() {
/* 17 */            return String.format(Locale.US, "Query[%s,%s,PageToken=%s,Spaces=%s]", this.f3690a, this.f3692c, this.f3691b, this.f3695f);
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9409S(parcel, 1, this.f3690a, i, false);
/* 17 */            w11.m9410T(parcel, 3, this.f3691b, false);
/* 23 */            w11.m9409S(parcel, 4, this.f3692c, i, false);
/* 29 */            w11.m9412V(parcel, this.f3693d, 5);
/* 33 */            w11.m9420b0(parcel, 6, 4);
/* 38 */            parcel.writeInt(this.f3694e ? 1 : 0);
/* 44 */            w11.m9414X(parcel, 7, this.f3695f, false);
/* 49 */            w11.m9420b0(parcel, 8, 4);
/* 54 */            parcel.writeInt(this.f3696i ? 1 : 0);
/* 57 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
