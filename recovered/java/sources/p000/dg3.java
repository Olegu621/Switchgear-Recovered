            package p000;

            import android.content.Context;
            import com.google.android.gms.internal.measurement.zzoy;
            import com.google.android.gms.internal.measurement.zzpb;
            import com.google.android.gms.internal.measurement.zzph;
            import com.google.android.gms.internal.measurement.zzpz;
            import com.google.android.gms.internal.measurement.zzql;
            import com.google.android.gms.internal.measurement.zzqu;
            import com.google.android.gms.internal.measurement.zzqx;
            import java.util.List;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class dg3 implements te3, tb0, vb0 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f7189a;

                /* JADX INFO: renamed from: b */
                public static final /* synthetic */ dg3 f7181b = new dg3(0);

                /* JADX INFO: renamed from: c */
                public static final /* synthetic */ dg3 f7182c = new dg3(2);

                /* JADX INFO: renamed from: d */
                public static final /* synthetic */ dg3 f7183d = new dg3(3);

                /* JADX INFO: renamed from: e */
                public static final /* synthetic */ dg3 f7184e = new dg3(4);

                /* JADX INFO: renamed from: f */
                public static final /* synthetic */ dg3 f7185f = new dg3(5);

                /* JADX INFO: renamed from: i */
                public static final /* synthetic */ dg3 f7186i = new dg3(6);

                /* JADX INFO: renamed from: v */
                public static final /* synthetic */ dg3 f7187v = new dg3(7);

                /* JADX INFO: renamed from: w */
                public static final /* synthetic */ dg3 f7188w = new dg3(8);

                /* JADX INFO: renamed from: U */
                public static final /* synthetic */ dg3 f7178U = new dg3(9);

                /* JADX INFO: renamed from: V */
                public static final /* synthetic */ dg3 f7179V = new dg3(10);

                /* JADX INFO: renamed from: W */
                public static final /* synthetic */ dg3 f7180W = new dg3(11);

                public /* synthetic */ dg3(int i) {
/* 1 */             this.f7189a = i;
                }

                @Override // p000.tb0
                /* JADX INFO: renamed from: a */
                public int mo3064a(Context context, String str, boolean z) {
/* 1 */             return wb0.m9514d(context, str, z);
                }

                @Override // p000.tb0
                /* JADX INFO: renamed from: b */
                public int mo3065b(Context context, String str) {
/* 1 */             return wb0.m9512a(context, str);
                }

                @Override // p000.vb0
                /* JADX INFO: renamed from: c */
                public ub0 mo1653c(Context context, String str, tb0 tb0Var) {
                    int iMo3064a;
/* 3 */             ub0 ub0Var = new ub0();
/* 6 */             int iMo3065b = tb0Var.mo3065b(context, str);
/* 10 */            ub0Var.f17435a = iMo3065b;
/* 12 */            int i = 1;
/* 13 */            int i2 = 0;
/* 14 */            if (iMo3065b != 0) {
/* 16 */                iMo3064a = tb0Var.mo3064a(context, str, false);
/* 20 */                ub0Var.f17436b = iMo3064a;
                    } else {
/* 23 */                iMo3064a = tb0Var.mo3064a(context, str, true);
/* 27 */                ub0Var.f17436b = iMo3064a;
                    }
/* 29 */            int i3 = ub0Var.f17435a;
/* 31 */            if (i3 == 0) {
/* 33 */                if (iMo3064a == 0) {
/* 35 */                    i = 0;
                        }
/* 41 */                ub0Var.f17437c = i;
/* 43 */                return ub0Var;
                    }
/* 37 */            i2 = i3;
/* 38 */            if (i2 >= iMo3064a) {
/* 40 */                i = -1;
                    }
/* 41 */            ub0Var.f17437c = i;
/* 43 */            return ub0Var;
                }

                @Override // p000.te3
                public /* synthetic */ Object zza() {
                    switch (this.f7189a) {
                        case 0:
/* 115 */                   List list = vg3.f18115a;
/* 122 */                   return Integer.valueOf((int) zzpb.zza());
                        case 1:
                        default:
/* 12 */                    return new Boolean(zzqx.zza());
                        case 2:
/* 104 */                   List list2 = vg3.f18115a;
/* 110 */                   return Boolean.valueOf(zzqu.zzb());
                        case 3:
/* 93 */                    List list3 = vg3.f18115a;
/* 99 */                    return Boolean.valueOf(zzql.zzg());
                        case 4:
/* 82 */                    List list4 = vg3.f18115a;
/* 88 */                    return Boolean.valueOf(zzql.zzb());
                        case 5:
/* 71 */                    List list5 = vg3.f18115a;
/* 77 */                    return Boolean.valueOf(zzql.zzh());
                        case 6:
/* 60 */                    List list6 = vg3.f18115a;
/* 66 */                    return Boolean.valueOf(zzql.zzf());
                        case 7:
/* 49 */                    List list7 = vg3.f18115a;
/* 55 */                    return Boolean.valueOf(zzph.zza());
                        case 8:
/* 38 */                    List list8 = vg3.f18115a;
/* 44 */                    return Boolean.valueOf(zzql.zze());
                        case 9:
/* 26 */                    List list9 = vg3.f18115a;
/* 33 */                    return Integer.valueOf((int) zzoy.zzan());
                        case 10:
/* 22 */                    return new Boolean(zzpz.zza());
                    }
                }
            }
