            package com.google.android.gms.drive.events;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.List;
            import p000.de3;
            import p000.tf3;
            import p000.w11;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zze extends AbstractSafeParcelable {
                public static final Parcelable.Creator<zze> CREATOR = new tf3(10);

                /* JADX INFO: renamed from: a */
                public final int f3667a;

                /* JADX INFO: renamed from: b */
                public final boolean f3668b;

                /* JADX INFO: renamed from: c */
                public final List f3669c;

                public zze(int i, boolean z, ArrayList arrayList) {
/* 4 */             this.f3667a = i;
/* 6 */             this.f3668b = z;
/* 8 */             this.f3669c = arrayList;
                }

                public final boolean equals(Object obj) {
/* 2 */             if (obj != null && obj.getClass() == zze.class) {
/* 14 */                if (obj == this) {
/* 13 */                    return true;
                        }
/* 17 */                zze zzeVar = (zze) obj;
/* 27 */                if (de3.m3029k(this.f3669c, zzeVar.f3669c) && this.f3667a == zzeVar.f3667a && this.f3668b == zzeVar.f3668b) {
/* 13 */                    return true;
                        }
                    }
/* 1 */             return false;
                }

                public final int hashCode() {
/* 19 */            return Arrays.hashCode(new Object[]{this.f3669c, Integer.valueOf(this.f3667a), Boolean.valueOf(this.f3668b)});
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 9 */             w11.m9420b0(parcel, 2, 4);
/* 14 */            parcel.writeInt(this.f3667a);
/* 18 */            w11.m9420b0(parcel, 3, 4);
/* 23 */            parcel.writeInt(this.f3668b ? 1 : 0);
/* 29 */            w11.m9414X(parcel, 4, this.f3669c, false);
/* 32 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
