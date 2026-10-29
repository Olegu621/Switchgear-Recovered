            package p000;

            import android.content.Context;
            import com.google.android.gms.internal.measurement.zzov;
            import com.google.android.gms.internal.measurement.zzoy;
            import com.google.android.gms.internal.measurement.zzph;
            import com.google.android.gms.internal.measurement.zzpn;
            import com.google.android.gms.internal.measurement.zzqc;
            import com.google.android.gms.internal.measurement.zzql;
            import com.google.android.gms.internal.measurement.zzqo;
            import com.google.android.gms.internal.measurement.zzra;
            import com.google.android.gms.internal.measurement.zzrj;
            import java.util.List;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class cg3 implements te3, vb0 {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f2915a;

                /* JADX INFO: renamed from: b */
                public static final /* synthetic */ cg3 f2907b = new cg3(0);

                /* JADX INFO: renamed from: c */
                public static final /* synthetic */ cg3 f2908c = new cg3(1);

                /* JADX INFO: renamed from: d */
                public static final /* synthetic */ cg3 f2909d = new cg3(2);

                /* JADX INFO: renamed from: e */
                public static final /* synthetic */ cg3 f2910e = new cg3(3);

                /* JADX INFO: renamed from: f */
                public static final /* synthetic */ cg3 f2911f = new cg3(4);

                /* JADX INFO: renamed from: i */
                public static final /* synthetic */ cg3 f2912i = new cg3(5);

                /* JADX INFO: renamed from: v */
                public static final /* synthetic */ cg3 f2913v = new cg3(6);

                /* JADX INFO: renamed from: w */
                public static final /* synthetic */ cg3 f2914w = new cg3(7);

                /* JADX INFO: renamed from: U */
                public static final /* synthetic */ cg3 f2903U = new cg3(8);

                /* JADX INFO: renamed from: V */
                public static final /* synthetic */ cg3 f2904V = new cg3(9);

                /* JADX INFO: renamed from: W */
                public static final /* synthetic */ cg3 f2905W = new cg3(10);

                /* JADX INFO: renamed from: X */
                public static final /* synthetic */ cg3 f2906X = new cg3(11);

                public /* synthetic */ cg3(int i) {
/* 1 */             this.f2915a = i;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX INFO: renamed from: a */
                public static boolean m1652a(byte[] bArr, int i, int i2) {
                    int iM10426c;
/* 1 */             while (i < i2 && bArr[i] >= 0) {
/* 7 */                 i++;
                    }
/* 11 */            if (i >= i2) {
/* 13 */                iM10426c = 0;
                        break;
                    }
                    while (true) {
/* 16 */                if (i >= i2) {
/* 13 */                    iM10426c = 0;
                            break;
                        }
/* 19 */                int i3 = i + 1;
/* 21 */                iM10426c = bArr[i];
/* 23 */                if (iM10426c < 0) {
/* 30 */                    if (iM10426c >= -32) {
/* 49 */                        if (iM10426c >= -16) {
/* 87 */                            if (i3 < i2 - 2) {
/* 94 */                                int i4 = i + 2;
/* 96 */                                int i5 = bArr[i3];
/* 98 */                                if (i5 <= -65) {
/* 107 */                                   if ((((i5 + 112) + (iM10426c << 28)) >> 30) == 0) {
/* 109 */                                       int i6 = i + 3;
/* 113 */                                       if (bArr[i4] <= -65) {
/* 115 */                                           i += 4;
/* 119 */                                           if (bArr[i6] > -65) {
                                                    }
                                                }
                                            }
                                        }
/* 45 */                                iM10426c = -1;
                                        break;
                                    }
/* 89 */                            iM10426c = zq3.m10426c(bArr, i3, i2);
                                    break;
                                }
/* 53 */                        if (i3 < i2 - 1) {
/* 60 */                            int i7 = i + 2;
/* 62 */                            char c = bArr[i3];
/* 64 */                            if (c <= -65 && ((iM10426c != -32 || c >= -96) && (iM10426c != -19 || c < -96))) {
/* 78 */                                i += 3;
/* 82 */                                if (bArr[i7] > -65) {
                                        }
                                    }
/* 45 */                            iM10426c = -1;
                                    break;
                                }
/* 55 */                        iM10426c = zq3.m10426c(bArr, i3, i2);
                                break;
                            }
/* 32 */                    if (i3 >= i2) {
                                break;
                            }
/* 37 */                    if (iM10426c >= -62) {
/* 39 */                        i += 2;
/* 43 */                        if (bArr[i3] > -65) {
                                }
                            }
/* 45 */                    iM10426c = -1;
                            break;
                        }
/* 127 */               i = i3;
                    }
                    return iM10426c == 0;
                }

                /* JADX WARN: Code duplicated, block: B:11:0x0024  */
                /* JADX WARN: Code duplicated, block: B:9:0x0021 A[DONT_INVERT, PHI: r5
  0x0021: PHI (r5v2 int) = (r5v1 int), (r5v3 int) binds: [B:5:0x001a, B:7:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
                @Override // p000.vb0
                /* JADX INFO: renamed from: c */
                public ub0 mo1653c(Context context, String str, tb0 tb0Var) {
/* 3 */             int i = -1;
                    switch (this.f2915a) {
                        case 12:
/* 43 */                    ub0 ub0Var = new ub0();
/* 46 */                    int iMo3065b = tb0Var.mo3065b(context, str);
/* 50 */                    ub0Var.f17435a = iMo3065b;
/* 52 */                    if (iMo3065b != 0) {
/* 54 */                        ub0Var.f17437c = -1;
                            } else {
/* 57 */                        int iMo3064a = tb0Var.mo3064a(context, str, true);
/* 61 */                        ub0Var.f17436b = iMo3064a;
/* 63 */                        if (iMo3064a != 0) {
/* 65 */                            ub0Var.f17437c = 1;
                                }
                            }
/* 67 */                    return ub0Var;
                        default:
/* 10 */                    ub0 ub0Var2 = new ub0();
/* 17 */                    ub0Var2.f17435a = tb0Var.mo3065b(context, str);
/* 19 */                    int iMo3064a2 = tb0Var.mo3064a(context, str, true);
/* 23 */                    ub0Var2.f17436b = iMo3064a2;
/* 25 */                    int i2 = ub0Var2.f17435a;
/* 27 */                    if (i2 == 0) {
/* 29 */                        i2 = 0;
/* 30 */                        if (iMo3064a2 == 0) {
/* 32 */                            i = 0;
                                } else if (i2 < iMo3064a2) {
/* 37 */                            i = 1;
                                }
                            } else if (i2 < iMo3064a2) {
/* 37 */                        i = 1;
                            }
/* 38 */                    ub0Var2.f17437c = i;
/* 40 */                    return ub0Var2;
                    }
                }

                @Override // p000.te3
                public /* synthetic */ Object zza() {
                    switch (this.f2915a) {
                        case 0:
/* 127 */                   List list = vg3.f18115a;
/* 133 */                   return Boolean.valueOf(zzrj.zza());
                        case 1:
/* 116 */                   List list2 = vg3.f18115a;
/* 122 */                   return Boolean.valueOf(zzpn.zzb());
                        case 2:
/* 105 */                   List list3 = vg3.f18115a;
/* 111 */                   return Boolean.valueOf(zzpn.zzc());
                        case 3:
/* 94 */                    List list4 = vg3.f18115a;
/* 100 */                   return Boolean.valueOf(zzra.zza());
                        case 4:
/* 82 */                    List list5 = vg3.f18115a;
/* 89 */                    return Integer.valueOf((int) zzoy.zzam());
                        case 5:
/* 71 */                    List list6 = vg3.f18115a;
/* 77 */                    return Boolean.valueOf(zzql.zzi());
                        case 6:
/* 60 */                    List list7 = vg3.f18115a;
/* 66 */                    return Boolean.valueOf(zzql.zzc());
                        case 7:
/* 49 */                    List list8 = vg3.f18115a;
/* 55 */                    return Boolean.valueOf(zzph.zzb());
                        case 8:
/* 38 */                    List list9 = vg3.f18115a;
/* 44 */                    return Boolean.valueOf(zzov.zza());
                        case 9:
/* 27 */                    List list10 = vg3.f18115a;
/* 33 */                    return Boolean.valueOf(zzqo.zza());
                        case 10:
/* 16 */                    List list11 = vg3.f18115a;
/* 22 */                    return Long.valueOf(zzoy.zza());
                        default:
/* 12 */                    return new Boolean(zzqc.zza());
                    }
                }
            }
