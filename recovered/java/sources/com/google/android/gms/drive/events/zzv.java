            package com.google.android.gms.drive.events;

            import android.os.Parcel;
            import android.os.Parcelable;
            import android.text.TextUtils;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.List;
            import p000.de3;
            import p000.dr3;
            import p000.fm0;
            import p000.w11;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzv extends AbstractSafeParcelable implements DriveEvent {
                public static final Parcelable.Creator<zzv> CREATOR = new dr3(18);

                /* JADX INFO: renamed from: a */
                public final List f3675a;

                public zzv(ArrayList arrayList) {
/* 4 */             this.f3675a = arrayList;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (obj == null || obj.getClass() != zzv.class) {
/* 27 */                return false;
                    }
/* 12 */            if (obj == this) {
/* 14 */                return true;
                    }
/* 22 */            return de3.m3029k(this.f3675a, ((zzv) obj).f3675a);
                }

                @Override // com.google.android.gms.drive.events.DriveEvent
                public final int getType() {
/* 1 */             return 7;
                }

                public final int hashCode() {
/* 7 */             return Arrays.hashCode(new Object[]{this.f3675a});
                }

                public final String toString() {
/* 13 */            return fm0.m3784j("TransferStateEvent[", TextUtils.join("','", this.f3675a), "]");
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 11 */            w11.m9414X(parcel, 3, this.f3675a, false);
/* 14 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
