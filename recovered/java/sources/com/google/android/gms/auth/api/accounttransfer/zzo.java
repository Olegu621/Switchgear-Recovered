            package com.google.android.gms.auth.api.accounttransfer;

            import android.os.Parcel;
            import android.os.Parcelable;
            import androidx.core.app.NotificationCompat;
            import com.google.android.gms.common.server.response.FastJsonResponse$Field;
            import com.google.android.gms.internal.auth.zzbz;
            import io.sentry.C1697u2;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Map;
            import p000.cl3;
            import p000.f42;
            import p000.fm0;
            import p000.w11;
            import p000.wg0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzo extends zzbz {
                public static final Parcelable.Creator<zzo> CREATOR = new cl3(20);

                /* JADX INFO: renamed from: f */
                public static final HashMap f3248f;

                /* JADX INFO: renamed from: a */
                public final HashSet f3249a;

                /* JADX INFO: renamed from: b */
                public final int f3250b;

                /* JADX INFO: renamed from: c */
                public ArrayList f3251c;

                /* JADX INFO: renamed from: d */
                public final int f3252d;

                /* JADX INFO: renamed from: e */
                public zzs f3253e;

                static {
/* 12 */            HashMap map = new HashMap();
/* 15 */            f3248f = map;
/* 34 */            map.put("authenticatorData", new FastJsonResponse$Field(11, true, 11, true, "authenticatorData", 2, zzu.class));
/* 52 */            map.put(NotificationCompat.CATEGORY_PROGRESS, new FastJsonResponse$Field(11, false, 11, false, NotificationCompat.CATEGORY_PROGRESS, 4, zzs.class));
                }

                public zzo(HashSet hashSet, int i, ArrayList arrayList, int i2, zzs zzsVar) {
/* 4 */             this.f3249a = hashSet;
/* 6 */             this.f3250b = i;
/* 8 */             this.f3251c = arrayList;
/* 10 */            this.f3252d = i2;
/* 12 */            this.f3253e = zzsVar;
                }

                @Override // p000.wg0
                public final void addConcreteTypeArrayInternal(FastJsonResponse$Field fastJsonResponse$Field, String str, ArrayList arrayList) {
/* 1 */             int i = fastJsonResponse$Field.f3581i;
/* 4 */             if (i != 2) {
/* 36 */                C1697u2.m5437m("Field with id=%d is not a known ConcreteTypeArray type. Found %s", new Object[]{Integer.valueOf(i), arrayList.getClass().getCanonicalName()});
                    } else {
/* 6 */                 this.f3251c = arrayList;
/* 14 */                this.f3249a.add(Integer.valueOf(i));
                    }
                }

                @Override // p000.wg0
                public final void addConcreteTypeInternal(FastJsonResponse$Field fastJsonResponse$Field, String str, wg0 wg0Var) {
/* 1 */             int i = fastJsonResponse$Field.f3581i;
/* 4 */             if (i != 4) {
/* 38 */                C1697u2.m5437m("Field with id=%d is not a known custom type. Found %s", new Object[]{Integer.valueOf(i), wg0Var.getClass().getCanonicalName()});
                    } else {
/* 8 */                 this.f3253e = (zzs) wg0Var;
/* 16 */                this.f3249a.add(Integer.valueOf(i));
                    }
                }

                @Override // p000.wg0
                public final /* synthetic */ Map getFieldMappings() {
/* 1 */             return f3248f;
                }

                @Override // p000.wg0
                public final Object getFieldValue(FastJsonResponse$Field fastJsonResponse$Field) {
/* 1 */             int i = fastJsonResponse$Field.f3581i;
/* 4 */             if (i == 1) {
/* 31 */                return Integer.valueOf(this.f3250b);
                    }
/* 7 */             if (i == 2) {
/* 26 */                return this.f3251c;
                    }
/* 10 */            if (i == 4) {
/* 12 */                return this.f3253e;
                    }
/* 21 */            f42.m3656l(fm0.m3781g(i, "Unknown SafeParcelable id="));
/* 24 */            return null;
                }

                @Override // p000.wg0
                public final boolean isFieldSet(FastJsonResponse$Field fastJsonResponse$Field) {
/* 9 */             return this.f3249a.contains(Integer.valueOf(fastJsonResponse$Field.f3581i));
                }

                @Override // android.os.Parcelable
                public final void writeToParcel(Parcel parcel, int i) {
/* 3 */             int iM9422c0 = w11.m9422c0(20293, parcel);
/* 12 */            HashSet hashSet = this.f3249a;
/* 19 */            if (hashSet.contains(1)) {
/* 21 */                w11.m9420b0(parcel, 1, 4);
/* 26 */                parcel.writeInt(this.f3250b);
                    }
/* 38 */            if (hashSet.contains(2)) {
/* 42 */                w11.m9414X(parcel, 2, this.f3251c, true);
                    }
/* 54 */            if (hashSet.contains(3)) {
/* 56 */                w11.m9420b0(parcel, 3, 4);
/* 61 */                parcel.writeInt(this.f3252d);
                    }
/* 72 */            if (hashSet.contains(4)) {
/* 76 */                w11.m9409S(parcel, 4, this.f3253e, i, true);
                    }
/* 79 */            w11.m9428f0(iM9422c0, parcel);
                }
            }
