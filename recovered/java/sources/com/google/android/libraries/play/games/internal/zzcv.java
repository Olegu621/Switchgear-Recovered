            package com.google.android.libraries.play.games.internal;

            import android.os.Parcel;
            import android.os.Parcelable;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.Objects;
            import p000.AbstractC0208c9;
            import p000.eo3;
            import p000.ig3;
            import p000.lg3;
            import p000.lq3;
            import p000.mg3;
            import p000.on3;
            import p000.qc3;
            import p000.re3;
            import p000.rg3;
            import p000.sr3;
            import p000.tr3;
            import p000.uo3;
            import p000.wx2;
            import p000.yp3;
            import p000.zn3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class zzcv implements Parcelable {

                /* JADX INFO: renamed from: a */
                public final ig3 f4288a;

                /* JADX INFO: renamed from: b */
                public final HashSet f4289b;

                /* JADX INFO: renamed from: c */
                public final sr3 f4290c;

                /* JADX INFO: renamed from: d */
                public final long f4291d;

                /* JADX INFO: renamed from: e */
                public static final qc3 f4287e = qc3.m7764q("com/google/android/libraries/play/logging/ulex/common/play/logsystem/UlexNodeWrapper");
                public static final Parcelable.Creator<zzcv> CREATOR = new re3(25);

                public zzcv(sr3 sr3Var, HashSet hashSet, ig3 ig3Var, long j) {
/* 4 */             this.f4290c = sr3Var;
/* 6 */             this.f4289b = hashSet;
/* 8 */             this.f4288a = ig3Var;
/* 10 */            this.f4291d = j;
                }

                /* JADX INFO: renamed from: a */
                public static sr3 m2199a(int i, Parcel parcel) {
/* 9 */             byte[] bArr = new byte[i <= 0 ? -i : parcel.readInt()];
/* 11 */            parcel.readByteArray(bArr);
                    try {
/* 18 */                tr3 tr3VarM8882o = tr3.m8882o(bArr, on3.m7216a());
/* 28 */                zn3 zn3Var = (zn3) tr3VarM8882o.mo317l(5, null);
/* 36 */                if (!zn3Var.f20274a.equals(tr3VarM8882o)) {
/* 44 */                    if (!zn3Var.f20275b.m3545m()) {
/* 46 */                        zn3Var.mo3152a();
                            }
/* 49 */                    eo3 eo3Var = zn3Var.f20275b;
/* 61 */                    yp3.f19747c.m10168a(eo3Var.getClass()).zzd(eo3Var, tr3VarM8882o);
                        }
/* 64 */                return (sr3) zn3Var;
                    } catch (uo3 e) {
/* 94 */                ((rg3) ((rg3) f4287e.m7771o().mo6983b(e)).mo6982a(112, "com/google/android/libraries/play/logging/ulex/common/play/logsystem/UlexNodeWrapper", "readUiNodeBuilderFromParcel", "UlexNodeWrapper.java")).zzq();
/* 97 */                return tr3.m8883p();
                    }
                }

                /* JADX INFO: renamed from: b */
                public static HashSet m2200b(Parcel parcel) {
/* 3 */             ArrayList arrayList = new ArrayList();
/* 6 */             int i = parcel.readInt();
/* 11 */            for (int i2 = 0; i2 < i; i2++) {
/* 25 */                arrayList.add((zzcv) parcel.readParcelable(zzcv.class.getClassLoader()));
                    }
/* 33 */            return new HashSet(arrayList);
                }

                /* JADX INFO: renamed from: d */
                public static ig3 m2201d(int i, Parcel parcel) {
/* 1 */             if (i <= 0) {
/* 81 */                int i2 = ig3.f9584c;
/* 83 */                return lg3.f13271U;
                    }
/* 4 */             Object[] objArrCopyOf = new Object[4];
/* 6 */             int i3 = parcel.readInt();
/* 11 */            int i4 = 0;
/* 13 */            while (i3 != 0) {
/* 19 */                Integer numValueOf = Integer.valueOf(parcel.readInt());
/* 23 */                int i5 = i4 + 1;
/* 25 */                int length = objArrCopyOf.length;
/* 26 */                if (length < i5) {
/* 31 */                    int i6 = length + (length >> 1) + 1;
/* 32 */                    if (i6 < i5) {
/* 34 */                        int iHighestOneBit = Integer.highestOneBit(i4);
/* 38 */                        i6 = iHighestOneBit + iHighestOneBit;
                            }
/* 40 */                    if (i6 < 0) {
/* 42 */                        i6 = AbstractC0208c9.API_PRIORITY_OTHER;
                            }
/* 45 */                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, i6);
                        }
/* 49 */                objArrCopyOf[i4] = numValueOf;
/* 51 */                i3--;
/* 53 */                i4 = i5;
                    }
/* 55 */            if (i4 == 0) {
/* 78 */                return lg3.f13271U;
                    }
/* 57 */            if (i4 != 1) {
/* 59 */                ig3 ig3VarM4529g = ig3.m4529g(i4, objArrCopyOf);
/* 63 */                ig3VarM4529g.size();
/* 66 */                return ig3VarM4529g;
                    }
/* 67 */            Object obj = objArrCopyOf[0];
/* 69 */            Objects.requireNonNull(obj);
/* 74 */            return new mg3(obj);
                }

                @Override // android.os.Parcelable
                public final int describeContents() {
/* 1 */             return 0;
                }

                /* JADX INFO: renamed from: e */
                public final void m2202e(Parcel parcel) {
/* 1 */             ig3 ig3Var = this.f4288a;
/* 7 */             parcel.writeInt(ig3Var.size());
/* 10 */            wx2 wx2VarMo4530e = ig3Var.mo4530e();
/* 18 */            while (wx2VarMo4530e.hasNext()) {
/* 30 */                parcel.writeInt(((Integer) wx2VarMo4530e.next()).intValue());
                    }
                }

                @Override // android.os.Parcelable
                public void writeToParcel(Parcel parcel, int i) {
/* 3 */             parcel.writeLong(this.f4291d);
/* 7 */             parcel.writeInt(-1);
/* 12 */            eo3 eo3VarMo3153b = this.f4290c.mo3153b();
/* 16 */            eo3VarMo3153b.getClass();
/* 24 */            if (!eo3.m3538h(eo3VarMo3153b, true)) {
/* 78 */                throw new lq3();
                    }
/* 28 */            byte[] bArrM8813a = ((tr3) eo3VarMo3153b).m8813a();
/* 33 */            parcel.writeInt(bArrM8813a.length);
/* 36 */            parcel.writeByteArray(bArrM8813a);
/* 39 */            HashSet hashSet = this.f4289b;
/* 45 */            parcel.writeInt(hashSet.size());
/* 48 */            Iterator it = hashSet.iterator();
/* 56 */            while (it.hasNext()) {
/* 65 */                parcel.writeParcelable((zzcv) it.next(), 0);
                    }
/* 69 */            m2202e(parcel);
                }
            }
