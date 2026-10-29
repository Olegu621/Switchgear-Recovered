            package com.google.android.gms.drive.query;

            import android.os.Parcel;
            import android.os.Parcelable;
            import android.text.TextUtils;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import java.util.ArrayList;
            import java.util.List;
            import java.util.Locale;
            import p000.re3;
            import p000.w11;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class SortOrder extends AbstractSafeParcelable {
                public static final Parcelable.Creator<SortOrder> CREATOR = new re3(20);

                /* JADX INFO: renamed from: a */
                public final List f3697a;

                /* JADX INFO: renamed from: b */
                public final boolean f3698b;

                public SortOrder(ArrayList arrayList, boolean z) {
/* 4 */             this.f3697a = arrayList;
/* 6 */             this.f3698b = z;
                }

                public final String toString() {
/* 1 */             Locale locale = Locale.US;
/* 36 */            return "SortOrder[" + TextUtils.join(",", this.f3697a) + ", " + this.f3698b + "]";
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9414X(parcel, 1, this.f3697a, false);
/* 16 */            w11.m9420b0(parcel, 2, 4);
/* 21 */            parcel.writeInt(this.f3698b ? 1 : 0);
/* 24 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
