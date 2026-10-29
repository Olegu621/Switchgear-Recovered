            package com.google.android.libraries.play.games.internal;

            import android.os.Parcel;
            import android.os.Parcelable;
            import p000.cm3;
            import p000.qc3;
            import p000.re3;
            import p000.wr3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzcl implements Parcelable {

                /* JADX INFO: renamed from: a */
                public final wr3 f4281a;

                /* JADX INFO: renamed from: b */
                public final cm3 f4282b;

                /* JADX INFO: renamed from: c */
                public static final qc3 f4280c = qc3.m7764q("com/google/android/libraries/play/logging/ulex/common/play/logsystem/PlayGlobalDimensionData");
                public static final Parcelable.Creator<zzcl> CREATOR = new re3(22);

                public zzcl(wr3 wr3Var, cm3 cm3Var) {
/* 4 */             this.f4281a = wr3Var;
/* 6 */             this.f4282b = cm3Var;
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
/* 1 */             return 0;
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             byte[] bArrM8813a = this.f4281a.m8813a();
/* 7 */             int length = bArrM8813a.length;
/* 10 */            byte[] bArrM8813a2 = this.f4282b.m8813a();
/* 14 */            int length2 = bArrM8813a2.length;
/* 15 */            parcel.writeInt(length);
/* 18 */            parcel.writeByteArray(bArrM8813a);
/* 21 */            parcel.writeInt(length2);
/* 24 */            parcel.writeByteArray(bArrM8813a2);
                }
            }
