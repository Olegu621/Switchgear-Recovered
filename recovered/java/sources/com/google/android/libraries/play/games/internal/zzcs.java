            package com.google.android.libraries.play.games.internal;

            import android.os.Parcel;
            import android.os.Parcelable;
            import java.security.SecureRandom;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.concurrent.atomic.AtomicLong;
            import p000.eo3;
            import p000.ig3;
            import p000.lq3;
            import p000.re3;
            import p000.sr3;
            import p000.tr3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzcs extends zzcv {
                public static final Parcelable.Creator<zzcs> CREATOR;

                /* JADX INFO: renamed from: f */
                public final long f4284f;

                /* JADX INFO: renamed from: i */
                public final zzcl f4285i;

                /* JADX INFO: renamed from: v */
                public final long f4286v;

                static {
/* 6 */             long jNextLong = new SecureRandom().nextLong();
/* 25 */            new AtomicLong(jNextLong == Long.MIN_VALUE ? 1L : Math.abs(jNextLong));
/* 35 */            CREATOR = new re3(24);
                }

                public /* synthetic */ zzcs(sr3 sr3Var, HashSet hashSet, ig3 ig3Var, long j, long j2, zzcl zzclVar, long j3) {
/* 1 */             super(sr3Var, hashSet, ig3Var, j);
/* 4 */             this.f4285i = zzclVar;
/* 6 */             this.f4284f = j2;
/* 8 */             this.f4286v = j3;
                }

                @Override // com.google.android.libraries.play.games.internal.zzcv, android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             parcel.writeLong(this.f4291d);
/* 7 */             parcel.writeInt(-1);
/* 12 */            eo3 eo3VarMo3153b = this.f4290c.mo3153b();
/* 16 */            eo3VarMo3153b.getClass();
/* 24 */            if (!eo3.m3538h(eo3VarMo3153b, true)) {
/* 93 */                throw new lq3();
                    }
/* 28 */            byte[] bArrM8813a = ((tr3) eo3VarMo3153b).m8813a();
/* 33 */            parcel.writeInt(bArrM8813a.length);
/* 36 */            parcel.writeByteArray(bArrM8813a);
/* 39 */            HashSet hashSet = this.f4289b;
/* 45 */            parcel.writeInt(hashSet.size());
/* 48 */            Iterator it = hashSet.iterator();
/* 57 */            while (it.hasNext()) {
/* 65 */                parcel.writeParcelable((zzcv) it.next(), 0);
                    }
/* 69 */            m2202e(parcel);
/* 74 */            parcel.writeLong(this.f4284f);
/* 79 */            parcel.writeParcelable(this.f4285i, 0);
/* 84 */            parcel.writeLong(this.f4286v);
                }
            }
