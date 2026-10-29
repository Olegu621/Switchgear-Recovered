            package com.google.android.gms.drive.query.internal;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import java.util.Locale;
            import p000.fm0;
            import p000.tf3;
            import p000.w11;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzf extends AbstractSafeParcelable {
                public static final Parcelable.Creator<zzf> CREATOR = new tf3(15);

                /* JADX INFO: renamed from: a */
                public final String f3714a;

                /* JADX INFO: renamed from: b */
                public final boolean f3715b;

                public zzf(String str, boolean z) {
/* 4 */             this.f3714a = str;
/* 6 */             this.f3715b = z;
                }

                public final String toString() {
/* 1 */             Locale locale = Locale.US;
/* 20 */            return fm0.m3785k("FieldWithSortOrder[", this.f3714a, " ", this.f3715b ? "ASC" : "DESC", "]");
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9410T(parcel, 1, this.f3714a, false);
/* 16 */            w11.m9420b0(parcel, 2, 4);
/* 21 */            parcel.writeInt(this.f3715b ? 1 : 0);
/* 24 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
