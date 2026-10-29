            package com.google.android.gms.auth.api.accounttransfer;

            import android.os.Parcel;
            import android.os.Parcelable;
            import com.google.android.gms.common.server.response.FastJsonResponse$Field;
            import com.google.android.gms.internal.auth.zzbz;
            import io.sentry.C1697u2;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Map;
            import p000.dr3;
            import p000.f42;
            import p000.fm0;
            import p000.w11;
            import p000.wg0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzu extends zzbz {
                public static final Parcelable.Creator<zzu> CREATOR = new dr3(16);

                /* JADX INFO: renamed from: i */
                public static final HashMap f3261i;

                /* JADX INFO: renamed from: a */
                public final HashSet f3262a;

                /* JADX INFO: renamed from: b */
                public final int f3263b;

                /* JADX INFO: renamed from: c */
                public zzw f3264c;

                /* JADX INFO: renamed from: d */
                public String f3265d;

                /* JADX INFO: renamed from: e */
                public String f3266e;

                /* JADX INFO: renamed from: f */
                public final String f3267f;

                static {
/* 12 */            HashMap map = new HashMap();
/* 15 */            f3261i = map;
/* 32 */            map.put("authenticatorInfo", new FastJsonResponse$Field(11, false, 11, false, "authenticatorInfo", 2, zzw.class));
/* 48 */            map.put("signature", new FastJsonResponse$Field(7, false, 7, false, "signature", 3, null));
/* 70 */            map.put("package", new FastJsonResponse$Field(7, false, 7, false, "package", 4, null));
                }

                public zzu(HashSet hashSet, int i, zzw zzwVar, String str, String str2, String str3) {
/* 4 */             this.f3262a = hashSet;
/* 6 */             this.f3263b = i;
/* 8 */             this.f3264c = zzwVar;
/* 10 */            this.f3265d = str;
/* 12 */            this.f3266e = str2;
/* 14 */            this.f3267f = str3;
                }

                @Override // p000.wg0
                public final void addConcreteTypeInternal(FastJsonResponse$Field fastJsonResponse$Field, String str, wg0 wg0Var) {
/* 1 */             int i = fastJsonResponse$Field.f3581i;
/* 4 */             if (i != 2) {
/* 38 */                C1697u2.m5437m("Field with id=%d is not a known custom type. Found %s", new Object[]{Integer.valueOf(i), wg0Var.getClass().getCanonicalName()});
                    } else {
/* 8 */                 this.f3264c = (zzw) wg0Var;
/* 16 */                this.f3262a.add(Integer.valueOf(i));
                    }
                }

                @Override // p000.wg0
                public final /* synthetic */ Map getFieldMappings() {
/* 1 */             return f3261i;
                }

                @Override // p000.wg0
                public final Object getFieldValue(FastJsonResponse$Field fastJsonResponse$Field) {
/* 1 */             int i = fastJsonResponse$Field.f3581i;
/* 4 */             if (i == 1) {
/* 37 */                return Integer.valueOf(this.f3263b);
                    }
/* 7 */             if (i == 2) {
/* 32 */                return this.f3264c;
                    }
/* 10 */            if (i == 3) {
/* 29 */                return this.f3265d;
                    }
/* 13 */            if (i == 4) {
/* 15 */                return this.f3266e;
                    }
/* 24 */            f42.m3656l(fm0.m3781g(i, "Unknown SafeParcelable id="));
/* 27 */            return null;
                }

                @Override // p000.wg0
                public final boolean isFieldSet(FastJsonResponse$Field fastJsonResponse$Field) {
/* 9 */             return this.f3262a.contains(Integer.valueOf(fastJsonResponse$Field.f3581i));
                }

                @Override // p000.wg0
                public final void setStringInternal(FastJsonResponse$Field fastJsonResponse$Field, String str, String str2) {
/* 1 */             int i = fastJsonResponse$Field.f3581i;
/* 4 */             if (i == 3) {
/* 26 */                this.f3265d = str2;
                    } else {
/* 7 */                 if (i != 4) {
/* 22 */                    C1697u2.m5437m("Field with id=%d is not known to be a string.", new Object[]{Integer.valueOf(i)});
/* 25 */                    return;
                        }
/* 9 */                 this.f3266e = str2;
                    }
/* 34 */            this.f3262a.add(Integer.valueOf(i));
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 12 */            HashSet hashSet = this.f3262a;
/* 19 */            if (hashSet.contains(1)) {
/* 21 */                w11.m9420b0(parcel, 1, 4);
/* 26 */                parcel.writeInt(this.f3263b);
                    }
/* 38 */            if (hashSet.contains(2)) {
/* 42 */                w11.m9409S(parcel, 2, this.f3264c, i, true);
                    }
/* 54 */            if (hashSet.contains(3)) {
/* 58 */                w11.m9410T(parcel, 3, this.f3265d, true);
                    }
/* 69 */            if (hashSet.contains(4)) {
/* 73 */                w11.m9410T(parcel, 4, this.f3266e, true);
                    }
/* 85 */            if (hashSet.contains(5)) {
/* 89 */                w11.m9410T(parcel, 5, this.f3267f, true);
                    }
/* 92 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
