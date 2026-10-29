            package com.google.android.gms.common.data;

            import android.os.Parcel;
            import android.os.ParcelFileDescriptor;
            import android.os.Parcelable;
            import com.google.android.gms.common.internal.ReflectedParcelable;
            import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
            import p000.kb1;
            import p000.qd3;
            import p000.w11;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class BitmapTeleporter extends AbstractSafeParcelable implements ReflectedParcelable {
                public static final Parcelable.Creator<BitmapTeleporter> CREATOR = new qd3(15);

                /* JADX INFO: renamed from: a */
                public final int f3460a;

                /* JADX INFO: renamed from: b */
                public ParcelFileDescriptor f3461b;

                /* JADX INFO: renamed from: c */
                public final int f3462c;

                public BitmapTeleporter(int i, ParcelFileDescriptor parcelFileDescriptor, int i2) {
/* 4 */             this.f3460a = i;
/* 6 */             this.f3461b = parcelFileDescriptor;
/* 8 */             this.f3462c = i2;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 4 */             if (this.f3461b == null) {
/* 45 */                kb1.m6061n(null);
/* 48 */                throw null;
                    }
/* 10 */            int iM9422c0 = w11.m9422c0(20293, parcel);
/* 15 */            w11.m9420b0(parcel, 1, 4);
/* 20 */            parcel.writeInt(this.f3460a);
/* 27 */            w11.m9409S(parcel, 2, this.f3461b, i | 1, false);
/* 31 */            w11.m9420b0(parcel, 3, 4);
/* 36 */            parcel.writeInt(this.f3462c);
/* 39 */            w11.m9428f0(iM9422c0, parcel);
/* 42 */            this.f3461b = null;
                }
            }
